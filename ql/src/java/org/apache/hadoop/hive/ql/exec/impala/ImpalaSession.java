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

import com.google.common.base.Preconditions;
import org.apache.hadoop.hive.ql.metadata.HiveException;
import org.apache.hive.service.rpc.thrift.*;
import org.apache.impala.thrift.ImpalaHiveServer2Service;
import org.apache.impala.thrift.TExecutePlannedStatementReq;
import org.apache.impala.thrift.TExecRequest;


public class ImpalaSession {
    private final ImpalaConnection connection;
    private ImpalaHiveServer2Service.Client client;
    private TSessionHandle sessionHandle;

    ImpalaSession(ImpalaConnection connection) {
        this.connection = connection;
    }

    public TRowSet fetch(TOperationHandle opHandle) throws HiveException {
        Preconditions.checkNotNull(client);
        Preconditions.checkNotNull(sessionHandle);
        TFetchResultsReq req = new TFetchResultsReq();
        TFetchResultsResp resp;
        req.setOperationHandle(opHandle);
        req.setMaxRows(1);

        try {
            resp = client.FetchResults(req);
        } catch (Exception e) {
            throw new HiveException(e);
        }

        // check
        return resp.getResults();
    }

    public TOperationHandle executePlan(String sql, TExecRequest execRequest) throws HiveException {
        Preconditions.checkNotNull(client);
        Preconditions.checkNotNull(sessionHandle);

        TExecuteStatementReq statementRequest = new TExecuteStatementReq();
        statementRequest.setSessionHandle(sessionHandle);
        statementRequest.setRunAsync(true);
        statementRequest.setStatement(sql);

        TExecutePlannedStatementReq req2 = new TExecutePlannedStatementReq();
        req2.setPlan(execRequest);
        req2.setStatementReq(statementRequest);
        TExecuteStatementResp resp;
        try {
            // check
            resp = client.ExecutePlannedStatement(req2);
        } catch (Exception e) {
            throw new HiveException(e);
        }

        return resp.getOperationHandle();
    }

    public TOperationHandle execute(String sql) throws HiveException {
        Preconditions.checkNotNull(client);
        Preconditions.checkNotNull(sessionHandle);

        TExecuteStatementReq req = new TExecuteStatementReq();
        req.setSessionHandle(sessionHandle);
        req.setRunAsync(true);
        req.setStatement(sql);
        TExecuteStatementResp resp;
        try {
            // check
            resp = client.ExecuteStatement(req);
        } catch (Exception e) {
            throw new HiveException(e);
        }

        return resp.getOperationHandle();
    }

    public void open() throws HiveException {
        // we've already called open
        if (client != null) return;

        client = connection.getClient();

        TOpenSessionReq req = new TOpenSessionReq();
        // TODO: replace with real user
        req.setUsername("hive-server2");
        // This is to force Impala to send back row oriented data (Anything less than V6 (above returns columnar)
        req.setClient_protocol(TProtocolVersion.HIVE_CLI_SERVICE_PROTOCOL_V5);

        TOpenSessionResp resp;
        try {
            resp = client.OpenSession(req);
        } catch (Exception e) {
            throw new HiveException(e);
        }
        // TODO: check
        // resp.getStatus()
        sessionHandle = resp.getSessionHandle();
    }

    public void close() {
        Preconditions.checkNotNull(client);
        Preconditions.checkNotNull(sessionHandle);

        TCloseSessionReq req = new TCloseSessionReq();
        req.setSessionHandle(sessionHandle);
        try {
            client.CloseSession(req);
        } catch (Exception e) {
            // ignore errors on close
        }
    }
}
