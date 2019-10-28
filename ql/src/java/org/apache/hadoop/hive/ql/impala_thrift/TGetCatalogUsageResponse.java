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
public class TGetCatalogUsageResponse implements org.apache.thrift.TBase<TGetCatalogUsageResponse, TGetCatalogUsageResponse._Fields>, java.io.Serializable, Cloneable, Comparable<TGetCatalogUsageResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TGetCatalogUsageResponse");

  private static final org.apache.thrift.protocol.TField LARGE_TABLES_FIELD_DESC = new org.apache.thrift.protocol.TField("large_tables", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField FREQUENTLY_ACCESSED_TABLES_FIELD_DESC = new org.apache.thrift.protocol.TField("frequently_accessed_tables", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField HIGH_FILE_COUNT_TABLES_FIELD_DESC = new org.apache.thrift.protocol.TField("high_file_count_tables", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TGetCatalogUsageResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TGetCatalogUsageResponseTupleSchemeFactory());
  }

  private List<TTableUsageMetrics> large_tables; // required
  private List<TTableUsageMetrics> frequently_accessed_tables; // required
  private List<TTableUsageMetrics> high_file_count_tables; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    LARGE_TABLES((short)1, "large_tables"),
    FREQUENTLY_ACCESSED_TABLES((short)2, "frequently_accessed_tables"),
    HIGH_FILE_COUNT_TABLES((short)3, "high_file_count_tables");

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
        case 1: // LARGE_TABLES
          return LARGE_TABLES;
        case 2: // FREQUENTLY_ACCESSED_TABLES
          return FREQUENTLY_ACCESSED_TABLES;
        case 3: // HIGH_FILE_COUNT_TABLES
          return HIGH_FILE_COUNT_TABLES;
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
    tmpMap.put(_Fields.LARGE_TABLES, new org.apache.thrift.meta_data.FieldMetaData("large_tables", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TTableUsageMetrics.class))));
    tmpMap.put(_Fields.FREQUENTLY_ACCESSED_TABLES, new org.apache.thrift.meta_data.FieldMetaData("frequently_accessed_tables", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TTableUsageMetrics.class))));
    tmpMap.put(_Fields.HIGH_FILE_COUNT_TABLES, new org.apache.thrift.meta_data.FieldMetaData("high_file_count_tables", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TTableUsageMetrics.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TGetCatalogUsageResponse.class, metaDataMap);
  }

  public TGetCatalogUsageResponse() {
  }

  public TGetCatalogUsageResponse(
    List<TTableUsageMetrics> large_tables,
    List<TTableUsageMetrics> frequently_accessed_tables,
    List<TTableUsageMetrics> high_file_count_tables)
  {
    this();
    this.large_tables = large_tables;
    this.frequently_accessed_tables = frequently_accessed_tables;
    this.high_file_count_tables = high_file_count_tables;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TGetCatalogUsageResponse(TGetCatalogUsageResponse other) {
    if (other.isSetLarge_tables()) {
      List<TTableUsageMetrics> __this__large_tables = new ArrayList<TTableUsageMetrics>(other.large_tables.size());
      for (TTableUsageMetrics other_element : other.large_tables) {
        __this__large_tables.add(new TTableUsageMetrics(other_element));
      }
      this.large_tables = __this__large_tables;
    }
    if (other.isSetFrequently_accessed_tables()) {
      List<TTableUsageMetrics> __this__frequently_accessed_tables = new ArrayList<TTableUsageMetrics>(other.frequently_accessed_tables.size());
      for (TTableUsageMetrics other_element : other.frequently_accessed_tables) {
        __this__frequently_accessed_tables.add(new TTableUsageMetrics(other_element));
      }
      this.frequently_accessed_tables = __this__frequently_accessed_tables;
    }
    if (other.isSetHigh_file_count_tables()) {
      List<TTableUsageMetrics> __this__high_file_count_tables = new ArrayList<TTableUsageMetrics>(other.high_file_count_tables.size());
      for (TTableUsageMetrics other_element : other.high_file_count_tables) {
        __this__high_file_count_tables.add(new TTableUsageMetrics(other_element));
      }
      this.high_file_count_tables = __this__high_file_count_tables;
    }
  }

  public TGetCatalogUsageResponse deepCopy() {
    return new TGetCatalogUsageResponse(this);
  }

  @Override
  public void clear() {
    this.large_tables = null;
    this.frequently_accessed_tables = null;
    this.high_file_count_tables = null;
  }

  public int getLarge_tablesSize() {
    return (this.large_tables == null) ? 0 : this.large_tables.size();
  }

  public java.util.Iterator<TTableUsageMetrics> getLarge_tablesIterator() {
    return (this.large_tables == null) ? null : this.large_tables.iterator();
  }

  public void addToLarge_tables(TTableUsageMetrics elem) {
    if (this.large_tables == null) {
      this.large_tables = new ArrayList<TTableUsageMetrics>();
    }
    this.large_tables.add(elem);
  }

  public List<TTableUsageMetrics> getLarge_tables() {
    return this.large_tables;
  }

  public void setLarge_tables(List<TTableUsageMetrics> large_tables) {
    this.large_tables = large_tables;
  }

  public void unsetLarge_tables() {
    this.large_tables = null;
  }

  /** Returns true if field large_tables is set (has been assigned a value) and false otherwise */
  public boolean isSetLarge_tables() {
    return this.large_tables != null;
  }

  public void setLarge_tablesIsSet(boolean value) {
    if (!value) {
      this.large_tables = null;
    }
  }

  public int getFrequently_accessed_tablesSize() {
    return (this.frequently_accessed_tables == null) ? 0 : this.frequently_accessed_tables.size();
  }

  public java.util.Iterator<TTableUsageMetrics> getFrequently_accessed_tablesIterator() {
    return (this.frequently_accessed_tables == null) ? null : this.frequently_accessed_tables.iterator();
  }

  public void addToFrequently_accessed_tables(TTableUsageMetrics elem) {
    if (this.frequently_accessed_tables == null) {
      this.frequently_accessed_tables = new ArrayList<TTableUsageMetrics>();
    }
    this.frequently_accessed_tables.add(elem);
  }

  public List<TTableUsageMetrics> getFrequently_accessed_tables() {
    return this.frequently_accessed_tables;
  }

  public void setFrequently_accessed_tables(List<TTableUsageMetrics> frequently_accessed_tables) {
    this.frequently_accessed_tables = frequently_accessed_tables;
  }

  public void unsetFrequently_accessed_tables() {
    this.frequently_accessed_tables = null;
  }

  /** Returns true if field frequently_accessed_tables is set (has been assigned a value) and false otherwise */
  public boolean isSetFrequently_accessed_tables() {
    return this.frequently_accessed_tables != null;
  }

  public void setFrequently_accessed_tablesIsSet(boolean value) {
    if (!value) {
      this.frequently_accessed_tables = null;
    }
  }

  public int getHigh_file_count_tablesSize() {
    return (this.high_file_count_tables == null) ? 0 : this.high_file_count_tables.size();
  }

  public java.util.Iterator<TTableUsageMetrics> getHigh_file_count_tablesIterator() {
    return (this.high_file_count_tables == null) ? null : this.high_file_count_tables.iterator();
  }

  public void addToHigh_file_count_tables(TTableUsageMetrics elem) {
    if (this.high_file_count_tables == null) {
      this.high_file_count_tables = new ArrayList<TTableUsageMetrics>();
    }
    this.high_file_count_tables.add(elem);
  }

  public List<TTableUsageMetrics> getHigh_file_count_tables() {
    return this.high_file_count_tables;
  }

  public void setHigh_file_count_tables(List<TTableUsageMetrics> high_file_count_tables) {
    this.high_file_count_tables = high_file_count_tables;
  }

  public void unsetHigh_file_count_tables() {
    this.high_file_count_tables = null;
  }

  /** Returns true if field high_file_count_tables is set (has been assigned a value) and false otherwise */
  public boolean isSetHigh_file_count_tables() {
    return this.high_file_count_tables != null;
  }

  public void setHigh_file_count_tablesIsSet(boolean value) {
    if (!value) {
      this.high_file_count_tables = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case LARGE_TABLES:
      if (value == null) {
        unsetLarge_tables();
      } else {
        setLarge_tables((List<TTableUsageMetrics>)value);
      }
      break;

    case FREQUENTLY_ACCESSED_TABLES:
      if (value == null) {
        unsetFrequently_accessed_tables();
      } else {
        setFrequently_accessed_tables((List<TTableUsageMetrics>)value);
      }
      break;

    case HIGH_FILE_COUNT_TABLES:
      if (value == null) {
        unsetHigh_file_count_tables();
      } else {
        setHigh_file_count_tables((List<TTableUsageMetrics>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case LARGE_TABLES:
      return getLarge_tables();

    case FREQUENTLY_ACCESSED_TABLES:
      return getFrequently_accessed_tables();

    case HIGH_FILE_COUNT_TABLES:
      return getHigh_file_count_tables();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case LARGE_TABLES:
      return isSetLarge_tables();
    case FREQUENTLY_ACCESSED_TABLES:
      return isSetFrequently_accessed_tables();
    case HIGH_FILE_COUNT_TABLES:
      return isSetHigh_file_count_tables();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TGetCatalogUsageResponse)
      return this.equals((TGetCatalogUsageResponse)that);
    return false;
  }

  public boolean equals(TGetCatalogUsageResponse that) {
    if (that == null)
      return false;

    boolean this_present_large_tables = true && this.isSetLarge_tables();
    boolean that_present_large_tables = true && that.isSetLarge_tables();
    if (this_present_large_tables || that_present_large_tables) {
      if (!(this_present_large_tables && that_present_large_tables))
        return false;
      if (!this.large_tables.equals(that.large_tables))
        return false;
    }

    boolean this_present_frequently_accessed_tables = true && this.isSetFrequently_accessed_tables();
    boolean that_present_frequently_accessed_tables = true && that.isSetFrequently_accessed_tables();
    if (this_present_frequently_accessed_tables || that_present_frequently_accessed_tables) {
      if (!(this_present_frequently_accessed_tables && that_present_frequently_accessed_tables))
        return false;
      if (!this.frequently_accessed_tables.equals(that.frequently_accessed_tables))
        return false;
    }

    boolean this_present_high_file_count_tables = true && this.isSetHigh_file_count_tables();
    boolean that_present_high_file_count_tables = true && that.isSetHigh_file_count_tables();
    if (this_present_high_file_count_tables || that_present_high_file_count_tables) {
      if (!(this_present_high_file_count_tables && that_present_high_file_count_tables))
        return false;
      if (!this.high_file_count_tables.equals(that.high_file_count_tables))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_large_tables = true && (isSetLarge_tables());
    list.add(present_large_tables);
    if (present_large_tables)
      list.add(large_tables);

    boolean present_frequently_accessed_tables = true && (isSetFrequently_accessed_tables());
    list.add(present_frequently_accessed_tables);
    if (present_frequently_accessed_tables)
      list.add(frequently_accessed_tables);

    boolean present_high_file_count_tables = true && (isSetHigh_file_count_tables());
    list.add(present_high_file_count_tables);
    if (present_high_file_count_tables)
      list.add(high_file_count_tables);

    return list.hashCode();
  }

  @Override
  public int compareTo(TGetCatalogUsageResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetLarge_tables()).compareTo(other.isSetLarge_tables());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLarge_tables()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.large_tables, other.large_tables);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFrequently_accessed_tables()).compareTo(other.isSetFrequently_accessed_tables());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFrequently_accessed_tables()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.frequently_accessed_tables, other.frequently_accessed_tables);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHigh_file_count_tables()).compareTo(other.isSetHigh_file_count_tables());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHigh_file_count_tables()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.high_file_count_tables, other.high_file_count_tables);
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
    StringBuilder sb = new StringBuilder("TGetCatalogUsageResponse(");
    boolean first = true;

    sb.append("large_tables:");
    if (this.large_tables == null) {
      sb.append("null");
    } else {
      sb.append(this.large_tables);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("frequently_accessed_tables:");
    if (this.frequently_accessed_tables == null) {
      sb.append("null");
    } else {
      sb.append(this.frequently_accessed_tables);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("high_file_count_tables:");
    if (this.high_file_count_tables == null) {
      sb.append("null");
    } else {
      sb.append(this.high_file_count_tables);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetLarge_tables()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'large_tables' is unset! Struct:" + toString());
    }

    if (!isSetFrequently_accessed_tables()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'frequently_accessed_tables' is unset! Struct:" + toString());
    }

    if (!isSetHigh_file_count_tables()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'high_file_count_tables' is unset! Struct:" + toString());
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

  private static class TGetCatalogUsageResponseStandardSchemeFactory implements SchemeFactory {
    public TGetCatalogUsageResponseStandardScheme getScheme() {
      return new TGetCatalogUsageResponseStandardScheme();
    }
  }

  private static class TGetCatalogUsageResponseStandardScheme extends StandardScheme<TGetCatalogUsageResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TGetCatalogUsageResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // LARGE_TABLES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list306 = iprot.readListBegin();
                struct.large_tables = new ArrayList<TTableUsageMetrics>(_list306.size);
                TTableUsageMetrics _elem307;
                for (int _i308 = 0; _i308 < _list306.size; ++_i308)
                {
                  _elem307 = new TTableUsageMetrics();
                  _elem307.read(iprot);
                  struct.large_tables.add(_elem307);
                }
                iprot.readListEnd();
              }
              struct.setLarge_tablesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // FREQUENTLY_ACCESSED_TABLES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list309 = iprot.readListBegin();
                struct.frequently_accessed_tables = new ArrayList<TTableUsageMetrics>(_list309.size);
                TTableUsageMetrics _elem310;
                for (int _i311 = 0; _i311 < _list309.size; ++_i311)
                {
                  _elem310 = new TTableUsageMetrics();
                  _elem310.read(iprot);
                  struct.frequently_accessed_tables.add(_elem310);
                }
                iprot.readListEnd();
              }
              struct.setFrequently_accessed_tablesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // HIGH_FILE_COUNT_TABLES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list312 = iprot.readListBegin();
                struct.high_file_count_tables = new ArrayList<TTableUsageMetrics>(_list312.size);
                TTableUsageMetrics _elem313;
                for (int _i314 = 0; _i314 < _list312.size; ++_i314)
                {
                  _elem313 = new TTableUsageMetrics();
                  _elem313.read(iprot);
                  struct.high_file_count_tables.add(_elem313);
                }
                iprot.readListEnd();
              }
              struct.setHigh_file_count_tablesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TGetCatalogUsageResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.large_tables != null) {
        oprot.writeFieldBegin(LARGE_TABLES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.large_tables.size()));
          for (TTableUsageMetrics _iter315 : struct.large_tables)
          {
            _iter315.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.frequently_accessed_tables != null) {
        oprot.writeFieldBegin(FREQUENTLY_ACCESSED_TABLES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.frequently_accessed_tables.size()));
          for (TTableUsageMetrics _iter316 : struct.frequently_accessed_tables)
          {
            _iter316.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.high_file_count_tables != null) {
        oprot.writeFieldBegin(HIGH_FILE_COUNT_TABLES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.high_file_count_tables.size()));
          for (TTableUsageMetrics _iter317 : struct.high_file_count_tables)
          {
            _iter317.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TGetCatalogUsageResponseTupleSchemeFactory implements SchemeFactory {
    public TGetCatalogUsageResponseTupleScheme getScheme() {
      return new TGetCatalogUsageResponseTupleScheme();
    }
  }

  private static class TGetCatalogUsageResponseTupleScheme extends TupleScheme<TGetCatalogUsageResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TGetCatalogUsageResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.large_tables.size());
        for (TTableUsageMetrics _iter318 : struct.large_tables)
        {
          _iter318.write(oprot);
        }
      }
      {
        oprot.writeI32(struct.frequently_accessed_tables.size());
        for (TTableUsageMetrics _iter319 : struct.frequently_accessed_tables)
        {
          _iter319.write(oprot);
        }
      }
      {
        oprot.writeI32(struct.high_file_count_tables.size());
        for (TTableUsageMetrics _iter320 : struct.high_file_count_tables)
        {
          _iter320.write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TGetCatalogUsageResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list321 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.large_tables = new ArrayList<TTableUsageMetrics>(_list321.size);
        TTableUsageMetrics _elem322;
        for (int _i323 = 0; _i323 < _list321.size; ++_i323)
        {
          _elem322 = new TTableUsageMetrics();
          _elem322.read(iprot);
          struct.large_tables.add(_elem322);
        }
      }
      struct.setLarge_tablesIsSet(true);
      {
        org.apache.thrift.protocol.TList _list324 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.frequently_accessed_tables = new ArrayList<TTableUsageMetrics>(_list324.size);
        TTableUsageMetrics _elem325;
        for (int _i326 = 0; _i326 < _list324.size; ++_i326)
        {
          _elem325 = new TTableUsageMetrics();
          _elem325.read(iprot);
          struct.frequently_accessed_tables.add(_elem325);
        }
      }
      struct.setFrequently_accessed_tablesIsSet(true);
      {
        org.apache.thrift.protocol.TList _list327 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.high_file_count_tables = new ArrayList<TTableUsageMetrics>(_list327.size);
        TTableUsageMetrics _elem328;
        for (int _i329 = 0; _i329 < _list327.size; ++_i329)
        {
          _elem328 = new TTableUsageMetrics();
          _elem328.read(iprot);
          struct.high_file_count_tables.add(_elem328);
        }
      }
      struct.setHigh_file_count_tablesIsSet(true);
    }
  }

}

