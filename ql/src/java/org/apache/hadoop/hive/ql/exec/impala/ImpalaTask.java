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
package org.apache.hadoop.hive.ql.exec.impala;

import org.apache.hadoop.hive.conf.HiveConf;
import org.apache.hadoop.hive.ql.CompilationOpContext;
import org.apache.hadoop.hive.ql.DriverContext;
import org.apache.hadoop.hive.ql.QueryPlan;
import org.apache.hadoop.hive.ql.QueryState;
import org.apache.hadoop.hive.ql.exec.FetchOperator;
import org.apache.hadoop.hive.ql.exec.FetchTask;
import org.apache.hadoop.hive.ql.exec.Task;
import org.apache.hadoop.hive.ql.plan.api.StageType;
import org.apache.hadoop.hive.ql.plan.impala.ImpalaWork;
import org.apache.hive.service.rpc.thrift.TOperationHandle;

public class ImpalaTask extends Task<ImpalaWork> {
    ImpalaConnection connection;
    ImpalaSession session;

    @Override
    public void shutdown() {
        if (session != null) {
            session.close();
        }

        if (connection != null) {
            connection.close();
        }
    }

    @Override
    public void initialize(QueryState queryState, QueryPlan queryPlan, DriverContext driverContext,
                           CompilationOpContext opContext) {
        super.initialize(queryState, queryPlan, driverContext, opContext);
        // TODO: Move to appropriate place (factory/pool?)
        connection = new ImpalaConnection(queryState.getConf().getVar(HiveConf.ConfVars.HIVE_IMPALA_ADDRESS));
        session = new ImpalaSession(connection);
    }

    @Override
    public int execute(DriverContext driverContext) {
        ImpalaWork work = getWork();
        int rc = 1;
        TOperationHandle opHandle = null;
        try {

            session.open();
            /// XXX only exists for testing purposes
            if (HiveConf.getVar(conf, HiveConf.ConfVars.IMPALA_EXECUTION_MODE).equals("plan")) {
                opHandle = session.executePlan(work.getQuery(), work.getExecRequest());
            } else {
                opHandle = session.execute(work.getQuery());
            }
            rc = 0;
        } catch (Exception e) {
            setException(e);
        }

        if (rc == 0) {
            FetchTask fetch = work.getFetch();
            FetchOperator fetchOp = fetch.getFetchOp();
            if (fetchOp instanceof ImpalaFetchOperator) {
                //  connection.setQueryHandle(qh);
                ImpalaFetchOperator impFetchOp = (ImpalaFetchOperator) fetchOp;
                impFetchOp.setImplalaFetchContext(new ImpalaFetchContext(session, opHandle));
            }
        }
        return rc;
    }

    @Override
    public StageType getType() {
        /// XXX maybe add Impala type?
        return StageType.MAPRED;
    }

    @Override
    public String getName() {
        return "IMPALA";
    }

    /// XXX remove once Impala is a StageType
    @Override
    public String toString() {
        return getId() + ":IMPALA";
    }
}
