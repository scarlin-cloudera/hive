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
import org.apache.calcite.rel.core.TableScan;

import org.apache.hadoop.hive.ql.impalafile.ListMap;
import org.apache.hadoop.hive.ql.optimizer.calcite.reloperators.HiveFilter;
import org.apache.impala.thrift.TNetworkAddress;
import org.apache.impala.thrift.TScanRangeSpec;

import com.google.common.collect.Lists;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class ScanNode extends PlanNode {

  private final TupleDescriptor tuple_; 
  protected ScanNode(RelOptCluster cluster, RelTraitSet traitSet,
      TupleDescriptor tuple, HiveFilter filter, PlanId id, String displayName) {
    super(cluster, traitSet, Lists.newArrayList(tuple), filter, id, "SCAN " + displayName);
    tuple_ = tuple;
  }

  public TupleDescriptor getTupleDesc() {
    return tuple_;
  }

  public TScanRangeSpec getScanRangeSpec(ListMap<TNetworkAddress> hostIndexes) {
    return tuple_.getTableDescriptor().getScanRangeSpec(hostIndexes);
  }

  @Override
  protected String getDisplayLabelDetail() {
    return tuple_.getTableDescriptor().getFullTableName(); 
  }
}
