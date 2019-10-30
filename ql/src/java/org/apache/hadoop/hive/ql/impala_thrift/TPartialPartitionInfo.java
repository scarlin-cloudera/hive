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
public class TPartialPartitionInfo implements org.apache.thrift.TBase<TPartialPartitionInfo, TPartialPartitionInfo._Fields>, java.io.Serializable, Cloneable, Comparable<TPartialPartitionInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TPartialPartitionInfo");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField HMS_PARTITION_FIELD_DESC = new org.apache.thrift.protocol.TField("hms_partition", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField FILE_DESCRIPTORS_FIELD_DESC = new org.apache.thrift.protocol.TField("file_descriptors", org.apache.thrift.protocol.TType.LIST, (short)4);
  private static final org.apache.thrift.protocol.TField PARTITION_STATS_FIELD_DESC = new org.apache.thrift.protocol.TField("partition_stats", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField HAS_INCREMENTAL_STATS_FIELD_DESC = new org.apache.thrift.protocol.TField("has_incremental_stats", org.apache.thrift.protocol.TType.BOOL, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TPartialPartitionInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TPartialPartitionInfoTupleSchemeFactory());
  }

  private long id; // required
  private String name; // optional
  private org.apache.hadoop.hive.metastore.api.Partition hms_partition; // optional
  private List<org.apache.impala.thrift.THdfsFileDesc> file_descriptors; // optional
  private ByteBuffer partition_stats; // optional
  private boolean has_incremental_stats; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    NAME((short)2, "name"),
    HMS_PARTITION((short)3, "hms_partition"),
    FILE_DESCRIPTORS((short)4, "file_descriptors"),
    PARTITION_STATS((short)5, "partition_stats"),
    HAS_INCREMENTAL_STATS((short)6, "has_incremental_stats");

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
        case 2: // NAME
          return NAME;
        case 3: // HMS_PARTITION
          return HMS_PARTITION;
        case 4: // FILE_DESCRIPTORS
          return FILE_DESCRIPTORS;
        case 5: // PARTITION_STATS
          return PARTITION_STATS;
        case 6: // HAS_INCREMENTAL_STATS
          return HAS_INCREMENTAL_STATS;
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
  private static final int __HAS_INCREMENTAL_STATS_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.NAME,_Fields.HMS_PARTITION,_Fields.FILE_DESCRIPTORS,_Fields.PARTITION_STATS,_Fields.HAS_INCREMENTAL_STATS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.HMS_PARTITION, new org.apache.thrift.meta_data.FieldMetaData("hms_partition", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.hadoop.hive.metastore.api.Partition.class)));
    tmpMap.put(_Fields.FILE_DESCRIPTORS, new org.apache.thrift.meta_data.FieldMetaData("file_descriptors", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.impala.thrift.THdfsFileDesc.class))));
    tmpMap.put(_Fields.PARTITION_STATS, new org.apache.thrift.meta_data.FieldMetaData("partition_stats", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.HAS_INCREMENTAL_STATS, new org.apache.thrift.meta_data.FieldMetaData("has_incremental_stats", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TPartialPartitionInfo.class, metaDataMap);
  }

  public TPartialPartitionInfo() {
  }

  public TPartialPartitionInfo(
    long id)
  {
    this();
    this.id = id;
    setIdIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TPartialPartitionInfo(TPartialPartitionInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    this.id = other.id;
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetHms_partition()) {
      this.hms_partition = new org.apache.hadoop.hive.metastore.api.Partition(other.hms_partition);
    }
    if (other.isSetFile_descriptors()) {
      List<org.apache.impala.thrift.THdfsFileDesc> __this__file_descriptors = new ArrayList<org.apache.impala.thrift.THdfsFileDesc>(other.file_descriptors.size());
      for (org.apache.impala.thrift.THdfsFileDesc other_element : other.file_descriptors) {
        __this__file_descriptors.add(new org.apache.impala.thrift.THdfsFileDesc(other_element));
      }
      this.file_descriptors = __this__file_descriptors;
    }
    if (other.isSetPartition_stats()) {
      this.partition_stats = org.apache.thrift.TBaseHelper.copyBinary(other.partition_stats);
    }
    this.has_incremental_stats = other.has_incremental_stats;
  }

  public TPartialPartitionInfo deepCopy() {
    return new TPartialPartitionInfo(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    this.name = null;
    this.hms_partition = null;
    this.file_descriptors = null;
    this.partition_stats = null;
    setHas_incremental_statsIsSet(false);
    this.has_incremental_stats = false;
  }

  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
    setIdIsSet(true);
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

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
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

  public org.apache.hadoop.hive.metastore.api.Partition getHms_partition() {
    return this.hms_partition;
  }

  public void setHms_partition(org.apache.hadoop.hive.metastore.api.Partition hms_partition) {
    this.hms_partition = hms_partition;
  }

  public void unsetHms_partition() {
    this.hms_partition = null;
  }

  /** Returns true if field hms_partition is set (has been assigned a value) and false otherwise */
  public boolean isSetHms_partition() {
    return this.hms_partition != null;
  }

  public void setHms_partitionIsSet(boolean value) {
    if (!value) {
      this.hms_partition = null;
    }
  }

  public int getFile_descriptorsSize() {
    return (this.file_descriptors == null) ? 0 : this.file_descriptors.size();
  }

  public java.util.Iterator<org.apache.impala.thrift.THdfsFileDesc> getFile_descriptorsIterator() {
    return (this.file_descriptors == null) ? null : this.file_descriptors.iterator();
  }

  public void addToFile_descriptors(org.apache.impala.thrift.THdfsFileDesc elem) {
    if (this.file_descriptors == null) {
      this.file_descriptors = new ArrayList<org.apache.impala.thrift.THdfsFileDesc>();
    }
    this.file_descriptors.add(elem);
  }

  public List<org.apache.impala.thrift.THdfsFileDesc> getFile_descriptors() {
    return this.file_descriptors;
  }

  public void setFile_descriptors(List<org.apache.impala.thrift.THdfsFileDesc> file_descriptors) {
    this.file_descriptors = file_descriptors;
  }

  public void unsetFile_descriptors() {
    this.file_descriptors = null;
  }

  /** Returns true if field file_descriptors is set (has been assigned a value) and false otherwise */
  public boolean isSetFile_descriptors() {
    return this.file_descriptors != null;
  }

  public void setFile_descriptorsIsSet(boolean value) {
    if (!value) {
      this.file_descriptors = null;
    }
  }

  public byte[] getPartition_stats() {
    setPartition_stats(org.apache.thrift.TBaseHelper.rightSize(partition_stats));
    return partition_stats == null ? null : partition_stats.array();
  }

  public ByteBuffer bufferForPartition_stats() {
    return org.apache.thrift.TBaseHelper.copyBinary(partition_stats);
  }

  public void setPartition_stats(byte[] partition_stats) {
    this.partition_stats = partition_stats == null ? (ByteBuffer)null : ByteBuffer.wrap(Arrays.copyOf(partition_stats, partition_stats.length));
  }

  public void setPartition_stats(ByteBuffer partition_stats) {
    this.partition_stats = org.apache.thrift.TBaseHelper.copyBinary(partition_stats);
  }

  public void unsetPartition_stats() {
    this.partition_stats = null;
  }

  /** Returns true if field partition_stats is set (has been assigned a value) and false otherwise */
  public boolean isSetPartition_stats() {
    return this.partition_stats != null;
  }

  public void setPartition_statsIsSet(boolean value) {
    if (!value) {
      this.partition_stats = null;
    }
  }

  public boolean isHas_incremental_stats() {
    return this.has_incremental_stats;
  }

  public void setHas_incremental_stats(boolean has_incremental_stats) {
    this.has_incremental_stats = has_incremental_stats;
    setHas_incremental_statsIsSet(true);
  }

  public void unsetHas_incremental_stats() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __HAS_INCREMENTAL_STATS_ISSET_ID);
  }

  /** Returns true if field has_incremental_stats is set (has been assigned a value) and false otherwise */
  public boolean isSetHas_incremental_stats() {
    return EncodingUtils.testBit(__isset_bitfield, __HAS_INCREMENTAL_STATS_ISSET_ID);
  }

  public void setHas_incremental_statsIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __HAS_INCREMENTAL_STATS_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((Long)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case HMS_PARTITION:
      if (value == null) {
        unsetHms_partition();
      } else {
        setHms_partition((org.apache.hadoop.hive.metastore.api.Partition)value);
      }
      break;

    case FILE_DESCRIPTORS:
      if (value == null) {
        unsetFile_descriptors();
      } else {
        setFile_descriptors((List<org.apache.impala.thrift.THdfsFileDesc>)value);
      }
      break;

    case PARTITION_STATS:
      if (value == null) {
        unsetPartition_stats();
      } else {
        setPartition_stats((ByteBuffer)value);
      }
      break;

    case HAS_INCREMENTAL_STATS:
      if (value == null) {
        unsetHas_incremental_stats();
      } else {
        setHas_incremental_stats((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case NAME:
      return getName();

    case HMS_PARTITION:
      return getHms_partition();

    case FILE_DESCRIPTORS:
      return getFile_descriptors();

    case PARTITION_STATS:
      return getPartition_stats();

    case HAS_INCREMENTAL_STATS:
      return isHas_incremental_stats();

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
    case NAME:
      return isSetName();
    case HMS_PARTITION:
      return isSetHms_partition();
    case FILE_DESCRIPTORS:
      return isSetFile_descriptors();
    case PARTITION_STATS:
      return isSetPartition_stats();
    case HAS_INCREMENTAL_STATS:
      return isSetHas_incremental_stats();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TPartialPartitionInfo)
      return this.equals((TPartialPartitionInfo)that);
    return false;
  }

  public boolean equals(TPartialPartitionInfo that) {
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

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_hms_partition = true && this.isSetHms_partition();
    boolean that_present_hms_partition = true && that.isSetHms_partition();
    if (this_present_hms_partition || that_present_hms_partition) {
      if (!(this_present_hms_partition && that_present_hms_partition))
        return false;
      if (!this.hms_partition.equals(that.hms_partition))
        return false;
    }

    boolean this_present_file_descriptors = true && this.isSetFile_descriptors();
    boolean that_present_file_descriptors = true && that.isSetFile_descriptors();
    if (this_present_file_descriptors || that_present_file_descriptors) {
      if (!(this_present_file_descriptors && that_present_file_descriptors))
        return false;
      if (!this.file_descriptors.equals(that.file_descriptors))
        return false;
    }

    boolean this_present_partition_stats = true && this.isSetPartition_stats();
    boolean that_present_partition_stats = true && that.isSetPartition_stats();
    if (this_present_partition_stats || that_present_partition_stats) {
      if (!(this_present_partition_stats && that_present_partition_stats))
        return false;
      if (!this.partition_stats.equals(that.partition_stats))
        return false;
    }

    boolean this_present_has_incremental_stats = true && this.isSetHas_incremental_stats();
    boolean that_present_has_incremental_stats = true && that.isSetHas_incremental_stats();
    if (this_present_has_incremental_stats || that_present_has_incremental_stats) {
      if (!(this_present_has_incremental_stats && that_present_has_incremental_stats))
        return false;
      if (this.has_incremental_stats != that.has_incremental_stats)
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

    boolean present_name = true && (isSetName());
    list.add(present_name);
    if (present_name)
      list.add(name);

    boolean present_hms_partition = true && (isSetHms_partition());
    list.add(present_hms_partition);
    if (present_hms_partition)
      list.add(hms_partition);

    boolean present_file_descriptors = true && (isSetFile_descriptors());
    list.add(present_file_descriptors);
    if (present_file_descriptors)
      list.add(file_descriptors);

    boolean present_partition_stats = true && (isSetPartition_stats());
    list.add(present_partition_stats);
    if (present_partition_stats)
      list.add(partition_stats);

    boolean present_has_incremental_stats = true && (isSetHas_incremental_stats());
    list.add(present_has_incremental_stats);
    if (present_has_incremental_stats)
      list.add(has_incremental_stats);

    return list.hashCode();
  }

  @Override
  public int compareTo(TPartialPartitionInfo other) {
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
    lastComparison = Boolean.valueOf(isSetHms_partition()).compareTo(other.isSetHms_partition());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHms_partition()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hms_partition, other.hms_partition);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFile_descriptors()).compareTo(other.isSetFile_descriptors());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFile_descriptors()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.file_descriptors, other.file_descriptors);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPartition_stats()).compareTo(other.isSetPartition_stats());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartition_stats()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.partition_stats, other.partition_stats);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHas_incremental_stats()).compareTo(other.isSetHas_incremental_stats());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHas_incremental_stats()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.has_incremental_stats, other.has_incremental_stats);
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
    StringBuilder sb = new StringBuilder("TPartialPartitionInfo(");
    boolean first = true;

    sb.append("id:");
    sb.append(this.id);
    first = false;
    if (isSetName()) {
      if (!first) sb.append(", ");
      sb.append("name:");
      if (this.name == null) {
        sb.append("null");
      } else {
        sb.append(this.name);
      }
      first = false;
    }
    if (isSetHms_partition()) {
      if (!first) sb.append(", ");
      sb.append("hms_partition:");
      if (this.hms_partition == null) {
        sb.append("null");
      } else {
        sb.append(this.hms_partition);
      }
      first = false;
    }
    if (isSetFile_descriptors()) {
      if (!first) sb.append(", ");
      sb.append("file_descriptors:");
      if (this.file_descriptors == null) {
        sb.append("null");
      } else {
        sb.append(this.file_descriptors);
      }
      first = false;
    }
    if (isSetPartition_stats()) {
      if (!first) sb.append(", ");
      sb.append("partition_stats:");
      if (this.partition_stats == null) {
        sb.append("null");
      } else {
        org.apache.thrift.TBaseHelper.toString(this.partition_stats, sb);
      }
      first = false;
    }
    if (isSetHas_incremental_stats()) {
      if (!first) sb.append(", ");
      sb.append("has_incremental_stats:");
      sb.append(this.has_incremental_stats);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetId()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'id' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
    if (hms_partition != null) {
      hms_partition.validate();
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TPartialPartitionInfoStandardSchemeFactory implements SchemeFactory {
    public TPartialPartitionInfoStandardScheme getScheme() {
      return new TPartialPartitionInfoStandardScheme();
    }
  }

  private static class TPartialPartitionInfoStandardScheme extends StandardScheme<TPartialPartitionInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TPartialPartitionInfo struct) throws org.apache.thrift.TException {
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
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.id = iprot.readI64();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // HMS_PARTITION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.hms_partition = new org.apache.hadoop.hive.metastore.api.Partition();
              struct.hms_partition.read(iprot);
              struct.setHms_partitionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // FILE_DESCRIPTORS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list64 = iprot.readListBegin();
                struct.file_descriptors = new ArrayList<org.apache.impala.thrift.THdfsFileDesc>(_list64.size);
                org.apache.impala.thrift.THdfsFileDesc _elem65;
                for (int _i66 = 0; _i66 < _list64.size; ++_i66)
                {
                  _elem65 = new org.apache.impala.thrift.THdfsFileDesc();
                  _elem65.read(iprot);
                  struct.file_descriptors.add(_elem65);
                }
                iprot.readListEnd();
              }
              struct.setFile_descriptorsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // PARTITION_STATS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.partition_stats = iprot.readBinary();
              struct.setPartition_statsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // HAS_INCREMENTAL_STATS
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.has_incremental_stats = iprot.readBool();
              struct.setHas_incremental_statsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TPartialPartitionInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ID_FIELD_DESC);
      oprot.writeI64(struct.id);
      oprot.writeFieldEnd();
      if (struct.name != null) {
        if (struct.isSetName()) {
          oprot.writeFieldBegin(NAME_FIELD_DESC);
          oprot.writeString(struct.name);
          oprot.writeFieldEnd();
        }
      }
      if (struct.hms_partition != null) {
        if (struct.isSetHms_partition()) {
          oprot.writeFieldBegin(HMS_PARTITION_FIELD_DESC);
          struct.hms_partition.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.file_descriptors != null) {
        if (struct.isSetFile_descriptors()) {
          oprot.writeFieldBegin(FILE_DESCRIPTORS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.file_descriptors.size()));
            for (org.apache.impala.thrift.THdfsFileDesc _iter67 : struct.file_descriptors)
            {
              _iter67.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.partition_stats != null) {
        if (struct.isSetPartition_stats()) {
          oprot.writeFieldBegin(PARTITION_STATS_FIELD_DESC);
          oprot.writeBinary(struct.partition_stats);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetHas_incremental_stats()) {
        oprot.writeFieldBegin(HAS_INCREMENTAL_STATS_FIELD_DESC);
        oprot.writeBool(struct.has_incremental_stats);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TPartialPartitionInfoTupleSchemeFactory implements SchemeFactory {
    public TPartialPartitionInfoTupleScheme getScheme() {
      return new TPartialPartitionInfoTupleScheme();
    }
  }

  private static class TPartialPartitionInfoTupleScheme extends TupleScheme<TPartialPartitionInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TPartialPartitionInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI64(struct.id);
      BitSet optionals = new BitSet();
      if (struct.isSetName()) {
        optionals.set(0);
      }
      if (struct.isSetHms_partition()) {
        optionals.set(1);
      }
      if (struct.isSetFile_descriptors()) {
        optionals.set(2);
      }
      if (struct.isSetPartition_stats()) {
        optionals.set(3);
      }
      if (struct.isSetHas_incremental_stats()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetHms_partition()) {
        struct.hms_partition.write(oprot);
      }
      if (struct.isSetFile_descriptors()) {
        {
          oprot.writeI32(struct.file_descriptors.size());
          for (org.apache.impala.thrift.THdfsFileDesc _iter68 : struct.file_descriptors)
          {
            _iter68.write(oprot);
          }
        }
      }
      if (struct.isSetPartition_stats()) {
        oprot.writeBinary(struct.partition_stats);
      }
      if (struct.isSetHas_incremental_stats()) {
        oprot.writeBool(struct.has_incremental_stats);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TPartialPartitionInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.id = iprot.readI64();
      struct.setIdIsSet(true);
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.hms_partition = new org.apache.hadoop.hive.metastore.api.Partition();
        struct.hms_partition.read(iprot);
        struct.setHms_partitionIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list69 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.file_descriptors = new ArrayList<org.apache.impala.thrift.THdfsFileDesc>(_list69.size);
          org.apache.impala.thrift.THdfsFileDesc _elem70;
          for (int _i71 = 0; _i71 < _list69.size; ++_i71)
          {
            _elem70 = new org.apache.impala.thrift.THdfsFileDesc();
            _elem70.read(iprot);
            struct.file_descriptors.add(_elem70);
          }
        }
        struct.setFile_descriptorsIsSet(true);
      }
      if (incoming.get(3)) {
        struct.partition_stats = iprot.readBinary();
        struct.setPartition_statsIsSet(true);
      }
      if (incoming.get(4)) {
        struct.has_incremental_stats = iprot.readBool();
        struct.setHas_incremental_statsIsSet(true);
      }
    }
  }

}
