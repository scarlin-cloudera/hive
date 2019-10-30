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
public class TLiteralPredicate implements org.apache.thrift.TBase<TLiteralPredicate, TLiteralPredicate._Fields>, java.io.Serializable, Cloneable, Comparable<TLiteralPredicate> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TLiteralPredicate");

  private static final org.apache.thrift.protocol.TField VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("value", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField IS_NULL_FIELD_DESC = new org.apache.thrift.protocol.TField("is_null", org.apache.thrift.protocol.TType.BOOL, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TLiteralPredicateStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TLiteralPredicateTupleSchemeFactory());
  }

  private boolean value; // required
  private boolean is_null; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    VALUE((short)1, "value"),
    IS_NULL((short)2, "is_null");

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
        case 1: // VALUE
          return VALUE;
        case 2: // IS_NULL
          return IS_NULL;
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
  private static final int __VALUE_ISSET_ID = 0;
  private static final int __IS_NULL_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.VALUE, new org.apache.thrift.meta_data.FieldMetaData("value", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.IS_NULL, new org.apache.thrift.meta_data.FieldMetaData("is_null", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TLiteralPredicate.class, metaDataMap);
  }

  public TLiteralPredicate() {
  }

  public TLiteralPredicate(
    boolean value,
    boolean is_null)
  {
    this();
    this.value = value;
    setValueIsSet(true);
    this.is_null = is_null;
    setIs_nullIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TLiteralPredicate(TLiteralPredicate other) {
    __isset_bitfield = other.__isset_bitfield;
    this.value = other.value;
    this.is_null = other.is_null;
  }

  public TLiteralPredicate deepCopy() {
    return new TLiteralPredicate(this);
  }

  @Override
  public void clear() {
    setValueIsSet(false);
    this.value = false;
    setIs_nullIsSet(false);
    this.is_null = false;
  }

  public boolean isValue() {
    return this.value;
  }

  public void setValue(boolean value) {
    this.value = value;
    setValueIsSet(true);
  }

  public void unsetValue() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __VALUE_ISSET_ID);
  }

  /** Returns true if field value is set (has been assigned a value) and false otherwise */
  public boolean isSetValue() {
    return EncodingUtils.testBit(__isset_bitfield, __VALUE_ISSET_ID);
  }

  public void setValueIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __VALUE_ISSET_ID, value);
  }

  public boolean isIs_null() {
    return this.is_null;
  }

  public void setIs_null(boolean is_null) {
    this.is_null = is_null;
    setIs_nullIsSet(true);
  }

  public void unsetIs_null() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __IS_NULL_ISSET_ID);
  }

  /** Returns true if field is_null is set (has been assigned a value) and false otherwise */
  public boolean isSetIs_null() {
    return EncodingUtils.testBit(__isset_bitfield, __IS_NULL_ISSET_ID);
  }

  public void setIs_nullIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __IS_NULL_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case VALUE:
      if (value == null) {
        unsetValue();
      } else {
        setValue((Boolean)value);
      }
      break;

    case IS_NULL:
      if (value == null) {
        unsetIs_null();
      } else {
        setIs_null((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case VALUE:
      return isValue();

    case IS_NULL:
      return isIs_null();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case VALUE:
      return isSetValue();
    case IS_NULL:
      return isSetIs_null();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TLiteralPredicate)
      return this.equals((TLiteralPredicate)that);
    return false;
  }

  public boolean equals(TLiteralPredicate that) {
    if (that == null)
      return false;

    boolean this_present_value = true;
    boolean that_present_value = true;
    if (this_present_value || that_present_value) {
      if (!(this_present_value && that_present_value))
        return false;
      if (this.value != that.value)
        return false;
    }

    boolean this_present_is_null = true;
    boolean that_present_is_null = true;
    if (this_present_is_null || that_present_is_null) {
      if (!(this_present_is_null && that_present_is_null))
        return false;
      if (this.is_null != that.is_null)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_value = true;
    list.add(present_value);
    if (present_value)
      list.add(value);

    boolean present_is_null = true;
    list.add(present_is_null);
    if (present_is_null)
      list.add(is_null);

    return list.hashCode();
  }

  @Override
  public int compareTo(TLiteralPredicate other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetValue()).compareTo(other.isSetValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.value, other.value);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIs_null()).compareTo(other.isSetIs_null());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIs_null()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.is_null, other.is_null);
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
    StringBuilder sb = new StringBuilder("TLiteralPredicate(");
    boolean first = true;

    sb.append("value:");
    sb.append(this.value);
    first = false;
    if (!first) sb.append(", ");
    sb.append("is_null:");
    sb.append(this.is_null);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetValue()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'value' is unset! Struct:" + toString());
    }

    if (!isSetIs_null()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'is_null' is unset! Struct:" + toString());
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

  private static class TLiteralPredicateStandardSchemeFactory implements SchemeFactory {
    public TLiteralPredicateStandardScheme getScheme() {
      return new TLiteralPredicateStandardScheme();
    }
  }

  private static class TLiteralPredicateStandardScheme extends StandardScheme<TLiteralPredicate> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TLiteralPredicate struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // VALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.value = iprot.readBool();
              struct.setValueIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // IS_NULL
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.is_null = iprot.readBool();
              struct.setIs_nullIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TLiteralPredicate struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(VALUE_FIELD_DESC);
      oprot.writeBool(struct.value);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(IS_NULL_FIELD_DESC);
      oprot.writeBool(struct.is_null);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TLiteralPredicateTupleSchemeFactory implements SchemeFactory {
    public TLiteralPredicateTupleScheme getScheme() {
      return new TLiteralPredicateTupleScheme();
    }
  }

  private static class TLiteralPredicateTupleScheme extends TupleScheme<TLiteralPredicate> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TLiteralPredicate struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeBool(struct.value);
      oprot.writeBool(struct.is_null);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TLiteralPredicate struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.value = iprot.readBool();
      struct.setValueIsSet(true);
      struct.is_null = iprot.readBool();
      struct.setIs_nullIsSet(true);
    }
  }

}
