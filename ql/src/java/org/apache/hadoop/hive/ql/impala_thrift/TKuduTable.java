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
public class TKuduTable implements org.apache.thrift.TBase<TKuduTable, TKuduTable._Fields>, java.io.Serializable, Cloneable, Comparable<TKuduTable> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TKuduTable");

  private static final org.apache.thrift.protocol.TField TABLE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("table_name", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField MASTER_ADDRESSES_FIELD_DESC = new org.apache.thrift.protocol.TField("master_addresses", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField KEY_COLUMNS_FIELD_DESC = new org.apache.thrift.protocol.TField("key_columns", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField PARTITION_BY_FIELD_DESC = new org.apache.thrift.protocol.TField("partition_by", org.apache.thrift.protocol.TType.LIST, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TKuduTableStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TKuduTableTupleSchemeFactory());
  }

  private String table_name; // required
  private List<String> master_addresses; // required
  private List<String> key_columns; // required
  private List<TKuduPartitionParam> partition_by; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TABLE_NAME((short)1, "table_name"),
    MASTER_ADDRESSES((short)2, "master_addresses"),
    KEY_COLUMNS((short)3, "key_columns"),
    PARTITION_BY((short)4, "partition_by");

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
        case 2: // MASTER_ADDRESSES
          return MASTER_ADDRESSES;
        case 3: // KEY_COLUMNS
          return KEY_COLUMNS;
        case 4: // PARTITION_BY
          return PARTITION_BY;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TABLE_NAME, new org.apache.thrift.meta_data.FieldMetaData("table_name", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MASTER_ADDRESSES, new org.apache.thrift.meta_data.FieldMetaData("master_addresses", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.KEY_COLUMNS, new org.apache.thrift.meta_data.FieldMetaData("key_columns", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.PARTITION_BY, new org.apache.thrift.meta_data.FieldMetaData("partition_by", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TKuduPartitionParam.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TKuduTable.class, metaDataMap);
  }

  public TKuduTable() {
  }

  public TKuduTable(
    String table_name,
    List<String> master_addresses,
    List<String> key_columns,
    List<TKuduPartitionParam> partition_by)
  {
    this();
    this.table_name = table_name;
    this.master_addresses = master_addresses;
    this.key_columns = key_columns;
    this.partition_by = partition_by;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TKuduTable(TKuduTable other) {
    if (other.isSetTable_name()) {
      this.table_name = other.table_name;
    }
    if (other.isSetMaster_addresses()) {
      List<String> __this__master_addresses = new ArrayList<String>(other.master_addresses);
      this.master_addresses = __this__master_addresses;
    }
    if (other.isSetKey_columns()) {
      List<String> __this__key_columns = new ArrayList<String>(other.key_columns);
      this.key_columns = __this__key_columns;
    }
    if (other.isSetPartition_by()) {
      List<TKuduPartitionParam> __this__partition_by = new ArrayList<TKuduPartitionParam>(other.partition_by.size());
      for (TKuduPartitionParam other_element : other.partition_by) {
        __this__partition_by.add(new TKuduPartitionParam(other_element));
      }
      this.partition_by = __this__partition_by;
    }
  }

  public TKuduTable deepCopy() {
    return new TKuduTable(this);
  }

  @Override
  public void clear() {
    this.table_name = null;
    this.master_addresses = null;
    this.key_columns = null;
    this.partition_by = null;
  }

  public String getTable_name() {
    return this.table_name;
  }

  public void setTable_name(String table_name) {
    this.table_name = table_name;
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

  public int getMaster_addressesSize() {
    return (this.master_addresses == null) ? 0 : this.master_addresses.size();
  }

  public java.util.Iterator<String> getMaster_addressesIterator() {
    return (this.master_addresses == null) ? null : this.master_addresses.iterator();
  }

  public void addToMaster_addresses(String elem) {
    if (this.master_addresses == null) {
      this.master_addresses = new ArrayList<String>();
    }
    this.master_addresses.add(elem);
  }

  public List<String> getMaster_addresses() {
    return this.master_addresses;
  }

  public void setMaster_addresses(List<String> master_addresses) {
    this.master_addresses = master_addresses;
  }

  public void unsetMaster_addresses() {
    this.master_addresses = null;
  }

  /** Returns true if field master_addresses is set (has been assigned a value) and false otherwise */
  public boolean isSetMaster_addresses() {
    return this.master_addresses != null;
  }

  public void setMaster_addressesIsSet(boolean value) {
    if (!value) {
      this.master_addresses = null;
    }
  }

  public int getKey_columnsSize() {
    return (this.key_columns == null) ? 0 : this.key_columns.size();
  }

  public java.util.Iterator<String> getKey_columnsIterator() {
    return (this.key_columns == null) ? null : this.key_columns.iterator();
  }

  public void addToKey_columns(String elem) {
    if (this.key_columns == null) {
      this.key_columns = new ArrayList<String>();
    }
    this.key_columns.add(elem);
  }

  public List<String> getKey_columns() {
    return this.key_columns;
  }

  public void setKey_columns(List<String> key_columns) {
    this.key_columns = key_columns;
  }

  public void unsetKey_columns() {
    this.key_columns = null;
  }

  /** Returns true if field key_columns is set (has been assigned a value) and false otherwise */
  public boolean isSetKey_columns() {
    return this.key_columns != null;
  }

  public void setKey_columnsIsSet(boolean value) {
    if (!value) {
      this.key_columns = null;
    }
  }

  public int getPartition_bySize() {
    return (this.partition_by == null) ? 0 : this.partition_by.size();
  }

  public java.util.Iterator<TKuduPartitionParam> getPartition_byIterator() {
    return (this.partition_by == null) ? null : this.partition_by.iterator();
  }

  public void addToPartition_by(TKuduPartitionParam elem) {
    if (this.partition_by == null) {
      this.partition_by = new ArrayList<TKuduPartitionParam>();
    }
    this.partition_by.add(elem);
  }

  public List<TKuduPartitionParam> getPartition_by() {
    return this.partition_by;
  }

  public void setPartition_by(List<TKuduPartitionParam> partition_by) {
    this.partition_by = partition_by;
  }

  public void unsetPartition_by() {
    this.partition_by = null;
  }

  /** Returns true if field partition_by is set (has been assigned a value) and false otherwise */
  public boolean isSetPartition_by() {
    return this.partition_by != null;
  }

  public void setPartition_byIsSet(boolean value) {
    if (!value) {
      this.partition_by = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TABLE_NAME:
      if (value == null) {
        unsetTable_name();
      } else {
        setTable_name((String)value);
      }
      break;

    case MASTER_ADDRESSES:
      if (value == null) {
        unsetMaster_addresses();
      } else {
        setMaster_addresses((List<String>)value);
      }
      break;

    case KEY_COLUMNS:
      if (value == null) {
        unsetKey_columns();
      } else {
        setKey_columns((List<String>)value);
      }
      break;

    case PARTITION_BY:
      if (value == null) {
        unsetPartition_by();
      } else {
        setPartition_by((List<TKuduPartitionParam>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TABLE_NAME:
      return getTable_name();

    case MASTER_ADDRESSES:
      return getMaster_addresses();

    case KEY_COLUMNS:
      return getKey_columns();

    case PARTITION_BY:
      return getPartition_by();

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
    case MASTER_ADDRESSES:
      return isSetMaster_addresses();
    case KEY_COLUMNS:
      return isSetKey_columns();
    case PARTITION_BY:
      return isSetPartition_by();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TKuduTable)
      return this.equals((TKuduTable)that);
    return false;
  }

  public boolean equals(TKuduTable that) {
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

    boolean this_present_master_addresses = true && this.isSetMaster_addresses();
    boolean that_present_master_addresses = true && that.isSetMaster_addresses();
    if (this_present_master_addresses || that_present_master_addresses) {
      if (!(this_present_master_addresses && that_present_master_addresses))
        return false;
      if (!this.master_addresses.equals(that.master_addresses))
        return false;
    }

    boolean this_present_key_columns = true && this.isSetKey_columns();
    boolean that_present_key_columns = true && that.isSetKey_columns();
    if (this_present_key_columns || that_present_key_columns) {
      if (!(this_present_key_columns && that_present_key_columns))
        return false;
      if (!this.key_columns.equals(that.key_columns))
        return false;
    }

    boolean this_present_partition_by = true && this.isSetPartition_by();
    boolean that_present_partition_by = true && that.isSetPartition_by();
    if (this_present_partition_by || that_present_partition_by) {
      if (!(this_present_partition_by && that_present_partition_by))
        return false;
      if (!this.partition_by.equals(that.partition_by))
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

    boolean present_master_addresses = true && (isSetMaster_addresses());
    list.add(present_master_addresses);
    if (present_master_addresses)
      list.add(master_addresses);

    boolean present_key_columns = true && (isSetKey_columns());
    list.add(present_key_columns);
    if (present_key_columns)
      list.add(key_columns);

    boolean present_partition_by = true && (isSetPartition_by());
    list.add(present_partition_by);
    if (present_partition_by)
      list.add(partition_by);

    return list.hashCode();
  }

  @Override
  public int compareTo(TKuduTable other) {
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
    lastComparison = Boolean.valueOf(isSetMaster_addresses()).compareTo(other.isSetMaster_addresses());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMaster_addresses()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.master_addresses, other.master_addresses);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetKey_columns()).compareTo(other.isSetKey_columns());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetKey_columns()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.key_columns, other.key_columns);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPartition_by()).compareTo(other.isSetPartition_by());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartition_by()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.partition_by, other.partition_by);
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
    StringBuilder sb = new StringBuilder("TKuduTable(");
    boolean first = true;

    sb.append("table_name:");
    if (this.table_name == null) {
      sb.append("null");
    } else {
      sb.append(this.table_name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("master_addresses:");
    if (this.master_addresses == null) {
      sb.append("null");
    } else {
      sb.append(this.master_addresses);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("key_columns:");
    if (this.key_columns == null) {
      sb.append("null");
    } else {
      sb.append(this.key_columns);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("partition_by:");
    if (this.partition_by == null) {
      sb.append("null");
    } else {
      sb.append(this.partition_by);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetTable_name()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'table_name' is unset! Struct:" + toString());
    }

    if (!isSetMaster_addresses()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'master_addresses' is unset! Struct:" + toString());
    }

    if (!isSetKey_columns()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'key_columns' is unset! Struct:" + toString());
    }

    if (!isSetPartition_by()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'partition_by' is unset! Struct:" + toString());
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

  private static class TKuduTableStandardSchemeFactory implements SchemeFactory {
    public TKuduTableStandardScheme getScheme() {
      return new TKuduTableStandardScheme();
    }
  }

  private static class TKuduTableStandardScheme extends StandardScheme<TKuduTable> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TKuduTable struct) throws org.apache.thrift.TException {
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
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.table_name = iprot.readString();
              struct.setTable_nameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MASTER_ADDRESSES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list134 = iprot.readListBegin();
                struct.master_addresses = new ArrayList<String>(_list134.size);
                String _elem135;
                for (int _i136 = 0; _i136 < _list134.size; ++_i136)
                {
                  _elem135 = iprot.readString();
                  struct.master_addresses.add(_elem135);
                }
                iprot.readListEnd();
              }
              struct.setMaster_addressesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // KEY_COLUMNS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list137 = iprot.readListBegin();
                struct.key_columns = new ArrayList<String>(_list137.size);
                String _elem138;
                for (int _i139 = 0; _i139 < _list137.size; ++_i139)
                {
                  _elem138 = iprot.readString();
                  struct.key_columns.add(_elem138);
                }
                iprot.readListEnd();
              }
              struct.setKey_columnsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PARTITION_BY
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list140 = iprot.readListBegin();
                struct.partition_by = new ArrayList<TKuduPartitionParam>(_list140.size);
                TKuduPartitionParam _elem141;
                for (int _i142 = 0; _i142 < _list140.size; ++_i142)
                {
                  _elem141 = new TKuduPartitionParam();
                  _elem141.read(iprot);
                  struct.partition_by.add(_elem141);
                }
                iprot.readListEnd();
              }
              struct.setPartition_byIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TKuduTable struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.table_name != null) {
        oprot.writeFieldBegin(TABLE_NAME_FIELD_DESC);
        oprot.writeString(struct.table_name);
        oprot.writeFieldEnd();
      }
      if (struct.master_addresses != null) {
        oprot.writeFieldBegin(MASTER_ADDRESSES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.master_addresses.size()));
          for (String _iter143 : struct.master_addresses)
          {
            oprot.writeString(_iter143);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.key_columns != null) {
        oprot.writeFieldBegin(KEY_COLUMNS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.key_columns.size()));
          for (String _iter144 : struct.key_columns)
          {
            oprot.writeString(_iter144);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.partition_by != null) {
        oprot.writeFieldBegin(PARTITION_BY_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.partition_by.size()));
          for (TKuduPartitionParam _iter145 : struct.partition_by)
          {
            _iter145.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TKuduTableTupleSchemeFactory implements SchemeFactory {
    public TKuduTableTupleScheme getScheme() {
      return new TKuduTableTupleScheme();
    }
  }

  private static class TKuduTableTupleScheme extends TupleScheme<TKuduTable> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TKuduTable struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.table_name);
      {
        oprot.writeI32(struct.master_addresses.size());
        for (String _iter146 : struct.master_addresses)
        {
          oprot.writeString(_iter146);
        }
      }
      {
        oprot.writeI32(struct.key_columns.size());
        for (String _iter147 : struct.key_columns)
        {
          oprot.writeString(_iter147);
        }
      }
      {
        oprot.writeI32(struct.partition_by.size());
        for (TKuduPartitionParam _iter148 : struct.partition_by)
        {
          _iter148.write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TKuduTable struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.table_name = iprot.readString();
      struct.setTable_nameIsSet(true);
      {
        org.apache.thrift.protocol.TList _list149 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
        struct.master_addresses = new ArrayList<String>(_list149.size);
        String _elem150;
        for (int _i151 = 0; _i151 < _list149.size; ++_i151)
        {
          _elem150 = iprot.readString();
          struct.master_addresses.add(_elem150);
        }
      }
      struct.setMaster_addressesIsSet(true);
      {
        org.apache.thrift.protocol.TList _list152 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
        struct.key_columns = new ArrayList<String>(_list152.size);
        String _elem153;
        for (int _i154 = 0; _i154 < _list152.size; ++_i154)
        {
          _elem153 = iprot.readString();
          struct.key_columns.add(_elem153);
        }
      }
      struct.setKey_columnsIsSet(true);
      {
        org.apache.thrift.protocol.TList _list155 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.partition_by = new ArrayList<TKuduPartitionParam>(_list155.size);
        TKuduPartitionParam _elem156;
        for (int _i157 = 0; _i157 < _list155.size; ++_i157)
        {
          _elem156 = new TKuduPartitionParam();
          _elem156.read(iprot);
          struct.partition_by.add(_elem156);
        }
      }
      struct.setPartition_byIsSet(true);
    }
  }

}
