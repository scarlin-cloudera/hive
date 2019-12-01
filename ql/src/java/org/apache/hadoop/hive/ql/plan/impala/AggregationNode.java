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
import java.util.Map;

import org.apache.calcite.plan.RelOptCluster;
import org.apache.calcite.plan.RelTraitSet;
import org.apache.calcite.rel.core.AggregateCall;

import org.apache.hadoop.hive.ql.optimizer.calcite.reloperators.HiveAggregate;
import org.apache.impala.thrift.TAggregationNode;
import org.apache.impala.thrift.TAggregator;
import org.apache.impala.thrift.TBackendResourceProfile;
import org.apache.impala.thrift.TExplainLevel;
import org.apache.impala.thrift.TExpr;
import org.apache.impala.thrift.TExprNode;
import org.apache.impala.thrift.TPlanNode;
import org.apache.impala.thrift.TPlanNodeType;

import com.google.common.collect.Lists;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AggregationNode extends PlanNode {
  private final static Logger LOG = LoggerFactory.getLogger(AggregationNode.class);

  private final HiveAggregate aggregate_;

  public AggregationNode(HiveAggregate agg, PlanId id, Map<IdGenType, IdGenerator<?>> idGenerators) {
    super(agg, TupleDescriptor.createTupleDesc(agg, idGenerators),
        null, id, "AGGREGATE");
    aggregate_ = agg;
  }

  @Override
  protected TPlanNode createDerivedTPlanNode() {
    TPlanNode planNode = new TPlanNode();
    planNode.setNode_type(TPlanNodeType.AGGREGATION_NODE);
    TAggregationNode aggregateNode = new TAggregationNode();
    aggregateNode.setAggregators(getAggregators());
    //XXX: don't hardcode this
    aggregateNode.setEstimated_input_cardinality(1);
    //XXX: don't hardcode this
    aggregateNode.setReplicate_input(false);
    planNode.setAgg_node(aggregateNode);
    
    return planNode;
  }

  //XXX:
  private List<TAggregator> getAggregators() {
    List<TAggregator> aggregators = Lists.newArrayList();
    //XXX: will have to figure out if there are two aggregators
    assert getInputs().size() == 1;
    assert getInput(0) instanceof PlanNode;
    List<TupleDescriptor> inputTupleDescs = ((PlanNode)getInput(0)).getTupleDescriptors();
    assert inputTupleDescs.size() == 1;
    TupleDescriptor inputTupleDesc = inputTupleDescs.get(0);
    //XXX: Also will have to figure out if there are two aggs
    //XXX: confused as to which level contains multiple TAgregators and which
    // contains multiple multiple aggregate functions
    for (AggregateCall aggCall : aggregate_.getAggCallList()) {
      TAggregator aggregator = new TAggregator();
      aggregator.setGrouping_exprs(getGroupingExprs(aggCall, inputTupleDesc));
      //XXX: need to understand this logic better, producing wrong results on query
      // select sum(c1) from tbl group by s1;
//      aggregator.setUse_streaming_preaggregation(aggregator.getGrouping_exprs() != null);
      aggregator.setUse_streaming_preaggregation(false);
      List<TExpr> exprs = Lists.newArrayList();
      exprs.add(getAggregateFunctions(aggCall, inputTupleDesc));
      aggregator.setAggregate_functions(exprs);
    //XXX: handle intermediate
      assert getTupleDescriptors().size() == 1;
      aggregator.setIntermediate_tuple_id(getTupleDescriptors().get(0).getTupleId());
      aggregator.setOutput_tuple_id(getTupleDescriptors().get(0).getTupleId());
    //XXX: do not hardcode this
      aggregator.setNeed_finalize(true);
      aggregator.setResource_profile(getAggResourceProfile().toThrift());
      aggregators.add(aggregator);
    }
    return aggregators;
  }

  private List<TExpr> getGroupingExprs(AggregateCall aggCall, TupleDescriptor tupleDesc) {
    List<TExpr> exprs = Lists.newArrayList();
    if (aggregate_.getGroupCount() == 0) {
      return null;
    }
    assert getInputs().size() == 1;
    assert getInput(0) instanceof PlanNode;
    List<? extends Column> columns = ((PlanNode)getInput(0)).getColumns();
    //XXX: Right now, all groups are being placed in one expr list.  I'm not sure
    // if this is true if there are multiple aggregates.
    // Plus:  do we need to weed out duplicates?
    TExpr expr = new TExpr();
    for (int group : aggregate_.getGroupSet()) {
      SlotDescriptor slotDesc = tupleDesc.getSlotDescriptor(group);
      expr.addToNodes(slotDesc.getTExprNode());
    }
    exprs.add(expr);
    return exprs;
  }

  private TExpr getAggregateFunctions(AggregateCall aggCall, TupleDescriptor tupleDesc) {
    TExpr expr = new TExpr();
    List<? extends Column> columns = ((PlanNode)getInput(0)).getColumns();
    List<Integer> indexes = aggCall.getArgList();
    assert indexes.size() == 1;
    SlotDescriptor slotDesc = tupleDesc.getSlotDescriptor(indexes.get(0));
    AggFunctionColumn aggFunc = new AggFunctionColumn(aggCall, slotDesc.getColumn());
    expr.setNodes(aggFunc.getTExprNodeList(tupleDesc));
    return expr;
  }

  //XXX:  Fill this in, also, should this have @Override?
  protected String getDerivedExplainString(String prefix, String detailPrefix, TExplainLevel detailLevel) {
    StringBuilder output = new StringBuilder();
    return output.toString();
  }

  @Override
  protected boolean implementsTPlanNode() {
    return true;
  }

  private ResourceProfile getAggResourceProfile() {
    ResourceProfile resourceProfile = new ResourceProfile(false, -1L, 35651584L, 9223372036854775807L, 2097152L, 2097152L, -1);
    return resourceProfile;
  }

  @Override
  protected ResourceProfile getResourceProfile() {
    ResourceProfile resourceProfile = new ResourceProfile(false, -1L, 35651584L, 9223372036854775807L, 2097152L, 2097152L, -1);
    return resourceProfile;
  }

  @Override
  public List<? extends Column> getColumns() {
    assert getTupleDescriptors().size() == 1;
    return getTupleDescriptors().get(0).getColumns();
  }

  @Override
  public boolean isBlockingNode() {
    return aggregate_.getGroupCount() == 0;
  }
}
