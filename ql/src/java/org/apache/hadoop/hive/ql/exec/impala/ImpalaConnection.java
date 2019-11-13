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

import org.apache.hadoop.hive.ql.metadata.HiveException;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransportFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.impala.thrift.ImpalaHiveServer2Service;

class ImpalaConnection {
    private static transient final Logger LOG = LoggerFactory.getLogger(ImpalaConnection.class);
    static private final TBinaryProtocol.Factory protocolFactory = new TBinaryProtocol.Factory();;
    static private final TTransportFactory transportFactory =  new TTransportFactory();;
    private final TSocket socket;
    private boolean isOpen = false;
    private String address;

    ImpalaConnection(String address) {
        String[] addr = address.split(":");
        this.address = address;
        this.socket = new TSocket(addr[0], Integer.parseInt(addr[1]));
    }

    public void open() throws TException {
        socket.open();
        isOpen = true;
    }

    public void close() {
        socket.close();
        isOpen = false;
    }

    // XXX: Maybe move?
    ImpalaHiveServer2Service.Client getClient() throws HiveException {
        try {
            if (!isOpen) socket.open();
        } catch (Exception e) {
            throw new HiveException("Failed to connect to impala at address (" + address +")", e);
        }
        return new ImpalaHiveServer2Service.Client(protocolFactory.getProtocol(transportFactory.getTransport(socket)));
    }

}