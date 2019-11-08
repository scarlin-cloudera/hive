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

import org.apache.impala.thrift.TExplainLevel;
import org.apache.impala.thrift.TPlanExecInfo;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PlanExecInfo {
  private final List<PlanFragment> fragments_;

  private final ScanRangeLocations scanRangeLocations_;

  public PlanExecInfo(PlanFragment fragment, ScanRangeLocations scanRangeLocations) {
    //XXX: only handling one fragment right now
    fragments_ = ImmutableList.of(fragment);
    scanRangeLocations_ = scanRangeLocations;
  }

  public TPlanExecInfo toThrift() {
    TPlanExecInfo planExecInfo = new TPlanExecInfo();
    for (PlanFragment fragment : fragments_) {
      planExecInfo.addToFragments(fragment.toThrift());
    }

    for (ScanNode scanNode : scanRangeLocations_.getScanNodes()) {
      planExecInfo.putToPer_node_scan_ranges(
          scanNode.getId().asInt(), scanRangeLocations_.getScanRangeSpec(scanNode));
    }
    return planExecInfo;
  }

  public String getExplainString(TExplainLevel explainLevel) {
    StringBuilder builder = new StringBuilder();
    for (PlanFragment fragment : fragments_) {
      builder.append(fragment.getExplainString("", "", explainLevel));
    }
    return builder.toString();
  }
}
