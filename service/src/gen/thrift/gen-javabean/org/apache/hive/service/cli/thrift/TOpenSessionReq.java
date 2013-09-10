/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hive.service.cli.thrift;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TOpenSessionReq implements org.apache.thrift.TBase<TOpenSessionReq, TOpenSessionReq._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TOpenSessionReq");

  private static final org.apache.thrift.protocol.TField CLIENT_PROTOCOL_FIELD_DESC = new org.apache.thrift.protocol.TField("client_protocol", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField USERNAME_FIELD_DESC = new org.apache.thrift.protocol.TField("username", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField PASSWORD_FIELD_DESC = new org.apache.thrift.protocol.TField("password", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField CONFIGURATION_FIELD_DESC = new org.apache.thrift.protocol.TField("configuration", org.apache.thrift.protocol.TType.MAP, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TOpenSessionReqStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TOpenSessionReqTupleSchemeFactory());
  }

  private TProtocolVersion client_protocol; // required
  private String username; // optional
  private String password; // optional
  private Map<String,String> configuration; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see TProtocolVersion
     */
    CLIENT_PROTOCOL((short)1, "client_protocol"),
    USERNAME((short)2, "username"),
    PASSWORD((short)3, "password"),
    CONFIGURATION((short)4, "configuration");

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
        case 1: // CLIENT_PROTOCOL
          return CLIENT_PROTOCOL;
        case 2: // USERNAME
          return USERNAME;
        case 3: // PASSWORD
          return PASSWORD;
        case 4: // CONFIGURATION
          return CONFIGURATION;
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
  private _Fields optionals[] = {_Fields.USERNAME,_Fields.PASSWORD,_Fields.CONFIGURATION};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CLIENT_PROTOCOL, new org.apache.thrift.meta_data.FieldMetaData("client_protocol", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TProtocolVersion.class)));
    tmpMap.put(_Fields.USERNAME, new org.apache.thrift.meta_data.FieldMetaData("username", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PASSWORD, new org.apache.thrift.meta_data.FieldMetaData("password", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CONFIGURATION, new org.apache.thrift.meta_data.FieldMetaData("configuration", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TOpenSessionReq.class, metaDataMap);
  }

  public TOpenSessionReq() {
    this.client_protocol = org.apache.hive.service.cli.thrift.TProtocolVersion.HIVE_CLI_SERVICE_PROTOCOL_V2;

  }

  public TOpenSessionReq(
    TProtocolVersion client_protocol)
  {
    this();
    this.client_protocol = client_protocol;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TOpenSessionReq(TOpenSessionReq other) {
    if (other.isSetClient_protocol()) {
      this.client_protocol = other.client_protocol;
    }
    if (other.isSetUsername()) {
      this.username = other.username;
    }
    if (other.isSetPassword()) {
      this.password = other.password;
    }
    if (other.isSetConfiguration()) {
      Map<String,String> __this__configuration = new HashMap<String,String>();
      for (Map.Entry<String, String> other_element : other.configuration.entrySet()) {

        String other_element_key = other_element.getKey();
        String other_element_value = other_element.getValue();

        String __this__configuration_copy_key = other_element_key;

        String __this__configuration_copy_value = other_element_value;

        __this__configuration.put(__this__configuration_copy_key, __this__configuration_copy_value);
      }
      this.configuration = __this__configuration;
    }
  }

  public TOpenSessionReq deepCopy() {
    return new TOpenSessionReq(this);
  }

  @Override
  public void clear() {
    this.client_protocol = org.apache.hive.service.cli.thrift.TProtocolVersion.HIVE_CLI_SERVICE_PROTOCOL_V2;

    this.username = null;
    this.password = null;
    this.configuration = null;
  }

  /**
   * 
   * @see TProtocolVersion
   */
  public TProtocolVersion getClient_protocol() {
    return this.client_protocol;
  }

  /**
   * 
   * @see TProtocolVersion
   */
  public void setClient_protocol(TProtocolVersion client_protocol) {
    this.client_protocol = client_protocol;
  }

  public void unsetClient_protocol() {
    this.client_protocol = null;
  }

  /** Returns true if field client_protocol is set (has been assigned a value) and false otherwise */
  public boolean isSetClient_protocol() {
    return this.client_protocol != null;
  }

  public void setClient_protocolIsSet(boolean value) {
    if (!value) {
      this.client_protocol = null;
    }
  }

  public String getUsername() {
    return this.username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public void unsetUsername() {
    this.username = null;
  }

  /** Returns true if field username is set (has been assigned a value) and false otherwise */
  public boolean isSetUsername() {
    return this.username != null;
  }

  public void setUsernameIsSet(boolean value) {
    if (!value) {
      this.username = null;
    }
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void unsetPassword() {
    this.password = null;
  }

  /** Returns true if field password is set (has been assigned a value) and false otherwise */
  public boolean isSetPassword() {
    return this.password != null;
  }

  public void setPasswordIsSet(boolean value) {
    if (!value) {
      this.password = null;
    }
  }

  public int getConfigurationSize() {
    return (this.configuration == null) ? 0 : this.configuration.size();
  }

  public void putToConfiguration(String key, String val) {
    if (this.configuration == null) {
      this.configuration = new HashMap<String,String>();
    }
    this.configuration.put(key, val);
  }

  public Map<String,String> getConfiguration() {
    return this.configuration;
  }

  public void setConfiguration(Map<String,String> configuration) {
    this.configuration = configuration;
  }

  public void unsetConfiguration() {
    this.configuration = null;
  }

  /** Returns true if field configuration is set (has been assigned a value) and false otherwise */
  public boolean isSetConfiguration() {
    return this.configuration != null;
  }

  public void setConfigurationIsSet(boolean value) {
    if (!value) {
      this.configuration = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CLIENT_PROTOCOL:
      if (value == null) {
        unsetClient_protocol();
      } else {
        setClient_protocol((TProtocolVersion)value);
      }
      break;

    case USERNAME:
      if (value == null) {
        unsetUsername();
      } else {
        setUsername((String)value);
      }
      break;

    case PASSWORD:
      if (value == null) {
        unsetPassword();
      } else {
        setPassword((String)value);
      }
      break;

    case CONFIGURATION:
      if (value == null) {
        unsetConfiguration();
      } else {
        setConfiguration((Map<String,String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CLIENT_PROTOCOL:
      return getClient_protocol();

    case USERNAME:
      return getUsername();

    case PASSWORD:
      return getPassword();

    case CONFIGURATION:
      return getConfiguration();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CLIENT_PROTOCOL:
      return isSetClient_protocol();
    case USERNAME:
      return isSetUsername();
    case PASSWORD:
      return isSetPassword();
    case CONFIGURATION:
      return isSetConfiguration();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TOpenSessionReq)
      return this.equals((TOpenSessionReq)that);
    return false;
  }

  public boolean equals(TOpenSessionReq that) {
    if (that == null)
      return false;

    boolean this_present_client_protocol = true && this.isSetClient_protocol();
    boolean that_present_client_protocol = true && that.isSetClient_protocol();
    if (this_present_client_protocol || that_present_client_protocol) {
      if (!(this_present_client_protocol && that_present_client_protocol))
        return false;
      if (!this.client_protocol.equals(that.client_protocol))
        return false;
    }

    boolean this_present_username = true && this.isSetUsername();
    boolean that_present_username = true && that.isSetUsername();
    if (this_present_username || that_present_username) {
      if (!(this_present_username && that_present_username))
        return false;
      if (!this.username.equals(that.username))
        return false;
    }

    boolean this_present_password = true && this.isSetPassword();
    boolean that_present_password = true && that.isSetPassword();
    if (this_present_password || that_present_password) {
      if (!(this_present_password && that_present_password))
        return false;
      if (!this.password.equals(that.password))
        return false;
    }

    boolean this_present_configuration = true && this.isSetConfiguration();
    boolean that_present_configuration = true && that.isSetConfiguration();
    if (this_present_configuration || that_present_configuration) {
      if (!(this_present_configuration && that_present_configuration))
        return false;
      if (!this.configuration.equals(that.configuration))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_client_protocol = true && (isSetClient_protocol());
    builder.append(present_client_protocol);
    if (present_client_protocol)
      builder.append(client_protocol.getValue());

    boolean present_username = true && (isSetUsername());
    builder.append(present_username);
    if (present_username)
      builder.append(username);

    boolean present_password = true && (isSetPassword());
    builder.append(present_password);
    if (present_password)
      builder.append(password);

    boolean present_configuration = true && (isSetConfiguration());
    builder.append(present_configuration);
    if (present_configuration)
      builder.append(configuration);

    return builder.toHashCode();
  }

  public int compareTo(TOpenSessionReq other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TOpenSessionReq typedOther = (TOpenSessionReq)other;

    lastComparison = Boolean.valueOf(isSetClient_protocol()).compareTo(typedOther.isSetClient_protocol());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetClient_protocol()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.client_protocol, typedOther.client_protocol);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUsername()).compareTo(typedOther.isSetUsername());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsername()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.username, typedOther.username);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPassword()).compareTo(typedOther.isSetPassword());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPassword()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.password, typedOther.password);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetConfiguration()).compareTo(typedOther.isSetConfiguration());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetConfiguration()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.configuration, typedOther.configuration);
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
    StringBuilder sb = new StringBuilder("TOpenSessionReq(");
    boolean first = true;

    sb.append("client_protocol:");
    if (this.client_protocol == null) {
      sb.append("null");
    } else {
      sb.append(this.client_protocol);
    }
    first = false;
    if (isSetUsername()) {
      if (!first) sb.append(", ");
      sb.append("username:");
      if (this.username == null) {
        sb.append("null");
      } else {
        sb.append(this.username);
      }
      first = false;
    }
    if (isSetPassword()) {
      if (!first) sb.append(", ");
      sb.append("password:");
      if (this.password == null) {
        sb.append("null");
      } else {
        sb.append(this.password);
      }
      first = false;
    }
    if (isSetConfiguration()) {
      if (!first) sb.append(", ");
      sb.append("configuration:");
      if (this.configuration == null) {
        sb.append("null");
      } else {
        sb.append(this.configuration);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetClient_protocol()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'client_protocol' is unset! Struct:" + toString());
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

  private static class TOpenSessionReqStandardSchemeFactory implements SchemeFactory {
    public TOpenSessionReqStandardScheme getScheme() {
      return new TOpenSessionReqStandardScheme();
    }
  }

  private static class TOpenSessionReqStandardScheme extends StandardScheme<TOpenSessionReq> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TOpenSessionReq struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CLIENT_PROTOCOL
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.client_protocol = TProtocolVersion.findByValue(iprot.readI32());
              struct.setClient_protocolIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // USERNAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.username = iprot.readString();
              struct.setUsernameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PASSWORD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.password = iprot.readString();
              struct.setPasswordIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CONFIGURATION
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map124 = iprot.readMapBegin();
                struct.configuration = new HashMap<String,String>(2*_map124.size);
                for (int _i125 = 0; _i125 < _map124.size; ++_i125)
                {
                  String _key126; // required
                  String _val127; // required
                  _key126 = iprot.readString();
                  _val127 = iprot.readString();
                  struct.configuration.put(_key126, _val127);
                }
                iprot.readMapEnd();
              }
              struct.setConfigurationIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TOpenSessionReq struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.client_protocol != null) {
        oprot.writeFieldBegin(CLIENT_PROTOCOL_FIELD_DESC);
        oprot.writeI32(struct.client_protocol.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.username != null) {
        if (struct.isSetUsername()) {
          oprot.writeFieldBegin(USERNAME_FIELD_DESC);
          oprot.writeString(struct.username);
          oprot.writeFieldEnd();
        }
      }
      if (struct.password != null) {
        if (struct.isSetPassword()) {
          oprot.writeFieldBegin(PASSWORD_FIELD_DESC);
          oprot.writeString(struct.password);
          oprot.writeFieldEnd();
        }
      }
      if (struct.configuration != null) {
        if (struct.isSetConfiguration()) {
          oprot.writeFieldBegin(CONFIGURATION_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.configuration.size()));
            for (Map.Entry<String, String> _iter128 : struct.configuration.entrySet())
            {
              oprot.writeString(_iter128.getKey());
              oprot.writeString(_iter128.getValue());
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TOpenSessionReqTupleSchemeFactory implements SchemeFactory {
    public TOpenSessionReqTupleScheme getScheme() {
      return new TOpenSessionReqTupleScheme();
    }
  }

  private static class TOpenSessionReqTupleScheme extends TupleScheme<TOpenSessionReq> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TOpenSessionReq struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.client_protocol.getValue());
      BitSet optionals = new BitSet();
      if (struct.isSetUsername()) {
        optionals.set(0);
      }
      if (struct.isSetPassword()) {
        optionals.set(1);
      }
      if (struct.isSetConfiguration()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetUsername()) {
        oprot.writeString(struct.username);
      }
      if (struct.isSetPassword()) {
        oprot.writeString(struct.password);
      }
      if (struct.isSetConfiguration()) {
        {
          oprot.writeI32(struct.configuration.size());
          for (Map.Entry<String, String> _iter129 : struct.configuration.entrySet())
          {
            oprot.writeString(_iter129.getKey());
            oprot.writeString(_iter129.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TOpenSessionReq struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.client_protocol = TProtocolVersion.findByValue(iprot.readI32());
      struct.setClient_protocolIsSet(true);
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.username = iprot.readString();
        struct.setUsernameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.password = iprot.readString();
        struct.setPasswordIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TMap _map130 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.configuration = new HashMap<String,String>(2*_map130.size);
          for (int _i131 = 0; _i131 < _map130.size; ++_i131)
          {
            String _key132; // required
            String _val133; // required
            _key132 = iprot.readString();
            _val133 = iprot.readString();
            struct.configuration.put(_key132, _val133);
          }
        }
        struct.setConfigurationIsSet(true);
      }
    }
  }

}

