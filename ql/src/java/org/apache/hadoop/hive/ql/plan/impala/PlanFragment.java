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

import org.apache.impala.thrift.TDataPartition;
import org.apache.impala.thrift.TExplainLevel;
import org.apache.impala.thrift.TPartitionType;
import org.apache.impala.thrift.TPlanFragment;

import com.google.common.collect.Lists;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PlanFragment {
  private final PlanFragmentId id_;

  private final String displayName_;

  private final PlanNode rootPlanNode_;

  private final DataSink outputSink_;

  public PlanFragment(PlanFragmentId id, String displayName, PlanNode rootPlanNode, DataSink sink) {
    id_ = id;
    displayName_ = displayName;
    rootPlanNode_ = rootPlanNode;
    outputSink_ = sink;
  }

  public TPlanFragment toThrift() {
    TPlanFragment planFragment = new TPlanFragment();
    planFragment.setIdx(id_.asInt());
    planFragment.setDisplay_name(displayName_);
    planFragment.setPlan(rootPlanNode_.treeToThrift()); 
    //XXX: hardcoded
    planFragment.setPartition(getUnpartitionedDataPartition());
    //XXX: hardcoded
    planFragment.setMin_mem_reservation_bytes(8192);
    //XXX: hardcoded
    planFragment.setInitial_mem_reservation_total_claims(8192);
    //XXX: hardcoded
    planFragment.setRuntime_filters_reservation_bytes(0);
    //XXX: hardcoded
    planFragment.setThread_reservation(2);
    return planFragment;
  }

  public String getExplainString(String rootPrefix, String prefix,
      /*TQueryOptions queryOptions,*/ TExplainLevel detailLevel) {
    StringBuilder str = new StringBuilder();
    String detailPrefix = prefix + "|  ";  // sink detail
    if (detailLevel == TExplainLevel.VERBOSE) {
      // we're printing a new tree, start over with the indentation
      prefix = "  ";
      rootPrefix = "  ";
      detailPrefix = prefix + "|  ";
//      str.append(getFragmentHeaderString("", "", queryOptions.getMt_dop()));
      str.append(getFragmentHeaderString("", "", 1));
/*
      if (sink_ != null && sink_ instanceof DataStreamSink) {
        str.append(
            sink_.getExplainString(rootPrefix, detailPrefix, queryOptions, detailLevel));
      }   
*/
    } else if (detailLevel == TExplainLevel.EXTENDED) {
      // Print a fragment prefix displaying the # nodes and # instances
      str.append(
//XXX:          getFragmentHeaderString(rootPrefix, detailPrefix, queryOptions.getMt_dop()));
          getFragmentHeaderString(rootPrefix, detailPrefix, 1));
      rootPrefix = prefix;
    }   

    String planRootPrefix = rootPrefix;
    // Always print sinks other than DataStreamSinks.
    //XXX
    //if (sink_ != null && !(sink_ instanceof DataStreamSink)) {
    if (true) {
      str.append(
          outputSink_.getExplainString(rootPrefix, detailPrefix, /*queryOptions,*/ detailLevel));
      if (detailLevel.ordinal() >= TExplainLevel.STANDARD.ordinal()) {
        str.append(prefix + "|\n");
      }   
      // we already used the root prefix for the sink
      planRootPrefix = prefix;
    }   
    if (rootPlanNode_ != null) {
      str.append(
          rootPlanNode_.getExplainString(planRootPrefix, prefix, /*queryOptions,*/ detailLevel));
    }   
    return str.toString();
  }

 /**
   * Get a header string for a fragment in an explain plan.
   */
  private String getFragmentHeaderString(String firstLinePrefix, String detailPrefix,
      int mt_dop) {
    StringBuilder builder = new StringBuilder();
    builder.append(String.format("%s%s:PLAN FRAGMENT [%s]", firstLinePrefix,
//XXX:        id_.toString(), dataPartition_.getExplainString()));
        id_.toString(), "UNPARTITIONED"));
//XXX:    builder.append(PrintUtils.printNumHosts(" ", getNumNodes()));
    builder.append(PrintUtils.printNumHosts(" ", 1));
//XXX:    builder.append(PrintUtils.printNumInstances(" ", getNumInstances(mt_dop)));
    builder.append(PrintUtils.printNumInstances(" ", 1));
    builder.append("\n");
    builder.append(detailPrefix);
/*XXX:
    builder.append("Per-Host Resources: ");
    if (sink_ instanceof JoinBuildSink) {
      builder.append("included in parent fragment");
    } else {
      builder.append(resourceProfile_.multiply(getNumInstancesPerHost(mt_dop))
          .getExplainString());
      if (resourceProfile_.isValid() && runtimeFiltersMemReservationBytes_ > 0) {
        builder.append(" runtime-filters-memory=");
        builder.append(PrintUtils.printBytes(runtimeFiltersMemReservationBytes_));
      }
    }
*/
    builder.append("\n");
    return builder.toString();
  }

  private TDataPartition getUnpartitionedDataPartition() {
    TDataPartition partition = new TDataPartition();
    partition.setType(TPartitionType.UNPARTITIONED);
    partition.setPartition_exprs(Lists.newArrayList());
    return partition;
  }
}
