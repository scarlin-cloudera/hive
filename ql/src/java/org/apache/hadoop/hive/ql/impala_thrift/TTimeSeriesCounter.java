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
public class TTimeSeriesCounter implements org.apache.thrift.TBase<TTimeSeriesCounter, TTimeSeriesCounter._Fields>, java.io.Serializable, Cloneable, Comparable<TTimeSeriesCounter> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TTimeSeriesCounter");

  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField UNIT_FIELD_DESC = new org.apache.thrift.protocol.TField("unit", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField PERIOD_MS_FIELD_DESC = new org.apache.thrift.protocol.TField("period_ms", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField VALUES_FIELD_DESC = new org.apache.thrift.protocol.TField("values", org.apache.thrift.protocol.TType.LIST, (short)4);
  private static final org.apache.thrift.protocol.TField START_INDEX_FIELD_DESC = new org.apache.thrift.protocol.TField("start_index", org.apache.thrift.protocol.TType.I64, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TTimeSeriesCounterStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TTimeSeriesCounterTupleSchemeFactory());
  }

  private String name; // required
  private org.apache.impala.thrift.TUnit unit; // required
  private int period_ms; // required
  private List<Long> values; // required
  private long start_index; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NAME((short)1, "name"),
    /**
     * 
     * @see org.apache.impala.thrift.TUnit
     */
    UNIT((short)2, "unit"),
    PERIOD_MS((short)3, "period_ms"),
    VALUES((short)4, "values"),
    START_INDEX((short)5, "start_index");

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
        case 1: // NAME
          return NAME;
        case 2: // UNIT
          return UNIT;
        case 3: // PERIOD_MS
          return PERIOD_MS;
        case 4: // VALUES
          return VALUES;
        case 5: // START_INDEX
          return START_INDEX;
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
  private static final int __PERIOD_MS_ISSET_ID = 0;
  private static final int __START_INDEX_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.START_INDEX};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.UNIT, new org.apache.thrift.meta_data.FieldMetaData("unit", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, org.apache.impala.thrift.TUnit.class)));
    tmpMap.put(_Fields.PERIOD_MS, new org.apache.thrift.meta_data.FieldMetaData("period_ms", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.VALUES, new org.apache.thrift.meta_data.FieldMetaData("values", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64))));
    tmpMap.put(_Fields.START_INDEX, new org.apache.thrift.meta_data.FieldMetaData("start_index", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TTimeSeriesCounter.class, metaDataMap);
  }

  public TTimeSeriesCounter() {
  }

  public TTimeSeriesCounter(
    String name,
    org.apache.impala.thrift.TUnit unit,
    int period_ms,
    List<Long> values)
  {
    this();
    this.name = name;
    this.unit = unit;
    this.period_ms = period_ms;
    setPeriod_msIsSet(true);
    this.values = values;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TTimeSeriesCounter(TTimeSeriesCounter other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetUnit()) {
      this.unit = other.unit;
    }
    this.period_ms = other.period_ms;
    if (other.isSetValues()) {
      List<Long> __this__values = new ArrayList<Long>(other.values);
      this.values = __this__values;
    }
    this.start_index = other.start_index;
  }

  public TTimeSeriesCounter deepCopy() {
    return new TTimeSeriesCounter(this);
  }

  @Override
  public void clear() {
    this.name = null;
    this.unit = null;
    setPeriod_msIsSet(false);
    this.period_ms = 0;
    this.values = null;
    setStart_indexIsSet(false);
    this.start_index = 0;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  /**
   * 
   * @see org.apache.impala.thrift.TUnit
   */
  public org.apache.impala.thrift.TUnit getUnit() {
    return this.unit;
  }

  /**
   * 
   * @see org.apache.impala.thrift.TUnit
   */
  public void setUnit(org.apache.impala.thrift.TUnit unit) {
    this.unit = unit;
  }

  public void unsetUnit() {
    this.unit = null;
  }

  /** Returns true if field unit is set (has been assigned a value) and false otherwise */
  public boolean isSetUnit() {
    return this.unit != null;
  }

  public void setUnitIsSet(boolean value) {
    if (!value) {
      this.unit = null;
    }
  }

  public int getPeriod_ms() {
    return this.period_ms;
  }

  public void setPeriod_ms(int period_ms) {
    this.period_ms = period_ms;
    setPeriod_msIsSet(true);
  }

  public void unsetPeriod_ms() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PERIOD_MS_ISSET_ID);
  }

  /** Returns true if field period_ms is set (has been assigned a value) and false otherwise */
  public boolean isSetPeriod_ms() {
    return EncodingUtils.testBit(__isset_bitfield, __PERIOD_MS_ISSET_ID);
  }

  public void setPeriod_msIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PERIOD_MS_ISSET_ID, value);
  }

  public int getValuesSize() {
    return (this.values == null) ? 0 : this.values.size();
  }

  public java.util.Iterator<Long> getValuesIterator() {
    return (this.values == null) ? null : this.values.iterator();
  }

  public void addToValues(long elem) {
    if (this.values == null) {
      this.values = new ArrayList<Long>();
    }
    this.values.add(elem);
  }

  public List<Long> getValues() {
    return this.values;
  }

  public void setValues(List<Long> values) {
    this.values = values;
  }

  public void unsetValues() {
    this.values = null;
  }

  /** Returns true if field values is set (has been assigned a value) and false otherwise */
  public boolean isSetValues() {
    return this.values != null;
  }

  public void setValuesIsSet(boolean value) {
    if (!value) {
      this.values = null;
    }
  }

  public long getStart_index() {
    return this.start_index;
  }

  public void setStart_index(long start_index) {
    this.start_index = start_index;
    setStart_indexIsSet(true);
  }

  public void unsetStart_index() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __START_INDEX_ISSET_ID);
  }

  /** Returns true if field start_index is set (has been assigned a value) and false otherwise */
  public boolean isSetStart_index() {
    return EncodingUtils.testBit(__isset_bitfield, __START_INDEX_ISSET_ID);
  }

  public void setStart_indexIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __START_INDEX_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case UNIT:
      if (value == null) {
        unsetUnit();
      } else {
        setUnit((org.apache.impala.thrift.TUnit)value);
      }
      break;

    case PERIOD_MS:
      if (value == null) {
        unsetPeriod_ms();
      } else {
        setPeriod_ms((Integer)value);
      }
      break;

    case VALUES:
      if (value == null) {
        unsetValues();
      } else {
        setValues((List<Long>)value);
      }
      break;

    case START_INDEX:
      if (value == null) {
        unsetStart_index();
      } else {
        setStart_index((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NAME:
      return getName();

    case UNIT:
      return getUnit();

    case PERIOD_MS:
      return getPeriod_ms();

    case VALUES:
      return getValues();

    case START_INDEX:
      return getStart_index();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NAME:
      return isSetName();
    case UNIT:
      return isSetUnit();
    case PERIOD_MS:
      return isSetPeriod_ms();
    case VALUES:
      return isSetValues();
    case START_INDEX:
      return isSetStart_index();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TTimeSeriesCounter)
      return this.equals((TTimeSeriesCounter)that);
    return false;
  }

  public boolean equals(TTimeSeriesCounter that) {
    if (that == null)
      return false;

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_unit = true && this.isSetUnit();
    boolean that_present_unit = true && that.isSetUnit();
    if (this_present_unit || that_present_unit) {
      if (!(this_present_unit && that_present_unit))
        return false;
      if (!this.unit.equals(that.unit))
        return false;
    }

    boolean this_present_period_ms = true;
    boolean that_present_period_ms = true;
    if (this_present_period_ms || that_present_period_ms) {
      if (!(this_present_period_ms && that_present_period_ms))
        return false;
      if (this.period_ms != that.period_ms)
        return false;
    }

    boolean this_present_values = true && this.isSetValues();
    boolean that_present_values = true && that.isSetValues();
    if (this_present_values || that_present_values) {
      if (!(this_present_values && that_present_values))
        return false;
      if (!this.values.equals(that.values))
        return false;
    }

    boolean this_present_start_index = true && this.isSetStart_index();
    boolean that_present_start_index = true && that.isSetStart_index();
    if (this_present_start_index || that_present_start_index) {
      if (!(this_present_start_index && that_present_start_index))
        return false;
      if (this.start_index != that.start_index)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_name = true && (isSetName());
    list.add(present_name);
    if (present_name)
      list.add(name);

    boolean present_unit = true && (isSetUnit());
    list.add(present_unit);
    if (present_unit)
      list.add(unit.getValue());

    boolean present_period_ms = true;
    list.add(present_period_ms);
    if (present_period_ms)
      list.add(period_ms);

    boolean present_values = true && (isSetValues());
    list.add(present_values);
    if (present_values)
      list.add(values);

    boolean present_start_index = true && (isSetStart_index());
    list.add(present_start_index);
    if (present_start_index)
      list.add(start_index);

    return list.hashCode();
  }

  @Override
  public int compareTo(TTimeSeriesCounter other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUnit()).compareTo(other.isSetUnit());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUnit()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.unit, other.unit);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPeriod_ms()).compareTo(other.isSetPeriod_ms());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPeriod_ms()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.period_ms, other.period_ms);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetValues()).compareTo(other.isSetValues());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValues()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.values, other.values);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStart_index()).compareTo(other.isSetStart_index());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStart_index()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.start_index, other.start_index);
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
    StringBuilder sb = new StringBuilder("TTimeSeriesCounter(");
    boolean first = true;

    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("unit:");
    if (this.unit == null) {
      sb.append("null");
    } else {
      sb.append(this.unit);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("period_ms:");
    sb.append(this.period_ms);
    first = false;
    if (!first) sb.append(", ");
    sb.append("values:");
    if (this.values == null) {
      sb.append("null");
    } else {
      sb.append(this.values);
    }
    first = false;
    if (isSetStart_index()) {
      if (!first) sb.append(", ");
      sb.append("start_index:");
      sb.append(this.start_index);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetName()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'name' is unset! Struct:" + toString());
    }

    if (!isSetUnit()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'unit' is unset! Struct:" + toString());
    }

    if (!isSetPeriod_ms()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'period_ms' is unset! Struct:" + toString());
    }

    if (!isSetValues()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'values' is unset! Struct:" + toString());
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

  private static class TTimeSeriesCounterStandardSchemeFactory implements SchemeFactory {
    public TTimeSeriesCounterStandardScheme getScheme() {
      return new TTimeSeriesCounterStandardScheme();
    }
  }

  private static class TTimeSeriesCounterStandardScheme extends StandardScheme<TTimeSeriesCounter> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TTimeSeriesCounter struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // UNIT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.unit = org.apache.impala.thrift.TUnit.findByValue(iprot.readI32());
              struct.setUnitIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PERIOD_MS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.period_ms = iprot.readI32();
              struct.setPeriod_msIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // VALUES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list16 = iprot.readListBegin();
                struct.values = new ArrayList<Long>(_list16.size);
                long _elem17;
                for (int _i18 = 0; _i18 < _list16.size; ++_i18)
                {
                  _elem17 = iprot.readI64();
                  struct.values.add(_elem17);
                }
                iprot.readListEnd();
              }
              struct.setValuesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // START_INDEX
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.start_index = iprot.readI64();
              struct.setStart_indexIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TTimeSeriesCounter struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      if (struct.unit != null) {
        oprot.writeFieldBegin(UNIT_FIELD_DESC);
        oprot.writeI32(struct.unit.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(PERIOD_MS_FIELD_DESC);
      oprot.writeI32(struct.period_ms);
      oprot.writeFieldEnd();
      if (struct.values != null) {
        oprot.writeFieldBegin(VALUES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, struct.values.size()));
          for (long _iter19 : struct.values)
          {
            oprot.writeI64(_iter19);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.isSetStart_index()) {
        oprot.writeFieldBegin(START_INDEX_FIELD_DESC);
        oprot.writeI64(struct.start_index);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TTimeSeriesCounterTupleSchemeFactory implements SchemeFactory {
    public TTimeSeriesCounterTupleScheme getScheme() {
      return new TTimeSeriesCounterTupleScheme();
    }
  }

  private static class TTimeSeriesCounterTupleScheme extends TupleScheme<TTimeSeriesCounter> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TTimeSeriesCounter struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.name);
      oprot.writeI32(struct.unit.getValue());
      oprot.writeI32(struct.period_ms);
      {
        oprot.writeI32(struct.values.size());
        for (long _iter20 : struct.values)
        {
          oprot.writeI64(_iter20);
        }
      }
      BitSet optionals = new BitSet();
      if (struct.isSetStart_index()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetStart_index()) {
        oprot.writeI64(struct.start_index);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TTimeSeriesCounter struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.name = iprot.readString();
      struct.setNameIsSet(true);
      struct.unit = org.apache.impala.thrift.TUnit.findByValue(iprot.readI32());
      struct.setUnitIsSet(true);
      struct.period_ms = iprot.readI32();
      struct.setPeriod_msIsSet(true);
      {
        org.apache.thrift.protocol.TList _list21 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, iprot.readI32());
        struct.values = new ArrayList<Long>(_list21.size);
        long _elem22;
        for (int _i23 = 0; _i23 < _list21.size; ++_i23)
        {
          _elem22 = iprot.readI64();
          struct.values.add(_elem22);
        }
      }
      struct.setValuesIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.start_index = iprot.readI64();
        struct.setStart_indexIsSet(true);
      }
    }
  }

}

