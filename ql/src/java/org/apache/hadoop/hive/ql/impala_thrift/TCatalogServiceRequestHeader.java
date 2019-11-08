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
public class TCatalogServiceRequestHeader implements org.apache.thrift.TBase<TCatalogServiceRequestHeader, TCatalogServiceRequestHeader._Fields>, java.io.Serializable, Cloneable, Comparable<TCatalogServiceRequestHeader> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TCatalogServiceRequestHeader");

  private static final org.apache.thrift.protocol.TField REQUESTING_USER_FIELD_DESC = new org.apache.thrift.protocol.TField("requesting_user", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField REDACTED_SQL_STMT_FIELD_DESC = new org.apache.thrift.protocol.TField("redacted_sql_stmt", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField CLIENT_IP_FIELD_DESC = new org.apache.thrift.protocol.TField("client_ip", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TCatalogServiceRequestHeaderStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TCatalogServiceRequestHeaderTupleSchemeFactory());
  }

  public String requesting_user; // optional
  public String redacted_sql_stmt; // optional
  public String client_ip; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    REQUESTING_USER((short)1, "requesting_user"),
    REDACTED_SQL_STMT((short)2, "redacted_sql_stmt"),
    CLIENT_IP((short)3, "client_ip");

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
        case 1: // REQUESTING_USER
          return REQUESTING_USER;
        case 2: // REDACTED_SQL_STMT
          return REDACTED_SQL_STMT;
        case 3: // CLIENT_IP
          return CLIENT_IP;
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
  private static final _Fields optionals[] = {_Fields.REQUESTING_USER,_Fields.REDACTED_SQL_STMT,_Fields.CLIENT_IP};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.REQUESTING_USER, new org.apache.thrift.meta_data.FieldMetaData("requesting_user", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.REDACTED_SQL_STMT, new org.apache.thrift.meta_data.FieldMetaData("redacted_sql_stmt", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CLIENT_IP, new org.apache.thrift.meta_data.FieldMetaData("client_ip", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TCatalogServiceRequestHeader.class, metaDataMap);
  }

  public TCatalogServiceRequestHeader() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TCatalogServiceRequestHeader(TCatalogServiceRequestHeader other) {
    if (other.isSetRequesting_user()) {
      this.requesting_user = other.requesting_user;
    }
    if (other.isSetRedacted_sql_stmt()) {
      this.redacted_sql_stmt = other.redacted_sql_stmt;
    }
    if (other.isSetClient_ip()) {
      this.client_ip = other.client_ip;
    }
  }

  public TCatalogServiceRequestHeader deepCopy() {
    return new TCatalogServiceRequestHeader(this);
  }

  @Override
  public void clear() {
    this.requesting_user = null;
    this.redacted_sql_stmt = null;
    this.client_ip = null;
  }

  public String getRequesting_user() {
    return this.requesting_user;
  }

  public TCatalogServiceRequestHeader setRequesting_user(String requesting_user) {
    this.requesting_user = requesting_user;
    return this;
  }

  public void unsetRequesting_user() {
    this.requesting_user = null;
  }

  /** Returns true if field requesting_user is set (has been assigned a value) and false otherwise */
  public boolean isSetRequesting_user() {
    return this.requesting_user != null;
  }

  public void setRequesting_userIsSet(boolean value) {
    if (!value) {
      this.requesting_user = null;
    }
  }

  public String getRedacted_sql_stmt() {
    return this.redacted_sql_stmt;
  }

  public TCatalogServiceRequestHeader setRedacted_sql_stmt(String redacted_sql_stmt) {
    this.redacted_sql_stmt = redacted_sql_stmt;
    return this;
  }

  public void unsetRedacted_sql_stmt() {
    this.redacted_sql_stmt = null;
  }

  /** Returns true if field redacted_sql_stmt is set (has been assigned a value) and false otherwise */
  public boolean isSetRedacted_sql_stmt() {
    return this.redacted_sql_stmt != null;
  }

  public void setRedacted_sql_stmtIsSet(boolean value) {
    if (!value) {
      this.redacted_sql_stmt = null;
    }
  }

  public String getClient_ip() {
    return this.client_ip;
  }

  public TCatalogServiceRequestHeader setClient_ip(String client_ip) {
    this.client_ip = client_ip;
    return this;
  }

  public void unsetClient_ip() {
    this.client_ip = null;
  }

  /** Returns true if field client_ip is set (has been assigned a value) and false otherwise */
  public boolean isSetClient_ip() {
    return this.client_ip != null;
  }

  public void setClient_ipIsSet(boolean value) {
    if (!value) {
      this.client_ip = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case REQUESTING_USER:
      if (value == null) {
        unsetRequesting_user();
      } else {
        setRequesting_user((String)value);
      }
      break;

    case REDACTED_SQL_STMT:
      if (value == null) {
        unsetRedacted_sql_stmt();
      } else {
        setRedacted_sql_stmt((String)value);
      }
      break;

    case CLIENT_IP:
      if (value == null) {
        unsetClient_ip();
      } else {
        setClient_ip((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case REQUESTING_USER:
      return getRequesting_user();

    case REDACTED_SQL_STMT:
      return getRedacted_sql_stmt();

    case CLIENT_IP:
      return getClient_ip();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case REQUESTING_USER:
      return isSetRequesting_user();
    case REDACTED_SQL_STMT:
      return isSetRedacted_sql_stmt();
    case CLIENT_IP:
      return isSetClient_ip();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TCatalogServiceRequestHeader)
      return this.equals((TCatalogServiceRequestHeader)that);
    return false;
  }

  public boolean equals(TCatalogServiceRequestHeader that) {
    if (that == null)
      return false;

    boolean this_present_requesting_user = true && this.isSetRequesting_user();
    boolean that_present_requesting_user = true && that.isSetRequesting_user();
    if (this_present_requesting_user || that_present_requesting_user) {
      if (!(this_present_requesting_user && that_present_requesting_user))
        return false;
      if (!this.requesting_user.equals(that.requesting_user))
        return false;
    }

    boolean this_present_redacted_sql_stmt = true && this.isSetRedacted_sql_stmt();
    boolean that_present_redacted_sql_stmt = true && that.isSetRedacted_sql_stmt();
    if (this_present_redacted_sql_stmt || that_present_redacted_sql_stmt) {
      if (!(this_present_redacted_sql_stmt && that_present_redacted_sql_stmt))
        return false;
      if (!this.redacted_sql_stmt.equals(that.redacted_sql_stmt))
        return false;
    }

    boolean this_present_client_ip = true && this.isSetClient_ip();
    boolean that_present_client_ip = true && that.isSetClient_ip();
    if (this_present_client_ip || that_present_client_ip) {
      if (!(this_present_client_ip && that_present_client_ip))
        return false;
      if (!this.client_ip.equals(that.client_ip))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_requesting_user = true && (isSetRequesting_user());
    list.add(present_requesting_user);
    if (present_requesting_user)
      list.add(requesting_user);

    boolean present_redacted_sql_stmt = true && (isSetRedacted_sql_stmt());
    list.add(present_redacted_sql_stmt);
    if (present_redacted_sql_stmt)
      list.add(redacted_sql_stmt);

    boolean present_client_ip = true && (isSetClient_ip());
    list.add(present_client_ip);
    if (present_client_ip)
      list.add(client_ip);

    return list.hashCode();
  }

  @Override
  public int compareTo(TCatalogServiceRequestHeader other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetRequesting_user()).compareTo(other.isSetRequesting_user());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRequesting_user()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.requesting_user, other.requesting_user);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRedacted_sql_stmt()).compareTo(other.isSetRedacted_sql_stmt());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRedacted_sql_stmt()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.redacted_sql_stmt, other.redacted_sql_stmt);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetClient_ip()).compareTo(other.isSetClient_ip());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetClient_ip()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.client_ip, other.client_ip);
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
    StringBuilder sb = new StringBuilder("TCatalogServiceRequestHeader(");
    boolean first = true;

    if (isSetRequesting_user()) {
      sb.append("requesting_user:");
      if (this.requesting_user == null) {
        sb.append("null");
      } else {
        sb.append(this.requesting_user);
      }
      first = false;
    }
    if (isSetRedacted_sql_stmt()) {
      if (!first) sb.append(", ");
      sb.append("redacted_sql_stmt:");
      if (this.redacted_sql_stmt == null) {
        sb.append("null");
      } else {
        sb.append(this.redacted_sql_stmt);
      }
      first = false;
    }
    if (isSetClient_ip()) {
      if (!first) sb.append(", ");
      sb.append("client_ip:");
      if (this.client_ip == null) {
        sb.append("null");
      } else {
        sb.append(this.client_ip);
      }
      first = false;
    }
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

  private static class TCatalogServiceRequestHeaderStandardSchemeFactory implements SchemeFactory {
    public TCatalogServiceRequestHeaderStandardScheme getScheme() {
      return new TCatalogServiceRequestHeaderStandardScheme();
    }
  }

  private static class TCatalogServiceRequestHeaderStandardScheme extends StandardScheme<TCatalogServiceRequestHeader> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TCatalogServiceRequestHeader struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // REQUESTING_USER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.requesting_user = iprot.readString();
              struct.setRequesting_userIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // REDACTED_SQL_STMT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.redacted_sql_stmt = iprot.readString();
              struct.setRedacted_sql_stmtIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CLIENT_IP
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.client_ip = iprot.readString();
              struct.setClient_ipIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TCatalogServiceRequestHeader struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.requesting_user != null) {
        if (struct.isSetRequesting_user()) {
          oprot.writeFieldBegin(REQUESTING_USER_FIELD_DESC);
          oprot.writeString(struct.requesting_user);
          oprot.writeFieldEnd();
        }
      }
      if (struct.redacted_sql_stmt != null) {
        if (struct.isSetRedacted_sql_stmt()) {
          oprot.writeFieldBegin(REDACTED_SQL_STMT_FIELD_DESC);
          oprot.writeString(struct.redacted_sql_stmt);
          oprot.writeFieldEnd();
        }
      }
      if (struct.client_ip != null) {
        if (struct.isSetClient_ip()) {
          oprot.writeFieldBegin(CLIENT_IP_FIELD_DESC);
          oprot.writeString(struct.client_ip);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TCatalogServiceRequestHeaderTupleSchemeFactory implements SchemeFactory {
    public TCatalogServiceRequestHeaderTupleScheme getScheme() {
      return new TCatalogServiceRequestHeaderTupleScheme();
    }
  }

  private static class TCatalogServiceRequestHeaderTupleScheme extends TupleScheme<TCatalogServiceRequestHeader> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TCatalogServiceRequestHeader struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetRequesting_user()) {
        optionals.set(0);
      }
      if (struct.isSetRedacted_sql_stmt()) {
        optionals.set(1);
      }
      if (struct.isSetClient_ip()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetRequesting_user()) {
        oprot.writeString(struct.requesting_user);
      }
      if (struct.isSetRedacted_sql_stmt()) {
        oprot.writeString(struct.redacted_sql_stmt);
      }
      if (struct.isSetClient_ip()) {
        oprot.writeString(struct.client_ip);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TCatalogServiceRequestHeader struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.requesting_user = iprot.readString();
        struct.setRequesting_userIsSet(true);
      }
      if (incoming.get(1)) {
        struct.redacted_sql_stmt = iprot.readString();
        struct.setRedacted_sql_stmtIsSet(true);
      }
      if (incoming.get(2)) {
        struct.client_ip = iprot.readString();
        struct.setClient_ipIsSet(true);
      }
    }
  }

}

