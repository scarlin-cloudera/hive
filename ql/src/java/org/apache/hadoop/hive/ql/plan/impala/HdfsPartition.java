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
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.hive.metastore.api.SerDeInfo;
import org.apache.hadoop.hive.ql.impalafile.FileSystemUtil;
import org.apache.hadoop.hive.ql.metadata.Partition;
import org.apache.hadoop.hive.ql.metadata.Table;
import org.apache.hadoop.hive.serde.serdeConstants;
import org.apache.impala.thrift.TFileSplitGeneratorSpec;
import org.apache.impala.thrift.THdfsPartition;
import org.apache.impala.thrift.THdfsPartitionLocation;
import org.apache.impala.thrift.TNetworkAddress;
import org.apache.impala.thrift.TScanRangeLocationList;

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

  private final ListMap<TNetworkAddress> hostIndexMap_;

  private final List<FileDescriptor> fileDescriptors_;

  private final HdfsScanRangesForPartition scanRangesForPartition_;

  private static final Logger LOG = LoggerFactory.getLogger(HdfsPartition.class);

  public HdfsPartition(Partition partition, Table table, int id) {
    partition_ = partition;
    table_ = table;
    id_ = id;
    // This gets filled in with network addresses by the FileMetadataLoader
    hostIndexMap_  = new ListMap<TNetworkAddress>();
    // hostIndexMap is empty going into this routine, but file descriptors are retrieved.
    fileDescriptors_ = getFileDescriptors(hostIndexMap_);
    scanRangesForPartition_ = new HdfsScanRangesForPartition(this, fileDescriptors_);
  }

  public THdfsPartition toThriftPrototype() {
    THdfsPartition hdfsPartition = new THdfsPartition();
    org.apache.hadoop.hive.metastore.api.Partition tPartition = partition_.getTPartition();
    Map<String, Byte> delimMap = extractDelimiters(tPartition.getSd().getSerdeInfo());

    hdfsPartition.setLineDelim(delimMap.get(serdeConstants.LINE_DELIM));
    hdfsPartition.setFieldDelim(delimMap.get(serdeConstants.FIELD_DELIM));
    hdfsPartition.setCollectionDelim(delimMap.get(serdeConstants.COLLECTION_DELIM));
    hdfsPartition.setMapKeyDelim(delimMap.get(serdeConstants.MAPKEY_DELIM));
    hdfsPartition.setEscapeChar(delimMap.get(serdeConstants.ESCAPE_CHAR));
    hdfsPartition.setId(-1);
    //XXX: for POC, this seems ok, look at in the future.
    hdfsPartition.setPartitionKeyExprs(Lists.newArrayList());

    //XXX: simplify this
    //XXX: This is wrong, grabbing from table instead of partition
    hdfsPartition.setFileFormat(HdfsFileFormat.fromJavaClassName(table_.getInputFormatClass().getName()).toThrift());
    hdfsPartition.setBlockSize(0);
   
    return hdfsPartition;
  }

  public THdfsPartition toThrift() {
    THdfsPartition hdfsPartition = toThriftPrototype();

    org.apache.hadoop.hive.metastore.api.Partition tPartition = partition_.getTPartition();

    hdfsPartition.setId(id_);

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

    return hdfsPartition;
  }

  public int getId() {
    return id_;
  }

  public String getLocation() {
    return partition_.getTPartition().getSd().getLocation();
  }

  public ListMap<TNetworkAddress> getHostIndexMap() {
    return hostIndexMap_;
  }

  public List<TScanRangeLocationList> getScanLocationLists(ListMap<TNetworkAddress> hostIndexes) {
    return scanRangesForPartition_.toThrift(hostIndexes);
  }
  
  public long getFilesLength() {
    return FileDescriptor.computeTotalFileLength(fileDescriptors_);
  }

  public int getNumFiles() {
    return fileDescriptors_.size();
  }

  //XXX: DO NOT HARDCODE THIS, GET FROM LOCATION!!!!
  public FileSystemUtil.FsType getFsType() {
    return FileSystemUtil.FsType.HDFS;
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

  private List<FileDescriptor> getFileDescriptors(ListMap<TNetworkAddress> hostIndexMap) {
    List<FileDescriptor> fileDescriptors = Lists.newArrayList();
    try {
      // hostIndexMap is empty going into this routine, but filled when load is complete.
      FileMetadataLoader fmdl = new FileMetadataLoader(new Path(getLocation()), false, Lists.newArrayList(), hostIndexMap, null);
      fmdl.load();
      fileDescriptors = fmdl.getLoadedFds();
    } catch (Exception e) {
      //XXX: need to figure out what to do here, but this is all moving anyway.
      System.out.println("SJC: CAUGHT EXCEPTION " + e);
      e.printStackTrace();
    }
    return ImmutableList.<FileDescriptor>builder().addAll(fileDescriptors).build();
  }
}
