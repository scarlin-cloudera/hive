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
public class TFinalizeParams implements org.apache.thrift.TBase<TFinalizeParams, TFinalizeParams._Fields>, java.io.Serializable, Cloneable, Comparable<TFinalizeParams> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TFinalizeParams");

  private static final org.apache.thrift.protocol.TField IS_OVERWRITE_FIELD_DESC = new org.apache.thrift.protocol.TField("is_overwrite", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField HDFS_BASE_DIR_FIELD_DESC = new org.apache.thrift.protocol.TField("hdfs_base_dir", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField TABLE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("table_name", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField TABLE_DB_FIELD_DESC = new org.apache.thrift.protocol.TField("table_db", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField STAGING_DIR_FIELD_DESC = new org.apache.thrift.protocol.TField("staging_dir", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField TABLE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("table_id", org.apache.thrift.protocol.TType.I64, (short)6);
  private static final org.apache.thrift.protocol.TField TRANSACTION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("transaction_id", org.apache.thrift.protocol.TType.I64, (short)7);
  private static final org.apache.thrift.protocol.TField WRITE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("write_id", org.apache.thrift.protocol.TType.I64, (short)8);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TFinalizeParamsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TFinalizeParamsTupleSchemeFactory());
  }

  private boolean is_overwrite; // required
  private String hdfs_base_dir; // required
  private String table_name; // required
  private String table_db; // required
  private String staging_dir; // optional
  private long table_id; // optional
  private long transaction_id; // optional
  private long write_id; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    IS_OVERWRITE((short)1, "is_overwrite"),
    HDFS_BASE_DIR((short)2, "hdfs_base_dir"),
    TABLE_NAME((short)3, "table_name"),
    TABLE_DB((short)4, "table_db"),
    STAGING_DIR((short)5, "staging_dir"),
    TABLE_ID((short)6, "table_id"),
    TRANSACTION_ID((short)7, "transaction_id"),
    WRITE_ID((short)8, "write_id");

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
        case 1: // IS_OVERWRITE
          return IS_OVERWRITE;
        case 2: // HDFS_BASE_DIR
          return HDFS_BASE_DIR;
        case 3: // TABLE_NAME
          return TABLE_NAME;
        case 4: // TABLE_DB
          return TABLE_DB;
        case 5: // STAGING_DIR
          return STAGING_DIR;
        case 6: // TABLE_ID
          return TABLE_ID;
        case 7: // TRANSACTION_ID
          return TRANSACTION_ID;
        case 8: // WRITE_ID
          return WRITE_ID;
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
  private static final int __IS_OVERWRITE_ISSET_ID = 0;
  private static final int __TABLE_ID_ISSET_ID = 1;
  private static final int __TRANSACTION_ID_ISSET_ID = 2;
  private static final int __WRITE_ID_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.STAGING_DIR,_Fields.TABLE_ID,_Fields.TRANSACTION_ID,_Fields.WRITE_ID};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.IS_OVERWRITE, new org.apache.thrift.meta_data.FieldMetaData("is_overwrite", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.HDFS_BASE_DIR, new org.apache.thrift.meta_data.FieldMetaData("hdfs_base_dir", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TABLE_NAME, new org.apache.thrift.meta_data.FieldMetaData("table_name", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TABLE_DB, new org.apache.thrift.meta_data.FieldMetaData("table_db", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.STAGING_DIR, new org.apache.thrift.meta_data.FieldMetaData("staging_dir", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TABLE_ID, new org.apache.thrift.meta_data.FieldMetaData("table_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.TRANSACTION_ID, new org.apache.thrift.meta_data.FieldMetaData("transaction_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.WRITE_ID, new org.apache.thrift.meta_data.FieldMetaData("write_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TFinalizeParams.class, metaDataMap);
  }

  public TFinalizeParams() {
  }

  public TFinalizeParams(
    boolean is_overwrite,
    String hdfs_base_dir,
    String table_name,
    String table_db)
  {
    this();
    this.is_overwrite = is_overwrite;
    setIs_overwriteIsSet(true);
    this.hdfs_base_dir = hdfs_base_dir;
    this.table_name = table_name;
    this.table_db = table_db;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TFinalizeParams(TFinalizeParams other) {
    __isset_bitfield = other.__isset_bitfield;
    this.is_overwrite = other.is_overwrite;
    if (other.isSetHdfs_base_dir()) {
      this.hdfs_base_dir = other.hdfs_base_dir;
    }
    if (other.isSetTable_name()) {
      this.table_name = other.table_name;
    }
    if (other.isSetTable_db()) {
      this.table_db = other.table_db;
    }
    if (other.isSetStaging_dir()) {
      this.staging_dir = other.staging_dir;
    }
    this.table_id = other.table_id;
    this.transaction_id = other.transaction_id;
    this.write_id = other.write_id;
  }

  public TFinalizeParams deepCopy() {
    return new TFinalizeParams(this);
  }

  @Override
  public void clear() {
    setIs_overwriteIsSet(false);
    this.is_overwrite = false;
    this.hdfs_base_dir = null;
    this.table_name = null;
    this.table_db = null;
    this.staging_dir = null;
    setTable_idIsSet(false);
    this.table_id = 0;
    setTransaction_idIsSet(false);
    this.transaction_id = 0;
    setWrite_idIsSet(false);
    this.write_id = 0;
  }

  public boolean isIs_overwrite() {
    return this.is_overwrite;
  }

  public void setIs_overwrite(boolean is_overwrite) {
    this.is_overwrite = is_overwrite;
    setIs_overwriteIsSet(true);
  }

  public void unsetIs_overwrite() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __IS_OVERWRITE_ISSET_ID);
  }

  /** Returns true if field is_overwrite is set (has been assigned a value) and false otherwise */
  public boolean isSetIs_overwrite() {
    return EncodingUtils.testBit(__isset_bitfield, __IS_OVERWRITE_ISSET_ID);
  }

  public void setIs_overwriteIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __IS_OVERWRITE_ISSET_ID, value);
  }

  public String getHdfs_base_dir() {
    return this.hdfs_base_dir;
  }

  public void setHdfs_base_dir(String hdfs_base_dir) {
    this.hdfs_base_dir = hdfs_base_dir;
  }

  public void unsetHdfs_base_dir() {
    this.hdfs_base_dir = null;
  }

  /** Returns true if field hdfs_base_dir is set (has been assigned a value) and false otherwise */
  public boolean isSetHdfs_base_dir() {
    return this.hdfs_base_dir != null;
  }

  public void setHdfs_base_dirIsSet(boolean value) {
    if (!value) {
      this.hdfs_base_dir = null;
    }
  }

  public String getTable_name() {
    return this.table_name;
  }

  public void setTable_name(String table_name) {
    this.table_name = table_name;
  }

  public void unsetTable_name() {
    this.table_name = null;
  }

  /** Returns true if field table_name is set (has been assigned a value) and false otherwise */
  public boolean isSetTable_name() {
    return this.table_name != null;
  }

  public void setTable_nameIsSet(boolean value) {
    if (!value) {
      this.table_name = null;
    }
  }

  public String getTable_db() {
    return this.table_db;
  }

  public void setTable_db(String table_db) {
    this.table_db = table_db;
  }

  public void unsetTable_db() {
    this.table_db = null;
  }

  /** Returns true if field table_db is set (has been assigned a value) and false otherwise */
  public boolean isSetTable_db() {
    return this.table_db != null;
  }

  public void setTable_dbIsSet(boolean value) {
    if (!value) {
      this.table_db = null;
    }
  }

  public String getStaging_dir() {
    return this.staging_dir;
  }

  public void setStaging_dir(String staging_dir) {
    this.staging_dir = staging_dir;
  }

  public void unsetStaging_dir() {
    this.staging_dir = null;
  }

  /** Returns true if field staging_dir is set (has been assigned a value) and false otherwise */
  public boolean isSetStaging_dir() {
    return this.staging_dir != null;
  }

  public void setStaging_dirIsSet(boolean value) {
    if (!value) {
      this.staging_dir = null;
    }
  }

  public long getTable_id() {
    return this.table_id;
  }

  public void setTable_id(long table_id) {
    this.table_id = table_id;
    setTable_idIsSet(true);
  }

  public void unsetTable_id() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TABLE_ID_ISSET_ID);
  }

  /** Returns true if field table_id is set (has been assigned a value) and false otherwise */
  public boolean isSetTable_id() {
    return EncodingUtils.testBit(__isset_bitfield, __TABLE_ID_ISSET_ID);
  }

  public void setTable_idIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TABLE_ID_ISSET_ID, value);
  }

  public long getTransaction_id() {
    return this.transaction_id;
  }

  public void setTransaction_id(long transaction_id) {
    this.transaction_id = transaction_id;
    setTransaction_idIsSet(true);
  }

  public void unsetTransaction_id() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TRANSACTION_ID_ISSET_ID);
  }

  /** Returns true if field transaction_id is set (has been assigned a value) and false otherwise */
  public boolean isSetTransaction_id() {
    return EncodingUtils.testBit(__isset_bitfield, __TRANSACTION_ID_ISSET_ID);
  }

  public void setTransaction_idIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TRANSACTION_ID_ISSET_ID, value);
  }

  public long getWrite_id() {
    return this.write_id;
  }

  public void setWrite_id(long write_id) {
    this.write_id = write_id;
    setWrite_idIsSet(true);
  }

  public void unsetWrite_id() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __WRITE_ID_ISSET_ID);
  }

  /** Returns true if field write_id is set (has been assigned a value) and false otherwise */
  public boolean isSetWrite_id() {
    return EncodingUtils.testBit(__isset_bitfield, __WRITE_ID_ISSET_ID);
  }

  public void setWrite_idIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __WRITE_ID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case IS_OVERWRITE:
      if (value == null) {
        unsetIs_overwrite();
      } else {
        setIs_overwrite((Boolean)value);
      }
      break;

    case HDFS_BASE_DIR:
      if (value == null) {
        unsetHdfs_base_dir();
      } else {
        setHdfs_base_dir((String)value);
      }
      break;

    case TABLE_NAME:
      if (value == null) {
        unsetTable_name();
      } else {
        setTable_name((String)value);
      }
      break;

    case TABLE_DB:
      if (value == null) {
        unsetTable_db();
      } else {
        setTable_db((String)value);
      }
      break;

    case STAGING_DIR:
      if (value == null) {
        unsetStaging_dir();
      } else {
        setStaging_dir((String)value);
      }
      break;

    case TABLE_ID:
      if (value == null) {
        unsetTable_id();
      } else {
        setTable_id((Long)value);
      }
      break;

    case TRANSACTION_ID:
      if (value == null) {
        unsetTransaction_id();
      } else {
        setTransaction_id((Long)value);
      }
      break;

    case WRITE_ID:
      if (value == null) {
        unsetWrite_id();
      } else {
        setWrite_id((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case IS_OVERWRITE:
      return isIs_overwrite();

    case HDFS_BASE_DIR:
      return getHdfs_base_dir();

    case TABLE_NAME:
      return getTable_name();

    case TABLE_DB:
      return getTable_db();

    case STAGING_DIR:
      return getStaging_dir();

    case TABLE_ID:
      return getTable_id();

    case TRANSACTION_ID:
      return getTransaction_id();

    case WRITE_ID:
      return getWrite_id();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case IS_OVERWRITE:
      return isSetIs_overwrite();
    case HDFS_BASE_DIR:
      return isSetHdfs_base_dir();
    case TABLE_NAME:
      return isSetTable_name();
    case TABLE_DB:
      return isSetTable_db();
    case STAGING_DIR:
      return isSetStaging_dir();
    case TABLE_ID:
      return isSetTable_id();
    case TRANSACTION_ID:
      return isSetTransaction_id();
    case WRITE_ID:
      return isSetWrite_id();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TFinalizeParams)
      return this.equals((TFinalizeParams)that);
    return false;
  }

  public boolean equals(TFinalizeParams that) {
    if (that == null)
      return false;

    boolean this_present_is_overwrite = true;
    boolean that_present_is_overwrite = true;
    if (this_present_is_overwrite || that_present_is_overwrite) {
      if (!(this_present_is_overwrite && that_present_is_overwrite))
        return false;
      if (this.is_overwrite != that.is_overwrite)
        return false;
    }

    boolean this_present_hdfs_base_dir = true && this.isSetHdfs_base_dir();
    boolean that_present_hdfs_base_dir = true && that.isSetHdfs_base_dir();
    if (this_present_hdfs_base_dir || that_present_hdfs_base_dir) {
      if (!(this_present_hdfs_base_dir && that_present_hdfs_base_dir))
        return false;
      if (!this.hdfs_base_dir.equals(that.hdfs_base_dir))
        return false;
    }

    boolean this_present_table_name = true && this.isSetTable_name();
    boolean that_present_table_name = true && that.isSetTable_name();
    if (this_present_table_name || that_present_table_name) {
      if (!(this_present_table_name && that_present_table_name))
        return false;
      if (!this.table_name.equals(that.table_name))
        return false;
    }

    boolean this_present_table_db = true && this.isSetTable_db();
    boolean that_present_table_db = true && that.isSetTable_db();
    if (this_present_table_db || that_present_table_db) {
      if (!(this_present_table_db && that_present_table_db))
        return false;
      if (!this.table_db.equals(that.table_db))
        return false;
    }

    boolean this_present_staging_dir = true && this.isSetStaging_dir();
    boolean that_present_staging_dir = true && that.isSetStaging_dir();
    if (this_present_staging_dir || that_present_staging_dir) {
      if (!(this_present_staging_dir && that_present_staging_dir))
        return false;
      if (!this.staging_dir.equals(that.staging_dir))
        return false;
    }

    boolean this_present_table_id = true && this.isSetTable_id();
    boolean that_present_table_id = true && that.isSetTable_id();
    if (this_present_table_id || that_present_table_id) {
      if (!(this_present_table_id && that_present_table_id))
        return false;
      if (this.table_id != that.table_id)
        return false;
    }

    boolean this_present_transaction_id = true && this.isSetTransaction_id();
    boolean that_present_transaction_id = true && that.isSetTransaction_id();
    if (this_present_transaction_id || that_present_transaction_id) {
      if (!(this_present_transaction_id && that_present_transaction_id))
        return false;
      if (this.transaction_id != that.transaction_id)
        return false;
    }

    boolean this_present_write_id = true && this.isSetWrite_id();
    boolean that_present_write_id = true && that.isSetWrite_id();
    if (this_present_write_id || that_present_write_id) {
      if (!(this_present_write_id && that_present_write_id))
        return false;
      if (this.write_id != that.write_id)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_is_overwrite = true;
    list.add(present_is_overwrite);
    if (present_is_overwrite)
      list.add(is_overwrite);

    boolean present_hdfs_base_dir = true && (isSetHdfs_base_dir());
    list.add(present_hdfs_base_dir);
    if (present_hdfs_base_dir)
      list.add(hdfs_base_dir);

    boolean present_table_name = true && (isSetTable_name());
    list.add(present_table_name);
    if (present_table_name)
      list.add(table_name);

    boolean present_table_db = true && (isSetTable_db());
    list.add(present_table_db);
    if (present_table_db)
      list.add(table_db);

    boolean present_staging_dir = true && (isSetStaging_dir());
    list.add(present_staging_dir);
    if (present_staging_dir)
      list.add(staging_dir);

    boolean present_table_id = true && (isSetTable_id());
    list.add(present_table_id);
    if (present_table_id)
      list.add(table_id);

    boolean present_transaction_id = true && (isSetTransaction_id());
    list.add(present_transaction_id);
    if (present_transaction_id)
      list.add(transaction_id);

    boolean present_write_id = true && (isSetWrite_id());
    list.add(present_write_id);
    if (present_write_id)
      list.add(write_id);

    return list.hashCode();
  }

  @Override
  public int compareTo(TFinalizeParams other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetIs_overwrite()).compareTo(other.isSetIs_overwrite());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIs_overwrite()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.is_overwrite, other.is_overwrite);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHdfs_base_dir()).compareTo(other.isSetHdfs_base_dir());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHdfs_base_dir()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hdfs_base_dir, other.hdfs_base_dir);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTable_name()).compareTo(other.isSetTable_name());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTable_name()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.table_name, other.table_name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTable_db()).compareTo(other.isSetTable_db());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTable_db()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.table_db, other.table_db);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStaging_dir()).compareTo(other.isSetStaging_dir());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStaging_dir()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.staging_dir, other.staging_dir);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTable_id()).compareTo(other.isSetTable_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTable_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.table_id, other.table_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTransaction_id()).compareTo(other.isSetTransaction_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTransaction_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.transaction_id, other.transaction_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetWrite_id()).compareTo(other.isSetWrite_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWrite_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.write_id, other.write_id);
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
    StringBuilder sb = new StringBuilder("TFinalizeParams(");
    boolean first = true;

    sb.append("is_overwrite:");
    sb.append(this.is_overwrite);
    first = false;
    if (!first) sb.append(", ");
    sb.append("hdfs_base_dir:");
    if (this.hdfs_base_dir == null) {
      sb.append("null");
    } else {
      sb.append(this.hdfs_base_dir);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("table_name:");
    if (this.table_name == null) {
      sb.append("null");
    } else {
      sb.append(this.table_name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("table_db:");
    if (this.table_db == null) {
      sb.append("null");
    } else {
      sb.append(this.table_db);
    }
    first = false;
    if (isSetStaging_dir()) {
      if (!first) sb.append(", ");
      sb.append("staging_dir:");
      if (this.staging_dir == null) {
        sb.append("null");
      } else {
        sb.append(this.staging_dir);
      }
      first = false;
    }
    if (isSetTable_id()) {
      if (!first) sb.append(", ");
      sb.append("table_id:");
      sb.append(this.table_id);
      first = false;
    }
    if (isSetTransaction_id()) {
      if (!first) sb.append(", ");
      sb.append("transaction_id:");
      sb.append(this.transaction_id);
      first = false;
    }
    if (isSetWrite_id()) {
      if (!first) sb.append(", ");
      sb.append("write_id:");
      sb.append(this.write_id);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetIs_overwrite()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'is_overwrite' is unset! Struct:" + toString());
    }

    if (!isSetHdfs_base_dir()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'hdfs_base_dir' is unset! Struct:" + toString());
    }

    if (!isSetTable_name()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'table_name' is unset! Struct:" + toString());
    }

    if (!isSetTable_db()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'table_db' is unset! Struct:" + toString());
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

  private static class TFinalizeParamsStandardSchemeFactory implements SchemeFactory {
    public TFinalizeParamsStandardScheme getScheme() {
      return new TFinalizeParamsStandardScheme();
    }
  }

  private static class TFinalizeParamsStandardScheme extends StandardScheme<TFinalizeParams> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TFinalizeParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // IS_OVERWRITE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.is_overwrite = iprot.readBool();
              struct.setIs_overwriteIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // HDFS_BASE_DIR
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.hdfs_base_dir = iprot.readString();
              struct.setHdfs_base_dirIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TABLE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.table_name = iprot.readString();
              struct.setTable_nameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TABLE_DB
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.table_db = iprot.readString();
              struct.setTable_dbIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // STAGING_DIR
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.staging_dir = iprot.readString();
              struct.setStaging_dirIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // TABLE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.table_id = iprot.readI64();
              struct.setTable_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // TRANSACTION_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.transaction_id = iprot.readI64();
              struct.setTransaction_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // WRITE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.write_id = iprot.readI64();
              struct.setWrite_idIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TFinalizeParams struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(IS_OVERWRITE_FIELD_DESC);
      oprot.writeBool(struct.is_overwrite);
      oprot.writeFieldEnd();
      if (struct.hdfs_base_dir != null) {
        oprot.writeFieldBegin(HDFS_BASE_DIR_FIELD_DESC);
        oprot.writeString(struct.hdfs_base_dir);
        oprot.writeFieldEnd();
      }
      if (struct.table_name != null) {
        oprot.writeFieldBegin(TABLE_NAME_FIELD_DESC);
        oprot.writeString(struct.table_name);
        oprot.writeFieldEnd();
      }
      if (struct.table_db != null) {
        oprot.writeFieldBegin(TABLE_DB_FIELD_DESC);
        oprot.writeString(struct.table_db);
        oprot.writeFieldEnd();
      }
      if (struct.staging_dir != null) {
        if (struct.isSetStaging_dir()) {
          oprot.writeFieldBegin(STAGING_DIR_FIELD_DESC);
          oprot.writeString(struct.staging_dir);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetTable_id()) {
        oprot.writeFieldBegin(TABLE_ID_FIELD_DESC);
        oprot.writeI64(struct.table_id);
        oprot.writeFieldEnd();
      }
      if (struct.isSetTransaction_id()) {
        oprot.writeFieldBegin(TRANSACTION_ID_FIELD_DESC);
        oprot.writeI64(struct.transaction_id);
        oprot.writeFieldEnd();
      }
      if (struct.isSetWrite_id()) {
        oprot.writeFieldBegin(WRITE_ID_FIELD_DESC);
        oprot.writeI64(struct.write_id);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TFinalizeParamsTupleSchemeFactory implements SchemeFactory {
    public TFinalizeParamsTupleScheme getScheme() {
      return new TFinalizeParamsTupleScheme();
    }
  }

  private static class TFinalizeParamsTupleScheme extends TupleScheme<TFinalizeParams> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TFinalizeParams struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeBool(struct.is_overwrite);
      oprot.writeString(struct.hdfs_base_dir);
      oprot.writeString(struct.table_name);
      oprot.writeString(struct.table_db);
      BitSet optionals = new BitSet();
      if (struct.isSetStaging_dir()) {
        optionals.set(0);
      }
      if (struct.isSetTable_id()) {
        optionals.set(1);
      }
      if (struct.isSetTransaction_id()) {
        optionals.set(2);
      }
      if (struct.isSetWrite_id()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetStaging_dir()) {
        oprot.writeString(struct.staging_dir);
      }
      if (struct.isSetTable_id()) {
        oprot.writeI64(struct.table_id);
      }
      if (struct.isSetTransaction_id()) {
        oprot.writeI64(struct.transaction_id);
      }
      if (struct.isSetWrite_id()) {
        oprot.writeI64(struct.write_id);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TFinalizeParams struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.is_overwrite = iprot.readBool();
      struct.setIs_overwriteIsSet(true);
      struct.hdfs_base_dir = iprot.readString();
      struct.setHdfs_base_dirIsSet(true);
      struct.table_name = iprot.readString();
      struct.setTable_nameIsSet(true);
      struct.table_db = iprot.readString();
      struct.setTable_dbIsSet(true);
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.staging_dir = iprot.readString();
        struct.setStaging_dirIsSet(true);
      }
      if (incoming.get(1)) {
        struct.table_id = iprot.readI64();
        struct.setTable_idIsSet(true);
      }
      if (incoming.get(2)) {
        struct.transaction_id = iprot.readI64();
        struct.setTransaction_idIsSet(true);
      }
      if (incoming.get(3)) {
        struct.write_id = iprot.readI64();
        struct.setWrite_idIsSet(true);
      }
    }
  }

}

