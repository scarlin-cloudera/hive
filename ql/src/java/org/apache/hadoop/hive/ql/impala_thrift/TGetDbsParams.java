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
public class TGetDbsParams implements org.apache.thrift.TBase<TGetDbsParams, TGetDbsParams._Fields>, java.io.Serializable, Cloneable, Comparable<TGetDbsParams> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TGetDbsParams");

  private static final org.apache.thrift.protocol.TField PATTERN_FIELD_DESC = new org.apache.thrift.protocol.TField("pattern", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField SESSION_FIELD_DESC = new org.apache.thrift.protocol.TField("session", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TGetDbsParamsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TGetDbsParamsTupleSchemeFactory());
  }

  private String pattern; // optional
  private org.apache.impala.thrift.TSessionState session; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PATTERN((short)1, "pattern"),
    SESSION((short)2, "session");

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
        case 1: // PATTERN
          return PATTERN;
        case 2: // SESSION
          return SESSION;
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
  private static final _Fields optionals[] = {_Fields.PATTERN,_Fields.SESSION};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PATTERN, new org.apache.thrift.meta_data.FieldMetaData("pattern", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SESSION, new org.apache.thrift.meta_data.FieldMetaData("session", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.impala.thrift.TSessionState.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TGetDbsParams.class, metaDataMap);
  }

  public TGetDbsParams() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TGetDbsParams(TGetDbsParams other) {
    if (other.isSetPattern()) {
      this.pattern = other.pattern;
    }
    if (other.isSetSession()) {
      this.session = new org.apache.impala.thrift.TSessionState(other.session);
    }
  }

  public TGetDbsParams deepCopy() {
    return new TGetDbsParams(this);
  }

  @Override
  public void clear() {
    this.pattern = null;
    this.session = null;
  }

  public String getPattern() {
    return this.pattern;
  }

  public void setPattern(String pattern) {
    this.pattern = pattern;
  }

  public void unsetPattern() {
    this.pattern = null;
  }

  /** Returns true if field pattern is set (has been assigned a value) and false otherwise */
  public boolean isSetPattern() {
    return this.pattern != null;
  }

  public void setPatternIsSet(boolean value) {
    if (!value) {
      this.pattern = null;
    }
  }

  public org.apache.impala.thrift.TSessionState getSession() {
    return this.session;
  }

  public void setSession(org.apache.impala.thrift.TSessionState session) {
    this.session = session;
  }

  public void unsetSession() {
    this.session = null;
  }

  /** Returns true if field session is set (has been assigned a value) and false otherwise */
  public boolean isSetSession() {
    return this.session != null;
  }

  public void setSessionIsSet(boolean value) {
    if (!value) {
      this.session = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PATTERN:
      if (value == null) {
        unsetPattern();
      } else {
        setPattern((String)value);
      }
      break;

    case SESSION:
      if (value == null) {
        unsetSession();
      } else {
        setSession((org.apache.impala.thrift.TSessionState)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PATTERN:
      return getPattern();

    case SESSION:
      return getSession();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PATTERN:
      return isSetPattern();
    case SESSION:
      return isSetSession();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TGetDbsParams)
      return this.equals((TGetDbsParams)that);
    return false;
  }

  public boolean equals(TGetDbsParams that) {
    if (that == null)
      return false;

    boolean this_present_pattern = true && this.isSetPattern();
    boolean that_present_pattern = true && that.isSetPattern();
    if (this_present_pattern || that_present_pattern) {
      if (!(this_present_pattern && that_present_pattern))
        return false;
      if (!this.pattern.equals(that.pattern))
        return false;
    }

    boolean this_present_session = true && this.isSetSession();
    boolean that_present_session = true && that.isSetSession();
    if (this_present_session || that_present_session) {
      if (!(this_present_session && that_present_session))
        return false;
      if (!this.session.equals(that.session))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_pattern = true && (isSetPattern());
    list.add(present_pattern);
    if (present_pattern)
      list.add(pattern);

    boolean present_session = true && (isSetSession());
    list.add(present_session);
    if (present_session)
      list.add(session);

    return list.hashCode();
  }

  @Override
  public int compareTo(TGetDbsParams other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetPattern()).compareTo(other.isSetPattern());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPattern()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.pattern, other.pattern);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSession()).compareTo(other.isSetSession());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSession()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.session, other.session);
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
    StringBuilder sb = new StringBuilder("TGetDbsParams(");
    boolean first = true;

    if (isSetPattern()) {
      sb.append("pattern:");
      if (this.pattern == null) {
        sb.append("null");
      } else {
        sb.append(this.pattern);
      }
      first = false;
    }
    if (isSetSession()) {
      if (!first) sb.append(", ");
      sb.append("session:");
      if (this.session == null) {
        sb.append("null");
      } else {
        sb.append(this.session);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (session != null) {
      session.validate();
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TGetDbsParamsStandardSchemeFactory implements SchemeFactory {
    public TGetDbsParamsStandardScheme getScheme() {
      return new TGetDbsParamsStandardScheme();
    }
  }

  private static class TGetDbsParamsStandardScheme extends StandardScheme<TGetDbsParams> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TGetDbsParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PATTERN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.pattern = iprot.readString();
              struct.setPatternIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SESSION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.session = new org.apache.impala.thrift.TSessionState();
              struct.session.read(iprot);
              struct.setSessionIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TGetDbsParams struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.pattern != null) {
        if (struct.isSetPattern()) {
          oprot.writeFieldBegin(PATTERN_FIELD_DESC);
          oprot.writeString(struct.pattern);
          oprot.writeFieldEnd();
        }
      }
      if (struct.session != null) {
        if (struct.isSetSession()) {
          oprot.writeFieldBegin(SESSION_FIELD_DESC);
          struct.session.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TGetDbsParamsTupleSchemeFactory implements SchemeFactory {
    public TGetDbsParamsTupleScheme getScheme() {
      return new TGetDbsParamsTupleScheme();
    }
  }

  private static class TGetDbsParamsTupleScheme extends TupleScheme<TGetDbsParams> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TGetDbsParams struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetPattern()) {
        optionals.set(0);
      }
      if (struct.isSetSession()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetPattern()) {
        oprot.writeString(struct.pattern);
      }
      if (struct.isSetSession()) {
        struct.session.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TGetDbsParams struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.pattern = iprot.readString();
        struct.setPatternIsSet(true);
      }
      if (incoming.get(1)) {
        struct.session = new org.apache.impala.thrift.TSessionState();
        struct.session.read(iprot);
        struct.setSessionIsSet(true);
      }
    }
  }

}
