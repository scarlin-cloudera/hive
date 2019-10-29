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

import org.apache.hadoop.hive.ql.impalafile.FbFileBlock;
import org.apache.hadoop.hive.ql.impalafile.FileDescriptor;
import org.apache.hadoop.hive.ql.impalafile.FileDescriptor.FileBlock;
import org.apache.hadoop.hive.ql.impalafile.ListMap;

import org.apache.impala.thrift.THdfsFileSplit;
import org.apache.impala.thrift.TNetworkAddress;
import org.apache.impala.thrift.TScanRange;
import org.apache.impala.thrift.TScanRangeLocation;
import org.apache.impala.thrift.TScanRangeLocationList;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HdfsScanRangesForPartition {
  private final Map<FileDescriptor, List<HdfsScanRangeLoc>> fileDescScanRanges_;
  
  private final HdfsPartition partition_;

  // XXX: In Impala, this is derived from various places like MAX_SCAN_RANGE_LENGTH (see code in HdfsScanNode)
  private final static int SCAN_RANGE_BYTE_LIMIT = 1024 * 1024;

  private class HdfsScanRangeLoc {
    public final TNetworkAddress networkAddress_;
    public final int volumeId_;
    public final boolean isCached_;

    public HdfsScanRangeLoc(TNetworkAddress networkAddress, int volumeId, boolean isCached) {
      networkAddress_ = networkAddress;
      volumeId_ = volumeId;
      isCached_ = isCached;
    }
  }

  public HdfsScanRangesForPartition(HdfsPartition partition, List<FileDescriptor> fileDescs) {
    partition_ = partition;
    fileDescScanRanges_ = createFileDescScanRangeLocs(partition, fileDescs);
  }

  private Map<FileDescriptor, List<HdfsScanRangeLoc>> createFileDescScanRangeLocs(
      HdfsPartition partition, List<FileDescriptor> fileDescs) {
    Map<FileDescriptor, List<HdfsScanRangeLoc>> fileDescScanRanges = Maps.newHashMap();
    for (FileDescriptor fileDesc : fileDescs) {
      fileDescScanRanges.put(fileDesc, createHdfsScanRangeLoc(partition, fileDesc));
    }
    return ImmutableMap.<FileDescriptor, List<HdfsScanRangeLoc>>builder().putAll(fileDescScanRanges).build();
  }

  private List<HdfsScanRangeLoc> createHdfsScanRangeLoc(HdfsPartition partition, FileDescriptor fileDesc) {
    Preconditions.checkArgument(fileDesc.getNumFileBlocks() > 0);
    List<HdfsScanRangeLoc> locations = Lists.newArrayList();
    for (int i = 0; i < fileDesc.getNumFileBlocks(); ++i) {
      FbFileBlock block = fileDesc.getFbFileBlock(i);
      for (int j = 0; j < FileBlock.getNumReplicaHosts(block); ++j) {
        locations.add(new HdfsScanRangeLoc(getNetworkAddress(partition, fileDesc, block, j),
                                 FileBlock.getDiskId(block, j),
                                 FileBlock.isReplicaCached(block, j)));
      }
    }
    return locations;
  }

  private TNetworkAddress getNetworkAddress(HdfsPartition partition, FileDescriptor fileDesc, FbFileBlock block, int j) {
    return partition.getHostIndexMap().getEntry(FileBlock.getReplicaHostIdx(block, j));
  }

  // hostmapIndex is the global TNetworkAddress structure across all partitions.
  public List<TScanRangeLocationList> toThrift(ListMap<TNetworkAddress> hostMapIndex) {
    List<TScanRangeLocationList> scanRangeLocations = Lists.newArrayList();
    for (FileDescriptor fileDesc : fileDescScanRanges_.keySet()) {
      for (int i = 0; i < fileDesc.getNumFileBlocks(); ++i) {
        FbFileBlock block = fileDesc.getFbFileBlock(i);
        long currentOffset = FileBlock.getOffset(block);
        long remainingLength = FileBlock.getLength(block);
        while (remainingLength > 0) {
          long currentLength = remainingLength;
          if (SCAN_RANGE_BYTE_LIMIT > 0 && remainingLength > SCAN_RANGE_BYTE_LIMIT) {
            currentLength = SCAN_RANGE_BYTE_LIMIT;
          }
          TScanRange scanRange = new TScanRange();
          scanRange.setHdfs_file_split(new THdfsFileSplit(fileDesc.getRelativePath(),
              currentOffset, currentLength, partition_.getId(), fileDesc.getFileLength(),
              fileDesc.getFileCompression().toThrift(), fileDesc.getModificationTime(),
              fileDesc.getIsEc(), partition_.getLocation().hashCode()));
          TScanRangeLocationList scanRangeLocationList  = new TScanRangeLocationList();
          scanRangeLocationList.setScan_range(scanRange);
          scanRangeLocationList.setLocations(getTScanLocationList(fileDesc, hostMapIndex));
          scanRangeLocations.add(scanRangeLocationList);
          remainingLength -= currentLength;
          currentOffset += currentLength;
        }
      }
    }
    return scanRangeLocations;
  }

  private List<TScanRangeLocation> getTScanLocationList(FileDescriptor fileDesc, ListMap<TNetworkAddress> hostMapIndex) {
    List<TScanRangeLocation> scanLocationList = Lists.newArrayList();
    for (HdfsScanRangeLoc hdfsScanRangeLoc : fileDescScanRanges_.get(fileDesc)) {
      TScanRangeLocation scanRangeLocation = new TScanRangeLocation();
      scanRangeLocation.setHost_idx(hostMapIndex.getIndex(hdfsScanRangeLoc.networkAddress_));
      scanRangeLocation.setVolume_id(hdfsScanRangeLoc.volumeId_);
      scanRangeLocation.setIs_cached(hdfsScanRangeLoc.isCached_);
      scanLocationList.add(scanRangeLocation);
    }
    return scanLocationList;
  }
}
