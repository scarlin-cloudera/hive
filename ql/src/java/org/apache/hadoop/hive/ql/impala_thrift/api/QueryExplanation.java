/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.cloudera.beeswax.api;

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
public class QueryExplanation implements org.apache.thrift.TBase<QueryExplanation, QueryExplanation._Fields>, java.io.Serializable, Cloneable, Comparable<QueryExplanation> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("QueryExplanation");

  private static final org.apache.thrift.protocol.TField TEXTUAL_FIELD_DESC = new org.apache.thrift.protocol.TField("textual", org.apache.thrift.protocol.TType.STRING, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new QueryExplanationStandardSchemeFactory());
    schemes.put(TupleScheme.class, new QueryExplanationTupleSchemeFactory());
  }

  public String textual; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TEXTUAL((short)1, "textual");

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
        case 1: // TEXTUAL
          return TEXTUAL;
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
    tmpMap.put(_Fields.TEXTUAL, new org.apache.thrift.meta_data.FieldMetaData("textual", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(QueryExplanation.class, metaDataMap);
  }

  public QueryExplanation() {
  }

  public QueryExplanation(
    String textual)
  {
    this();
    this.textual = textual;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public QueryExplanation(QueryExplanation other) {
    if (other.isSetTextual()) {
      this.textual = other.textual;
    }
  }

  public QueryExplanation deepCopy() {
    return new QueryExplanation(this);
  }

  @Override
  public void clear() {
    this.textual = null;
  }

  public String getTextual() {
    return this.textual;
  }

  public QueryExplanation setTextual(String textual) {
    this.textual = textual;
    return this;
  }

  public void unsetTextual() {
    this.textual = null;
  }

  /** Returns true if field textual is set (has been assigned a value) and false otherwise */
  public boolean isSetTextual() {
    return this.textual != null;
  }

  public void setTextualIsSet(boolean value) {
    if (!value) {
      this.textual = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TEXTUAL:
      if (value == null) {
        unsetTextual();
      } else {
        setTextual((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TEXTUAL:
      return getTextual();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TEXTUAL:
      return isSetTextual();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof QueryExplanation)
      return this.equals((QueryExplanation)that);
    return false;
  }

  public boolean equals(QueryExplanation that) {
    if (that == null)
      return false;

    boolean this_present_textual = true && this.isSetTextual();
    boolean that_present_textual = true && that.isSetTextual();
    if (this_present_textual || that_present_textual) {
      if (!(this_present_textual && that_present_textual))
        return false;
      if (!this.textual.equals(that.textual))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_textual = true && (isSetTextual());
    list.add(present_textual);
    if (present_textual)
      list.add(textual);

    return list.hashCode();
  }

  @Override
  public int compareTo(QueryExplanation other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTextual()).compareTo(other.isSetTextual());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTextual()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.textual, other.textual);
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
    StringBuilder sb = new StringBuilder("QueryExplanation(");
    boolean first = true;

    sb.append("textual:");
    if (this.textual == null) {
      sb.append("null");
    } else {
      sb.append(this.textual);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
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

  private static class QueryExplanationStandardSchemeFactory implements SchemeFactory {
    public QueryExplanationStandardScheme getScheme() {
      return new QueryExplanationStandardScheme();
    }
  }

  private static class QueryExplanationStandardScheme extends StandardScheme<QueryExplanation> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, QueryExplanation struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TEXTUAL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.textual = iprot.readString();
              struct.setTextualIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, QueryExplanation struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.textual != null) {
        oprot.writeFieldBegin(TEXTUAL_FIELD_DESC);
        oprot.writeString(struct.textual);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class QueryExplanationTupleSchemeFactory implements SchemeFactory {
    public QueryExplanationTupleScheme getScheme() {
      return new QueryExplanationTupleScheme();
    }
  }

  private static class QueryExplanationTupleScheme extends TupleScheme<QueryExplanation> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, QueryExplanation struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTextual()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetTextual()) {
        oprot.writeString(struct.textual);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, QueryExplanation struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.textual = iprot.readString();
        struct.setTextualIsSet(true);
      }
    }
  }

}
