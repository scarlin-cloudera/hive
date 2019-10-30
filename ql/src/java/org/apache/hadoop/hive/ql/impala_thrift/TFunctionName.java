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
public class TFunctionName implements org.apache.thrift.TBase<TFunctionName, TFunctionName._Fields>, java.io.Serializable, Cloneable, Comparable<TFunctionName> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TFunctionName");

  private static final org.apache.thrift.protocol.TField DB_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("db_name", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField FUNCTION_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("function_name", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TFunctionNameStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TFunctionNameTupleSchemeFactory());
  }

  private String db_name; // optional
  private String function_name; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DB_NAME((short)1, "db_name"),
    FUNCTION_NAME((short)2, "function_name");

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
        case 1: // DB_NAME
          return DB_NAME;
        case 2: // FUNCTION_NAME
          return FUNCTION_NAME;
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
  private static final _Fields optionals[] = {_Fields.DB_NAME};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DB_NAME, new org.apache.thrift.meta_data.FieldMetaData("db_name", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.FUNCTION_NAME, new org.apache.thrift.meta_data.FieldMetaData("function_name", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TFunctionName.class, metaDataMap);
  }

  public TFunctionName() {
  }

  public TFunctionName(
    String function_name)
  {
    this();
    this.function_name = function_name;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TFunctionName(TFunctionName other) {
    if (other.isSetDb_name()) {
      this.db_name = other.db_name;
    }
    if (other.isSetFunction_name()) {
      this.function_name = other.function_name;
    }
  }

  public TFunctionName deepCopy() {
    return new TFunctionName(this);
  }

  @Override
  public void clear() {
    this.db_name = null;
    this.function_name = null;
  }

  public String getDb_name() {
    return this.db_name;
  }

  public void setDb_name(String db_name) {
    this.db_name = db_name;
  }

  public void unsetDb_name() {
    this.db_name = null;
  }

  /** Returns true if field db_name is set (has been assigned a value) and false otherwise */
  public boolean isSetDb_name() {
    return this.db_name != null;
  }

  public void setDb_nameIsSet(boolean value) {
    if (!value) {
      this.db_name = null;
    }
  }

  public String getFunction_name() {
    return this.function_name;
  }

  public void setFunction_name(String function_name) {
    this.function_name = function_name;
  }

  public void unsetFunction_name() {
    this.function_name = null;
  }

  /** Returns true if field function_name is set (has been assigned a value) and false otherwise */
  public boolean isSetFunction_name() {
    return this.function_name != null;
  }

  public void setFunction_nameIsSet(boolean value) {
    if (!value) {
      this.function_name = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case DB_NAME:
      if (value == null) {
        unsetDb_name();
      } else {
        setDb_name((String)value);
      }
      break;

    case FUNCTION_NAME:
      if (value == null) {
        unsetFunction_name();
      } else {
        setFunction_name((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case DB_NAME:
      return getDb_name();

    case FUNCTION_NAME:
      return getFunction_name();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case DB_NAME:
      return isSetDb_name();
    case FUNCTION_NAME:
      return isSetFunction_name();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TFunctionName)
      return this.equals((TFunctionName)that);
    return false;
  }

  public boolean equals(TFunctionName that) {
    if (that == null)
      return false;

    boolean this_present_db_name = true && this.isSetDb_name();
    boolean that_present_db_name = true && that.isSetDb_name();
    if (this_present_db_name || that_present_db_name) {
      if (!(this_present_db_name && that_present_db_name))
        return false;
      if (!this.db_name.equals(that.db_name))
        return false;
    }

    boolean this_present_function_name = true && this.isSetFunction_name();
    boolean that_present_function_name = true && that.isSetFunction_name();
    if (this_present_function_name || that_present_function_name) {
      if (!(this_present_function_name && that_present_function_name))
        return false;
      if (!this.function_name.equals(that.function_name))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_db_name = true && (isSetDb_name());
    list.add(present_db_name);
    if (present_db_name)
      list.add(db_name);

    boolean present_function_name = true && (isSetFunction_name());
    list.add(present_function_name);
    if (present_function_name)
      list.add(function_name);

    return list.hashCode();
  }

  @Override
  public int compareTo(TFunctionName other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetDb_name()).compareTo(other.isSetDb_name());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDb_name()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.db_name, other.db_name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFunction_name()).compareTo(other.isSetFunction_name());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFunction_name()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.function_name, other.function_name);
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
    StringBuilder sb = new StringBuilder("TFunctionName(");
    boolean first = true;

    if (isSetDb_name()) {
      sb.append("db_name:");
      if (this.db_name == null) {
        sb.append("null");
      } else {
        sb.append(this.db_name);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("function_name:");
    if (this.function_name == null) {
      sb.append("null");
    } else {
      sb.append(this.function_name);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetFunction_name()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'function_name' is unset! Struct:" + toString());
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

  private static class TFunctionNameStandardSchemeFactory implements SchemeFactory {
    public TFunctionNameStandardScheme getScheme() {
      return new TFunctionNameStandardScheme();
    }
  }

  private static class TFunctionNameStandardScheme extends StandardScheme<TFunctionName> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TFunctionName struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DB_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.db_name = iprot.readString();
              struct.setDb_nameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // FUNCTION_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.function_name = iprot.readString();
              struct.setFunction_nameIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TFunctionName struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.db_name != null) {
        if (struct.isSetDb_name()) {
          oprot.writeFieldBegin(DB_NAME_FIELD_DESC);
          oprot.writeString(struct.db_name);
          oprot.writeFieldEnd();
        }
      }
      if (struct.function_name != null) {
        oprot.writeFieldBegin(FUNCTION_NAME_FIELD_DESC);
        oprot.writeString(struct.function_name);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TFunctionNameTupleSchemeFactory implements SchemeFactory {
    public TFunctionNameTupleScheme getScheme() {
      return new TFunctionNameTupleScheme();
    }
  }

  private static class TFunctionNameTupleScheme extends TupleScheme<TFunctionName> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TFunctionName struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.function_name);
      BitSet optionals = new BitSet();
      if (struct.isSetDb_name()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetDb_name()) {
        oprot.writeString(struct.db_name);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TFunctionName struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.function_name = iprot.readString();
      struct.setFunction_nameIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.db_name = iprot.readString();
        struct.setDb_nameIsSet(true);
      }
    }
  }

}
