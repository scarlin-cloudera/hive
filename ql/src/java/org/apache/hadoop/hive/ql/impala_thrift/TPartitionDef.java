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
public class TPartitionDef implements org.apache.thrift.TBase<TPartitionDef, TPartitionDef._Fields>, java.io.Serializable, Cloneable, Comparable<TPartitionDef> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TPartitionDef");

  private static final org.apache.thrift.protocol.TField PARTITION_SPEC_FIELD_DESC = new org.apache.thrift.protocol.TField("partition_spec", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField LOCATION_FIELD_DESC = new org.apache.thrift.protocol.TField("location", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField CACHE_OP_FIELD_DESC = new org.apache.thrift.protocol.TField("cache_op", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TPartitionDefStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TPartitionDefTupleSchemeFactory());
  }

  private List<org.apache.impala.thrift.TPartitionKeyValue> partition_spec; // required
  private String location; // optional
  private THdfsCachingOp cache_op; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PARTITION_SPEC((short)1, "partition_spec"),
    LOCATION((short)2, "location"),
    CACHE_OP((short)3, "cache_op");

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
        case 1: // PARTITION_SPEC
          return PARTITION_SPEC;
        case 2: // LOCATION
          return LOCATION;
        case 3: // CACHE_OP
          return CACHE_OP;
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
  private static final _Fields optionals[] = {_Fields.LOCATION,_Fields.CACHE_OP};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PARTITION_SPEC, new org.apache.thrift.meta_data.FieldMetaData("partition_spec", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.impala.thrift.TPartitionKeyValue.class))));
    tmpMap.put(_Fields.LOCATION, new org.apache.thrift.meta_data.FieldMetaData("location", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CACHE_OP, new org.apache.thrift.meta_data.FieldMetaData("cache_op", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, THdfsCachingOp.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TPartitionDef.class, metaDataMap);
  }

  public TPartitionDef() {
  }

  public TPartitionDef(
    List<org.apache.impala.thrift.TPartitionKeyValue> partition_spec)
  {
    this();
    this.partition_spec = partition_spec;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TPartitionDef(TPartitionDef other) {
    if (other.isSetPartition_spec()) {
      List<org.apache.impala.thrift.TPartitionKeyValue> __this__partition_spec = new ArrayList<org.apache.impala.thrift.TPartitionKeyValue>(other.partition_spec.size());
      for (org.apache.impala.thrift.TPartitionKeyValue other_element : other.partition_spec) {
        __this__partition_spec.add(new org.apache.impala.thrift.TPartitionKeyValue(other_element));
      }
      this.partition_spec = __this__partition_spec;
    }
    if (other.isSetLocation()) {
      this.location = other.location;
    }
    if (other.isSetCache_op()) {
      this.cache_op = new THdfsCachingOp(other.cache_op);
    }
  }

  public TPartitionDef deepCopy() {
    return new TPartitionDef(this);
  }

  @Override
  public void clear() {
    this.partition_spec = null;
    this.location = null;
    this.cache_op = null;
  }

  public int getPartition_specSize() {
    return (this.partition_spec == null) ? 0 : this.partition_spec.size();
  }

  public java.util.Iterator<org.apache.impala.thrift.TPartitionKeyValue> getPartition_specIterator() {
    return (this.partition_spec == null) ? null : this.partition_spec.iterator();
  }

  public void addToPartition_spec(org.apache.impala.thrift.TPartitionKeyValue elem) {
    if (this.partition_spec == null) {
      this.partition_spec = new ArrayList<org.apache.impala.thrift.TPartitionKeyValue>();
    }
    this.partition_spec.add(elem);
  }

  public List<org.apache.impala.thrift.TPartitionKeyValue> getPartition_spec() {
    return this.partition_spec;
  }

  public void setPartition_spec(List<org.apache.impala.thrift.TPartitionKeyValue> partition_spec) {
    this.partition_spec = partition_spec;
  }

  public void unsetPartition_spec() {
    this.partition_spec = null;
  }

  /** Returns true if field partition_spec is set (has been assigned a value) and false otherwise */
  public boolean isSetPartition_spec() {
    return this.partition_spec != null;
  }

  public void setPartition_specIsSet(boolean value) {
    if (!value) {
      this.partition_spec = null;
    }
  }

  public String getLocation() {
    return this.location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public void unsetLocation() {
    this.location = null;
  }

  /** Returns true if field location is set (has been assigned a value) and false otherwise */
  public boolean isSetLocation() {
    return this.location != null;
  }

  public void setLocationIsSet(boolean value) {
    if (!value) {
      this.location = null;
    }
  }

  public THdfsCachingOp getCache_op() {
    return this.cache_op;
  }

  public void setCache_op(THdfsCachingOp cache_op) {
    this.cache_op = cache_op;
  }

  public void unsetCache_op() {
    this.cache_op = null;
  }

  /** Returns true if field cache_op is set (has been assigned a value) and false otherwise */
  public boolean isSetCache_op() {
    return this.cache_op != null;
  }

  public void setCache_opIsSet(boolean value) {
    if (!value) {
      this.cache_op = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PARTITION_SPEC:
      if (value == null) {
        unsetPartition_spec();
      } else {
        setPartition_spec((List<org.apache.impala.thrift.TPartitionKeyValue>)value);
      }
      break;

    case LOCATION:
      if (value == null) {
        unsetLocation();
      } else {
        setLocation((String)value);
      }
      break;

    case CACHE_OP:
      if (value == null) {
        unsetCache_op();
      } else {
        setCache_op((THdfsCachingOp)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PARTITION_SPEC:
      return getPartition_spec();

    case LOCATION:
      return getLocation();

    case CACHE_OP:
      return getCache_op();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PARTITION_SPEC:
      return isSetPartition_spec();
    case LOCATION:
      return isSetLocation();
    case CACHE_OP:
      return isSetCache_op();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TPartitionDef)
      return this.equals((TPartitionDef)that);
    return false;
  }

  public boolean equals(TPartitionDef that) {
    if (that == null)
      return false;

    boolean this_present_partition_spec = true && this.isSetPartition_spec();
    boolean that_present_partition_spec = true && that.isSetPartition_spec();
    if (this_present_partition_spec || that_present_partition_spec) {
      if (!(this_present_partition_spec && that_present_partition_spec))
        return false;
      if (!this.partition_spec.equals(that.partition_spec))
        return false;
    }

    boolean this_present_location = true && this.isSetLocation();
    boolean that_present_location = true && that.isSetLocation();
    if (this_present_location || that_present_location) {
      if (!(this_present_location && that_present_location))
        return false;
      if (!this.location.equals(that.location))
        return false;
    }

    boolean this_present_cache_op = true && this.isSetCache_op();
    boolean that_present_cache_op = true && that.isSetCache_op();
    if (this_present_cache_op || that_present_cache_op) {
      if (!(this_present_cache_op && that_present_cache_op))
        return false;
      if (!this.cache_op.equals(that.cache_op))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_partition_spec = true && (isSetPartition_spec());
    list.add(present_partition_spec);
    if (present_partition_spec)
      list.add(partition_spec);

    boolean present_location = true && (isSetLocation());
    list.add(present_location);
    if (present_location)
      list.add(location);

    boolean present_cache_op = true && (isSetCache_op());
    list.add(present_cache_op);
    if (present_cache_op)
      list.add(cache_op);

    return list.hashCode();
  }

  @Override
  public int compareTo(TPartitionDef other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetPartition_spec()).compareTo(other.isSetPartition_spec());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartition_spec()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.partition_spec, other.partition_spec);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLocation()).compareTo(other.isSetLocation());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLocation()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.location, other.location);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCache_op()).compareTo(other.isSetCache_op());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCache_op()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cache_op, other.cache_op);
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
    StringBuilder sb = new StringBuilder("TPartitionDef(");
    boolean first = true;

    sb.append("partition_spec:");
    if (this.partition_spec == null) {
      sb.append("null");
    } else {
      sb.append(this.partition_spec);
    }
    first = false;
    if (isSetLocation()) {
      if (!first) sb.append(", ");
      sb.append("location:");
      if (this.location == null) {
        sb.append("null");
      } else {
        sb.append(this.location);
      }
      first = false;
    }
    if (isSetCache_op()) {
      if (!first) sb.append(", ");
      sb.append("cache_op:");
      if (this.cache_op == null) {
        sb.append("null");
      } else {
        sb.append(this.cache_op);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetPartition_spec()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'partition_spec' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
    if (cache_op != null) {
      cache_op.validate();
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

  private static class TPartitionDefStandardSchemeFactory implements SchemeFactory {
    public TPartitionDefStandardScheme getScheme() {
      return new TPartitionDefStandardScheme();
    }
  }

  private static class TPartitionDefStandardScheme extends StandardScheme<TPartitionDef> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TPartitionDef struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PARTITION_SPEC
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list32 = iprot.readListBegin();
                struct.partition_spec = new ArrayList<org.apache.impala.thrift.TPartitionKeyValue>(_list32.size);
                org.apache.impala.thrift.TPartitionKeyValue _elem33;
                for (int _i34 = 0; _i34 < _list32.size; ++_i34)
                {
                  _elem33 = new org.apache.impala.thrift.TPartitionKeyValue();
                  _elem33.read(iprot);
                  struct.partition_spec.add(_elem33);
                }
                iprot.readListEnd();
              }
              struct.setPartition_specIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // LOCATION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.location = iprot.readString();
              struct.setLocationIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CACHE_OP
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.cache_op = new THdfsCachingOp();
              struct.cache_op.read(iprot);
              struct.setCache_opIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TPartitionDef struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.partition_spec != null) {
        oprot.writeFieldBegin(PARTITION_SPEC_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.partition_spec.size()));
          for (org.apache.impala.thrift.TPartitionKeyValue _iter35 : struct.partition_spec)
          {
            _iter35.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.location != null) {
        if (struct.isSetLocation()) {
          oprot.writeFieldBegin(LOCATION_FIELD_DESC);
          oprot.writeString(struct.location);
          oprot.writeFieldEnd();
        }
      }
      if (struct.cache_op != null) {
        if (struct.isSetCache_op()) {
          oprot.writeFieldBegin(CACHE_OP_FIELD_DESC);
          struct.cache_op.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TPartitionDefTupleSchemeFactory implements SchemeFactory {
    public TPartitionDefTupleScheme getScheme() {
      return new TPartitionDefTupleScheme();
    }
  }

  private static class TPartitionDefTupleScheme extends TupleScheme<TPartitionDef> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TPartitionDef struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.partition_spec.size());
        for (org.apache.impala.thrift.TPartitionKeyValue _iter36 : struct.partition_spec)
        {
          _iter36.write(oprot);
        }
      }
      BitSet optionals = new BitSet();
      if (struct.isSetLocation()) {
        optionals.set(0);
      }
      if (struct.isSetCache_op()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetLocation()) {
        oprot.writeString(struct.location);
      }
      if (struct.isSetCache_op()) {
        struct.cache_op.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TPartitionDef struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list37 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.partition_spec = new ArrayList<org.apache.impala.thrift.TPartitionKeyValue>(_list37.size);
        org.apache.impala.thrift.TPartitionKeyValue _elem38;
        for (int _i39 = 0; _i39 < _list37.size; ++_i39)
        {
          _elem38 = new org.apache.impala.thrift.TPartitionKeyValue();
          _elem38.read(iprot);
          struct.partition_spec.add(_elem38);
        }
      }
      struct.setPartition_specIsSet(true);
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.location = iprot.readString();
        struct.setLocationIsSet(true);
      }
      if (incoming.get(1)) {
        struct.cache_op = new THdfsCachingOp();
        struct.cache_op.read(iprot);
        struct.setCache_opIsSet(true);
      }
    }
  }

}

