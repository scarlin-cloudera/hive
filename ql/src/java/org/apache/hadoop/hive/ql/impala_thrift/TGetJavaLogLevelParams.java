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
public class TGetJavaLogLevelParams implements org.apache.thrift.TBase<TGetJavaLogLevelParams, TGetJavaLogLevelParams._Fields>, java.io.Serializable, Cloneable, Comparable<TGetJavaLogLevelParams> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TGetJavaLogLevelParams");

  private static final org.apache.thrift.protocol.TField CLASS_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("class_name", org.apache.thrift.protocol.TType.STRING, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TGetJavaLogLevelParamsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TGetJavaLogLevelParamsTupleSchemeFactory());
  }

  private String class_name; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CLASS_NAME((short)1, "class_name");

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
        case 1: // CLASS_NAME
          return CLASS_NAME;
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
    tmpMap.put(_Fields.CLASS_NAME, new org.apache.thrift.meta_data.FieldMetaData("class_name", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TGetJavaLogLevelParams.class, metaDataMap);
  }

  public TGetJavaLogLevelParams() {
  }

  public TGetJavaLogLevelParams(
    String class_name)
  {
    this();
    this.class_name = class_name;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TGetJavaLogLevelParams(TGetJavaLogLevelParams other) {
    if (other.isSetClass_name()) {
      this.class_name = other.class_name;
    }
  }

  public TGetJavaLogLevelParams deepCopy() {
    return new TGetJavaLogLevelParams(this);
  }

  @Override
  public void clear() {
    this.class_name = null;
  }

  public String getClass_name() {
    return this.class_name;
  }

  public void setClass_name(String class_name) {
    this.class_name = class_name;
  }

  public void unsetClass_name() {
    this.class_name = null;
  }

  /** Returns true if field class_name is set (has been assigned a value) and false otherwise */
  public boolean isSetClass_name() {
    return this.class_name != null;
  }

  public void setClass_nameIsSet(boolean value) {
    if (!value) {
      this.class_name = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CLASS_NAME:
      if (value == null) {
        unsetClass_name();
      } else {
        setClass_name((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CLASS_NAME:
      return getClass_name();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CLASS_NAME:
      return isSetClass_name();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TGetJavaLogLevelParams)
      return this.equals((TGetJavaLogLevelParams)that);
    return false;
  }

  public boolean equals(TGetJavaLogLevelParams that) {
    if (that == null)
      return false;

    boolean this_present_class_name = true && this.isSetClass_name();
    boolean that_present_class_name = true && that.isSetClass_name();
    if (this_present_class_name || that_present_class_name) {
      if (!(this_present_class_name && that_present_class_name))
        return false;
      if (!this.class_name.equals(that.class_name))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_class_name = true && (isSetClass_name());
    list.add(present_class_name);
    if (present_class_name)
      list.add(class_name);

    return list.hashCode();
  }

  @Override
  public int compareTo(TGetJavaLogLevelParams other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetClass_name()).compareTo(other.isSetClass_name());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetClass_name()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.class_name, other.class_name);
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
    StringBuilder sb = new StringBuilder("TGetJavaLogLevelParams(");
    boolean first = true;

    sb.append("class_name:");
    if (this.class_name == null) {
      sb.append("null");
    } else {
      sb.append(this.class_name);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetClass_name()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'class_name' is unset! Struct:" + toString());
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

  private static class TGetJavaLogLevelParamsStandardSchemeFactory implements SchemeFactory {
    public TGetJavaLogLevelParamsStandardScheme getScheme() {
      return new TGetJavaLogLevelParamsStandardScheme();
    }
  }

  private static class TGetJavaLogLevelParamsStandardScheme extends StandardScheme<TGetJavaLogLevelParams> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TGetJavaLogLevelParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CLASS_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.class_name = iprot.readString();
              struct.setClass_nameIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TGetJavaLogLevelParams struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.class_name != null) {
        oprot.writeFieldBegin(CLASS_NAME_FIELD_DESC);
        oprot.writeString(struct.class_name);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TGetJavaLogLevelParamsTupleSchemeFactory implements SchemeFactory {
    public TGetJavaLogLevelParamsTupleScheme getScheme() {
      return new TGetJavaLogLevelParamsTupleScheme();
    }
  }

  private static class TGetJavaLogLevelParamsTupleScheme extends TupleScheme<TGetJavaLogLevelParams> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TGetJavaLogLevelParams struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.class_name);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TGetJavaLogLevelParams struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.class_name = iprot.readString();
      struct.setClass_nameIsSet(true);
    }
  }

}
