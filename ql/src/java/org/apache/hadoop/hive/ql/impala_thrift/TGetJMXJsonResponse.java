/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.impala.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)")
public class TGetJMXJsonResponse implements org.apache.thrift.TBase<TGetJMXJsonResponse, TGetJMXJsonResponse._Fields>, java.io.Serializable, Cloneable, Comparable<TGetJMXJsonResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TGetJMXJsonResponse");

  private static final org.apache.thrift.protocol.TField JMX_JSON_FIELD_DESC = new org.apache.thrift.protocol.TField("jmx_json", org.apache.thrift.protocol.TType.STRING, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TGetJMXJsonResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TGetJMXJsonResponseTupleSchemeFactory());
  }

  private String jmx_json; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    JMX_JSON((short)1, "jmx_json");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // JMX_JSON
          return JMX_JSON;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.JMX_JSON, new org.apache.thrift.meta_data.FieldMetaData("jmx_json", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TGetJMXJsonResponse.class, metaDataMap);
  }

  public TGetJMXJsonResponse() {
  }

  public TGetJMXJsonResponse(
    String jmx_json)
  {
    this();
    this.jmx_json = jmx_json;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TGetJMXJsonResponse(TGetJMXJsonResponse other) {
    if (other.isSetJmx_json()) {
      this.jmx_json = other.jmx_json;
    }
  }

  public TGetJMXJsonResponse deepCopy() {
    return new TGetJMXJsonResponse(this);
  }

  @Override
  public void clear() {
    this.jmx_json = null;
  }

  public String getJmx_json() {
    return this.jmx_json;
  }

  public void setJmx_json(String jmx_json) {
    this.jmx_json = jmx_json;
  }

  public void unsetJmx_json() {
    this.jmx_json = null;
  }

  /** Returns true if field jmx_json is set (has been assigned a value) and false otherwise */
  public boolean isSetJmx_json() {
    return this.jmx_json != null;
  }

  public void setJmx_jsonIsSet(boolean value) {
    if (!value) {
      this.jmx_json = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case JMX_JSON:
      if (value == null) {
        unsetJmx_json();
      } else {
        setJmx_json((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case JMX_JSON:
      return getJmx_json();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case JMX_JSON:
      return isSetJmx_json();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TGetJMXJsonResponse)
      return this.equals((TGetJMXJsonResponse)that);
    return false;
  }

  public boolean equals(TGetJMXJsonResponse that) {
    if (that == null)
      return false;

    boolean this_present_jmx_json = true && this.isSetJmx_json();
    boolean that_present_jmx_json = true && that.isSetJmx_json();
    if (this_present_jmx_json || that_present_jmx_json) {
      if (!(this_present_jmx_json && that_present_jmx_json))
        return false;
      if (!this.jmx_json.equals(that.jmx_json))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_jmx_json = true && (isSetJmx_json());
    list.add(present_jmx_json);
    if (present_jmx_json)
      list.add(jmx_json);

    return list.hashCode();
  }

  @Override
  public int compareTo(TGetJMXJsonResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetJmx_json()).compareTo(other.isSetJmx_json());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJmx_json()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.jmx_json, other.jmx_json);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TGetJMXJsonResponse(");
    boolean first = true;

    sb.append("jmx_json:");
    if (this.jmx_json == null) {
      sb.append("null");
    } else {
      sb.append(this.jmx_json);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetJmx_json()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'jmx_json' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TGetJMXJsonResponseStandardSchemeFactory implements SchemeFactory {
    public TGetJMXJsonResponseStandardScheme getScheme() {
      return new TGetJMXJsonResponseStandardScheme();
    }
  }

  private static class TGetJMXJsonResponseStandardScheme extends StandardScheme<TGetJMXJsonResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TGetJMXJsonResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // JMX_JSON
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.jmx_json = iprot.readString();
              struct.setJmx_jsonIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TGetJMXJsonResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.jmx_json != null) {
        oprot.writeFieldBegin(JMX_JSON_FIELD_DESC);
        oprot.writeString(struct.jmx_json);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TGetJMXJsonResponseTupleSchemeFactory implements SchemeFactory {
    public TGetJMXJsonResponseTupleScheme getScheme() {
      return new TGetJMXJsonResponseTupleScheme();
    }
  }

  private static class TGetJMXJsonResponseTupleScheme extends TupleScheme<TGetJMXJsonResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TGetJMXJsonResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.jmx_json);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TGetJMXJsonResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.jmx_json = iprot.readString();
      struct.setJmx_jsonIsSet(true);
    }
  }

}

