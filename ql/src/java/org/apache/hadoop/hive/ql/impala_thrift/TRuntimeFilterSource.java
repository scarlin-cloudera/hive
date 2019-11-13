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
public class TRuntimeFilterSource implements org.apache.thrift.TBase<TRuntimeFilterSource, TRuntimeFilterSource._Fields>, java.io.Serializable, Cloneable, Comparable<TRuntimeFilterSource> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TRuntimeFilterSource");

  private static final org.apache.thrift.protocol.TField SRC_NODE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("src_node_id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField FILTER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("filter_id", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TRuntimeFilterSourceStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TRuntimeFilterSourceTupleSchemeFactory());
  }

  public int src_node_id; // required
  public int filter_id; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SRC_NODE_ID((short)1, "src_node_id"),
    FILTER_ID((short)2, "filter_id");

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
        case 1: // SRC_NODE_ID
          return SRC_NODE_ID;
        case 2: // FILTER_ID
          return FILTER_ID;
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
  private static final int __SRC_NODE_ID_ISSET_ID = 0;
  private static final int __FILTER_ID_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SRC_NODE_ID, new org.apache.thrift.meta_data.FieldMetaData("src_node_id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "TPlanNodeId")));
    tmpMap.put(_Fields.FILTER_ID, new org.apache.thrift.meta_data.FieldMetaData("filter_id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TRuntimeFilterSource.class, metaDataMap);
  }

  public TRuntimeFilterSource() {
  }

  public TRuntimeFilterSource(
    int src_node_id,
    int filter_id)
  {
    this();
    this.src_node_id = src_node_id;
    setSrc_node_idIsSet(true);
    this.filter_id = filter_id;
    setFilter_idIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TRuntimeFilterSource(TRuntimeFilterSource other) {
    __isset_bitfield = other.__isset_bitfield;
    this.src_node_id = other.src_node_id;
    this.filter_id = other.filter_id;
  }

  public TRuntimeFilterSource deepCopy() {
    return new TRuntimeFilterSource(this);
  }

  @Override
  public void clear() {
    setSrc_node_idIsSet(false);
    this.src_node_id = 0;
    setFilter_idIsSet(false);
    this.filter_id = 0;
  }

  public int getSrc_node_id() {
    return this.src_node_id;
  }

  public TRuntimeFilterSource setSrc_node_id(int src_node_id) {
    this.src_node_id = src_node_id;
    setSrc_node_idIsSet(true);
    return this;
  }

  public void unsetSrc_node_id() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SRC_NODE_ID_ISSET_ID);
  }

  /** Returns true if field src_node_id is set (has been assigned a value) and false otherwise */
  public boolean isSetSrc_node_id() {
    return EncodingUtils.testBit(__isset_bitfield, __SRC_NODE_ID_ISSET_ID);
  }

  public void setSrc_node_idIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SRC_NODE_ID_ISSET_ID, value);
  }

  public int getFilter_id() {
    return this.filter_id;
  }

  public TRuntimeFilterSource setFilter_id(int filter_id) {
    this.filter_id = filter_id;
    setFilter_idIsSet(true);
    return this;
  }

  public void unsetFilter_id() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __FILTER_ID_ISSET_ID);
  }

  /** Returns true if field filter_id is set (has been assigned a value) and false otherwise */
  public boolean isSetFilter_id() {
    return EncodingUtils.testBit(__isset_bitfield, __FILTER_ID_ISSET_ID);
  }

  public void setFilter_idIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __FILTER_ID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SRC_NODE_ID:
      if (value == null) {
        unsetSrc_node_id();
      } else {
        setSrc_node_id((Integer)value);
      }
      break;

    case FILTER_ID:
      if (value == null) {
        unsetFilter_id();
      } else {
        setFilter_id((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SRC_NODE_ID:
      return getSrc_node_id();

    case FILTER_ID:
      return getFilter_id();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SRC_NODE_ID:
      return isSetSrc_node_id();
    case FILTER_ID:
      return isSetFilter_id();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TRuntimeFilterSource)
      return this.equals((TRuntimeFilterSource)that);
    return false;
  }

  public boolean equals(TRuntimeFilterSource that) {
    if (that == null)
      return false;

    boolean this_present_src_node_id = true;
    boolean that_present_src_node_id = true;
    if (this_present_src_node_id || that_present_src_node_id) {
      if (!(this_present_src_node_id && that_present_src_node_id))
        return false;
      if (this.src_node_id != that.src_node_id)
        return false;
    }

    boolean this_present_filter_id = true;
    boolean that_present_filter_id = true;
    if (this_present_filter_id || that_present_filter_id) {
      if (!(this_present_filter_id && that_present_filter_id))
        return false;
      if (this.filter_id != that.filter_id)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_src_node_id = true;
    list.add(present_src_node_id);
    if (present_src_node_id)
      list.add(src_node_id);

    boolean present_filter_id = true;
    list.add(present_filter_id);
    if (present_filter_id)
      list.add(filter_id);

    return list.hashCode();
  }

  @Override
  public int compareTo(TRuntimeFilterSource other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSrc_node_id()).compareTo(other.isSetSrc_node_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSrc_node_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.src_node_id, other.src_node_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFilter_id()).compareTo(other.isSetFilter_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFilter_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.filter_id, other.filter_id);
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
    StringBuilder sb = new StringBuilder("TRuntimeFilterSource(");
    boolean first = true;

    sb.append("src_node_id:");
    sb.append(this.src_node_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("filter_id:");
    sb.append(this.filter_id);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'src_node_id' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'filter_id' because it's a primitive and you chose the non-beans generator.
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

  private static class TRuntimeFilterSourceStandardSchemeFactory implements SchemeFactory {
    public TRuntimeFilterSourceStandardScheme getScheme() {
      return new TRuntimeFilterSourceStandardScheme();
    }
  }

  private static class TRuntimeFilterSourceStandardScheme extends StandardScheme<TRuntimeFilterSource> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TRuntimeFilterSource struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SRC_NODE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.src_node_id = iprot.readI32();
              struct.setSrc_node_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // FILTER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.filter_id = iprot.readI32();
              struct.setFilter_idIsSet(true);
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
      if (!struct.isSetSrc_node_id()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'src_node_id' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetFilter_id()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'filter_id' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TRuntimeFilterSource struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(SRC_NODE_ID_FIELD_DESC);
      oprot.writeI32(struct.src_node_id);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(FILTER_ID_FIELD_DESC);
      oprot.writeI32(struct.filter_id);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TRuntimeFilterSourceTupleSchemeFactory implements SchemeFactory {
    public TRuntimeFilterSourceTupleScheme getScheme() {
      return new TRuntimeFilterSourceTupleScheme();
    }
  }

  private static class TRuntimeFilterSourceTupleScheme extends TupleScheme<TRuntimeFilterSource> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TRuntimeFilterSource struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.src_node_id);
      oprot.writeI32(struct.filter_id);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TRuntimeFilterSource struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.src_node_id = iprot.readI32();
      struct.setSrc_node_idIsSet(true);
      struct.filter_id = iprot.readI32();
      struct.setFilter_idIsSet(true);
    }
  }

}
