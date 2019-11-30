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

import org.apache.calcite.rel.type.RelDataType;
import org.apache.calcite.rex.RexNode;
import org.apache.calcite.sql.type.SqlTypeName;
import org.apache.impala.thrift.TColumn;
import org.apache.impala.thrift.TColumnType;
import org.apache.impala.thrift.TExprNode;
import org.apache.impala.thrift.TExprNodeType;
import org.apache.impala.thrift.TSlotDescriptor;

import com.google.common.collect.ImmutableList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Column implements Comparable<Column> {

  private final RelDataType relDataType_;

  private final String name_;

  private final ColumnType type_;

  private static final Logger LOG = LoggerFactory.getLogger(Column.class);

  // In this constructor, the name of the field passed in overrides the name
  // of the field in relDataTypeField
  public Column(RelDataType relDataType, String name) {
    relDataType_ = relDataType;
    name_ = name;
    type_ = new ColumnType(relDataType.getSqlTypeName());
  }

  // Special case for when column comes from FieldSchema
  public Column(String name, String type) {
    relDataType_ = null;
    name_ = name;
    type_ = new ColumnType(type);
  }

  public ColumnType getType() {
    return type_;
  }
 
  @Override
  public int compareTo(Column other) {
    if (getSlotSize() != other.getSlotSize()) {
      // order desc
      return Integer.compare(other.getSlotSize(), getSlotSize());
    }
    return name_.compareTo(other.name_);
  }

  public String getName() {
    return name_;
  }

  public int getSlotSize() {
    return type_.getSlotSize();
  }

  public TColumn getTColumn() {
    return new TColumn(name_, type_.getTColumnType());
  }  

  public TColumnType getTColumnType() {
    return type_.getTColumnType();
  }  

  public String getTypeName() {
    return type_.getTypeName();
  }

  protected RelDataType getRelDataType() {
    return relDataType_;
  }

  public abstract List<Integer> getMaterializedPath();

  public abstract TExprNodeType getTExprNodeType();

  public abstract List<TExprNode> getTExprNodeList(TupleDescriptor tupleDesc);
}
