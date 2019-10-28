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
public class TAlterTableSetCachedParams implements org.apache.thrift.TBase<TAlterTableSetCachedParams, TAlterTableSetCachedParams._Fields>, java.io.Serializable, Cloneable, Comparable<TAlterTableSetCachedParams> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TAlterTableSetCachedParams");

  private static final org.apache.thrift.protocol.TField CACHE_OP_FIELD_DESC = new org.apache.thrift.protocol.TField("cache_op", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField PARTITION_SET_FIELD_DESC = new org.apache.thrift.protocol.TField("partition_set", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TAlterTableSetCachedParamsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TAlterTableSetCachedParamsTupleSchemeFactory());
  }

  private THdfsCachingOp cache_op; // required
  private List<List<org.apache.impala.thrift.TPartitionKeyValue>> partition_set; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CACHE_OP((short)1, "cache_op"),
    PARTITION_SET((short)2, "partition_set");

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
        case 1: // CACHE_OP
          return CACHE_OP;
        case 2: // PARTITION_SET
          return PARTITION_SET;
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
  private static final _Fields optionals[] = {_Fields.PARTITION_SET};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CACHE_OP, new org.apache.thrift.meta_data.FieldMetaData("cache_op", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, THdfsCachingOp.class)));
    tmpMap.put(_Fields.PARTITION_SET, new org.apache.thrift.meta_data.FieldMetaData("partition_set", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
                new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.impala.thrift.TPartitionKeyValue.class)))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TAlterTableSetCachedParams.class, metaDataMap);
  }

  public TAlterTableSetCachedParams() {
  }

  public TAlterTableSetCachedParams(
    THdfsCachingOp cache_op)
  {
    this();
    this.cache_op = cache_op;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TAlterTableSetCachedParams(TAlterTableSetCachedParams other) {
    if (other.isSetCache_op()) {
      this.cache_op = new THdfsCachingOp(other.cache_op);
    }
    if (other.isSetPartition_set()) {
      List<List<org.apache.impala.thrift.TPartitionKeyValue>> __this__partition_set = new ArrayList<List<org.apache.impala.thrift.TPartitionKeyValue>>(other.partition_set.size());
      for (List<org.apache.impala.thrift.TPartitionKeyValue> other_element : other.partition_set) {
        List<org.apache.impala.thrift.TPartitionKeyValue> __this__partition_set_copy = new ArrayList<org.apache.impala.thrift.TPartitionKeyValue>(other_element.size());
        for (org.apache.impala.thrift.TPartitionKeyValue other_element_element : other_element) {
          __this__partition_set_copy.add(new org.apache.impala.thrift.TPartitionKeyValue(other_element_element));
        }
        __this__partition_set.add(__this__partition_set_copy);
      }
      this.partition_set = __this__partition_set;
    }
  }

  public TAlterTableSetCachedParams deepCopy() {
    return new TAlterTableSetCachedParams(this);
  }

  @Override
  public void clear() {
    this.cache_op = null;
    this.partition_set = null;
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

  public int getPartition_setSize() {
    return (this.partition_set == null) ? 0 : this.partition_set.size();
  }

  public java.util.Iterator<List<org.apache.impala.thrift.TPartitionKeyValue>> getPartition_setIterator() {
    return (this.partition_set == null) ? null : this.partition_set.iterator();
  }

  public void addToPartition_set(List<org.apache.impala.thrift.TPartitionKeyValue> elem) {
    if (this.partition_set == null) {
      this.partition_set = new ArrayList<List<org.apache.impala.thrift.TPartitionKeyValue>>();
    }
    this.partition_set.add(elem);
  }

  public List<List<org.apache.impala.thrift.TPartitionKeyValue>> getPartition_set() {
    return this.partition_set;
  }

  public void setPartition_set(List<List<org.apache.impala.thrift.TPartitionKeyValue>> partition_set) {
    this.partition_set = partition_set;
  }

  public void unsetPartition_set() {
    this.partition_set = null;
  }

  /** Returns true if field partition_set is set (has been assigned a value) and false otherwise */
  public boolean isSetPartition_set() {
    return this.partition_set != null;
  }

  public void setPartition_setIsSet(boolean value) {
    if (!value) {
      this.partition_set = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CACHE_OP:
      if (value == null) {
        unsetCache_op();
      } else {
        setCache_op((THdfsCachingOp)value);
      }
      break;

    case PARTITION_SET:
      if (value == null) {
        unsetPartition_set();
      } else {
        setPartition_set((List<List<org.apache.impala.thrift.TPartitionKeyValue>>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CACHE_OP:
      return getCache_op();

    case PARTITION_SET:
      return getPartition_set();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CACHE_OP:
      return isSetCache_op();
    case PARTITION_SET:
      return isSetPartition_set();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TAlterTableSetCachedParams)
      return this.equals((TAlterTableSetCachedParams)that);
    return false;
  }

  public boolean equals(TAlterTableSetCachedParams that) {
    if (that == null)
      return false;

    boolean this_present_cache_op = true && this.isSetCache_op();
    boolean that_present_cache_op = true && that.isSetCache_op();
    if (this_present_cache_op || that_present_cache_op) {
      if (!(this_present_cache_op && that_present_cache_op))
        return false;
      if (!this.cache_op.equals(that.cache_op))
        return false;
    }

    boolean this_present_partition_set = true && this.isSetPartition_set();
    boolean that_present_partition_set = true && that.isSetPartition_set();
    if (this_present_partition_set || that_present_partition_set) {
      if (!(this_present_partition_set && that_present_partition_set))
        return false;
      if (!this.partition_set.equals(that.partition_set))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_cache_op = true && (isSetCache_op());
    list.add(present_cache_op);
    if (present_cache_op)
      list.add(cache_op);

    boolean present_partition_set = true && (isSetPartition_set());
    list.add(present_partition_set);
    if (present_partition_set)
      list.add(partition_set);

    return list.hashCode();
  }

  @Override
  public int compareTo(TAlterTableSetCachedParams other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

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
    lastComparison = Boolean.valueOf(isSetPartition_set()).compareTo(other.isSetPartition_set());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartition_set()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.partition_set, other.partition_set);
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
    StringBuilder sb = new StringBuilder("TAlterTableSetCachedParams(");
    boolean first = true;

    sb.append("cache_op:");
    if (this.cache_op == null) {
      sb.append("null");
    } else {
      sb.append(this.cache_op);
    }
    first = false;
    if (isSetPartition_set()) {
      if (!first) sb.append(", ");
      sb.append("partition_set:");
      if (this.partition_set == null) {
        sb.append("null");
      } else {
        sb.append(this.partition_set);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetCache_op()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'cache_op' is unset! Struct:" + toString());
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

  private static class TAlterTableSetCachedParamsStandardSchemeFactory implements SchemeFactory {
    public TAlterTableSetCachedParamsStandardScheme getScheme() {
      return new TAlterTableSetCachedParamsStandardScheme();
    }
  }

  private static class TAlterTableSetCachedParamsStandardScheme extends StandardScheme<TAlterTableSetCachedParams> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TAlterTableSetCachedParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CACHE_OP
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.cache_op = new THdfsCachingOp();
              struct.cache_op.read(iprot);
              struct.setCache_opIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PARTITION_SET
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list158 = iprot.readListBegin();
                struct.partition_set = new ArrayList<List<org.apache.impala.thrift.TPartitionKeyValue>>(_list158.size);
                List<org.apache.impala.thrift.TPartitionKeyValue> _elem159;
                for (int _i160 = 0; _i160 < _list158.size; ++_i160)
                {
                  {
                    org.apache.thrift.protocol.TList _list161 = iprot.readListBegin();
                    _elem159 = new ArrayList<org.apache.impala.thrift.TPartitionKeyValue>(_list161.size);
                    org.apache.impala.thrift.TPartitionKeyValue _elem162;
                    for (int _i163 = 0; _i163 < _list161.size; ++_i163)
                    {
                      _elem162 = new org.apache.impala.thrift.TPartitionKeyValue();
                      _elem162.read(iprot);
                      _elem159.add(_elem162);
                    }
                    iprot.readListEnd();
                  }
                  struct.partition_set.add(_elem159);
                }
                iprot.readListEnd();
              }
              struct.setPartition_setIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TAlterTableSetCachedParams struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.cache_op != null) {
        oprot.writeFieldBegin(CACHE_OP_FIELD_DESC);
        struct.cache_op.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.partition_set != null) {
        if (struct.isSetPartition_set()) {
          oprot.writeFieldBegin(PARTITION_SET_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.LIST, struct.partition_set.size()));
            for (List<org.apache.impala.thrift.TPartitionKeyValue> _iter164 : struct.partition_set)
            {
              {
                oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, _iter164.size()));
                for (org.apache.impala.thrift.TPartitionKeyValue _iter165 : _iter164)
                {
                  _iter165.write(oprot);
                }
                oprot.writeListEnd();
              }
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TAlterTableSetCachedParamsTupleSchemeFactory implements SchemeFactory {
    public TAlterTableSetCachedParamsTupleScheme getScheme() {
      return new TAlterTableSetCachedParamsTupleScheme();
    }
  }

  private static class TAlterTableSetCachedParamsTupleScheme extends TupleScheme<TAlterTableSetCachedParams> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TAlterTableSetCachedParams struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.cache_op.write(oprot);
      BitSet optionals = new BitSet();
      if (struct.isSetPartition_set()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetPartition_set()) {
        {
          oprot.writeI32(struct.partition_set.size());
          for (List<org.apache.impala.thrift.TPartitionKeyValue> _iter166 : struct.partition_set)
          {
            {
              oprot.writeI32(_iter166.size());
              for (org.apache.impala.thrift.TPartitionKeyValue _iter167 : _iter166)
              {
                _iter167.write(oprot);
              }
            }
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TAlterTableSetCachedParams struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.cache_op = new THdfsCachingOp();
      struct.cache_op.read(iprot);
      struct.setCache_opIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list168 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.LIST, iprot.readI32());
          struct.partition_set = new ArrayList<List<org.apache.impala.thrift.TPartitionKeyValue>>(_list168.size);
          List<org.apache.impala.thrift.TPartitionKeyValue> _elem169;
          for (int _i170 = 0; _i170 < _list168.size; ++_i170)
          {
            {
              org.apache.thrift.protocol.TList _list171 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
              _elem169 = new ArrayList<org.apache.impala.thrift.TPartitionKeyValue>(_list171.size);
              org.apache.impala.thrift.TPartitionKeyValue _elem172;
              for (int _i173 = 0; _i173 < _list171.size; ++_i173)
              {
                _elem172 = new org.apache.impala.thrift.TPartitionKeyValue();
                _elem172.read(iprot);
                _elem169.add(_elem172);
              }
            }
            struct.partition_set.add(_elem169);
          }
        }
        struct.setPartition_setIsSet(true);
      }
    }
  }

}

