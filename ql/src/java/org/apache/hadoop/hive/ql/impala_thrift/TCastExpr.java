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
public class TCastExpr implements org.apache.thrift.TBase<TCastExpr, TCastExpr._Fields>, java.io.Serializable, Cloneable, Comparable<TCastExpr> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TCastExpr");

  private static final org.apache.thrift.protocol.TField CAST_FORMAT_FIELD_DESC = new org.apache.thrift.protocol.TField("cast_format", org.apache.thrift.protocol.TType.STRING, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TCastExprStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TCastExprTupleSchemeFactory());
  }

  private String cast_format; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CAST_FORMAT((short)1, "cast_format");

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
        case 1: // CAST_FORMAT
          return CAST_FORMAT;
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
    tmpMap.put(_Fields.CAST_FORMAT, new org.apache.thrift.meta_data.FieldMetaData("cast_format", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TCastExpr.class, metaDataMap);
  }

  public TCastExpr() {
  }

  public TCastExpr(
    String cast_format)
  {
    this();
    this.cast_format = cast_format;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TCastExpr(TCastExpr other) {
    if (other.isSetCast_format()) {
      this.cast_format = other.cast_format;
    }
  }

  public TCastExpr deepCopy() {
    return new TCastExpr(this);
  }

  @Override
  public void clear() {
    this.cast_format = null;
  }

  public String getCast_format() {
    return this.cast_format;
  }

  public void setCast_format(String cast_format) {
    this.cast_format = cast_format;
  }

  public void unsetCast_format() {
    this.cast_format = null;
  }

  /** Returns true if field cast_format is set (has been assigned a value) and false otherwise */
  public boolean isSetCast_format() {
    return this.cast_format != null;
  }

  public void setCast_formatIsSet(boolean value) {
    if (!value) {
      this.cast_format = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CAST_FORMAT:
      if (value == null) {
        unsetCast_format();
      } else {
        setCast_format((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CAST_FORMAT:
      return getCast_format();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CAST_FORMAT:
      return isSetCast_format();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TCastExpr)
      return this.equals((TCastExpr)that);
    return false;
  }

  public boolean equals(TCastExpr that) {
    if (that == null)
      return false;

    boolean this_present_cast_format = true && this.isSetCast_format();
    boolean that_present_cast_format = true && that.isSetCast_format();
    if (this_present_cast_format || that_present_cast_format) {
      if (!(this_present_cast_format && that_present_cast_format))
        return false;
      if (!this.cast_format.equals(that.cast_format))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_cast_format = true && (isSetCast_format());
    list.add(present_cast_format);
    if (present_cast_format)
      list.add(cast_format);

    return list.hashCode();
  }

  @Override
  public int compareTo(TCastExpr other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetCast_format()).compareTo(other.isSetCast_format());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCast_format()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cast_format, other.cast_format);
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
    StringBuilder sb = new StringBuilder("TCastExpr(");
    boolean first = true;

    sb.append("cast_format:");
    if (this.cast_format == null) {
      sb.append("null");
    } else {
      sb.append(this.cast_format);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetCast_format()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'cast_format' is unset! Struct:" + toString());
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

  private static class TCastExprStandardSchemeFactory implements SchemeFactory {
    public TCastExprStandardScheme getScheme() {
      return new TCastExprStandardScheme();
    }
  }

  private static class TCastExprStandardScheme extends StandardScheme<TCastExpr> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TCastExpr struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CAST_FORMAT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.cast_format = iprot.readString();
              struct.setCast_formatIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TCastExpr struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.cast_format != null) {
        oprot.writeFieldBegin(CAST_FORMAT_FIELD_DESC);
        oprot.writeString(struct.cast_format);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TCastExprTupleSchemeFactory implements SchemeFactory {
    public TCastExprTupleScheme getScheme() {
      return new TCastExprTupleScheme();
    }
  }

  private static class TCastExprTupleScheme extends TupleScheme<TCastExpr> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TCastExpr struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.cast_format);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TCastExpr struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.cast_format = iprot.readString();
      struct.setCast_formatIsSet(true);
    }
  }

}
