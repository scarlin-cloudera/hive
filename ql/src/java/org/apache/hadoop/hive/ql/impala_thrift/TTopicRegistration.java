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
public class TTopicRegistration implements org.apache.thrift.TBase<TTopicRegistration, TTopicRegistration._Fields>, java.io.Serializable, Cloneable, Comparable<TTopicRegistration> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TTopicRegistration");

  private static final org.apache.thrift.protocol.TField TOPIC_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("topic_name", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField IS_TRANSIENT_FIELD_DESC = new org.apache.thrift.protocol.TField("is_transient", org.apache.thrift.protocol.TType.BOOL, (short)2);
  private static final org.apache.thrift.protocol.TField POPULATE_MIN_SUBSCRIBER_TOPIC_VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("populate_min_subscriber_topic_version", org.apache.thrift.protocol.TType.BOOL, (short)3);
  private static final org.apache.thrift.protocol.TField FILTER_PREFIX_FIELD_DESC = new org.apache.thrift.protocol.TField("filter_prefix", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TTopicRegistrationStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TTopicRegistrationTupleSchemeFactory());
  }

  private String topic_name; // required
  private boolean is_transient; // required
  private boolean populate_min_subscriber_topic_version; // required
  private String filter_prefix; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TOPIC_NAME((short)1, "topic_name"),
    IS_TRANSIENT((short)2, "is_transient"),
    POPULATE_MIN_SUBSCRIBER_TOPIC_VERSION((short)3, "populate_min_subscriber_topic_version"),
    FILTER_PREFIX((short)4, "filter_prefix");

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
        case 1: // TOPIC_NAME
          return TOPIC_NAME;
        case 2: // IS_TRANSIENT
          return IS_TRANSIENT;
        case 3: // POPULATE_MIN_SUBSCRIBER_TOPIC_VERSION
          return POPULATE_MIN_SUBSCRIBER_TOPIC_VERSION;
        case 4: // FILTER_PREFIX
          return FILTER_PREFIX;
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
  private static final int __IS_TRANSIENT_ISSET_ID = 0;
  private static final int __POPULATE_MIN_SUBSCRIBER_TOPIC_VERSION_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.FILTER_PREFIX};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TOPIC_NAME, new org.apache.thrift.meta_data.FieldMetaData("topic_name", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.IS_TRANSIENT, new org.apache.thrift.meta_data.FieldMetaData("is_transient", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.POPULATE_MIN_SUBSCRIBER_TOPIC_VERSION, new org.apache.thrift.meta_data.FieldMetaData("populate_min_subscriber_topic_version", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.FILTER_PREFIX, new org.apache.thrift.meta_data.FieldMetaData("filter_prefix", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TTopicRegistration.class, metaDataMap);
  }

  public TTopicRegistration() {
    this.populate_min_subscriber_topic_version = false;

  }

  public TTopicRegistration(
    String topic_name,
    boolean is_transient,
    boolean populate_min_subscriber_topic_version)
  {
    this();
    this.topic_name = topic_name;
    this.is_transient = is_transient;
    setIs_transientIsSet(true);
    this.populate_min_subscriber_topic_version = populate_min_subscriber_topic_version;
    setPopulate_min_subscriber_topic_versionIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TTopicRegistration(TTopicRegistration other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetTopic_name()) {
      this.topic_name = other.topic_name;
    }
    this.is_transient = other.is_transient;
    this.populate_min_subscriber_topic_version = other.populate_min_subscriber_topic_version;
    if (other.isSetFilter_prefix()) {
      this.filter_prefix = other.filter_prefix;
    }
  }

  public TTopicRegistration deepCopy() {
    return new TTopicRegistration(this);
  }

  @Override
  public void clear() {
    this.topic_name = null;
    setIs_transientIsSet(false);
    this.is_transient = false;
    this.populate_min_subscriber_topic_version = false;

    this.filter_prefix = null;
  }

  public String getTopic_name() {
    return this.topic_name;
  }

  public void setTopic_name(String topic_name) {
    this.topic_name = topic_name;
  }

  public void unsetTopic_name() {
    this.topic_name = null;
  }

  /** Returns true if field topic_name is set (has been assigned a value) and false otherwise */
  public boolean isSetTopic_name() {
    return this.topic_name != null;
  }

  public void setTopic_nameIsSet(boolean value) {
    if (!value) {
      this.topic_name = null;
    }
  }

  public boolean isIs_transient() {
    return this.is_transient;
  }

  public void setIs_transient(boolean is_transient) {
    this.is_transient = is_transient;
    setIs_transientIsSet(true);
  }

  public void unsetIs_transient() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __IS_TRANSIENT_ISSET_ID);
  }

  /** Returns true if field is_transient is set (has been assigned a value) and false otherwise */
  public boolean isSetIs_transient() {
    return EncodingUtils.testBit(__isset_bitfield, __IS_TRANSIENT_ISSET_ID);
  }

  public void setIs_transientIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __IS_TRANSIENT_ISSET_ID, value);
  }

  public boolean isPopulate_min_subscriber_topic_version() {
    return this.populate_min_subscriber_topic_version;
  }

  public void setPopulate_min_subscriber_topic_version(boolean populate_min_subscriber_topic_version) {
    this.populate_min_subscriber_topic_version = populate_min_subscriber_topic_version;
    setPopulate_min_subscriber_topic_versionIsSet(true);
  }

  public void unsetPopulate_min_subscriber_topic_version() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __POPULATE_MIN_SUBSCRIBER_TOPIC_VERSION_ISSET_ID);
  }

  /** Returns true if field populate_min_subscriber_topic_version is set (has been assigned a value) and false otherwise */
  public boolean isSetPopulate_min_subscriber_topic_version() {
    return EncodingUtils.testBit(__isset_bitfield, __POPULATE_MIN_SUBSCRIBER_TOPIC_VERSION_ISSET_ID);
  }

  public void setPopulate_min_subscriber_topic_versionIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __POPULATE_MIN_SUBSCRIBER_TOPIC_VERSION_ISSET_ID, value);
  }

  public String getFilter_prefix() {
    return this.filter_prefix;
  }

  public void setFilter_prefix(String filter_prefix) {
    this.filter_prefix = filter_prefix;
  }

  public void unsetFilter_prefix() {
    this.filter_prefix = null;
  }

  /** Returns true if field filter_prefix is set (has been assigned a value) and false otherwise */
  public boolean isSetFilter_prefix() {
    return this.filter_prefix != null;
  }

  public void setFilter_prefixIsSet(boolean value) {
    if (!value) {
      this.filter_prefix = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TOPIC_NAME:
      if (value == null) {
        unsetTopic_name();
      } else {
        setTopic_name((String)value);
      }
      break;

    case IS_TRANSIENT:
      if (value == null) {
        unsetIs_transient();
      } else {
        setIs_transient((Boolean)value);
      }
      break;

    case POPULATE_MIN_SUBSCRIBER_TOPIC_VERSION:
      if (value == null) {
        unsetPopulate_min_subscriber_topic_version();
      } else {
        setPopulate_min_subscriber_topic_version((Boolean)value);
      }
      break;

    case FILTER_PREFIX:
      if (value == null) {
        unsetFilter_prefix();
      } else {
        setFilter_prefix((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TOPIC_NAME:
      return getTopic_name();

    case IS_TRANSIENT:
      return isIs_transient();

    case POPULATE_MIN_SUBSCRIBER_TOPIC_VERSION:
      return isPopulate_min_subscriber_topic_version();

    case FILTER_PREFIX:
      return getFilter_prefix();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TOPIC_NAME:
      return isSetTopic_name();
    case IS_TRANSIENT:
      return isSetIs_transient();
    case POPULATE_MIN_SUBSCRIBER_TOPIC_VERSION:
      return isSetPopulate_min_subscriber_topic_version();
    case FILTER_PREFIX:
      return isSetFilter_prefix();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TTopicRegistration)
      return this.equals((TTopicRegistration)that);
    return false;
  }

  public boolean equals(TTopicRegistration that) {
    if (that == null)
      return false;

    boolean this_present_topic_name = true && this.isSetTopic_name();
    boolean that_present_topic_name = true && that.isSetTopic_name();
    if (this_present_topic_name || that_present_topic_name) {
      if (!(this_present_topic_name && that_present_topic_name))
        return false;
      if (!this.topic_name.equals(that.topic_name))
        return false;
    }

    boolean this_present_is_transient = true;
    boolean that_present_is_transient = true;
    if (this_present_is_transient || that_present_is_transient) {
      if (!(this_present_is_transient && that_present_is_transient))
        return false;
      if (this.is_transient != that.is_transient)
        return false;
    }

    boolean this_present_populate_min_subscriber_topic_version = true;
    boolean that_present_populate_min_subscriber_topic_version = true;
    if (this_present_populate_min_subscriber_topic_version || that_present_populate_min_subscriber_topic_version) {
      if (!(this_present_populate_min_subscriber_topic_version && that_present_populate_min_subscriber_topic_version))
        return false;
      if (this.populate_min_subscriber_topic_version != that.populate_min_subscriber_topic_version)
        return false;
    }

    boolean this_present_filter_prefix = true && this.isSetFilter_prefix();
    boolean that_present_filter_prefix = true && that.isSetFilter_prefix();
    if (this_present_filter_prefix || that_present_filter_prefix) {
      if (!(this_present_filter_prefix && that_present_filter_prefix))
        return false;
      if (!this.filter_prefix.equals(that.filter_prefix))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_topic_name = true && (isSetTopic_name());
    list.add(present_topic_name);
    if (present_topic_name)
      list.add(topic_name);

    boolean present_is_transient = true;
    list.add(present_is_transient);
    if (present_is_transient)
      list.add(is_transient);

    boolean present_populate_min_subscriber_topic_version = true;
    list.add(present_populate_min_subscriber_topic_version);
    if (present_populate_min_subscriber_topic_version)
      list.add(populate_min_subscriber_topic_version);

    boolean present_filter_prefix = true && (isSetFilter_prefix());
    list.add(present_filter_prefix);
    if (present_filter_prefix)
      list.add(filter_prefix);

    return list.hashCode();
  }

  @Override
  public int compareTo(TTopicRegistration other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTopic_name()).compareTo(other.isSetTopic_name());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTopic_name()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.topic_name, other.topic_name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIs_transient()).compareTo(other.isSetIs_transient());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIs_transient()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.is_transient, other.is_transient);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPopulate_min_subscriber_topic_version()).compareTo(other.isSetPopulate_min_subscriber_topic_version());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPopulate_min_subscriber_topic_version()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.populate_min_subscriber_topic_version, other.populate_min_subscriber_topic_version);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFilter_prefix()).compareTo(other.isSetFilter_prefix());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFilter_prefix()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.filter_prefix, other.filter_prefix);
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
    StringBuilder sb = new StringBuilder("TTopicRegistration(");
    boolean first = true;

    sb.append("topic_name:");
    if (this.topic_name == null) {
      sb.append("null");
    } else {
      sb.append(this.topic_name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("is_transient:");
    sb.append(this.is_transient);
    first = false;
    if (!first) sb.append(", ");
    sb.append("populate_min_subscriber_topic_version:");
    sb.append(this.populate_min_subscriber_topic_version);
    first = false;
    if (isSetFilter_prefix()) {
      if (!first) sb.append(", ");
      sb.append("filter_prefix:");
      if (this.filter_prefix == null) {
        sb.append("null");
      } else {
        sb.append(this.filter_prefix);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetTopic_name()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'topic_name' is unset! Struct:" + toString());
    }

    if (!isSetIs_transient()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'is_transient' is unset! Struct:" + toString());
    }

    if (!isSetPopulate_min_subscriber_topic_version()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'populate_min_subscriber_topic_version' is unset! Struct:" + toString());
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

  private static class TTopicRegistrationStandardSchemeFactory implements SchemeFactory {
    public TTopicRegistrationStandardScheme getScheme() {
      return new TTopicRegistrationStandardScheme();
    }
  }

  private static class TTopicRegistrationStandardScheme extends StandardScheme<TTopicRegistration> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TTopicRegistration struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TOPIC_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.topic_name = iprot.readString();
              struct.setTopic_nameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // IS_TRANSIENT
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.is_transient = iprot.readBool();
              struct.setIs_transientIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // POPULATE_MIN_SUBSCRIBER_TOPIC_VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.populate_min_subscriber_topic_version = iprot.readBool();
              struct.setPopulate_min_subscriber_topic_versionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // FILTER_PREFIX
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.filter_prefix = iprot.readString();
              struct.setFilter_prefixIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TTopicRegistration struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.topic_name != null) {
        oprot.writeFieldBegin(TOPIC_NAME_FIELD_DESC);
        oprot.writeString(struct.topic_name);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(IS_TRANSIENT_FIELD_DESC);
      oprot.writeBool(struct.is_transient);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(POPULATE_MIN_SUBSCRIBER_TOPIC_VERSION_FIELD_DESC);
      oprot.writeBool(struct.populate_min_subscriber_topic_version);
      oprot.writeFieldEnd();
      if (struct.filter_prefix != null) {
        if (struct.isSetFilter_prefix()) {
          oprot.writeFieldBegin(FILTER_PREFIX_FIELD_DESC);
          oprot.writeString(struct.filter_prefix);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TTopicRegistrationTupleSchemeFactory implements SchemeFactory {
    public TTopicRegistrationTupleScheme getScheme() {
      return new TTopicRegistrationTupleScheme();
    }
  }

  private static class TTopicRegistrationTupleScheme extends TupleScheme<TTopicRegistration> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TTopicRegistration struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.topic_name);
      oprot.writeBool(struct.is_transient);
      oprot.writeBool(struct.populate_min_subscriber_topic_version);
      BitSet optionals = new BitSet();
      if (struct.isSetFilter_prefix()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetFilter_prefix()) {
        oprot.writeString(struct.filter_prefix);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TTopicRegistration struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.topic_name = iprot.readString();
      struct.setTopic_nameIsSet(true);
      struct.is_transient = iprot.readBool();
      struct.setIs_transientIsSet(true);
      struct.populate_min_subscriber_topic_version = iprot.readBool();
      struct.setPopulate_min_subscriber_topic_versionIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.filter_prefix = iprot.readString();
        struct.setFilter_prefixIsSet(true);
      }
    }
  }

}
