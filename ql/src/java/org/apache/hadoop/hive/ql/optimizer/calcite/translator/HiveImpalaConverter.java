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

import org.apache.calcite.rel.RelNode;
import org.apache.calcite.rel.type.RelDataTypeField;
import org.apache.hadoop.hive.ql.optimizer.calcite.reloperators.HiveProject;
import org.apache.hadoop.hive.ql.optimizer.calcite.reloperators.HiveTableScan;
import org.apache.hadoop.hive.ql.plan.impala.DescriptorTable;
import org.apache.hadoop.hive.ql.plan.impala.HdfsScanNode;
import org.apache.hadoop.hive.ql.plan.impala.IdGenerator;
import org.apache.hadoop.hive.ql.plan.impala.PlanNode;
import org.apache.hadoop.hive.ql.plan.impala.ScanRangeLocations;
import org.apache.hadoop.hive.ql.plan.impala.SlotDescriptor;
import org.apache.hadoop.hive.ql.plan.impala.TableDescriptor;
import org.apache.hadoop.hive.ql.plan.impala.TupleDescriptor;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HiveImpalaConverter {

  private static final Logger LOG = LoggerFactory.getLogger(HiveImpalaConverter.class);

  private final PlanNode rootPlanNode_;

  private final DescriptorTable descriptorTable_;

  private final ScanRangeLocations scanRangeLocations_;

  public HiveImpalaConverter(RelNode root) {
    try {
      IdGenerator idGen = new IdGenerator();
      rootPlanNode_ = dispatch(root, Lists.newArrayList(), idGen);
      descriptorTable_ = createDescriptorTable(rootPlanNode_);
      scanRangeLocations_  = createScanRangeLocations(rootPlanNode_);
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
  private PlanNode dispatch(RelNode rn, List<RelDataTypeField> fields, IdGenerator idGen) {
    if (rn instanceof HiveTableScan) {
      return visitTableScan((HiveTableScan) rn, fields, idGen);
    } else if (rn instanceof HiveProject) {
      return visitProject((HiveProject) rn, fields, idGen);
    }
    LOG.error(rn.getClass().getCanonicalName() + "operator translation not supported"
        + " yet in return path.");
    return null;
  }

  private PlanNode visitTableScan(HiveTableScan scanRel, List<RelDataTypeField> fields, IdGenerator idGen) {
    //XXX: only support hdfs right now
    return new HdfsScanNode(new TupleDescriptor(scanRel, fields, idGen), idGen);
  }

  private PlanNode visitProject(HiveProject project, List<RelDataTypeField> fields, IdGenerator idGen) {
    //XXX: temporary while we are only using select * from tbl
    return dispatch(project.getInputs().get(0), project.getRowType().getFieldList(), idGen);
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
}

