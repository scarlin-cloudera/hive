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

import org.apache.calcite.rex.RexInputRef;
import org.apache.calcite.rex.RexNode;
import org.apache.impala.thrift.TColumn;
import org.apache.impala.thrift.TColumnType;
import org.apache.impala.thrift.TSlotDescriptor;

import com.google.common.collect.ImmutableList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SlotRefColumn extends Column implements Comparable<Column> {

  private final RexInputRef inputRef_;

  private static final Logger LOG = LoggerFactory.getLogger(SlotRefColumn.class);

  public SlotRefColumn(RexInputRef inputRef) {
    super(inputRef, inputRef.getName());
    inputRef_ = inputRef;
  }
 
  public int getIndex() {
    return inputRef_.getIndex();
  }

  @Override
  public List<Integer> getMaterializedPath() {
    return ImmutableList.of(getIndex());
  }
}
