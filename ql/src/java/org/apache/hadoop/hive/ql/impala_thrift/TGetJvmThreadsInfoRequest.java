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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2019-11-08")
public class TGetJvmThreadsInfoRequest implements org.apache.thrift.TBase<TGetJvmThreadsInfoRequest, TGetJvmThreadsInfoRequest._Fields>, java.io.Serializable, Cloneable, Comparable<TGetJvmThreadsInfoRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TGetJvmThreadsInfoRequest");

  private static final org.apache.thrift.protocol.TField GET_COMPLETE_INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("get_complete_info", org.apache.thrift.protocol.TType.BOOL, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TGetJvmThreadsInfoRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TGetJvmThreadsInfoRequestTupleSchemeFactory());
  }

  public boolean get_complete_info; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    GET_COMPLETE_INFO((short)1, "get_complete_info");

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
        case 1: // GET_COMPLETE_INFO
          return GET_COMPLETE_INFO;
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
  private static final int __GET_COMPLETE_INFO_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.GET_COMPLETE_INFO, new org.apache.thrift.meta_data.FieldMetaData("get_complete_info", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TGetJvmThreadsInfoRequest.class, metaDataMap);
  }

  public TGetJvmThreadsInfoRequest() {
  }

  public TGetJvmThreadsInfoRequest(
    boolean get_complete_info)
  {
    this();
    this.get_complete_info = get_complete_info;
    setGet_complete_infoIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TGetJvmThreadsInfoRequest(TGetJvmThreadsInfoRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    this.get_complete_info = other.get_complete_info;
  }

  public TGetJvmThreadsInfoRequest deepCopy() {
    return new TGetJvmThreadsInfoRequest(this);
  }

  @Override
  public void clear() {
    setGet_complete_infoIsSet(false);
    this.get_complete_info = false;
  }

  public boolean isGet_complete_info() {
    return this.get_complete_info;
  }

  public TGetJvmThreadsInfoRequest setGet_complete_info(boolean get_complete_info) {
    this.get_complete_info = get_complete_info;
    setGet_complete_infoIsSet(true);
    return this;
  }

  public void unsetGet_complete_info() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __GET_COMPLETE_INFO_ISSET_ID);
  }

  /** Returns true if field get_complete_info is set (has been assigned a value) and false otherwise */
  public boolean isSetGet_complete_info() {
    return EncodingUtils.testBit(__isset_bitfield, __GET_COMPLETE_INFO_ISSET_ID);
  }

  public void setGet_complete_infoIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __GET_COMPLETE_INFO_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case GET_COMPLETE_INFO:
      if (value == null) {
        unsetGet_complete_info();
      } else {
        setGet_complete_info((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case GET_COMPLETE_INFO:
      return isGet_complete_info();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case GET_COMPLETE_INFO:
      return isSetGet_complete_info();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TGetJvmThreadsInfoRequest)
      return this.equals((TGetJvmThreadsInfoRequest)that);
    return false;
  }

  public boolean equals(TGetJvmThreadsInfoRequest that) {
    if (that == null)
      return false;

    boolean this_present_get_complete_info = true;
    boolean that_present_get_complete_info = true;
    if (this_present_get_complete_info || that_present_get_complete_info) {
      if (!(this_present_get_complete_info && that_present_get_complete_info))
        return false;
      if (this.get_complete_info != that.get_complete_info)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_get_complete_info = true;
    list.add(present_get_complete_info);
    if (present_get_complete_info)
      list.add(get_complete_info);

    return list.hashCode();
  }

  @Override
  public int compareTo(TGetJvmThreadsInfoRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetGet_complete_info()).compareTo(other.isSetGet_complete_info());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGet_complete_info()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.get_complete_info, other.get_complete_info);
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
    StringBuilder sb = new StringBuilder("TGetJvmThreadsInfoRequest(");
    boolean first = true;

    sb.append("get_complete_info:");
    sb.append(this.get_complete_info);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'get_complete_info' because it's a primitive and you chose the non-beans generator.
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

  private static class TGetJvmThreadsInfoRequestStandardSchemeFactory implements SchemeFactory {
    public TGetJvmThreadsInfoRequestStandardScheme getScheme() {
      return new TGetJvmThreadsInfoRequestStandardScheme();
    }
  }

  private static class TGetJvmThreadsInfoRequestStandardScheme extends StandardScheme<TGetJvmThreadsInfoRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TGetJvmThreadsInfoRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // GET_COMPLETE_INFO
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.get_complete_info = iprot.readBool();
              struct.setGet_complete_infoIsSet(true);
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

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetGet_complete_info()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'get_complete_info' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TGetJvmThreadsInfoRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(GET_COMPLETE_INFO_FIELD_DESC);
      oprot.writeBool(struct.get_complete_info);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TGetJvmThreadsInfoRequestTupleSchemeFactory implements SchemeFactory {
    public TGetJvmThreadsInfoRequestTupleScheme getScheme() {
      return new TGetJvmThreadsInfoRequestTupleScheme();
    }
  }

  private static class TGetJvmThreadsInfoRequestTupleScheme extends TupleScheme<TGetJvmThreadsInfoRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TGetJvmThreadsInfoRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeBool(struct.get_complete_info);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TGetJvmThreadsInfoRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.get_complete_info = iprot.readBool();
      struct.setGet_complete_infoIsSet(true);
    }
  }

}

