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
  private final List<SlotDescriptor> slotDescriptors_;

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

  public TupleDescriptor(HiveTableScan tableScan, List<RexNode> fields, TupleId id,
      Map<IdGenType, IdGenerator<?>> idGenerators) {
    IdGenerator<TableId> tableIdGen = (IdGenerator<TableId>) idGenerators.get(IdGenType.TABLE);
    IdGenerator<SlotId> slotIdGen = (IdGenerator<SlotId>) idGenerators.get(IdGenType.SLOT);
    tupleId_ = id;
    tableDescriptor_ = new HdfsTableDescriptor(tableScan, tableIdGen.getNextId());
    List<Column> columns = createColumns(fields);
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
    for (SlotDescriptor slotDesc : slotDescriptors_) {
      columns.add(slotDesc.getTColumn());
    }
    return columns;
  }

  public List<SlotDescriptor> getSlotDescriptors() {
    return slotDescriptors_;
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

  private List<SlotDescriptor> createSlotDescriptors(List<Column> columns, IdGenerator<SlotId> slotIdGen) {
    List<SlotDescriptor> slotDescriptors = Lists.newArrayList();
    Map<Column, SortedColumnInfo> sortedColumnInfoMap = createSortedColumnInfoMap(columns);
    for (Column column : columns) {
      SortedColumnInfo info = sortedColumnInfoMap.get(column);
      int nullIdx = byteSize_ + info.position_ / 8;
      slotDescriptors.add(new SlotDescriptor(column, tupleId_.asInt(), info.position_, nullIdx, info.byteOffset_, slotIdGen.getNextId()));
    }
    return slotDescriptors;
  }

  private Map<Column, SortedColumnInfo> createSortedColumnInfoMap(List<Column> columns) {
    Map<Column, SortedColumnInfo> result = Maps.newHashMap();
    List<Column> columnsCopy = Lists.newArrayList(columns);
    Collections.sort(columnsCopy);
    int slotIdx = 0;
    int slotOffset = 0;
    for (Column column : columnsCopy) {
      result.put(column, new SortedColumnInfo(slotIdx, slotOffset));
      slotIdx++;
      slotOffset += column.getSlotSize();
    }
    return result;
  }

  private List<Column> createColumns(List<RexNode> fields) {
    List<Column> columns = Lists.newArrayList();
    for (RexNode field : fields) {
      //XXX: This will not be true once we have expressions.
      assert field instanceof RexInputRef;
      RexInputRef inputRef = (RexInputRef) field;
      System.out.println("SJC: PRE SORT, FIELD = " + inputRef.getName() + ", " + field.getType().getSqlTypeName());
      columns.add(new SlotRefColumn(inputRef, tableDescriptor_.getFullTableName(),
          tableDescriptor_.getColumnDescriptor(inputRef.getIndex())));
    }
    return columns;
  }

  private int getTupleSize(List<Column> columns) {
    int tupleSize = 0;
    for (Column column : columns) {
      tupleSize += column.getSlotSize();
    }
    return tupleSize;
  }
}
