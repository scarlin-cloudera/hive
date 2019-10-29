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

import org.apache.calcite.rel.RelNode;
import org.apache.calcite.rel.type.RelDataTypeField;
import org.apache.hadoop.hive.ql.impalafile.ListMap;
import org.apache.hadoop.hive.ql.optimizer.calcite.reloperators.HiveTableScan;
import org.apache.impala.thrift.TColumn;
import org.apache.impala.thrift.TColumnDescriptor;
import org.apache.impala.thrift.TNetworkAddress;
import org.apache.impala.thrift.TScanRangeSpec;
import org.apache.impala.thrift.TTableDescriptor;


import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class TableDescriptor {

  private final HiveTableScan tableScan_;
  private final int tableId_;
  private static final Logger LOG = LoggerFactory.getLogger(TableDescriptor.class);
  //XXX: 
  // private CatalogObjects.TTableType tableType = TTableType.HDFS_TABLE;
  private final ImmutableList<ColumnDescriptor> columnDescriptors_;

  private final int numClusteringCols_ = 0;

  private final String dbName_;

  private final String tableName_;


  public TableDescriptor (HiveTableScan tableScan, IdGenerator idGen) {
    tableScan_ = tableScan;
    tableId_ = idGen.getNextId();
    //XXX: not sure it is always db.tbl
    assert tableScan_.getTable().getQualifiedName().size() == 2;
    dbName_ = tableScan_.getTable().getQualifiedName().get(0);
    tableName_ = tableScan_.getTable().getQualifiedName().get(1);
    List<ColumnDescriptor> columns = Lists.newArrayList();
    for (RelDataTypeField column : tableScan_.getTable().getRowType().getFieldList()) {
      columns.add(new ColumnDescriptor(column));
    }
    columnDescriptors_ = ImmutableList.<ColumnDescriptor>builder().addAll(columns).build();
  }

  public HiveTableScan getTableScan() {
    return tableScan_;
  }

  public int getTableId() {
    return tableId_;
  }

  public List<TColumn> getTColumns() {
    List<TColumn> columns = Lists.newArrayList();
    for (ColumnDescriptor column : columnDescriptors_) {
      columns.add(column.getTColumn());
    }
    return columns;
  }

  protected int getNumClusteringCols() {
    return numClusteringCols_;
  }

  protected String getTableName() {
    return tableName_;
  }
  
  protected String getDbName() {
    return dbName_;
  }

  abstract public TTableDescriptor toThrift();

  abstract public List<ListMap<TNetworkAddress>> getAllHostIndexes();

  abstract public TScanRangeSpec getScanRangeSpec(ListMap<TNetworkAddress> hostIndexes);

  protected List<TColumnDescriptor> getTColumnDescriptors() {
    List<TColumnDescriptor> columns = Lists.newArrayList();
    for (ColumnDescriptor column : columnDescriptors_) {
      columns.add(column.toThrift());
    }
    return columns;
  }

}
