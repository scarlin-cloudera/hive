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

public class FunctionColumn extends Column {

  private final RexCall functionCall_;

  private final SqlTypeName returnType_;

  private final List<Column> children_;

  private static final String IMPALA_BUILTINS = "_impala_builtins";

  private static final Logger LOG = LoggerFactory.getLogger(FunctionColumn.class);

  public FunctionColumn(RexCall functionCall) {
    super(functionCall, functionCall.getOperator().getName());
    functionCall_ = functionCall;
    returnType_ = functionCall.getType().getSqlTypeName();
    List<Column> columns = Lists.newArrayList();
    for (RexNode operand : functionCall.getOperands()) {
      columns.add(ExprFactory.createExpr(operand));
    }
    children_ = ImmutableList.<Column>builder().addAll(columns).build();
  }

  //XXX: should this only be in slotref?
  @Override
  public List<Integer> getMaterializedPath() {
    return ImmutableList.of();
  }

  @Override
  public TExprNodeType getTExprNodeType() {
    return TExprNodeType.FUNCTION_CALL;
  }

  @Override
  public List<TExprNode> getTExprNodeList(TupleDescriptor tupleDesc) {
    List<TExprNode> result = Lists.newArrayList();
    TExprNode exprNode = new TExprNode();
    exprNode.setNode_type(getTExprNodeType());
    // column type will be set to the return type
    exprNode.setType(getTColumnType());
    exprNode.setNum_children(children_.size());
    exprNode.setIs_constant(false);
    exprNode.setFn(getTFunction());
    result.add(exprNode);
    for (Column c : children_) {
      System.out.println("SJC: ADDING CHIlD OF TYPE " + c.getClass());
      result.addAll(c.getTExprNodeList(tupleDesc));
    } 
    return result;
  }

  private TFunction getTFunction() {
    TFunction function = new TFunction();
    function.setName(getTFunctionName());
    //XXX: hardcoded for builtins, need to handle UDFS
    function.setBinary_type(TFunctionBinaryType.BUILTIN);
    for (Column child : children_) {
      function.addToArg_types(child.getTColumnType());
    }
    function.setRet_type(getTColumnType());
    function.setHas_var_args(false);
    //XXX: DO NOT HARDCODE THIS
    function.setSignature("eq(INT INT)");
    function.setIs_persistent(true);
    //XXX: NEEDS FIXING
    function.setScalar_fn(getTScalarFunction());
    function.setLast_modified_time(-1);
    return function;
  }

  private TFunctionName getTFunctionName() {
    TFunctionName name = new TFunctionName();
    //XXX: hardcoded for builtins, fix this for udfs
    name.setDb_name(IMPALA_BUILTINS);
    //XXX: DEFINITELY DO NOT HARCDOE THIS!!!
    name.setFunction_name("eq");
    return name;
  }

  private TScalarFunction getTScalarFunction() {
    TScalarFunction scalarFunction = new TScalarFunction();
    //XXX: Need better way to get symbols
    scalarFunction.setSymbol(BuiltinFuncs.getSymbol(functionCall_.getOperator().getName(), children_));
    return scalarFunction;
  }

}
