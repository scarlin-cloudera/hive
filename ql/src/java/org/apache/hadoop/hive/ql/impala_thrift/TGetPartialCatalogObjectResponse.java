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
public class TGetPartialCatalogObjectResponse implements org.apache.thrift.TBase<TGetPartialCatalogObjectResponse, TGetPartialCatalogObjectResponse._Fields>, java.io.Serializable, Cloneable, Comparable<TGetPartialCatalogObjectResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TGetPartialCatalogObjectResponse");

  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField LOOKUP_STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("lookup_status", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField OBJECT_VERSION_NUMBER_FIELD_DESC = new org.apache.thrift.protocol.TField("object_version_number", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField TABLE_INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("table_info", org.apache.thrift.protocol.TType.STRUCT, (short)4);
  private static final org.apache.thrift.protocol.TField DB_INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("db_info", org.apache.thrift.protocol.TType.STRUCT, (short)5);
  private static final org.apache.thrift.protocol.TField CATALOG_INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("catalog_info", org.apache.thrift.protocol.TType.STRUCT, (short)6);
  private static final org.apache.thrift.protocol.TField FUNCTIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("functions", org.apache.thrift.protocol.TType.LIST, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TGetPartialCatalogObjectResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TGetPartialCatalogObjectResponseTupleSchemeFactory());
  }

  private org.apache.impala.thrift.TStatus status; // optional
  private CatalogLookupStatus lookup_status; // optional
  private long object_version_number; // optional
  private TPartialTableInfo table_info; // optional
  private TPartialDbInfo db_info; // optional
  private TPartialCatalogInfo catalog_info; // optional
  private List<org.apache.impala.thrift.TFunction> functions; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STATUS((short)1, "status"),
    /**
     * 
     * @see CatalogLookupStatus
     */
    LOOKUP_STATUS((short)2, "lookup_status"),
    OBJECT_VERSION_NUMBER((short)3, "object_version_number"),
    TABLE_INFO((short)4, "table_info"),
    DB_INFO((short)5, "db_info"),
    CATALOG_INFO((short)6, "catalog_info"),
    FUNCTIONS((short)7, "functions");

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
        case 1: // STATUS
          return STATUS;
        case 2: // LOOKUP_STATUS
          return LOOKUP_STATUS;
        case 3: // OBJECT_VERSION_NUMBER
          return OBJECT_VERSION_NUMBER;
        case 4: // TABLE_INFO
          return TABLE_INFO;
        case 5: // DB_INFO
          return DB_INFO;
        case 6: // CATALOG_INFO
          return CATALOG_INFO;
        case 7: // FUNCTIONS
          return FUNCTIONS;
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
  private static final int __OBJECT_VERSION_NUMBER_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.STATUS,_Fields.LOOKUP_STATUS,_Fields.OBJECT_VERSION_NUMBER,_Fields.TABLE_INFO,_Fields.DB_INFO,_Fields.CATALOG_INFO,_Fields.FUNCTIONS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.impala.thrift.TStatus.class)));
    tmpMap.put(_Fields.LOOKUP_STATUS, new org.apache.thrift.meta_data.FieldMetaData("lookup_status", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, CatalogLookupStatus.class)));
    tmpMap.put(_Fields.OBJECT_VERSION_NUMBER, new org.apache.thrift.meta_data.FieldMetaData("object_version_number", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.TABLE_INFO, new org.apache.thrift.meta_data.FieldMetaData("table_info", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TPartialTableInfo.class)));
    tmpMap.put(_Fields.DB_INFO, new org.apache.thrift.meta_data.FieldMetaData("db_info", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TPartialDbInfo.class)));
    tmpMap.put(_Fields.CATALOG_INFO, new org.apache.thrift.meta_data.FieldMetaData("catalog_info", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TPartialCatalogInfo.class)));
    tmpMap.put(_Fields.FUNCTIONS, new org.apache.thrift.meta_data.FieldMetaData("functions", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.impala.thrift.TFunction.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TGetPartialCatalogObjectResponse.class, metaDataMap);
  }

  public TGetPartialCatalogObjectResponse() {
    this.lookup_status = org.apache.impala.thrift.CatalogLookupStatus.OK;

  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TGetPartialCatalogObjectResponse(TGetPartialCatalogObjectResponse other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetStatus()) {
      this.status = new org.apache.impala.thrift.TStatus(other.status);
    }
    if (other.isSetLookup_status()) {
      this.lookup_status = other.lookup_status;
    }
    this.object_version_number = other.object_version_number;
    if (other.isSetTable_info()) {
      this.table_info = new TPartialTableInfo(other.table_info);
    }
    if (other.isSetDb_info()) {
      this.db_info = new TPartialDbInfo(other.db_info);
    }
    if (other.isSetCatalog_info()) {
      this.catalog_info = new TPartialCatalogInfo(other.catalog_info);
    }
    if (other.isSetFunctions()) {
      List<org.apache.impala.thrift.TFunction> __this__functions = new ArrayList<org.apache.impala.thrift.TFunction>(other.functions.size());
      for (org.apache.impala.thrift.TFunction other_element : other.functions) {
        __this__functions.add(new org.apache.impala.thrift.TFunction(other_element));
      }
      this.functions = __this__functions;
    }
  }

  public TGetPartialCatalogObjectResponse deepCopy() {
    return new TGetPartialCatalogObjectResponse(this);
  }

  @Override
  public void clear() {
    this.status = null;
    this.lookup_status = org.apache.impala.thrift.CatalogLookupStatus.OK;

    setObject_version_numberIsSet(false);
    this.object_version_number = 0;
    this.table_info = null;
    this.db_info = null;
    this.catalog_info = null;
    this.functions = null;
  }

  public org.apache.impala.thrift.TStatus getStatus() {
    return this.status;
  }

  public void setStatus(org.apache.impala.thrift.TStatus status) {
    this.status = status;
  }

  public void unsetStatus() {
    this.status = null;
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean isSetStatus() {
    return this.status != null;
  }

  public void setStatusIsSet(boolean value) {
    if (!value) {
      this.status = null;
    }
  }

  /**
   * 
   * @see CatalogLookupStatus
   */
  public CatalogLookupStatus getLookup_status() {
    return this.lookup_status;
  }

  /**
   * 
   * @see CatalogLookupStatus
   */
  public void setLookup_status(CatalogLookupStatus lookup_status) {
    this.lookup_status = lookup_status;
  }

  public void unsetLookup_status() {
    this.lookup_status = null;
  }

  /** Returns true if field lookup_status is set (has been assigned a value) and false otherwise */
  public boolean isSetLookup_status() {
    return this.lookup_status != null;
  }

  public void setLookup_statusIsSet(boolean value) {
    if (!value) {
      this.lookup_status = null;
    }
  }

  public long getObject_version_number() {
    return this.object_version_number;
  }

  public void setObject_version_number(long object_version_number) {
    this.object_version_number = object_version_number;
    setObject_version_numberIsSet(true);
  }

  public void unsetObject_version_number() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __OBJECT_VERSION_NUMBER_ISSET_ID);
  }

  /** Returns true if field object_version_number is set (has been assigned a value) and false otherwise */
  public boolean isSetObject_version_number() {
    return EncodingUtils.testBit(__isset_bitfield, __OBJECT_VERSION_NUMBER_ISSET_ID);
  }

  public void setObject_version_numberIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __OBJECT_VERSION_NUMBER_ISSET_ID, value);
  }

  public TPartialTableInfo getTable_info() {
    return this.table_info;
  }

  public void setTable_info(TPartialTableInfo table_info) {
    this.table_info = table_info;
  }

  public void unsetTable_info() {
    this.table_info = null;
  }

  /** Returns true if field table_info is set (has been assigned a value) and false otherwise */
  public boolean isSetTable_info() {
    return this.table_info != null;
  }

  public void setTable_infoIsSet(boolean value) {
    if (!value) {
      this.table_info = null;
    }
  }

  public TPartialDbInfo getDb_info() {
    return this.db_info;
  }

  public void setDb_info(TPartialDbInfo db_info) {
    this.db_info = db_info;
  }

  public void unsetDb_info() {
    this.db_info = null;
  }

  /** Returns true if field db_info is set (has been assigned a value) and false otherwise */
  public boolean isSetDb_info() {
    return this.db_info != null;
  }

  public void setDb_infoIsSet(boolean value) {
    if (!value) {
      this.db_info = null;
    }
  }

  public TPartialCatalogInfo getCatalog_info() {
    return this.catalog_info;
  }

  public void setCatalog_info(TPartialCatalogInfo catalog_info) {
    this.catalog_info = catalog_info;
  }

  public void unsetCatalog_info() {
    this.catalog_info = null;
  }

  /** Returns true if field catalog_info is set (has been assigned a value) and false otherwise */
  public boolean isSetCatalog_info() {
    return this.catalog_info != null;
  }

  public void setCatalog_infoIsSet(boolean value) {
    if (!value) {
      this.catalog_info = null;
    }
  }

  public int getFunctionsSize() {
    return (this.functions == null) ? 0 : this.functions.size();
  }

  public java.util.Iterator<org.apache.impala.thrift.TFunction> getFunctionsIterator() {
    return (this.functions == null) ? null : this.functions.iterator();
  }

  public void addToFunctions(org.apache.impala.thrift.TFunction elem) {
    if (this.functions == null) {
      this.functions = new ArrayList<org.apache.impala.thrift.TFunction>();
    }
    this.functions.add(elem);
  }

  public List<org.apache.impala.thrift.TFunction> getFunctions() {
    return this.functions;
  }

  public void setFunctions(List<org.apache.impala.thrift.TFunction> functions) {
    this.functions = functions;
  }

  public void unsetFunctions() {
    this.functions = null;
  }

  /** Returns true if field functions is set (has been assigned a value) and false otherwise */
  public boolean isSetFunctions() {
    return this.functions != null;
  }

  public void setFunctionsIsSet(boolean value) {
    if (!value) {
      this.functions = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((org.apache.impala.thrift.TStatus)value);
      }
      break;

    case LOOKUP_STATUS:
      if (value == null) {
        unsetLookup_status();
      } else {
        setLookup_status((CatalogLookupStatus)value);
      }
      break;

    case OBJECT_VERSION_NUMBER:
      if (value == null) {
        unsetObject_version_number();
      } else {
        setObject_version_number((Long)value);
      }
      break;

    case TABLE_INFO:
      if (value == null) {
        unsetTable_info();
      } else {
        setTable_info((TPartialTableInfo)value);
      }
      break;

    case DB_INFO:
      if (value == null) {
        unsetDb_info();
      } else {
        setDb_info((TPartialDbInfo)value);
      }
      break;

    case CATALOG_INFO:
      if (value == null) {
        unsetCatalog_info();
      } else {
        setCatalog_info((TPartialCatalogInfo)value);
      }
      break;

    case FUNCTIONS:
      if (value == null) {
        unsetFunctions();
      } else {
        setFunctions((List<org.apache.impala.thrift.TFunction>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case STATUS:
      return getStatus();

    case LOOKUP_STATUS:
      return getLookup_status();

    case OBJECT_VERSION_NUMBER:
      return getObject_version_number();

    case TABLE_INFO:
      return getTable_info();

    case DB_INFO:
      return getDb_info();

    case CATALOG_INFO:
      return getCatalog_info();

    case FUNCTIONS:
      return getFunctions();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case STATUS:
      return isSetStatus();
    case LOOKUP_STATUS:
      return isSetLookup_status();
    case OBJECT_VERSION_NUMBER:
      return isSetObject_version_number();
    case TABLE_INFO:
      return isSetTable_info();
    case DB_INFO:
      return isSetDb_info();
    case CATALOG_INFO:
      return isSetCatalog_info();
    case FUNCTIONS:
      return isSetFunctions();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TGetPartialCatalogObjectResponse)
      return this.equals((TGetPartialCatalogObjectResponse)that);
    return false;
  }

  public boolean equals(TGetPartialCatalogObjectResponse that) {
    if (that == null)
      return false;

    boolean this_present_status = true && this.isSetStatus();
    boolean that_present_status = true && that.isSetStatus();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (!this.status.equals(that.status))
        return false;
    }

    boolean this_present_lookup_status = true && this.isSetLookup_status();
    boolean that_present_lookup_status = true && that.isSetLookup_status();
    if (this_present_lookup_status || that_present_lookup_status) {
      if (!(this_present_lookup_status && that_present_lookup_status))
        return false;
      if (!this.lookup_status.equals(that.lookup_status))
        return false;
    }

    boolean this_present_object_version_number = true && this.isSetObject_version_number();
    boolean that_present_object_version_number = true && that.isSetObject_version_number();
    if (this_present_object_version_number || that_present_object_version_number) {
      if (!(this_present_object_version_number && that_present_object_version_number))
        return false;
      if (this.object_version_number != that.object_version_number)
        return false;
    }

    boolean this_present_table_info = true && this.isSetTable_info();
    boolean that_present_table_info = true && that.isSetTable_info();
    if (this_present_table_info || that_present_table_info) {
      if (!(this_present_table_info && that_present_table_info))
        return false;
      if (!this.table_info.equals(that.table_info))
        return false;
    }

    boolean this_present_db_info = true && this.isSetDb_info();
    boolean that_present_db_info = true && that.isSetDb_info();
    if (this_present_db_info || that_present_db_info) {
      if (!(this_present_db_info && that_present_db_info))
        return false;
      if (!this.db_info.equals(that.db_info))
        return false;
    }

    boolean this_present_catalog_info = true && this.isSetCatalog_info();
    boolean that_present_catalog_info = true && that.isSetCatalog_info();
    if (this_present_catalog_info || that_present_catalog_info) {
      if (!(this_present_catalog_info && that_present_catalog_info))
        return false;
      if (!this.catalog_info.equals(that.catalog_info))
        return false;
    }

    boolean this_present_functions = true && this.isSetFunctions();
    boolean that_present_functions = true && that.isSetFunctions();
    if (this_present_functions || that_present_functions) {
      if (!(this_present_functions && that_present_functions))
        return false;
      if (!this.functions.equals(that.functions))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_status = true && (isSetStatus());
    list.add(present_status);
    if (present_status)
      list.add(status);

    boolean present_lookup_status = true && (isSetLookup_status());
    list.add(present_lookup_status);
    if (present_lookup_status)
      list.add(lookup_status.getValue());

    boolean present_object_version_number = true && (isSetObject_version_number());
    list.add(present_object_version_number);
    if (present_object_version_number)
      list.add(object_version_number);

    boolean present_table_info = true && (isSetTable_info());
    list.add(present_table_info);
    if (present_table_info)
      list.add(table_info);

    boolean present_db_info = true && (isSetDb_info());
    list.add(present_db_info);
    if (present_db_info)
      list.add(db_info);

    boolean present_catalog_info = true && (isSetCatalog_info());
    list.add(present_catalog_info);
    if (present_catalog_info)
      list.add(catalog_info);

    boolean present_functions = true && (isSetFunctions());
    list.add(present_functions);
    if (present_functions)
      list.add(functions);

    return list.hashCode();
  }

  @Override
  public int compareTo(TGetPartialCatalogObjectResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetStatus()).compareTo(other.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, other.status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLookup_status()).compareTo(other.isSetLookup_status());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLookup_status()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lookup_status, other.lookup_status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetObject_version_number()).compareTo(other.isSetObject_version_number());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetObject_version_number()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.object_version_number, other.object_version_number);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTable_info()).compareTo(other.isSetTable_info());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTable_info()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.table_info, other.table_info);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDb_info()).compareTo(other.isSetDb_info());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDb_info()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.db_info, other.db_info);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCatalog_info()).compareTo(other.isSetCatalog_info());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCatalog_info()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.catalog_info, other.catalog_info);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFunctions()).compareTo(other.isSetFunctions());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFunctions()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.functions, other.functions);
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
    StringBuilder sb = new StringBuilder("TGetPartialCatalogObjectResponse(");
    boolean first = true;

    if (isSetStatus()) {
      sb.append("status:");
      if (this.status == null) {
        sb.append("null");
      } else {
        sb.append(this.status);
      }
      first = false;
    }
    if (isSetLookup_status()) {
      if (!first) sb.append(", ");
      sb.append("lookup_status:");
      if (this.lookup_status == null) {
        sb.append("null");
      } else {
        sb.append(this.lookup_status);
      }
      first = false;
    }
    if (isSetObject_version_number()) {
      if (!first) sb.append(", ");
      sb.append("object_version_number:");
      sb.append(this.object_version_number);
      first = false;
    }
    if (isSetTable_info()) {
      if (!first) sb.append(", ");
      sb.append("table_info:");
      if (this.table_info == null) {
        sb.append("null");
      } else {
        sb.append(this.table_info);
      }
      first = false;
    }
    if (isSetDb_info()) {
      if (!first) sb.append(", ");
      sb.append("db_info:");
      if (this.db_info == null) {
        sb.append("null");
      } else {
        sb.append(this.db_info);
      }
      first = false;
    }
    if (isSetCatalog_info()) {
      if (!first) sb.append(", ");
      sb.append("catalog_info:");
      if (this.catalog_info == null) {
        sb.append("null");
      } else {
        sb.append(this.catalog_info);
      }
      first = false;
    }
    if (isSetFunctions()) {
      if (!first) sb.append(", ");
      sb.append("functions:");
      if (this.functions == null) {
        sb.append("null");
      } else {
        sb.append(this.functions);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (status != null) {
      status.validate();
    }
    if (table_info != null) {
      table_info.validate();
    }
    if (db_info != null) {
      db_info.validate();
    }
    if (catalog_info != null) {
      catalog_info.validate();
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

  private static class TGetPartialCatalogObjectResponseStandardSchemeFactory implements SchemeFactory {
    public TGetPartialCatalogObjectResponseStandardScheme getScheme() {
      return new TGetPartialCatalogObjectResponseStandardScheme();
    }
  }

  private static class TGetPartialCatalogObjectResponseStandardScheme extends StandardScheme<TGetPartialCatalogObjectResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TGetPartialCatalogObjectResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.status = new org.apache.impala.thrift.TStatus();
              struct.status.read(iprot);
              struct.setStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // LOOKUP_STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.lookup_status = org.apache.impala.thrift.CatalogLookupStatus.findByValue(iprot.readI32());
              struct.setLookup_statusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // OBJECT_VERSION_NUMBER
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.object_version_number = iprot.readI64();
              struct.setObject_version_numberIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TABLE_INFO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.table_info = new TPartialTableInfo();
              struct.table_info.read(iprot);
              struct.setTable_infoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // DB_INFO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.db_info = new TPartialDbInfo();
              struct.db_info.read(iprot);
              struct.setDb_infoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // CATALOG_INFO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.catalog_info = new TPartialCatalogInfo();
              struct.catalog_info.read(iprot);
              struct.setCatalog_infoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // FUNCTIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list112 = iprot.readListBegin();
                struct.functions = new ArrayList<org.apache.impala.thrift.TFunction>(_list112.size);
                org.apache.impala.thrift.TFunction _elem113;
                for (int _i114 = 0; _i114 < _list112.size; ++_i114)
                {
                  _elem113 = new org.apache.impala.thrift.TFunction();
                  _elem113.read(iprot);
                  struct.functions.add(_elem113);
                }
                iprot.readListEnd();
              }
              struct.setFunctionsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TGetPartialCatalogObjectResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.status != null) {
        if (struct.isSetStatus()) {
          oprot.writeFieldBegin(STATUS_FIELD_DESC);
          struct.status.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.lookup_status != null) {
        if (struct.isSetLookup_status()) {
          oprot.writeFieldBegin(LOOKUP_STATUS_FIELD_DESC);
          oprot.writeI32(struct.lookup_status.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetObject_version_number()) {
        oprot.writeFieldBegin(OBJECT_VERSION_NUMBER_FIELD_DESC);
        oprot.writeI64(struct.object_version_number);
        oprot.writeFieldEnd();
      }
      if (struct.table_info != null) {
        if (struct.isSetTable_info()) {
          oprot.writeFieldBegin(TABLE_INFO_FIELD_DESC);
          struct.table_info.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.db_info != null) {
        if (struct.isSetDb_info()) {
          oprot.writeFieldBegin(DB_INFO_FIELD_DESC);
          struct.db_info.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.catalog_info != null) {
        if (struct.isSetCatalog_info()) {
          oprot.writeFieldBegin(CATALOG_INFO_FIELD_DESC);
          struct.catalog_info.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.functions != null) {
        if (struct.isSetFunctions()) {
          oprot.writeFieldBegin(FUNCTIONS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.functions.size()));
            for (org.apache.impala.thrift.TFunction _iter115 : struct.functions)
            {
              _iter115.write(oprot);
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

  private static class TGetPartialCatalogObjectResponseTupleSchemeFactory implements SchemeFactory {
    public TGetPartialCatalogObjectResponseTupleScheme getScheme() {
      return new TGetPartialCatalogObjectResponseTupleScheme();
    }
  }

  private static class TGetPartialCatalogObjectResponseTupleScheme extends TupleScheme<TGetPartialCatalogObjectResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TGetPartialCatalogObjectResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetStatus()) {
        optionals.set(0);
      }
      if (struct.isSetLookup_status()) {
        optionals.set(1);
      }
      if (struct.isSetObject_version_number()) {
        optionals.set(2);
      }
      if (struct.isSetTable_info()) {
        optionals.set(3);
      }
      if (struct.isSetDb_info()) {
        optionals.set(4);
      }
      if (struct.isSetCatalog_info()) {
        optionals.set(5);
      }
      if (struct.isSetFunctions()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetStatus()) {
        struct.status.write(oprot);
      }
      if (struct.isSetLookup_status()) {
        oprot.writeI32(struct.lookup_status.getValue());
      }
      if (struct.isSetObject_version_number()) {
        oprot.writeI64(struct.object_version_number);
      }
      if (struct.isSetTable_info()) {
        struct.table_info.write(oprot);
      }
      if (struct.isSetDb_info()) {
        struct.db_info.write(oprot);
      }
      if (struct.isSetCatalog_info()) {
        struct.catalog_info.write(oprot);
      }
      if (struct.isSetFunctions()) {
        {
          oprot.writeI32(struct.functions.size());
          for (org.apache.impala.thrift.TFunction _iter116 : struct.functions)
          {
            _iter116.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TGetPartialCatalogObjectResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.status = new org.apache.impala.thrift.TStatus();
        struct.status.read(iprot);
        struct.setStatusIsSet(true);
      }
      if (incoming.get(1)) {
        struct.lookup_status = org.apache.impala.thrift.CatalogLookupStatus.findByValue(iprot.readI32());
        struct.setLookup_statusIsSet(true);
      }
      if (incoming.get(2)) {
        struct.object_version_number = iprot.readI64();
        struct.setObject_version_numberIsSet(true);
      }
      if (incoming.get(3)) {
        struct.table_info = new TPartialTableInfo();
        struct.table_info.read(iprot);
        struct.setTable_infoIsSet(true);
      }
      if (incoming.get(4)) {
        struct.db_info = new TPartialDbInfo();
        struct.db_info.read(iprot);
        struct.setDb_infoIsSet(true);
      }
      if (incoming.get(5)) {
        struct.catalog_info = new TPartialCatalogInfo();
        struct.catalog_info.read(iprot);
        struct.setCatalog_infoIsSet(true);
      }
      if (incoming.get(6)) {
        {
          org.apache.thrift.protocol.TList _list117 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.functions = new ArrayList<org.apache.impala.thrift.TFunction>(_list117.size);
          org.apache.impala.thrift.TFunction _elem118;
          for (int _i119 = 0; _i119 < _list117.size; ++_i119)
          {
            _elem118 = new org.apache.impala.thrift.TFunction();
            _elem118.read(iprot);
            struct.functions.add(_elem118);
          }
        }
        struct.setFunctionsIsSet(true);
      }
    }
  }

}
