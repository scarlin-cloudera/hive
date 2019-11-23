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

import org.apache.calcite.rex.RexCall;
import org.apache.calcite.rex.RexInputRef;
import org.apache.calcite.rex.RexLiteral;
import org.apache.calcite.rex.RexNode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExprFactory {

  public static Column createExpr(RexNode rexNode) {
    //XXX: can this be done with the switch?
    if (rexNode instanceof RexCall) {
      return new ScalarFunctionColumn((RexCall) rexNode);
    }

    if (rexNode instanceof RexInputRef) {
      return new SlotRefColumn((RexInputRef) rexNode);
    }

    if (rexNode instanceof RexLiteral) {
      return new LiteralColumn((RexLiteral) rexNode);
    }
    throw new RuntimeException("RexNode " + rexNode.getClass() + " not supported by ExprFactory yet.");
    
/*
    switch(rexNode.getKind()) {
      case 
    }
*/
  }
}
