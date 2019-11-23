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

public class ScalarFunctionColumn extends FunctionColumn {

  private static final Logger LOG = LoggerFactory.getLogger(ScalarFunctionColumn.class);

  public ScalarFunctionColumn(RexCall functionCall) {
    super(functionCall.getOperands(), functionCall.getType().getSqlTypeName(),
        functionCall.getOperator().getName());
  }

  @Override
  protected TFunction getTFunction() {
    TFunction function = new TFunction();
    function.setName(getTFunctionName());
    //XXX: hardcoded for builtins, need to handle UDFS
    function.setBinary_type(TFunctionBinaryType.BUILTIN);
    for (Column operand : getOperands()) {
      function.addToArg_types(operand.getTColumnType());
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

  @Override
  protected TExprNode getDerivedTExprNode() {
    return new TExprNode();
  }

  @Override
  public TExprNodeType getTExprNodeType() {
    return TExprNodeType.FUNCTION_CALL;
  }

  private TScalarFunction getTScalarFunction() {
    TScalarFunction scalarFunction = new TScalarFunction();
    //XXX: Need better way to get symbols
    scalarFunction.setSymbol(BuiltinFuncs.getSymbol(getName(), getOperands(), "SYMBOL"));
    return scalarFunction;
  }
}
