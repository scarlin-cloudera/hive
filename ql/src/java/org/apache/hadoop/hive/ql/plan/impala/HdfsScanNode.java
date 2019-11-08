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

import org.apache.hadoop.hive.ql.optimizer.calcite.reloperators.HiveFilter;

import org.apache.impala.thrift.TExplainLevel;
import org.apache.impala.thrift.THdfsScanNode;
import org.apache.impala.thrift.TPlanNode;
import org.apache.impala.thrift.TPlanNodeType;

import com.google.common.collect.Maps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HdfsScanNode extends ScanNode {
  private final static Logger LOG = LoggerFactory.getLogger(HdfsScanNode.class);

  //XXX: calculate this
  private final int maxScanRangeNumRows_ = -1;

  public HdfsScanNode(TupleDescriptor tuple, HiveFilter filter, PlanId id) {
    super(tuple, filter, id, "HDFS");
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

  protected String getDerivedExplainString(String prefix, String detailPrefix, TExplainLevel detailLevel) {
    StringBuilder output = new StringBuilder();
    output.append(String.format("%s%s [%s", prefix, getDisplayLabel(),
        getDisplayLabelDetail()));
    //XXX: Impala is printing "RANDOM" here, but need to figure out about fragment
/*
    if (detailLevel.ordinal() >= TExplainLevel.EXTENDED.ordinal() &&
        fragment_.isPartitioned()) {
      output.append(", " + fragment_.getDataPartition().getExplainString());
    }    
*/
    output.append("]\n");
    if (detailLevel.ordinal() >= TExplainLevel.STANDARD.ordinal()) {
/*
      if (partitionConjuncts_ != null && !partitionConjuncts_.isEmpty()) {
        output.append(detailPrefix)
          .append(String.format("partition predicates: %s\n",
              Expr.getExplainString(partitionConjuncts_, detailLevel)));
      }    
*/
      output.append(getTupleDesc().getPartitionExplainString(detailPrefix));

/* XXX:fill in once we add where clause
      if (!conjuncts_.isEmpty()) {
        output.append(detailPrefix)
          .append(String.format("predicates: %s\n",
              Expr.getExplainString(conjuncts_, detailLevel)));
      }
*/
/*
      if (!collectionConjuncts_.isEmpty()) {
        for (Map.Entry<TupleDescriptor, List<Expr>> entry:
          collectionConjuncts_.entrySet()) {
          String alias = entry.getKey().getAlias();
          output.append(detailPrefix)
            .append(String.format("predicates on %s: %s\n", alias,
                Expr.getExplainString(entry.getValue(), detailLevel)));
        }
      }
*/
/*
      if (!runtimeFilters_.isEmpty()) {
        output.append(detailPrefix + "runtime filters: ");
        output.append(getRuntimeFilterExplainString(false, detailLevel));
      }
*/
    }
    if (detailLevel.ordinal() >= TExplainLevel.EXTENDED.ordinal()) {
    //XXX: put in stats string
//      output.append(getStatsExplainString(detailPrefix)).append("\n");
      String extrapRows;
      if (/*XXXFeFsTable.Utils.isStatsExtrapolationEnabled(tbl_)*/ false) {
//        extrapRows = PrintUtils.printEstCardinality(extrapolatedNumRows_);
      } else {
        extrapRows = "disabled";
      }
      output.append(detailPrefix)
            .append("extrapolated-rows=")
            .append(extrapRows)
            .append(" max-scan-range-rows=")
            .append(PrintUtils.printEstCardinality(maxScanRangeNumRows_))
            .append("\n");
/* XXX:
      if (numScanRangesNoDiskIds_ > 0) {
        output.append(detailPrefix)
          .append(String.format("missing disk ids: "
                + "partitions=%s/%s files=%s/%s scan ranges %s/%s\n",
            numPartitionsNoDiskIds_, sumValues(numPartitionsPerFs_),
            numFilesNoDiskIds_, sumValues(totalFilesPerFs_), numScanRangesNoDiskIds_,
            scanRangeSpecs_.getConcrete_rangesSize() + generatedScanRangeCount_));
      }
*/
/*XXX:
      // Groups the min max original conjuncts by tuple descriptor.
//      output.append(getMinMaxOriginalConjunctsExplainString(detailPrefix, detailLevel));
      // Groups the dictionary filterable conjuncts by tuple descriptor.
//      output.append(getDictionaryConjunctsExplainString(detailPrefix, detailLevel));
*/
    }

    return output.toString();
  }
}
