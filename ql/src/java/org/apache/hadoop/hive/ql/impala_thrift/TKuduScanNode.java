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
public class TKuduScanNode implements org.apache.thrift.TBase<TKuduScanNode, TKuduScanNode._Fields>, java.io.Serializable, Cloneable, Comparable<TKuduScanNode> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TKuduScanNode");

  private static final org.apache.thrift.protocol.TField TUPLE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("tuple_id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField USE_MT_SCAN_NODE_FIELD_DESC = new org.apache.thrift.protocol.TField("use_mt_scan_node", org.apache.thrift.protocol.TType.BOOL, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TKuduScanNodeStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TKuduScanNodeTupleSchemeFactory());
  }

  private int tuple_id; // required
  private boolean use_mt_scan_node; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TUPLE_ID((short)1, "tuple_id"),
    USE_MT_SCAN_NODE((short)2, "use_mt_scan_node");

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
        case 1: // TUPLE_ID
          return TUPLE_ID;
        case 2: // USE_MT_SCAN_NODE
          return USE_MT_SCAN_NODE;
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
  private static final int __TUPLE_ID_ISSET_ID = 0;
  private static final int __USE_MT_SCAN_NODE_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.USE_MT_SCAN_NODE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TUPLE_ID, new org.apache.thrift.meta_data.FieldMetaData("tuple_id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "TTupleId")));
    tmpMap.put(_Fields.USE_MT_SCAN_NODE, new org.apache.thrift.meta_data.FieldMetaData("use_mt_scan_node", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TKuduScanNode.class, metaDataMap);
  }

  public TKuduScanNode() {
  }

  public TKuduScanNode(
    int tuple_id)
  {
    this();
    this.tuple_id = tuple_id;
    setTuple_idIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TKuduScanNode(TKuduScanNode other) {
    __isset_bitfield = other.__isset_bitfield;
    this.tuple_id = other.tuple_id;
    this.use_mt_scan_node = other.use_mt_scan_node;
  }

  public TKuduScanNode deepCopy() {
    return new TKuduScanNode(this);
  }

  @Override
  public void clear() {
    setTuple_idIsSet(false);
    this.tuple_id = 0;
    setUse_mt_scan_nodeIsSet(false);
    this.use_mt_scan_node = false;
  }

  public int getTuple_id() {
    return this.tuple_id;
  }

  public void setTuple_id(int tuple_id) {
    this.tuple_id = tuple_id;
    setTuple_idIsSet(true);
  }

  public void unsetTuple_id() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TUPLE_ID_ISSET_ID);
  }

  /** Returns true if field tuple_id is set (has been assigned a value) and false otherwise */
  public boolean isSetTuple_id() {
    return EncodingUtils.testBit(__isset_bitfield, __TUPLE_ID_ISSET_ID);
  }

  public void setTuple_idIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TUPLE_ID_ISSET_ID, value);
  }

  public boolean isUse_mt_scan_node() {
    return this.use_mt_scan_node;
  }

  public void setUse_mt_scan_node(boolean use_mt_scan_node) {
    this.use_mt_scan_node = use_mt_scan_node;
    setUse_mt_scan_nodeIsSet(true);
  }

  public void unsetUse_mt_scan_node() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __USE_MT_SCAN_NODE_ISSET_ID);
  }

  /** Returns true if field use_mt_scan_node is set (has been assigned a value) and false otherwise */
  public boolean isSetUse_mt_scan_node() {
    return EncodingUtils.testBit(__isset_bitfield, __USE_MT_SCAN_NODE_ISSET_ID);
  }

  public void setUse_mt_scan_nodeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __USE_MT_SCAN_NODE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TUPLE_ID:
      if (value == null) {
        unsetTuple_id();
      } else {
        setTuple_id((Integer)value);
      }
      break;

    case USE_MT_SCAN_NODE:
      if (value == null) {
        unsetUse_mt_scan_node();
      } else {
        setUse_mt_scan_node((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TUPLE_ID:
      return getTuple_id();

    case USE_MT_SCAN_NODE:
      return isUse_mt_scan_node();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TUPLE_ID:
      return isSetTuple_id();
    case USE_MT_SCAN_NODE:
      return isSetUse_mt_scan_node();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TKuduScanNode)
      return this.equals((TKuduScanNode)that);
    return false;
  }

  public boolean equals(TKuduScanNode that) {
    if (that == null)
      return false;

    boolean this_present_tuple_id = true;
    boolean that_present_tuple_id = true;
    if (this_present_tuple_id || that_present_tuple_id) {
      if (!(this_present_tuple_id && that_present_tuple_id))
        return false;
      if (this.tuple_id != that.tuple_id)
        return false;
    }

    boolean this_present_use_mt_scan_node = true && this.isSetUse_mt_scan_node();
    boolean that_present_use_mt_scan_node = true && that.isSetUse_mt_scan_node();
    if (this_present_use_mt_scan_node || that_present_use_mt_scan_node) {
      if (!(this_present_use_mt_scan_node && that_present_use_mt_scan_node))
        return false;
      if (this.use_mt_scan_node != that.use_mt_scan_node)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_tuple_id = true;
    list.add(present_tuple_id);
    if (present_tuple_id)
      list.add(tuple_id);

    boolean present_use_mt_scan_node = true && (isSetUse_mt_scan_node());
    list.add(present_use_mt_scan_node);
    if (present_use_mt_scan_node)
      list.add(use_mt_scan_node);

    return list.hashCode();
  }

  @Override
  public int compareTo(TKuduScanNode other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTuple_id()).compareTo(other.isSetTuple_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTuple_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tuple_id, other.tuple_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUse_mt_scan_node()).compareTo(other.isSetUse_mt_scan_node());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUse_mt_scan_node()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.use_mt_scan_node, other.use_mt_scan_node);
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
    StringBuilder sb = new StringBuilder("TKuduScanNode(");
    boolean first = true;

    sb.append("tuple_id:");
    sb.append(this.tuple_id);
    first = false;
    if (isSetUse_mt_scan_node()) {
      if (!first) sb.append(", ");
      sb.append("use_mt_scan_node:");
      sb.append(this.use_mt_scan_node);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetTuple_id()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'tuple_id' is unset! Struct:" + toString());
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

  private static class TKuduScanNodeStandardSchemeFactory implements SchemeFactory {
    public TKuduScanNodeStandardScheme getScheme() {
      return new TKuduScanNodeStandardScheme();
    }
  }

  private static class TKuduScanNodeStandardScheme extends StandardScheme<TKuduScanNode> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TKuduScanNode struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TUPLE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.tuple_id = iprot.readI32();
              struct.setTuple_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // USE_MT_SCAN_NODE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.use_mt_scan_node = iprot.readBool();
              struct.setUse_mt_scan_nodeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TKuduScanNode struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(TUPLE_ID_FIELD_DESC);
      oprot.writeI32(struct.tuple_id);
      oprot.writeFieldEnd();
      if (struct.isSetUse_mt_scan_node()) {
        oprot.writeFieldBegin(USE_MT_SCAN_NODE_FIELD_DESC);
        oprot.writeBool(struct.use_mt_scan_node);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TKuduScanNodeTupleSchemeFactory implements SchemeFactory {
    public TKuduScanNodeTupleScheme getScheme() {
      return new TKuduScanNodeTupleScheme();
    }
  }

  private static class TKuduScanNodeTupleScheme extends TupleScheme<TKuduScanNode> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TKuduScanNode struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.tuple_id);
      BitSet optionals = new BitSet();
      if (struct.isSetUse_mt_scan_node()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetUse_mt_scan_node()) {
        oprot.writeBool(struct.use_mt_scan_node);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TKuduScanNode struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.tuple_id = iprot.readI32();
      struct.setTuple_idIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.use_mt_scan_node = iprot.readBool();
        struct.setUse_mt_scan_nodeIsSet(true);
      }
    }
  }

}

