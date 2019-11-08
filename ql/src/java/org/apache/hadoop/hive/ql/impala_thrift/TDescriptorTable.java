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
public class TDescriptorTable implements org.apache.thrift.TBase<TDescriptorTable, TDescriptorTable._Fields>, java.io.Serializable, Cloneable, Comparable<TDescriptorTable> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDescriptorTable");

  private static final org.apache.thrift.protocol.TField SLOT_DESCRIPTORS_FIELD_DESC = new org.apache.thrift.protocol.TField("slotDescriptors", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField TUPLE_DESCRIPTORS_FIELD_DESC = new org.apache.thrift.protocol.TField("tupleDescriptors", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField TABLE_DESCRIPTORS_FIELD_DESC = new org.apache.thrift.protocol.TField("tableDescriptors", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TDescriptorTableStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TDescriptorTableTupleSchemeFactory());
  }

  public List<TSlotDescriptor> slotDescriptors; // optional
  public List<TTupleDescriptor> tupleDescriptors; // required
  public List<TTableDescriptor> tableDescriptors; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SLOT_DESCRIPTORS((short)1, "slotDescriptors"),
    TUPLE_DESCRIPTORS((short)2, "tupleDescriptors"),
    TABLE_DESCRIPTORS((short)3, "tableDescriptors");

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
        case 1: // SLOT_DESCRIPTORS
          return SLOT_DESCRIPTORS;
        case 2: // TUPLE_DESCRIPTORS
          return TUPLE_DESCRIPTORS;
        case 3: // TABLE_DESCRIPTORS
          return TABLE_DESCRIPTORS;
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
  private static final _Fields optionals[] = {_Fields.SLOT_DESCRIPTORS,_Fields.TABLE_DESCRIPTORS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SLOT_DESCRIPTORS, new org.apache.thrift.meta_data.FieldMetaData("slotDescriptors", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TSlotDescriptor.class))));
    tmpMap.put(_Fields.TUPLE_DESCRIPTORS, new org.apache.thrift.meta_data.FieldMetaData("tupleDescriptors", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TTupleDescriptor.class))));
    tmpMap.put(_Fields.TABLE_DESCRIPTORS, new org.apache.thrift.meta_data.FieldMetaData("tableDescriptors", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TTableDescriptor.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDescriptorTable.class, metaDataMap);
  }

  public TDescriptorTable() {
  }

  public TDescriptorTable(
    List<TTupleDescriptor> tupleDescriptors)
  {
    this();
    this.tupleDescriptors = tupleDescriptors;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TDescriptorTable(TDescriptorTable other) {
    if (other.isSetSlotDescriptors()) {
      List<TSlotDescriptor> __this__slotDescriptors = new ArrayList<TSlotDescriptor>(other.slotDescriptors.size());
      for (TSlotDescriptor other_element : other.slotDescriptors) {
        __this__slotDescriptors.add(new TSlotDescriptor(other_element));
      }
      this.slotDescriptors = __this__slotDescriptors;
    }
    if (other.isSetTupleDescriptors()) {
      List<TTupleDescriptor> __this__tupleDescriptors = new ArrayList<TTupleDescriptor>(other.tupleDescriptors.size());
      for (TTupleDescriptor other_element : other.tupleDescriptors) {
        __this__tupleDescriptors.add(new TTupleDescriptor(other_element));
      }
      this.tupleDescriptors = __this__tupleDescriptors;
    }
    if (other.isSetTableDescriptors()) {
      List<TTableDescriptor> __this__tableDescriptors = new ArrayList<TTableDescriptor>(other.tableDescriptors.size());
      for (TTableDescriptor other_element : other.tableDescriptors) {
        __this__tableDescriptors.add(new TTableDescriptor(other_element));
      }
      this.tableDescriptors = __this__tableDescriptors;
    }
  }

  public TDescriptorTable deepCopy() {
    return new TDescriptorTable(this);
  }

  @Override
  public void clear() {
    this.slotDescriptors = null;
    this.tupleDescriptors = null;
    this.tableDescriptors = null;
  }

  public int getSlotDescriptorsSize() {
    return (this.slotDescriptors == null) ? 0 : this.slotDescriptors.size();
  }

  public java.util.Iterator<TSlotDescriptor> getSlotDescriptorsIterator() {
    return (this.slotDescriptors == null) ? null : this.slotDescriptors.iterator();
  }

  public void addToSlotDescriptors(TSlotDescriptor elem) {
    if (this.slotDescriptors == null) {
      this.slotDescriptors = new ArrayList<TSlotDescriptor>();
    }
    this.slotDescriptors.add(elem);
  }

  public List<TSlotDescriptor> getSlotDescriptors() {
    return this.slotDescriptors;
  }

  public TDescriptorTable setSlotDescriptors(List<TSlotDescriptor> slotDescriptors) {
    this.slotDescriptors = slotDescriptors;
    return this;
  }

  public void unsetSlotDescriptors() {
    this.slotDescriptors = null;
  }

  /** Returns true if field slotDescriptors is set (has been assigned a value) and false otherwise */
  public boolean isSetSlotDescriptors() {
    return this.slotDescriptors != null;
  }

  public void setSlotDescriptorsIsSet(boolean value) {
    if (!value) {
      this.slotDescriptors = null;
    }
  }

  public int getTupleDescriptorsSize() {
    return (this.tupleDescriptors == null) ? 0 : this.tupleDescriptors.size();
  }

  public java.util.Iterator<TTupleDescriptor> getTupleDescriptorsIterator() {
    return (this.tupleDescriptors == null) ? null : this.tupleDescriptors.iterator();
  }

  public void addToTupleDescriptors(TTupleDescriptor elem) {
    if (this.tupleDescriptors == null) {
      this.tupleDescriptors = new ArrayList<TTupleDescriptor>();
    }
    this.tupleDescriptors.add(elem);
  }

  public List<TTupleDescriptor> getTupleDescriptors() {
    return this.tupleDescriptors;
  }

  public TDescriptorTable setTupleDescriptors(List<TTupleDescriptor> tupleDescriptors) {
    this.tupleDescriptors = tupleDescriptors;
    return this;
  }

  public void unsetTupleDescriptors() {
    this.tupleDescriptors = null;
  }

  /** Returns true if field tupleDescriptors is set (has been assigned a value) and false otherwise */
  public boolean isSetTupleDescriptors() {
    return this.tupleDescriptors != null;
  }

  public void setTupleDescriptorsIsSet(boolean value) {
    if (!value) {
      this.tupleDescriptors = null;
    }
  }

  public int getTableDescriptorsSize() {
    return (this.tableDescriptors == null) ? 0 : this.tableDescriptors.size();
  }

  public java.util.Iterator<TTableDescriptor> getTableDescriptorsIterator() {
    return (this.tableDescriptors == null) ? null : this.tableDescriptors.iterator();
  }

  public void addToTableDescriptors(TTableDescriptor elem) {
    if (this.tableDescriptors == null) {
      this.tableDescriptors = new ArrayList<TTableDescriptor>();
    }
    this.tableDescriptors.add(elem);
  }

  public List<TTableDescriptor> getTableDescriptors() {
    return this.tableDescriptors;
  }

  public TDescriptorTable setTableDescriptors(List<TTableDescriptor> tableDescriptors) {
    this.tableDescriptors = tableDescriptors;
    return this;
  }

  public void unsetTableDescriptors() {
    this.tableDescriptors = null;
  }

  /** Returns true if field tableDescriptors is set (has been assigned a value) and false otherwise */
  public boolean isSetTableDescriptors() {
    return this.tableDescriptors != null;
  }

  public void setTableDescriptorsIsSet(boolean value) {
    if (!value) {
      this.tableDescriptors = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SLOT_DESCRIPTORS:
      if (value == null) {
        unsetSlotDescriptors();
      } else {
        setSlotDescriptors((List<TSlotDescriptor>)value);
      }
      break;

    case TUPLE_DESCRIPTORS:
      if (value == null) {
        unsetTupleDescriptors();
      } else {
        setTupleDescriptors((List<TTupleDescriptor>)value);
      }
      break;

    case TABLE_DESCRIPTORS:
      if (value == null) {
        unsetTableDescriptors();
      } else {
        setTableDescriptors((List<TTableDescriptor>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SLOT_DESCRIPTORS:
      return getSlotDescriptors();

    case TUPLE_DESCRIPTORS:
      return getTupleDescriptors();

    case TABLE_DESCRIPTORS:
      return getTableDescriptors();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SLOT_DESCRIPTORS:
      return isSetSlotDescriptors();
    case TUPLE_DESCRIPTORS:
      return isSetTupleDescriptors();
    case TABLE_DESCRIPTORS:
      return isSetTableDescriptors();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TDescriptorTable)
      return this.equals((TDescriptorTable)that);
    return false;
  }

  public boolean equals(TDescriptorTable that) {
    if (that == null)
      return false;

    boolean this_present_slotDescriptors = true && this.isSetSlotDescriptors();
    boolean that_present_slotDescriptors = true && that.isSetSlotDescriptors();
    if (this_present_slotDescriptors || that_present_slotDescriptors) {
      if (!(this_present_slotDescriptors && that_present_slotDescriptors))
        return false;
      if (!this.slotDescriptors.equals(that.slotDescriptors))
        return false;
    }

    boolean this_present_tupleDescriptors = true && this.isSetTupleDescriptors();
    boolean that_present_tupleDescriptors = true && that.isSetTupleDescriptors();
    if (this_present_tupleDescriptors || that_present_tupleDescriptors) {
      if (!(this_present_tupleDescriptors && that_present_tupleDescriptors))
        return false;
      if (!this.tupleDescriptors.equals(that.tupleDescriptors))
        return false;
    }

    boolean this_present_tableDescriptors = true && this.isSetTableDescriptors();
    boolean that_present_tableDescriptors = true && that.isSetTableDescriptors();
    if (this_present_tableDescriptors || that_present_tableDescriptors) {
      if (!(this_present_tableDescriptors && that_present_tableDescriptors))
        return false;
      if (!this.tableDescriptors.equals(that.tableDescriptors))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_slotDescriptors = true && (isSetSlotDescriptors());
    list.add(present_slotDescriptors);
    if (present_slotDescriptors)
      list.add(slotDescriptors);

    boolean present_tupleDescriptors = true && (isSetTupleDescriptors());
    list.add(present_tupleDescriptors);
    if (present_tupleDescriptors)
      list.add(tupleDescriptors);

    boolean present_tableDescriptors = true && (isSetTableDescriptors());
    list.add(present_tableDescriptors);
    if (present_tableDescriptors)
      list.add(tableDescriptors);

    return list.hashCode();
  }

  @Override
  public int compareTo(TDescriptorTable other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSlotDescriptors()).compareTo(other.isSetSlotDescriptors());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSlotDescriptors()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.slotDescriptors, other.slotDescriptors);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTupleDescriptors()).compareTo(other.isSetTupleDescriptors());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTupleDescriptors()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tupleDescriptors, other.tupleDescriptors);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTableDescriptors()).compareTo(other.isSetTableDescriptors());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTableDescriptors()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tableDescriptors, other.tableDescriptors);
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
    StringBuilder sb = new StringBuilder("TDescriptorTable(");
    boolean first = true;

    if (isSetSlotDescriptors()) {
      sb.append("slotDescriptors:");
      if (this.slotDescriptors == null) {
        sb.append("null");
      } else {
        sb.append(this.slotDescriptors);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("tupleDescriptors:");
    if (this.tupleDescriptors == null) {
      sb.append("null");
    } else {
      sb.append(this.tupleDescriptors);
    }
    first = false;
    if (isSetTableDescriptors()) {
      if (!first) sb.append(", ");
      sb.append("tableDescriptors:");
      if (this.tableDescriptors == null) {
        sb.append("null");
      } else {
        sb.append(this.tableDescriptors);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (tupleDescriptors == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'tupleDescriptors' was not present! Struct: " + toString());
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

  private static class TDescriptorTableStandardSchemeFactory implements SchemeFactory {
    public TDescriptorTableStandardScheme getScheme() {
      return new TDescriptorTableStandardScheme();
    }
  }

  private static class TDescriptorTableStandardScheme extends StandardScheme<TDescriptorTable> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TDescriptorTable struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SLOT_DESCRIPTORS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list24 = iprot.readListBegin();
                struct.slotDescriptors = new ArrayList<TSlotDescriptor>(_list24.size);
                TSlotDescriptor _elem25;
                for (int _i26 = 0; _i26 < _list24.size; ++_i26)
                {
                  _elem25 = new TSlotDescriptor();
                  _elem25.read(iprot);
                  struct.slotDescriptors.add(_elem25);
                }
                iprot.readListEnd();
              }
              struct.setSlotDescriptorsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TUPLE_DESCRIPTORS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list27 = iprot.readListBegin();
                struct.tupleDescriptors = new ArrayList<TTupleDescriptor>(_list27.size);
                TTupleDescriptor _elem28;
                for (int _i29 = 0; _i29 < _list27.size; ++_i29)
                {
                  _elem28 = new TTupleDescriptor();
                  _elem28.read(iprot);
                  struct.tupleDescriptors.add(_elem28);
                }
                iprot.readListEnd();
              }
              struct.setTupleDescriptorsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TABLE_DESCRIPTORS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list30 = iprot.readListBegin();
                struct.tableDescriptors = new ArrayList<TTableDescriptor>(_list30.size);
                TTableDescriptor _elem31;
                for (int _i32 = 0; _i32 < _list30.size; ++_i32)
                {
                  _elem31 = new TTableDescriptor();
                  _elem31.read(iprot);
                  struct.tableDescriptors.add(_elem31);
                }
                iprot.readListEnd();
              }
              struct.setTableDescriptorsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TDescriptorTable struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.slotDescriptors != null) {
        if (struct.isSetSlotDescriptors()) {
          oprot.writeFieldBegin(SLOT_DESCRIPTORS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.slotDescriptors.size()));
            for (TSlotDescriptor _iter33 : struct.slotDescriptors)
            {
              _iter33.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.tupleDescriptors != null) {
        oprot.writeFieldBegin(TUPLE_DESCRIPTORS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.tupleDescriptors.size()));
          for (TTupleDescriptor _iter34 : struct.tupleDescriptors)
          {
            _iter34.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.tableDescriptors != null) {
        if (struct.isSetTableDescriptors()) {
          oprot.writeFieldBegin(TABLE_DESCRIPTORS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.tableDescriptors.size()));
            for (TTableDescriptor _iter35 : struct.tableDescriptors)
            {
              _iter35.write(oprot);
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

  private static class TDescriptorTableTupleSchemeFactory implements SchemeFactory {
    public TDescriptorTableTupleScheme getScheme() {
      return new TDescriptorTableTupleScheme();
    }
  }

  private static class TDescriptorTableTupleScheme extends TupleScheme<TDescriptorTable> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TDescriptorTable struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.tupleDescriptors.size());
        for (TTupleDescriptor _iter36 : struct.tupleDescriptors)
        {
          _iter36.write(oprot);
        }
      }
      BitSet optionals = new BitSet();
      if (struct.isSetSlotDescriptors()) {
        optionals.set(0);
      }
      if (struct.isSetTableDescriptors()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetSlotDescriptors()) {
        {
          oprot.writeI32(struct.slotDescriptors.size());
          for (TSlotDescriptor _iter37 : struct.slotDescriptors)
          {
            _iter37.write(oprot);
          }
        }
      }
      if (struct.isSetTableDescriptors()) {
        {
          oprot.writeI32(struct.tableDescriptors.size());
          for (TTableDescriptor _iter38 : struct.tableDescriptors)
          {
            _iter38.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TDescriptorTable struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list39 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.tupleDescriptors = new ArrayList<TTupleDescriptor>(_list39.size);
        TTupleDescriptor _elem40;
        for (int _i41 = 0; _i41 < _list39.size; ++_i41)
        {
          _elem40 = new TTupleDescriptor();
          _elem40.read(iprot);
          struct.tupleDescriptors.add(_elem40);
        }
      }
      struct.setTupleDescriptorsIsSet(true);
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list42 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.slotDescriptors = new ArrayList<TSlotDescriptor>(_list42.size);
          TSlotDescriptor _elem43;
          for (int _i44 = 0; _i44 < _list42.size; ++_i44)
          {
            _elem43 = new TSlotDescriptor();
            _elem43.read(iprot);
            struct.slotDescriptors.add(_elem43);
          }
        }
        struct.setSlotDescriptorsIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list45 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.tableDescriptors = new ArrayList<TTableDescriptor>(_list45.size);
          TTableDescriptor _elem46;
          for (int _i47 = 0; _i47 < _list45.size; ++_i47)
          {
            _elem46 = new TTableDescriptor();
            _elem46.read(iprot);
            struct.tableDescriptors.add(_elem46);
          }
        }
        struct.setTableDescriptorsIsSet(true);
      }
    }
  }

}

