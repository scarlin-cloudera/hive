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
public class TRuntimeProfileTree implements org.apache.thrift.TBase<TRuntimeProfileTree, TRuntimeProfileTree._Fields>, java.io.Serializable, Cloneable, Comparable<TRuntimeProfileTree> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TRuntimeProfileTree");

  private static final org.apache.thrift.protocol.TField NODES_FIELD_DESC = new org.apache.thrift.protocol.TField("nodes", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField EXEC_SUMMARY_FIELD_DESC = new org.apache.thrift.protocol.TField("exec_summary", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TRuntimeProfileTreeStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TRuntimeProfileTreeTupleSchemeFactory());
  }

  public List<TRuntimeProfileNode> nodes; // required
  public org.apache.impala.thrift.TExecSummary exec_summary; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NODES((short)1, "nodes"),
    EXEC_SUMMARY((short)2, "exec_summary");

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
        case 1: // NODES
          return NODES;
        case 2: // EXEC_SUMMARY
          return EXEC_SUMMARY;
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
  private static final _Fields optionals[] = {_Fields.EXEC_SUMMARY};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NODES, new org.apache.thrift.meta_data.FieldMetaData("nodes", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TRuntimeProfileNode.class))));
    tmpMap.put(_Fields.EXEC_SUMMARY, new org.apache.thrift.meta_data.FieldMetaData("exec_summary", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.impala.thrift.TExecSummary.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TRuntimeProfileTree.class, metaDataMap);
  }

  public TRuntimeProfileTree() {
  }

  public TRuntimeProfileTree(
    List<TRuntimeProfileNode> nodes)
  {
    this();
    this.nodes = nodes;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TRuntimeProfileTree(TRuntimeProfileTree other) {
    if (other.isSetNodes()) {
      List<TRuntimeProfileNode> __this__nodes = new ArrayList<TRuntimeProfileNode>(other.nodes.size());
      for (TRuntimeProfileNode other_element : other.nodes) {
        __this__nodes.add(new TRuntimeProfileNode(other_element));
      }
      this.nodes = __this__nodes;
    }
    if (other.isSetExec_summary()) {
      this.exec_summary = new org.apache.impala.thrift.TExecSummary(other.exec_summary);
    }
  }

  public TRuntimeProfileTree deepCopy() {
    return new TRuntimeProfileTree(this);
  }

  @Override
  public void clear() {
    this.nodes = null;
    this.exec_summary = null;
  }

  public int getNodesSize() {
    return (this.nodes == null) ? 0 : this.nodes.size();
  }

  public java.util.Iterator<TRuntimeProfileNode> getNodesIterator() {
    return (this.nodes == null) ? null : this.nodes.iterator();
  }

  public void addToNodes(TRuntimeProfileNode elem) {
    if (this.nodes == null) {
      this.nodes = new ArrayList<TRuntimeProfileNode>();
    }
    this.nodes.add(elem);
  }

  public List<TRuntimeProfileNode> getNodes() {
    return this.nodes;
  }

  public TRuntimeProfileTree setNodes(List<TRuntimeProfileNode> nodes) {
    this.nodes = nodes;
    return this;
  }

  public void unsetNodes() {
    this.nodes = null;
  }

  /** Returns true if field nodes is set (has been assigned a value) and false otherwise */
  public boolean isSetNodes() {
    return this.nodes != null;
  }

  public void setNodesIsSet(boolean value) {
    if (!value) {
      this.nodes = null;
    }
  }

  public org.apache.impala.thrift.TExecSummary getExec_summary() {
    return this.exec_summary;
  }

  public TRuntimeProfileTree setExec_summary(org.apache.impala.thrift.TExecSummary exec_summary) {
    this.exec_summary = exec_summary;
    return this;
  }

  public void unsetExec_summary() {
    this.exec_summary = null;
  }

  /** Returns true if field exec_summary is set (has been assigned a value) and false otherwise */
  public boolean isSetExec_summary() {
    return this.exec_summary != null;
  }

  public void setExec_summaryIsSet(boolean value) {
    if (!value) {
      this.exec_summary = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NODES:
      if (value == null) {
        unsetNodes();
      } else {
        setNodes((List<TRuntimeProfileNode>)value);
      }
      break;

    case EXEC_SUMMARY:
      if (value == null) {
        unsetExec_summary();
      } else {
        setExec_summary((org.apache.impala.thrift.TExecSummary)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NODES:
      return getNodes();

    case EXEC_SUMMARY:
      return getExec_summary();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NODES:
      return isSetNodes();
    case EXEC_SUMMARY:
      return isSetExec_summary();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TRuntimeProfileTree)
      return this.equals((TRuntimeProfileTree)that);
    return false;
  }

  public boolean equals(TRuntimeProfileTree that) {
    if (that == null)
      return false;

    boolean this_present_nodes = true && this.isSetNodes();
    boolean that_present_nodes = true && that.isSetNodes();
    if (this_present_nodes || that_present_nodes) {
      if (!(this_present_nodes && that_present_nodes))
        return false;
      if (!this.nodes.equals(that.nodes))
        return false;
    }

    boolean this_present_exec_summary = true && this.isSetExec_summary();
    boolean that_present_exec_summary = true && that.isSetExec_summary();
    if (this_present_exec_summary || that_present_exec_summary) {
      if (!(this_present_exec_summary && that_present_exec_summary))
        return false;
      if (!this.exec_summary.equals(that.exec_summary))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_nodes = true && (isSetNodes());
    list.add(present_nodes);
    if (present_nodes)
      list.add(nodes);

    boolean present_exec_summary = true && (isSetExec_summary());
    list.add(present_exec_summary);
    if (present_exec_summary)
      list.add(exec_summary);

    return list.hashCode();
  }

  @Override
  public int compareTo(TRuntimeProfileTree other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetNodes()).compareTo(other.isSetNodes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNodes()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nodes, other.nodes);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetExec_summary()).compareTo(other.isSetExec_summary());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExec_summary()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.exec_summary, other.exec_summary);
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
    StringBuilder sb = new StringBuilder("TRuntimeProfileTree(");
    boolean first = true;

    sb.append("nodes:");
    if (this.nodes == null) {
      sb.append("null");
    } else {
      sb.append(this.nodes);
    }
    first = false;
    if (isSetExec_summary()) {
      if (!first) sb.append(", ");
      sb.append("exec_summary:");
      if (this.exec_summary == null) {
        sb.append("null");
      } else {
        sb.append(this.exec_summary);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (nodes == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'nodes' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (exec_summary != null) {
      exec_summary.validate();
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TRuntimeProfileTreeStandardSchemeFactory implements SchemeFactory {
    public TRuntimeProfileTreeStandardScheme getScheme() {
      return new TRuntimeProfileTreeStandardScheme();
    }
  }

  private static class TRuntimeProfileTreeStandardScheme extends StandardScheme<TRuntimeProfileTree> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TRuntimeProfileTree struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NODES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list92 = iprot.readListBegin();
                struct.nodes = new ArrayList<TRuntimeProfileNode>(_list92.size);
                TRuntimeProfileNode _elem93;
                for (int _i94 = 0; _i94 < _list92.size; ++_i94)
                {
                  _elem93 = new TRuntimeProfileNode();
                  _elem93.read(iprot);
                  struct.nodes.add(_elem93);
                }
                iprot.readListEnd();
              }
              struct.setNodesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // EXEC_SUMMARY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.exec_summary = new org.apache.impala.thrift.TExecSummary();
              struct.exec_summary.read(iprot);
              struct.setExec_summaryIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TRuntimeProfileTree struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.nodes != null) {
        oprot.writeFieldBegin(NODES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.nodes.size()));
          for (TRuntimeProfileNode _iter95 : struct.nodes)
          {
            _iter95.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.exec_summary != null) {
        if (struct.isSetExec_summary()) {
          oprot.writeFieldBegin(EXEC_SUMMARY_FIELD_DESC);
          struct.exec_summary.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TRuntimeProfileTreeTupleSchemeFactory implements SchemeFactory {
    public TRuntimeProfileTreeTupleScheme getScheme() {
      return new TRuntimeProfileTreeTupleScheme();
    }
  }

  private static class TRuntimeProfileTreeTupleScheme extends TupleScheme<TRuntimeProfileTree> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TRuntimeProfileTree struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.nodes.size());
        for (TRuntimeProfileNode _iter96 : struct.nodes)
        {
          _iter96.write(oprot);
        }
      }
      BitSet optionals = new BitSet();
      if (struct.isSetExec_summary()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetExec_summary()) {
        struct.exec_summary.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TRuntimeProfileTree struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list97 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.nodes = new ArrayList<TRuntimeProfileNode>(_list97.size);
        TRuntimeProfileNode _elem98;
        for (int _i99 = 0; _i99 < _list97.size; ++_i99)
        {
          _elem98 = new TRuntimeProfileNode();
          _elem98.read(iprot);
          struct.nodes.add(_elem98);
        }
      }
      struct.setNodesIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.exec_summary = new org.apache.impala.thrift.TExecSummary();
        struct.exec_summary.read(iprot);
        struct.setExec_summaryIsSet(true);
      }
    }
  }

}

