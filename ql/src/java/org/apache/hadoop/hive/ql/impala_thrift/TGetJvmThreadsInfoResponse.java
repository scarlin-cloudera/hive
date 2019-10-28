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
public class TGetJvmThreadsInfoResponse implements org.apache.thrift.TBase<TGetJvmThreadsInfoResponse, TGetJvmThreadsInfoResponse._Fields>, java.io.Serializable, Cloneable, Comparable<TGetJvmThreadsInfoResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TGetJvmThreadsInfoResponse");

  private static final org.apache.thrift.protocol.TField TOTAL_THREAD_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("total_thread_count", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField DAEMON_THREAD_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("daemon_thread_count", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField PEAK_THREAD_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("peak_thread_count", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField THREADS_FIELD_DESC = new org.apache.thrift.protocol.TField("threads", org.apache.thrift.protocol.TType.LIST, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TGetJvmThreadsInfoResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TGetJvmThreadsInfoResponseTupleSchemeFactory());
  }

  private int total_thread_count; // required
  private int daemon_thread_count; // required
  private int peak_thread_count; // required
  private List<TJvmThreadInfo> threads; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TOTAL_THREAD_COUNT((short)1, "total_thread_count"),
    DAEMON_THREAD_COUNT((short)2, "daemon_thread_count"),
    PEAK_THREAD_COUNT((short)3, "peak_thread_count"),
    THREADS((short)4, "threads");

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
        case 1: // TOTAL_THREAD_COUNT
          return TOTAL_THREAD_COUNT;
        case 2: // DAEMON_THREAD_COUNT
          return DAEMON_THREAD_COUNT;
        case 3: // PEAK_THREAD_COUNT
          return PEAK_THREAD_COUNT;
        case 4: // THREADS
          return THREADS;
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
  private static final int __TOTAL_THREAD_COUNT_ISSET_ID = 0;
  private static final int __DAEMON_THREAD_COUNT_ISSET_ID = 1;
  private static final int __PEAK_THREAD_COUNT_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.THREADS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TOTAL_THREAD_COUNT, new org.apache.thrift.meta_data.FieldMetaData("total_thread_count", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.DAEMON_THREAD_COUNT, new org.apache.thrift.meta_data.FieldMetaData("daemon_thread_count", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.PEAK_THREAD_COUNT, new org.apache.thrift.meta_data.FieldMetaData("peak_thread_count", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.THREADS, new org.apache.thrift.meta_data.FieldMetaData("threads", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TJvmThreadInfo.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TGetJvmThreadsInfoResponse.class, metaDataMap);
  }

  public TGetJvmThreadsInfoResponse() {
  }

  public TGetJvmThreadsInfoResponse(
    int total_thread_count,
    int daemon_thread_count,
    int peak_thread_count)
  {
    this();
    this.total_thread_count = total_thread_count;
    setTotal_thread_countIsSet(true);
    this.daemon_thread_count = daemon_thread_count;
    setDaemon_thread_countIsSet(true);
    this.peak_thread_count = peak_thread_count;
    setPeak_thread_countIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TGetJvmThreadsInfoResponse(TGetJvmThreadsInfoResponse other) {
    __isset_bitfield = other.__isset_bitfield;
    this.total_thread_count = other.total_thread_count;
    this.daemon_thread_count = other.daemon_thread_count;
    this.peak_thread_count = other.peak_thread_count;
    if (other.isSetThreads()) {
      List<TJvmThreadInfo> __this__threads = new ArrayList<TJvmThreadInfo>(other.threads.size());
      for (TJvmThreadInfo other_element : other.threads) {
        __this__threads.add(new TJvmThreadInfo(other_element));
      }
      this.threads = __this__threads;
    }
  }

  public TGetJvmThreadsInfoResponse deepCopy() {
    return new TGetJvmThreadsInfoResponse(this);
  }

  @Override
  public void clear() {
    setTotal_thread_countIsSet(false);
    this.total_thread_count = 0;
    setDaemon_thread_countIsSet(false);
    this.daemon_thread_count = 0;
    setPeak_thread_countIsSet(false);
    this.peak_thread_count = 0;
    this.threads = null;
  }

  public int getTotal_thread_count() {
    return this.total_thread_count;
  }

  public void setTotal_thread_count(int total_thread_count) {
    this.total_thread_count = total_thread_count;
    setTotal_thread_countIsSet(true);
  }

  public void unsetTotal_thread_count() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TOTAL_THREAD_COUNT_ISSET_ID);
  }

  /** Returns true if field total_thread_count is set (has been assigned a value) and false otherwise */
  public boolean isSetTotal_thread_count() {
    return EncodingUtils.testBit(__isset_bitfield, __TOTAL_THREAD_COUNT_ISSET_ID);
  }

  public void setTotal_thread_countIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TOTAL_THREAD_COUNT_ISSET_ID, value);
  }

  public int getDaemon_thread_count() {
    return this.daemon_thread_count;
  }

  public void setDaemon_thread_count(int daemon_thread_count) {
    this.daemon_thread_count = daemon_thread_count;
    setDaemon_thread_countIsSet(true);
  }

  public void unsetDaemon_thread_count() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DAEMON_THREAD_COUNT_ISSET_ID);
  }

  /** Returns true if field daemon_thread_count is set (has been assigned a value) and false otherwise */
  public boolean isSetDaemon_thread_count() {
    return EncodingUtils.testBit(__isset_bitfield, __DAEMON_THREAD_COUNT_ISSET_ID);
  }

  public void setDaemon_thread_countIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DAEMON_THREAD_COUNT_ISSET_ID, value);
  }

  public int getPeak_thread_count() {
    return this.peak_thread_count;
  }

  public void setPeak_thread_count(int peak_thread_count) {
    this.peak_thread_count = peak_thread_count;
    setPeak_thread_countIsSet(true);
  }

  public void unsetPeak_thread_count() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PEAK_THREAD_COUNT_ISSET_ID);
  }

  /** Returns true if field peak_thread_count is set (has been assigned a value) and false otherwise */
  public boolean isSetPeak_thread_count() {
    return EncodingUtils.testBit(__isset_bitfield, __PEAK_THREAD_COUNT_ISSET_ID);
  }

  public void setPeak_thread_countIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PEAK_THREAD_COUNT_ISSET_ID, value);
  }

  public int getThreadsSize() {
    return (this.threads == null) ? 0 : this.threads.size();
  }

  public java.util.Iterator<TJvmThreadInfo> getThreadsIterator() {
    return (this.threads == null) ? null : this.threads.iterator();
  }

  public void addToThreads(TJvmThreadInfo elem) {
    if (this.threads == null) {
      this.threads = new ArrayList<TJvmThreadInfo>();
    }
    this.threads.add(elem);
  }

  public List<TJvmThreadInfo> getThreads() {
    return this.threads;
  }

  public void setThreads(List<TJvmThreadInfo> threads) {
    this.threads = threads;
  }

  public void unsetThreads() {
    this.threads = null;
  }

  /** Returns true if field threads is set (has been assigned a value) and false otherwise */
  public boolean isSetThreads() {
    return this.threads != null;
  }

  public void setThreadsIsSet(boolean value) {
    if (!value) {
      this.threads = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TOTAL_THREAD_COUNT:
      if (value == null) {
        unsetTotal_thread_count();
      } else {
        setTotal_thread_count((Integer)value);
      }
      break;

    case DAEMON_THREAD_COUNT:
      if (value == null) {
        unsetDaemon_thread_count();
      } else {
        setDaemon_thread_count((Integer)value);
      }
      break;

    case PEAK_THREAD_COUNT:
      if (value == null) {
        unsetPeak_thread_count();
      } else {
        setPeak_thread_count((Integer)value);
      }
      break;

    case THREADS:
      if (value == null) {
        unsetThreads();
      } else {
        setThreads((List<TJvmThreadInfo>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TOTAL_THREAD_COUNT:
      return getTotal_thread_count();

    case DAEMON_THREAD_COUNT:
      return getDaemon_thread_count();

    case PEAK_THREAD_COUNT:
      return getPeak_thread_count();

    case THREADS:
      return getThreads();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TOTAL_THREAD_COUNT:
      return isSetTotal_thread_count();
    case DAEMON_THREAD_COUNT:
      return isSetDaemon_thread_count();
    case PEAK_THREAD_COUNT:
      return isSetPeak_thread_count();
    case THREADS:
      return isSetThreads();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TGetJvmThreadsInfoResponse)
      return this.equals((TGetJvmThreadsInfoResponse)that);
    return false;
  }

  public boolean equals(TGetJvmThreadsInfoResponse that) {
    if (that == null)
      return false;

    boolean this_present_total_thread_count = true;
    boolean that_present_total_thread_count = true;
    if (this_present_total_thread_count || that_present_total_thread_count) {
      if (!(this_present_total_thread_count && that_present_total_thread_count))
        return false;
      if (this.total_thread_count != that.total_thread_count)
        return false;
    }

    boolean this_present_daemon_thread_count = true;
    boolean that_present_daemon_thread_count = true;
    if (this_present_daemon_thread_count || that_present_daemon_thread_count) {
      if (!(this_present_daemon_thread_count && that_present_daemon_thread_count))
        return false;
      if (this.daemon_thread_count != that.daemon_thread_count)
        return false;
    }

    boolean this_present_peak_thread_count = true;
    boolean that_present_peak_thread_count = true;
    if (this_present_peak_thread_count || that_present_peak_thread_count) {
      if (!(this_present_peak_thread_count && that_present_peak_thread_count))
        return false;
      if (this.peak_thread_count != that.peak_thread_count)
        return false;
    }

    boolean this_present_threads = true && this.isSetThreads();
    boolean that_present_threads = true && that.isSetThreads();
    if (this_present_threads || that_present_threads) {
      if (!(this_present_threads && that_present_threads))
        return false;
      if (!this.threads.equals(that.threads))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_total_thread_count = true;
    list.add(present_total_thread_count);
    if (present_total_thread_count)
      list.add(total_thread_count);

    boolean present_daemon_thread_count = true;
    list.add(present_daemon_thread_count);
    if (present_daemon_thread_count)
      list.add(daemon_thread_count);

    boolean present_peak_thread_count = true;
    list.add(present_peak_thread_count);
    if (present_peak_thread_count)
      list.add(peak_thread_count);

    boolean present_threads = true && (isSetThreads());
    list.add(present_threads);
    if (present_threads)
      list.add(threads);

    return list.hashCode();
  }

  @Override
  public int compareTo(TGetJvmThreadsInfoResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTotal_thread_count()).compareTo(other.isSetTotal_thread_count());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTotal_thread_count()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.total_thread_count, other.total_thread_count);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDaemon_thread_count()).compareTo(other.isSetDaemon_thread_count());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDaemon_thread_count()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.daemon_thread_count, other.daemon_thread_count);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPeak_thread_count()).compareTo(other.isSetPeak_thread_count());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPeak_thread_count()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.peak_thread_count, other.peak_thread_count);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetThreads()).compareTo(other.isSetThreads());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetThreads()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.threads, other.threads);
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
    StringBuilder sb = new StringBuilder("TGetJvmThreadsInfoResponse(");
    boolean first = true;

    sb.append("total_thread_count:");
    sb.append(this.total_thread_count);
    first = false;
    if (!first) sb.append(", ");
    sb.append("daemon_thread_count:");
    sb.append(this.daemon_thread_count);
    first = false;
    if (!first) sb.append(", ");
    sb.append("peak_thread_count:");
    sb.append(this.peak_thread_count);
    first = false;
    if (isSetThreads()) {
      if (!first) sb.append(", ");
      sb.append("threads:");
      if (this.threads == null) {
        sb.append("null");
      } else {
        sb.append(this.threads);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetTotal_thread_count()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'total_thread_count' is unset! Struct:" + toString());
    }

    if (!isSetDaemon_thread_count()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'daemon_thread_count' is unset! Struct:" + toString());
    }

    if (!isSetPeak_thread_count()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'peak_thread_count' is unset! Struct:" + toString());
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

  private static class TGetJvmThreadsInfoResponseStandardSchemeFactory implements SchemeFactory {
    public TGetJvmThreadsInfoResponseStandardScheme getScheme() {
      return new TGetJvmThreadsInfoResponseStandardScheme();
    }
  }

  private static class TGetJvmThreadsInfoResponseStandardScheme extends StandardScheme<TGetJvmThreadsInfoResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TGetJvmThreadsInfoResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TOTAL_THREAD_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.total_thread_count = iprot.readI32();
              struct.setTotal_thread_countIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DAEMON_THREAD_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.daemon_thread_count = iprot.readI32();
              struct.setDaemon_thread_countIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PEAK_THREAD_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.peak_thread_count = iprot.readI32();
              struct.setPeak_thread_countIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // THREADS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list234 = iprot.readListBegin();
                struct.threads = new ArrayList<TJvmThreadInfo>(_list234.size);
                TJvmThreadInfo _elem235;
                for (int _i236 = 0; _i236 < _list234.size; ++_i236)
                {
                  _elem235 = new TJvmThreadInfo();
                  _elem235.read(iprot);
                  struct.threads.add(_elem235);
                }
                iprot.readListEnd();
              }
              struct.setThreadsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TGetJvmThreadsInfoResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(TOTAL_THREAD_COUNT_FIELD_DESC);
      oprot.writeI32(struct.total_thread_count);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(DAEMON_THREAD_COUNT_FIELD_DESC);
      oprot.writeI32(struct.daemon_thread_count);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(PEAK_THREAD_COUNT_FIELD_DESC);
      oprot.writeI32(struct.peak_thread_count);
      oprot.writeFieldEnd();
      if (struct.threads != null) {
        if (struct.isSetThreads()) {
          oprot.writeFieldBegin(THREADS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.threads.size()));
            for (TJvmThreadInfo _iter237 : struct.threads)
            {
              _iter237.write(oprot);
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

  private static class TGetJvmThreadsInfoResponseTupleSchemeFactory implements SchemeFactory {
    public TGetJvmThreadsInfoResponseTupleScheme getScheme() {
      return new TGetJvmThreadsInfoResponseTupleScheme();
    }
  }

  private static class TGetJvmThreadsInfoResponseTupleScheme extends TupleScheme<TGetJvmThreadsInfoResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TGetJvmThreadsInfoResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.total_thread_count);
      oprot.writeI32(struct.daemon_thread_count);
      oprot.writeI32(struct.peak_thread_count);
      BitSet optionals = new BitSet();
      if (struct.isSetThreads()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetThreads()) {
        {
          oprot.writeI32(struct.threads.size());
          for (TJvmThreadInfo _iter238 : struct.threads)
          {
            _iter238.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TGetJvmThreadsInfoResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.total_thread_count = iprot.readI32();
      struct.setTotal_thread_countIsSet(true);
      struct.daemon_thread_count = iprot.readI32();
      struct.setDaemon_thread_countIsSet(true);
      struct.peak_thread_count = iprot.readI32();
      struct.setPeak_thread_countIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list239 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.threads = new ArrayList<TJvmThreadInfo>(_list239.size);
          TJvmThreadInfo _elem240;
          for (int _i241 = 0; _i241 < _list239.size; ++_i241)
          {
            _elem240 = new TJvmThreadInfo();
            _elem240.read(iprot);
            struct.threads.add(_elem240);
          }
        }
        struct.setThreadsIsSet(true);
      }
    }
  }

}

