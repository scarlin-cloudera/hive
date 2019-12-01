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

import org.apache.impala.thrift.TColumnDescriptor;
import org.apache.impala.thrift.TColumnType;
import org.apache.impala.thrift.TTypeNode;
import org.apache.impala.thrift.TTypeNodeType;
import org.apache.impala.thrift.TScalarType;
import org.apache.impala.thrift.TPrimitiveType;

import com.google.common.collect.Lists;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ColumnType {
  private final TPrimitiveType primitiveType_;

  public ColumnType(SqlTypeName calciteTypeName) {
    primitiveType_ = getTPrimitiveType(calciteTypeName);
  }

  public ColumnType(String stringTypeName) {
    primitiveType_ = getTPrimitiveType(stringTypeName);
  }

  public TColumnType getTColumnType() {
    TTypeNode typeNode = new TTypeNode(TTypeNodeType.SCALAR);
    typeNode.setScalar_type(getTScalarType());
    List<TTypeNode> typeNodes = Lists.newArrayList();
    typeNodes.add(typeNode);
    return new TColumnType(typeNodes);
  }

  private TScalarType getTScalarType() {
    TScalarType scalarType = new TScalarType(primitiveType_);
    // TODO do stuff for decimal, char
    return scalarType;
  }

  private TPrimitiveType getTPrimitiveType(String stringTypeName) {
    if (stringTypeName.equals("bigint")) {
      return TPrimitiveType.BIGINT;
    }
    if (stringTypeName.equals("int")) {
      return TPrimitiveType.INT;
    }
    if (stringTypeName.equals("string")) {
      return TPrimitiveType.STRING;
    }

    //XXX: THIS IS WRONG!
    return TPrimitiveType.INT;
  }

  private TPrimitiveType getTPrimitiveType(SqlTypeName calciteTypeName) {
    switch (calciteTypeName) {
    case INTEGER:
      return TPrimitiveType.INT;
    case BIGINT:
      return TPrimitiveType.BIGINT;
    //XXX: CHAR MIGHT BE A PROBLEM
    case CHAR:
    case VARCHAR:
      return TPrimitiveType.STRING;
    case BOOLEAN:
      return TPrimitiveType.BOOLEAN;
    default:
      //XXX: THIS IS WRONG!
      return TPrimitiveType.INT;
      //XXX: throw new RuntimeException("TPrimitiveType " + calciteTypeName + "  not supported yet.");
    }
  }

  // XXX: This info can be found in PrimitiveType in impala
  public int getSlotSize() {
    switch (primitiveType_) {
    case BIGINT:
      return 8;
    case INT:
      return 4;
    //XXX: CHAR IS GONNA BE A PROBLEM
    case STRING:
      return 12;
    default:
      throw new RuntimeException("TPrimitiveType " + primitiveType_ + "  not supported yet.");
    }
  }

  public String getTypeName() {
    return primitiveType_.toString();
  }
}
