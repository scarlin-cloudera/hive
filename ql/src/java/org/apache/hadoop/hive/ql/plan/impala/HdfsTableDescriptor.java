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
import java.util.Map;
import java.util.Set;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import org.apache.calcite.rel.core.TableScan;
import org.apache.hadoop.hive.metastore.api.SerDeInfo;
import org.apache.hadoop.hive.ql.impalafile.ListMap;
import org.apache.hadoop.hive.ql.optimizer.calcite.RelOptHiveTable;
import org.apache.hadoop.hive.ql.optimizer.calcite.reloperators.HiveTableScan;
import org.apache.hadoop.hive.ql.metadata.Partition;
import org.apache.hadoop.hive.ql.metadata.Table;
import org.apache.hadoop.hive.serde.serdeConstants;
import org.apache.impala.thrift.THdfsPartition;
import org.apache.impala.thrift.THdfsPartitionLocation;
import org.apache.impala.thrift.THdfsTable;
import org.apache.impala.thrift.TNetworkAddress;
import org.apache.impala.thrift.TScanRangeLocationList;
import org.apache.impala.thrift.TScanRangeSpec;
import org.apache.impala.thrift.TTableDescriptor;
import org.apache.impala.thrift.TTableType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HdfsTableDescriptor extends TableDescriptor {

  //TODO;:
  private final String hdfsBaseDir_ = "";

  // The string used to represent NULL partition keys.
  //XXX:
  private final String nullPartitionKeyValue_ = "";

  // String to indicate a NULL column value in text files
  //XXX:
  private final String nullColumnValue_ = "";

  // Set to the table's Avro schema if this is an Avro table
  //XXX:
  private final String avroSchema_ = "";

  public static final String DEFAULT_NULL_COLUMN_VALUE = "\\N";

  //XXX: extracted from hdfsstoragedescriptor from impala
  public static final char DEFAULT_LINE_DELIM = '\n';
  // hive by default uses ctrl-a as field delim
  public static final char DEFAULT_FIELD_DELIM = '\u0001';
  // hive by default has no escape char
  public static final char DEFAULT_ESCAPE_CHAR = '\u0000';

  // Serde parameters that are recognized by table writers.
  private static final String BLOCK_SIZE = "blocksize";

  private static final String DEFAULT_NULL_PARTITION_KEY_VALUE =
      "__HIVE_DEFAULT_PARTITION__";


  // Important: don't change the ordering of these keys - if e.g. FIELD_DELIM is not
  // found, the value of LINE_DELIM is used, so LINE_DELIM must be found first.
  // Package visible for testing.
  final static ImmutableList<String> DELIMITER_KEYS = ImmutableList.of(
      serdeConstants.LINE_DELIM, serdeConstants.FIELD_DELIM,
      serdeConstants.COLLECTION_DELIM, serdeConstants.MAPKEY_DELIM,
      serdeConstants.ESCAPE_CHAR, serdeConstants.QUOTE_CHAR);

  //TODO:
  // private final ImmutableMap<Long, HdfsPartition> partitions_;

  // Prototype partition, used when creating new partitions during insert.
  //TODO:
  //private final HdfsPartition prototypePartition;

  //TODO:
  //private final HdfsPartition prototypePartition;

  // The prefixes of locations of partitions in this table. See THdfsPartitionLocation for
  // the description of how a prefix is computed.
  //TODO;
  //private ImmutableList<String> partitionPrefixes = ImmutableList.of();

  // ============================================================
  // Fields only included when the catalogd serializes a table to be
  // sent to the impalad as part of a catalog update.
  // ============================================================

  // Each TNetworkAddress is a datanode which contains blocks of a file in the table.
  // Used so that each THdfsFileBlock can just reference an index in this list rather
  // than duplicate the list of network address, which helps reduce memory usage.
  //XXX: see above comment, do we need this first cut?
  //private final ImmutableList<NetworkAddress> networkAddresses_;

  private final List<HdfsPartition> partitions_;

  private static final Logger LOG = LoggerFactory.getLogger(HdfsTableDescriptor.class);

  public HdfsTableDescriptor(HiveTableScan tableScan, TableId tableId) {
    super(tableScan, tableId);

    RelOptHiveTable hiveTable = (RelOptHiveTable) tableScan.getTable();
    Set<Partition> partitions = hiveTable.getPartitionList().getPartitions();
    List<HdfsPartition> hdfsPartitions = Lists.newArrayList();
    int id = 0;
    for (Partition partition : partitions) {
      hdfsPartitions.add(new HdfsPartition(partition, hiveTable.getHiveTableMD(), id++));
    }
    partitions_ = ImmutableList.<HdfsPartition>builder().addAll(hdfsPartitions).build();
  }

  @Override
  public TTableDescriptor toThrift() {
    // Create thrift descriptors to send to the BE. The BE does not
    // need any information below the THdfsPartition level.
    TTableDescriptor tableDesc = new TTableDescriptor(getTableId(), TTableType.HDFS_TABLE,
        getTColumnDescriptors(), getNumClusteringCols(), getTableName(), getDbName());
    tableDesc.setHdfsTable(getTHdfsTable(getTableScan()));
    return tableDesc;
  }   

  private THdfsTable getTHdfsTable(HiveTableScan tableScan) {
    assert tableScan.getTable() instanceof RelOptHiveTable;
    //XXX: move some of this up to parent
    RelOptHiveTable hiveTable = (RelOptHiveTable) tableScan.getTable();
    Table tableMD = hiveTable.getHiveTableMD();
    
    THdfsTable hdfsTable = new THdfsTable();
    hdfsTable.setHdfsBaseDir(tableMD.getPath().toString());
    //XXX: This says deprecated, hope they're right.
    hdfsTable.setColNames(Lists.newArrayList());
    //XXX: get this from hive conf
    hdfsTable.setNullPartitionKeyValue(DEFAULT_NULL_PARTITION_KEY_VALUE);

    String nullColumnValue = tableMD.getParameters().get(serdeConstants.SERIALIZATION_NULL_FORMAT);
    if (nullColumnValue == null) {
      nullColumnValue = DEFAULT_NULL_COLUMN_VALUE;
    }
    hdfsTable.setNullColumnValue(DEFAULT_NULL_COLUMN_VALUE);

    Map<Long, THdfsPartition> idToPartition = Maps.newHashMap();
    for (HdfsPartition partition : partitions_) {
      THdfsPartitionLocation partitionLocation = new THdfsPartitionLocation();
      //XXX: is id number correct?
      idToPartition.put((long)partition.getId(), partition.toThrift());
      hdfsTable.addToPartition_prefixes(partition.getLocation());
    }
    hdfsTable.setPartitions(idToPartition);

    assert partitions_.size() > 0;
    hdfsTable.setPrototype_partition(partitions_.get(0).toThriftPrototype());

    return hdfsTable;
  }

  @Override
  public List<ListMap<TNetworkAddress>> getAllHostIndexes() {
    List<ListMap<TNetworkAddress>> listmaps = Lists.newArrayList();
    for (HdfsPartition partition : partitions_) {
      listmaps.add(partition.getHostIndexMap());
    }  
    return listmaps;
  }

  @Override
  public TScanRangeSpec getScanRangeSpec(ListMap<TNetworkAddress> hostIndexes) {
    TScanRangeSpec scanRangeSpec = new TScanRangeSpec();
    for (HdfsPartition partition : partitions_) {
      List<TScanRangeLocationList> scanLocationLists = partition.getScanLocationLists(hostIndexes);
      for (TScanRangeLocationList scanLocationList : scanLocationLists) {
        scanRangeSpec.addToConcrete_ranges(scanLocationList);
      }
    }
    return scanRangeSpec;
  }
}
