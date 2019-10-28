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

import org.apache.calcite.rel.type.RelDataTypeField;
import org.apache.impala.thrift.TColumnType;
import org.apache.impala.thrift.TSlotDescriptor;

import com.google.common.collect.ImmutableList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SlotDescriptor {

  private final int slotId_;

  private final int tupleId_;
 
  private final Column column_;

  private final int byteOffset_;

  private final int nullIndicatorByte_;

  private final int nullIndicatorBit_;

  private final int slotIdx_;

  private static final Logger LOG = LoggerFactory.getLogger(SlotDescriptor.class);

  public SlotDescriptor(Column column, int tupleId, int slotIdx, int nullIdx, int byteOffset, IdGenerator idGen) {
    column_ = column;
    slotId_ = idGen.getNextId();
    tupleId_ = tupleId;
    byteOffset_ = byteOffset;
    nullIndicatorByte_ = nullIdx / 8;
    nullIndicatorBit_ = nullIdx % 8;
    slotIdx_ = slotIdx;
    //XXX: materializedPath is hardcoded for now.
  }

  public TSlotDescriptor toThrift() {
    TSlotDescriptor slot = new TSlotDescriptor();
    slot.setId(slotId_);
    slot.setParent(tupleId_);
    slot.setSlotType(column_.getType().getTColumnType());
    slot.setMaterializedPath(ImmutableList.of(0));
    slot.setByteOffset(byteOffset_);
    slot.setNullIndicatorByte(nullIndicatorByte_);
    slot.setNullIndicatorBit(nullIndicatorBit_);
    slot.setSlotIdx(slotIdx_);
    return slot;
  }  
}
