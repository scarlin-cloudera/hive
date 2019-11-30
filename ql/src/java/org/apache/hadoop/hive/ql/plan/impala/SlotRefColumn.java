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
import org.apache.calcite.rex.RexInputRef;
import org.apache.calcite.rex.RexNode;
import org.apache.calcite.sql.type.SqlTypeName;
import org.apache.impala.thrift.TColumn;
import org.apache.impala.thrift.TColumnType;
import org.apache.impala.thrift.TExprNode;
import org.apache.impala.thrift.TExprNodeType;
import org.apache.impala.thrift.TSlotDescriptor;
import org.apache.impala.thrift.TSlotRef;

import com.google.common.collect.ImmutableList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SlotRefColumn extends Column implements Comparable<Column> {

  private final int index;


  private static final Logger LOG = LoggerFactory.getLogger(SlotRefColumn.class);

  public SlotRefColumn(RexInputRef inputRef, String tableName, ColumnDescriptor columnDesc) {
    // XXX:Columndesc.getName() is used to populate explain string for plan root sink
    // if for some reason this needs changing, be aware of this
    super(inputRef.getType(), tableName + "." + columnDesc.getName());
    index = inputRef.getIndex();
  }
 
  public SlotRefColumn(RexInputRef inputRef) {
    super(inputRef.getType(), inputRef.getName());
    index = inputRef.getIndex();
  }

  public SlotRefColumn(RelDataTypeField field, String name) {
    super(field.getType(), name);
    index = field.getIndex();
  }

  public int getIndex() {
    return index;
  }

  @Override
  public List<Integer> getMaterializedPath() {
    return ImmutableList.of(getIndex());
  }

  @Override
  public TExprNodeType getTExprNodeType() {
    return TExprNodeType.SLOT_REF;
  }

  public TExprNode getTExprNode(int id) {
    TExprNode expr = new TExprNode();
    expr.setNode_type(getTExprNodeType());
    expr.setType(getTColumnType());
    expr.setNum_children(0);
    expr.setIs_constant(false);
    expr.setSlot_ref(new TSlotRef(id));
    return expr;
  }

  @Override
  public List<TExprNode> getTExprNodeList(TupleDescriptor tupleDesc) {
    //XXX: We may want to revisit this.  This logic is assuming that the indexes
    // created for the SlotDescriptors are in the sequence of 0,1,2,... (in order and
    // incrementing by 1).  This is how they are created in TupleDescriptor.  If this
    // proves to be false, we should create a map that mpas the index to the right slotdescriptor
    SlotDescriptor slotDesc = tupleDesc.getSlotDescriptor(index);
    return ImmutableList.of(getTExprNode(slotDesc.getIdInt()));
  }
}
