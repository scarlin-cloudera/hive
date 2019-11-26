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
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.apache.calcite.rel.RelNode;
import org.apache.calcite.rel.type.RelDataTypeField;
import org.apache.calcite.rex.RexNode;
import org.apache.hadoop.hive.ql.optimizer.calcite.reloperators.HiveTableScan;

import org.apache.impala.thrift.TColumn;
import org.apache.impala.thrift.TTupleDescriptor;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

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
  private final Map<Integer, SlotDescriptor> slotDescriptors_;
  private final List<SlotRefColumn> columnsInIndexOrder;

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

  private TupleDescriptor(RelNode relNode, List<Integer> usedIndexes, TableDescriptor tableDesc, TupleId id,
      Map<IdGenType, IdGenerator<?>> idGenerators) {
    IdGenerator<SlotId> slotIdGen = (IdGenerator<SlotId>) idGenerators.get(IdGenType.SLOT);
    tupleId_ = id;
    tableDescriptor_ = tableDesc;
    columnsInIndexOrder = createColumns(relNode, usedIndexes);
    byteSize_ = getTupleSize(columnsInIndexOrder);
    numNullBytes_ = (columnsInIndexOrder.size() - 1) / 8 + 1;
    slotDescriptors_ = createSlotDescriptors(columnsInIndexOrder, slotIdGen);
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

  public SlotDescriptor getSlotDescriptor(Integer index) {
    return slotDescriptors_.get(index);
  }

  public Collection<SlotDescriptor> getSlotDescriptors() {
    return slotDescriptors_.values();
  }

/*
  public String getTableName() {
    return tableDescriptor_.getTableName();
  }
*/

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

  public List<? extends Column> getColumns() {
    return columnsInIndexOrder;
  }

  private Map<Integer, SlotDescriptor> createSlotDescriptors(List<SlotRefColumn> columns, IdGenerator<SlotId> slotIdGen) {
    Map<Integer, SlotDescriptor> slotDescriptors = Maps.newLinkedHashMap();
    Map<SlotRefColumn, SortedColumnInfo> sortedColumnInfoMap = createSortedColumnInfoMap(columns);
    int i = 0;
    for (SlotRefColumn column : columns) {
      SortedColumnInfo info = sortedColumnInfoMap.get(column);
      int nullIdx = byteSize_ + info.position_ / 8;
      slotDescriptors.put(column.getIndex(),
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

  private List<SlotRefColumn> createColumns(RelNode relNode, List<Integer> usedIndexes) {
    List<SlotRefColumn> columns = Lists.newArrayList();
    for (Integer index : usedIndexes) {
      String colName = relNode.getRowType().getFieldNames().get(index);
      RelDataTypeField dataTypeField = relNode.getRowType().getFieldList().get(index);
      if (tableDescriptor_ != null) {
        ColumnDescriptor columnDesc = tableDescriptor_.getColumnDescriptor(index);
        colName = tableDescriptor_.getFullTableName() + "." + columnDesc.getName();
      }
      columns.add(new SlotRefColumn(index, colName, dataTypeField.getType().getSqlTypeName()));
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

  private List<Column> createColumnsInIndexOrder(List<SlotRefColumn> slotRefs) {
    List<Column> columns = Lists.newArrayList();
    for (SlotRefColumn c : slotRefs) {
      columns.add(c);
    }
    return columns;
  }

  public static List<TupleDescriptor> createTupleDesc(RelNode relNode,
      Map<IdGenType, IdGenerator<?>> idGenerators) {
    List<Integer> indexes =
        IntStream.rangeClosed(0, relNode.getRowType().getFieldCount()).boxed().collect(Collectors.toList());
    IdGenerator<TupleId> tupleIdGen = (IdGenerator<TupleId>) idGenerators.get(IdGenType.TUPLE);
    TupleDescriptor tupleDesc = new TupleDescriptor(relNode, indexes, null, tupleIdGen.getNextId(), idGenerators);
    return Lists.newArrayList(tupleDesc);
  }

  public static TupleDescriptor createHdfsTupleDesc(HiveTableScan tableScan,
      Map<IdGenType, IdGenerator<?>> idGenerators) {
    IdGenerator<TableId> tableIdGen = (IdGenerator<TableId>) idGenerators.get(IdGenType.TABLE);
    IdGenerator<TupleId> tupleIdGen = (IdGenerator<TupleId>) idGenerators.get(IdGenType.TABLE);
    TableDescriptor tableDesc = new HdfsTableDescriptor(tableScan, tableIdGen.getNextId());
    return new TupleDescriptor(tableScan, tableScan.getNeededColIndxsFrmReloptHT(),
        tableDesc, tupleIdGen.getNextId(), idGenerators);
  }
}
