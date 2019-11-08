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
public class TShowFilesParams implements org.apache.thrift.TBase<TShowFilesParams, TShowFilesParams._Fields>, java.io.Serializable, Cloneable, Comparable<TShowFilesParams> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TShowFilesParams");

  private static final org.apache.thrift.protocol.TField TABLE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("table_name", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField PARTITION_SET_FIELD_DESC = new org.apache.thrift.protocol.TField("partition_set", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TShowFilesParamsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TShowFilesParamsTupleSchemeFactory());
  }

  public org.apache.impala.thrift.TTableName table_name; // required
  public List<List<org.apache.impala.thrift.TPartitionKeyValue>> partition_set; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TABLE_NAME((short)1, "table_name"),
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
        case 1: // TABLE_NAME
          return TABLE_NAME;
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
    tmpMap.put(_Fields.TABLE_NAME, new org.apache.thrift.meta_data.FieldMetaData("table_name", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.impala.thrift.TTableName.class)));
    tmpMap.put(_Fields.PARTITION_SET, new org.apache.thrift.meta_data.FieldMetaData("partition_set", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
                new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.impala.thrift.TPartitionKeyValue.class)))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TShowFilesParams.class, metaDataMap);
  }

  public TShowFilesParams() {
  }

  public TShowFilesParams(
    org.apache.impala.thrift.TTableName table_name)
  {
    this();
    this.table_name = table_name;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TShowFilesParams(TShowFilesParams other) {
    if (other.isSetTable_name()) {
      this.table_name = new org.apache.impala.thrift.TTableName(other.table_name);
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

  public TShowFilesParams deepCopy() {
    return new TShowFilesParams(this);
  }

  @Override
  public void clear() {
    this.table_name = null;
    this.partition_set = null;
  }

  public org.apache.impala.thrift.TTableName getTable_name() {
    return this.table_name;
  }

  public TShowFilesParams setTable_name(org.apache.impala.thrift.TTableName table_name) {
    this.table_name = table_name;
    return this;
  }

  public void unsetTable_name() {
    this.table_name = null;
  }

  /** Returns true if field table_name is set (has been assigned a value) and false otherwise */
  public boolean isSetTable_name() {
    return this.table_name != null;
  }

  public void setTable_nameIsSet(boolean value) {
    if (!value) {
      this.table_name = null;
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

  public TShowFilesParams setPartition_set(List<List<org.apache.impala.thrift.TPartitionKeyValue>> partition_set) {
    this.partition_set = partition_set;
    return this;
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
    case TABLE_NAME:
      if (value == null) {
        unsetTable_name();
      } else {
        setTable_name((org.apache.impala.thrift.TTableName)value);
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
    case TABLE_NAME:
      return getTable_name();

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
    case TABLE_NAME:
      return isSetTable_name();
    case PARTITION_SET:
      return isSetPartition_set();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TShowFilesParams)
      return this.equals((TShowFilesParams)that);
    return false;
  }

  public boolean equals(TShowFilesParams that) {
    if (that == null)
      return false;

    boolean this_present_table_name = true && this.isSetTable_name();
    boolean that_present_table_name = true && that.isSetTable_name();
    if (this_present_table_name || that_present_table_name) {
      if (!(this_present_table_name && that_present_table_name))
        return false;
      if (!this.table_name.equals(that.table_name))
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

    boolean present_table_name = true && (isSetTable_name());
    list.add(present_table_name);
    if (present_table_name)
      list.add(table_name);

    boolean present_partition_set = true && (isSetPartition_set());
    list.add(present_partition_set);
    if (present_partition_set)
      list.add(partition_set);

    return list.hashCode();
  }

  @Override
  public int compareTo(TShowFilesParams other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTable_name()).compareTo(other.isSetTable_name());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTable_name()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.table_name, other.table_name);
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
    StringBuilder sb = new StringBuilder("TShowFilesParams(");
    boolean first = true;

    sb.append("table_name:");
    if (this.table_name == null) {
      sb.append("null");
    } else {
      sb.append(this.table_name);
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
    if (table_name == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'table_name' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (table_name != null) {
      table_name.validate();
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

  private static class TShowFilesParamsStandardSchemeFactory implements SchemeFactory {
    public TShowFilesParamsStandardScheme getScheme() {
      return new TShowFilesParamsStandardScheme();
    }
  }

  private static class TShowFilesParamsStandardScheme extends StandardScheme<TShowFilesParams> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TShowFilesParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TABLE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.table_name = new org.apache.impala.thrift.TTableName();
              struct.table_name.read(iprot);
              struct.setTable_nameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PARTITION_SET
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list64 = iprot.readListBegin();
                struct.partition_set = new ArrayList<List<org.apache.impala.thrift.TPartitionKeyValue>>(_list64.size);
                List<org.apache.impala.thrift.TPartitionKeyValue> _elem65;
                for (int _i66 = 0; _i66 < _list64.size; ++_i66)
                {
                  {
                    org.apache.thrift.protocol.TList _list67 = iprot.readListBegin();
                    _elem65 = new ArrayList<org.apache.impala.thrift.TPartitionKeyValue>(_list67.size);
                    org.apache.impala.thrift.TPartitionKeyValue _elem68;
                    for (int _i69 = 0; _i69 < _list67.size; ++_i69)
                    {
                      _elem68 = new org.apache.impala.thrift.TPartitionKeyValue();
                      _elem68.read(iprot);
                      _elem65.add(_elem68);
                    }
                    iprot.readListEnd();
                  }
                  struct.partition_set.add(_elem65);
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

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TShowFilesParams struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.table_name != null) {
        oprot.writeFieldBegin(TABLE_NAME_FIELD_DESC);
        struct.table_name.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.partition_set != null) {
        if (struct.isSetPartition_set()) {
          oprot.writeFieldBegin(PARTITION_SET_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.LIST, struct.partition_set.size()));
            for (List<org.apache.impala.thrift.TPartitionKeyValue> _iter70 : struct.partition_set)
            {
              {
                oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, _iter70.size()));
                for (org.apache.impala.thrift.TPartitionKeyValue _iter71 : _iter70)
                {
                  _iter71.write(oprot);
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

  private static class TShowFilesParamsTupleSchemeFactory implements SchemeFactory {
    public TShowFilesParamsTupleScheme getScheme() {
      return new TShowFilesParamsTupleScheme();
    }
  }

  private static class TShowFilesParamsTupleScheme extends TupleScheme<TShowFilesParams> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TShowFilesParams struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.table_name.write(oprot);
      BitSet optionals = new BitSet();
      if (struct.isSetPartition_set()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetPartition_set()) {
        {
          oprot.writeI32(struct.partition_set.size());
          for (List<org.apache.impala.thrift.TPartitionKeyValue> _iter72 : struct.partition_set)
          {
            {
              oprot.writeI32(_iter72.size());
              for (org.apache.impala.thrift.TPartitionKeyValue _iter73 : _iter72)
              {
                _iter73.write(oprot);
              }
            }
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TShowFilesParams struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.table_name = new org.apache.impala.thrift.TTableName();
      struct.table_name.read(iprot);
      struct.setTable_nameIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list74 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.LIST, iprot.readI32());
          struct.partition_set = new ArrayList<List<org.apache.impala.thrift.TPartitionKeyValue>>(_list74.size);
          List<org.apache.impala.thrift.TPartitionKeyValue> _elem75;
          for (int _i76 = 0; _i76 < _list74.size; ++_i76)
          {
            {
              org.apache.thrift.protocol.TList _list77 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
              _elem75 = new ArrayList<org.apache.impala.thrift.TPartitionKeyValue>(_list77.size);
              org.apache.impala.thrift.TPartitionKeyValue _elem78;
              for (int _i79 = 0; _i79 < _list77.size; ++_i79)
              {
                _elem78 = new org.apache.impala.thrift.TPartitionKeyValue();
                _elem78.read(iprot);
                _elem75.add(_elem78);
              }
            }
            struct.partition_set.add(_elem75);
          }
        }
        struct.setPartition_setIsSet(true);
      }
    }
  }

}

