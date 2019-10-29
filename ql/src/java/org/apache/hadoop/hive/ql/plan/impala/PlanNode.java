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

import org.apache.impala.thrift.TColumn;
import org.apache.impala.thrift.TExecNodePhase;
import org.apache.impala.thrift.TExecStats;
import org.apache.impala.thrift.TPlan;
import org.apache.impala.thrift.TPlanNode;
import org.apache.impala.thrift.TResultSetMetadata;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class PlanNode {
  protected abstract TPlanNode createDerivedTPlanNode();

  private final int planId_;

  private final String displayName_;

  private final ImmutableList<TupleDescriptor> tuples_;

  private final ResourceProfile nodeResourceProfile_;

  private final ImmutableList<PlanNode> inputs_;

  private final ImmutableList<PipelineMembership> pipelines_;

  public PlanNode(List<PlanNode> inputs, List<TupleDescriptor> tuples, IdGenerator idGen, String displayName) {
    planId_ = idGen.getNextId();
    inputs_ = new ImmutableList.Builder<PlanNode>().addAll(inputs).build();
    displayName_ = displayName;
    tuples_ = new ImmutableList.Builder<TupleDescriptor>().addAll(tuples).build();
    nodeResourceProfile_ = new ResourceProfile(true, 1024*1024, 1024*1024, 1024*1024*8, -1, 1024*1024*8, 1);
    //XXX: when we have children, this will need to change
    pipelines_ = new ImmutableList.Builder<PipelineMembership>().add(
        new PipelineMembership(planId_, 0, TExecNodePhase.GETNEXT)).build();
  }

  // Convert this plan node, including all children, to its Thrift representation.
  public TPlan treeToThrift() {
    TPlan result = new TPlan();
    result.setNodes(getTPlanNodes());
    return result;
  }

  public List<TPlanNode> getTPlanNodes() {
    List<TPlanNode> planNodes = Lists.newArrayList();
    planNodes.add(getTPlanNode());
    //XXX: don't call children for exchange?
    for (PlanNode input : inputs_) {
      planNodes.addAll(input.getTPlanNodes());
    }
    return planNodes;
  }

  public TPlanNode getTPlanNode() {
    TPlanNode planNode = createDerivedTPlanNode();
    planNode.setNode_id(planId_);
    planNode.setLimit(0);

    TExecStats estimatedStats = new TExecStats();
    //TODO: get stats
    estimatedStats.setCardinality(1);
    estimatedStats.setMemory_used(16*1024);
    planNode.setEstimated_stats(estimatedStats);

    planNode.setLabel(getDisplayLabel());
    planNode.setLabel_detail(getDisplayLabelDetail());

    Preconditions.checkState(tuples_.size() > 0); 
    planNode.setRow_tuples(Lists.<Integer>newArrayListWithCapacity(tuples_.size()));
    planNode.setNullable_tuples(Lists.<Boolean>newArrayListWithCapacity(tuples_.size()));
    for (TupleDescriptor tuple : tuples_) {
      planNode.addToRow_tuples(tuple.getTupleId());
//      planNode.addToNullable_tuples(nullableTupleIds_.contains(tid));
    }   
    /*
    for (Expr e: conjuncts_) {
      planNode.addToConjuncts(e.treeToThrift());
    }   
    // Serialize any runtime filters
    for (RuntimeFilter filter : runtimeFilters_) {
      planNode.addToRuntime_filters(filter.toThrift());
    }   
    */
    planNode.setDisable_codegen(false);

    Preconditions.checkState(nodeResourceProfile_.isValid());
    planNode.setResource_profile(nodeResourceProfile_.toThrift());
    planNode.setPipelines(Lists.newArrayList());
    for (PipelineMembership pipe : pipelines_) {
      planNode.addToPipelines(pipe.toThrift());
    }   
    return planNode;
  }

  public TResultSetMetadata getTResultSetMetadata() {
    TResultSetMetadata resultSetMetadata = new TResultSetMetadata();
    for (TupleDescriptor tuple : tuples_) {
      for (TColumn column : tuple.getTColumns()) {
        resultSetMetadata.addToColumns(column);
      }
    }
    return resultSetMetadata;
  }

  public List<TupleDescriptor> getTupleDescriptors() {
    return tuples_;
  }

  public List<TupleDescriptor> gatherAllTupleDescriptors() {
    //XXX: no children yet, can just return these descriptors
    return tuples_;
  }

  public List<TableDescriptor> gatherAllTableDescriptors() {
    //XXX: no children yet, can just return these descriptors
    List<TableDescriptor> tableDescriptors = Lists.newArrayList();
    for (TupleDescriptor tuple : tuples_) {
      tableDescriptors.add(tuple.getTableDescriptor());
    }
    return tableDescriptors;
  }

  public List<ScanNode> gatherAllScanNodes() {
    //XXX: no children yet, can just return this if it is a scan node 
    List<ScanNode> scanNodes = Lists.newArrayList();
    if (this instanceof ScanNode) {
      scanNodes.add((ScanNode) this);
    }
    return scanNodes;
  }

  public List<SlotDescriptor> gatherAllSlotDescriptors() {
    //XXX: no children yet, can just return these descriptors
    List<SlotDescriptor> slotDescriptors = Lists.newArrayList();
    for (TupleDescriptor tuple : tuples_) {
      slotDescriptors.addAll(tuple.getSlotDescriptors());
    }
    return slotDescriptors;
  }

  private String getDisplayLabel() {
    return String.format("%d:%s", planId_, displayName_);
  } 
      
  /** 
   * Subclasses can override to provide a node specific detail string that
   * is displayed to the user.
   * e.g. scan can return the table name.
   */   
  protected String getDisplayLabelDetail() { return ""; }

  //XXX: didn't populate stats yet
  public boolean isTableMissingStats() {
    return false;
  }

  public boolean hasCorruptTableStats() {
    return false;
  }
}
