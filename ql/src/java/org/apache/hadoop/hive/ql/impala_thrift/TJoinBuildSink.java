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
public class TJoinBuildSink implements org.apache.thrift.TBase<TJoinBuildSink, TJoinBuildSink._Fields>, java.io.Serializable, Cloneable, Comparable<TJoinBuildSink> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TJoinBuildSink");

  private static final org.apache.thrift.protocol.TField JOIN_TABLE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("join_table_id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField BUILD_EXPRS_FIELD_DESC = new org.apache.thrift.protocol.TField("build_exprs", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TJoinBuildSinkStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TJoinBuildSinkTupleSchemeFactory());
  }

  public int join_table_id; // required
  public List<org.apache.impala.thrift.TExpr> build_exprs; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    JOIN_TABLE_ID((short)1, "join_table_id"),
    BUILD_EXPRS((short)2, "build_exprs");

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
        case 1: // JOIN_TABLE_ID
          return JOIN_TABLE_ID;
        case 2: // BUILD_EXPRS
          return BUILD_EXPRS;
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
  private static final int __JOIN_TABLE_ID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.JOIN_TABLE_ID, new org.apache.thrift.meta_data.FieldMetaData("join_table_id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "TJoinTableId")));
    tmpMap.put(_Fields.BUILD_EXPRS, new org.apache.thrift.meta_data.FieldMetaData("build_exprs", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.impala.thrift.TExpr.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TJoinBuildSink.class, metaDataMap);
  }

  public TJoinBuildSink() {
  }

  public TJoinBuildSink(
    int join_table_id,
    List<org.apache.impala.thrift.TExpr> build_exprs)
  {
    this();
    this.join_table_id = join_table_id;
    setJoin_table_idIsSet(true);
    this.build_exprs = build_exprs;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TJoinBuildSink(TJoinBuildSink other) {
    __isset_bitfield = other.__isset_bitfield;
    this.join_table_id = other.join_table_id;
    if (other.isSetBuild_exprs()) {
      List<org.apache.impala.thrift.TExpr> __this__build_exprs = new ArrayList<org.apache.impala.thrift.TExpr>(other.build_exprs.size());
      for (org.apache.impala.thrift.TExpr other_element : other.build_exprs) {
        __this__build_exprs.add(new org.apache.impala.thrift.TExpr(other_element));
      }
      this.build_exprs = __this__build_exprs;
    }
  }

  public TJoinBuildSink deepCopy() {
    return new TJoinBuildSink(this);
  }

  @Override
  public void clear() {
    setJoin_table_idIsSet(false);
    this.join_table_id = 0;
    this.build_exprs = null;
  }

  public int getJoin_table_id() {
    return this.join_table_id;
  }

  public TJoinBuildSink setJoin_table_id(int join_table_id) {
    this.join_table_id = join_table_id;
    setJoin_table_idIsSet(true);
    return this;
  }

  public void unsetJoin_table_id() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __JOIN_TABLE_ID_ISSET_ID);
  }

  /** Returns true if field join_table_id is set (has been assigned a value) and false otherwise */
  public boolean isSetJoin_table_id() {
    return EncodingUtils.testBit(__isset_bitfield, __JOIN_TABLE_ID_ISSET_ID);
  }

  public void setJoin_table_idIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __JOIN_TABLE_ID_ISSET_ID, value);
  }

  public int getBuild_exprsSize() {
    return (this.build_exprs == null) ? 0 : this.build_exprs.size();
  }

  public java.util.Iterator<org.apache.impala.thrift.TExpr> getBuild_exprsIterator() {
    return (this.build_exprs == null) ? null : this.build_exprs.iterator();
  }

  public void addToBuild_exprs(org.apache.impala.thrift.TExpr elem) {
    if (this.build_exprs == null) {
      this.build_exprs = new ArrayList<org.apache.impala.thrift.TExpr>();
    }
    this.build_exprs.add(elem);
  }

  public List<org.apache.impala.thrift.TExpr> getBuild_exprs() {
    return this.build_exprs;
  }

  public TJoinBuildSink setBuild_exprs(List<org.apache.impala.thrift.TExpr> build_exprs) {
    this.build_exprs = build_exprs;
    return this;
  }

  public void unsetBuild_exprs() {
    this.build_exprs = null;
  }

  /** Returns true if field build_exprs is set (has been assigned a value) and false otherwise */
  public boolean isSetBuild_exprs() {
    return this.build_exprs != null;
  }

  public void setBuild_exprsIsSet(boolean value) {
    if (!value) {
      this.build_exprs = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case JOIN_TABLE_ID:
      if (value == null) {
        unsetJoin_table_id();
      } else {
        setJoin_table_id((Integer)value);
      }
      break;

    case BUILD_EXPRS:
      if (value == null) {
        unsetBuild_exprs();
      } else {
        setBuild_exprs((List<org.apache.impala.thrift.TExpr>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case JOIN_TABLE_ID:
      return getJoin_table_id();

    case BUILD_EXPRS:
      return getBuild_exprs();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case JOIN_TABLE_ID:
      return isSetJoin_table_id();
    case BUILD_EXPRS:
      return isSetBuild_exprs();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TJoinBuildSink)
      return this.equals((TJoinBuildSink)that);
    return false;
  }

  public boolean equals(TJoinBuildSink that) {
    if (that == null)
      return false;

    boolean this_present_join_table_id = true;
    boolean that_present_join_table_id = true;
    if (this_present_join_table_id || that_present_join_table_id) {
      if (!(this_present_join_table_id && that_present_join_table_id))
        return false;
      if (this.join_table_id != that.join_table_id)
        return false;
    }

    boolean this_present_build_exprs = true && this.isSetBuild_exprs();
    boolean that_present_build_exprs = true && that.isSetBuild_exprs();
    if (this_present_build_exprs || that_present_build_exprs) {
      if (!(this_present_build_exprs && that_present_build_exprs))
        return false;
      if (!this.build_exprs.equals(that.build_exprs))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_join_table_id = true;
    list.add(present_join_table_id);
    if (present_join_table_id)
      list.add(join_table_id);

    boolean present_build_exprs = true && (isSetBuild_exprs());
    list.add(present_build_exprs);
    if (present_build_exprs)
      list.add(build_exprs);

    return list.hashCode();
  }

  @Override
  public int compareTo(TJoinBuildSink other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetJoin_table_id()).compareTo(other.isSetJoin_table_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJoin_table_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.join_table_id, other.join_table_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBuild_exprs()).compareTo(other.isSetBuild_exprs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBuild_exprs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.build_exprs, other.build_exprs);
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
    StringBuilder sb = new StringBuilder("TJoinBuildSink(");
    boolean first = true;

    sb.append("join_table_id:");
    sb.append(this.join_table_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("build_exprs:");
    if (this.build_exprs == null) {
      sb.append("null");
    } else {
      sb.append(this.build_exprs);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'join_table_id' because it's a primitive and you chose the non-beans generator.
    if (build_exprs == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'build_exprs' was not present! Struct: " + toString());
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

  private static class TJoinBuildSinkStandardSchemeFactory implements SchemeFactory {
    public TJoinBuildSinkStandardScheme getScheme() {
      return new TJoinBuildSinkStandardScheme();
    }
  }

  private static class TJoinBuildSinkStandardScheme extends StandardScheme<TJoinBuildSink> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TJoinBuildSink struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // JOIN_TABLE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.join_table_id = iprot.readI32();
              struct.setJoin_table_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // BUILD_EXPRS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list24 = iprot.readListBegin();
                struct.build_exprs = new ArrayList<org.apache.impala.thrift.TExpr>(_list24.size);
                org.apache.impala.thrift.TExpr _elem25;
                for (int _i26 = 0; _i26 < _list24.size; ++_i26)
                {
                  _elem25 = new org.apache.impala.thrift.TExpr();
                  _elem25.read(iprot);
                  struct.build_exprs.add(_elem25);
                }
                iprot.readListEnd();
              }
              struct.setBuild_exprsIsSet(true);
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
      if (!struct.isSetJoin_table_id()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'join_table_id' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TJoinBuildSink struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(JOIN_TABLE_ID_FIELD_DESC);
      oprot.writeI32(struct.join_table_id);
      oprot.writeFieldEnd();
      if (struct.build_exprs != null) {
        oprot.writeFieldBegin(BUILD_EXPRS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.build_exprs.size()));
          for (org.apache.impala.thrift.TExpr _iter27 : struct.build_exprs)
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

  private static class TJoinBuildSinkTupleSchemeFactory implements SchemeFactory {
    public TJoinBuildSinkTupleScheme getScheme() {
      return new TJoinBuildSinkTupleScheme();
    }
  }

  private static class TJoinBuildSinkTupleScheme extends TupleScheme<TJoinBuildSink> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TJoinBuildSink struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.join_table_id);
      {
        oprot.writeI32(struct.build_exprs.size());
        for (org.apache.impala.thrift.TExpr _iter28 : struct.build_exprs)
        {
          _iter28.write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TJoinBuildSink struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.join_table_id = iprot.readI32();
      struct.setJoin_table_idIsSet(true);
      {
        org.apache.thrift.protocol.TList _list29 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.build_exprs = new ArrayList<org.apache.impala.thrift.TExpr>(_list29.size);
        org.apache.impala.thrift.TExpr _elem30;
        for (int _i31 = 0; _i31 < _list29.size; ++_i31)
        {
          _elem30 = new org.apache.impala.thrift.TExpr();
          _elem30.read(iprot);
          struct.build_exprs.add(_elem30);
        }
      }
      struct.setBuild_exprsIsSet(true);
    }
  }

}

