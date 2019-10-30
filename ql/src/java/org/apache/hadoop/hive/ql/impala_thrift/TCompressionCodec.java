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
public class TCompressionCodec implements org.apache.thrift.TBase<TCompressionCodec, TCompressionCodec._Fields>, java.io.Serializable, Cloneable, Comparable<TCompressionCodec> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TCompressionCodec");

  private static final org.apache.thrift.protocol.TField CODEC_FIELD_DESC = new org.apache.thrift.protocol.TField("codec", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField COMPRESSION_LEVEL_FIELD_DESC = new org.apache.thrift.protocol.TField("compression_level", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TCompressionCodecStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TCompressionCodecTupleSchemeFactory());
  }

  private THdfsCompression codec; // required
  private int compression_level; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see THdfsCompression
     */
    CODEC((short)1, "codec"),
    COMPRESSION_LEVEL((short)2, "compression_level");

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
        case 1: // CODEC
          return CODEC;
        case 2: // COMPRESSION_LEVEL
          return COMPRESSION_LEVEL;
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
  private static final int __COMPRESSION_LEVEL_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.COMPRESSION_LEVEL};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CODEC, new org.apache.thrift.meta_data.FieldMetaData("codec", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, THdfsCompression.class)));
    tmpMap.put(_Fields.COMPRESSION_LEVEL, new org.apache.thrift.meta_data.FieldMetaData("compression_level", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TCompressionCodec.class, metaDataMap);
  }

  public TCompressionCodec() {
  }

  public TCompressionCodec(
    THdfsCompression codec)
  {
    this();
    this.codec = codec;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TCompressionCodec(TCompressionCodec other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetCodec()) {
      this.codec = other.codec;
    }
    this.compression_level = other.compression_level;
  }

  public TCompressionCodec deepCopy() {
    return new TCompressionCodec(this);
  }

  @Override
  public void clear() {
    this.codec = null;
    setCompression_levelIsSet(false);
    this.compression_level = 0;
  }

  /**
   * 
   * @see THdfsCompression
   */
  public THdfsCompression getCodec() {
    return this.codec;
  }

  /**
   * 
   * @see THdfsCompression
   */
  public void setCodec(THdfsCompression codec) {
    this.codec = codec;
  }

  public void unsetCodec() {
    this.codec = null;
  }

  /** Returns true if field codec is set (has been assigned a value) and false otherwise */
  public boolean isSetCodec() {
    return this.codec != null;
  }

  public void setCodecIsSet(boolean value) {
    if (!value) {
      this.codec = null;
    }
  }

  public int getCompression_level() {
    return this.compression_level;
  }

  public void setCompression_level(int compression_level) {
    this.compression_level = compression_level;
    setCompression_levelIsSet(true);
  }

  public void unsetCompression_level() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __COMPRESSION_LEVEL_ISSET_ID);
  }

  /** Returns true if field compression_level is set (has been assigned a value) and false otherwise */
  public boolean isSetCompression_level() {
    return EncodingUtils.testBit(__isset_bitfield, __COMPRESSION_LEVEL_ISSET_ID);
  }

  public void setCompression_levelIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __COMPRESSION_LEVEL_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CODEC:
      if (value == null) {
        unsetCodec();
      } else {
        setCodec((THdfsCompression)value);
      }
      break;

    case COMPRESSION_LEVEL:
      if (value == null) {
        unsetCompression_level();
      } else {
        setCompression_level((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CODEC:
      return getCodec();

    case COMPRESSION_LEVEL:
      return getCompression_level();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CODEC:
      return isSetCodec();
    case COMPRESSION_LEVEL:
      return isSetCompression_level();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TCompressionCodec)
      return this.equals((TCompressionCodec)that);
    return false;
  }

  public boolean equals(TCompressionCodec that) {
    if (that == null)
      return false;

    boolean this_present_codec = true && this.isSetCodec();
    boolean that_present_codec = true && that.isSetCodec();
    if (this_present_codec || that_present_codec) {
      if (!(this_present_codec && that_present_codec))
        return false;
      if (!this.codec.equals(that.codec))
        return false;
    }

    boolean this_present_compression_level = true && this.isSetCompression_level();
    boolean that_present_compression_level = true && that.isSetCompression_level();
    if (this_present_compression_level || that_present_compression_level) {
      if (!(this_present_compression_level && that_present_compression_level))
        return false;
      if (this.compression_level != that.compression_level)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_codec = true && (isSetCodec());
    list.add(present_codec);
    if (present_codec)
      list.add(codec.getValue());

    boolean present_compression_level = true && (isSetCompression_level());
    list.add(present_compression_level);
    if (present_compression_level)
      list.add(compression_level);

    return list.hashCode();
  }

  @Override
  public int compareTo(TCompressionCodec other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetCodec()).compareTo(other.isSetCodec());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCodec()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.codec, other.codec);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCompression_level()).compareTo(other.isSetCompression_level());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCompression_level()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.compression_level, other.compression_level);
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
    StringBuilder sb = new StringBuilder("TCompressionCodec(");
    boolean first = true;

    sb.append("codec:");
    if (this.codec == null) {
      sb.append("null");
    } else {
      sb.append(this.codec);
    }
    first = false;
    if (isSetCompression_level()) {
      if (!first) sb.append(", ");
      sb.append("compression_level:");
      sb.append(this.compression_level);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetCodec()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'codec' is unset! Struct:" + toString());
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

  private static class TCompressionCodecStandardSchemeFactory implements SchemeFactory {
    public TCompressionCodecStandardScheme getScheme() {
      return new TCompressionCodecStandardScheme();
    }
  }

  private static class TCompressionCodecStandardScheme extends StandardScheme<TCompressionCodec> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TCompressionCodec struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CODEC
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.codec = org.apache.impala.thrift.THdfsCompression.findByValue(iprot.readI32());
              struct.setCodecIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // COMPRESSION_LEVEL
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.compression_level = iprot.readI32();
              struct.setCompression_levelIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TCompressionCodec struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.codec != null) {
        oprot.writeFieldBegin(CODEC_FIELD_DESC);
        oprot.writeI32(struct.codec.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.isSetCompression_level()) {
        oprot.writeFieldBegin(COMPRESSION_LEVEL_FIELD_DESC);
        oprot.writeI32(struct.compression_level);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TCompressionCodecTupleSchemeFactory implements SchemeFactory {
    public TCompressionCodecTupleScheme getScheme() {
      return new TCompressionCodecTupleScheme();
    }
  }

  private static class TCompressionCodecTupleScheme extends TupleScheme<TCompressionCodec> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TCompressionCodec struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.codec.getValue());
      BitSet optionals = new BitSet();
      if (struct.isSetCompression_level()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetCompression_level()) {
        oprot.writeI32(struct.compression_level);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TCompressionCodec struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.codec = org.apache.impala.thrift.THdfsCompression.findByValue(iprot.readI32());
      struct.setCodecIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.compression_level = iprot.readI32();
        struct.setCompression_levelIsSet(true);
      }
    }
  }

}
