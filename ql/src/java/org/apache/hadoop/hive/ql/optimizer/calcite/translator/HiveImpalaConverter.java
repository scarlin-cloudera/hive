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

package org.apache.hadoop.hive.ql.optimizer.calcite.translator;

import java.util.List;
import java.util.Map;

import org.apache.calcite.rel.RelNode;
import org.apache.calcite.rex.RexCall;
import org.apache.calcite.rex.RexInputRef;
import org.apache.calcite.rex.RexNode;
import org.apache.hadoop.hive.ql.optimizer.calcite.reloperators.HiveFilter;
import org.apache.hadoop.hive.ql.optimizer.calcite.reloperators.HiveProject;
import org.apache.hadoop.hive.ql.optimizer.calcite.reloperators.HiveTableScan;
import org.apache.hadoop.hive.ql.plan.impala.DataSink;
import org.apache.hadoop.hive.ql.plan.impala.DescriptorTable;
import org.apache.hadoop.hive.ql.plan.impala.ExecRequest;
import org.apache.hadoop.hive.ql.plan.impala.HdfsScanNode;
import org.apache.hadoop.hive.ql.plan.impala.IdGenerator;
import org.apache.hadoop.hive.ql.plan.impala.IdGenType;
import org.apache.hadoop.hive.ql.plan.impala.PlanExecInfo;
import org.apache.hadoop.hive.ql.plan.impala.PlanFragment;
import org.apache.hadoop.hive.ql.plan.impala.PlanFragmentId;
import org.apache.hadoop.hive.ql.plan.impala.PlanId;
import org.apache.hadoop.hive.ql.plan.impala.PlanNode;
import org.apache.hadoop.hive.ql.plan.impala.PlanRootSink;
import org.apache.hadoop.hive.ql.plan.impala.ScanRangeLocations;
import org.apache.hadoop.hive.ql.plan.impala.SlotDescriptor;
import org.apache.hadoop.hive.ql.plan.impala.SlotId;
import org.apache.hadoop.hive.ql.plan.impala.TableDescriptor;
import org.apache.hadoop.hive.ql.plan.impala.TableId;
import org.apache.hadoop.hive.ql.plan.impala.TupleDescriptor;
import org.apache.hadoop.hive.ql.plan.impala.TupleId;
import org.apache.impala.thrift.TExecRequest;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HiveImpalaConverter {

  private static final Logger LOG = LoggerFactory.getLogger(HiveImpalaConverter.class);

  private final PlanNode rootPlanNode_;

  private final DescriptorTable descriptorTable_;

  private final ScanRangeLocations scanRangeLocations_;

  private final DataSink planRootSink_;

  private final PlanFragment planFragment_;

  private final PlanExecInfo planExecInfo_;

  public HiveImpalaConverter(RelNode root) {
    try {
      Map<IdGenType, IdGenerator<?>> idGenerators = createIdGenerators();
      rootPlanNode_ = dispatch(root, null, null, idGenerators);
      descriptorTable_ = createDescriptorTable(rootPlanNode_);
      scanRangeLocations_  = createScanRangeLocations(rootPlanNode_);
      assert root instanceof HiveProject;
      planRootSink_ = new PlanRootSink(rootPlanNode_, (HiveProject) root); 
      IdGenerator<PlanFragmentId> fragmentIdGen = (IdGenerator<PlanFragmentId>) idGenerators.get(IdGenType.FRAGMENT);
      //XXX: fill in display
      planFragment_ = new PlanFragment(fragmentIdGen.getNextId(), "", rootPlanNode_, planRootSink_);
      planExecInfo_ = new PlanExecInfo(planFragment_, scanRangeLocations_);
    } catch (Exception e) {
      e.printStackTrace();
      throw e;
    }
  }

  public PlanNode getRootPlanNode() {
    return rootPlanNode_;
  }

  public DescriptorTable getDescriptorTable() {
    return descriptorTable_;
  }

  public ScanRangeLocations getScanRangeLocations() {
    return scanRangeLocations_;
  }

  public DataSink getDataSink() {
    return planRootSink_;
  }

  public PlanExecInfo getPlanExecInfo() {
    return planExecInfo_;
  }

  public TExecRequest getExecRequest() {
    //XXX: change resultsetmetadata
    return ExecRequest.getExecRequest(this);
  }

  private PlanNode dispatch(RelNode rnToProcess, HiveProject project, HiveFilter filter,
      Map<IdGenType, IdGenerator<?>> idGenerators) {
    if (rnToProcess instanceof HiveTableScan) {
      return visitTableScan((HiveTableScan) rnToProcess, project, filter, idGenerators);
    } else if (rnToProcess instanceof HiveProject) {
      // currently, we are going to only use the project closest to the TableScan
      assert rnToProcess.getInputs().size() == 1;
      return dispatch(rnToProcess.getInputs().get(0), (HiveProject) rnToProcess, filter, idGenerators);
    } else if (rnToProcess instanceof HiveFilter) {
      assert rnToProcess.getInputs().size() == 1;
      return dispatch(rnToProcess.getInputs().get(0), project, (HiveFilter) rnToProcess, idGenerators);
    }
    String errorMsg = rnToProcess.getClass().getCanonicalName() + "operator translation not supported"
        + " yet in return path.";
    LOG.error(errorMsg);
    throw new RuntimeException(errorMsg);
  }

  private PlanNode visitTableScan(HiveTableScan scanRel, HiveProject project, HiveFilter filter,
      Map<IdGenType, IdGenerator<?>> idGenerators) {
    assert project != null;
    //XXX: Probably overkill having a type param, copied it from impala.
    IdGenerator<TupleId> tupleIdGen = (IdGenerator<TupleId>) idGenerators.get(IdGenType.TUPLE);
    IdGenerator<PlanId> planIdGen = (IdGenerator<PlanId>) idGenerators.get(IdGenType.PLAN);
    TupleDescriptor tupleDesc = new TupleDescriptor(scanRel,
        getAllInputRefs(getRexNodes(project, filter)), tupleIdGen.getNextId(), idGenerators);
    //XXX: only support hdfs right now
    return new HdfsScanNode(tupleDesc, filter, planIdGen.getNextId());
  }

  private List<RexNode> getRexNodes(HiveProject project, HiveFilter filter) {
    List<RexNode> nodes = Lists.newArrayList();
    assert project != null;
    nodes.addAll(project.getProjects());
    if (filter != null) {
      // XXX: can I just add getChildExprs?
      nodes.add(filter.getCondition());
    }
    return nodes;
  }

  private List<RexInputRef> getAllInputRefs(List<RexNode> nodes) {
    List<RexInputRef> inputRefs = Lists.newArrayList();
    for (RexNode node : nodes) {
      if (node instanceof RexInputRef) {
        inputRefs.add((RexInputRef) node);
      }
      if (node instanceof RexCall) {
        inputRefs.addAll(getAllInputRefs(((RexCall)node).getOperands()));
      }
    }
    return inputRefs;
  }

  private DescriptorTable createDescriptorTable(PlanNode rootPlanNode) {
    List<TupleDescriptor> tupleDescriptors = rootPlanNode.gatherAllTupleDescriptors(); 
    List<SlotDescriptor> slotDescriptors = rootPlanNode.gatherAllSlotDescriptors(); 
    List<TableDescriptor> tableDescriptors = rootPlanNode.gatherAllTableDescriptors(); 
    return new DescriptorTable(tupleDescriptors, slotDescriptors, tableDescriptors);
  }

  private ScanRangeLocations createScanRangeLocations(PlanNode rootPlanNode) {
    return new ScanRangeLocations(rootPlanNode.gatherAllScanNodes());
  }

  private Map<IdGenType, IdGenerator<?>> createIdGenerators() {
    Map<IdGenType, IdGenerator<?>> idGenerators = Maps.newHashMap();
    idGenerators.put(IdGenType.SLOT, SlotId.createGenerator());
    idGenerators.put(IdGenType.PLAN, PlanId.createGenerator());
    idGenerators.put(IdGenType.TUPLE, TupleId.createGenerator());
    idGenerators.put(IdGenType.TABLE, TableId.createGenerator());
    idGenerators.put(IdGenType.FRAGMENT, PlanFragmentId.createGenerator());
    return idGenerators;
  }
}

