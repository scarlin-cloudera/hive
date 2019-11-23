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

import java.math.BigDecimal;
import java.util.List;

import org.apache.calcite.rex.RexLiteral;
import org.apache.calcite.rex.RexNode;
import org.apache.impala.thrift.TExprNode;
import org.apache.impala.thrift.TExprNodeType;
import org.apache.impala.thrift.TBoolLiteral;
import org.apache.impala.thrift.TDecimalLiteral;
import org.apache.impala.thrift.TFloatLiteral;
import org.apache.impala.thrift.TIntLiteral;
import org.apache.impala.thrift.TStringLiteral;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LiteralColumn extends Column {

  private final RexLiteral literal_;

  private static final Logger LOG = LoggerFactory.getLogger(LiteralColumn.class);

  public LiteralColumn(RexLiteral literal) {
    super(literal.getType(), literal.getValue().toString());
    literal_ = literal;
  }

  //XXX: should this only be in slotref?
  @Override
  public List<Integer> getMaterializedPath() {
    return ImmutableList.of();
  }

  @Override
  public TExprNodeType getTExprNodeType() {
    //XXX: need to figure out how to handle datetimes
    //XXX: what about float and double, is there going to be a problem here?
    switch (literal_.getTypeName()) {
      case NULL:
        return TExprNodeType.NULL_LITERAL;
      case BOOLEAN:
        return TExprNodeType.BOOL_LITERAL;
      case DECIMAL:
        try {
          BigDecimal value = literal_.getValueAs(BigDecimal.class);
          value.longValueExact();
          return TExprNodeType.INT_LITERAL;
        } catch (ArithmeticException e) {
          return TExprNodeType.DECIMAL_LITERAL;
        }
      case DOUBLE:
        return TExprNodeType.FLOAT_LITERAL;
      case CHAR:
        return TExprNodeType.STRING_LITERAL;
      default:
        throw new RuntimeException("Unsupported RexLiteral: " + literal_.getTypeName());
    }
  }

  @Override
  public List<TExprNode> getTExprNodeList(TupleDescriptor tupleDesc) {
    List<TExprNode> result = Lists.newArrayList();
    TExprNode exprNode = new TExprNode();
    TExprNodeType exprNodeType = getTExprNodeType();
    exprNode.setNode_type(exprNodeType);
    exprNode.setType(getTColumnType());
    exprNode.setNum_children(0);
    exprNode.setIs_constant(true);
    switch (exprNodeType) {
      case BOOL_LITERAL:
        exprNode.setBool_literal(getTBoolLiteral());
        break;
      case INT_LITERAL:
        exprNode.setInt_literal(getTIntLiteral());
        break;
      case DECIMAL_LITERAL:
      //XXX: Need to support this
        exprNode.setDecimal_literal(getTDecimalLiteral());
        break;
      case FLOAT_LITERAL:
        exprNode.setFloat_literal(getTFloatLiteral());
        break;
      case STRING_LITERAL:
        exprNode.setString_literal(getTStringLiteral());
        break;
      default:
        throw new RuntimeException("Unsupported RexLiteral: " + literal_.getTypeName());
    }
    result.add(exprNode);
    return result;
  }

  private TBoolLiteral getTBoolLiteral() {
    TBoolLiteral literal = new TBoolLiteral();
    literal.setValue(literal_.getValueAs(Boolean.class));
    return literal;
  }

  private TIntLiteral getTIntLiteral() {
    TIntLiteral literal = new TIntLiteral();
    literal.setValue(literal_.getValueAs(Long.class));
    return literal;
  }

  private TDecimalLiteral getTDecimalLiteral() {
    //XXX: need to support this
    return new TDecimalLiteral();
  }

  private TFloatLiteral getTFloatLiteral() {
    TFloatLiteral literal = new TFloatLiteral();
    literal.setValue(literal_.getValueAs(Double.class));
    return literal;
  }

  private TStringLiteral getTStringLiteral() {
    TStringLiteral literal = new TStringLiteral();
    literal.setValue(literal_.getValueAs(String.class));
    return literal;
  }
}
