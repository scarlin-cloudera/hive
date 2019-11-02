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

import org.apache.calcite.rel.core.TableScan;

import org.apache.impala.thrift.THdfsScanNode;
import org.apache.impala.thrift.TPlanNode;
import org.apache.impala.thrift.TPlanNodeType;

import com.google.common.collect.Maps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HdfsScanNode extends ScanNode {
  private final static Logger LOG = LoggerFactory.getLogger(HdfsScanNode.class);

  public HdfsScanNode(TupleDescriptor tuple, PlanId id) {
    super(tuple, id, "HDFS");
  }

  @Override
  protected TPlanNode createDerivedTPlanNode() {
    TPlanNode planNode = new TPlanNode();
    THdfsScanNode hdfsScanNode = new THdfsScanNode(getTupleDesc().getTupleId()); 
    planNode.setNode_type(TPlanNodeType.HDFS_SCAN_NODE);
    hdfsScanNode.setUse_mt_scan_node(false);
    planNode.setHdfs_scan_node(hdfsScanNode);
    //XXX: fix this
    hdfsScanNode.setRandom_replica(false);
    //XXX: fix this
    hdfsScanNode.setDictionary_filter_conjuncts(Maps.newHashMap());

    //XXX:
/*
    if (replicaPreference_ != null) {
      msg.hdfs_scan_node.setReplica_preference(replicaPreference_);
    }    
*/
/* XXX:
    if (!collectionConjuncts_.isEmpty()) {
      Map<Integer, List<TExpr>> tcollectionConjuncts = new LinkedHashMap<>();
      for (Map.Entry<TupleDescriptor, List<Expr>> entry:
        collectionConjuncts_.entrySet()) {
        tcollectionConjuncts.put(entry.getKey().getId().asInt(),
            Expr.treesToThrift(entry.getValue()));
      }    
      msg.hdfs_scan_node.setCollection_conjuncts(tcollectionConjuncts);
    }    
*/
/*XXX:
    if (skipHeaderLineCount_ > 0) { 
      msg.hdfs_scan_node.setSkip_header_line_count(skipHeaderLineCount_);
    }    
*/
/*XXX:
    Preconditions.checkState((optimizedAggSmap_ == null) == (countStarSlot_ == null));
    if (countStarSlot_ != null) {
      msg.hdfs_scan_node.setParquet_count_star_slot_offset(
          countStarSlot_.getByteOffset());
    }    
    if (!minMaxConjuncts_.isEmpty()) {
      for (Expr e: minMaxConjuncts_) {
        msg.hdfs_scan_node.addToMin_max_conjuncts(e.treeToThrift());
      }    
      msg.hdfs_scan_node.setMin_max_tuple_id(minMaxTuple_.getId().asInt());
    }    
    Map<Integer, List<Integer>> dictMap = new LinkedHashMap<>();
    for (Map.Entry<SlotDescriptor, List<Integer>> entry :
      dictionaryFilterConjuncts_.entrySet()) {
      dictMap.put(entry.getKey().getId().asInt(), entry.getValue());
    }    
    msg.hdfs_scan_node.setDictionary_filter_conjuncts(dictMap);
*/
    return planNode;
  }
}
