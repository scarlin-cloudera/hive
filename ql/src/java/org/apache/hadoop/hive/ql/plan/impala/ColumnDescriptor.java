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
import org.apache.calcite.sql.type.SqlTypeName;

import org.apache.impala.thrift.TColumn;
import org.apache.impala.thrift.TColumnDescriptor;
import org.apache.impala.thrift.TColumnType;
import org.apache.impala.thrift.TTypeNode;
import org.apache.impala.thrift.TTypeNodeType;
import org.apache.impala.thrift.TScalarType;
import org.apache.impala.thrift.TPrimitiveType;

import com.google.common.collect.Lists;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ColumnDescriptor {
  private final String name_;
  private final ColumnType type_;

  public ColumnDescriptor (RelDataTypeField column) {
    name_ = column.getName();
    type_ = new ColumnType(column.getType().getSqlTypeName());
    
  }

  public TColumnDescriptor toThrift() {
    return new TColumnDescriptor(name_, type_.getTColumnType());
  }  

  public TColumn getTColumn() {
    return new TColumn(name_, type_.getTColumnType());
  }  
}
