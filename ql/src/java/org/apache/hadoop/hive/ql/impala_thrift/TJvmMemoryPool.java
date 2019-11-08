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
public class TJvmMemoryPool implements org.apache.thrift.TBase<TJvmMemoryPool, TJvmMemoryPool._Fields>, java.io.Serializable, Cloneable, Comparable<TJvmMemoryPool> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TJvmMemoryPool");

  private static final org.apache.thrift.protocol.TField COMMITTED_FIELD_DESC = new org.apache.thrift.protocol.TField("committed", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField INIT_FIELD_DESC = new org.apache.thrift.protocol.TField("init", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField MAX_FIELD_DESC = new org.apache.thrift.protocol.TField("max", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField USED_FIELD_DESC = new org.apache.thrift.protocol.TField("used", org.apache.thrift.protocol.TType.I64, (short)4);
  private static final org.apache.thrift.protocol.TField PEAK_COMMITTED_FIELD_DESC = new org.apache.thrift.protocol.TField("peak_committed", org.apache.thrift.protocol.TType.I64, (short)5);
  private static final org.apache.thrift.protocol.TField PEAK_INIT_FIELD_DESC = new org.apache.thrift.protocol.TField("peak_init", org.apache.thrift.protocol.TType.I64, (short)6);
  private static final org.apache.thrift.protocol.TField PEAK_MAX_FIELD_DESC = new org.apache.thrift.protocol.TField("peak_max", org.apache.thrift.protocol.TType.I64, (short)7);
  private static final org.apache.thrift.protocol.TField PEAK_USED_FIELD_DESC = new org.apache.thrift.protocol.TField("peak_used", org.apache.thrift.protocol.TType.I64, (short)8);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)9);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TJvmMemoryPoolStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TJvmMemoryPoolTupleSchemeFactory());
  }

  public long committed; // required
  public long init; // required
  public long max; // required
  public long used; // required
  public long peak_committed; // required
  public long peak_init; // required
  public long peak_max; // required
  public long peak_used; // required
  public String name; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    COMMITTED((short)1, "committed"),
    INIT((short)2, "init"),
    MAX((short)3, "max"),
    USED((short)4, "used"),
    PEAK_COMMITTED((short)5, "peak_committed"),
    PEAK_INIT((short)6, "peak_init"),
    PEAK_MAX((short)7, "peak_max"),
    PEAK_USED((short)8, "peak_used"),
    NAME((short)9, "name");

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
        case 1: // COMMITTED
          return COMMITTED;
        case 2: // INIT
          return INIT;
        case 3: // MAX
          return MAX;
        case 4: // USED
          return USED;
        case 5: // PEAK_COMMITTED
          return PEAK_COMMITTED;
        case 6: // PEAK_INIT
          return PEAK_INIT;
        case 7: // PEAK_MAX
          return PEAK_MAX;
        case 8: // PEAK_USED
          return PEAK_USED;
        case 9: // NAME
          return NAME;
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
  private static final int __COMMITTED_ISSET_ID = 0;
  private static final int __INIT_ISSET_ID = 1;
  private static final int __MAX_ISSET_ID = 2;
  private static final int __USED_ISSET_ID = 3;
  private static final int __PEAK_COMMITTED_ISSET_ID = 4;
  private static final int __PEAK_INIT_ISSET_ID = 5;
  private static final int __PEAK_MAX_ISSET_ID = 6;
  private static final int __PEAK_USED_ISSET_ID = 7;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.COMMITTED, new org.apache.thrift.meta_data.FieldMetaData("committed", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.INIT, new org.apache.thrift.meta_data.FieldMetaData("init", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.MAX, new org.apache.thrift.meta_data.FieldMetaData("max", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.USED, new org.apache.thrift.meta_data.FieldMetaData("used", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.PEAK_COMMITTED, new org.apache.thrift.meta_data.FieldMetaData("peak_committed", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.PEAK_INIT, new org.apache.thrift.meta_data.FieldMetaData("peak_init", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.PEAK_MAX, new org.apache.thrift.meta_data.FieldMetaData("peak_max", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.PEAK_USED, new org.apache.thrift.meta_data.FieldMetaData("peak_used", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TJvmMemoryPool.class, metaDataMap);
  }

  public TJvmMemoryPool() {
  }

  public TJvmMemoryPool(
    long committed,
    long init,
    long max,
    long used,
    long peak_committed,
    long peak_init,
    long peak_max,
    long peak_used,
    String name)
  {
    this();
    this.committed = committed;
    setCommittedIsSet(true);
    this.init = init;
    setInitIsSet(true);
    this.max = max;
    setMaxIsSet(true);
    this.used = used;
    setUsedIsSet(true);
    this.peak_committed = peak_committed;
    setPeak_committedIsSet(true);
    this.peak_init = peak_init;
    setPeak_initIsSet(true);
    this.peak_max = peak_max;
    setPeak_maxIsSet(true);
    this.peak_used = peak_used;
    setPeak_usedIsSet(true);
    this.name = name;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TJvmMemoryPool(TJvmMemoryPool other) {
    __isset_bitfield = other.__isset_bitfield;
    this.committed = other.committed;
    this.init = other.init;
    this.max = other.max;
    this.used = other.used;
    this.peak_committed = other.peak_committed;
    this.peak_init = other.peak_init;
    this.peak_max = other.peak_max;
    this.peak_used = other.peak_used;
    if (other.isSetName()) {
      this.name = other.name;
    }
  }

  public TJvmMemoryPool deepCopy() {
    return new TJvmMemoryPool(this);
  }

  @Override
  public void clear() {
    setCommittedIsSet(false);
    this.committed = 0;
    setInitIsSet(false);
    this.init = 0;
    setMaxIsSet(false);
    this.max = 0;
    setUsedIsSet(false);
    this.used = 0;
    setPeak_committedIsSet(false);
    this.peak_committed = 0;
    setPeak_initIsSet(false);
    this.peak_init = 0;
    setPeak_maxIsSet(false);
    this.peak_max = 0;
    setPeak_usedIsSet(false);
    this.peak_used = 0;
    this.name = null;
  }

  public long getCommitted() {
    return this.committed;
  }

  public TJvmMemoryPool setCommitted(long committed) {
    this.committed = committed;
    setCommittedIsSet(true);
    return this;
  }

  public void unsetCommitted() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __COMMITTED_ISSET_ID);
  }

  /** Returns true if field committed is set (has been assigned a value) and false otherwise */
  public boolean isSetCommitted() {
    return EncodingUtils.testBit(__isset_bitfield, __COMMITTED_ISSET_ID);
  }

  public void setCommittedIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __COMMITTED_ISSET_ID, value);
  }

  public long getInit() {
    return this.init;
  }

  public TJvmMemoryPool setInit(long init) {
    this.init = init;
    setInitIsSet(true);
    return this;
  }

  public void unsetInit() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __INIT_ISSET_ID);
  }

  /** Returns true if field init is set (has been assigned a value) and false otherwise */
  public boolean isSetInit() {
    return EncodingUtils.testBit(__isset_bitfield, __INIT_ISSET_ID);
  }

  public void setInitIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __INIT_ISSET_ID, value);
  }

  public long getMax() {
    return this.max;
  }

  public TJvmMemoryPool setMax(long max) {
    this.max = max;
    setMaxIsSet(true);
    return this;
  }

  public void unsetMax() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MAX_ISSET_ID);
  }

  /** Returns true if field max is set (has been assigned a value) and false otherwise */
  public boolean isSetMax() {
    return EncodingUtils.testBit(__isset_bitfield, __MAX_ISSET_ID);
  }

  public void setMaxIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MAX_ISSET_ID, value);
  }

  public long getUsed() {
    return this.used;
  }

  public TJvmMemoryPool setUsed(long used) {
    this.used = used;
    setUsedIsSet(true);
    return this;
  }

  public void unsetUsed() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __USED_ISSET_ID);
  }

  /** Returns true if field used is set (has been assigned a value) and false otherwise */
  public boolean isSetUsed() {
    return EncodingUtils.testBit(__isset_bitfield, __USED_ISSET_ID);
  }

  public void setUsedIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __USED_ISSET_ID, value);
  }

  public long getPeak_committed() {
    return this.peak_committed;
  }

  public TJvmMemoryPool setPeak_committed(long peak_committed) {
    this.peak_committed = peak_committed;
    setPeak_committedIsSet(true);
    return this;
  }

  public void unsetPeak_committed() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PEAK_COMMITTED_ISSET_ID);
  }

  /** Returns true if field peak_committed is set (has been assigned a value) and false otherwise */
  public boolean isSetPeak_committed() {
    return EncodingUtils.testBit(__isset_bitfield, __PEAK_COMMITTED_ISSET_ID);
  }

  public void setPeak_committedIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PEAK_COMMITTED_ISSET_ID, value);
  }

  public long getPeak_init() {
    return this.peak_init;
  }

  public TJvmMemoryPool setPeak_init(long peak_init) {
    this.peak_init = peak_init;
    setPeak_initIsSet(true);
    return this;
  }

  public void unsetPeak_init() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PEAK_INIT_ISSET_ID);
  }

  /** Returns true if field peak_init is set (has been assigned a value) and false otherwise */
  public boolean isSetPeak_init() {
    return EncodingUtils.testBit(__isset_bitfield, __PEAK_INIT_ISSET_ID);
  }

  public void setPeak_initIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PEAK_INIT_ISSET_ID, value);
  }

  public long getPeak_max() {
    return this.peak_max;
  }

  public TJvmMemoryPool setPeak_max(long peak_max) {
    this.peak_max = peak_max;
    setPeak_maxIsSet(true);
    return this;
  }

  public void unsetPeak_max() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PEAK_MAX_ISSET_ID);
  }

  /** Returns true if field peak_max is set (has been assigned a value) and false otherwise */
  public boolean isSetPeak_max() {
    return EncodingUtils.testBit(__isset_bitfield, __PEAK_MAX_ISSET_ID);
  }

  public void setPeak_maxIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PEAK_MAX_ISSET_ID, value);
  }

  public long getPeak_used() {
    return this.peak_used;
  }

  public TJvmMemoryPool setPeak_used(long peak_used) {
    this.peak_used = peak_used;
    setPeak_usedIsSet(true);
    return this;
  }

  public void unsetPeak_used() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PEAK_USED_ISSET_ID);
  }

  /** Returns true if field peak_used is set (has been assigned a value) and false otherwise */
  public boolean isSetPeak_used() {
    return EncodingUtils.testBit(__isset_bitfield, __PEAK_USED_ISSET_ID);
  }

  public void setPeak_usedIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PEAK_USED_ISSET_ID, value);
  }

  public String getName() {
    return this.name;
  }

  public TJvmMemoryPool setName(String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case COMMITTED:
      if (value == null) {
        unsetCommitted();
      } else {
        setCommitted((Long)value);
      }
      break;

    case INIT:
      if (value == null) {
        unsetInit();
      } else {
        setInit((Long)value);
      }
      break;

    case MAX:
      if (value == null) {
        unsetMax();
      } else {
        setMax((Long)value);
      }
      break;

    case USED:
      if (value == null) {
        unsetUsed();
      } else {
        setUsed((Long)value);
      }
      break;

    case PEAK_COMMITTED:
      if (value == null) {
        unsetPeak_committed();
      } else {
        setPeak_committed((Long)value);
      }
      break;

    case PEAK_INIT:
      if (value == null) {
        unsetPeak_init();
      } else {
        setPeak_init((Long)value);
      }
      break;

    case PEAK_MAX:
      if (value == null) {
        unsetPeak_max();
      } else {
        setPeak_max((Long)value);
      }
      break;

    case PEAK_USED:
      if (value == null) {
        unsetPeak_used();
      } else {
        setPeak_used((Long)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case COMMITTED:
      return getCommitted();

    case INIT:
      return getInit();

    case MAX:
      return getMax();

    case USED:
      return getUsed();

    case PEAK_COMMITTED:
      return getPeak_committed();

    case PEAK_INIT:
      return getPeak_init();

    case PEAK_MAX:
      return getPeak_max();

    case PEAK_USED:
      return getPeak_used();

    case NAME:
      return getName();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case COMMITTED:
      return isSetCommitted();
    case INIT:
      return isSetInit();
    case MAX:
      return isSetMax();
    case USED:
      return isSetUsed();
    case PEAK_COMMITTED:
      return isSetPeak_committed();
    case PEAK_INIT:
      return isSetPeak_init();
    case PEAK_MAX:
      return isSetPeak_max();
    case PEAK_USED:
      return isSetPeak_used();
    case NAME:
      return isSetName();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TJvmMemoryPool)
      return this.equals((TJvmMemoryPool)that);
    return false;
  }

  public boolean equals(TJvmMemoryPool that) {
    if (that == null)
      return false;

    boolean this_present_committed = true;
    boolean that_present_committed = true;
    if (this_present_committed || that_present_committed) {
      if (!(this_present_committed && that_present_committed))
        return false;
      if (this.committed != that.committed)
        return false;
    }

    boolean this_present_init = true;
    boolean that_present_init = true;
    if (this_present_init || that_present_init) {
      if (!(this_present_init && that_present_init))
        return false;
      if (this.init != that.init)
        return false;
    }

    boolean this_present_max = true;
    boolean that_present_max = true;
    if (this_present_max || that_present_max) {
      if (!(this_present_max && that_present_max))
        return false;
      if (this.max != that.max)
        return false;
    }

    boolean this_present_used = true;
    boolean that_present_used = true;
    if (this_present_used || that_present_used) {
      if (!(this_present_used && that_present_used))
        return false;
      if (this.used != that.used)
        return false;
    }

    boolean this_present_peak_committed = true;
    boolean that_present_peak_committed = true;
    if (this_present_peak_committed || that_present_peak_committed) {
      if (!(this_present_peak_committed && that_present_peak_committed))
        return false;
      if (this.peak_committed != that.peak_committed)
        return false;
    }

    boolean this_present_peak_init = true;
    boolean that_present_peak_init = true;
    if (this_present_peak_init || that_present_peak_init) {
      if (!(this_present_peak_init && that_present_peak_init))
        return false;
      if (this.peak_init != that.peak_init)
        return false;
    }

    boolean this_present_peak_max = true;
    boolean that_present_peak_max = true;
    if (this_present_peak_max || that_present_peak_max) {
      if (!(this_present_peak_max && that_present_peak_max))
        return false;
      if (this.peak_max != that.peak_max)
        return false;
    }

    boolean this_present_peak_used = true;
    boolean that_present_peak_used = true;
    if (this_present_peak_used || that_present_peak_used) {
      if (!(this_present_peak_used && that_present_peak_used))
        return false;
      if (this.peak_used != that.peak_used)
        return false;
    }

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_committed = true;
    list.add(present_committed);
    if (present_committed)
      list.add(committed);

    boolean present_init = true;
    list.add(present_init);
    if (present_init)
      list.add(init);

    boolean present_max = true;
    list.add(present_max);
    if (present_max)
      list.add(max);

    boolean present_used = true;
    list.add(present_used);
    if (present_used)
      list.add(used);

    boolean present_peak_committed = true;
    list.add(present_peak_committed);
    if (present_peak_committed)
      list.add(peak_committed);

    boolean present_peak_init = true;
    list.add(present_peak_init);
    if (present_peak_init)
      list.add(peak_init);

    boolean present_peak_max = true;
    list.add(present_peak_max);
    if (present_peak_max)
      list.add(peak_max);

    boolean present_peak_used = true;
    list.add(present_peak_used);
    if (present_peak_used)
      list.add(peak_used);

    boolean present_name = true && (isSetName());
    list.add(present_name);
    if (present_name)
      list.add(name);

    return list.hashCode();
  }

  @Override
  public int compareTo(TJvmMemoryPool other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetCommitted()).compareTo(other.isSetCommitted());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCommitted()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.committed, other.committed);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetInit()).compareTo(other.isSetInit());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInit()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.init, other.init);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMax()).compareTo(other.isSetMax());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMax()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.max, other.max);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUsed()).compareTo(other.isSetUsed());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsed()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.used, other.used);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPeak_committed()).compareTo(other.isSetPeak_committed());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPeak_committed()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.peak_committed, other.peak_committed);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPeak_init()).compareTo(other.isSetPeak_init());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPeak_init()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.peak_init, other.peak_init);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPeak_max()).compareTo(other.isSetPeak_max());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPeak_max()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.peak_max, other.peak_max);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPeak_used()).compareTo(other.isSetPeak_used());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPeak_used()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.peak_used, other.peak_used);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
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
    StringBuilder sb = new StringBuilder("TJvmMemoryPool(");
    boolean first = true;

    sb.append("committed:");
    sb.append(this.committed);
    first = false;
    if (!first) sb.append(", ");
    sb.append("init:");
    sb.append(this.init);
    first = false;
    if (!first) sb.append(", ");
    sb.append("max:");
    sb.append(this.max);
    first = false;
    if (!first) sb.append(", ");
    sb.append("used:");
    sb.append(this.used);
    first = false;
    if (!first) sb.append(", ");
    sb.append("peak_committed:");
    sb.append(this.peak_committed);
    first = false;
    if (!first) sb.append(", ");
    sb.append("peak_init:");
    sb.append(this.peak_init);
    first = false;
    if (!first) sb.append(", ");
    sb.append("peak_max:");
    sb.append(this.peak_max);
    first = false;
    if (!first) sb.append(", ");
    sb.append("peak_used:");
    sb.append(this.peak_used);
    first = false;
    if (!first) sb.append(", ");
    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'committed' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'init' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'max' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'used' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'peak_committed' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'peak_init' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'peak_max' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'peak_used' because it's a primitive and you chose the non-beans generator.
    if (name == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'name' was not present! Struct: " + toString());
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

  private static class TJvmMemoryPoolStandardSchemeFactory implements SchemeFactory {
    public TJvmMemoryPoolStandardScheme getScheme() {
      return new TJvmMemoryPoolStandardScheme();
    }
  }

  private static class TJvmMemoryPoolStandardScheme extends StandardScheme<TJvmMemoryPool> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TJvmMemoryPool struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // COMMITTED
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.committed = iprot.readI64();
              struct.setCommittedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // INIT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.init = iprot.readI64();
              struct.setInitIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // MAX
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.max = iprot.readI64();
              struct.setMaxIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // USED
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.used = iprot.readI64();
              struct.setUsedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // PEAK_COMMITTED
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.peak_committed = iprot.readI64();
              struct.setPeak_committedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // PEAK_INIT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.peak_init = iprot.readI64();
              struct.setPeak_initIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // PEAK_MAX
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.peak_max = iprot.readI64();
              struct.setPeak_maxIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // PEAK_USED
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.peak_used = iprot.readI64();
              struct.setPeak_usedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 9: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
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
      if (!struct.isSetCommitted()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'committed' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetInit()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'init' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetMax()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'max' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetUsed()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'used' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetPeak_committed()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'peak_committed' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetPeak_init()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'peak_init' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetPeak_max()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'peak_max' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetPeak_used()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'peak_used' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TJvmMemoryPool struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(COMMITTED_FIELD_DESC);
      oprot.writeI64(struct.committed);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(INIT_FIELD_DESC);
      oprot.writeI64(struct.init);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(MAX_FIELD_DESC);
      oprot.writeI64(struct.max);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(USED_FIELD_DESC);
      oprot.writeI64(struct.used);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(PEAK_COMMITTED_FIELD_DESC);
      oprot.writeI64(struct.peak_committed);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(PEAK_INIT_FIELD_DESC);
      oprot.writeI64(struct.peak_init);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(PEAK_MAX_FIELD_DESC);
      oprot.writeI64(struct.peak_max);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(PEAK_USED_FIELD_DESC);
      oprot.writeI64(struct.peak_used);
      oprot.writeFieldEnd();
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TJvmMemoryPoolTupleSchemeFactory implements SchemeFactory {
    public TJvmMemoryPoolTupleScheme getScheme() {
      return new TJvmMemoryPoolTupleScheme();
    }
  }

  private static class TJvmMemoryPoolTupleScheme extends TupleScheme<TJvmMemoryPool> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TJvmMemoryPool struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI64(struct.committed);
      oprot.writeI64(struct.init);
      oprot.writeI64(struct.max);
      oprot.writeI64(struct.used);
      oprot.writeI64(struct.peak_committed);
      oprot.writeI64(struct.peak_init);
      oprot.writeI64(struct.peak_max);
      oprot.writeI64(struct.peak_used);
      oprot.writeString(struct.name);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TJvmMemoryPool struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.committed = iprot.readI64();
      struct.setCommittedIsSet(true);
      struct.init = iprot.readI64();
      struct.setInitIsSet(true);
      struct.max = iprot.readI64();
      struct.setMaxIsSet(true);
      struct.used = iprot.readI64();
      struct.setUsedIsSet(true);
      struct.peak_committed = iprot.readI64();
      struct.setPeak_committedIsSet(true);
      struct.peak_init = iprot.readI64();
      struct.setPeak_initIsSet(true);
      struct.peak_max = iprot.readI64();
      struct.setPeak_maxIsSet(true);
      struct.peak_used = iprot.readI64();
      struct.setPeak_usedIsSet(true);
      struct.name = iprot.readString();
      struct.setNameIsSet(true);
    }
  }

}

