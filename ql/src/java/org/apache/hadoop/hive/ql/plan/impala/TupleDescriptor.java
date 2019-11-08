/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.hadoop.hive.ql.plan.impala;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.apache.calcite.rel.RelNode;
import org.apache.calcite.rex.RexInputRef;
import org.apache.calcite.rex.RexNode;
import org.apache.hadoop.hive.ql.optimizer.calcite.reloperators.HiveTableScan;

import org.apache.impala.thrift.TColumn;
import org.apache.impala.thrift.TTupleDescriptor;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TupleDescriptor {

  private final TupleId tupleId_;
  private static final Logger LOG = LoggerFactory.getLogger(TupleDescriptor.class);
  //TODO:
  private final int byteSize_;
  //TODO:
  private final int numNullBytes_;
  private final TableDescriptor tableDescriptor_;
  private final Map<RexInputRef, SlotDescriptor> slotDescriptors_;

  //TODO: 
  private final List<Integer> tuplePaths_ = ImmutableList.of();

  private static class SortedColumnInfo {
    public int position_;
    public int byteOffset_;
    public SortedColumnInfo(int position, int byteOffset) {
      position_ = position;
      byteOffset_ = byteOffset;
    }
  }

  public TupleDescriptor(HiveTableScan tableScan, List<RexInputRef> fields, TupleId id,
      Map<IdGenType, IdGenerator<?>> idGenerators) {
    IdGenerator<TableId> tableIdGen = (IdGenerator<TableId>) idGenerators.get(IdGenType.TABLE);
    IdGenerator<SlotId> slotIdGen = (IdGenerator<SlotId>) idGenerators.get(IdGenType.SLOT);
    tupleId_ = id;
    tableDescriptor_ = new HdfsTableDescriptor(tableScan, tableIdGen.getNextId());
    List<SlotRefColumn> columns = createColumns(fields);
    byteSize_ = getTupleSize(columns);
    numNullBytes_ = (columns.size() - 1) / 8 + 1;
    slotDescriptors_ = createSlotDescriptors(columns, slotIdGen);
  }

  public TTupleDescriptor toThrift() {
    TTupleDescriptor ttupleDesc =
        new TTupleDescriptor(tupleId_.asInt(), byteSize_ + numNullBytes_, numNullBytes_);
    ttupleDesc.setTableId(tableDescriptor_.getTableId());
//TODO:    ttupleDesc.setTuplePath(path_.getAbsolutePath());
    ttupleDesc.setTuplePath(tuplePaths_);
    return ttupleDesc;
  }

  public TableDescriptor getTableDescriptor() {
    return tableDescriptor_;
  }

  public List<TColumn> getTColumns() {
    List<TColumn> columns = Lists.newArrayList();
    for (SlotDescriptor slotDesc : slotDescriptors_.values()) {
      columns.add(slotDesc.getTColumn());
    }
    return columns;
  }

  public SlotDescriptor getSlotDescriptor(RexInputRef inputRef) {
    return slotDescriptors_.get(inputRef);
  }

  public Collection<SlotDescriptor> getSlotDescriptors() {
    return slotDescriptors_.values();
  }

  public HiveTableScan getTableScan() {
    return tableDescriptor_.getTableScan();
  }

  public String getTableName() {
    return tableDescriptor_.getTableName();
  }

  public int getTupleId() {
    return tupleId_.asInt();
  }

  //XXX:
  public boolean isNullable() {
    return false;
  } 

  public String getPartitionExplainString(String detailPrefix) {
    return tableDescriptor_.getPartitionExplainString(detailPrefix);
  }

  private Map<RexInputRef, SlotDescriptor> createSlotDescriptors(List<SlotRefColumn> columns, IdGenerator<SlotId> slotIdGen) {
    Map<RexInputRef, SlotDescriptor> slotDescriptors = Maps.newLinkedHashMap();
    Map<SlotRefColumn, SortedColumnInfo> sortedColumnInfoMap = createSortedColumnInfoMap(columns);
    for (SlotRefColumn column : columns) {
      SortedColumnInfo info = sortedColumnInfoMap.get(column);
      int nullIdx = byteSize_ + info.position_ / 8;
      slotDescriptors.put(column.getInputRef(),
          new SlotDescriptor(column, tupleId_.asInt(), info.position_, nullIdx, info.byteOffset_, slotIdGen.getNextId()));
    }
    return slotDescriptors;
  }

  private Map<SlotRefColumn, SortedColumnInfo> createSortedColumnInfoMap(List<SlotRefColumn> columns) {
    Map<SlotRefColumn, SortedColumnInfo> result = Maps.newHashMap();
    List<SlotRefColumn> columnsCopy = Lists.newArrayList(columns);
    Collections.sort(columnsCopy);
    int slotIdx = 0;
    int slotOffset = 0;
    for (SlotRefColumn column : columnsCopy) {
      result.put(column, new SortedColumnInfo(slotIdx, slotOffset));
      slotIdx++;
      slotOffset += column.getSlotSize();
    }
    return result;
  }

  private List<SlotRefColumn> createColumns(List<RexInputRef> fields) {
    List<SlotRefColumn> columns = Lists.newArrayList();
    for (RexInputRef inputRef : fields) {
      System.out.println("SJC: PRE SORT, FIELD = " + inputRef.getName() + ", " + inputRef.getType().getSqlTypeName());
      columns.add(new SlotRefColumn(inputRef, tableDescriptor_.getFullTableName(),
          tableDescriptor_.getColumnDescriptor(inputRef.getIndex())));
    }
    return columns;
  }

  private int getTupleSize(List<SlotRefColumn> columns) {
    int tupleSize = 0;
    for (SlotRefColumn column : columns) {
      tupleSize += column.getSlotSize();
    }
    return tupleSize;
  }
}
