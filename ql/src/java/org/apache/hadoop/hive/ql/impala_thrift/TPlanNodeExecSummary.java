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
public class TPlanNodeExecSummary implements org.apache.thrift.TBase<TPlanNodeExecSummary, TPlanNodeExecSummary._Fields>, java.io.Serializable, Cloneable, Comparable<TPlanNodeExecSummary> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TPlanNodeExecSummary");

  private static final org.apache.thrift.protocol.TField NODE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("node_id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField FRAGMENT_IDX_FIELD_DESC = new org.apache.thrift.protocol.TField("fragment_idx", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField LABEL_FIELD_DESC = new org.apache.thrift.protocol.TField("label", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField LABEL_DETAIL_FIELD_DESC = new org.apache.thrift.protocol.TField("label_detail", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField NUM_CHILDREN_FIELD_DESC = new org.apache.thrift.protocol.TField("num_children", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField ESTIMATED_STATS_FIELD_DESC = new org.apache.thrift.protocol.TField("estimated_stats", org.apache.thrift.protocol.TType.STRUCT, (short)6);
  private static final org.apache.thrift.protocol.TField EXEC_STATS_FIELD_DESC = new org.apache.thrift.protocol.TField("exec_stats", org.apache.thrift.protocol.TType.LIST, (short)7);
  private static final org.apache.thrift.protocol.TField IS_BROADCAST_FIELD_DESC = new org.apache.thrift.protocol.TField("is_broadcast", org.apache.thrift.protocol.TType.BOOL, (short)8);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TPlanNodeExecSummaryStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TPlanNodeExecSummaryTupleSchemeFactory());
  }

  private int node_id; // required
  private int fragment_idx; // required
  private String label; // required
  private String label_detail; // optional
  private int num_children; // required
  private TExecStats estimated_stats; // optional
  private List<TExecStats> exec_stats; // optional
  private boolean is_broadcast; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NODE_ID((short)1, "node_id"),
    FRAGMENT_IDX((short)2, "fragment_idx"),
    LABEL((short)3, "label"),
    LABEL_DETAIL((short)4, "label_detail"),
    NUM_CHILDREN((short)5, "num_children"),
    ESTIMATED_STATS((short)6, "estimated_stats"),
    EXEC_STATS((short)7, "exec_stats"),
    IS_BROADCAST((short)8, "is_broadcast");

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
        case 1: // NODE_ID
          return NODE_ID;
        case 2: // FRAGMENT_IDX
          return FRAGMENT_IDX;
        case 3: // LABEL
          return LABEL;
        case 4: // LABEL_DETAIL
          return LABEL_DETAIL;
        case 5: // NUM_CHILDREN
          return NUM_CHILDREN;
        case 6: // ESTIMATED_STATS
          return ESTIMATED_STATS;
        case 7: // EXEC_STATS
          return EXEC_STATS;
        case 8: // IS_BROADCAST
          return IS_BROADCAST;
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
  private static final int __NODE_ID_ISSET_ID = 0;
  private static final int __FRAGMENT_IDX_ISSET_ID = 1;
  private static final int __NUM_CHILDREN_ISSET_ID = 2;
  private static final int __IS_BROADCAST_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.LABEL_DETAIL,_Fields.ESTIMATED_STATS,_Fields.EXEC_STATS,_Fields.IS_BROADCAST};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NODE_ID, new org.apache.thrift.meta_data.FieldMetaData("node_id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "TPlanNodeId")));
    tmpMap.put(_Fields.FRAGMENT_IDX, new org.apache.thrift.meta_data.FieldMetaData("fragment_idx", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "TFragmentIdx")));
    tmpMap.put(_Fields.LABEL, new org.apache.thrift.meta_data.FieldMetaData("label", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.LABEL_DETAIL, new org.apache.thrift.meta_data.FieldMetaData("label_detail", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NUM_CHILDREN, new org.apache.thrift.meta_data.FieldMetaData("num_children", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.ESTIMATED_STATS, new org.apache.thrift.meta_data.FieldMetaData("estimated_stats", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TExecStats.class)));
    tmpMap.put(_Fields.EXEC_STATS, new org.apache.thrift.meta_data.FieldMetaData("exec_stats", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TExecStats.class))));
    tmpMap.put(_Fields.IS_BROADCAST, new org.apache.thrift.meta_data.FieldMetaData("is_broadcast", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TPlanNodeExecSummary.class, metaDataMap);
  }

  public TPlanNodeExecSummary() {
  }

  public TPlanNodeExecSummary(
    int node_id,
    int fragment_idx,
    String label,
    int num_children)
  {
    this();
    this.node_id = node_id;
    setNode_idIsSet(true);
    this.fragment_idx = fragment_idx;
    setFragment_idxIsSet(true);
    this.label = label;
    this.num_children = num_children;
    setNum_childrenIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TPlanNodeExecSummary(TPlanNodeExecSummary other) {
    __isset_bitfield = other.__isset_bitfield;
    this.node_id = other.node_id;
    this.fragment_idx = other.fragment_idx;
    if (other.isSetLabel()) {
      this.label = other.label;
    }
    if (other.isSetLabel_detail()) {
      this.label_detail = other.label_detail;
    }
    this.num_children = other.num_children;
    if (other.isSetEstimated_stats()) {
      this.estimated_stats = new TExecStats(other.estimated_stats);
    }
    if (other.isSetExec_stats()) {
      List<TExecStats> __this__exec_stats = new ArrayList<TExecStats>(other.exec_stats.size());
      for (TExecStats other_element : other.exec_stats) {
        __this__exec_stats.add(new TExecStats(other_element));
      }
      this.exec_stats = __this__exec_stats;
    }
    this.is_broadcast = other.is_broadcast;
  }

  public TPlanNodeExecSummary deepCopy() {
    return new TPlanNodeExecSummary(this);
  }

  @Override
  public void clear() {
    setNode_idIsSet(false);
    this.node_id = 0;
    setFragment_idxIsSet(false);
    this.fragment_idx = 0;
    this.label = null;
    this.label_detail = null;
    setNum_childrenIsSet(false);
    this.num_children = 0;
    this.estimated_stats = null;
    this.exec_stats = null;
    setIs_broadcastIsSet(false);
    this.is_broadcast = false;
  }

  public int getNode_id() {
    return this.node_id;
  }

  public void setNode_id(int node_id) {
    this.node_id = node_id;
    setNode_idIsSet(true);
  }

  public void unsetNode_id() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __NODE_ID_ISSET_ID);
  }

  /** Returns true if field node_id is set (has been assigned a value) and false otherwise */
  public boolean isSetNode_id() {
    return EncodingUtils.testBit(__isset_bitfield, __NODE_ID_ISSET_ID);
  }

  public void setNode_idIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __NODE_ID_ISSET_ID, value);
  }

  public int getFragment_idx() {
    return this.fragment_idx;
  }

  public void setFragment_idx(int fragment_idx) {
    this.fragment_idx = fragment_idx;
    setFragment_idxIsSet(true);
  }

  public void unsetFragment_idx() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __FRAGMENT_IDX_ISSET_ID);
  }

  /** Returns true if field fragment_idx is set (has been assigned a value) and false otherwise */
  public boolean isSetFragment_idx() {
    return EncodingUtils.testBit(__isset_bitfield, __FRAGMENT_IDX_ISSET_ID);
  }

  public void setFragment_idxIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __FRAGMENT_IDX_ISSET_ID, value);
  }

  public String getLabel() {
    return this.label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public void unsetLabel() {
    this.label = null;
  }

  /** Returns true if field label is set (has been assigned a value) and false otherwise */
  public boolean isSetLabel() {
    return this.label != null;
  }

  public void setLabelIsSet(boolean value) {
    if (!value) {
      this.label = null;
    }
  }

  public String getLabel_detail() {
    return this.label_detail;
  }

  public void setLabel_detail(String label_detail) {
    this.label_detail = label_detail;
  }

  public void unsetLabel_detail() {
    this.label_detail = null;
  }

  /** Returns true if field label_detail is set (has been assigned a value) and false otherwise */
  public boolean isSetLabel_detail() {
    return this.label_detail != null;
  }

  public void setLabel_detailIsSet(boolean value) {
    if (!value) {
      this.label_detail = null;
    }
  }

  public int getNum_children() {
    return this.num_children;
  }

  public void setNum_children(int num_children) {
    this.num_children = num_children;
    setNum_childrenIsSet(true);
  }

  public void unsetNum_children() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __NUM_CHILDREN_ISSET_ID);
  }

  /** Returns true if field num_children is set (has been assigned a value) and false otherwise */
  public boolean isSetNum_children() {
    return EncodingUtils.testBit(__isset_bitfield, __NUM_CHILDREN_ISSET_ID);
  }

  public void setNum_childrenIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __NUM_CHILDREN_ISSET_ID, value);
  }

  public TExecStats getEstimated_stats() {
    return this.estimated_stats;
  }

  public void setEstimated_stats(TExecStats estimated_stats) {
    this.estimated_stats = estimated_stats;
  }

  public void unsetEstimated_stats() {
    this.estimated_stats = null;
  }

  /** Returns true if field estimated_stats is set (has been assigned a value) and false otherwise */
  public boolean isSetEstimated_stats() {
    return this.estimated_stats != null;
  }

  public void setEstimated_statsIsSet(boolean value) {
    if (!value) {
      this.estimated_stats = null;
    }
  }

  public int getExec_statsSize() {
    return (this.exec_stats == null) ? 0 : this.exec_stats.size();
  }

  public java.util.Iterator<TExecStats> getExec_statsIterator() {
    return (this.exec_stats == null) ? null : this.exec_stats.iterator();
  }

  public void addToExec_stats(TExecStats elem) {
    if (this.exec_stats == null) {
      this.exec_stats = new ArrayList<TExecStats>();
    }
    this.exec_stats.add(elem);
  }

  public List<TExecStats> getExec_stats() {
    return this.exec_stats;
  }

  public void setExec_stats(List<TExecStats> exec_stats) {
    this.exec_stats = exec_stats;
  }

  public void unsetExec_stats() {
    this.exec_stats = null;
  }

  /** Returns true if field exec_stats is set (has been assigned a value) and false otherwise */
  public boolean isSetExec_stats() {
    return this.exec_stats != null;
  }

  public void setExec_statsIsSet(boolean value) {
    if (!value) {
      this.exec_stats = null;
    }
  }

  public boolean isIs_broadcast() {
    return this.is_broadcast;
  }

  public void setIs_broadcast(boolean is_broadcast) {
    this.is_broadcast = is_broadcast;
    setIs_broadcastIsSet(true);
  }

  public void unsetIs_broadcast() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __IS_BROADCAST_ISSET_ID);
  }

  /** Returns true if field is_broadcast is set (has been assigned a value) and false otherwise */
  public boolean isSetIs_broadcast() {
    return EncodingUtils.testBit(__isset_bitfield, __IS_BROADCAST_ISSET_ID);
  }

  public void setIs_broadcastIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __IS_BROADCAST_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NODE_ID:
      if (value == null) {
        unsetNode_id();
      } else {
        setNode_id((Integer)value);
      }
      break;

    case FRAGMENT_IDX:
      if (value == null) {
        unsetFragment_idx();
      } else {
        setFragment_idx((Integer)value);
      }
      break;

    case LABEL:
      if (value == null) {
        unsetLabel();
      } else {
        setLabel((String)value);
      }
      break;

    case LABEL_DETAIL:
      if (value == null) {
        unsetLabel_detail();
      } else {
        setLabel_detail((String)value);
      }
      break;

    case NUM_CHILDREN:
      if (value == null) {
        unsetNum_children();
      } else {
        setNum_children((Integer)value);
      }
      break;

    case ESTIMATED_STATS:
      if (value == null) {
        unsetEstimated_stats();
      } else {
        setEstimated_stats((TExecStats)value);
      }
      break;

    case EXEC_STATS:
      if (value == null) {
        unsetExec_stats();
      } else {
        setExec_stats((List<TExecStats>)value);
      }
      break;

    case IS_BROADCAST:
      if (value == null) {
        unsetIs_broadcast();
      } else {
        setIs_broadcast((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NODE_ID:
      return getNode_id();

    case FRAGMENT_IDX:
      return getFragment_idx();

    case LABEL:
      return getLabel();

    case LABEL_DETAIL:
      return getLabel_detail();

    case NUM_CHILDREN:
      return getNum_children();

    case ESTIMATED_STATS:
      return getEstimated_stats();

    case EXEC_STATS:
      return getExec_stats();

    case IS_BROADCAST:
      return isIs_broadcast();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NODE_ID:
      return isSetNode_id();
    case FRAGMENT_IDX:
      return isSetFragment_idx();
    case LABEL:
      return isSetLabel();
    case LABEL_DETAIL:
      return isSetLabel_detail();
    case NUM_CHILDREN:
      return isSetNum_children();
    case ESTIMATED_STATS:
      return isSetEstimated_stats();
    case EXEC_STATS:
      return isSetExec_stats();
    case IS_BROADCAST:
      return isSetIs_broadcast();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TPlanNodeExecSummary)
      return this.equals((TPlanNodeExecSummary)that);
    return false;
  }

  public boolean equals(TPlanNodeExecSummary that) {
    if (that == null)
      return false;

    boolean this_present_node_id = true;
    boolean that_present_node_id = true;
    if (this_present_node_id || that_present_node_id) {
      if (!(this_present_node_id && that_present_node_id))
        return false;
      if (this.node_id != that.node_id)
        return false;
    }

    boolean this_present_fragment_idx = true;
    boolean that_present_fragment_idx = true;
    if (this_present_fragment_idx || that_present_fragment_idx) {
      if (!(this_present_fragment_idx && that_present_fragment_idx))
        return false;
      if (this.fragment_idx != that.fragment_idx)
        return false;
    }

    boolean this_present_label = true && this.isSetLabel();
    boolean that_present_label = true && that.isSetLabel();
    if (this_present_label || that_present_label) {
      if (!(this_present_label && that_present_label))
        return false;
      if (!this.label.equals(that.label))
        return false;
    }

    boolean this_present_label_detail = true && this.isSetLabel_detail();
    boolean that_present_label_detail = true && that.isSetLabel_detail();
    if (this_present_label_detail || that_present_label_detail) {
      if (!(this_present_label_detail && that_present_label_detail))
        return false;
      if (!this.label_detail.equals(that.label_detail))
        return false;
    }

    boolean this_present_num_children = true;
    boolean that_present_num_children = true;
    if (this_present_num_children || that_present_num_children) {
      if (!(this_present_num_children && that_present_num_children))
        return false;
      if (this.num_children != that.num_children)
        return false;
    }

    boolean this_present_estimated_stats = true && this.isSetEstimated_stats();
    boolean that_present_estimated_stats = true && that.isSetEstimated_stats();
    if (this_present_estimated_stats || that_present_estimated_stats) {
      if (!(this_present_estimated_stats && that_present_estimated_stats))
        return false;
      if (!this.estimated_stats.equals(that.estimated_stats))
        return false;
    }

    boolean this_present_exec_stats = true && this.isSetExec_stats();
    boolean that_present_exec_stats = true && that.isSetExec_stats();
    if (this_present_exec_stats || that_present_exec_stats) {
      if (!(this_present_exec_stats && that_present_exec_stats))
        return false;
      if (!this.exec_stats.equals(that.exec_stats))
        return false;
    }

    boolean this_present_is_broadcast = true && this.isSetIs_broadcast();
    boolean that_present_is_broadcast = true && that.isSetIs_broadcast();
    if (this_present_is_broadcast || that_present_is_broadcast) {
      if (!(this_present_is_broadcast && that_present_is_broadcast))
        return false;
      if (this.is_broadcast != that.is_broadcast)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_node_id = true;
    list.add(present_node_id);
    if (present_node_id)
      list.add(node_id);

    boolean present_fragment_idx = true;
    list.add(present_fragment_idx);
    if (present_fragment_idx)
      list.add(fragment_idx);

    boolean present_label = true && (isSetLabel());
    list.add(present_label);
    if (present_label)
      list.add(label);

    boolean present_label_detail = true && (isSetLabel_detail());
    list.add(present_label_detail);
    if (present_label_detail)
      list.add(label_detail);

    boolean present_num_children = true;
    list.add(present_num_children);
    if (present_num_children)
      list.add(num_children);

    boolean present_estimated_stats = true && (isSetEstimated_stats());
    list.add(present_estimated_stats);
    if (present_estimated_stats)
      list.add(estimated_stats);

    boolean present_exec_stats = true && (isSetExec_stats());
    list.add(present_exec_stats);
    if (present_exec_stats)
      list.add(exec_stats);

    boolean present_is_broadcast = true && (isSetIs_broadcast());
    list.add(present_is_broadcast);
    if (present_is_broadcast)
      list.add(is_broadcast);

    return list.hashCode();
  }

  @Override
  public int compareTo(TPlanNodeExecSummary other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetNode_id()).compareTo(other.isSetNode_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNode_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.node_id, other.node_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFragment_idx()).compareTo(other.isSetFragment_idx());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFragment_idx()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fragment_idx, other.fragment_idx);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLabel()).compareTo(other.isSetLabel());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLabel()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.label, other.label);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLabel_detail()).compareTo(other.isSetLabel_detail());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLabel_detail()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.label_detail, other.label_detail);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNum_children()).compareTo(other.isSetNum_children());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNum_children()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.num_children, other.num_children);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEstimated_stats()).compareTo(other.isSetEstimated_stats());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEstimated_stats()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.estimated_stats, other.estimated_stats);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetExec_stats()).compareTo(other.isSetExec_stats());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExec_stats()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.exec_stats, other.exec_stats);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIs_broadcast()).compareTo(other.isSetIs_broadcast());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIs_broadcast()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.is_broadcast, other.is_broadcast);
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
    StringBuilder sb = new StringBuilder("TPlanNodeExecSummary(");
    boolean first = true;

    sb.append("node_id:");
    sb.append(this.node_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("fragment_idx:");
    sb.append(this.fragment_idx);
    first = false;
    if (!first) sb.append(", ");
    sb.append("label:");
    if (this.label == null) {
      sb.append("null");
    } else {
      sb.append(this.label);
    }
    first = false;
    if (isSetLabel_detail()) {
      if (!first) sb.append(", ");
      sb.append("label_detail:");
      if (this.label_detail == null) {
        sb.append("null");
      } else {
        sb.append(this.label_detail);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("num_children:");
    sb.append(this.num_children);
    first = false;
    if (isSetEstimated_stats()) {
      if (!first) sb.append(", ");
      sb.append("estimated_stats:");
      if (this.estimated_stats == null) {
        sb.append("null");
      } else {
        sb.append(this.estimated_stats);
      }
      first = false;
    }
    if (isSetExec_stats()) {
      if (!first) sb.append(", ");
      sb.append("exec_stats:");
      if (this.exec_stats == null) {
        sb.append("null");
      } else {
        sb.append(this.exec_stats);
      }
      first = false;
    }
    if (isSetIs_broadcast()) {
      if (!first) sb.append(", ");
      sb.append("is_broadcast:");
      sb.append(this.is_broadcast);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetNode_id()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'node_id' is unset! Struct:" + toString());
    }

    if (!isSetFragment_idx()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'fragment_idx' is unset! Struct:" + toString());
    }

    if (!isSetLabel()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'label' is unset! Struct:" + toString());
    }

    if (!isSetNum_children()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'num_children' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
    if (estimated_stats != null) {
      estimated_stats.validate();
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

  private static class TPlanNodeExecSummaryStandardSchemeFactory implements SchemeFactory {
    public TPlanNodeExecSummaryStandardScheme getScheme() {
      return new TPlanNodeExecSummaryStandardScheme();
    }
  }

  private static class TPlanNodeExecSummaryStandardScheme extends StandardScheme<TPlanNodeExecSummary> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TPlanNodeExecSummary struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NODE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.node_id = iprot.readI32();
              struct.setNode_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // FRAGMENT_IDX
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.fragment_idx = iprot.readI32();
              struct.setFragment_idxIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // LABEL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.label = iprot.readString();
              struct.setLabelIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // LABEL_DETAIL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.label_detail = iprot.readString();
              struct.setLabel_detailIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // NUM_CHILDREN
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.num_children = iprot.readI32();
              struct.setNum_childrenIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // ESTIMATED_STATS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.estimated_stats = new TExecStats();
              struct.estimated_stats.read(iprot);
              struct.setEstimated_statsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // EXEC_STATS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.exec_stats = new ArrayList<TExecStats>(_list0.size);
                TExecStats _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = new TExecStats();
                  _elem1.read(iprot);
                  struct.exec_stats.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setExec_statsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // IS_BROADCAST
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.is_broadcast = iprot.readBool();
              struct.setIs_broadcastIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TPlanNodeExecSummary struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(NODE_ID_FIELD_DESC);
      oprot.writeI32(struct.node_id);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(FRAGMENT_IDX_FIELD_DESC);
      oprot.writeI32(struct.fragment_idx);
      oprot.writeFieldEnd();
      if (struct.label != null) {
        oprot.writeFieldBegin(LABEL_FIELD_DESC);
        oprot.writeString(struct.label);
        oprot.writeFieldEnd();
      }
      if (struct.label_detail != null) {
        if (struct.isSetLabel_detail()) {
          oprot.writeFieldBegin(LABEL_DETAIL_FIELD_DESC);
          oprot.writeString(struct.label_detail);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldBegin(NUM_CHILDREN_FIELD_DESC);
      oprot.writeI32(struct.num_children);
      oprot.writeFieldEnd();
      if (struct.estimated_stats != null) {
        if (struct.isSetEstimated_stats()) {
          oprot.writeFieldBegin(ESTIMATED_STATS_FIELD_DESC);
          struct.estimated_stats.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.exec_stats != null) {
        if (struct.isSetExec_stats()) {
          oprot.writeFieldBegin(EXEC_STATS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.exec_stats.size()));
            for (TExecStats _iter3 : struct.exec_stats)
            {
              _iter3.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetIs_broadcast()) {
        oprot.writeFieldBegin(IS_BROADCAST_FIELD_DESC);
        oprot.writeBool(struct.is_broadcast);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TPlanNodeExecSummaryTupleSchemeFactory implements SchemeFactory {
    public TPlanNodeExecSummaryTupleScheme getScheme() {
      return new TPlanNodeExecSummaryTupleScheme();
    }
  }

  private static class TPlanNodeExecSummaryTupleScheme extends TupleScheme<TPlanNodeExecSummary> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TPlanNodeExecSummary struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.node_id);
      oprot.writeI32(struct.fragment_idx);
      oprot.writeString(struct.label);
      oprot.writeI32(struct.num_children);
      BitSet optionals = new BitSet();
      if (struct.isSetLabel_detail()) {
        optionals.set(0);
      }
      if (struct.isSetEstimated_stats()) {
        optionals.set(1);
      }
      if (struct.isSetExec_stats()) {
        optionals.set(2);
      }
      if (struct.isSetIs_broadcast()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetLabel_detail()) {
        oprot.writeString(struct.label_detail);
      }
      if (struct.isSetEstimated_stats()) {
        struct.estimated_stats.write(oprot);
      }
      if (struct.isSetExec_stats()) {
        {
          oprot.writeI32(struct.exec_stats.size());
          for (TExecStats _iter4 : struct.exec_stats)
          {
            _iter4.write(oprot);
          }
        }
      }
      if (struct.isSetIs_broadcast()) {
        oprot.writeBool(struct.is_broadcast);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TPlanNodeExecSummary struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.node_id = iprot.readI32();
      struct.setNode_idIsSet(true);
      struct.fragment_idx = iprot.readI32();
      struct.setFragment_idxIsSet(true);
      struct.label = iprot.readString();
      struct.setLabelIsSet(true);
      struct.num_children = iprot.readI32();
      struct.setNum_childrenIsSet(true);
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.label_detail = iprot.readString();
        struct.setLabel_detailIsSet(true);
      }
      if (incoming.get(1)) {
        struct.estimated_stats = new TExecStats();
        struct.estimated_stats.read(iprot);
        struct.setEstimated_statsIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.exec_stats = new ArrayList<TExecStats>(_list5.size);
          TExecStats _elem6;
          for (int _i7 = 0; _i7 < _list5.size; ++_i7)
          {
            _elem6 = new TExecStats();
            _elem6.read(iprot);
            struct.exec_stats.add(_elem6);
          }
        }
        struct.setExec_statsIsSet(true);
      }
      if (incoming.get(3)) {
        struct.is_broadcast = iprot.readBool();
        struct.setIs_broadcastIsSet(true);
      }
    }
  }

}

