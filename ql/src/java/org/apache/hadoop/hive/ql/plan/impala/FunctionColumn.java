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

import org.apache.calcite.rex.RexCall;
import org.apache.calcite.rex.RexNode;
import org.apache.calcite.sql.type.SqlTypeName;
import org.apache.impala.thrift.TExprNode;
import org.apache.impala.thrift.TExprNodeType;
import org.apache.impala.thrift.TFunction;
import org.apache.impala.thrift.TFunctionBinaryType;
import org.apache.impala.thrift.TFunctionName;
import org.apache.impala.thrift.TScalarFunction;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class FunctionColumn extends Column {

  public static final String IMPALA_BUILTINS = "_impala_builtins";

  private final List<Column> operands_;

  private static final Logger LOG = LoggerFactory.getLogger(FunctionColumn.class);

  public FunctionColumn(List<RexNode> operands, SqlTypeName returnType, String functionName) {
    super(functionName, returnType);
    List<Column> columns = Lists.newArrayList();
    for (RexNode operand : operands) {
      columns.add(ExprFactory.createExpr(operand));
    }
    operands_ = ImmutableList.<Column>builder().addAll(columns).build();
  }

  public FunctionColumn(Column operand, SqlTypeName returnType, String functionName) {
    super(functionName, returnType);
    operands_ = ImmutableList.of(operand);
  }

  //XXX: should this only be in slotref?
  @Override
  public List<Integer> getMaterializedPath() {
    return ImmutableList.of();
  }

  @Override
  public List<TExprNode> getTExprNodeList(TupleDescriptor tupleDesc) {
    List<TExprNode> result = Lists.newArrayList();
    TExprNode exprNode = getDerivedTExprNode();
    exprNode.setNode_type(getTExprNodeType());
    // column type will be set to the return type
    exprNode.setType(getTColumnType());
    exprNode.setNum_children(operands_.size());
    exprNode.setIs_constant(false);
    exprNode.setFn(getTFunction());
    result.add(exprNode);
    for (Column c : operands_) {
      System.out.println("SJC: ADDING CHIlD OF TYPE " + c.getClass());
      result.addAll(c.getTExprNodeList(tupleDesc));
    } 
    return result;
  }

  protected List<Column> getOperands() {
    return operands_;
  }

  protected TFunctionName getTFunctionName() {
    TFunctionName name = new TFunctionName();
    //XXX: hardcoded for builtins, fix this for udfs
    name.setDb_name(IMPALA_BUILTINS);
    name.setFunction_name(BuiltinFuncs.getImpalaOperatorName(getName()));
    return name;
  }

  abstract public TExprNodeType getTExprNodeType();

  abstract protected TFunction getTFunction();

  abstract protected TExprNode getDerivedTExprNode();
}
