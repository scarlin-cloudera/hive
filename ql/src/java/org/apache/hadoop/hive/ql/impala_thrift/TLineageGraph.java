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
public class TLineageGraph implements org.apache.thrift.TBase<TLineageGraph, TLineageGraph._Fields>, java.io.Serializable, Cloneable, Comparable<TLineageGraph> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TLineageGraph");

  private static final org.apache.thrift.protocol.TField QUERY_TEXT_FIELD_DESC = new org.apache.thrift.protocol.TField("query_text", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField HASH_FIELD_DESC = new org.apache.thrift.protocol.TField("hash", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField USER_FIELD_DESC = new org.apache.thrift.protocol.TField("user", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField STARTED_FIELD_DESC = new org.apache.thrift.protocol.TField("started", org.apache.thrift.protocol.TType.I64, (short)4);
  private static final org.apache.thrift.protocol.TField ENDED_FIELD_DESC = new org.apache.thrift.protocol.TField("ended", org.apache.thrift.protocol.TType.I64, (short)5);
  private static final org.apache.thrift.protocol.TField EDGES_FIELD_DESC = new org.apache.thrift.protocol.TField("edges", org.apache.thrift.protocol.TType.LIST, (short)6);
  private static final org.apache.thrift.protocol.TField VERTICES_FIELD_DESC = new org.apache.thrift.protocol.TField("vertices", org.apache.thrift.protocol.TType.LIST, (short)7);
  private static final org.apache.thrift.protocol.TField QUERY_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("query_id", org.apache.thrift.protocol.TType.STRUCT, (short)8);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TLineageGraphStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TLineageGraphTupleSchemeFactory());
  }

  private String query_text; // required
  private String hash; // required
  private String user; // required
  private long started; // required
  private long ended; // optional
  private List<TMultiEdge> edges; // required
  private List<TVertex> vertices; // required
  private org.apache.impala.thrift.TUniqueId query_id; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    QUERY_TEXT((short)1, "query_text"),
    HASH((short)2, "hash"),
    USER((short)3, "user"),
    STARTED((short)4, "started"),
    ENDED((short)5, "ended"),
    EDGES((short)6, "edges"),
    VERTICES((short)7, "vertices"),
    QUERY_ID((short)8, "query_id");

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
        case 1: // QUERY_TEXT
          return QUERY_TEXT;
        case 2: // HASH
          return HASH;
        case 3: // USER
          return USER;
        case 4: // STARTED
          return STARTED;
        case 5: // ENDED
          return ENDED;
        case 6: // EDGES
          return EDGES;
        case 7: // VERTICES
          return VERTICES;
        case 8: // QUERY_ID
          return QUERY_ID;
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
  private static final int __STARTED_ISSET_ID = 0;
  private static final int __ENDED_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.ENDED};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.QUERY_TEXT, new org.apache.thrift.meta_data.FieldMetaData("query_text", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.HASH, new org.apache.thrift.meta_data.FieldMetaData("hash", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.USER, new org.apache.thrift.meta_data.FieldMetaData("user", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.STARTED, new org.apache.thrift.meta_data.FieldMetaData("started", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.ENDED, new org.apache.thrift.meta_data.FieldMetaData("ended", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.EDGES, new org.apache.thrift.meta_data.FieldMetaData("edges", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TMultiEdge.class))));
    tmpMap.put(_Fields.VERTICES, new org.apache.thrift.meta_data.FieldMetaData("vertices", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TVertex.class))));
    tmpMap.put(_Fields.QUERY_ID, new org.apache.thrift.meta_data.FieldMetaData("query_id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.impala.thrift.TUniqueId.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TLineageGraph.class, metaDataMap);
  }

  public TLineageGraph() {
  }

  public TLineageGraph(
    String query_text,
    String hash,
    String user,
    long started,
    List<TMultiEdge> edges,
    List<TVertex> vertices,
    org.apache.impala.thrift.TUniqueId query_id)
  {
    this();
    this.query_text = query_text;
    this.hash = hash;
    this.user = user;
    this.started = started;
    setStartedIsSet(true);
    this.edges = edges;
    this.vertices = vertices;
    this.query_id = query_id;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TLineageGraph(TLineageGraph other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetQuery_text()) {
      this.query_text = other.query_text;
    }
    if (other.isSetHash()) {
      this.hash = other.hash;
    }
    if (other.isSetUser()) {
      this.user = other.user;
    }
    this.started = other.started;
    this.ended = other.ended;
    if (other.isSetEdges()) {
      List<TMultiEdge> __this__edges = new ArrayList<TMultiEdge>(other.edges.size());
      for (TMultiEdge other_element : other.edges) {
        __this__edges.add(new TMultiEdge(other_element));
      }
      this.edges = __this__edges;
    }
    if (other.isSetVertices()) {
      List<TVertex> __this__vertices = new ArrayList<TVertex>(other.vertices.size());
      for (TVertex other_element : other.vertices) {
        __this__vertices.add(new TVertex(other_element));
      }
      this.vertices = __this__vertices;
    }
    if (other.isSetQuery_id()) {
      this.query_id = new org.apache.impala.thrift.TUniqueId(other.query_id);
    }
  }

  public TLineageGraph deepCopy() {
    return new TLineageGraph(this);
  }

  @Override
  public void clear() {
    this.query_text = null;
    this.hash = null;
    this.user = null;
    setStartedIsSet(false);
    this.started = 0;
    setEndedIsSet(false);
    this.ended = 0;
    this.edges = null;
    this.vertices = null;
    this.query_id = null;
  }

  public String getQuery_text() {
    return this.query_text;
  }

  public void setQuery_text(String query_text) {
    this.query_text = query_text;
  }

  public void unsetQuery_text() {
    this.query_text = null;
  }

  /** Returns true if field query_text is set (has been assigned a value) and false otherwise */
  public boolean isSetQuery_text() {
    return this.query_text != null;
  }

  public void setQuery_textIsSet(boolean value) {
    if (!value) {
      this.query_text = null;
    }
  }

  public String getHash() {
    return this.hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }

  public void unsetHash() {
    this.hash = null;
  }

  /** Returns true if field hash is set (has been assigned a value) and false otherwise */
  public boolean isSetHash() {
    return this.hash != null;
  }

  public void setHashIsSet(boolean value) {
    if (!value) {
      this.hash = null;
    }
  }

  public String getUser() {
    return this.user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public void unsetUser() {
    this.user = null;
  }

  /** Returns true if field user is set (has been assigned a value) and false otherwise */
  public boolean isSetUser() {
    return this.user != null;
  }

  public void setUserIsSet(boolean value) {
    if (!value) {
      this.user = null;
    }
  }

  public long getStarted() {
    return this.started;
  }

  public void setStarted(long started) {
    this.started = started;
    setStartedIsSet(true);
  }

  public void unsetStarted() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __STARTED_ISSET_ID);
  }

  /** Returns true if field started is set (has been assigned a value) and false otherwise */
  public boolean isSetStarted() {
    return EncodingUtils.testBit(__isset_bitfield, __STARTED_ISSET_ID);
  }

  public void setStartedIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __STARTED_ISSET_ID, value);
  }

  public long getEnded() {
    return this.ended;
  }

  public void setEnded(long ended) {
    this.ended = ended;
    setEndedIsSet(true);
  }

  public void unsetEnded() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ENDED_ISSET_ID);
  }

  /** Returns true if field ended is set (has been assigned a value) and false otherwise */
  public boolean isSetEnded() {
    return EncodingUtils.testBit(__isset_bitfield, __ENDED_ISSET_ID);
  }

  public void setEndedIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ENDED_ISSET_ID, value);
  }

  public int getEdgesSize() {
    return (this.edges == null) ? 0 : this.edges.size();
  }

  public java.util.Iterator<TMultiEdge> getEdgesIterator() {
    return (this.edges == null) ? null : this.edges.iterator();
  }

  public void addToEdges(TMultiEdge elem) {
    if (this.edges == null) {
      this.edges = new ArrayList<TMultiEdge>();
    }
    this.edges.add(elem);
  }

  public List<TMultiEdge> getEdges() {
    return this.edges;
  }

  public void setEdges(List<TMultiEdge> edges) {
    this.edges = edges;
  }

  public void unsetEdges() {
    this.edges = null;
  }

  /** Returns true if field edges is set (has been assigned a value) and false otherwise */
  public boolean isSetEdges() {
    return this.edges != null;
  }

  public void setEdgesIsSet(boolean value) {
    if (!value) {
      this.edges = null;
    }
  }

  public int getVerticesSize() {
    return (this.vertices == null) ? 0 : this.vertices.size();
  }

  public java.util.Iterator<TVertex> getVerticesIterator() {
    return (this.vertices == null) ? null : this.vertices.iterator();
  }

  public void addToVertices(TVertex elem) {
    if (this.vertices == null) {
      this.vertices = new ArrayList<TVertex>();
    }
    this.vertices.add(elem);
  }

  public List<TVertex> getVertices() {
    return this.vertices;
  }

  public void setVertices(List<TVertex> vertices) {
    this.vertices = vertices;
  }

  public void unsetVertices() {
    this.vertices = null;
  }

  /** Returns true if field vertices is set (has been assigned a value) and false otherwise */
  public boolean isSetVertices() {
    return this.vertices != null;
  }

  public void setVerticesIsSet(boolean value) {
    if (!value) {
      this.vertices = null;
    }
  }

  public org.apache.impala.thrift.TUniqueId getQuery_id() {
    return this.query_id;
  }

  public void setQuery_id(org.apache.impala.thrift.TUniqueId query_id) {
    this.query_id = query_id;
  }

  public void unsetQuery_id() {
    this.query_id = null;
  }

  /** Returns true if field query_id is set (has been assigned a value) and false otherwise */
  public boolean isSetQuery_id() {
    return this.query_id != null;
  }

  public void setQuery_idIsSet(boolean value) {
    if (!value) {
      this.query_id = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case QUERY_TEXT:
      if (value == null) {
        unsetQuery_text();
      } else {
        setQuery_text((String)value);
      }
      break;

    case HASH:
      if (value == null) {
        unsetHash();
      } else {
        setHash((String)value);
      }
      break;

    case USER:
      if (value == null) {
        unsetUser();
      } else {
        setUser((String)value);
      }
      break;

    case STARTED:
      if (value == null) {
        unsetStarted();
      } else {
        setStarted((Long)value);
      }
      break;

    case ENDED:
      if (value == null) {
        unsetEnded();
      } else {
        setEnded((Long)value);
      }
      break;

    case EDGES:
      if (value == null) {
        unsetEdges();
      } else {
        setEdges((List<TMultiEdge>)value);
      }
      break;

    case VERTICES:
      if (value == null) {
        unsetVertices();
      } else {
        setVertices((List<TVertex>)value);
      }
      break;

    case QUERY_ID:
      if (value == null) {
        unsetQuery_id();
      } else {
        setQuery_id((org.apache.impala.thrift.TUniqueId)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case QUERY_TEXT:
      return getQuery_text();

    case HASH:
      return getHash();

    case USER:
      return getUser();

    case STARTED:
      return getStarted();

    case ENDED:
      return getEnded();

    case EDGES:
      return getEdges();

    case VERTICES:
      return getVertices();

    case QUERY_ID:
      return getQuery_id();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case QUERY_TEXT:
      return isSetQuery_text();
    case HASH:
      return isSetHash();
    case USER:
      return isSetUser();
    case STARTED:
      return isSetStarted();
    case ENDED:
      return isSetEnded();
    case EDGES:
      return isSetEdges();
    case VERTICES:
      return isSetVertices();
    case QUERY_ID:
      return isSetQuery_id();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TLineageGraph)
      return this.equals((TLineageGraph)that);
    return false;
  }

  public boolean equals(TLineageGraph that) {
    if (that == null)
      return false;

    boolean this_present_query_text = true && this.isSetQuery_text();
    boolean that_present_query_text = true && that.isSetQuery_text();
    if (this_present_query_text || that_present_query_text) {
      if (!(this_present_query_text && that_present_query_text))
        return false;
      if (!this.query_text.equals(that.query_text))
        return false;
    }

    boolean this_present_hash = true && this.isSetHash();
    boolean that_present_hash = true && that.isSetHash();
    if (this_present_hash || that_present_hash) {
      if (!(this_present_hash && that_present_hash))
        return false;
      if (!this.hash.equals(that.hash))
        return false;
    }

    boolean this_present_user = true && this.isSetUser();
    boolean that_present_user = true && that.isSetUser();
    if (this_present_user || that_present_user) {
      if (!(this_present_user && that_present_user))
        return false;
      if (!this.user.equals(that.user))
        return false;
    }

    boolean this_present_started = true;
    boolean that_present_started = true;
    if (this_present_started || that_present_started) {
      if (!(this_present_started && that_present_started))
        return false;
      if (this.started != that.started)
        return false;
    }

    boolean this_present_ended = true && this.isSetEnded();
    boolean that_present_ended = true && that.isSetEnded();
    if (this_present_ended || that_present_ended) {
      if (!(this_present_ended && that_present_ended))
        return false;
      if (this.ended != that.ended)
        return false;
    }

    boolean this_present_edges = true && this.isSetEdges();
    boolean that_present_edges = true && that.isSetEdges();
    if (this_present_edges || that_present_edges) {
      if (!(this_present_edges && that_present_edges))
        return false;
      if (!this.edges.equals(that.edges))
        return false;
    }

    boolean this_present_vertices = true && this.isSetVertices();
    boolean that_present_vertices = true && that.isSetVertices();
    if (this_present_vertices || that_present_vertices) {
      if (!(this_present_vertices && that_present_vertices))
        return false;
      if (!this.vertices.equals(that.vertices))
        return false;
    }

    boolean this_present_query_id = true && this.isSetQuery_id();
    boolean that_present_query_id = true && that.isSetQuery_id();
    if (this_present_query_id || that_present_query_id) {
      if (!(this_present_query_id && that_present_query_id))
        return false;
      if (!this.query_id.equals(that.query_id))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_query_text = true && (isSetQuery_text());
    list.add(present_query_text);
    if (present_query_text)
      list.add(query_text);

    boolean present_hash = true && (isSetHash());
    list.add(present_hash);
    if (present_hash)
      list.add(hash);

    boolean present_user = true && (isSetUser());
    list.add(present_user);
    if (present_user)
      list.add(user);

    boolean present_started = true;
    list.add(present_started);
    if (present_started)
      list.add(started);

    boolean present_ended = true && (isSetEnded());
    list.add(present_ended);
    if (present_ended)
      list.add(ended);

    boolean present_edges = true && (isSetEdges());
    list.add(present_edges);
    if (present_edges)
      list.add(edges);

    boolean present_vertices = true && (isSetVertices());
    list.add(present_vertices);
    if (present_vertices)
      list.add(vertices);

    boolean present_query_id = true && (isSetQuery_id());
    list.add(present_query_id);
    if (present_query_id)
      list.add(query_id);

    return list.hashCode();
  }

  @Override
  public int compareTo(TLineageGraph other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetQuery_text()).compareTo(other.isSetQuery_text());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQuery_text()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.query_text, other.query_text);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHash()).compareTo(other.isSetHash());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHash()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hash, other.hash);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUser()).compareTo(other.isSetUser());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUser()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.user, other.user);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStarted()).compareTo(other.isSetStarted());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStarted()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.started, other.started);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEnded()).compareTo(other.isSetEnded());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEnded()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ended, other.ended);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEdges()).compareTo(other.isSetEdges());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEdges()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.edges, other.edges);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetVertices()).compareTo(other.isSetVertices());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVertices()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.vertices, other.vertices);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetQuery_id()).compareTo(other.isSetQuery_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQuery_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.query_id, other.query_id);
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
    StringBuilder sb = new StringBuilder("TLineageGraph(");
    boolean first = true;

    sb.append("query_text:");
    if (this.query_text == null) {
      sb.append("null");
    } else {
      sb.append(this.query_text);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("hash:");
    if (this.hash == null) {
      sb.append("null");
    } else {
      sb.append(this.hash);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("user:");
    if (this.user == null) {
      sb.append("null");
    } else {
      sb.append(this.user);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("started:");
    sb.append(this.started);
    first = false;
    if (isSetEnded()) {
      if (!first) sb.append(", ");
      sb.append("ended:");
      sb.append(this.ended);
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("edges:");
    if (this.edges == null) {
      sb.append("null");
    } else {
      sb.append(this.edges);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("vertices:");
    if (this.vertices == null) {
      sb.append("null");
    } else {
      sb.append(this.vertices);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("query_id:");
    if (this.query_id == null) {
      sb.append("null");
    } else {
      sb.append(this.query_id);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetQuery_text()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'query_text' is unset! Struct:" + toString());
    }

    if (!isSetHash()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'hash' is unset! Struct:" + toString());
    }

    if (!isSetUser()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'user' is unset! Struct:" + toString());
    }

    if (!isSetStarted()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'started' is unset! Struct:" + toString());
    }

    if (!isSetQuery_id()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'query_id' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
    if (query_id != null) {
      query_id.validate();
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

  private static class TLineageGraphStandardSchemeFactory implements SchemeFactory {
    public TLineageGraphStandardScheme getScheme() {
      return new TLineageGraphStandardScheme();
    }
  }

  private static class TLineageGraphStandardScheme extends StandardScheme<TLineageGraph> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TLineageGraph struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // QUERY_TEXT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.query_text = iprot.readString();
              struct.setQuery_textIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // HASH
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.hash = iprot.readString();
              struct.setHashIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // USER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.user = iprot.readString();
              struct.setUserIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // STARTED
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.started = iprot.readI64();
              struct.setStartedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // ENDED
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.ended = iprot.readI64();
              struct.setEndedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // EDGES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list16 = iprot.readListBegin();
                struct.edges = new ArrayList<TMultiEdge>(_list16.size);
                TMultiEdge _elem17;
                for (int _i18 = 0; _i18 < _list16.size; ++_i18)
                {
                  _elem17 = new TMultiEdge();
                  _elem17.read(iprot);
                  struct.edges.add(_elem17);
                }
                iprot.readListEnd();
              }
              struct.setEdgesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // VERTICES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list19 = iprot.readListBegin();
                struct.vertices = new ArrayList<TVertex>(_list19.size);
                TVertex _elem20;
                for (int _i21 = 0; _i21 < _list19.size; ++_i21)
                {
                  _elem20 = new TVertex();
                  _elem20.read(iprot);
                  struct.vertices.add(_elem20);
                }
                iprot.readListEnd();
              }
              struct.setVerticesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // QUERY_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.query_id = new org.apache.impala.thrift.TUniqueId();
              struct.query_id.read(iprot);
              struct.setQuery_idIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TLineageGraph struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.query_text != null) {
        oprot.writeFieldBegin(QUERY_TEXT_FIELD_DESC);
        oprot.writeString(struct.query_text);
        oprot.writeFieldEnd();
      }
      if (struct.hash != null) {
        oprot.writeFieldBegin(HASH_FIELD_DESC);
        oprot.writeString(struct.hash);
        oprot.writeFieldEnd();
      }
      if (struct.user != null) {
        oprot.writeFieldBegin(USER_FIELD_DESC);
        oprot.writeString(struct.user);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(STARTED_FIELD_DESC);
      oprot.writeI64(struct.started);
      oprot.writeFieldEnd();
      if (struct.isSetEnded()) {
        oprot.writeFieldBegin(ENDED_FIELD_DESC);
        oprot.writeI64(struct.ended);
        oprot.writeFieldEnd();
      }
      if (struct.edges != null) {
        oprot.writeFieldBegin(EDGES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.edges.size()));
          for (TMultiEdge _iter22 : struct.edges)
          {
            _iter22.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.vertices != null) {
        oprot.writeFieldBegin(VERTICES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.vertices.size()));
          for (TVertex _iter23 : struct.vertices)
          {
            _iter23.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.query_id != null) {
        oprot.writeFieldBegin(QUERY_ID_FIELD_DESC);
        struct.query_id.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TLineageGraphTupleSchemeFactory implements SchemeFactory {
    public TLineageGraphTupleScheme getScheme() {
      return new TLineageGraphTupleScheme();
    }
  }

  private static class TLineageGraphTupleScheme extends TupleScheme<TLineageGraph> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TLineageGraph struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.query_text);
      oprot.writeString(struct.hash);
      oprot.writeString(struct.user);
      oprot.writeI64(struct.started);
      struct.query_id.write(oprot);
      BitSet optionals = new BitSet();
      if (struct.isSetEnded()) {
        optionals.set(0);
      }
      if (struct.isSetEdges()) {
        optionals.set(1);
      }
      if (struct.isSetVertices()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetEnded()) {
        oprot.writeI64(struct.ended);
      }
      if (struct.isSetEdges()) {
        {
          oprot.writeI32(struct.edges.size());
          for (TMultiEdge _iter24 : struct.edges)
          {
            _iter24.write(oprot);
          }
        }
      }
      if (struct.isSetVertices()) {
        {
          oprot.writeI32(struct.vertices.size());
          for (TVertex _iter25 : struct.vertices)
          {
            _iter25.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TLineageGraph struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.query_text = iprot.readString();
      struct.setQuery_textIsSet(true);
      struct.hash = iprot.readString();
      struct.setHashIsSet(true);
      struct.user = iprot.readString();
      struct.setUserIsSet(true);
      struct.started = iprot.readI64();
      struct.setStartedIsSet(true);
      struct.query_id = new org.apache.impala.thrift.TUniqueId();
      struct.query_id.read(iprot);
      struct.setQuery_idIsSet(true);
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.ended = iprot.readI64();
        struct.setEndedIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list26 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.edges = new ArrayList<TMultiEdge>(_list26.size);
          TMultiEdge _elem27;
          for (int _i28 = 0; _i28 < _list26.size; ++_i28)
          {
            _elem27 = new TMultiEdge();
            _elem27.read(iprot);
            struct.edges.add(_elem27);
          }
        }
        struct.setEdgesIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list29 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.vertices = new ArrayList<TVertex>(_list29.size);
          TVertex _elem30;
          for (int _i31 = 0; _i31 < _list29.size; ++_i31)
          {
            _elem30 = new TVertex();
            _elem30.read(iprot);
            struct.vertices.add(_elem30);
          }
        }
        struct.setVerticesIsSet(true);
      }
    }
  }

}
