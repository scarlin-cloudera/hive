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
public class TKuduPartitionByRangeParam implements org.apache.thrift.TBase<TKuduPartitionByRangeParam, TKuduPartitionByRangeParam._Fields>, java.io.Serializable, Cloneable, Comparable<TKuduPartitionByRangeParam> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TKuduPartitionByRangeParam");

  private static final org.apache.thrift.protocol.TField COLUMNS_FIELD_DESC = new org.apache.thrift.protocol.TField("columns", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField RANGE_PARTITIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("range_partitions", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TKuduPartitionByRangeParamStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TKuduPartitionByRangeParamTupleSchemeFactory());
  }

  public List<String> columns; // required
  public List<TRangePartition> range_partitions; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    COLUMNS((short)1, "columns"),
    RANGE_PARTITIONS((short)2, "range_partitions");

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
        case 1: // COLUMNS
          return COLUMNS;
        case 2: // RANGE_PARTITIONS
          return RANGE_PARTITIONS;
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
  private static final _Fields optionals[] = {_Fields.RANGE_PARTITIONS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.COLUMNS, new org.apache.thrift.meta_data.FieldMetaData("columns", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.RANGE_PARTITIONS, new org.apache.thrift.meta_data.FieldMetaData("range_partitions", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TRangePartition.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TKuduPartitionByRangeParam.class, metaDataMap);
  }

  public TKuduPartitionByRangeParam() {
  }

  public TKuduPartitionByRangeParam(
    List<String> columns)
  {
    this();
    this.columns = columns;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TKuduPartitionByRangeParam(TKuduPartitionByRangeParam other) {
    if (other.isSetColumns()) {
      List<String> __this__columns = new ArrayList<String>(other.columns);
      this.columns = __this__columns;
    }
    if (other.isSetRange_partitions()) {
      List<TRangePartition> __this__range_partitions = new ArrayList<TRangePartition>(other.range_partitions.size());
      for (TRangePartition other_element : other.range_partitions) {
        __this__range_partitions.add(new TRangePartition(other_element));
      }
      this.range_partitions = __this__range_partitions;
    }
  }

  public TKuduPartitionByRangeParam deepCopy() {
    return new TKuduPartitionByRangeParam(this);
  }

  @Override
  public void clear() {
    this.columns = null;
    this.range_partitions = null;
  }

  public int getColumnsSize() {
    return (this.columns == null) ? 0 : this.columns.size();
  }

  public java.util.Iterator<String> getColumnsIterator() {
    return (this.columns == null) ? null : this.columns.iterator();
  }

  public void addToColumns(String elem) {
    if (this.columns == null) {
      this.columns = new ArrayList<String>();
    }
    this.columns.add(elem);
  }

  public List<String> getColumns() {
    return this.columns;
  }

  public TKuduPartitionByRangeParam setColumns(List<String> columns) {
    this.columns = columns;
    return this;
  }

  public void unsetColumns() {
    this.columns = null;
  }

  /** Returns true if field columns is set (has been assigned a value) and false otherwise */
  public boolean isSetColumns() {
    return this.columns != null;
  }

  public void setColumnsIsSet(boolean value) {
    if (!value) {
      this.columns = null;
    }
  }

  public int getRange_partitionsSize() {
    return (this.range_partitions == null) ? 0 : this.range_partitions.size();
  }

  public java.util.Iterator<TRangePartition> getRange_partitionsIterator() {
    return (this.range_partitions == null) ? null : this.range_partitions.iterator();
  }

  public void addToRange_partitions(TRangePartition elem) {
    if (this.range_partitions == null) {
      this.range_partitions = new ArrayList<TRangePartition>();
    }
    this.range_partitions.add(elem);
  }

  public List<TRangePartition> getRange_partitions() {
    return this.range_partitions;
  }

  public TKuduPartitionByRangeParam setRange_partitions(List<TRangePartition> range_partitions) {
    this.range_partitions = range_partitions;
    return this;
  }

  public void unsetRange_partitions() {
    this.range_partitions = null;
  }

  /** Returns true if field range_partitions is set (has been assigned a value) and false otherwise */
  public boolean isSetRange_partitions() {
    return this.range_partitions != null;
  }

  public void setRange_partitionsIsSet(boolean value) {
    if (!value) {
      this.range_partitions = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case COLUMNS:
      if (value == null) {
        unsetColumns();
      } else {
        setColumns((List<String>)value);
      }
      break;

    case RANGE_PARTITIONS:
      if (value == null) {
        unsetRange_partitions();
      } else {
        setRange_partitions((List<TRangePartition>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case COLUMNS:
      return getColumns();

    case RANGE_PARTITIONS:
      return getRange_partitions();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case COLUMNS:
      return isSetColumns();
    case RANGE_PARTITIONS:
      return isSetRange_partitions();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TKuduPartitionByRangeParam)
      return this.equals((TKuduPartitionByRangeParam)that);
    return false;
  }

  public boolean equals(TKuduPartitionByRangeParam that) {
    if (that == null)
      return false;

    boolean this_present_columns = true && this.isSetColumns();
    boolean that_present_columns = true && that.isSetColumns();
    if (this_present_columns || that_present_columns) {
      if (!(this_present_columns && that_present_columns))
        return false;
      if (!this.columns.equals(that.columns))
        return false;
    }

    boolean this_present_range_partitions = true && this.isSetRange_partitions();
    boolean that_present_range_partitions = true && that.isSetRange_partitions();
    if (this_present_range_partitions || that_present_range_partitions) {
      if (!(this_present_range_partitions && that_present_range_partitions))
        return false;
      if (!this.range_partitions.equals(that.range_partitions))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_columns = true && (isSetColumns());
    list.add(present_columns);
    if (present_columns)
      list.add(columns);

    boolean present_range_partitions = true && (isSetRange_partitions());
    list.add(present_range_partitions);
    if (present_range_partitions)
      list.add(range_partitions);

    return list.hashCode();
  }

  @Override
  public int compareTo(TKuduPartitionByRangeParam other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetColumns()).compareTo(other.isSetColumns());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColumns()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.columns, other.columns);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRange_partitions()).compareTo(other.isSetRange_partitions());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRange_partitions()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.range_partitions, other.range_partitions);
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
    StringBuilder sb = new StringBuilder("TKuduPartitionByRangeParam(");
    boolean first = true;

    sb.append("columns:");
    if (this.columns == null) {
      sb.append("null");
    } else {
      sb.append(this.columns);
    }
    first = false;
    if (isSetRange_partitions()) {
      if (!first) sb.append(", ");
      sb.append("range_partitions:");
      if (this.range_partitions == null) {
        sb.append("null");
      } else {
        sb.append(this.range_partitions);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (columns == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'columns' was not present! Struct: " + toString());
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

  private static class TKuduPartitionByRangeParamStandardSchemeFactory implements SchemeFactory {
    public TKuduPartitionByRangeParamStandardScheme getScheme() {
      return new TKuduPartitionByRangeParamStandardScheme();
    }
  }

  private static class TKuduPartitionByRangeParamStandardScheme extends StandardScheme<TKuduPartitionByRangeParam> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TKuduPartitionByRangeParam struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // COLUMNS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list118 = iprot.readListBegin();
                struct.columns = new ArrayList<String>(_list118.size);
                String _elem119;
                for (int _i120 = 0; _i120 < _list118.size; ++_i120)
                {
                  _elem119 = iprot.readString();
                  struct.columns.add(_elem119);
                }
                iprot.readListEnd();
              }
              struct.setColumnsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // RANGE_PARTITIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list121 = iprot.readListBegin();
                struct.range_partitions = new ArrayList<TRangePartition>(_list121.size);
                TRangePartition _elem122;
                for (int _i123 = 0; _i123 < _list121.size; ++_i123)
                {
                  _elem122 = new TRangePartition();
                  _elem122.read(iprot);
                  struct.range_partitions.add(_elem122);
                }
                iprot.readListEnd();
              }
              struct.setRange_partitionsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TKuduPartitionByRangeParam struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.columns != null) {
        oprot.writeFieldBegin(COLUMNS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.columns.size()));
          for (String _iter124 : struct.columns)
          {
            oprot.writeString(_iter124);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.range_partitions != null) {
        if (struct.isSetRange_partitions()) {
          oprot.writeFieldBegin(RANGE_PARTITIONS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.range_partitions.size()));
            for (TRangePartition _iter125 : struct.range_partitions)
            {
              _iter125.write(oprot);
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

  private static class TKuduPartitionByRangeParamTupleSchemeFactory implements SchemeFactory {
    public TKuduPartitionByRangeParamTupleScheme getScheme() {
      return new TKuduPartitionByRangeParamTupleScheme();
    }
  }

  private static class TKuduPartitionByRangeParamTupleScheme extends TupleScheme<TKuduPartitionByRangeParam> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TKuduPartitionByRangeParam struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.columns.size());
        for (String _iter126 : struct.columns)
        {
          oprot.writeString(_iter126);
        }
      }
      BitSet optionals = new BitSet();
      if (struct.isSetRange_partitions()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetRange_partitions()) {
        {
          oprot.writeI32(struct.range_partitions.size());
          for (TRangePartition _iter127 : struct.range_partitions)
          {
            _iter127.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TKuduPartitionByRangeParam struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list128 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
        struct.columns = new ArrayList<String>(_list128.size);
        String _elem129;
        for (int _i130 = 0; _i130 < _list128.size; ++_i130)
        {
          _elem129 = iprot.readString();
          struct.columns.add(_elem129);
        }
      }
      struct.setColumnsIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list131 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.range_partitions = new ArrayList<TRangePartition>(_list131.size);
          TRangePartition _elem132;
          for (int _i133 = 0; _i133 < _list131.size; ++_i133)
          {
            _elem132 = new TRangePartition();
            _elem132.read(iprot);
            struct.range_partitions.add(_elem132);
          }
        }
        struct.setRange_partitionsIsSet(true);
      }
    }
  }

}

