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
public class TAlterDbSetOwnerParams implements org.apache.thrift.TBase<TAlterDbSetOwnerParams, TAlterDbSetOwnerParams._Fields>, java.io.Serializable, Cloneable, Comparable<TAlterDbSetOwnerParams> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TAlterDbSetOwnerParams");

  private static final org.apache.thrift.protocol.TField OWNER_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("owner_type", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField OWNER_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("owner_name", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField SERVER_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("server_name", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TAlterDbSetOwnerParamsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TAlterDbSetOwnerParamsTupleSchemeFactory());
  }

  private TOwnerType owner_type; // required
  private String owner_name; // required
  private String server_name; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see TOwnerType
     */
    OWNER_TYPE((short)1, "owner_type"),
    OWNER_NAME((short)2, "owner_name"),
    SERVER_NAME((short)3, "server_name");

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
        case 1: // OWNER_TYPE
          return OWNER_TYPE;
        case 2: // OWNER_NAME
          return OWNER_NAME;
        case 3: // SERVER_NAME
          return SERVER_NAME;
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
  private static final _Fields optionals[] = {_Fields.SERVER_NAME};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.OWNER_TYPE, new org.apache.thrift.meta_data.FieldMetaData("owner_type", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TOwnerType.class)));
    tmpMap.put(_Fields.OWNER_NAME, new org.apache.thrift.meta_data.FieldMetaData("owner_name", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SERVER_NAME, new org.apache.thrift.meta_data.FieldMetaData("server_name", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TAlterDbSetOwnerParams.class, metaDataMap);
  }

  public TAlterDbSetOwnerParams() {
  }

  public TAlterDbSetOwnerParams(
    TOwnerType owner_type,
    String owner_name)
  {
    this();
    this.owner_type = owner_type;
    this.owner_name = owner_name;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TAlterDbSetOwnerParams(TAlterDbSetOwnerParams other) {
    if (other.isSetOwner_type()) {
      this.owner_type = other.owner_type;
    }
    if (other.isSetOwner_name()) {
      this.owner_name = other.owner_name;
    }
    if (other.isSetServer_name()) {
      this.server_name = other.server_name;
    }
  }

  public TAlterDbSetOwnerParams deepCopy() {
    return new TAlterDbSetOwnerParams(this);
  }

  @Override
  public void clear() {
    this.owner_type = null;
    this.owner_name = null;
    this.server_name = null;
  }

  /**
   * 
   * @see TOwnerType
   */
  public TOwnerType getOwner_type() {
    return this.owner_type;
  }

  /**
   * 
   * @see TOwnerType
   */
  public void setOwner_type(TOwnerType owner_type) {
    this.owner_type = owner_type;
  }

  public void unsetOwner_type() {
    this.owner_type = null;
  }

  /** Returns true if field owner_type is set (has been assigned a value) and false otherwise */
  public boolean isSetOwner_type() {
    return this.owner_type != null;
  }

  public void setOwner_typeIsSet(boolean value) {
    if (!value) {
      this.owner_type = null;
    }
  }

  public String getOwner_name() {
    return this.owner_name;
  }

  public void setOwner_name(String owner_name) {
    this.owner_name = owner_name;
  }

  public void unsetOwner_name() {
    this.owner_name = null;
  }

  /** Returns true if field owner_name is set (has been assigned a value) and false otherwise */
  public boolean isSetOwner_name() {
    return this.owner_name != null;
  }

  public void setOwner_nameIsSet(boolean value) {
    if (!value) {
      this.owner_name = null;
    }
  }

  public String getServer_name() {
    return this.server_name;
  }

  public void setServer_name(String server_name) {
    this.server_name = server_name;
  }

  public void unsetServer_name() {
    this.server_name = null;
  }

  /** Returns true if field server_name is set (has been assigned a value) and false otherwise */
  public boolean isSetServer_name() {
    return this.server_name != null;
  }

  public void setServer_nameIsSet(boolean value) {
    if (!value) {
      this.server_name = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case OWNER_TYPE:
      if (value == null) {
        unsetOwner_type();
      } else {
        setOwner_type((TOwnerType)value);
      }
      break;

    case OWNER_NAME:
      if (value == null) {
        unsetOwner_name();
      } else {
        setOwner_name((String)value);
      }
      break;

    case SERVER_NAME:
      if (value == null) {
        unsetServer_name();
      } else {
        setServer_name((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case OWNER_TYPE:
      return getOwner_type();

    case OWNER_NAME:
      return getOwner_name();

    case SERVER_NAME:
      return getServer_name();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case OWNER_TYPE:
      return isSetOwner_type();
    case OWNER_NAME:
      return isSetOwner_name();
    case SERVER_NAME:
      return isSetServer_name();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TAlterDbSetOwnerParams)
      return this.equals((TAlterDbSetOwnerParams)that);
    return false;
  }

  public boolean equals(TAlterDbSetOwnerParams that) {
    if (that == null)
      return false;

    boolean this_present_owner_type = true && this.isSetOwner_type();
    boolean that_present_owner_type = true && that.isSetOwner_type();
    if (this_present_owner_type || that_present_owner_type) {
      if (!(this_present_owner_type && that_present_owner_type))
        return false;
      if (!this.owner_type.equals(that.owner_type))
        return false;
    }

    boolean this_present_owner_name = true && this.isSetOwner_name();
    boolean that_present_owner_name = true && that.isSetOwner_name();
    if (this_present_owner_name || that_present_owner_name) {
      if (!(this_present_owner_name && that_present_owner_name))
        return false;
      if (!this.owner_name.equals(that.owner_name))
        return false;
    }

    boolean this_present_server_name = true && this.isSetServer_name();
    boolean that_present_server_name = true && that.isSetServer_name();
    if (this_present_server_name || that_present_server_name) {
      if (!(this_present_server_name && that_present_server_name))
        return false;
      if (!this.server_name.equals(that.server_name))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_owner_type = true && (isSetOwner_type());
    list.add(present_owner_type);
    if (present_owner_type)
      list.add(owner_type.getValue());

    boolean present_owner_name = true && (isSetOwner_name());
    list.add(present_owner_name);
    if (present_owner_name)
      list.add(owner_name);

    boolean present_server_name = true && (isSetServer_name());
    list.add(present_server_name);
    if (present_server_name)
      list.add(server_name);

    return list.hashCode();
  }

  @Override
  public int compareTo(TAlterDbSetOwnerParams other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetOwner_type()).compareTo(other.isSetOwner_type());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOwner_type()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.owner_type, other.owner_type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOwner_name()).compareTo(other.isSetOwner_name());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOwner_name()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.owner_name, other.owner_name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetServer_name()).compareTo(other.isSetServer_name());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetServer_name()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.server_name, other.server_name);
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
    StringBuilder sb = new StringBuilder("TAlterDbSetOwnerParams(");
    boolean first = true;

    sb.append("owner_type:");
    if (this.owner_type == null) {
      sb.append("null");
    } else {
      sb.append(this.owner_type);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("owner_name:");
    if (this.owner_name == null) {
      sb.append("null");
    } else {
      sb.append(this.owner_name);
    }
    first = false;
    if (isSetServer_name()) {
      if (!first) sb.append(", ");
      sb.append("server_name:");
      if (this.server_name == null) {
        sb.append("null");
      } else {
        sb.append(this.server_name);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetOwner_type()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'owner_type' is unset! Struct:" + toString());
    }

    if (!isSetOwner_name()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'owner_name' is unset! Struct:" + toString());
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

  private static class TAlterDbSetOwnerParamsStandardSchemeFactory implements SchemeFactory {
    public TAlterDbSetOwnerParamsStandardScheme getScheme() {
      return new TAlterDbSetOwnerParamsStandardScheme();
    }
  }

  private static class TAlterDbSetOwnerParamsStandardScheme extends StandardScheme<TAlterDbSetOwnerParams> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TAlterDbSetOwnerParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // OWNER_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.owner_type = org.apache.impala.thrift.TOwnerType.findByValue(iprot.readI32());
              struct.setOwner_typeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // OWNER_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.owner_name = iprot.readString();
              struct.setOwner_nameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SERVER_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.server_name = iprot.readString();
              struct.setServer_nameIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TAlterDbSetOwnerParams struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.owner_type != null) {
        oprot.writeFieldBegin(OWNER_TYPE_FIELD_DESC);
        oprot.writeI32(struct.owner_type.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.owner_name != null) {
        oprot.writeFieldBegin(OWNER_NAME_FIELD_DESC);
        oprot.writeString(struct.owner_name);
        oprot.writeFieldEnd();
      }
      if (struct.server_name != null) {
        if (struct.isSetServer_name()) {
          oprot.writeFieldBegin(SERVER_NAME_FIELD_DESC);
          oprot.writeString(struct.server_name);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TAlterDbSetOwnerParamsTupleSchemeFactory implements SchemeFactory {
    public TAlterDbSetOwnerParamsTupleScheme getScheme() {
      return new TAlterDbSetOwnerParamsTupleScheme();
    }
  }

  private static class TAlterDbSetOwnerParamsTupleScheme extends TupleScheme<TAlterDbSetOwnerParams> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TAlterDbSetOwnerParams struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.owner_type.getValue());
      oprot.writeString(struct.owner_name);
      BitSet optionals = new BitSet();
      if (struct.isSetServer_name()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetServer_name()) {
        oprot.writeString(struct.server_name);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TAlterDbSetOwnerParams struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.owner_type = org.apache.impala.thrift.TOwnerType.findByValue(iprot.readI32());
      struct.setOwner_typeIsSet(true);
      struct.owner_name = iprot.readString();
      struct.setOwner_nameIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.server_name = iprot.readString();
        struct.setServer_nameIsSet(true);
      }
    }
  }

}

