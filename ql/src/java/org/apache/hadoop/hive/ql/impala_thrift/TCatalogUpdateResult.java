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
public class TCatalogUpdateResult implements org.apache.thrift.TBase<TCatalogUpdateResult, TCatalogUpdateResult._Fields>, java.io.Serializable, Cloneable, Comparable<TCatalogUpdateResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TCatalogUpdateResult");

  private static final org.apache.thrift.protocol.TField CATALOG_SERVICE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("catalog_service_id", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("version", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField IS_INVALIDATE_FIELD_DESC = new org.apache.thrift.protocol.TField("is_invalidate", org.apache.thrift.protocol.TType.BOOL, (short)4);
  private static final org.apache.thrift.protocol.TField UPDATED_CATALOG_OBJECTS_FIELD_DESC = new org.apache.thrift.protocol.TField("updated_catalog_objects", org.apache.thrift.protocol.TType.LIST, (short)5);
  private static final org.apache.thrift.protocol.TField REMOVED_CATALOG_OBJECTS_FIELD_DESC = new org.apache.thrift.protocol.TField("removed_catalog_objects", org.apache.thrift.protocol.TType.LIST, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TCatalogUpdateResultStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TCatalogUpdateResultTupleSchemeFactory());
  }

  private org.apache.impala.thrift.TUniqueId catalog_service_id; // required
  private long version; // required
  private org.apache.impala.thrift.TStatus status; // required
  private boolean is_invalidate; // required
  private List<org.apache.impala.thrift.TCatalogObject> updated_catalog_objects; // optional
  private List<org.apache.impala.thrift.TCatalogObject> removed_catalog_objects; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CATALOG_SERVICE_ID((short)1, "catalog_service_id"),
    VERSION((short)2, "version"),
    STATUS((short)3, "status"),
    IS_INVALIDATE((short)4, "is_invalidate"),
    UPDATED_CATALOG_OBJECTS((short)5, "updated_catalog_objects"),
    REMOVED_CATALOG_OBJECTS((short)6, "removed_catalog_objects");

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
        case 1: // CATALOG_SERVICE_ID
          return CATALOG_SERVICE_ID;
        case 2: // VERSION
          return VERSION;
        case 3: // STATUS
          return STATUS;
        case 4: // IS_INVALIDATE
          return IS_INVALIDATE;
        case 5: // UPDATED_CATALOG_OBJECTS
          return UPDATED_CATALOG_OBJECTS;
        case 6: // REMOVED_CATALOG_OBJECTS
          return REMOVED_CATALOG_OBJECTS;
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
  private static final int __VERSION_ISSET_ID = 0;
  private static final int __IS_INVALIDATE_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.UPDATED_CATALOG_OBJECTS,_Fields.REMOVED_CATALOG_OBJECTS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CATALOG_SERVICE_ID, new org.apache.thrift.meta_data.FieldMetaData("catalog_service_id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.impala.thrift.TUniqueId.class)));
    tmpMap.put(_Fields.VERSION, new org.apache.thrift.meta_data.FieldMetaData("version", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.impala.thrift.TStatus.class)));
    tmpMap.put(_Fields.IS_INVALIDATE, new org.apache.thrift.meta_data.FieldMetaData("is_invalidate", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.UPDATED_CATALOG_OBJECTS, new org.apache.thrift.meta_data.FieldMetaData("updated_catalog_objects", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.impala.thrift.TCatalogObject.class))));
    tmpMap.put(_Fields.REMOVED_CATALOG_OBJECTS, new org.apache.thrift.meta_data.FieldMetaData("removed_catalog_objects", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.impala.thrift.TCatalogObject.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TCatalogUpdateResult.class, metaDataMap);
  }

  public TCatalogUpdateResult() {
  }

  public TCatalogUpdateResult(
    org.apache.impala.thrift.TUniqueId catalog_service_id,
    long version,
    org.apache.impala.thrift.TStatus status,
    boolean is_invalidate)
  {
    this();
    this.catalog_service_id = catalog_service_id;
    this.version = version;
    setVersionIsSet(true);
    this.status = status;
    this.is_invalidate = is_invalidate;
    setIs_invalidateIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TCatalogUpdateResult(TCatalogUpdateResult other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetCatalog_service_id()) {
      this.catalog_service_id = new org.apache.impala.thrift.TUniqueId(other.catalog_service_id);
    }
    this.version = other.version;
    if (other.isSetStatus()) {
      this.status = new org.apache.impala.thrift.TStatus(other.status);
    }
    this.is_invalidate = other.is_invalidate;
    if (other.isSetUpdated_catalog_objects()) {
      List<org.apache.impala.thrift.TCatalogObject> __this__updated_catalog_objects = new ArrayList<org.apache.impala.thrift.TCatalogObject>(other.updated_catalog_objects.size());
      for (org.apache.impala.thrift.TCatalogObject other_element : other.updated_catalog_objects) {
        __this__updated_catalog_objects.add(new org.apache.impala.thrift.TCatalogObject(other_element));
      }
      this.updated_catalog_objects = __this__updated_catalog_objects;
    }
    if (other.isSetRemoved_catalog_objects()) {
      List<org.apache.impala.thrift.TCatalogObject> __this__removed_catalog_objects = new ArrayList<org.apache.impala.thrift.TCatalogObject>(other.removed_catalog_objects.size());
      for (org.apache.impala.thrift.TCatalogObject other_element : other.removed_catalog_objects) {
        __this__removed_catalog_objects.add(new org.apache.impala.thrift.TCatalogObject(other_element));
      }
      this.removed_catalog_objects = __this__removed_catalog_objects;
    }
  }

  public TCatalogUpdateResult deepCopy() {
    return new TCatalogUpdateResult(this);
  }

  @Override
  public void clear() {
    this.catalog_service_id = null;
    setVersionIsSet(false);
    this.version = 0;
    this.status = null;
    setIs_invalidateIsSet(false);
    this.is_invalidate = false;
    this.updated_catalog_objects = null;
    this.removed_catalog_objects = null;
  }

  public org.apache.impala.thrift.TUniqueId getCatalog_service_id() {
    return this.catalog_service_id;
  }

  public void setCatalog_service_id(org.apache.impala.thrift.TUniqueId catalog_service_id) {
    this.catalog_service_id = catalog_service_id;
  }

  public void unsetCatalog_service_id() {
    this.catalog_service_id = null;
  }

  /** Returns true if field catalog_service_id is set (has been assigned a value) and false otherwise */
  public boolean isSetCatalog_service_id() {
    return this.catalog_service_id != null;
  }

  public void setCatalog_service_idIsSet(boolean value) {
    if (!value) {
      this.catalog_service_id = null;
    }
  }

  public long getVersion() {
    return this.version;
  }

  public void setVersion(long version) {
    this.version = version;
    setVersionIsSet(true);
  }

  public void unsetVersion() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __VERSION_ISSET_ID);
  }

  /** Returns true if field version is set (has been assigned a value) and false otherwise */
  public boolean isSetVersion() {
    return EncodingUtils.testBit(__isset_bitfield, __VERSION_ISSET_ID);
  }

  public void setVersionIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __VERSION_ISSET_ID, value);
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

  public boolean isIs_invalidate() {
    return this.is_invalidate;
  }

  public void setIs_invalidate(boolean is_invalidate) {
    this.is_invalidate = is_invalidate;
    setIs_invalidateIsSet(true);
  }

  public void unsetIs_invalidate() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __IS_INVALIDATE_ISSET_ID);
  }

  /** Returns true if field is_invalidate is set (has been assigned a value) and false otherwise */
  public boolean isSetIs_invalidate() {
    return EncodingUtils.testBit(__isset_bitfield, __IS_INVALIDATE_ISSET_ID);
  }

  public void setIs_invalidateIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __IS_INVALIDATE_ISSET_ID, value);
  }

  public int getUpdated_catalog_objectsSize() {
    return (this.updated_catalog_objects == null) ? 0 : this.updated_catalog_objects.size();
  }

  public java.util.Iterator<org.apache.impala.thrift.TCatalogObject> getUpdated_catalog_objectsIterator() {
    return (this.updated_catalog_objects == null) ? null : this.updated_catalog_objects.iterator();
  }

  public void addToUpdated_catalog_objects(org.apache.impala.thrift.TCatalogObject elem) {
    if (this.updated_catalog_objects == null) {
      this.updated_catalog_objects = new ArrayList<org.apache.impala.thrift.TCatalogObject>();
    }
    this.updated_catalog_objects.add(elem);
  }

  public List<org.apache.impala.thrift.TCatalogObject> getUpdated_catalog_objects() {
    return this.updated_catalog_objects;
  }

  public void setUpdated_catalog_objects(List<org.apache.impala.thrift.TCatalogObject> updated_catalog_objects) {
    this.updated_catalog_objects = updated_catalog_objects;
  }

  public void unsetUpdated_catalog_objects() {
    this.updated_catalog_objects = null;
  }

  /** Returns true if field updated_catalog_objects is set (has been assigned a value) and false otherwise */
  public boolean isSetUpdated_catalog_objects() {
    return this.updated_catalog_objects != null;
  }

  public void setUpdated_catalog_objectsIsSet(boolean value) {
    if (!value) {
      this.updated_catalog_objects = null;
    }
  }

  public int getRemoved_catalog_objectsSize() {
    return (this.removed_catalog_objects == null) ? 0 : this.removed_catalog_objects.size();
  }

  public java.util.Iterator<org.apache.impala.thrift.TCatalogObject> getRemoved_catalog_objectsIterator() {
    return (this.removed_catalog_objects == null) ? null : this.removed_catalog_objects.iterator();
  }

  public void addToRemoved_catalog_objects(org.apache.impala.thrift.TCatalogObject elem) {
    if (this.removed_catalog_objects == null) {
      this.removed_catalog_objects = new ArrayList<org.apache.impala.thrift.TCatalogObject>();
    }
    this.removed_catalog_objects.add(elem);
  }

  public List<org.apache.impala.thrift.TCatalogObject> getRemoved_catalog_objects() {
    return this.removed_catalog_objects;
  }

  public void setRemoved_catalog_objects(List<org.apache.impala.thrift.TCatalogObject> removed_catalog_objects) {
    this.removed_catalog_objects = removed_catalog_objects;
  }

  public void unsetRemoved_catalog_objects() {
    this.removed_catalog_objects = null;
  }

  /** Returns true if field removed_catalog_objects is set (has been assigned a value) and false otherwise */
  public boolean isSetRemoved_catalog_objects() {
    return this.removed_catalog_objects != null;
  }

  public void setRemoved_catalog_objectsIsSet(boolean value) {
    if (!value) {
      this.removed_catalog_objects = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CATALOG_SERVICE_ID:
      if (value == null) {
        unsetCatalog_service_id();
      } else {
        setCatalog_service_id((org.apache.impala.thrift.TUniqueId)value);
      }
      break;

    case VERSION:
      if (value == null) {
        unsetVersion();
      } else {
        setVersion((Long)value);
      }
      break;

    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((org.apache.impala.thrift.TStatus)value);
      }
      break;

    case IS_INVALIDATE:
      if (value == null) {
        unsetIs_invalidate();
      } else {
        setIs_invalidate((Boolean)value);
      }
      break;

    case UPDATED_CATALOG_OBJECTS:
      if (value == null) {
        unsetUpdated_catalog_objects();
      } else {
        setUpdated_catalog_objects((List<org.apache.impala.thrift.TCatalogObject>)value);
      }
      break;

    case REMOVED_CATALOG_OBJECTS:
      if (value == null) {
        unsetRemoved_catalog_objects();
      } else {
        setRemoved_catalog_objects((List<org.apache.impala.thrift.TCatalogObject>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CATALOG_SERVICE_ID:
      return getCatalog_service_id();

    case VERSION:
      return getVersion();

    case STATUS:
      return getStatus();

    case IS_INVALIDATE:
      return isIs_invalidate();

    case UPDATED_CATALOG_OBJECTS:
      return getUpdated_catalog_objects();

    case REMOVED_CATALOG_OBJECTS:
      return getRemoved_catalog_objects();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CATALOG_SERVICE_ID:
      return isSetCatalog_service_id();
    case VERSION:
      return isSetVersion();
    case STATUS:
      return isSetStatus();
    case IS_INVALIDATE:
      return isSetIs_invalidate();
    case UPDATED_CATALOG_OBJECTS:
      return isSetUpdated_catalog_objects();
    case REMOVED_CATALOG_OBJECTS:
      return isSetRemoved_catalog_objects();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TCatalogUpdateResult)
      return this.equals((TCatalogUpdateResult)that);
    return false;
  }

  public boolean equals(TCatalogUpdateResult that) {
    if (that == null)
      return false;

    boolean this_present_catalog_service_id = true && this.isSetCatalog_service_id();
    boolean that_present_catalog_service_id = true && that.isSetCatalog_service_id();
    if (this_present_catalog_service_id || that_present_catalog_service_id) {
      if (!(this_present_catalog_service_id && that_present_catalog_service_id))
        return false;
      if (!this.catalog_service_id.equals(that.catalog_service_id))
        return false;
    }

    boolean this_present_version = true;
    boolean that_present_version = true;
    if (this_present_version || that_present_version) {
      if (!(this_present_version && that_present_version))
        return false;
      if (this.version != that.version)
        return false;
    }

    boolean this_present_status = true && this.isSetStatus();
    boolean that_present_status = true && that.isSetStatus();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (!this.status.equals(that.status))
        return false;
    }

    boolean this_present_is_invalidate = true;
    boolean that_present_is_invalidate = true;
    if (this_present_is_invalidate || that_present_is_invalidate) {
      if (!(this_present_is_invalidate && that_present_is_invalidate))
        return false;
      if (this.is_invalidate != that.is_invalidate)
        return false;
    }

    boolean this_present_updated_catalog_objects = true && this.isSetUpdated_catalog_objects();
    boolean that_present_updated_catalog_objects = true && that.isSetUpdated_catalog_objects();
    if (this_present_updated_catalog_objects || that_present_updated_catalog_objects) {
      if (!(this_present_updated_catalog_objects && that_present_updated_catalog_objects))
        return false;
      if (!this.updated_catalog_objects.equals(that.updated_catalog_objects))
        return false;
    }

    boolean this_present_removed_catalog_objects = true && this.isSetRemoved_catalog_objects();
    boolean that_present_removed_catalog_objects = true && that.isSetRemoved_catalog_objects();
    if (this_present_removed_catalog_objects || that_present_removed_catalog_objects) {
      if (!(this_present_removed_catalog_objects && that_present_removed_catalog_objects))
        return false;
      if (!this.removed_catalog_objects.equals(that.removed_catalog_objects))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_catalog_service_id = true && (isSetCatalog_service_id());
    list.add(present_catalog_service_id);
    if (present_catalog_service_id)
      list.add(catalog_service_id);

    boolean present_version = true;
    list.add(present_version);
    if (present_version)
      list.add(version);

    boolean present_status = true && (isSetStatus());
    list.add(present_status);
    if (present_status)
      list.add(status);

    boolean present_is_invalidate = true;
    list.add(present_is_invalidate);
    if (present_is_invalidate)
      list.add(is_invalidate);

    boolean present_updated_catalog_objects = true && (isSetUpdated_catalog_objects());
    list.add(present_updated_catalog_objects);
    if (present_updated_catalog_objects)
      list.add(updated_catalog_objects);

    boolean present_removed_catalog_objects = true && (isSetRemoved_catalog_objects());
    list.add(present_removed_catalog_objects);
    if (present_removed_catalog_objects)
      list.add(removed_catalog_objects);

    return list.hashCode();
  }

  @Override
  public int compareTo(TCatalogUpdateResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetCatalog_service_id()).compareTo(other.isSetCatalog_service_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCatalog_service_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.catalog_service_id, other.catalog_service_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetVersion()).compareTo(other.isSetVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVersion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.version, other.version);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
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
    lastComparison = Boolean.valueOf(isSetIs_invalidate()).compareTo(other.isSetIs_invalidate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIs_invalidate()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.is_invalidate, other.is_invalidate);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUpdated_catalog_objects()).compareTo(other.isSetUpdated_catalog_objects());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUpdated_catalog_objects()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.updated_catalog_objects, other.updated_catalog_objects);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRemoved_catalog_objects()).compareTo(other.isSetRemoved_catalog_objects());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRemoved_catalog_objects()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.removed_catalog_objects, other.removed_catalog_objects);
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
    StringBuilder sb = new StringBuilder("TCatalogUpdateResult(");
    boolean first = true;

    sb.append("catalog_service_id:");
    if (this.catalog_service_id == null) {
      sb.append("null");
    } else {
      sb.append(this.catalog_service_id);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("version:");
    sb.append(this.version);
    first = false;
    if (!first) sb.append(", ");
    sb.append("status:");
    if (this.status == null) {
      sb.append("null");
    } else {
      sb.append(this.status);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("is_invalidate:");
    sb.append(this.is_invalidate);
    first = false;
    if (isSetUpdated_catalog_objects()) {
      if (!first) sb.append(", ");
      sb.append("updated_catalog_objects:");
      if (this.updated_catalog_objects == null) {
        sb.append("null");
      } else {
        sb.append(this.updated_catalog_objects);
      }
      first = false;
    }
    if (isSetRemoved_catalog_objects()) {
      if (!first) sb.append(", ");
      sb.append("removed_catalog_objects:");
      if (this.removed_catalog_objects == null) {
        sb.append("null");
      } else {
        sb.append(this.removed_catalog_objects);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetCatalog_service_id()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'catalog_service_id' is unset! Struct:" + toString());
    }

    if (!isSetVersion()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'version' is unset! Struct:" + toString());
    }

    if (!isSetStatus()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'status' is unset! Struct:" + toString());
    }

    if (!isSetIs_invalidate()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'is_invalidate' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
    if (catalog_service_id != null) {
      catalog_service_id.validate();
    }
    if (status != null) {
      status.validate();
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

  private static class TCatalogUpdateResultStandardSchemeFactory implements SchemeFactory {
    public TCatalogUpdateResultStandardScheme getScheme() {
      return new TCatalogUpdateResultStandardScheme();
    }
  }

  private static class TCatalogUpdateResultStandardScheme extends StandardScheme<TCatalogUpdateResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TCatalogUpdateResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CATALOG_SERVICE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.catalog_service_id = new org.apache.impala.thrift.TUniqueId();
              struct.catalog_service_id.read(iprot);
              struct.setCatalog_service_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.version = iprot.readI64();
              struct.setVersionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.status = new org.apache.impala.thrift.TStatus();
              struct.status.read(iprot);
              struct.setStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // IS_INVALIDATE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.is_invalidate = iprot.readBool();
              struct.setIs_invalidateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // UPDATED_CATALOG_OBJECTS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.updated_catalog_objects = new ArrayList<org.apache.impala.thrift.TCatalogObject>(_list0.size);
                org.apache.impala.thrift.TCatalogObject _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = new org.apache.impala.thrift.TCatalogObject();
                  _elem1.read(iprot);
                  struct.updated_catalog_objects.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setUpdated_catalog_objectsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // REMOVED_CATALOG_OBJECTS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list3 = iprot.readListBegin();
                struct.removed_catalog_objects = new ArrayList<org.apache.impala.thrift.TCatalogObject>(_list3.size);
                org.apache.impala.thrift.TCatalogObject _elem4;
                for (int _i5 = 0; _i5 < _list3.size; ++_i5)
                {
                  _elem4 = new org.apache.impala.thrift.TCatalogObject();
                  _elem4.read(iprot);
                  struct.removed_catalog_objects.add(_elem4);
                }
                iprot.readListEnd();
              }
              struct.setRemoved_catalog_objectsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TCatalogUpdateResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.catalog_service_id != null) {
        oprot.writeFieldBegin(CATALOG_SERVICE_ID_FIELD_DESC);
        struct.catalog_service_id.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(VERSION_FIELD_DESC);
      oprot.writeI64(struct.version);
      oprot.writeFieldEnd();
      if (struct.status != null) {
        oprot.writeFieldBegin(STATUS_FIELD_DESC);
        struct.status.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(IS_INVALIDATE_FIELD_DESC);
      oprot.writeBool(struct.is_invalidate);
      oprot.writeFieldEnd();
      if (struct.updated_catalog_objects != null) {
        if (struct.isSetUpdated_catalog_objects()) {
          oprot.writeFieldBegin(UPDATED_CATALOG_OBJECTS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.updated_catalog_objects.size()));
            for (org.apache.impala.thrift.TCatalogObject _iter6 : struct.updated_catalog_objects)
            {
              _iter6.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.removed_catalog_objects != null) {
        if (struct.isSetRemoved_catalog_objects()) {
          oprot.writeFieldBegin(REMOVED_CATALOG_OBJECTS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.removed_catalog_objects.size()));
            for (org.apache.impala.thrift.TCatalogObject _iter7 : struct.removed_catalog_objects)
            {
              _iter7.write(oprot);
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

  private static class TCatalogUpdateResultTupleSchemeFactory implements SchemeFactory {
    public TCatalogUpdateResultTupleScheme getScheme() {
      return new TCatalogUpdateResultTupleScheme();
    }
  }

  private static class TCatalogUpdateResultTupleScheme extends TupleScheme<TCatalogUpdateResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TCatalogUpdateResult struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.catalog_service_id.write(oprot);
      oprot.writeI64(struct.version);
      struct.status.write(oprot);
      oprot.writeBool(struct.is_invalidate);
      BitSet optionals = new BitSet();
      if (struct.isSetUpdated_catalog_objects()) {
        optionals.set(0);
      }
      if (struct.isSetRemoved_catalog_objects()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetUpdated_catalog_objects()) {
        {
          oprot.writeI32(struct.updated_catalog_objects.size());
          for (org.apache.impala.thrift.TCatalogObject _iter8 : struct.updated_catalog_objects)
          {
            _iter8.write(oprot);
          }
        }
      }
      if (struct.isSetRemoved_catalog_objects()) {
        {
          oprot.writeI32(struct.removed_catalog_objects.size());
          for (org.apache.impala.thrift.TCatalogObject _iter9 : struct.removed_catalog_objects)
          {
            _iter9.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TCatalogUpdateResult struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.catalog_service_id = new org.apache.impala.thrift.TUniqueId();
      struct.catalog_service_id.read(iprot);
      struct.setCatalog_service_idIsSet(true);
      struct.version = iprot.readI64();
      struct.setVersionIsSet(true);
      struct.status = new org.apache.impala.thrift.TStatus();
      struct.status.read(iprot);
      struct.setStatusIsSet(true);
      struct.is_invalidate = iprot.readBool();
      struct.setIs_invalidateIsSet(true);
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list10 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.updated_catalog_objects = new ArrayList<org.apache.impala.thrift.TCatalogObject>(_list10.size);
          org.apache.impala.thrift.TCatalogObject _elem11;
          for (int _i12 = 0; _i12 < _list10.size; ++_i12)
          {
            _elem11 = new org.apache.impala.thrift.TCatalogObject();
            _elem11.read(iprot);
            struct.updated_catalog_objects.add(_elem11);
          }
        }
        struct.setUpdated_catalog_objectsIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list13 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.removed_catalog_objects = new ArrayList<org.apache.impala.thrift.TCatalogObject>(_list13.size);
          org.apache.impala.thrift.TCatalogObject _elem14;
          for (int _i15 = 0; _i15 < _list13.size; ++_i15)
          {
            _elem14 = new org.apache.impala.thrift.TCatalogObject();
            _elem14.read(iprot);
            struct.removed_catalog_objects.add(_elem14);
          }
        }
        struct.setRemoved_catalog_objectsIsSet(true);
      }
    }
  }

}

