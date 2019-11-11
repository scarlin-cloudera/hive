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

import org.apache.hadoop.hive.serde2.BaseStructObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.StructField;
import org.apache.hive.service.rpc.thrift.*;

import java.util.List;

class ImpalaResultInspector extends BaseStructObjectInspector {
    static private Boolean getBooleanValue(TBoolValue tBoolValue) {
        if (tBoolValue.isSetValue()) {
            return tBoolValue.isValue();
        }
        return null;
    }
    static private Byte getByteValue(TByteValue tByteValue) {
        if (tByteValue.isSetValue()) {
            return tByteValue.getValue();
        }
        return null;
    }

    static private Short getShortValue(TI16Value tI16Value) {
        if (tI16Value.isSetValue()) {
            return tI16Value.getValue();
        }
        return null;
    }

    static private Integer getIntegerValue(TI32Value tI32Value) {
        if (tI32Value.isSetValue()) {
            return tI32Value.getValue();
        }
        return null;
    }

    static private Long getLongValue(TI64Value tI64Value) {
        if (tI64Value.isSetValue()) {
            return tI64Value.getValue();
        }
        return null;
    }

    static private Double getDoubleValue(TDoubleValue tDoubleValue) {
        if (tDoubleValue.isSetValue()) {
            return tDoubleValue.getValue();
        }
        return null;
    }

    static private String getStringValue(TStringValue tStringValue) {
        if (tStringValue.isSetValue()) {
            return tStringValue.getValue();
        }
        return null;
    }

    static public Object toColumnValue(TColumnValue value) {
        TColumnValue._Fields field = value.getSetField();
        switch (field) {
            case BOOL_VAL:
                return getBooleanValue(value.getBoolVal());
            case BYTE_VAL:
                return getByteValue(value.getByteVal());
            case I16_VAL:
                return getShortValue(value.getI16Val());
            case I32_VAL:
                return getIntegerValue(value.getI32Val());
            case I64_VAL:
                return getLongValue(value.getI64Val());
            case DOUBLE_VAL:
                return getDoubleValue(value.getDoubleVal());
            case STRING_VAL:
                return getStringValue(value.getStringVal());
        }
        throw new IllegalArgumentException("never");
    }

    public ImpalaResultInspector(List<String> structFieldNames,
                                 List<ObjectInspector> structFieldObjectInspectors) {
        super(structFieldNames, structFieldObjectInspectors);
    }

    public ImpalaResultInspector(List<String> structFieldNames,
                                 List<ObjectInspector> structFieldObjectInspectors,
                                 List<String> structFieldComments) {
        super(structFieldNames, structFieldObjectInspectors, structFieldComments);
    }

    @Override
    public Object getStructFieldData(Object data, StructField fieldRef) {
        if (data == null) {
            return null;
        }
        TRow row = (TRow) data;
        MyField f = (MyField) fieldRef;

        int fieldID = f.getFieldID();
        assert (fieldID >= 0 && fieldID < fields.size());

        return row.getColVals().get(fieldID);
    }

    @Override
    public List<Object> getStructFieldsDataAsList(Object data) {
        return null;
    }
}