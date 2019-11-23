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
package org.apache.hadoop.hive.ql.optimizer.calcite.rules;

import org.apache.calcite.plan.RelOptRule;
import org.apache.calcite.plan.RelOptRuleCall;

import org.apache.calcite.rel.type.RelDataType;
import org.apache.calcite.rex.RexNode;
import org.apache.calcite.tools.RelBuilderFactory;
import org.apache.calcite.rex.RexCall;

import org.apache.hadoop.hive.ql.optimizer.calcite.reloperators.HiveAggregate;
import org.apache.hadoop.hive.ql.optimizer.calcite.reloperators.HiveFilter;
import org.apache.hadoop.hive.ql.optimizer.calcite.reloperators.HiveProject;
import org.apache.hadoop.hive.ql.optimizer.calcite.reloperators.HiveTableScan;
import org.apache.hadoop.hive.ql.plan.impala.AggregationNode;
import org.apache.hadoop.hive.ql.plan.impala.HdfsScanNode;
import org.apache.hadoop.hive.ql.plan.impala.IdGenType;
import org.apache.hadoop.hive.ql.plan.impala.IdGenerator;
import org.apache.hadoop.hive.ql.plan.impala.ImpalaProjectNode;
import org.apache.hadoop.hive.ql.plan.impala.PlanId;
import org.apache.hadoop.hive.ql.plan.impala.ScanNode;
import org.apache.hadoop.hive.ql.plan.impala.TupleDescriptor;
import org.apache.hadoop.hive.ql.plan.impala.TupleId;


import java.util.Map;
import java.util.List;
import com.google.common.collect.Lists;

/**
 * Impala specific transformation rules.
 */
public class HiveImpalaRules {

  /**
   * Rule to transform a Project-Filter-Scan logical plan into Impala's
   * HdfsScanNode that can process filters and projects directly within the scan
   */
  public static class ImpalaFilterScanRule extends RelOptRule {
    private final Map<IdGenType, IdGenerator<?>> idGenerators_;

    public ImpalaFilterScanRule(RelBuilderFactory relBuilderFactory,
                                       Map<IdGenType, IdGenerator<?>> idGenerators) {
      super(operand(HiveFilter.class, operand(HiveTableScan.class, none())),
              relBuilderFactory, null);
      idGenerators_ = idGenerators;

    }
    @Override public void onMatch(RelOptRuleCall call) {
      System.out.println("SJC: MATCHED FILTER SCAN RULE");
      final HiveFilter filter = call.rel(0);
      final HiveTableScan scan = call.rel(1);

      IdGenerator<PlanId> planIdGen = (IdGenerator<PlanId>) idGenerators_.get(IdGenType.PLAN);

      // Only support HDFS for now.
      // TODO: generalize to other scan types
      // NOTE: currently, the ScanNode is not a derived class of Calcite RelNode, so this will work
      // only after we create that hierarchy since the output of a 'Transform' rule should
      // be a RelNode type
      ScanNode newScan = new HdfsScanNode(scan, filter, planIdGen.getNextId(), idGenerators_);

      // TODO: currently we are using the output exprs but later we could deprecate that in
      // favor of the rowType
      call.transformTo(newScan);
      return;

    }
  }

  /**
   * Rule to transform a Scan logical plan into Impala's
   * HdfsScanNode that can process projects directly within the scan
   */
  public static class ImpalaScanRule extends RelOptRule {

    private final Map<IdGenType, IdGenerator<?>> idGenerators_;

    public ImpalaScanRule(RelBuilderFactory relBuilderFactory,
                                       Map<IdGenType, IdGenerator<?>> idGenerators) {
      super(operand(HiveTableScan.class, none()),
              relBuilderFactory, null);
      idGenerators_ = idGenerators;
    }
    @Override public void onMatch(RelOptRuleCall call) {
      final HiveTableScan scan = call.rel(0);
      System.out.println("SJC: MATCHED SCAN RULE");

      IdGenerator<PlanId> planIdGen = (IdGenerator<PlanId>) idGenerators_.get(IdGenType.PLAN);

      ScanNode newScan = new HdfsScanNode(scan, null /* no filter */,planIdGen.getNextId(), idGenerators_); 

      call.transformTo(newScan);
      return;

    }
  }

  public static class ImpalaProjectRule extends RelOptRule {

    private final Map<IdGenType, IdGenerator<?>> idGenerators_;

    public ImpalaProjectRule(RelBuilderFactory relBuilderFactory,
                                       Map<IdGenType, IdGenerator<?>> idGenerators) {
      super(operand(HiveProject.class, any()),
              relBuilderFactory, null);
      idGenerators_ = idGenerators;
    }
    @Override public void onMatch(RelOptRuleCall call) {
      final HiveProject project = call.rel(0);

      System.out.println("SJC: MATCHED PROJECT RULE");
      ImpalaProjectNode newProject = new ImpalaProjectNode(project);

      call.transformTo(newProject);
      return;

    }
  }

  public static class ImpalaAggRule extends RelOptRule {

    private final Map<IdGenType, IdGenerator<?>> idGenerators_;

    public ImpalaAggRule(RelBuilderFactory relBuilderFactory,
                                       Map<IdGenType, IdGenerator<?>> idGenerators) {
      super(operand(HiveAggregate.class, any()),
              relBuilderFactory, null);
      idGenerators_ = idGenerators;
    }
    @Override public void onMatch(RelOptRuleCall call) {
      final HiveAggregate agg = call.rel(0);

      System.out.println("SJC: MATCHED AGG RULE");
      IdGenerator<PlanId> planIdGen = (IdGenerator<PlanId>) idGenerators_.get(IdGenType.PLAN);

      AggregationNode newAgg = new AggregationNode(agg, planIdGen.getNextId(), idGenerators_);

      call.transformTo(newAgg);
      return;

    }
  }

}
