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
public class TScanRangeLocationList implements org.apache.thrift.TBase<TScanRangeLocationList, TScanRangeLocationList._Fields>, java.io.Serializable, Cloneable, Comparable<TScanRangeLocationList> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TScanRangeLocationList");

  private static final org.apache.thrift.protocol.TField SCAN_RANGE_FIELD_DESC = new org.apache.thrift.protocol.TField("scan_range", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField LOCATIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("locations", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TScanRangeLocationListStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TScanRangeLocationListTupleSchemeFactory());
  }

  public org.apache.impala.thrift.TScanRange scan_range; // required
  public List<TScanRangeLocation> locations; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SCAN_RANGE((short)1, "scan_range"),
    LOCATIONS((short)2, "locations");

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
        case 1: // SCAN_RANGE
          return SCAN_RANGE;
        case 2: // LOCATIONS
          return LOCATIONS;
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
    tmpMap.put(_Fields.SCAN_RANGE, new org.apache.thrift.meta_data.FieldMetaData("scan_range", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.impala.thrift.TScanRange.class)));
    tmpMap.put(_Fields.LOCATIONS, new org.apache.thrift.meta_data.FieldMetaData("locations", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TScanRangeLocation.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TScanRangeLocationList.class, metaDataMap);
  }

  public TScanRangeLocationList() {
  }

  public TScanRangeLocationList(
    org.apache.impala.thrift.TScanRange scan_range,
    List<TScanRangeLocation> locations)
  {
    this();
    this.scan_range = scan_range;
    this.locations = locations;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TScanRangeLocationList(TScanRangeLocationList other) {
    if (other.isSetScan_range()) {
      this.scan_range = new org.apache.impala.thrift.TScanRange(other.scan_range);
    }
    if (other.isSetLocations()) {
      List<TScanRangeLocation> __this__locations = new ArrayList<TScanRangeLocation>(other.locations.size());
      for (TScanRangeLocation other_element : other.locations) {
        __this__locations.add(new TScanRangeLocation(other_element));
      }
      this.locations = __this__locations;
    }
  }

  public TScanRangeLocationList deepCopy() {
    return new TScanRangeLocationList(this);
  }

  @Override
  public void clear() {
    this.scan_range = null;
    this.locations = null;
  }

  public org.apache.impala.thrift.TScanRange getScan_range() {
    return this.scan_range;
  }

  public TScanRangeLocationList setScan_range(org.apache.impala.thrift.TScanRange scan_range) {
    this.scan_range = scan_range;
    return this;
  }

  public void unsetScan_range() {
    this.scan_range = null;
  }

  /** Returns true if field scan_range is set (has been assigned a value) and false otherwise */
  public boolean isSetScan_range() {
    return this.scan_range != null;
  }

  public void setScan_rangeIsSet(boolean value) {
    if (!value) {
      this.scan_range = null;
    }
  }

  public int getLocationsSize() {
    return (this.locations == null) ? 0 : this.locations.size();
  }

  public java.util.Iterator<TScanRangeLocation> getLocationsIterator() {
    return (this.locations == null) ? null : this.locations.iterator();
  }

  public void addToLocations(TScanRangeLocation elem) {
    if (this.locations == null) {
      this.locations = new ArrayList<TScanRangeLocation>();
    }
    this.locations.add(elem);
  }

  public List<TScanRangeLocation> getLocations() {
    return this.locations;
  }

  public TScanRangeLocationList setLocations(List<TScanRangeLocation> locations) {
    this.locations = locations;
    return this;
  }

  public void unsetLocations() {
    this.locations = null;
  }

  /** Returns true if field locations is set (has been assigned a value) and false otherwise */
  public boolean isSetLocations() {
    return this.locations != null;
  }

  public void setLocationsIsSet(boolean value) {
    if (!value) {
      this.locations = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SCAN_RANGE:
      if (value == null) {
        unsetScan_range();
      } else {
        setScan_range((org.apache.impala.thrift.TScanRange)value);
      }
      break;

    case LOCATIONS:
      if (value == null) {
        unsetLocations();
      } else {
        setLocations((List<TScanRangeLocation>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SCAN_RANGE:
      return getScan_range();

    case LOCATIONS:
      return getLocations();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SCAN_RANGE:
      return isSetScan_range();
    case LOCATIONS:
      return isSetLocations();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TScanRangeLocationList)
      return this.equals((TScanRangeLocationList)that);
    return false;
  }

  public boolean equals(TScanRangeLocationList that) {
    if (that == null)
      return false;

    boolean this_present_scan_range = true && this.isSetScan_range();
    boolean that_present_scan_range = true && that.isSetScan_range();
    if (this_present_scan_range || that_present_scan_range) {
      if (!(this_present_scan_range && that_present_scan_range))
        return false;
      if (!this.scan_range.equals(that.scan_range))
        return false;
    }

    boolean this_present_locations = true && this.isSetLocations();
    boolean that_present_locations = true && that.isSetLocations();
    if (this_present_locations || that_present_locations) {
      if (!(this_present_locations && that_present_locations))
        return false;
      if (!this.locations.equals(that.locations))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_scan_range = true && (isSetScan_range());
    list.add(present_scan_range);
    if (present_scan_range)
      list.add(scan_range);

    boolean present_locations = true && (isSetLocations());
    list.add(present_locations);
    if (present_locations)
      list.add(locations);

    return list.hashCode();
  }

  @Override
  public int compareTo(TScanRangeLocationList other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetScan_range()).compareTo(other.isSetScan_range());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetScan_range()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.scan_range, other.scan_range);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLocations()).compareTo(other.isSetLocations());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLocations()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.locations, other.locations);
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
    StringBuilder sb = new StringBuilder("TScanRangeLocationList(");
    boolean first = true;

    sb.append("scan_range:");
    if (this.scan_range == null) {
      sb.append("null");
    } else {
      sb.append(this.scan_range);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("locations:");
    if (this.locations == null) {
      sb.append("null");
    } else {
      sb.append(this.locations);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (scan_range == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'scan_range' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (scan_range != null) {
      scan_range.validate();
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

  private static class TScanRangeLocationListStandardSchemeFactory implements SchemeFactory {
    public TScanRangeLocationListStandardScheme getScheme() {
      return new TScanRangeLocationListStandardScheme();
    }
  }

  private static class TScanRangeLocationListStandardScheme extends StandardScheme<TScanRangeLocationList> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TScanRangeLocationList struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SCAN_RANGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.scan_range = new org.apache.impala.thrift.TScanRange();
              struct.scan_range.read(iprot);
              struct.setScan_rangeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // LOCATIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.locations = new ArrayList<TScanRangeLocation>(_list0.size);
                TScanRangeLocation _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = new TScanRangeLocation();
                  _elem1.read(iprot);
                  struct.locations.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setLocationsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TScanRangeLocationList struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.scan_range != null) {
        oprot.writeFieldBegin(SCAN_RANGE_FIELD_DESC);
        struct.scan_range.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.locations != null) {
        oprot.writeFieldBegin(LOCATIONS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.locations.size()));
          for (TScanRangeLocation _iter3 : struct.locations)
          {
            _iter3.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TScanRangeLocationListTupleSchemeFactory implements SchemeFactory {
    public TScanRangeLocationListTupleScheme getScheme() {
      return new TScanRangeLocationListTupleScheme();
    }
  }

  private static class TScanRangeLocationListTupleScheme extends TupleScheme<TScanRangeLocationList> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TScanRangeLocationList struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.scan_range.write(oprot);
      BitSet optionals = new BitSet();
      if (struct.isSetLocations()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetLocations()) {
        {
          oprot.writeI32(struct.locations.size());
          for (TScanRangeLocation _iter4 : struct.locations)
          {
            _iter4.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TScanRangeLocationList struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.scan_range = new org.apache.impala.thrift.TScanRange();
      struct.scan_range.read(iprot);
      struct.setScan_rangeIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.locations = new ArrayList<TScanRangeLocation>(_list5.size);
          TScanRangeLocation _elem6;
          for (int _i7 = 0; _i7 < _list5.size; ++_i7)
          {
            _elem6 = new TScanRangeLocation();
            _elem6.read(iprot);
            struct.locations.add(_elem6);
          }
        }
        struct.setLocationsIsSet(true);
      }
    }
  }

}

