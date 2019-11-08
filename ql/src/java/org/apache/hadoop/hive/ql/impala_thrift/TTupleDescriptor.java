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
public class TTupleDescriptor implements org.apache.thrift.TBase<TTupleDescriptor, TTupleDescriptor._Fields>, java.io.Serializable, Cloneable, Comparable<TTupleDescriptor> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TTupleDescriptor");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField BYTE_SIZE_FIELD_DESC = new org.apache.thrift.protocol.TField("byteSize", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField NUM_NULL_BYTES_FIELD_DESC = new org.apache.thrift.protocol.TField("numNullBytes", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField TABLE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("tableId", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField TUPLE_PATH_FIELD_DESC = new org.apache.thrift.protocol.TField("tuplePath", org.apache.thrift.protocol.TType.LIST, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TTupleDescriptorStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TTupleDescriptorTupleSchemeFactory());
  }

  public int id; // required
  public int byteSize; // required
  public int numNullBytes; // required
  public int tableId; // optional
  public List<Integer> tuplePath; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    BYTE_SIZE((short)2, "byteSize"),
    NUM_NULL_BYTES((short)3, "numNullBytes"),
    TABLE_ID((short)4, "tableId"),
    TUPLE_PATH((short)5, "tuplePath");

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
        case 1: // ID
          return ID;
        case 2: // BYTE_SIZE
          return BYTE_SIZE;
        case 3: // NUM_NULL_BYTES
          return NUM_NULL_BYTES;
        case 4: // TABLE_ID
          return TABLE_ID;
        case 5: // TUPLE_PATH
          return TUPLE_PATH;
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
  private static final int __ID_ISSET_ID = 0;
  private static final int __BYTESIZE_ISSET_ID = 1;
  private static final int __NUMNULLBYTES_ISSET_ID = 2;
  private static final int __TABLEID_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.TABLE_ID,_Fields.TUPLE_PATH};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "TTupleId")));
    tmpMap.put(_Fields.BYTE_SIZE, new org.apache.thrift.meta_data.FieldMetaData("byteSize", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.NUM_NULL_BYTES, new org.apache.thrift.meta_data.FieldMetaData("numNullBytes", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TABLE_ID, new org.apache.thrift.meta_data.FieldMetaData("tableId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "TTableId")));
    tmpMap.put(_Fields.TUPLE_PATH, new org.apache.thrift.meta_data.FieldMetaData("tuplePath", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TTupleDescriptor.class, metaDataMap);
  }

  public TTupleDescriptor() {
  }

  public TTupleDescriptor(
    int id,
    int byteSize,
    int numNullBytes)
  {
    this();
    this.id = id;
    setIdIsSet(true);
    this.byteSize = byteSize;
    setByteSizeIsSet(true);
    this.numNullBytes = numNullBytes;
    setNumNullBytesIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TTupleDescriptor(TTupleDescriptor other) {
    __isset_bitfield = other.__isset_bitfield;
    this.id = other.id;
    this.byteSize = other.byteSize;
    this.numNullBytes = other.numNullBytes;
    this.tableId = other.tableId;
    if (other.isSetTuplePath()) {
      List<Integer> __this__tuplePath = new ArrayList<Integer>(other.tuplePath);
      this.tuplePath = __this__tuplePath;
    }
  }

  public TTupleDescriptor deepCopy() {
    return new TTupleDescriptor(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    setByteSizeIsSet(false);
    this.byteSize = 0;
    setNumNullBytesIsSet(false);
    this.numNullBytes = 0;
    setTableIdIsSet(false);
    this.tableId = 0;
    this.tuplePath = null;
  }

  public int getId() {
    return this.id;
  }

  public TTupleDescriptor setId(int id) {
    this.id = id;
    setIdIsSet(true);
    return this;
  }

  public void unsetId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ID_ISSET_ID);
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return EncodingUtils.testBit(__isset_bitfield, __ID_ISSET_ID);
  }

  public void setIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ID_ISSET_ID, value);
  }

  public int getByteSize() {
    return this.byteSize;
  }

  public TTupleDescriptor setByteSize(int byteSize) {
    this.byteSize = byteSize;
    setByteSizeIsSet(true);
    return this;
  }

  public void unsetByteSize() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __BYTESIZE_ISSET_ID);
  }

  /** Returns true if field byteSize is set (has been assigned a value) and false otherwise */
  public boolean isSetByteSize() {
    return EncodingUtils.testBit(__isset_bitfield, __BYTESIZE_ISSET_ID);
  }

  public void setByteSizeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __BYTESIZE_ISSET_ID, value);
  }

  public int getNumNullBytes() {
    return this.numNullBytes;
  }

  public TTupleDescriptor setNumNullBytes(int numNullBytes) {
    this.numNullBytes = numNullBytes;
    setNumNullBytesIsSet(true);
    return this;
  }

  public void unsetNumNullBytes() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __NUMNULLBYTES_ISSET_ID);
  }

  /** Returns true if field numNullBytes is set (has been assigned a value) and false otherwise */
  public boolean isSetNumNullBytes() {
    return EncodingUtils.testBit(__isset_bitfield, __NUMNULLBYTES_ISSET_ID);
  }

  public void setNumNullBytesIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __NUMNULLBYTES_ISSET_ID, value);
  }

  public int getTableId() {
    return this.tableId;
  }

  public TTupleDescriptor setTableId(int tableId) {
    this.tableId = tableId;
    setTableIdIsSet(true);
    return this;
  }

  public void unsetTableId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TABLEID_ISSET_ID);
  }

  /** Returns true if field tableId is set (has been assigned a value) and false otherwise */
  public boolean isSetTableId() {
    return EncodingUtils.testBit(__isset_bitfield, __TABLEID_ISSET_ID);
  }

  public void setTableIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TABLEID_ISSET_ID, value);
  }

  public int getTuplePathSize() {
    return (this.tuplePath == null) ? 0 : this.tuplePath.size();
  }

  public java.util.Iterator<Integer> getTuplePathIterator() {
    return (this.tuplePath == null) ? null : this.tuplePath.iterator();
  }

  public void addToTuplePath(int elem) {
    if (this.tuplePath == null) {
      this.tuplePath = new ArrayList<Integer>();
    }
    this.tuplePath.add(elem);
  }

  public List<Integer> getTuplePath() {
    return this.tuplePath;
  }

  public TTupleDescriptor setTuplePath(List<Integer> tuplePath) {
    this.tuplePath = tuplePath;
    return this;
  }

  public void unsetTuplePath() {
    this.tuplePath = null;
  }

  /** Returns true if field tuplePath is set (has been assigned a value) and false otherwise */
  public boolean isSetTuplePath() {
    return this.tuplePath != null;
  }

  public void setTuplePathIsSet(boolean value) {
    if (!value) {
      this.tuplePath = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((Integer)value);
      }
      break;

    case BYTE_SIZE:
      if (value == null) {
        unsetByteSize();
      } else {
        setByteSize((Integer)value);
      }
      break;

    case NUM_NULL_BYTES:
      if (value == null) {
        unsetNumNullBytes();
      } else {
        setNumNullBytes((Integer)value);
      }
      break;

    case TABLE_ID:
      if (value == null) {
        unsetTableId();
      } else {
        setTableId((Integer)value);
      }
      break;

    case TUPLE_PATH:
      if (value == null) {
        unsetTuplePath();
      } else {
        setTuplePath((List<Integer>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case BYTE_SIZE:
      return getByteSize();

    case NUM_NULL_BYTES:
      return getNumNullBytes();

    case TABLE_ID:
      return getTableId();

    case TUPLE_PATH:
      return getTuplePath();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case BYTE_SIZE:
      return isSetByteSize();
    case NUM_NULL_BYTES:
      return isSetNumNullBytes();
    case TABLE_ID:
      return isSetTableId();
    case TUPLE_PATH:
      return isSetTuplePath();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TTupleDescriptor)
      return this.equals((TTupleDescriptor)that);
    return false;
  }

  public boolean equals(TTupleDescriptor that) {
    if (that == null)
      return false;

    boolean this_present_id = true;
    boolean that_present_id = true;
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (this.id != that.id)
        return false;
    }

    boolean this_present_byteSize = true;
    boolean that_present_byteSize = true;
    if (this_present_byteSize || that_present_byteSize) {
      if (!(this_present_byteSize && that_present_byteSize))
        return false;
      if (this.byteSize != that.byteSize)
        return false;
    }

    boolean this_present_numNullBytes = true;
    boolean that_present_numNullBytes = true;
    if (this_present_numNullBytes || that_present_numNullBytes) {
      if (!(this_present_numNullBytes && that_present_numNullBytes))
        return false;
      if (this.numNullBytes != that.numNullBytes)
        return false;
    }

    boolean this_present_tableId = true && this.isSetTableId();
    boolean that_present_tableId = true && that.isSetTableId();
    if (this_present_tableId || that_present_tableId) {
      if (!(this_present_tableId && that_present_tableId))
        return false;
      if (this.tableId != that.tableId)
        return false;
    }

    boolean this_present_tuplePath = true && this.isSetTuplePath();
    boolean that_present_tuplePath = true && that.isSetTuplePath();
    if (this_present_tuplePath || that_present_tuplePath) {
      if (!(this_present_tuplePath && that_present_tuplePath))
        return false;
      if (!this.tuplePath.equals(that.tuplePath))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_id = true;
    list.add(present_id);
    if (present_id)
      list.add(id);

    boolean present_byteSize = true;
    list.add(present_byteSize);
    if (present_byteSize)
      list.add(byteSize);

    boolean present_numNullBytes = true;
    list.add(present_numNullBytes);
    if (present_numNullBytes)
      list.add(numNullBytes);

    boolean present_tableId = true && (isSetTableId());
    list.add(present_tableId);
    if (present_tableId)
      list.add(tableId);

    boolean present_tuplePath = true && (isSetTuplePath());
    list.add(present_tuplePath);
    if (present_tuplePath)
      list.add(tuplePath);

    return list.hashCode();
  }

  @Override
  public int compareTo(TTupleDescriptor other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetId()).compareTo(other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetByteSize()).compareTo(other.isSetByteSize());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetByteSize()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.byteSize, other.byteSize);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNumNullBytes()).compareTo(other.isSetNumNullBytes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNumNullBytes()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.numNullBytes, other.numNullBytes);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTableId()).compareTo(other.isSetTableId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTableId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tableId, other.tableId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTuplePath()).compareTo(other.isSetTuplePath());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTuplePath()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tuplePath, other.tuplePath);
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
    StringBuilder sb = new StringBuilder("TTupleDescriptor(");
    boolean first = true;

    sb.append("id:");
    sb.append(this.id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("byteSize:");
    sb.append(this.byteSize);
    first = false;
    if (!first) sb.append(", ");
    sb.append("numNullBytes:");
    sb.append(this.numNullBytes);
    first = false;
    if (isSetTableId()) {
      if (!first) sb.append(", ");
      sb.append("tableId:");
      sb.append(this.tableId);
      first = false;
    }
    if (isSetTuplePath()) {
      if (!first) sb.append(", ");
      sb.append("tuplePath:");
      if (this.tuplePath == null) {
        sb.append("null");
      } else {
        sb.append(this.tuplePath);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'id' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'byteSize' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'numNullBytes' because it's a primitive and you chose the non-beans generator.
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

  private static class TTupleDescriptorStandardSchemeFactory implements SchemeFactory {
    public TTupleDescriptorStandardScheme getScheme() {
      return new TTupleDescriptorStandardScheme();
    }
  }

  private static class TTupleDescriptorStandardScheme extends StandardScheme<TTupleDescriptor> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TTupleDescriptor struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.id = iprot.readI32();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // BYTE_SIZE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.byteSize = iprot.readI32();
              struct.setByteSizeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // NUM_NULL_BYTES
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.numNullBytes = iprot.readI32();
              struct.setNumNullBytesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TABLE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.tableId = iprot.readI32();
              struct.setTableIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // TUPLE_PATH
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list16 = iprot.readListBegin();
                struct.tuplePath = new ArrayList<Integer>(_list16.size);
                int _elem17;
                for (int _i18 = 0; _i18 < _list16.size; ++_i18)
                {
                  _elem17 = iprot.readI32();
                  struct.tuplePath.add(_elem17);
                }
                iprot.readListEnd();
              }
              struct.setTuplePathIsSet(true);
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
      if (!struct.isSetId()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'id' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetByteSize()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'byteSize' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetNumNullBytes()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'numNullBytes' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TTupleDescriptor struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ID_FIELD_DESC);
      oprot.writeI32(struct.id);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(BYTE_SIZE_FIELD_DESC);
      oprot.writeI32(struct.byteSize);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(NUM_NULL_BYTES_FIELD_DESC);
      oprot.writeI32(struct.numNullBytes);
      oprot.writeFieldEnd();
      if (struct.isSetTableId()) {
        oprot.writeFieldBegin(TABLE_ID_FIELD_DESC);
        oprot.writeI32(struct.tableId);
        oprot.writeFieldEnd();
      }
      if (struct.tuplePath != null) {
        if (struct.isSetTuplePath()) {
          oprot.writeFieldBegin(TUPLE_PATH_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, struct.tuplePath.size()));
            for (int _iter19 : struct.tuplePath)
            {
              oprot.writeI32(_iter19);
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

  private static class TTupleDescriptorTupleSchemeFactory implements SchemeFactory {
    public TTupleDescriptorTupleScheme getScheme() {
      return new TTupleDescriptorTupleScheme();
    }
  }

  private static class TTupleDescriptorTupleScheme extends TupleScheme<TTupleDescriptor> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TTupleDescriptor struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.id);
      oprot.writeI32(struct.byteSize);
      oprot.writeI32(struct.numNullBytes);
      BitSet optionals = new BitSet();
      if (struct.isSetTableId()) {
        optionals.set(0);
      }
      if (struct.isSetTuplePath()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetTableId()) {
        oprot.writeI32(struct.tableId);
      }
      if (struct.isSetTuplePath()) {
        {
          oprot.writeI32(struct.tuplePath.size());
          for (int _iter20 : struct.tuplePath)
          {
            oprot.writeI32(_iter20);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TTupleDescriptor struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.id = iprot.readI32();
      struct.setIdIsSet(true);
      struct.byteSize = iprot.readI32();
      struct.setByteSizeIsSet(true);
      struct.numNullBytes = iprot.readI32();
      struct.setNumNullBytesIsSet(true);
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.tableId = iprot.readI32();
        struct.setTableIdIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list21 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, iprot.readI32());
          struct.tuplePath = new ArrayList<Integer>(_list21.size);
          int _elem22;
          for (int _i23 = 0; _i23 < _list21.size; ++_i23)
          {
            _elem22 = iprot.readI32();
            struct.tuplePath.add(_elem22);
          }
        }
        struct.setTuplePathIsSet(true);
      }
    }
  }

}

