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

import java.util.Map;
import java.util.Set;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import org.apache.calcite.rel.core.TableScan;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.hive.metastore.api.SerDeInfo;
import org.apache.hadoop.hive.ql.metadata.Partition;
import org.apache.hadoop.hive.ql.metadata.Table;
import org.apache.hadoop.hive.serde.serdeConstants;
import org.apache.impala.thrift.TFileSplitGeneratorSpec;
import org.apache.impala.thrift.THdfsPartition;
import org.apache.impala.thrift.THdfsPartitionLocation;
import org.apache.impala.thrift.TNetworkAddress;

import org.apache.hadoop.hive.ql.impalafile.ListMap;
import org.apache.hadoop.hive.ql.impalafile.FileMetadataLoader;
import org.apache.hadoop.hive.ql.impalafile.FileDescriptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HdfsPartition {

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

  private final Partition partition_;

  private final Table table_;
 
  private final int id_;

  private static final Logger LOG = LoggerFactory.getLogger(HdfsPartition.class);

  public HdfsPartition(Partition partition, Table table, int id) {
    partition_ = partition;
    table_ = table;
    id_ = id;
  }

  public THdfsPartition toThrift() {
    THdfsPartition hdfsPartition = new THdfsPartition();

    org.apache.hadoop.hive.metastore.api.Partition tPartition = partition_.getTPartition();

    Map<String, Byte> delimMap = extractDelimiters(tPartition.getSd().getSerdeInfo());

    hdfsPartition.setLineDelim(delimMap.get(serdeConstants.LINE_DELIM));
    hdfsPartition.setFieldDelim(delimMap.get(serdeConstants.FIELD_DELIM));
    hdfsPartition.setCollectionDelim(delimMap.get(serdeConstants.COLLECTION_DELIM));
    hdfsPartition.setMapKeyDelim(delimMap.get(serdeConstants.MAPKEY_DELIM));
    hdfsPartition.setEscapeChar(delimMap.get(serdeConstants.ESCAPE_CHAR));

    //XXX: simplify this
    //XXX: This is wrong, grabbing from table instead of partition
    hdfsPartition.setFileFormat(HdfsFileFormat.fromJavaClassName(table_.getInputFormatClass().getName()).toThrift());
    //hdfsPartition.setFileFormat(HdfsFileFormat.fromJavaClassName(tPartition.getInputFormatClass().getName()).toThrift());
     
    //XXX: simplify or put in function
    Map<String, String> parameters = tPartition.getSd().getSerdeInfo().getParameters();
    int blockSize = 0;
    String blockValue = parameters.get(BLOCK_SIZE);
    if (blockValue != null) {
      blockSize = Integer.parseInt(blockValue);
    }   
    hdfsPartition.setBlockSize(blockSize);
    THdfsPartitionLocation partitionLocation = new THdfsPartitionLocation();
    partitionLocation.setPrefix_index(id_);
    //XXX: re-examine this
    partitionLocation.setSuffix("");
    hdfsPartition.setLocation(partitionLocation);
    System.out.println("SJC: IN TOTHRIFT FOR PARTITION");

    /////////////////
    //XXX: REORG THIS
    ListMap<TNetworkAddress> lm = new ListMap<TNetworkAddress>();
    try {
      FileMetadataLoader fmdl = new FileMetadataLoader(new Path(getLocation()), false, Lists.newArrayList(), lm, null);
      fmdl.load();
      System.out.println("SJC: NUMBER OF FILES IS " + fmdl.getLoadedFds().size());
/*
      for (FileDescriptor fileDesc : fmdl.getLoadedFds()) {
        generateScanRangeSpecs(fileDesc, 1024*1024); 
      }
*/
    } catch (Exception e) {
      System.out.println("SJC: CAUGHT EXCEPTION " + e);
      e.printStackTrace();
    }
    /////////////////

    return hdfsPartition;
  }

  public int getId() {
    return id_;
  }

  public String getLocation() {
    return partition_.getTPartition().getSd().getLocation();
  }
  
  //XXX: CLEANUP
  private static Map<String, Byte> extractDelimiters(SerDeInfo serdeInfo) {
    // The metastore may return null for delimiter parameters,
    // which means we need to use a default instead.
    // We tried long and hard to find default values for delimiters in Hive,
    // but could not find them.
    Map<String, Byte> delimMap = Maps.newHashMap();

    for (String delimKey: DELIMITER_KEYS) {
      String delimValue = serdeInfo.getParameters().get(delimKey);
      if (delimValue == null) {
        if (delimKey.equals(serdeConstants.FIELD_DELIM)) {
          delimMap.put(delimKey, (byte) DEFAULT_FIELD_DELIM);
        } else if (delimKey.equals(serdeConstants.ESCAPE_CHAR)) {
          delimMap.put(delimKey, (byte) DEFAULT_ESCAPE_CHAR);
        } else if (delimKey.equals(serdeConstants.LINE_DELIM)) {
          delimMap.put(delimKey, (byte) DEFAULT_LINE_DELIM);
        } else {
          delimMap.put(delimKey, delimMap.get(serdeConstants.FIELD_DELIM));
        }
      } else {
        delimMap.put(delimKey, parseDelim(delimValue));
      }
    }
    return delimMap;
  }

  public static Byte parseDelim(String delimVal) {
    Preconditions.checkNotNull(delimVal);
    try { 
      // In the future we could support delimiters specified in hex format, but we would
      // need support from the Hive side.
      return Byte.parseByte(delimVal);
    } catch (NumberFormatException e) {
      if (delimVal.length() == 1) {
        // Adding additional check as Java chars are two bytes.
        // e.g. \u1111 as delimVal will return a valid byte '11'
        int cp = Character.codePointAt(delimVal, 0);
        if (cp >= 0 && cp <= 255) return (byte) cp;
      }
    }
    return null;
  }

/*
  private Pair<Boolean, Long> transformBlocksToScanRanges(FileDescriptor fileDesc) {
    //XXX: check for missing disk ids
    Preconditions.checkArgument(fileDesc.getNumFileBlocks() > 0);
    for (int i = 0; i < fileDesc.getNumFileBlocks(); ++i) {
      FbFileBlock block = fileDesc.getFbFileBlock(i);
      int replicaHostCount = FileBlock.getNumReplicaHosts(block);
      if (replicaHostCount == 0) {
        // we didn't get locations for this block; for now, just ignore the block
        // TODO: do something meaningful with that
        continue;
      }
      // Collect the network address and volume ID of all replicas of this block.
      List<TScanRangeLocation> locations = new ArrayList<>();
      for (int j = 0; j < replicaHostCount; ++j) {
        TScanRangeLocation location = new TScanRangeLocation();
        // Translate from the host index (local to the HdfsTable) to network address.
        int replicaHostIdx = FileBlock.getReplicaHostIdx(block, j);
        //TODO
        TNetworkAddress networkAddress =
            partition.getTable().getHostIndex().getEntry(replicaHostIdx);
        Preconditions.checkNotNull(networkAddress);
        // Translate from network address to the global (to this request) host index.
        Integer globalHostIdx = analyzer.getHostIndex().getIndex(networkAddress);
        location.setHost_idx(globalHostIdx);

        location.setVolume_id(FileBlock.getDiskId(block, j));
        location.setIs_cached(FileBlock.isReplicaCached(block, j));
        locations.add(location);
      }

      // create scan ranges, taking into account maxScanRangeLength
      long currentOffset = FileBlock.getOffset(block);
      long remainingLength = FileBlock.getLength(block);
      while (remainingLength > 0) {
        long currentLength = remainingLength;
        if (scanRangeBytesLimit > 0 && remainingLength > scanRangeBytesLimit) {
          currentLength = scanRangeBytesLimit;
        }
        TScanRange scanRange = new TScanRange();
        scanRange.setHdfs_file_split(new THdfsFileSplit(fileDesc.getRelativePath(),
            currentOffset, currentLength, partition.getId(), fileDesc.getFileLength(),
            fileDesc.getFileCompression().toThrift(), fileDesc.getModificationTime(),
            fileDesc.getIsEc(), partition.getLocation().hashCode()));
        TScanRangeLocationList scanRangeLocations = new TScanRangeLocationList();
        scanRangeLocations.scan_range = scanRange;
        scanRangeLocations.locations = locations;
        scanRangeSpecs_.addToConcrete_ranges(scanRangeLocations);
        largestScanRangeBytes_ = Math.max(largestScanRangeBytes_, currentLength);
        fileMaxScanRangeBytes = Math.max(fileMaxScanRangeBytes, currentLength);
        remainingLength -= currentLength;
        currentOffset += currentLength;
      }
    }

    return new Pair<Boolean, Long>(fileDescMissingDiskIds, fileMaxScanRangeBytes);
  }
*/
}
