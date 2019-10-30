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
public class TScanRange implements org.apache.thrift.TBase<TScanRange, TScanRange._Fields>, java.io.Serializable, Cloneable, Comparable<TScanRange> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TScanRange");

  private static final org.apache.thrift.protocol.TField HDFS_FILE_SPLIT_FIELD_DESC = new org.apache.thrift.protocol.TField("hdfs_file_split", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField HBASE_KEY_RANGE_FIELD_DESC = new org.apache.thrift.protocol.TField("hbase_key_range", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField KUDU_SCAN_TOKEN_FIELD_DESC = new org.apache.thrift.protocol.TField("kudu_scan_token", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TScanRangeStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TScanRangeTupleSchemeFactory());
  }

  private THdfsFileSplit hdfs_file_split; // optional
  private THBaseKeyRange hbase_key_range; // optional
  private ByteBuffer kudu_scan_token; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    HDFS_FILE_SPLIT((short)1, "hdfs_file_split"),
    HBASE_KEY_RANGE((short)2, "hbase_key_range"),
    KUDU_SCAN_TOKEN((short)3, "kudu_scan_token");

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
        case 1: // HDFS_FILE_SPLIT
          return HDFS_FILE_SPLIT;
        case 2: // HBASE_KEY_RANGE
          return HBASE_KEY_RANGE;
        case 3: // KUDU_SCAN_TOKEN
          return KUDU_SCAN_TOKEN;
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
  private static final _Fields optionals[] = {_Fields.HDFS_FILE_SPLIT,_Fields.HBASE_KEY_RANGE,_Fields.KUDU_SCAN_TOKEN};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.HDFS_FILE_SPLIT, new org.apache.thrift.meta_data.FieldMetaData("hdfs_file_split", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, THdfsFileSplit.class)));
    tmpMap.put(_Fields.HBASE_KEY_RANGE, new org.apache.thrift.meta_data.FieldMetaData("hbase_key_range", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, THBaseKeyRange.class)));
    tmpMap.put(_Fields.KUDU_SCAN_TOKEN, new org.apache.thrift.meta_data.FieldMetaData("kudu_scan_token", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TScanRange.class, metaDataMap);
  }

  public TScanRange() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TScanRange(TScanRange other) {
    if (other.isSetHdfs_file_split()) {
      this.hdfs_file_split = new THdfsFileSplit(other.hdfs_file_split);
    }
    if (other.isSetHbase_key_range()) {
      this.hbase_key_range = new THBaseKeyRange(other.hbase_key_range);
    }
    if (other.isSetKudu_scan_token()) {
      this.kudu_scan_token = org.apache.thrift.TBaseHelper.copyBinary(other.kudu_scan_token);
    }
  }

  public TScanRange deepCopy() {
    return new TScanRange(this);
  }

  @Override
  public void clear() {
    this.hdfs_file_split = null;
    this.hbase_key_range = null;
    this.kudu_scan_token = null;
  }

  public THdfsFileSplit getHdfs_file_split() {
    return this.hdfs_file_split;
  }

  public void setHdfs_file_split(THdfsFileSplit hdfs_file_split) {
    this.hdfs_file_split = hdfs_file_split;
  }

  public void unsetHdfs_file_split() {
    this.hdfs_file_split = null;
  }

  /** Returns true if field hdfs_file_split is set (has been assigned a value) and false otherwise */
  public boolean isSetHdfs_file_split() {
    return this.hdfs_file_split != null;
  }

  public void setHdfs_file_splitIsSet(boolean value) {
    if (!value) {
      this.hdfs_file_split = null;
    }
  }

  public THBaseKeyRange getHbase_key_range() {
    return this.hbase_key_range;
  }

  public void setHbase_key_range(THBaseKeyRange hbase_key_range) {
    this.hbase_key_range = hbase_key_range;
  }

  public void unsetHbase_key_range() {
    this.hbase_key_range = null;
  }

  /** Returns true if field hbase_key_range is set (has been assigned a value) and false otherwise */
  public boolean isSetHbase_key_range() {
    return this.hbase_key_range != null;
  }

  public void setHbase_key_rangeIsSet(boolean value) {
    if (!value) {
      this.hbase_key_range = null;
    }
  }

  public byte[] getKudu_scan_token() {
    setKudu_scan_token(org.apache.thrift.TBaseHelper.rightSize(kudu_scan_token));
    return kudu_scan_token == null ? null : kudu_scan_token.array();
  }

  public ByteBuffer bufferForKudu_scan_token() {
    return org.apache.thrift.TBaseHelper.copyBinary(kudu_scan_token);
  }

  public void setKudu_scan_token(byte[] kudu_scan_token) {
    this.kudu_scan_token = kudu_scan_token == null ? (ByteBuffer)null : ByteBuffer.wrap(Arrays.copyOf(kudu_scan_token, kudu_scan_token.length));
  }

  public void setKudu_scan_token(ByteBuffer kudu_scan_token) {
    this.kudu_scan_token = org.apache.thrift.TBaseHelper.copyBinary(kudu_scan_token);
  }

  public void unsetKudu_scan_token() {
    this.kudu_scan_token = null;
  }

  /** Returns true if field kudu_scan_token is set (has been assigned a value) and false otherwise */
  public boolean isSetKudu_scan_token() {
    return this.kudu_scan_token != null;
  }

  public void setKudu_scan_tokenIsSet(boolean value) {
    if (!value) {
      this.kudu_scan_token = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case HDFS_FILE_SPLIT:
      if (value == null) {
        unsetHdfs_file_split();
      } else {
        setHdfs_file_split((THdfsFileSplit)value);
      }
      break;

    case HBASE_KEY_RANGE:
      if (value == null) {
        unsetHbase_key_range();
      } else {
        setHbase_key_range((THBaseKeyRange)value);
      }
      break;

    case KUDU_SCAN_TOKEN:
      if (value == null) {
        unsetKudu_scan_token();
      } else {
        setKudu_scan_token((ByteBuffer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case HDFS_FILE_SPLIT:
      return getHdfs_file_split();

    case HBASE_KEY_RANGE:
      return getHbase_key_range();

    case KUDU_SCAN_TOKEN:
      return getKudu_scan_token();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case HDFS_FILE_SPLIT:
      return isSetHdfs_file_split();
    case HBASE_KEY_RANGE:
      return isSetHbase_key_range();
    case KUDU_SCAN_TOKEN:
      return isSetKudu_scan_token();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TScanRange)
      return this.equals((TScanRange)that);
    return false;
  }

  public boolean equals(TScanRange that) {
    if (that == null)
      return false;

    boolean this_present_hdfs_file_split = true && this.isSetHdfs_file_split();
    boolean that_present_hdfs_file_split = true && that.isSetHdfs_file_split();
    if (this_present_hdfs_file_split || that_present_hdfs_file_split) {
      if (!(this_present_hdfs_file_split && that_present_hdfs_file_split))
        return false;
      if (!this.hdfs_file_split.equals(that.hdfs_file_split))
        return false;
    }

    boolean this_present_hbase_key_range = true && this.isSetHbase_key_range();
    boolean that_present_hbase_key_range = true && that.isSetHbase_key_range();
    if (this_present_hbase_key_range || that_present_hbase_key_range) {
      if (!(this_present_hbase_key_range && that_present_hbase_key_range))
        return false;
      if (!this.hbase_key_range.equals(that.hbase_key_range))
        return false;
    }

    boolean this_present_kudu_scan_token = true && this.isSetKudu_scan_token();
    boolean that_present_kudu_scan_token = true && that.isSetKudu_scan_token();
    if (this_present_kudu_scan_token || that_present_kudu_scan_token) {
      if (!(this_present_kudu_scan_token && that_present_kudu_scan_token))
        return false;
      if (!this.kudu_scan_token.equals(that.kudu_scan_token))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_hdfs_file_split = true && (isSetHdfs_file_split());
    list.add(present_hdfs_file_split);
    if (present_hdfs_file_split)
      list.add(hdfs_file_split);

    boolean present_hbase_key_range = true && (isSetHbase_key_range());
    list.add(present_hbase_key_range);
    if (present_hbase_key_range)
      list.add(hbase_key_range);

    boolean present_kudu_scan_token = true && (isSetKudu_scan_token());
    list.add(present_kudu_scan_token);
    if (present_kudu_scan_token)
      list.add(kudu_scan_token);

    return list.hashCode();
  }

  @Override
  public int compareTo(TScanRange other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetHdfs_file_split()).compareTo(other.isSetHdfs_file_split());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHdfs_file_split()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hdfs_file_split, other.hdfs_file_split);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHbase_key_range()).compareTo(other.isSetHbase_key_range());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHbase_key_range()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hbase_key_range, other.hbase_key_range);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetKudu_scan_token()).compareTo(other.isSetKudu_scan_token());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetKudu_scan_token()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.kudu_scan_token, other.kudu_scan_token);
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
    StringBuilder sb = new StringBuilder("TScanRange(");
    boolean first = true;

    if (isSetHdfs_file_split()) {
      sb.append("hdfs_file_split:");
      if (this.hdfs_file_split == null) {
        sb.append("null");
      } else {
        sb.append(this.hdfs_file_split);
      }
      first = false;
    }
    if (isSetHbase_key_range()) {
      if (!first) sb.append(", ");
      sb.append("hbase_key_range:");
      if (this.hbase_key_range == null) {
        sb.append("null");
      } else {
        sb.append(this.hbase_key_range);
      }
      first = false;
    }
    if (isSetKudu_scan_token()) {
      if (!first) sb.append(", ");
      sb.append("kudu_scan_token:");
      if (this.kudu_scan_token == null) {
        sb.append("null");
      } else {
        org.apache.thrift.TBaseHelper.toString(this.kudu_scan_token, sb);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (hdfs_file_split != null) {
      hdfs_file_split.validate();
    }
    if (hbase_key_range != null) {
      hbase_key_range.validate();
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

  private static class TScanRangeStandardSchemeFactory implements SchemeFactory {
    public TScanRangeStandardScheme getScheme() {
      return new TScanRangeStandardScheme();
    }
  }

  private static class TScanRangeStandardScheme extends StandardScheme<TScanRange> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TScanRange struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // HDFS_FILE_SPLIT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.hdfs_file_split = new THdfsFileSplit();
              struct.hdfs_file_split.read(iprot);
              struct.setHdfs_file_splitIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // HBASE_KEY_RANGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.hbase_key_range = new THBaseKeyRange();
              struct.hbase_key_range.read(iprot);
              struct.setHbase_key_rangeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // KUDU_SCAN_TOKEN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.kudu_scan_token = iprot.readBinary();
              struct.setKudu_scan_tokenIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TScanRange struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.hdfs_file_split != null) {
        if (struct.isSetHdfs_file_split()) {
          oprot.writeFieldBegin(HDFS_FILE_SPLIT_FIELD_DESC);
          struct.hdfs_file_split.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.hbase_key_range != null) {
        if (struct.isSetHbase_key_range()) {
          oprot.writeFieldBegin(HBASE_KEY_RANGE_FIELD_DESC);
          struct.hbase_key_range.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.kudu_scan_token != null) {
        if (struct.isSetKudu_scan_token()) {
          oprot.writeFieldBegin(KUDU_SCAN_TOKEN_FIELD_DESC);
          oprot.writeBinary(struct.kudu_scan_token);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TScanRangeTupleSchemeFactory implements SchemeFactory {
    public TScanRangeTupleScheme getScheme() {
      return new TScanRangeTupleScheme();
    }
  }

  private static class TScanRangeTupleScheme extends TupleScheme<TScanRange> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TScanRange struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetHdfs_file_split()) {
        optionals.set(0);
      }
      if (struct.isSetHbase_key_range()) {
        optionals.set(1);
      }
      if (struct.isSetKudu_scan_token()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetHdfs_file_split()) {
        struct.hdfs_file_split.write(oprot);
      }
      if (struct.isSetHbase_key_range()) {
        struct.hbase_key_range.write(oprot);
      }
      if (struct.isSetKudu_scan_token()) {
        oprot.writeBinary(struct.kudu_scan_token);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TScanRange struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.hdfs_file_split = new THdfsFileSplit();
        struct.hdfs_file_split.read(iprot);
        struct.setHdfs_file_splitIsSet(true);
      }
      if (incoming.get(1)) {
        struct.hbase_key_range = new THBaseKeyRange();
        struct.hbase_key_range.read(iprot);
        struct.setHbase_key_rangeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.kudu_scan_token = iprot.readBinary();
        struct.setKudu_scan_tokenIsSet(true);
      }
    }
  }

}
