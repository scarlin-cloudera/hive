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
public class TAlterTableReplaceColsParams implements org.apache.thrift.TBase<TAlterTableReplaceColsParams, TAlterTableReplaceColsParams._Fields>, java.io.Serializable, Cloneable, Comparable<TAlterTableReplaceColsParams> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TAlterTableReplaceColsParams");

  private static final org.apache.thrift.protocol.TField COLUMNS_FIELD_DESC = new org.apache.thrift.protocol.TField("columns", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TAlterTableReplaceColsParamsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TAlterTableReplaceColsParamsTupleSchemeFactory());
  }

  public List<org.apache.impala.thrift.TColumn> columns; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    COLUMNS((short)1, "columns");

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
    tmpMap.put(_Fields.COLUMNS, new org.apache.thrift.meta_data.FieldMetaData("columns", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.impala.thrift.TColumn.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TAlterTableReplaceColsParams.class, metaDataMap);
  }

  public TAlterTableReplaceColsParams() {
  }

  public TAlterTableReplaceColsParams(
    List<org.apache.impala.thrift.TColumn> columns)
  {
    this();
    this.columns = columns;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TAlterTableReplaceColsParams(TAlterTableReplaceColsParams other) {
    if (other.isSetColumns()) {
      List<org.apache.impala.thrift.TColumn> __this__columns = new ArrayList<org.apache.impala.thrift.TColumn>(other.columns.size());
      for (org.apache.impala.thrift.TColumn other_element : other.columns) {
        __this__columns.add(new org.apache.impala.thrift.TColumn(other_element));
      }
      this.columns = __this__columns;
    }
  }

  public TAlterTableReplaceColsParams deepCopy() {
    return new TAlterTableReplaceColsParams(this);
  }

  @Override
  public void clear() {
    this.columns = null;
  }

  public int getColumnsSize() {
    return (this.columns == null) ? 0 : this.columns.size();
  }

  public java.util.Iterator<org.apache.impala.thrift.TColumn> getColumnsIterator() {
    return (this.columns == null) ? null : this.columns.iterator();
  }

  public void addToColumns(org.apache.impala.thrift.TColumn elem) {
    if (this.columns == null) {
      this.columns = new ArrayList<org.apache.impala.thrift.TColumn>();
    }
    this.columns.add(elem);
  }

  public List<org.apache.impala.thrift.TColumn> getColumns() {
    return this.columns;
  }

  public TAlterTableReplaceColsParams setColumns(List<org.apache.impala.thrift.TColumn> columns) {
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

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case COLUMNS:
      if (value == null) {
        unsetColumns();
      } else {
        setColumns((List<org.apache.impala.thrift.TColumn>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case COLUMNS:
      return getColumns();

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
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TAlterTableReplaceColsParams)
      return this.equals((TAlterTableReplaceColsParams)that);
    return false;
  }

  public boolean equals(TAlterTableReplaceColsParams that) {
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

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_columns = true && (isSetColumns());
    list.add(present_columns);
    if (present_columns)
      list.add(columns);

    return list.hashCode();
  }

  @Override
  public int compareTo(TAlterTableReplaceColsParams other) {
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
    StringBuilder sb = new StringBuilder("TAlterTableReplaceColsParams(");
    boolean first = true;

    sb.append("columns:");
    if (this.columns == null) {
      sb.append("null");
    } else {
      sb.append(this.columns);
    }
    first = false;
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

  private static class TAlterTableReplaceColsParamsStandardSchemeFactory implements SchemeFactory {
    public TAlterTableReplaceColsParamsStandardScheme getScheme() {
      return new TAlterTableReplaceColsParamsStandardScheme();
    }
  }

  private static class TAlterTableReplaceColsParamsStandardScheme extends StandardScheme<TAlterTableReplaceColsParams> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TAlterTableReplaceColsParams struct) throws org.apache.thrift.TException {
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
                org.apache.thrift.protocol.TList _list24 = iprot.readListBegin();
                struct.columns = new ArrayList<org.apache.impala.thrift.TColumn>(_list24.size);
                org.apache.impala.thrift.TColumn _elem25;
                for (int _i26 = 0; _i26 < _list24.size; ++_i26)
                {
                  _elem25 = new org.apache.impala.thrift.TColumn();
                  _elem25.read(iprot);
                  struct.columns.add(_elem25);
                }
                iprot.readListEnd();
              }
              struct.setColumnsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TAlterTableReplaceColsParams struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.columns != null) {
        oprot.writeFieldBegin(COLUMNS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.columns.size()));
          for (org.apache.impala.thrift.TColumn _iter27 : struct.columns)
          {
            _iter27.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TAlterTableReplaceColsParamsTupleSchemeFactory implements SchemeFactory {
    public TAlterTableReplaceColsParamsTupleScheme getScheme() {
      return new TAlterTableReplaceColsParamsTupleScheme();
    }
  }

  private static class TAlterTableReplaceColsParamsTupleScheme extends TupleScheme<TAlterTableReplaceColsParams> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TAlterTableReplaceColsParams struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.columns.size());
        for (org.apache.impala.thrift.TColumn _iter28 : struct.columns)
        {
          _iter28.write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TAlterTableReplaceColsParams struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list29 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.columns = new ArrayList<org.apache.impala.thrift.TColumn>(_list29.size);
        org.apache.impala.thrift.TColumn _elem30;
        for (int _i31 = 0; _i31 < _list29.size; ++_i31)
        {
          _elem30 = new org.apache.impala.thrift.TColumn();
          _elem30.read(iprot);
          struct.columns.add(_elem30);
        }
      }
      struct.setColumnsIsSet(true);
    }
  }

}

