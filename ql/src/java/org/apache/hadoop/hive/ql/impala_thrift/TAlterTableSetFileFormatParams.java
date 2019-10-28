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
public class TAlterTableSetFileFormatParams implements org.apache.thrift.TBase<TAlterTableSetFileFormatParams, TAlterTableSetFileFormatParams._Fields>, java.io.Serializable, Cloneable, Comparable<TAlterTableSetFileFormatParams> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TAlterTableSetFileFormatParams");

  private static final org.apache.thrift.protocol.TField FILE_FORMAT_FIELD_DESC = new org.apache.thrift.protocol.TField("file_format", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField PARTITION_SET_FIELD_DESC = new org.apache.thrift.protocol.TField("partition_set", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TAlterTableSetFileFormatParamsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TAlterTableSetFileFormatParamsTupleSchemeFactory());
  }

  private org.apache.impala.thrift.THdfsFileFormat file_format; // required
  private List<List<org.apache.impala.thrift.TPartitionKeyValue>> partition_set; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see org.apache.impala.thrift.THdfsFileFormat
     */
    FILE_FORMAT((short)1, "file_format"),
    PARTITION_SET((short)2, "partition_set");

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
        case 1: // FILE_FORMAT
          return FILE_FORMAT;
        case 2: // PARTITION_SET
          return PARTITION_SET;
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
  private static final _Fields optionals[] = {_Fields.PARTITION_SET};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FILE_FORMAT, new org.apache.thrift.meta_data.FieldMetaData("file_format", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, org.apache.impala.thrift.THdfsFileFormat.class)));
    tmpMap.put(_Fields.PARTITION_SET, new org.apache.thrift.meta_data.FieldMetaData("partition_set", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
                new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.impala.thrift.TPartitionKeyValue.class)))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TAlterTableSetFileFormatParams.class, metaDataMap);
  }

  public TAlterTableSetFileFormatParams() {
  }

  public TAlterTableSetFileFormatParams(
    org.apache.impala.thrift.THdfsFileFormat file_format)
  {
    this();
    this.file_format = file_format;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TAlterTableSetFileFormatParams(TAlterTableSetFileFormatParams other) {
    if (other.isSetFile_format()) {
      this.file_format = other.file_format;
    }
    if (other.isSetPartition_set()) {
      List<List<org.apache.impala.thrift.TPartitionKeyValue>> __this__partition_set = new ArrayList<List<org.apache.impala.thrift.TPartitionKeyValue>>(other.partition_set.size());
      for (List<org.apache.impala.thrift.TPartitionKeyValue> other_element : other.partition_set) {
        List<org.apache.impala.thrift.TPartitionKeyValue> __this__partition_set_copy = new ArrayList<org.apache.impala.thrift.TPartitionKeyValue>(other_element.size());
        for (org.apache.impala.thrift.TPartitionKeyValue other_element_element : other_element) {
          __this__partition_set_copy.add(new org.apache.impala.thrift.TPartitionKeyValue(other_element_element));
        }
        __this__partition_set.add(__this__partition_set_copy);
      }
      this.partition_set = __this__partition_set;
    }
  }

  public TAlterTableSetFileFormatParams deepCopy() {
    return new TAlterTableSetFileFormatParams(this);
  }

  @Override
  public void clear() {
    this.file_format = null;
    this.partition_set = null;
  }

  /**
   * 
   * @see org.apache.impala.thrift.THdfsFileFormat
   */
  public org.apache.impala.thrift.THdfsFileFormat getFile_format() {
    return this.file_format;
  }

  /**
   * 
   * @see org.apache.impala.thrift.THdfsFileFormat
   */
  public void setFile_format(org.apache.impala.thrift.THdfsFileFormat file_format) {
    this.file_format = file_format;
  }

  public void unsetFile_format() {
    this.file_format = null;
  }

  /** Returns true if field file_format is set (has been assigned a value) and false otherwise */
  public boolean isSetFile_format() {
    return this.file_format != null;
  }

  public void setFile_formatIsSet(boolean value) {
    if (!value) {
      this.file_format = null;
    }
  }

  public int getPartition_setSize() {
    return (this.partition_set == null) ? 0 : this.partition_set.size();
  }

  public java.util.Iterator<List<org.apache.impala.thrift.TPartitionKeyValue>> getPartition_setIterator() {
    return (this.partition_set == null) ? null : this.partition_set.iterator();
  }

  public void addToPartition_set(List<org.apache.impala.thrift.TPartitionKeyValue> elem) {
    if (this.partition_set == null) {
      this.partition_set = new ArrayList<List<org.apache.impala.thrift.TPartitionKeyValue>>();
    }
    this.partition_set.add(elem);
  }

  public List<List<org.apache.impala.thrift.TPartitionKeyValue>> getPartition_set() {
    return this.partition_set;
  }

  public void setPartition_set(List<List<org.apache.impala.thrift.TPartitionKeyValue>> partition_set) {
    this.partition_set = partition_set;
  }

  public void unsetPartition_set() {
    this.partition_set = null;
  }

  /** Returns true if field partition_set is set (has been assigned a value) and false otherwise */
  public boolean isSetPartition_set() {
    return this.partition_set != null;
  }

  public void setPartition_setIsSet(boolean value) {
    if (!value) {
      this.partition_set = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case FILE_FORMAT:
      if (value == null) {
        unsetFile_format();
      } else {
        setFile_format((org.apache.impala.thrift.THdfsFileFormat)value);
      }
      break;

    case PARTITION_SET:
      if (value == null) {
        unsetPartition_set();
      } else {
        setPartition_set((List<List<org.apache.impala.thrift.TPartitionKeyValue>>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case FILE_FORMAT:
      return getFile_format();

    case PARTITION_SET:
      return getPartition_set();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case FILE_FORMAT:
      return isSetFile_format();
    case PARTITION_SET:
      return isSetPartition_set();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TAlterTableSetFileFormatParams)
      return this.equals((TAlterTableSetFileFormatParams)that);
    return false;
  }

  public boolean equals(TAlterTableSetFileFormatParams that) {
    if (that == null)
      return false;

    boolean this_present_file_format = true && this.isSetFile_format();
    boolean that_present_file_format = true && that.isSetFile_format();
    if (this_present_file_format || that_present_file_format) {
      if (!(this_present_file_format && that_present_file_format))
        return false;
      if (!this.file_format.equals(that.file_format))
        return false;
    }

    boolean this_present_partition_set = true && this.isSetPartition_set();
    boolean that_present_partition_set = true && that.isSetPartition_set();
    if (this_present_partition_set || that_present_partition_set) {
      if (!(this_present_partition_set && that_present_partition_set))
        return false;
      if (!this.partition_set.equals(that.partition_set))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_file_format = true && (isSetFile_format());
    list.add(present_file_format);
    if (present_file_format)
      list.add(file_format.getValue());

    boolean present_partition_set = true && (isSetPartition_set());
    list.add(present_partition_set);
    if (present_partition_set)
      list.add(partition_set);

    return list.hashCode();
  }

  @Override
  public int compareTo(TAlterTableSetFileFormatParams other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetFile_format()).compareTo(other.isSetFile_format());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFile_format()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.file_format, other.file_format);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPartition_set()).compareTo(other.isSetPartition_set());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartition_set()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.partition_set, other.partition_set);
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
    StringBuilder sb = new StringBuilder("TAlterTableSetFileFormatParams(");
    boolean first = true;

    sb.append("file_format:");
    if (this.file_format == null) {
      sb.append("null");
    } else {
      sb.append(this.file_format);
    }
    first = false;
    if (isSetPartition_set()) {
      if (!first) sb.append(", ");
      sb.append("partition_set:");
      if (this.partition_set == null) {
        sb.append("null");
      } else {
        sb.append(this.partition_set);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetFile_format()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'file_format' is unset! Struct:" + toString());
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

  private static class TAlterTableSetFileFormatParamsStandardSchemeFactory implements SchemeFactory {
    public TAlterTableSetFileFormatParamsStandardScheme getScheme() {
      return new TAlterTableSetFileFormatParamsStandardScheme();
    }
  }

  private static class TAlterTableSetFileFormatParamsStandardScheme extends StandardScheme<TAlterTableSetFileFormatParams> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TAlterTableSetFileFormatParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // FILE_FORMAT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.file_format = org.apache.impala.thrift.THdfsFileFormat.findByValue(iprot.readI32());
              struct.setFile_formatIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PARTITION_SET
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list90 = iprot.readListBegin();
                struct.partition_set = new ArrayList<List<org.apache.impala.thrift.TPartitionKeyValue>>(_list90.size);
                List<org.apache.impala.thrift.TPartitionKeyValue> _elem91;
                for (int _i92 = 0; _i92 < _list90.size; ++_i92)
                {
                  {
                    org.apache.thrift.protocol.TList _list93 = iprot.readListBegin();
                    _elem91 = new ArrayList<org.apache.impala.thrift.TPartitionKeyValue>(_list93.size);
                    org.apache.impala.thrift.TPartitionKeyValue _elem94;
                    for (int _i95 = 0; _i95 < _list93.size; ++_i95)
                    {
                      _elem94 = new org.apache.impala.thrift.TPartitionKeyValue();
                      _elem94.read(iprot);
                      _elem91.add(_elem94);
                    }
                    iprot.readListEnd();
                  }
                  struct.partition_set.add(_elem91);
                }
                iprot.readListEnd();
              }
              struct.setPartition_setIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TAlterTableSetFileFormatParams struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.file_format != null) {
        oprot.writeFieldBegin(FILE_FORMAT_FIELD_DESC);
        oprot.writeI32(struct.file_format.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.partition_set != null) {
        if (struct.isSetPartition_set()) {
          oprot.writeFieldBegin(PARTITION_SET_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.LIST, struct.partition_set.size()));
            for (List<org.apache.impala.thrift.TPartitionKeyValue> _iter96 : struct.partition_set)
            {
              {
                oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, _iter96.size()));
                for (org.apache.impala.thrift.TPartitionKeyValue _iter97 : _iter96)
                {
                  _iter97.write(oprot);
                }
                oprot.writeListEnd();
              }
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

  private static class TAlterTableSetFileFormatParamsTupleSchemeFactory implements SchemeFactory {
    public TAlterTableSetFileFormatParamsTupleScheme getScheme() {
      return new TAlterTableSetFileFormatParamsTupleScheme();
    }
  }

  private static class TAlterTableSetFileFormatParamsTupleScheme extends TupleScheme<TAlterTableSetFileFormatParams> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TAlterTableSetFileFormatParams struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.file_format.getValue());
      BitSet optionals = new BitSet();
      if (struct.isSetPartition_set()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetPartition_set()) {
        {
          oprot.writeI32(struct.partition_set.size());
          for (List<org.apache.impala.thrift.TPartitionKeyValue> _iter98 : struct.partition_set)
          {
            {
              oprot.writeI32(_iter98.size());
              for (org.apache.impala.thrift.TPartitionKeyValue _iter99 : _iter98)
              {
                _iter99.write(oprot);
              }
            }
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TAlterTableSetFileFormatParams struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.file_format = org.apache.impala.thrift.THdfsFileFormat.findByValue(iprot.readI32());
      struct.setFile_formatIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list100 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.LIST, iprot.readI32());
          struct.partition_set = new ArrayList<List<org.apache.impala.thrift.TPartitionKeyValue>>(_list100.size);
          List<org.apache.impala.thrift.TPartitionKeyValue> _elem101;
          for (int _i102 = 0; _i102 < _list100.size; ++_i102)
          {
            {
              org.apache.thrift.protocol.TList _list103 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
              _elem101 = new ArrayList<org.apache.impala.thrift.TPartitionKeyValue>(_list103.size);
              org.apache.impala.thrift.TPartitionKeyValue _elem104;
              for (int _i105 = 0; _i105 < _list103.size; ++_i105)
              {
                _elem104 = new org.apache.impala.thrift.TPartitionKeyValue();
                _elem104.read(iprot);
                _elem101.add(_elem104);
              }
            }
            struct.partition_set.add(_elem101);
          }
        }
        struct.setPartition_setIsSet(true);
      }
    }
  }

}

