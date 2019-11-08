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

import java.util.List;

import org.apache.impala.thrift.TDescriptorTable;
import org.apache.impala.thrift.TDescriptorTableSerialized;
import org.apache.impala.thrift.TTableName;

import org.apache.thrift.TBase;
import org.apache.thrift.TException;
import org.apache.thrift.TSerializer;
import org.apache.thrift.protocol.TBinaryProtocol;

import com.google.common.collect.Lists;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DescriptorTable {

  private final List<TupleDescriptor> tupleDescriptors_;
  private final List<SlotDescriptor> slotDescriptors_;
  private final List<TableDescriptor> tableDescriptors_;

  private final static TBinaryProtocol.Factory protocolFactory_ =
      new TBinaryProtocol.Factory();

  public DescriptorTable(List<TupleDescriptor> tuples, List<SlotDescriptor> slots, List<TableDescriptor> tables) {
    tupleDescriptors_ = tuples;
    slotDescriptors_ = slots;
    tableDescriptors_ = tables;
  }

  public TDescriptorTable toThrift() {
    TDescriptorTable descriptorTable = new TDescriptorTable();
    for (TupleDescriptor tuple : tupleDescriptors_) {
      descriptorTable.addToTupleDescriptors(tuple.toThrift());
    }
    for (SlotDescriptor slot : slotDescriptors_) {
      descriptorTable.addToSlotDescriptors(slot.toThrift());
    }
    for (TableDescriptor table : tableDescriptors_) {
      descriptorTable.addToTableDescriptors(table.toThrift());
    }
    return descriptorTable;
  }

  public TDescriptorTableSerialized toSerializedThrift() {
    TDescriptorTableSerialized result = new TDescriptorTableSerialized();
    TDescriptorTable desc_tbl = toThrift();
    result.setThrift_desc_tbl(serializeToThrift(desc_tbl));
    return result;
  }

  public List<TableDescriptor> getTableDescriptors() {
    return tableDescriptors_;
  }

  public List<TTableName> getTablesMissingStats() {
    List<TTableName> tables = Lists.newArrayList();
    for (TableDescriptor table : tableDescriptors_) {
      if (table.isMissingStats()) {
        tables.add(table.getTTableName());
      }
    }
    return tables;
  }

  /**
   * Serializes input into a byte[] using the default protocol factory.
   */
  private static <T extends TBase<?, ?>>
  byte[] serializeToThrift(T input) {
    TSerializer serializer = new TSerializer(protocolFactory_);
    try {
      return serializer.serialize(input);
    } catch (TException e) {
      //XXX: need to figure out what to do here.
      throw new RuntimeException(e.getMessage());
    }
  }
}
