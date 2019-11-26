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

import org.apache.calcite.plan.RelOptCluster;
import org.apache.calcite.plan.RelTraitSet;
import org.apache.calcite.rel.core.AggregateCall;

import org.apache.hadoop.hive.ql.optimizer.calcite.reloperators.HiveAggregate;
import org.apache.impala.thrift.TAggregationNode;
import org.apache.impala.thrift.TAggregator;
import org.apache.impala.thrift.TBackendResourceProfile;
import org.apache.impala.thrift.TExplainLevel;
import org.apache.impala.thrift.TExpr;
import org.apache.impala.thrift.TPlanNode;

import com.google.common.collect.Lists;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AggregationNode extends PlanNode {
  private final static Logger LOG = LoggerFactory.getLogger(AggregationNode.class);

  private final HiveAggregate aggregate_;

  public AggregationNode(RelOptCluster cluster, RelTraitSet traitSet,
    HiveAggregate aggregate, PlanId id) {
    super(cluster, traitSet, aggregate.getRowType(), getTuplesForAggregate(aggregate), null, id, "AGGREGATE");
    aggregate_ = aggregate;
  }

  @Override
  protected TPlanNode createDerivedTPlanNode() {
    TPlanNode planNode = new TPlanNode();
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
    assert getInput(0) instanceof ImpalaProjectNode;
    ImpalaProjectNode project = (ImpalaProjectNode) getInput(0);
    List<TupleDescriptor> inputTupleDescs = project.getTupleDescriptors();
    assert inputTupleDescs.size() == 1;
    TupleDescriptor inputTupleDesc = inputTupleDescs.get(0);
    List<Column> columns = project.getColumns();
    //XXX: Also will have to figure out if there are two aggs
    assert columns.size() == 1;
    //XXX: confused as to which level contains multiple TAgregators and which
    // contains multiple multiple aggregate functions
    for (AggregateCall aggCall : aggregate_.getAggCallList()) {
      TAggregator aggregator = new TAggregator();
      AggFunctionColumn aggFunc = new AggFunctionColumn(aggCall, columns.get(0));
      //XXX: handle groups
      aggregator.setGrouping_exprs(Lists.newArrayList());
      //XXX: if groups > 0, and query option not set, set to true
      aggregator.setUse_streaming_preaggregation(false);
      List<TExpr> exprs = Lists.newArrayList();
      exprs.add(getAggregateFunctions(aggFunc, inputTupleDesc));
      aggregator.setAggregate_functions(exprs);
    //XXX: handle intermediate
      aggregator.setIntermediate_tuple_id(inputTupleDesc.getTupleId());
      aggregator.setOutput_tuple_id(inputTupleDesc.getTupleId());
    //XXX: do not hardcode this
      aggregator.setNeed_finalize(false);
      aggregator.setResource_profile(getResourceProfile());
      aggregators.add(aggregator);
    }
    return aggregators;
  }

  private TExpr getAggregateFunctions(AggFunctionColumn aggFunc, TupleDescriptor tupleDesc) {
    TExpr expr = new TExpr();
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

  private TBackendResourceProfile getResourceProfile() {
    ResourceProfile resourceProfile = new ResourceProfile(true, -1L, 0L, 9223372036854775807L, 2097152L, 2097152L, -1);
    return resourceProfile.toThrift();
  }

  //XXX:
  private static List<TupleDescriptor> getTuplesForAggregate(HiveAggregate aggregate) {
    return Lists.newArrayList();
  }

  @Override
  public List<? extends Column> getColumns() {
    assert getTupleDescriptors().size() == 1;
    return getTupleDescriptors().get(0).getColumns();
  }
}
