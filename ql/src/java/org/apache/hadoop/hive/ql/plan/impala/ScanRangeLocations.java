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

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

import org.apache.hadoop.hive.ql.impalafile.ListMap;
import org.apache.impala.thrift.TNetworkAddress;
import org.apache.impala.thrift.TScanRangeSpec;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ScanRangeLocations {
  private final List<ScanNode> scanNodes_;
  private final ListMap<TNetworkAddress> hostMapIndex_;

  public ScanRangeLocations(List<ScanNode> scanNodes) {
    scanNodes_ = new ImmutableList.Builder<ScanNode>().addAll(scanNodes).build();
    hostMapIndex_ = getGlobalHostMapIndexes(scanNodes);
  }

  public List<ScanNode> getScanNodes() {
    return scanNodes_;
  }

  public TScanRangeSpec getScanRangeSpec(ScanNode scanNode) {
    return scanNode.getScanRangeSpec(hostMapIndex_);
  }

  public List<TNetworkAddress> getHostIndexes() {
    List<TNetworkAddress> networkAddresses = Lists.newArrayList();
    for (int i = 0; i < hostMapIndex_.size(); ++i) {
      networkAddresses.add(hostMapIndex_.getEntry(i));
    }
    return networkAddresses;
  }

  private ListMap<TNetworkAddress> getGlobalHostMapIndexes(List<ScanNode> scanNodes) {
    ListMap<TNetworkAddress> globalHostIndex = new ListMap<TNetworkAddress>();
    List<ListMap<TNetworkAddress>> allHostIndexes = Lists.newArrayList();
    for (ScanNode scanNode : scanNodes) {
      allHostIndexes.addAll(scanNode.getTupleDesc().getTableDescriptor().getAllHostIndexes());
    }
    System.out.println("SJC: ALLHOST SIZE = " + allHostIndexes.size());
    for (ListMap<TNetworkAddress> listmap : allHostIndexes) {
      System.out.println("SJC: LISTMAP SIZE = " + listmap.size());
      for (int i = 0; i < listmap.size(); ++i) {
        System.out.println("SJC: LISTMAP ENTRY = " + listmap.getEntry(i));
        //XXX: does the add, but let's rename method 'getIndex' to something better
        globalHostIndex.getIndex(listmap.getEntry(i));
      }
    }
    return globalHostIndex;
  }
}
