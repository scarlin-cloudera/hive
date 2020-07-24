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

package org.apache.hadoop.hive.ql.exec;

import org.apache.hadoop.hive.ql.udf.generic.GenericUDF;
import org.apache.hadoop.hive.ql.udf.generic.GenericUDTF;
import org.apache.hadoop.hive.ql.udf.ptf.TableFunctionResolver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * HiveFunctionInfo.
 *
 */
public class HiveFunctionInfo extends FunctionInfo {

  static final Logger LOG = LoggerFactory.getLogger(
      HiveFunctionInfo.class.getName());

  public HiveFunctionInfo(FunctionInfo functionInfo) {
    super(functionInfo.getFunctionType(), functionInfo.getDisplayName(),
        functionInfo.getTableFunctionResolver(), functionInfo.getGenericUDF(),
	functionInfo.getGenericUDTF(), functionInfo.getGenericUDAFResolver(),
	functionInfo.getClassName(), functionInfo.getResources());
  }

  @Override
  public GenericUDF getGenericUDF() {
    return genericUDF;
  }

  @Override
  public GenericUDTF getGenericUDTF() {
    return genericUDTF;
  }
}
