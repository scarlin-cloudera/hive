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
public class TUpdateTableUsageRequest implements org.apache.thrift.TBase<TUpdateTableUsageRequest, TUpdateTableUsageRequest._Fields>, java.io.Serializable, Cloneable, Comparable<TUpdateTableUsageRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TUpdateTableUsageRequest");

  private static final org.apache.thrift.protocol.TField USAGES_FIELD_DESC = new org.apache.thrift.protocol.TField("usages", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TUpdateTableUsageRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TUpdateTableUsageRequestTupleSchemeFactory());
  }

  private List<TTableUsage> usages; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USAGES((short)1, "usages");

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
        case 1: // USAGES
          return USAGES;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.USAGES, new org.apache.thrift.meta_data.FieldMetaData("usages", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TTableUsage.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TUpdateTableUsageRequest.class, metaDataMap);
  }

  public TUpdateTableUsageRequest() {
  }

  public TUpdateTableUsageRequest(
    List<TTableUsage> usages)
  {
    this();
    this.usages = usages;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TUpdateTableUsageRequest(TUpdateTableUsageRequest other) {
    if (other.isSetUsages()) {
      List<TTableUsage> __this__usages = new ArrayList<TTableUsage>(other.usages.size());
      for (TTableUsage other_element : other.usages) {
        __this__usages.add(new TTableUsage(other_element));
      }
      this.usages = __this__usages;
    }
  }

  public TUpdateTableUsageRequest deepCopy() {
    return new TUpdateTableUsageRequest(this);
  }

  @Override
  public void clear() {
    this.usages = null;
  }

  public int getUsagesSize() {
    return (this.usages == null) ? 0 : this.usages.size();
  }

  public java.util.Iterator<TTableUsage> getUsagesIterator() {
    return (this.usages == null) ? null : this.usages.iterator();
  }

  public void addToUsages(TTableUsage elem) {
    if (this.usages == null) {
      this.usages = new ArrayList<TTableUsage>();
    }
    this.usages.add(elem);
  }

  public List<TTableUsage> getUsages() {
    return this.usages;
  }

  public void setUsages(List<TTableUsage> usages) {
    this.usages = usages;
  }

  public void unsetUsages() {
    this.usages = null;
  }

  /** Returns true if field usages is set (has been assigned a value) and false otherwise */
  public boolean isSetUsages() {
    return this.usages != null;
  }

  public void setUsagesIsSet(boolean value) {
    if (!value) {
      this.usages = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case USAGES:
      if (value == null) {
        unsetUsages();
      } else {
        setUsages((List<TTableUsage>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case USAGES:
      return getUsages();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case USAGES:
      return isSetUsages();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TUpdateTableUsageRequest)
      return this.equals((TUpdateTableUsageRequest)that);
    return false;
  }

  public boolean equals(TUpdateTableUsageRequest that) {
    if (that == null)
      return false;

    boolean this_present_usages = true && this.isSetUsages();
    boolean that_present_usages = true && that.isSetUsages();
    if (this_present_usages || that_present_usages) {
      if (!(this_present_usages && that_present_usages))
        return false;
      if (!this.usages.equals(that.usages))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_usages = true && (isSetUsages());
    list.add(present_usages);
    if (present_usages)
      list.add(usages);

    return list.hashCode();
  }

  @Override
  public int compareTo(TUpdateTableUsageRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetUsages()).compareTo(other.isSetUsages());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsages()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.usages, other.usages);
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
    StringBuilder sb = new StringBuilder("TUpdateTableUsageRequest(");
    boolean first = true;

    sb.append("usages:");
    if (this.usages == null) {
      sb.append("null");
    } else {
      sb.append(this.usages);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetUsages()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'usages' is unset! Struct:" + toString());
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

  private static class TUpdateTableUsageRequestStandardSchemeFactory implements SchemeFactory {
    public TUpdateTableUsageRequestStandardScheme getScheme() {
      return new TUpdateTableUsageRequestStandardScheme();
    }
  }

  private static class TUpdateTableUsageRequestStandardScheme extends StandardScheme<TUpdateTableUsageRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TUpdateTableUsageRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USAGES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list138 = iprot.readListBegin();
                struct.usages = new ArrayList<TTableUsage>(_list138.size);
                TTableUsage _elem139;
                for (int _i140 = 0; _i140 < _list138.size; ++_i140)
                {
                  _elem139 = new TTableUsage();
                  _elem139.read(iprot);
                  struct.usages.add(_elem139);
                }
                iprot.readListEnd();
              }
              struct.setUsagesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TUpdateTableUsageRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.usages != null) {
        oprot.writeFieldBegin(USAGES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.usages.size()));
          for (TTableUsage _iter141 : struct.usages)
          {
            _iter141.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TUpdateTableUsageRequestTupleSchemeFactory implements SchemeFactory {
    public TUpdateTableUsageRequestTupleScheme getScheme() {
      return new TUpdateTableUsageRequestTupleScheme();
    }
  }

  private static class TUpdateTableUsageRequestTupleScheme extends TupleScheme<TUpdateTableUsageRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TUpdateTableUsageRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.usages.size());
        for (TTableUsage _iter142 : struct.usages)
        {
          _iter142.write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TUpdateTableUsageRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list143 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.usages = new ArrayList<TTableUsage>(_list143.size);
        TTableUsage _elem144;
        for (int _i145 = 0; _i145 < _list143.size; ++_i145)
        {
          _elem144 = new TTableUsage();
          _elem144.read(iprot);
          struct.usages.add(_elem144);
        }
      }
      struct.setUsagesIsSet(true);
    }
  }

}
