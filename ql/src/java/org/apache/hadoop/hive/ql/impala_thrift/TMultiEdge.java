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
public class TMultiEdge implements org.apache.thrift.TBase<TMultiEdge, TMultiEdge._Fields>, java.io.Serializable, Cloneable, Comparable<TMultiEdge> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TMultiEdge");

  private static final org.apache.thrift.protocol.TField SOURCES_FIELD_DESC = new org.apache.thrift.protocol.TField("sources", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField TARGETS_FIELD_DESC = new org.apache.thrift.protocol.TField("targets", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField EDGETYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("edgetype", org.apache.thrift.protocol.TType.I32, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TMultiEdgeStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TMultiEdgeTupleSchemeFactory());
  }

  private List<TVertex> sources; // required
  private List<TVertex> targets; // required
  private TEdgeType edgetype; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SOURCES((short)1, "sources"),
    TARGETS((short)2, "targets"),
    /**
     * 
     * @see TEdgeType
     */
    EDGETYPE((short)3, "edgetype");

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
        case 1: // SOURCES
          return SOURCES;
        case 2: // TARGETS
          return TARGETS;
        case 3: // EDGETYPE
          return EDGETYPE;
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
    tmpMap.put(_Fields.SOURCES, new org.apache.thrift.meta_data.FieldMetaData("sources", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TVertex.class))));
    tmpMap.put(_Fields.TARGETS, new org.apache.thrift.meta_data.FieldMetaData("targets", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TVertex.class))));
    tmpMap.put(_Fields.EDGETYPE, new org.apache.thrift.meta_data.FieldMetaData("edgetype", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TEdgeType.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TMultiEdge.class, metaDataMap);
  }

  public TMultiEdge() {
  }

  public TMultiEdge(
    List<TVertex> sources,
    List<TVertex> targets,
    TEdgeType edgetype)
  {
    this();
    this.sources = sources;
    this.targets = targets;
    this.edgetype = edgetype;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TMultiEdge(TMultiEdge other) {
    if (other.isSetSources()) {
      List<TVertex> __this__sources = new ArrayList<TVertex>(other.sources.size());
      for (TVertex other_element : other.sources) {
        __this__sources.add(new TVertex(other_element));
      }
      this.sources = __this__sources;
    }
    if (other.isSetTargets()) {
      List<TVertex> __this__targets = new ArrayList<TVertex>(other.targets.size());
      for (TVertex other_element : other.targets) {
        __this__targets.add(new TVertex(other_element));
      }
      this.targets = __this__targets;
    }
    if (other.isSetEdgetype()) {
      this.edgetype = other.edgetype;
    }
  }

  public TMultiEdge deepCopy() {
    return new TMultiEdge(this);
  }

  @Override
  public void clear() {
    this.sources = null;
    this.targets = null;
    this.edgetype = null;
  }

  public int getSourcesSize() {
    return (this.sources == null) ? 0 : this.sources.size();
  }

  public java.util.Iterator<TVertex> getSourcesIterator() {
    return (this.sources == null) ? null : this.sources.iterator();
  }

  public void addToSources(TVertex elem) {
    if (this.sources == null) {
      this.sources = new ArrayList<TVertex>();
    }
    this.sources.add(elem);
  }

  public List<TVertex> getSources() {
    return this.sources;
  }

  public void setSources(List<TVertex> sources) {
    this.sources = sources;
  }

  public void unsetSources() {
    this.sources = null;
  }

  /** Returns true if field sources is set (has been assigned a value) and false otherwise */
  public boolean isSetSources() {
    return this.sources != null;
  }

  public void setSourcesIsSet(boolean value) {
    if (!value) {
      this.sources = null;
    }
  }

  public int getTargetsSize() {
    return (this.targets == null) ? 0 : this.targets.size();
  }

  public java.util.Iterator<TVertex> getTargetsIterator() {
    return (this.targets == null) ? null : this.targets.iterator();
  }

  public void addToTargets(TVertex elem) {
    if (this.targets == null) {
      this.targets = new ArrayList<TVertex>();
    }
    this.targets.add(elem);
  }

  public List<TVertex> getTargets() {
    return this.targets;
  }

  public void setTargets(List<TVertex> targets) {
    this.targets = targets;
  }

  public void unsetTargets() {
    this.targets = null;
  }

  /** Returns true if field targets is set (has been assigned a value) and false otherwise */
  public boolean isSetTargets() {
    return this.targets != null;
  }

  public void setTargetsIsSet(boolean value) {
    if (!value) {
      this.targets = null;
    }
  }

  /**
   * 
   * @see TEdgeType
   */
  public TEdgeType getEdgetype() {
    return this.edgetype;
  }

  /**
   * 
   * @see TEdgeType
   */
  public void setEdgetype(TEdgeType edgetype) {
    this.edgetype = edgetype;
  }

  public void unsetEdgetype() {
    this.edgetype = null;
  }

  /** Returns true if field edgetype is set (has been assigned a value) and false otherwise */
  public boolean isSetEdgetype() {
    return this.edgetype != null;
  }

  public void setEdgetypeIsSet(boolean value) {
    if (!value) {
      this.edgetype = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SOURCES:
      if (value == null) {
        unsetSources();
      } else {
        setSources((List<TVertex>)value);
      }
      break;

    case TARGETS:
      if (value == null) {
        unsetTargets();
      } else {
        setTargets((List<TVertex>)value);
      }
      break;

    case EDGETYPE:
      if (value == null) {
        unsetEdgetype();
      } else {
        setEdgetype((TEdgeType)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SOURCES:
      return getSources();

    case TARGETS:
      return getTargets();

    case EDGETYPE:
      return getEdgetype();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SOURCES:
      return isSetSources();
    case TARGETS:
      return isSetTargets();
    case EDGETYPE:
      return isSetEdgetype();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TMultiEdge)
      return this.equals((TMultiEdge)that);
    return false;
  }

  public boolean equals(TMultiEdge that) {
    if (that == null)
      return false;

    boolean this_present_sources = true && this.isSetSources();
    boolean that_present_sources = true && that.isSetSources();
    if (this_present_sources || that_present_sources) {
      if (!(this_present_sources && that_present_sources))
        return false;
      if (!this.sources.equals(that.sources))
        return false;
    }

    boolean this_present_targets = true && this.isSetTargets();
    boolean that_present_targets = true && that.isSetTargets();
    if (this_present_targets || that_present_targets) {
      if (!(this_present_targets && that_present_targets))
        return false;
      if (!this.targets.equals(that.targets))
        return false;
    }

    boolean this_present_edgetype = true && this.isSetEdgetype();
    boolean that_present_edgetype = true && that.isSetEdgetype();
    if (this_present_edgetype || that_present_edgetype) {
      if (!(this_present_edgetype && that_present_edgetype))
        return false;
      if (!this.edgetype.equals(that.edgetype))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_sources = true && (isSetSources());
    list.add(present_sources);
    if (present_sources)
      list.add(sources);

    boolean present_targets = true && (isSetTargets());
    list.add(present_targets);
    if (present_targets)
      list.add(targets);

    boolean present_edgetype = true && (isSetEdgetype());
    list.add(present_edgetype);
    if (present_edgetype)
      list.add(edgetype.getValue());

    return list.hashCode();
  }

  @Override
  public int compareTo(TMultiEdge other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSources()).compareTo(other.isSetSources());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSources()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sources, other.sources);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTargets()).compareTo(other.isSetTargets());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTargets()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.targets, other.targets);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEdgetype()).compareTo(other.isSetEdgetype());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEdgetype()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.edgetype, other.edgetype);
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
    StringBuilder sb = new StringBuilder("TMultiEdge(");
    boolean first = true;

    sb.append("sources:");
    if (this.sources == null) {
      sb.append("null");
    } else {
      sb.append(this.sources);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("targets:");
    if (this.targets == null) {
      sb.append("null");
    } else {
      sb.append(this.targets);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("edgetype:");
    if (this.edgetype == null) {
      sb.append("null");
    } else {
      sb.append(this.edgetype);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
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

  private static class TMultiEdgeStandardSchemeFactory implements SchemeFactory {
    public TMultiEdgeStandardScheme getScheme() {
      return new TMultiEdgeStandardScheme();
    }
  }

  private static class TMultiEdgeStandardScheme extends StandardScheme<TMultiEdge> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TMultiEdge struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SOURCES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.sources = new ArrayList<TVertex>(_list0.size);
                TVertex _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = new TVertex();
                  _elem1.read(iprot);
                  struct.sources.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setSourcesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TARGETS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list3 = iprot.readListBegin();
                struct.targets = new ArrayList<TVertex>(_list3.size);
                TVertex _elem4;
                for (int _i5 = 0; _i5 < _list3.size; ++_i5)
                {
                  _elem4 = new TVertex();
                  _elem4.read(iprot);
                  struct.targets.add(_elem4);
                }
                iprot.readListEnd();
              }
              struct.setTargetsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // EDGETYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.edgetype = org.apache.impala.thrift.TEdgeType.findByValue(iprot.readI32());
              struct.setEdgetypeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TMultiEdge struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.sources != null) {
        oprot.writeFieldBegin(SOURCES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.sources.size()));
          for (TVertex _iter6 : struct.sources)
          {
            _iter6.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.targets != null) {
        oprot.writeFieldBegin(TARGETS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.targets.size()));
          for (TVertex _iter7 : struct.targets)
          {
            _iter7.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.edgetype != null) {
        oprot.writeFieldBegin(EDGETYPE_FIELD_DESC);
        oprot.writeI32(struct.edgetype.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TMultiEdgeTupleSchemeFactory implements SchemeFactory {
    public TMultiEdgeTupleScheme getScheme() {
      return new TMultiEdgeTupleScheme();
    }
  }

  private static class TMultiEdgeTupleScheme extends TupleScheme<TMultiEdge> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TMultiEdge struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetSources()) {
        optionals.set(0);
      }
      if (struct.isSetTargets()) {
        optionals.set(1);
      }
      if (struct.isSetEdgetype()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetSources()) {
        {
          oprot.writeI32(struct.sources.size());
          for (TVertex _iter8 : struct.sources)
          {
            _iter8.write(oprot);
          }
        }
      }
      if (struct.isSetTargets()) {
        {
          oprot.writeI32(struct.targets.size());
          for (TVertex _iter9 : struct.targets)
          {
            _iter9.write(oprot);
          }
        }
      }
      if (struct.isSetEdgetype()) {
        oprot.writeI32(struct.edgetype.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TMultiEdge struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list10 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.sources = new ArrayList<TVertex>(_list10.size);
          TVertex _elem11;
          for (int _i12 = 0; _i12 < _list10.size; ++_i12)
          {
            _elem11 = new TVertex();
            _elem11.read(iprot);
            struct.sources.add(_elem11);
          }
        }
        struct.setSourcesIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list13 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.targets = new ArrayList<TVertex>(_list13.size);
          TVertex _elem14;
          for (int _i15 = 0; _i15 < _list13.size; ++_i15)
          {
            _elem14 = new TVertex();
            _elem14.read(iprot);
            struct.targets.add(_elem14);
          }
        }
        struct.setTargetsIsSet(true);
      }
      if (incoming.get(2)) {
        struct.edgetype = org.apache.impala.thrift.TEdgeType.findByValue(iprot.readI32());
        struct.setEdgetypeIsSet(true);
      }
    }
  }

}

