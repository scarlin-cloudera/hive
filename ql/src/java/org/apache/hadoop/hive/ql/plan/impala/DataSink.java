// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

package org.apache.hadoop.hive.ql.plan.impala;

import org.apache.impala.thrift.TDataSink;
import org.apache.impala.thrift.TDataSinkType;
import org.apache.impala.thrift.TExecStats;
import org.apache.impala.thrift.TExplainLevel;
import org.apache.impala.thrift.TExpr;
import org.apache.impala.thrift.TPlanRootSink;


abstract public class DataSink {

  public DataSink() {
  }

  public TDataSink getTDataSink() {
    TDataSink dataSink = getDerivedTDataSink();

    //XXX:
    TExecStats estimatedStats = new TExecStats();
    estimatedStats.setMemory_used(0);
    dataSink.setEstimated_stats(estimatedStats);
    return dataSink;
  }

  /** 
   * Return an explain string for the DataSink. Each line of the explain will be prefixed
   * by "prefix".
   */
  public final String getExplainString(String prefix, String detailPrefix,
      /*TQueryOptions queryOptions,*/ TExplainLevel explainLevel) {
    StringBuilder output = new StringBuilder();
    output.append(getDerivedExplainString(prefix, detailPrefix, /*queryOptions,*/ explainLevel));
    return output.toString();
  }

  abstract public TDataSink getDerivedTDataSink();
  abstract public String getDerivedExplainString(String prefix, String detailPrefix,
      /*XXX:TQueryOptions queryOptions,*/ TExplainLevel explainLevel);
}
