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

import org.apache.calcite.rel.core.AggregateCall;
import org.apache.calcite.sql.type.SqlTypeName;
import org.apache.impala.thrift.TExprNode;
import org.apache.impala.thrift.TExprNodeType;
import org.apache.impala.thrift.TFunction;
import org.apache.impala.thrift.TFunctionBinaryType;
import org.apache.impala.thrift.TFunctionName;
import org.apache.impala.thrift.TAggregateExpr;
import org.apache.impala.thrift.TAggregateFunction;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AggFunctionColumn extends FunctionColumn {

  private static final Logger LOG = LoggerFactory.getLogger(AggFunctionColumn.class);

  public AggFunctionColumn(AggregateCall function, Column operand) {
    super(operand, function.getType().getSqlTypeName(),
        function.getAggregation().getName());
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
    function.setAggregate_fn(getTAggregateFunction());
    //XXX: NEEDS FIXING
    function.setLast_modified_time(-1);
    return function;
  }

  @Override
  protected TExprNode getDerivedTExprNode() {
    TExprNode exprNode = new TExprNode();
    exprNode.setAgg_expr(getTAggExpr());
    return exprNode;
  }

  @Override
  public TExprNodeType getTExprNodeType() {
    return TExprNodeType.AGGREGATE_EXPR;
  }

  private TAggregateExpr getTAggExpr() {
    //XXX: this only works for non merge functions for now
    TAggregateExpr aggExpr = new TAggregateExpr();
    aggExpr.setIs_merge_agg(false);
    for (Column operand : getOperands()) {
      aggExpr.addToArg_types(operand.getTColumnType());
    }
    return aggExpr;
  }

  private TAggregateFunction getTAggregateFunction() {
    TAggregateFunction aggFunction = new TAggregateFunction();
    //XXX: Need better way to get symbols
    //XXX: need all functions, don't want to put in null, heck, this is just a mess right now, and
    //XXX: hardcoded only for sum
    aggFunction.setUpdate_fn_symbol(BuiltinFuncs.getSymbol(getName(), getOperands(), "UPDATE"));
    aggFunction.setInit_fn_symbol(BuiltinFuncs.getSymbol(getName(), getOperands(), "INIT"));
    aggFunction.setMerge_fn_symbol(BuiltinFuncs.getSymbol(getName(), getOperands(), "MERGE"));
    aggFunction.setRemove_fn_symbol(BuiltinFuncs.getSymbol(getName(), getOperands(), "REMOVE"));
    aggFunction.setIs_analytic_only_fn(false);
    aggFunction.setIgnores_distinct(false);
//    aggFunction.setSymbol(BuiltinFuncs.getSymbol(getName(), getOperands()));
    return aggFunction;
  }
}
