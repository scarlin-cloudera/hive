// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

package org.apache.hadoop.hive.ql.plan.impala;

import java.util.List;

import org.apache.impala.thrift.TDataSink;
import org.apache.impala.thrift.TDataSinkType;
import org.apache.impala.thrift.TExecStats;
import org.apache.impala.thrift.TExplainLevel;
import org.apache.impala.thrift.TExpr;
import org.apache.impala.thrift.TPlanRootSink;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;

public class PlanRootSink extends DataSink {

  public final PlanNode rootNode_;

  public PlanRootSink(PlanNode rootNode) {
    rootNode_ = rootNode;
  }

  @Override
  public TDataSink getDerivedTDataSink() {
    TDataSink dataSink = new TDataSink();
    dataSink.setType(TDataSinkType.PLAN_ROOT_SINK);
    TPlanRootSink planRootSink = new TPlanRootSink();
    //XXX:
    planRootSink.setResource_profile(ResourceProfile.invalid().toThrift()); 
    dataSink.setPlan_root_sink(planRootSink);
    //XXX: fill this in
    dataSink.setLabel(""); 
    //XXX:
    for (SlotDescriptor slotDescriptor : rootNode_.getSlotDescriptors()) { 
      TExpr expr = new TExpr();
      expr.addToNodes(slotDescriptor.getTExprNode());
      dataSink.addToOutput_exprs(expr);
    }
    return dataSink;
  }

  @Override
  public String getDerivedExplainString(String prefix, String detailPrefix,
      /*XXX:TQueryOptions queryOptions,*/ TExplainLevel explainLevel) {
    StringBuilder output = new StringBuilder();
    output.append(String.format("%sPLAN-ROOT SINK\n", prefix));
    if (explainLevel.ordinal() >= TExplainLevel.EXTENDED.ordinal()) {
      List<String> exprNames = getExprNames();
      output.append(detailPrefix + "output exprs: ")
          .append(Joiner.on(", ").join(getExprNames()) + "\n");
      output.append(detailPrefix);
      //XXX:
      output.append(ResourceProfile.invalid().getExplainString());
      output.append("\n");
    }   
    return output.toString();
  }

  public List<String> getExprNames() {
    List<String> exprNames = Lists.newArrayList();
    for (SlotDescriptor slotDescriptor : rootNode_.getSlotDescriptors()) { 
      exprNames.add(slotDescriptor.getName());
    }
    return exprNames;
  }
}
