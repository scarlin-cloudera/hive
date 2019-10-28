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
public class TUpdateCatalogCacheRequest implements org.apache.thrift.TBase<TUpdateCatalogCacheRequest, TUpdateCatalogCacheRequest._Fields>, java.io.Serializable, Cloneable, Comparable<TUpdateCatalogCacheRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TUpdateCatalogCacheRequest");

  private static final org.apache.thrift.protocol.TField IS_DELTA_FIELD_DESC = new org.apache.thrift.protocol.TField("is_delta", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField CATALOG_SERVICE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("catalog_service_id", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField UPDATED_OBJECTS_DEPRECATED_FIELD_DESC = new org.apache.thrift.protocol.TField("updated_objects_deprecated", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField REMOVED_OBJECTS_DEPRECATED_FIELD_DESC = new org.apache.thrift.protocol.TField("removed_objects_deprecated", org.apache.thrift.protocol.TType.LIST, (short)4);
  private static final org.apache.thrift.protocol.TField NATIVE_ITERATOR_PTR_FIELD_DESC = new org.apache.thrift.protocol.TField("native_iterator_ptr", org.apache.thrift.protocol.TType.I64, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TUpdateCatalogCacheRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TUpdateCatalogCacheRequestTupleSchemeFactory());
  }

  private boolean is_delta; // required
  private org.apache.impala.thrift.TUniqueId catalog_service_id; // optional
  private List<org.apache.impala.thrift.TCatalogObject> updated_objects_deprecated; // optional
  private List<org.apache.impala.thrift.TCatalogObject> removed_objects_deprecated; // optional
  private long native_iterator_ptr; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    IS_DELTA((short)1, "is_delta"),
    CATALOG_SERVICE_ID((short)2, "catalog_service_id"),
    UPDATED_OBJECTS_DEPRECATED((short)3, "updated_objects_deprecated"),
    REMOVED_OBJECTS_DEPRECATED((short)4, "removed_objects_deprecated"),
    NATIVE_ITERATOR_PTR((short)5, "native_iterator_ptr");

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
        case 1: // IS_DELTA
          return IS_DELTA;
        case 2: // CATALOG_SERVICE_ID
          return CATALOG_SERVICE_ID;
        case 3: // UPDATED_OBJECTS_DEPRECATED
          return UPDATED_OBJECTS_DEPRECATED;
        case 4: // REMOVED_OBJECTS_DEPRECATED
          return REMOVED_OBJECTS_DEPRECATED;
        case 5: // NATIVE_ITERATOR_PTR
          return NATIVE_ITERATOR_PTR;
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
  private static final int __IS_DELTA_ISSET_ID = 0;
  private static final int __NATIVE_ITERATOR_PTR_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.CATALOG_SERVICE_ID,_Fields.UPDATED_OBJECTS_DEPRECATED,_Fields.REMOVED_OBJECTS_DEPRECATED};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.IS_DELTA, new org.apache.thrift.meta_data.FieldMetaData("is_delta", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.CATALOG_SERVICE_ID, new org.apache.thrift.meta_data.FieldMetaData("catalog_service_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.impala.thrift.TUniqueId.class)));
    tmpMap.put(_Fields.UPDATED_OBJECTS_DEPRECATED, new org.apache.thrift.meta_data.FieldMetaData("updated_objects_deprecated", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.impala.thrift.TCatalogObject.class))));
    tmpMap.put(_Fields.REMOVED_OBJECTS_DEPRECATED, new org.apache.thrift.meta_data.FieldMetaData("removed_objects_deprecated", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.impala.thrift.TCatalogObject.class))));
    tmpMap.put(_Fields.NATIVE_ITERATOR_PTR, new org.apache.thrift.meta_data.FieldMetaData("native_iterator_ptr", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TUpdateCatalogCacheRequest.class, metaDataMap);
  }

  public TUpdateCatalogCacheRequest() {
  }

  public TUpdateCatalogCacheRequest(
    boolean is_delta,
    long native_iterator_ptr)
  {
    this();
    this.is_delta = is_delta;
    setIs_deltaIsSet(true);
    this.native_iterator_ptr = native_iterator_ptr;
    setNative_iterator_ptrIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TUpdateCatalogCacheRequest(TUpdateCatalogCacheRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    this.is_delta = other.is_delta;
    if (other.isSetCatalog_service_id()) {
      this.catalog_service_id = new org.apache.impala.thrift.TUniqueId(other.catalog_service_id);
    }
    if (other.isSetUpdated_objects_deprecated()) {
      List<org.apache.impala.thrift.TCatalogObject> __this__updated_objects_deprecated = new ArrayList<org.apache.impala.thrift.TCatalogObject>(other.updated_objects_deprecated.size());
      for (org.apache.impala.thrift.TCatalogObject other_element : other.updated_objects_deprecated) {
        __this__updated_objects_deprecated.add(new org.apache.impala.thrift.TCatalogObject(other_element));
      }
      this.updated_objects_deprecated = __this__updated_objects_deprecated;
    }
    if (other.isSetRemoved_objects_deprecated()) {
      List<org.apache.impala.thrift.TCatalogObject> __this__removed_objects_deprecated = new ArrayList<org.apache.impala.thrift.TCatalogObject>(other.removed_objects_deprecated.size());
      for (org.apache.impala.thrift.TCatalogObject other_element : other.removed_objects_deprecated) {
        __this__removed_objects_deprecated.add(new org.apache.impala.thrift.TCatalogObject(other_element));
      }
      this.removed_objects_deprecated = __this__removed_objects_deprecated;
    }
    this.native_iterator_ptr = other.native_iterator_ptr;
  }

  public TUpdateCatalogCacheRequest deepCopy() {
    return new TUpdateCatalogCacheRequest(this);
  }

  @Override
  public void clear() {
    setIs_deltaIsSet(false);
    this.is_delta = false;
    this.catalog_service_id = null;
    this.updated_objects_deprecated = null;
    this.removed_objects_deprecated = null;
    setNative_iterator_ptrIsSet(false);
    this.native_iterator_ptr = 0;
  }

  public boolean isIs_delta() {
    return this.is_delta;
  }

  public void setIs_delta(boolean is_delta) {
    this.is_delta = is_delta;
    setIs_deltaIsSet(true);
  }

  public void unsetIs_delta() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __IS_DELTA_ISSET_ID);
  }

  /** Returns true if field is_delta is set (has been assigned a value) and false otherwise */
  public boolean isSetIs_delta() {
    return EncodingUtils.testBit(__isset_bitfield, __IS_DELTA_ISSET_ID);
  }

  public void setIs_deltaIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __IS_DELTA_ISSET_ID, value);
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

  public int getUpdated_objects_deprecatedSize() {
    return (this.updated_objects_deprecated == null) ? 0 : this.updated_objects_deprecated.size();
  }

  public java.util.Iterator<org.apache.impala.thrift.TCatalogObject> getUpdated_objects_deprecatedIterator() {
    return (this.updated_objects_deprecated == null) ? null : this.updated_objects_deprecated.iterator();
  }

  public void addToUpdated_objects_deprecated(org.apache.impala.thrift.TCatalogObject elem) {
    if (this.updated_objects_deprecated == null) {
      this.updated_objects_deprecated = new ArrayList<org.apache.impala.thrift.TCatalogObject>();
    }
    this.updated_objects_deprecated.add(elem);
  }

  public List<org.apache.impala.thrift.TCatalogObject> getUpdated_objects_deprecated() {
    return this.updated_objects_deprecated;
  }

  public void setUpdated_objects_deprecated(List<org.apache.impala.thrift.TCatalogObject> updated_objects_deprecated) {
    this.updated_objects_deprecated = updated_objects_deprecated;
  }

  public void unsetUpdated_objects_deprecated() {
    this.updated_objects_deprecated = null;
  }

  /** Returns true if field updated_objects_deprecated is set (has been assigned a value) and false otherwise */
  public boolean isSetUpdated_objects_deprecated() {
    return this.updated_objects_deprecated != null;
  }

  public void setUpdated_objects_deprecatedIsSet(boolean value) {
    if (!value) {
      this.updated_objects_deprecated = null;
    }
  }

  public int getRemoved_objects_deprecatedSize() {
    return (this.removed_objects_deprecated == null) ? 0 : this.removed_objects_deprecated.size();
  }

  public java.util.Iterator<org.apache.impala.thrift.TCatalogObject> getRemoved_objects_deprecatedIterator() {
    return (this.removed_objects_deprecated == null) ? null : this.removed_objects_deprecated.iterator();
  }

  public void addToRemoved_objects_deprecated(org.apache.impala.thrift.TCatalogObject elem) {
    if (this.removed_objects_deprecated == null) {
      this.removed_objects_deprecated = new ArrayList<org.apache.impala.thrift.TCatalogObject>();
    }
    this.removed_objects_deprecated.add(elem);
  }

  public List<org.apache.impala.thrift.TCatalogObject> getRemoved_objects_deprecated() {
    return this.removed_objects_deprecated;
  }

  public void setRemoved_objects_deprecated(List<org.apache.impala.thrift.TCatalogObject> removed_objects_deprecated) {
    this.removed_objects_deprecated = removed_objects_deprecated;
  }

  public void unsetRemoved_objects_deprecated() {
    this.removed_objects_deprecated = null;
  }

  /** Returns true if field removed_objects_deprecated is set (has been assigned a value) and false otherwise */
  public boolean isSetRemoved_objects_deprecated() {
    return this.removed_objects_deprecated != null;
  }

  public void setRemoved_objects_deprecatedIsSet(boolean value) {
    if (!value) {
      this.removed_objects_deprecated = null;
    }
  }

  public long getNative_iterator_ptr() {
    return this.native_iterator_ptr;
  }

  public void setNative_iterator_ptr(long native_iterator_ptr) {
    this.native_iterator_ptr = native_iterator_ptr;
    setNative_iterator_ptrIsSet(true);
  }

  public void unsetNative_iterator_ptr() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __NATIVE_ITERATOR_PTR_ISSET_ID);
  }

  /** Returns true if field native_iterator_ptr is set (has been assigned a value) and false otherwise */
  public boolean isSetNative_iterator_ptr() {
    return EncodingUtils.testBit(__isset_bitfield, __NATIVE_ITERATOR_PTR_ISSET_ID);
  }

  public void setNative_iterator_ptrIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __NATIVE_ITERATOR_PTR_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case IS_DELTA:
      if (value == null) {
        unsetIs_delta();
      } else {
        setIs_delta((Boolean)value);
      }
      break;

    case CATALOG_SERVICE_ID:
      if (value == null) {
        unsetCatalog_service_id();
      } else {
        setCatalog_service_id((org.apache.impala.thrift.TUniqueId)value);
      }
      break;

    case UPDATED_OBJECTS_DEPRECATED:
      if (value == null) {
        unsetUpdated_objects_deprecated();
      } else {
        setUpdated_objects_deprecated((List<org.apache.impala.thrift.TCatalogObject>)value);
      }
      break;

    case REMOVED_OBJECTS_DEPRECATED:
      if (value == null) {
        unsetRemoved_objects_deprecated();
      } else {
        setRemoved_objects_deprecated((List<org.apache.impala.thrift.TCatalogObject>)value);
      }
      break;

    case NATIVE_ITERATOR_PTR:
      if (value == null) {
        unsetNative_iterator_ptr();
      } else {
        setNative_iterator_ptr((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case IS_DELTA:
      return isIs_delta();

    case CATALOG_SERVICE_ID:
      return getCatalog_service_id();

    case UPDATED_OBJECTS_DEPRECATED:
      return getUpdated_objects_deprecated();

    case REMOVED_OBJECTS_DEPRECATED:
      return getRemoved_objects_deprecated();

    case NATIVE_ITERATOR_PTR:
      return getNative_iterator_ptr();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case IS_DELTA:
      return isSetIs_delta();
    case CATALOG_SERVICE_ID:
      return isSetCatalog_service_id();
    case UPDATED_OBJECTS_DEPRECATED:
      return isSetUpdated_objects_deprecated();
    case REMOVED_OBJECTS_DEPRECATED:
      return isSetRemoved_objects_deprecated();
    case NATIVE_ITERATOR_PTR:
      return isSetNative_iterator_ptr();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TUpdateCatalogCacheRequest)
      return this.equals((TUpdateCatalogCacheRequest)that);
    return false;
  }

  public boolean equals(TUpdateCatalogCacheRequest that) {
    if (that == null)
      return false;

    boolean this_present_is_delta = true;
    boolean that_present_is_delta = true;
    if (this_present_is_delta || that_present_is_delta) {
      if (!(this_present_is_delta && that_present_is_delta))
        return false;
      if (this.is_delta != that.is_delta)
        return false;
    }

    boolean this_present_catalog_service_id = true && this.isSetCatalog_service_id();
    boolean that_present_catalog_service_id = true && that.isSetCatalog_service_id();
    if (this_present_catalog_service_id || that_present_catalog_service_id) {
      if (!(this_present_catalog_service_id && that_present_catalog_service_id))
        return false;
      if (!this.catalog_service_id.equals(that.catalog_service_id))
        return false;
    }

    boolean this_present_updated_objects_deprecated = true && this.isSetUpdated_objects_deprecated();
    boolean that_present_updated_objects_deprecated = true && that.isSetUpdated_objects_deprecated();
    if (this_present_updated_objects_deprecated || that_present_updated_objects_deprecated) {
      if (!(this_present_updated_objects_deprecated && that_present_updated_objects_deprecated))
        return false;
      if (!this.updated_objects_deprecated.equals(that.updated_objects_deprecated))
        return false;
    }

    boolean this_present_removed_objects_deprecated = true && this.isSetRemoved_objects_deprecated();
    boolean that_present_removed_objects_deprecated = true && that.isSetRemoved_objects_deprecated();
    if (this_present_removed_objects_deprecated || that_present_removed_objects_deprecated) {
      if (!(this_present_removed_objects_deprecated && that_present_removed_objects_deprecated))
        return false;
      if (!this.removed_objects_deprecated.equals(that.removed_objects_deprecated))
        return false;
    }

    boolean this_present_native_iterator_ptr = true;
    boolean that_present_native_iterator_ptr = true;
    if (this_present_native_iterator_ptr || that_present_native_iterator_ptr) {
      if (!(this_present_native_iterator_ptr && that_present_native_iterator_ptr))
        return false;
      if (this.native_iterator_ptr != that.native_iterator_ptr)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_is_delta = true;
    list.add(present_is_delta);
    if (present_is_delta)
      list.add(is_delta);

    boolean present_catalog_service_id = true && (isSetCatalog_service_id());
    list.add(present_catalog_service_id);
    if (present_catalog_service_id)
      list.add(catalog_service_id);

    boolean present_updated_objects_deprecated = true && (isSetUpdated_objects_deprecated());
    list.add(present_updated_objects_deprecated);
    if (present_updated_objects_deprecated)
      list.add(updated_objects_deprecated);

    boolean present_removed_objects_deprecated = true && (isSetRemoved_objects_deprecated());
    list.add(present_removed_objects_deprecated);
    if (present_removed_objects_deprecated)
      list.add(removed_objects_deprecated);

    boolean present_native_iterator_ptr = true;
    list.add(present_native_iterator_ptr);
    if (present_native_iterator_ptr)
      list.add(native_iterator_ptr);

    return list.hashCode();
  }

  @Override
  public int compareTo(TUpdateCatalogCacheRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetIs_delta()).compareTo(other.isSetIs_delta());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIs_delta()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.is_delta, other.is_delta);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
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
    lastComparison = Boolean.valueOf(isSetUpdated_objects_deprecated()).compareTo(other.isSetUpdated_objects_deprecated());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUpdated_objects_deprecated()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.updated_objects_deprecated, other.updated_objects_deprecated);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRemoved_objects_deprecated()).compareTo(other.isSetRemoved_objects_deprecated());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRemoved_objects_deprecated()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.removed_objects_deprecated, other.removed_objects_deprecated);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNative_iterator_ptr()).compareTo(other.isSetNative_iterator_ptr());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNative_iterator_ptr()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.native_iterator_ptr, other.native_iterator_ptr);
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
    StringBuilder sb = new StringBuilder("TUpdateCatalogCacheRequest(");
    boolean first = true;

    sb.append("is_delta:");
    sb.append(this.is_delta);
    first = false;
    if (isSetCatalog_service_id()) {
      if (!first) sb.append(", ");
      sb.append("catalog_service_id:");
      if (this.catalog_service_id == null) {
        sb.append("null");
      } else {
        sb.append(this.catalog_service_id);
      }
      first = false;
    }
    if (isSetUpdated_objects_deprecated()) {
      if (!first) sb.append(", ");
      sb.append("updated_objects_deprecated:");
      if (this.updated_objects_deprecated == null) {
        sb.append("null");
      } else {
        sb.append(this.updated_objects_deprecated);
      }
      first = false;
    }
    if (isSetRemoved_objects_deprecated()) {
      if (!first) sb.append(", ");
      sb.append("removed_objects_deprecated:");
      if (this.removed_objects_deprecated == null) {
        sb.append("null");
      } else {
        sb.append(this.removed_objects_deprecated);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("native_iterator_ptr:");
    sb.append(this.native_iterator_ptr);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetIs_delta()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'is_delta' is unset! Struct:" + toString());
    }

    if (!isSetNative_iterator_ptr()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'native_iterator_ptr' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
    if (catalog_service_id != null) {
      catalog_service_id.validate();
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

  private static class TUpdateCatalogCacheRequestStandardSchemeFactory implements SchemeFactory {
    public TUpdateCatalogCacheRequestStandardScheme getScheme() {
      return new TUpdateCatalogCacheRequestStandardScheme();
    }
  }

  private static class TUpdateCatalogCacheRequestStandardScheme extends StandardScheme<TUpdateCatalogCacheRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TUpdateCatalogCacheRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // IS_DELTA
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.is_delta = iprot.readBool();
              struct.setIs_deltaIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CATALOG_SERVICE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.catalog_service_id = new org.apache.impala.thrift.TUniqueId();
              struct.catalog_service_id.read(iprot);
              struct.setCatalog_service_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // UPDATED_OBJECTS_DEPRECATED
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list194 = iprot.readListBegin();
                struct.updated_objects_deprecated = new ArrayList<org.apache.impala.thrift.TCatalogObject>(_list194.size);
                org.apache.impala.thrift.TCatalogObject _elem195;
                for (int _i196 = 0; _i196 < _list194.size; ++_i196)
                {
                  _elem195 = new org.apache.impala.thrift.TCatalogObject();
                  _elem195.read(iprot);
                  struct.updated_objects_deprecated.add(_elem195);
                }
                iprot.readListEnd();
              }
              struct.setUpdated_objects_deprecatedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // REMOVED_OBJECTS_DEPRECATED
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list197 = iprot.readListBegin();
                struct.removed_objects_deprecated = new ArrayList<org.apache.impala.thrift.TCatalogObject>(_list197.size);
                org.apache.impala.thrift.TCatalogObject _elem198;
                for (int _i199 = 0; _i199 < _list197.size; ++_i199)
                {
                  _elem198 = new org.apache.impala.thrift.TCatalogObject();
                  _elem198.read(iprot);
                  struct.removed_objects_deprecated.add(_elem198);
                }
                iprot.readListEnd();
              }
              struct.setRemoved_objects_deprecatedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // NATIVE_ITERATOR_PTR
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.native_iterator_ptr = iprot.readI64();
              struct.setNative_iterator_ptrIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TUpdateCatalogCacheRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(IS_DELTA_FIELD_DESC);
      oprot.writeBool(struct.is_delta);
      oprot.writeFieldEnd();
      if (struct.catalog_service_id != null) {
        if (struct.isSetCatalog_service_id()) {
          oprot.writeFieldBegin(CATALOG_SERVICE_ID_FIELD_DESC);
          struct.catalog_service_id.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.updated_objects_deprecated != null) {
        if (struct.isSetUpdated_objects_deprecated()) {
          oprot.writeFieldBegin(UPDATED_OBJECTS_DEPRECATED_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.updated_objects_deprecated.size()));
            for (org.apache.impala.thrift.TCatalogObject _iter200 : struct.updated_objects_deprecated)
            {
              _iter200.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.removed_objects_deprecated != null) {
        if (struct.isSetRemoved_objects_deprecated()) {
          oprot.writeFieldBegin(REMOVED_OBJECTS_DEPRECATED_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.removed_objects_deprecated.size()));
            for (org.apache.impala.thrift.TCatalogObject _iter201 : struct.removed_objects_deprecated)
            {
              _iter201.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldBegin(NATIVE_ITERATOR_PTR_FIELD_DESC);
      oprot.writeI64(struct.native_iterator_ptr);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TUpdateCatalogCacheRequestTupleSchemeFactory implements SchemeFactory {
    public TUpdateCatalogCacheRequestTupleScheme getScheme() {
      return new TUpdateCatalogCacheRequestTupleScheme();
    }
  }

  private static class TUpdateCatalogCacheRequestTupleScheme extends TupleScheme<TUpdateCatalogCacheRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TUpdateCatalogCacheRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeBool(struct.is_delta);
      oprot.writeI64(struct.native_iterator_ptr);
      BitSet optionals = new BitSet();
      if (struct.isSetCatalog_service_id()) {
        optionals.set(0);
      }
      if (struct.isSetUpdated_objects_deprecated()) {
        optionals.set(1);
      }
      if (struct.isSetRemoved_objects_deprecated()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetCatalog_service_id()) {
        struct.catalog_service_id.write(oprot);
      }
      if (struct.isSetUpdated_objects_deprecated()) {
        {
          oprot.writeI32(struct.updated_objects_deprecated.size());
          for (org.apache.impala.thrift.TCatalogObject _iter202 : struct.updated_objects_deprecated)
          {
            _iter202.write(oprot);
          }
        }
      }
      if (struct.isSetRemoved_objects_deprecated()) {
        {
          oprot.writeI32(struct.removed_objects_deprecated.size());
          for (org.apache.impala.thrift.TCatalogObject _iter203 : struct.removed_objects_deprecated)
          {
            _iter203.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TUpdateCatalogCacheRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.is_delta = iprot.readBool();
      struct.setIs_deltaIsSet(true);
      struct.native_iterator_ptr = iprot.readI64();
      struct.setNative_iterator_ptrIsSet(true);
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.catalog_service_id = new org.apache.impala.thrift.TUniqueId();
        struct.catalog_service_id.read(iprot);
        struct.setCatalog_service_idIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list204 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.updated_objects_deprecated = new ArrayList<org.apache.impala.thrift.TCatalogObject>(_list204.size);
          org.apache.impala.thrift.TCatalogObject _elem205;
          for (int _i206 = 0; _i206 < _list204.size; ++_i206)
          {
            _elem205 = new org.apache.impala.thrift.TCatalogObject();
            _elem205.read(iprot);
            struct.updated_objects_deprecated.add(_elem205);
          }
        }
        struct.setUpdated_objects_deprecatedIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list207 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.removed_objects_deprecated = new ArrayList<org.apache.impala.thrift.TCatalogObject>(_list207.size);
          org.apache.impala.thrift.TCatalogObject _elem208;
          for (int _i209 = 0; _i209 < _list207.size; ++_i209)
          {
            _elem208 = new org.apache.impala.thrift.TCatalogObject();
            _elem208.read(iprot);
            struct.removed_objects_deprecated.add(_elem208);
          }
        }
        struct.setRemoved_objects_deprecatedIsSet(true);
      }
    }
  }

}

