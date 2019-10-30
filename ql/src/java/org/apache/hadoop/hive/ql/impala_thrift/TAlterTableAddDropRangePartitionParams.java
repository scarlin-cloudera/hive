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
public class TAlterTableAddDropRangePartitionParams implements org.apache.thrift.TBase<TAlterTableAddDropRangePartitionParams, TAlterTableAddDropRangePartitionParams._Fields>, java.io.Serializable, Cloneable, Comparable<TAlterTableAddDropRangePartitionParams> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TAlterTableAddDropRangePartitionParams");

  private static final org.apache.thrift.protocol.TField RANGE_PARTITION_SPEC_FIELD_DESC = new org.apache.thrift.protocol.TField("range_partition_spec", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField IGNORE_ERRORS_FIELD_DESC = new org.apache.thrift.protocol.TField("ignore_errors", org.apache.thrift.protocol.TType.BOOL, (short)2);
  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.I32, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TAlterTableAddDropRangePartitionParamsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TAlterTableAddDropRangePartitionParamsTupleSchemeFactory());
  }

  private org.apache.impala.thrift.TRangePartition range_partition_spec; // required
  private boolean ignore_errors; // required
  private TRangePartitionOperationType type; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    RANGE_PARTITION_SPEC((short)1, "range_partition_spec"),
    IGNORE_ERRORS((short)2, "ignore_errors"),
    /**
     * 
     * @see TRangePartitionOperationType
     */
    TYPE((short)3, "type");

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
        case 1: // RANGE_PARTITION_SPEC
          return RANGE_PARTITION_SPEC;
        case 2: // IGNORE_ERRORS
          return IGNORE_ERRORS;
        case 3: // TYPE
          return TYPE;
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
  private static final int __IGNORE_ERRORS_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RANGE_PARTITION_SPEC, new org.apache.thrift.meta_data.FieldMetaData("range_partition_spec", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.impala.thrift.TRangePartition.class)));
    tmpMap.put(_Fields.IGNORE_ERRORS, new org.apache.thrift.meta_data.FieldMetaData("ignore_errors", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TRangePartitionOperationType.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TAlterTableAddDropRangePartitionParams.class, metaDataMap);
  }

  public TAlterTableAddDropRangePartitionParams() {
  }

  public TAlterTableAddDropRangePartitionParams(
    org.apache.impala.thrift.TRangePartition range_partition_spec,
    boolean ignore_errors,
    TRangePartitionOperationType type)
  {
    this();
    this.range_partition_spec = range_partition_spec;
    this.ignore_errors = ignore_errors;
    setIgnore_errorsIsSet(true);
    this.type = type;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TAlterTableAddDropRangePartitionParams(TAlterTableAddDropRangePartitionParams other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetRange_partition_spec()) {
      this.range_partition_spec = new org.apache.impala.thrift.TRangePartition(other.range_partition_spec);
    }
    this.ignore_errors = other.ignore_errors;
    if (other.isSetType()) {
      this.type = other.type;
    }
  }

  public TAlterTableAddDropRangePartitionParams deepCopy() {
    return new TAlterTableAddDropRangePartitionParams(this);
  }

  @Override
  public void clear() {
    this.range_partition_spec = null;
    setIgnore_errorsIsSet(false);
    this.ignore_errors = false;
    this.type = null;
  }

  public org.apache.impala.thrift.TRangePartition getRange_partition_spec() {
    return this.range_partition_spec;
  }

  public void setRange_partition_spec(org.apache.impala.thrift.TRangePartition range_partition_spec) {
    this.range_partition_spec = range_partition_spec;
  }

  public void unsetRange_partition_spec() {
    this.range_partition_spec = null;
  }

  /** Returns true if field range_partition_spec is set (has been assigned a value) and false otherwise */
  public boolean isSetRange_partition_spec() {
    return this.range_partition_spec != null;
  }

  public void setRange_partition_specIsSet(boolean value) {
    if (!value) {
      this.range_partition_spec = null;
    }
  }

  public boolean isIgnore_errors() {
    return this.ignore_errors;
  }

  public void setIgnore_errors(boolean ignore_errors) {
    this.ignore_errors = ignore_errors;
    setIgnore_errorsIsSet(true);
  }

  public void unsetIgnore_errors() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __IGNORE_ERRORS_ISSET_ID);
  }

  /** Returns true if field ignore_errors is set (has been assigned a value) and false otherwise */
  public boolean isSetIgnore_errors() {
    return EncodingUtils.testBit(__isset_bitfield, __IGNORE_ERRORS_ISSET_ID);
  }

  public void setIgnore_errorsIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __IGNORE_ERRORS_ISSET_ID, value);
  }

  /**
   * 
   * @see TRangePartitionOperationType
   */
  public TRangePartitionOperationType getType() {
    return this.type;
  }

  /**
   * 
   * @see TRangePartitionOperationType
   */
  public void setType(TRangePartitionOperationType type) {
    this.type = type;
  }

  public void unsetType() {
    this.type = null;
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return this.type != null;
  }

  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case RANGE_PARTITION_SPEC:
      if (value == null) {
        unsetRange_partition_spec();
      } else {
        setRange_partition_spec((org.apache.impala.thrift.TRangePartition)value);
      }
      break;

    case IGNORE_ERRORS:
      if (value == null) {
        unsetIgnore_errors();
      } else {
        setIgnore_errors((Boolean)value);
      }
      break;

    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((TRangePartitionOperationType)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case RANGE_PARTITION_SPEC:
      return getRange_partition_spec();

    case IGNORE_ERRORS:
      return isIgnore_errors();

    case TYPE:
      return getType();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case RANGE_PARTITION_SPEC:
      return isSetRange_partition_spec();
    case IGNORE_ERRORS:
      return isSetIgnore_errors();
    case TYPE:
      return isSetType();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TAlterTableAddDropRangePartitionParams)
      return this.equals((TAlterTableAddDropRangePartitionParams)that);
    return false;
  }

  public boolean equals(TAlterTableAddDropRangePartitionParams that) {
    if (that == null)
      return false;

    boolean this_present_range_partition_spec = true && this.isSetRange_partition_spec();
    boolean that_present_range_partition_spec = true && that.isSetRange_partition_spec();
    if (this_present_range_partition_spec || that_present_range_partition_spec) {
      if (!(this_present_range_partition_spec && that_present_range_partition_spec))
        return false;
      if (!this.range_partition_spec.equals(that.range_partition_spec))
        return false;
    }

    boolean this_present_ignore_errors = true;
    boolean that_present_ignore_errors = true;
    if (this_present_ignore_errors || that_present_ignore_errors) {
      if (!(this_present_ignore_errors && that_present_ignore_errors))
        return false;
      if (this.ignore_errors != that.ignore_errors)
        return false;
    }

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_range_partition_spec = true && (isSetRange_partition_spec());
    list.add(present_range_partition_spec);
    if (present_range_partition_spec)
      list.add(range_partition_spec);

    boolean present_ignore_errors = true;
    list.add(present_ignore_errors);
    if (present_ignore_errors)
      list.add(ignore_errors);

    boolean present_type = true && (isSetType());
    list.add(present_type);
    if (present_type)
      list.add(type.getValue());

    return list.hashCode();
  }

  @Override
  public int compareTo(TAlterTableAddDropRangePartitionParams other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetRange_partition_spec()).compareTo(other.isSetRange_partition_spec());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRange_partition_spec()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.range_partition_spec, other.range_partition_spec);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIgnore_errors()).compareTo(other.isSetIgnore_errors());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIgnore_errors()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ignore_errors, other.ignore_errors);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetType()).compareTo(other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, other.type);
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
    StringBuilder sb = new StringBuilder("TAlterTableAddDropRangePartitionParams(");
    boolean first = true;

    sb.append("range_partition_spec:");
    if (this.range_partition_spec == null) {
      sb.append("null");
    } else {
      sb.append(this.range_partition_spec);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("ignore_errors:");
    sb.append(this.ignore_errors);
    first = false;
    if (!first) sb.append(", ");
    sb.append("type:");
    if (this.type == null) {
      sb.append("null");
    } else {
      sb.append(this.type);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetRange_partition_spec()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'range_partition_spec' is unset! Struct:" + toString());
    }

    if (!isSetIgnore_errors()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'ignore_errors' is unset! Struct:" + toString());
    }

    if (!isSetType()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'type' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
    if (range_partition_spec != null) {
      range_partition_spec.validate();
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

  private static class TAlterTableAddDropRangePartitionParamsStandardSchemeFactory implements SchemeFactory {
    public TAlterTableAddDropRangePartitionParamsStandardScheme getScheme() {
      return new TAlterTableAddDropRangePartitionParamsStandardScheme();
    }
  }

  private static class TAlterTableAddDropRangePartitionParamsStandardScheme extends StandardScheme<TAlterTableAddDropRangePartitionParams> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TAlterTableAddDropRangePartitionParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RANGE_PARTITION_SPEC
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.range_partition_spec = new org.apache.impala.thrift.TRangePartition();
              struct.range_partition_spec.read(iprot);
              struct.setRange_partition_specIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // IGNORE_ERRORS
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.ignore_errors = iprot.readBool();
              struct.setIgnore_errorsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.type = org.apache.impala.thrift.TRangePartitionOperationType.findByValue(iprot.readI32());
              struct.setTypeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TAlterTableAddDropRangePartitionParams struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.range_partition_spec != null) {
        oprot.writeFieldBegin(RANGE_PARTITION_SPEC_FIELD_DESC);
        struct.range_partition_spec.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(IGNORE_ERRORS_FIELD_DESC);
      oprot.writeBool(struct.ignore_errors);
      oprot.writeFieldEnd();
      if (struct.type != null) {
        oprot.writeFieldBegin(TYPE_FIELD_DESC);
        oprot.writeI32(struct.type.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TAlterTableAddDropRangePartitionParamsTupleSchemeFactory implements SchemeFactory {
    public TAlterTableAddDropRangePartitionParamsTupleScheme getScheme() {
      return new TAlterTableAddDropRangePartitionParamsTupleScheme();
    }
  }

  private static class TAlterTableAddDropRangePartitionParamsTupleScheme extends TupleScheme<TAlterTableAddDropRangePartitionParams> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TAlterTableAddDropRangePartitionParams struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.range_partition_spec.write(oprot);
      oprot.writeBool(struct.ignore_errors);
      oprot.writeI32(struct.type.getValue());
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TAlterTableAddDropRangePartitionParams struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.range_partition_spec = new org.apache.impala.thrift.TRangePartition();
      struct.range_partition_spec.read(iprot);
      struct.setRange_partition_specIsSet(true);
      struct.ignore_errors = iprot.readBool();
      struct.setIgnore_errorsIsSet(true);
      struct.type = org.apache.impala.thrift.TRangePartitionOperationType.findByValue(iprot.readI32());
      struct.setTypeIsSet(true);
    }
  }

}
