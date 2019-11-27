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
import org.apache.calcite.rel.core.Project;
import org.apache.calcite.rex.RexNode;

import org.apache.impala.thrift.TExplainLevel;
import org.apache.impala.thrift.TPlanNode;

import com.google.common.collect.Lists;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ImpalaProjectNode extends PlanNode {
  private final static Logger LOG = LoggerFactory.getLogger(ImpalaProjectNode.class);

  private final Project projectNode_; 

  public ImpalaProjectNode(Project projectNode) {
    super(projectNode, Lists.newArrayList());
    projectNode_ = projectNode;
  }

  @Override
  public List<Column> getColumns() {
    List<Column> columns = Lists.newArrayList();
    for (RexNode field : projectNode_.getProjects()) {
      columns.add(ExprFactory.createExpr(field));
    }
    return columns;
  }

  @Override
  protected boolean implementsTPlanNode() {
    return false;
  }
  
  @Override
  protected TPlanNode createDerivedTPlanNode() {
    throw new RuntimeException("Not implemented");
  }

  @Override
  protected String getDerivedExplainString(String rootPrefix, String detailPrefix, TExplainLevel detailLevel) {
    throw new RuntimeException("Not implemented");
  }
}
