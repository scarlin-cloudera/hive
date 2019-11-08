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
public class TSetJavaLogLevelParams implements org.apache.thrift.TBase<TSetJavaLogLevelParams, TSetJavaLogLevelParams._Fields>, java.io.Serializable, Cloneable, Comparable<TSetJavaLogLevelParams> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TSetJavaLogLevelParams");

  private static final org.apache.thrift.protocol.TField CLASS_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("class_name", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField LOG_LEVEL_FIELD_DESC = new org.apache.thrift.protocol.TField("log_level", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TSetJavaLogLevelParamsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TSetJavaLogLevelParamsTupleSchemeFactory());
  }

  public String class_name; // required
  public String log_level; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CLASS_NAME((short)1, "class_name"),
    LOG_LEVEL((short)2, "log_level");

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
        case 2: // LOG_LEVEL
          return LOG_LEVEL;
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
    tmpMap.put(_Fields.LOG_LEVEL, new org.apache.thrift.meta_data.FieldMetaData("log_level", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TSetJavaLogLevelParams.class, metaDataMap);
  }

  public TSetJavaLogLevelParams() {
  }

  public TSetJavaLogLevelParams(
    String class_name,
    String log_level)
  {
    this();
    this.class_name = class_name;
    this.log_level = log_level;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TSetJavaLogLevelParams(TSetJavaLogLevelParams other) {
    if (other.isSetClass_name()) {
      this.class_name = other.class_name;
    }
    if (other.isSetLog_level()) {
      this.log_level = other.log_level;
    }
  }

  public TSetJavaLogLevelParams deepCopy() {
    return new TSetJavaLogLevelParams(this);
  }

  @Override
  public void clear() {
    this.class_name = null;
    this.log_level = null;
  }

  public String getClass_name() {
    return this.class_name;
  }

  public TSetJavaLogLevelParams setClass_name(String class_name) {
    this.class_name = class_name;
    return this;
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

  public String getLog_level() {
    return this.log_level;
  }

  public TSetJavaLogLevelParams setLog_level(String log_level) {
    this.log_level = log_level;
    return this;
  }

  public void unsetLog_level() {
    this.log_level = null;
  }

  /** Returns true if field log_level is set (has been assigned a value) and false otherwise */
  public boolean isSetLog_level() {
    return this.log_level != null;
  }

  public void setLog_levelIsSet(boolean value) {
    if (!value) {
      this.log_level = null;
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

    case LOG_LEVEL:
      if (value == null) {
        unsetLog_level();
      } else {
        setLog_level((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CLASS_NAME:
      return getClass_name();

    case LOG_LEVEL:
      return getLog_level();

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
    case LOG_LEVEL:
      return isSetLog_level();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TSetJavaLogLevelParams)
      return this.equals((TSetJavaLogLevelParams)that);
    return false;
  }

  public boolean equals(TSetJavaLogLevelParams that) {
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

    boolean this_present_log_level = true && this.isSetLog_level();
    boolean that_present_log_level = true && that.isSetLog_level();
    if (this_present_log_level || that_present_log_level) {
      if (!(this_present_log_level && that_present_log_level))
        return false;
      if (!this.log_level.equals(that.log_level))
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

    boolean present_log_level = true && (isSetLog_level());
    list.add(present_log_level);
    if (present_log_level)
      list.add(log_level);

    return list.hashCode();
  }

  @Override
  public int compareTo(TSetJavaLogLevelParams other) {
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
    lastComparison = Boolean.valueOf(isSetLog_level()).compareTo(other.isSetLog_level());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLog_level()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.log_level, other.log_level);
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
    StringBuilder sb = new StringBuilder("TSetJavaLogLevelParams(");
    boolean first = true;

    sb.append("class_name:");
    if (this.class_name == null) {
      sb.append("null");
    } else {
      sb.append(this.class_name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("log_level:");
    if (this.log_level == null) {
      sb.append("null");
    } else {
      sb.append(this.log_level);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (class_name == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'class_name' was not present! Struct: " + toString());
    }
    if (log_level == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'log_level' was not present! Struct: " + toString());
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

  private static class TSetJavaLogLevelParamsStandardSchemeFactory implements SchemeFactory {
    public TSetJavaLogLevelParamsStandardScheme getScheme() {
      return new TSetJavaLogLevelParamsStandardScheme();
    }
  }

  private static class TSetJavaLogLevelParamsStandardScheme extends StandardScheme<TSetJavaLogLevelParams> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TSetJavaLogLevelParams struct) throws org.apache.thrift.TException {
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
          case 2: // LOG_LEVEL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.log_level = iprot.readString();
              struct.setLog_levelIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TSetJavaLogLevelParams struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.class_name != null) {
        oprot.writeFieldBegin(CLASS_NAME_FIELD_DESC);
        oprot.writeString(struct.class_name);
        oprot.writeFieldEnd();
      }
      if (struct.log_level != null) {
        oprot.writeFieldBegin(LOG_LEVEL_FIELD_DESC);
        oprot.writeString(struct.log_level);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TSetJavaLogLevelParamsTupleSchemeFactory implements SchemeFactory {
    public TSetJavaLogLevelParamsTupleScheme getScheme() {
      return new TSetJavaLogLevelParamsTupleScheme();
    }
  }

  private static class TSetJavaLogLevelParamsTupleScheme extends TupleScheme<TSetJavaLogLevelParams> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TSetJavaLogLevelParams struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.class_name);
      oprot.writeString(struct.log_level);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TSetJavaLogLevelParams struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.class_name = iprot.readString();
      struct.setClass_nameIsSet(true);
      struct.log_level = iprot.readString();
      struct.setLog_levelIsSet(true);
    }
  }

}

