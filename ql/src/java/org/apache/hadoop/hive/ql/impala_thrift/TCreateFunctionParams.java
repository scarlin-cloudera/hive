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
public class TCreateFunctionParams implements org.apache.thrift.TBase<TCreateFunctionParams, TCreateFunctionParams._Fields>, java.io.Serializable, Cloneable, Comparable<TCreateFunctionParams> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TCreateFunctionParams");

  private static final org.apache.thrift.protocol.TField FN_FIELD_DESC = new org.apache.thrift.protocol.TField("fn", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField IF_NOT_EXISTS_FIELD_DESC = new org.apache.thrift.protocol.TField("if_not_exists", org.apache.thrift.protocol.TType.BOOL, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TCreateFunctionParamsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TCreateFunctionParamsTupleSchemeFactory());
  }

  public org.apache.impala.thrift.TFunction fn; // required
  public boolean if_not_exists; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    FN((short)1, "fn"),
    IF_NOT_EXISTS((short)2, "if_not_exists");

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
        case 1: // FN
          return FN;
        case 2: // IF_NOT_EXISTS
          return IF_NOT_EXISTS;
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
  private static final int __IF_NOT_EXISTS_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.IF_NOT_EXISTS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FN, new org.apache.thrift.meta_data.FieldMetaData("fn", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.impala.thrift.TFunction.class)));
    tmpMap.put(_Fields.IF_NOT_EXISTS, new org.apache.thrift.meta_data.FieldMetaData("if_not_exists", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TCreateFunctionParams.class, metaDataMap);
  }

  public TCreateFunctionParams() {
  }

  public TCreateFunctionParams(
    org.apache.impala.thrift.TFunction fn)
  {
    this();
    this.fn = fn;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TCreateFunctionParams(TCreateFunctionParams other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetFn()) {
      this.fn = new org.apache.impala.thrift.TFunction(other.fn);
    }
    this.if_not_exists = other.if_not_exists;
  }

  public TCreateFunctionParams deepCopy() {
    return new TCreateFunctionParams(this);
  }

  @Override
  public void clear() {
    this.fn = null;
    setIf_not_existsIsSet(false);
    this.if_not_exists = false;
  }

  public org.apache.impala.thrift.TFunction getFn() {
    return this.fn;
  }

  public TCreateFunctionParams setFn(org.apache.impala.thrift.TFunction fn) {
    this.fn = fn;
    return this;
  }

  public void unsetFn() {
    this.fn = null;
  }

  /** Returns true if field fn is set (has been assigned a value) and false otherwise */
  public boolean isSetFn() {
    return this.fn != null;
  }

  public void setFnIsSet(boolean value) {
    if (!value) {
      this.fn = null;
    }
  }

  public boolean isIf_not_exists() {
    return this.if_not_exists;
  }

  public TCreateFunctionParams setIf_not_exists(boolean if_not_exists) {
    this.if_not_exists = if_not_exists;
    setIf_not_existsIsSet(true);
    return this;
  }

  public void unsetIf_not_exists() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __IF_NOT_EXISTS_ISSET_ID);
  }

  /** Returns true if field if_not_exists is set (has been assigned a value) and false otherwise */
  public boolean isSetIf_not_exists() {
    return EncodingUtils.testBit(__isset_bitfield, __IF_NOT_EXISTS_ISSET_ID);
  }

  public void setIf_not_existsIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __IF_NOT_EXISTS_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case FN:
      if (value == null) {
        unsetFn();
      } else {
        setFn((org.apache.impala.thrift.TFunction)value);
      }
      break;

    case IF_NOT_EXISTS:
      if (value == null) {
        unsetIf_not_exists();
      } else {
        setIf_not_exists((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case FN:
      return getFn();

    case IF_NOT_EXISTS:
      return isIf_not_exists();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case FN:
      return isSetFn();
    case IF_NOT_EXISTS:
      return isSetIf_not_exists();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TCreateFunctionParams)
      return this.equals((TCreateFunctionParams)that);
    return false;
  }

  public boolean equals(TCreateFunctionParams that) {
    if (that == null)
      return false;

    boolean this_present_fn = true && this.isSetFn();
    boolean that_present_fn = true && that.isSetFn();
    if (this_present_fn || that_present_fn) {
      if (!(this_present_fn && that_present_fn))
        return false;
      if (!this.fn.equals(that.fn))
        return false;
    }

    boolean this_present_if_not_exists = true && this.isSetIf_not_exists();
    boolean that_present_if_not_exists = true && that.isSetIf_not_exists();
    if (this_present_if_not_exists || that_present_if_not_exists) {
      if (!(this_present_if_not_exists && that_present_if_not_exists))
        return false;
      if (this.if_not_exists != that.if_not_exists)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_fn = true && (isSetFn());
    list.add(present_fn);
    if (present_fn)
      list.add(fn);

    boolean present_if_not_exists = true && (isSetIf_not_exists());
    list.add(present_if_not_exists);
    if (present_if_not_exists)
      list.add(if_not_exists);

    return list.hashCode();
  }

  @Override
  public int compareTo(TCreateFunctionParams other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetFn()).compareTo(other.isSetFn());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFn()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fn, other.fn);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIf_not_exists()).compareTo(other.isSetIf_not_exists());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIf_not_exists()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.if_not_exists, other.if_not_exists);
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
    StringBuilder sb = new StringBuilder("TCreateFunctionParams(");
    boolean first = true;

    sb.append("fn:");
    if (this.fn == null) {
      sb.append("null");
    } else {
      sb.append(this.fn);
    }
    first = false;
    if (isSetIf_not_exists()) {
      if (!first) sb.append(", ");
      sb.append("if_not_exists:");
      sb.append(this.if_not_exists);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (fn == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'fn' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (fn != null) {
      fn.validate();
    }
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

  private static class TCreateFunctionParamsStandardSchemeFactory implements SchemeFactory {
    public TCreateFunctionParamsStandardScheme getScheme() {
      return new TCreateFunctionParamsStandardScheme();
    }
  }

  private static class TCreateFunctionParamsStandardScheme extends StandardScheme<TCreateFunctionParams> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TCreateFunctionParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // FN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.fn = new org.apache.impala.thrift.TFunction();
              struct.fn.read(iprot);
              struct.setFnIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // IF_NOT_EXISTS
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.if_not_exists = iprot.readBool();
              struct.setIf_not_existsIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TCreateFunctionParams struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.fn != null) {
        oprot.writeFieldBegin(FN_FIELD_DESC);
        struct.fn.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.isSetIf_not_exists()) {
        oprot.writeFieldBegin(IF_NOT_EXISTS_FIELD_DESC);
        oprot.writeBool(struct.if_not_exists);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TCreateFunctionParamsTupleSchemeFactory implements SchemeFactory {
    public TCreateFunctionParamsTupleScheme getScheme() {
      return new TCreateFunctionParamsTupleScheme();
    }
  }

  private static class TCreateFunctionParamsTupleScheme extends TupleScheme<TCreateFunctionParams> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TCreateFunctionParams struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.fn.write(oprot);
      BitSet optionals = new BitSet();
      if (struct.isSetIf_not_exists()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetIf_not_exists()) {
        oprot.writeBool(struct.if_not_exists);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TCreateFunctionParams struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.fn = new org.apache.impala.thrift.TFunction();
      struct.fn.read(iprot);
      struct.setFnIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.if_not_exists = iprot.readBool();
        struct.setIf_not_existsIsSet(true);
      }
    }
  }

}

