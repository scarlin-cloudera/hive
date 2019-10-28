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
public class TDropDataSourceParams implements org.apache.thrift.TBase<TDropDataSourceParams, TDropDataSourceParams._Fields>, java.io.Serializable, Cloneable, Comparable<TDropDataSourceParams> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDropDataSourceParams");

  private static final org.apache.thrift.protocol.TField DATA_SOURCE_FIELD_DESC = new org.apache.thrift.protocol.TField("data_source", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField IF_EXISTS_FIELD_DESC = new org.apache.thrift.protocol.TField("if_exists", org.apache.thrift.protocol.TType.BOOL, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TDropDataSourceParamsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TDropDataSourceParamsTupleSchemeFactory());
  }

  private String data_source; // required
  private boolean if_exists; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DATA_SOURCE((short)1, "data_source"),
    IF_EXISTS((short)2, "if_exists");

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
        case 1: // DATA_SOURCE
          return DATA_SOURCE;
        case 2: // IF_EXISTS
          return IF_EXISTS;
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
  private static final int __IF_EXISTS_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.IF_EXISTS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DATA_SOURCE, new org.apache.thrift.meta_data.FieldMetaData("data_source", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.IF_EXISTS, new org.apache.thrift.meta_data.FieldMetaData("if_exists", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDropDataSourceParams.class, metaDataMap);
  }

  public TDropDataSourceParams() {
  }

  public TDropDataSourceParams(
    String data_source)
  {
    this();
    this.data_source = data_source;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TDropDataSourceParams(TDropDataSourceParams other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetData_source()) {
      this.data_source = other.data_source;
    }
    this.if_exists = other.if_exists;
  }

  public TDropDataSourceParams deepCopy() {
    return new TDropDataSourceParams(this);
  }

  @Override
  public void clear() {
    this.data_source = null;
    setIf_existsIsSet(false);
    this.if_exists = false;
  }

  public String getData_source() {
    return this.data_source;
  }

  public void setData_source(String data_source) {
    this.data_source = data_source;
  }

  public void unsetData_source() {
    this.data_source = null;
  }

  /** Returns true if field data_source is set (has been assigned a value) and false otherwise */
  public boolean isSetData_source() {
    return this.data_source != null;
  }

  public void setData_sourceIsSet(boolean value) {
    if (!value) {
      this.data_source = null;
    }
  }

  public boolean isIf_exists() {
    return this.if_exists;
  }

  public void setIf_exists(boolean if_exists) {
    this.if_exists = if_exists;
    setIf_existsIsSet(true);
  }

  public void unsetIf_exists() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __IF_EXISTS_ISSET_ID);
  }

  /** Returns true if field if_exists is set (has been assigned a value) and false otherwise */
  public boolean isSetIf_exists() {
    return EncodingUtils.testBit(__isset_bitfield, __IF_EXISTS_ISSET_ID);
  }

  public void setIf_existsIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __IF_EXISTS_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case DATA_SOURCE:
      if (value == null) {
        unsetData_source();
      } else {
        setData_source((String)value);
      }
      break;

    case IF_EXISTS:
      if (value == null) {
        unsetIf_exists();
      } else {
        setIf_exists((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case DATA_SOURCE:
      return getData_source();

    case IF_EXISTS:
      return isIf_exists();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case DATA_SOURCE:
      return isSetData_source();
    case IF_EXISTS:
      return isSetIf_exists();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TDropDataSourceParams)
      return this.equals((TDropDataSourceParams)that);
    return false;
  }

  public boolean equals(TDropDataSourceParams that) {
    if (that == null)
      return false;

    boolean this_present_data_source = true && this.isSetData_source();
    boolean that_present_data_source = true && that.isSetData_source();
    if (this_present_data_source || that_present_data_source) {
      if (!(this_present_data_source && that_present_data_source))
        return false;
      if (!this.data_source.equals(that.data_source))
        return false;
    }

    boolean this_present_if_exists = true && this.isSetIf_exists();
    boolean that_present_if_exists = true && that.isSetIf_exists();
    if (this_present_if_exists || that_present_if_exists) {
      if (!(this_present_if_exists && that_present_if_exists))
        return false;
      if (this.if_exists != that.if_exists)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_data_source = true && (isSetData_source());
    list.add(present_data_source);
    if (present_data_source)
      list.add(data_source);

    boolean present_if_exists = true && (isSetIf_exists());
    list.add(present_if_exists);
    if (present_if_exists)
      list.add(if_exists);

    return list.hashCode();
  }

  @Override
  public int compareTo(TDropDataSourceParams other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetData_source()).compareTo(other.isSetData_source());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetData_source()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.data_source, other.data_source);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIf_exists()).compareTo(other.isSetIf_exists());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIf_exists()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.if_exists, other.if_exists);
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
    StringBuilder sb = new StringBuilder("TDropDataSourceParams(");
    boolean first = true;

    sb.append("data_source:");
    if (this.data_source == null) {
      sb.append("null");
    } else {
      sb.append(this.data_source);
    }
    first = false;
    if (isSetIf_exists()) {
      if (!first) sb.append(", ");
      sb.append("if_exists:");
      sb.append(this.if_exists);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetData_source()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'data_source' is unset! Struct:" + toString());
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TDropDataSourceParamsStandardSchemeFactory implements SchemeFactory {
    public TDropDataSourceParamsStandardScheme getScheme() {
      return new TDropDataSourceParamsStandardScheme();
    }
  }

  private static class TDropDataSourceParamsStandardScheme extends StandardScheme<TDropDataSourceParams> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TDropDataSourceParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DATA_SOURCE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.data_source = iprot.readString();
              struct.setData_sourceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // IF_EXISTS
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.if_exists = iprot.readBool();
              struct.setIf_existsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TDropDataSourceParams struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.data_source != null) {
        oprot.writeFieldBegin(DATA_SOURCE_FIELD_DESC);
        oprot.writeString(struct.data_source);
        oprot.writeFieldEnd();
      }
      if (struct.isSetIf_exists()) {
        oprot.writeFieldBegin(IF_EXISTS_FIELD_DESC);
        oprot.writeBool(struct.if_exists);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TDropDataSourceParamsTupleSchemeFactory implements SchemeFactory {
    public TDropDataSourceParamsTupleScheme getScheme() {
      return new TDropDataSourceParamsTupleScheme();
    }
  }

  private static class TDropDataSourceParamsTupleScheme extends TupleScheme<TDropDataSourceParams> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TDropDataSourceParams struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.data_source);
      BitSet optionals = new BitSet();
      if (struct.isSetIf_exists()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetIf_exists()) {
        oprot.writeBool(struct.if_exists);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TDropDataSourceParams struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.data_source = iprot.readString();
      struct.setData_sourceIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.if_exists = iprot.readBool();
        struct.setIf_existsIsSet(true);
      }
    }
  }

}

