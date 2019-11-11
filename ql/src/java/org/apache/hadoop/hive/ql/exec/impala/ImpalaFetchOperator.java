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

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hive.metastore.api.FieldSchema;
import org.apache.hadoop.hive.ql.exec.FetchOperator;
import org.apache.hadoop.hive.ql.exec.Operator;
import org.apache.hadoop.hive.ql.metadata.HiveException;
import org.apache.hadoop.hive.ql.metadata.VirtualColumn;
import org.apache.hadoop.hive.ql.plan.FetchWork;
import org.apache.hadoop.hive.serde2.objectinspector.*;
import org.apache.hadoop.hive.serde2.objectinspector.primitive.PrimitiveObjectInspectorFactory;
import org.apache.hadoop.hive.serde2.typeinfo.PrimitiveTypeInfo;
import org.apache.hadoop.hive.serde2.typeinfo.TypeInfoFactory;
import org.apache.hadoop.mapred.JobConf;
import org.apache.hive.service.rpc.thrift.TRowSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.hadoop.hive.metastore.api.Schema;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class ImpalaFetchOperator extends FetchOperator {
    private transient final InspectableObject inspectable = new InspectableObject();
    private StructObjectInspector outputInspector = null;
    private StructObjectInspector impalaResultInspector = null;
    private static final Logger LOG = LoggerFactory.getLogger(ImpalaFetchOperator.class);

    private ImpalaFetchContext context;

    public ImpalaFetchOperator(FetchWork work, JobConf job, Operator<?> operator,
                               List<VirtualColumn> vcCols, Schema resultSchema) throws HiveException {
        super(work, job, operator, vcCols);
        ObjectInspector[] impalaInspectors = new ObjectInspector[resultSchema.getFieldSchemasSize()];
        ObjectInspector[] inspectors = new ObjectInspector[resultSchema.getFieldSchemasSize()];
        String[] names = new String[resultSchema.getFieldSchemasSize()];

        int i = 0;
        for (FieldSchema schema: resultSchema.getFieldSchemas()) {
            names[i] = schema.getName();

            PrimitiveTypeInfo primativeType = TypeInfoFactory.getPrimitiveTypeInfo(schema.getType());

            switch (primativeType.getPrimitiveCategory()) {
                case INT:
                    impalaInspectors[i] = new ImpalaThriftIntInspector();
                    break;
                case STRING:
                    impalaInspectors[i] = new ImpalaThriftStringInspector();
                    break;
                default:
                    throw new HiveException("Unhandled primitive type " + primativeType.getPrimitiveCategory());
            }
            inspectors[i++] = PrimitiveObjectInspectorFactory.getPrimitiveWritableObjectInspector(
                    TypeInfoFactory.getPrimitiveTypeInfo(schema.getType()));
        }
        impalaResultInspector = new ImpalaResultInspector(Arrays.asList(names), Arrays.asList(impalaInspectors));
        outputInspector =  ObjectInspectorFactory.getStandardStructObjectInspector(Arrays.asList(names), Arrays.asList(inspectors));
    }

    public void setValidWriteIdList(String writeIdStr) {
        LOG.info("setValidWriteIdList");
    }

    public FetchWork getWork() {
        return super.getWork();
    }

    public void setWork(FetchWork work) {
        super.setWork(work);
    }

    public boolean pushRow() throws IOException, HiveException {
        InspectableObject row = getNextRow();
        if (row != null) {
            pushRow(row);
            flushRow();
            return true;
        }
        return false;
    }

    protected void pushRow(InspectableObject row) throws HiveException {
        super.pushRow(row);
    }

    protected void flushRow() throws HiveException {
        super.flushRow();
    }

    public InspectableObject getNextRow() throws IOException {
        TRowSet rowSet = null;
        try {
            rowSet = context.getSession().fetch(context.getOperationHandle());
        } catch (Exception e) {
            // XXX re-throw
            return null;
        }

        if (rowSet != null) {
            if (rowSet.getRows().size() <= 0) return null;

            Object convertedValue = ObjectInspectorConverters.getConverter(impalaResultInspector, outputInspector).convert(rowSet.getRows().get(0));
            inspectable.oi = outputInspector;
            inspectable.o = convertedValue; //rowSet.getRows().get(0);
        }

        return inspectable;
    }

    public void clearFetchContext() throws HiveException {
        LOG.info("clearFetchContext");
    }

    public void closeOperator() throws HiveException {
        LOG.info("closeOperator");
    }

    public ObjectInspector getOutputObjectInspector() {
        return outputInspector;
    }

    public Configuration getJobConf() {
        return super.getJobConf();
    }

    public void setImplalaFetchContext(ImpalaFetchContext context) {
        this.context = context;
    }
}