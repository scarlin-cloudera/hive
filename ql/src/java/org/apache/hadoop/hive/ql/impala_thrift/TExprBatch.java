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
public class TExprBatch implements org.apache.thrift.TBase<TExprBatch, TExprBatch._Fields>, java.io.Serializable, Cloneable, Comparable<TExprBatch> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TExprBatch");

  private static final org.apache.thrift.protocol.TField EXPRS_FIELD_DESC = new org.apache.thrift.protocol.TField("exprs", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TExprBatchStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TExprBatchTupleSchemeFactory());
  }

  public List<TExpr> exprs; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    EXPRS((short)1, "exprs");

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
        case 1: // EXPRS
          return EXPRS;
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
    tmpMap.put(_Fields.EXPRS, new org.apache.thrift.meta_data.FieldMetaData("exprs", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TExpr.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TExprBatch.class, metaDataMap);
  }

  public TExprBatch() {
  }

  public TExprBatch(
    List<TExpr> exprs)
  {
    this();
    this.exprs = exprs;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TExprBatch(TExprBatch other) {
    if (other.isSetExprs()) {
      List<TExpr> __this__exprs = new ArrayList<TExpr>(other.exprs.size());
      for (TExpr other_element : other.exprs) {
        __this__exprs.add(new TExpr(other_element));
      }
      this.exprs = __this__exprs;
    }
  }

  public TExprBatch deepCopy() {
    return new TExprBatch(this);
  }

  @Override
  public void clear() {
    this.exprs = null;
  }

  public int getExprsSize() {
    return (this.exprs == null) ? 0 : this.exprs.size();
  }

  public java.util.Iterator<TExpr> getExprsIterator() {
    return (this.exprs == null) ? null : this.exprs.iterator();
  }

  public void addToExprs(TExpr elem) {
    if (this.exprs == null) {
      this.exprs = new ArrayList<TExpr>();
    }
    this.exprs.add(elem);
  }

  public List<TExpr> getExprs() {
    return this.exprs;
  }

  public TExprBatch setExprs(List<TExpr> exprs) {
    this.exprs = exprs;
    return this;
  }

  public void unsetExprs() {
    this.exprs = null;
  }

  /** Returns true if field exprs is set (has been assigned a value) and false otherwise */
  public boolean isSetExprs() {
    return this.exprs != null;
  }

  public void setExprsIsSet(boolean value) {
    if (!value) {
      this.exprs = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case EXPRS:
      if (value == null) {
        unsetExprs();
      } else {
        setExprs((List<TExpr>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case EXPRS:
      return getExprs();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case EXPRS:
      return isSetExprs();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TExprBatch)
      return this.equals((TExprBatch)that);
    return false;
  }

  public boolean equals(TExprBatch that) {
    if (that == null)
      return false;

    boolean this_present_exprs = true && this.isSetExprs();
    boolean that_present_exprs = true && that.isSetExprs();
    if (this_present_exprs || that_present_exprs) {
      if (!(this_present_exprs && that_present_exprs))
        return false;
      if (!this.exprs.equals(that.exprs))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_exprs = true && (isSetExprs());
    list.add(present_exprs);
    if (present_exprs)
      list.add(exprs);

    return list.hashCode();
  }

  @Override
  public int compareTo(TExprBatch other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetExprs()).compareTo(other.isSetExprs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExprs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.exprs, other.exprs);
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
    StringBuilder sb = new StringBuilder("TExprBatch(");
    boolean first = true;

    sb.append("exprs:");
    if (this.exprs == null) {
      sb.append("null");
    } else {
      sb.append(this.exprs);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (exprs == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'exprs' was not present! Struct: " + toString());
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

  private static class TExprBatchStandardSchemeFactory implements SchemeFactory {
    public TExprBatchStandardScheme getScheme() {
      return new TExprBatchStandardScheme();
    }
  }

  private static class TExprBatchStandardScheme extends StandardScheme<TExprBatch> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TExprBatch struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // EXPRS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list32 = iprot.readListBegin();
                struct.exprs = new ArrayList<TExpr>(_list32.size);
                TExpr _elem33;
                for (int _i34 = 0; _i34 < _list32.size; ++_i34)
                {
                  _elem33 = new TExpr();
                  _elem33.read(iprot);
                  struct.exprs.add(_elem33);
                }
                iprot.readListEnd();
              }
              struct.setExprsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TExprBatch struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.exprs != null) {
        oprot.writeFieldBegin(EXPRS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.exprs.size()));
          for (TExpr _iter35 : struct.exprs)
          {
            _iter35.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TExprBatchTupleSchemeFactory implements SchemeFactory {
    public TExprBatchTupleScheme getScheme() {
      return new TExprBatchTupleScheme();
    }
  }

  private static class TExprBatchTupleScheme extends TupleScheme<TExprBatch> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TExprBatch struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.exprs.size());
        for (TExpr _iter36 : struct.exprs)
        {
          _iter36.write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TExprBatch struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list37 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.exprs = new ArrayList<TExpr>(_list37.size);
        TExpr _elem38;
        for (int _i39 = 0; _i39 < _list37.size; ++_i39)
        {
          _elem38 = new TExpr();
          _elem38.read(iprot);
          struct.exprs.add(_elem38);
        }
      }
      struct.setExprsIsSet(true);
    }
  }

}

