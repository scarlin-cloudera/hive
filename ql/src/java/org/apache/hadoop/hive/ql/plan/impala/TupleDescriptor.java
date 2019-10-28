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

import org.apache.calcite.rel.RelNode;
import org.apache.calcite.rel.type.RelDataTypeField;
import org.apache.hadoop.hive.ql.optimizer.calcite.reloperators.HiveTableScan;

import org.apache.impala.thrift.TTupleDescriptor;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TupleDescriptor {

  private final Integer tupleId_;
  private static final Logger LOG = LoggerFactory.getLogger(TupleDescriptor.class);
  //TODO:
  private final int byteSize_ = -1;
  //TODO:
  private final int numNullBytes_ = -1;
  private final TableDescriptor tableDescriptor_;
  private final List<SlotDescriptor> slotDescriptors_;

  //TODO: 
  private final List<Integer> tuplePaths_ = ImmutableList.of();

  public TupleDescriptor(HiveTableScan tableScan, List<RelDataTypeField> fields, IdGenerator idGen) {
    tupleId_ = idGen.getNextId();
    tableDescriptor_ = new HdfsTableDescriptor(tableScan, idGen);
    slotDescriptors_ = getSlotDescriptors(fields, tupleId_, idGen);
  }

  public TTupleDescriptor toThrift() {
    TTupleDescriptor ttupleDesc =
        new TTupleDescriptor(tupleId_, byteSize_, numNullBytes_);
    ttupleDesc.setTableId(tableDescriptor_.getTableId());
//TODO:    ttupleDesc.setTuplePath(path_.getAbsolutePath());
    ttupleDesc.setTuplePath(tuplePaths_);
    return ttupleDesc;
  }

  public TableDescriptor getTableDescriptor() {
    return tableDescriptor_;
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
    return tupleId_;
  }

  private List<SlotDescriptor> getSlotDescriptors(List<RelDataTypeField> fields, int tupleId, IdGenerator idGen) {
    List<Column> columns = Lists.newArrayList();
    for (RelDataTypeField field : fields) {
      columns.add(new Column(field));
    }
    Collections.sort(columns);
    List<SlotDescriptor> slotDescriptors = Lists.newArrayList();
    int slotIdx = 0;
    int slotOffset = 0;
    for (Column column : columns) {
      slotDescriptors.add(new SlotDescriptor(column, tupleId, slotIdx, slotIdx, slotOffset, idGen));
      slotIdx++;
      slotOffset += column.getSlotSize();
    }
    return slotDescriptors;
  }

}
