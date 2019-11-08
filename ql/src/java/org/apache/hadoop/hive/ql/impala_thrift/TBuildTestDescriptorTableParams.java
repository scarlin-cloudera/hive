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
public class TBuildTestDescriptorTableParams implements org.apache.thrift.TBase<TBuildTestDescriptorTableParams, TBuildTestDescriptorTableParams._Fields>, java.io.Serializable, Cloneable, Comparable<TBuildTestDescriptorTableParams> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TBuildTestDescriptorTableParams");

  private static final org.apache.thrift.protocol.TField SLOT_TYPES_FIELD_DESC = new org.apache.thrift.protocol.TField("slot_types", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TBuildTestDescriptorTableParamsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TBuildTestDescriptorTableParamsTupleSchemeFactory());
  }

  public List<List<org.apache.impala.thrift.TColumnType>> slot_types; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SLOT_TYPES((short)1, "slot_types");

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
        case 1: // SLOT_TYPES
          return SLOT_TYPES;
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
    tmpMap.put(_Fields.SLOT_TYPES, new org.apache.thrift.meta_data.FieldMetaData("slot_types", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
                new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.impala.thrift.TColumnType.class)))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TBuildTestDescriptorTableParams.class, metaDataMap);
  }

  public TBuildTestDescriptorTableParams() {
  }

  public TBuildTestDescriptorTableParams(
    List<List<org.apache.impala.thrift.TColumnType>> slot_types)
  {
    this();
    this.slot_types = slot_types;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TBuildTestDescriptorTableParams(TBuildTestDescriptorTableParams other) {
    if (other.isSetSlot_types()) {
      List<List<org.apache.impala.thrift.TColumnType>> __this__slot_types = new ArrayList<List<org.apache.impala.thrift.TColumnType>>(other.slot_types.size());
      for (List<org.apache.impala.thrift.TColumnType> other_element : other.slot_types) {
        List<org.apache.impala.thrift.TColumnType> __this__slot_types_copy = new ArrayList<org.apache.impala.thrift.TColumnType>(other_element.size());
        for (org.apache.impala.thrift.TColumnType other_element_element : other_element) {
          __this__slot_types_copy.add(new org.apache.impala.thrift.TColumnType(other_element_element));
        }
        __this__slot_types.add(__this__slot_types_copy);
      }
      this.slot_types = __this__slot_types;
    }
  }

  public TBuildTestDescriptorTableParams deepCopy() {
    return new TBuildTestDescriptorTableParams(this);
  }

  @Override
  public void clear() {
    this.slot_types = null;
  }

  public int getSlot_typesSize() {
    return (this.slot_types == null) ? 0 : this.slot_types.size();
  }

  public java.util.Iterator<List<org.apache.impala.thrift.TColumnType>> getSlot_typesIterator() {
    return (this.slot_types == null) ? null : this.slot_types.iterator();
  }

  public void addToSlot_types(List<org.apache.impala.thrift.TColumnType> elem) {
    if (this.slot_types == null) {
      this.slot_types = new ArrayList<List<org.apache.impala.thrift.TColumnType>>();
    }
    this.slot_types.add(elem);
  }

  public List<List<org.apache.impala.thrift.TColumnType>> getSlot_types() {
    return this.slot_types;
  }

  public TBuildTestDescriptorTableParams setSlot_types(List<List<org.apache.impala.thrift.TColumnType>> slot_types) {
    this.slot_types = slot_types;
    return this;
  }

  public void unsetSlot_types() {
    this.slot_types = null;
  }

  /** Returns true if field slot_types is set (has been assigned a value) and false otherwise */
  public boolean isSetSlot_types() {
    return this.slot_types != null;
  }

  public void setSlot_typesIsSet(boolean value) {
    if (!value) {
      this.slot_types = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SLOT_TYPES:
      if (value == null) {
        unsetSlot_types();
      } else {
        setSlot_types((List<List<org.apache.impala.thrift.TColumnType>>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SLOT_TYPES:
      return getSlot_types();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SLOT_TYPES:
      return isSetSlot_types();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TBuildTestDescriptorTableParams)
      return this.equals((TBuildTestDescriptorTableParams)that);
    return false;
  }

  public boolean equals(TBuildTestDescriptorTableParams that) {
    if (that == null)
      return false;

    boolean this_present_slot_types = true && this.isSetSlot_types();
    boolean that_present_slot_types = true && that.isSetSlot_types();
    if (this_present_slot_types || that_present_slot_types) {
      if (!(this_present_slot_types && that_present_slot_types))
        return false;
      if (!this.slot_types.equals(that.slot_types))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_slot_types = true && (isSetSlot_types());
    list.add(present_slot_types);
    if (present_slot_types)
      list.add(slot_types);

    return list.hashCode();
  }

  @Override
  public int compareTo(TBuildTestDescriptorTableParams other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSlot_types()).compareTo(other.isSetSlot_types());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSlot_types()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.slot_types, other.slot_types);
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
    StringBuilder sb = new StringBuilder("TBuildTestDescriptorTableParams(");
    boolean first = true;

    sb.append("slot_types:");
    if (this.slot_types == null) {
      sb.append("null");
    } else {
      sb.append(this.slot_types);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (slot_types == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'slot_types' was not present! Struct: " + toString());
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

  private static class TBuildTestDescriptorTableParamsStandardSchemeFactory implements SchemeFactory {
    public TBuildTestDescriptorTableParamsStandardScheme getScheme() {
      return new TBuildTestDescriptorTableParamsStandardScheme();
    }
  }

  private static class TBuildTestDescriptorTableParamsStandardScheme extends StandardScheme<TBuildTestDescriptorTableParams> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TBuildTestDescriptorTableParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SLOT_TYPES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list226 = iprot.readListBegin();
                struct.slot_types = new ArrayList<List<org.apache.impala.thrift.TColumnType>>(_list226.size);
                List<org.apache.impala.thrift.TColumnType> _elem227;
                for (int _i228 = 0; _i228 < _list226.size; ++_i228)
                {
                  {
                    org.apache.thrift.protocol.TList _list229 = iprot.readListBegin();
                    _elem227 = new ArrayList<org.apache.impala.thrift.TColumnType>(_list229.size);
                    org.apache.impala.thrift.TColumnType _elem230;
                    for (int _i231 = 0; _i231 < _list229.size; ++_i231)
                    {
                      _elem230 = new org.apache.impala.thrift.TColumnType();
                      _elem230.read(iprot);
                      _elem227.add(_elem230);
                    }
                    iprot.readListEnd();
                  }
                  struct.slot_types.add(_elem227);
                }
                iprot.readListEnd();
              }
              struct.setSlot_typesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TBuildTestDescriptorTableParams struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.slot_types != null) {
        oprot.writeFieldBegin(SLOT_TYPES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.LIST, struct.slot_types.size()));
          for (List<org.apache.impala.thrift.TColumnType> _iter232 : struct.slot_types)
          {
            {
              oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, _iter232.size()));
              for (org.apache.impala.thrift.TColumnType _iter233 : _iter232)
              {
                _iter233.write(oprot);
              }
              oprot.writeListEnd();
            }
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TBuildTestDescriptorTableParamsTupleSchemeFactory implements SchemeFactory {
    public TBuildTestDescriptorTableParamsTupleScheme getScheme() {
      return new TBuildTestDescriptorTableParamsTupleScheme();
    }
  }

  private static class TBuildTestDescriptorTableParamsTupleScheme extends TupleScheme<TBuildTestDescriptorTableParams> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TBuildTestDescriptorTableParams struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.slot_types.size());
        for (List<org.apache.impala.thrift.TColumnType> _iter234 : struct.slot_types)
        {
          {
            oprot.writeI32(_iter234.size());
            for (org.apache.impala.thrift.TColumnType _iter235 : _iter234)
            {
              _iter235.write(oprot);
            }
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TBuildTestDescriptorTableParams struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list236 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.LIST, iprot.readI32());
        struct.slot_types = new ArrayList<List<org.apache.impala.thrift.TColumnType>>(_list236.size);
        List<org.apache.impala.thrift.TColumnType> _elem237;
        for (int _i238 = 0; _i238 < _list236.size; ++_i238)
        {
          {
            org.apache.thrift.protocol.TList _list239 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
            _elem237 = new ArrayList<org.apache.impala.thrift.TColumnType>(_list239.size);
            org.apache.impala.thrift.TColumnType _elem240;
            for (int _i241 = 0; _i241 < _list239.size; ++_i241)
            {
              _elem240 = new org.apache.impala.thrift.TColumnType();
              _elem240.read(iprot);
              _elem237.add(_elem240);
            }
          }
          struct.slot_types.add(_elem237);
        }
      }
      struct.setSlot_typesIsSet(true);
    }
  }

}

