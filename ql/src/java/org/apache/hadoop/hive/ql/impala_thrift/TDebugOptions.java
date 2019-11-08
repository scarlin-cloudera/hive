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
public class TDebugOptions implements org.apache.thrift.TBase<TDebugOptions, TDebugOptions._Fields>, java.io.Serializable, Cloneable, Comparable<TDebugOptions> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDebugOptions");

  private static final org.apache.thrift.protocol.TField NODE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("node_id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField PHASE_FIELD_DESC = new org.apache.thrift.protocol.TField("phase", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField ACTION_FIELD_DESC = new org.apache.thrift.protocol.TField("action", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField ACTION_PARAM_FIELD_DESC = new org.apache.thrift.protocol.TField("action_param", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TDebugOptionsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TDebugOptionsTupleSchemeFactory());
  }

  public int node_id; // optional
  /**
   * 
   * @see org.apache.impala.thrift.TExecNodePhase
   */
  public org.apache.impala.thrift.TExecNodePhase phase; // optional
  /**
   * 
   * @see org.apache.impala.thrift.TDebugAction
   */
  public org.apache.impala.thrift.TDebugAction action; // optional
  public String action_param; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NODE_ID((short)1, "node_id"),
    /**
     * 
     * @see org.apache.impala.thrift.TExecNodePhase
     */
    PHASE((short)2, "phase"),
    /**
     * 
     * @see org.apache.impala.thrift.TDebugAction
     */
    ACTION((short)3, "action"),
    ACTION_PARAM((short)4, "action_param");

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
        case 2: // PHASE
          return PHASE;
        case 3: // ACTION
          return ACTION;
        case 4: // ACTION_PARAM
          return ACTION_PARAM;
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
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.NODE_ID,_Fields.PHASE,_Fields.ACTION,_Fields.ACTION_PARAM};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NODE_ID, new org.apache.thrift.meta_data.FieldMetaData("node_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "TPlanNodeId")));
    tmpMap.put(_Fields.PHASE, new org.apache.thrift.meta_data.FieldMetaData("phase", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, org.apache.impala.thrift.TExecNodePhase.class)));
    tmpMap.put(_Fields.ACTION, new org.apache.thrift.meta_data.FieldMetaData("action", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, org.apache.impala.thrift.TDebugAction.class)));
    tmpMap.put(_Fields.ACTION_PARAM, new org.apache.thrift.meta_data.FieldMetaData("action_param", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDebugOptions.class, metaDataMap);
  }

  public TDebugOptions() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TDebugOptions(TDebugOptions other) {
    __isset_bitfield = other.__isset_bitfield;
    this.node_id = other.node_id;
    if (other.isSetPhase()) {
      this.phase = other.phase;
    }
    if (other.isSetAction()) {
      this.action = other.action;
    }
    if (other.isSetAction_param()) {
      this.action_param = other.action_param;
    }
  }

  public TDebugOptions deepCopy() {
    return new TDebugOptions(this);
  }

  @Override
  public void clear() {
    setNode_idIsSet(false);
    this.node_id = 0;
    this.phase = null;
    this.action = null;
    this.action_param = null;
  }

  public int getNode_id() {
    return this.node_id;
  }

  public TDebugOptions setNode_id(int node_id) {
    this.node_id = node_id;
    setNode_idIsSet(true);
    return this;
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

  /**
   * 
   * @see org.apache.impala.thrift.TExecNodePhase
   */
  public org.apache.impala.thrift.TExecNodePhase getPhase() {
    return this.phase;
  }

  /**
   * 
   * @see org.apache.impala.thrift.TExecNodePhase
   */
  public TDebugOptions setPhase(org.apache.impala.thrift.TExecNodePhase phase) {
    this.phase = phase;
    return this;
  }

  public void unsetPhase() {
    this.phase = null;
  }

  /** Returns true if field phase is set (has been assigned a value) and false otherwise */
  public boolean isSetPhase() {
    return this.phase != null;
  }

  public void setPhaseIsSet(boolean value) {
    if (!value) {
      this.phase = null;
    }
  }

  /**
   * 
   * @see org.apache.impala.thrift.TDebugAction
   */
  public org.apache.impala.thrift.TDebugAction getAction() {
    return this.action;
  }

  /**
   * 
   * @see org.apache.impala.thrift.TDebugAction
   */
  public TDebugOptions setAction(org.apache.impala.thrift.TDebugAction action) {
    this.action = action;
    return this;
  }

  public void unsetAction() {
    this.action = null;
  }

  /** Returns true if field action is set (has been assigned a value) and false otherwise */
  public boolean isSetAction() {
    return this.action != null;
  }

  public void setActionIsSet(boolean value) {
    if (!value) {
      this.action = null;
    }
  }

  public String getAction_param() {
    return this.action_param;
  }

  public TDebugOptions setAction_param(String action_param) {
    this.action_param = action_param;
    return this;
  }

  public void unsetAction_param() {
    this.action_param = null;
  }

  /** Returns true if field action_param is set (has been assigned a value) and false otherwise */
  public boolean isSetAction_param() {
    return this.action_param != null;
  }

  public void setAction_paramIsSet(boolean value) {
    if (!value) {
      this.action_param = null;
    }
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

    case PHASE:
      if (value == null) {
        unsetPhase();
      } else {
        setPhase((org.apache.impala.thrift.TExecNodePhase)value);
      }
      break;

    case ACTION:
      if (value == null) {
        unsetAction();
      } else {
        setAction((org.apache.impala.thrift.TDebugAction)value);
      }
      break;

    case ACTION_PARAM:
      if (value == null) {
        unsetAction_param();
      } else {
        setAction_param((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NODE_ID:
      return getNode_id();

    case PHASE:
      return getPhase();

    case ACTION:
      return getAction();

    case ACTION_PARAM:
      return getAction_param();

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
    case PHASE:
      return isSetPhase();
    case ACTION:
      return isSetAction();
    case ACTION_PARAM:
      return isSetAction_param();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TDebugOptions)
      return this.equals((TDebugOptions)that);
    return false;
  }

  public boolean equals(TDebugOptions that) {
    if (that == null)
      return false;

    boolean this_present_node_id = true && this.isSetNode_id();
    boolean that_present_node_id = true && that.isSetNode_id();
    if (this_present_node_id || that_present_node_id) {
      if (!(this_present_node_id && that_present_node_id))
        return false;
      if (this.node_id != that.node_id)
        return false;
    }

    boolean this_present_phase = true && this.isSetPhase();
    boolean that_present_phase = true && that.isSetPhase();
    if (this_present_phase || that_present_phase) {
      if (!(this_present_phase && that_present_phase))
        return false;
      if (!this.phase.equals(that.phase))
        return false;
    }

    boolean this_present_action = true && this.isSetAction();
    boolean that_present_action = true && that.isSetAction();
    if (this_present_action || that_present_action) {
      if (!(this_present_action && that_present_action))
        return false;
      if (!this.action.equals(that.action))
        return false;
    }

    boolean this_present_action_param = true && this.isSetAction_param();
    boolean that_present_action_param = true && that.isSetAction_param();
    if (this_present_action_param || that_present_action_param) {
      if (!(this_present_action_param && that_present_action_param))
        return false;
      if (!this.action_param.equals(that.action_param))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_node_id = true && (isSetNode_id());
    list.add(present_node_id);
    if (present_node_id)
      list.add(node_id);

    boolean present_phase = true && (isSetPhase());
    list.add(present_phase);
    if (present_phase)
      list.add(phase.getValue());

    boolean present_action = true && (isSetAction());
    list.add(present_action);
    if (present_action)
      list.add(action.getValue());

    boolean present_action_param = true && (isSetAction_param());
    list.add(present_action_param);
    if (present_action_param)
      list.add(action_param);

    return list.hashCode();
  }

  @Override
  public int compareTo(TDebugOptions other) {
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
    lastComparison = Boolean.valueOf(isSetPhase()).compareTo(other.isSetPhase());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPhase()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.phase, other.phase);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAction()).compareTo(other.isSetAction());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAction()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.action, other.action);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAction_param()).compareTo(other.isSetAction_param());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAction_param()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.action_param, other.action_param);
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
    StringBuilder sb = new StringBuilder("TDebugOptions(");
    boolean first = true;

    if (isSetNode_id()) {
      sb.append("node_id:");
      sb.append(this.node_id);
      first = false;
    }
    if (isSetPhase()) {
      if (!first) sb.append(", ");
      sb.append("phase:");
      if (this.phase == null) {
        sb.append("null");
      } else {
        sb.append(this.phase);
      }
      first = false;
    }
    if (isSetAction()) {
      if (!first) sb.append(", ");
      sb.append("action:");
      if (this.action == null) {
        sb.append("null");
      } else {
        sb.append(this.action);
      }
      first = false;
    }
    if (isSetAction_param()) {
      if (!first) sb.append(", ");
      sb.append("action_param:");
      if (this.action_param == null) {
        sb.append("null");
      } else {
        sb.append(this.action_param);
      }
      first = false;
    }
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TDebugOptionsStandardSchemeFactory implements SchemeFactory {
    public TDebugOptionsStandardScheme getScheme() {
      return new TDebugOptionsStandardScheme();
    }
  }

  private static class TDebugOptionsStandardScheme extends StandardScheme<TDebugOptions> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TDebugOptions struct) throws org.apache.thrift.TException {
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
          case 2: // PHASE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.phase = org.apache.impala.thrift.TExecNodePhase.findByValue(iprot.readI32());
              struct.setPhaseIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ACTION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.action = org.apache.impala.thrift.TDebugAction.findByValue(iprot.readI32());
              struct.setActionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ACTION_PARAM
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.action_param = iprot.readString();
              struct.setAction_paramIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TDebugOptions struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetNode_id()) {
        oprot.writeFieldBegin(NODE_ID_FIELD_DESC);
        oprot.writeI32(struct.node_id);
        oprot.writeFieldEnd();
      }
      if (struct.phase != null) {
        if (struct.isSetPhase()) {
          oprot.writeFieldBegin(PHASE_FIELD_DESC);
          oprot.writeI32(struct.phase.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.action != null) {
        if (struct.isSetAction()) {
          oprot.writeFieldBegin(ACTION_FIELD_DESC);
          oprot.writeI32(struct.action.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.action_param != null) {
        if (struct.isSetAction_param()) {
          oprot.writeFieldBegin(ACTION_PARAM_FIELD_DESC);
          oprot.writeString(struct.action_param);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TDebugOptionsTupleSchemeFactory implements SchemeFactory {
    public TDebugOptionsTupleScheme getScheme() {
      return new TDebugOptionsTupleScheme();
    }
  }

  private static class TDebugOptionsTupleScheme extends TupleScheme<TDebugOptions> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TDebugOptions struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetNode_id()) {
        optionals.set(0);
      }
      if (struct.isSetPhase()) {
        optionals.set(1);
      }
      if (struct.isSetAction()) {
        optionals.set(2);
      }
      if (struct.isSetAction_param()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetNode_id()) {
        oprot.writeI32(struct.node_id);
      }
      if (struct.isSetPhase()) {
        oprot.writeI32(struct.phase.getValue());
      }
      if (struct.isSetAction()) {
        oprot.writeI32(struct.action.getValue());
      }
      if (struct.isSetAction_param()) {
        oprot.writeString(struct.action_param);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TDebugOptions struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.node_id = iprot.readI32();
        struct.setNode_idIsSet(true);
      }
      if (incoming.get(1)) {
        struct.phase = org.apache.impala.thrift.TExecNodePhase.findByValue(iprot.readI32());
        struct.setPhaseIsSet(true);
      }
      if (incoming.get(2)) {
        struct.action = org.apache.impala.thrift.TDebugAction.findByValue(iprot.readI32());
        struct.setActionIsSet(true);
      }
      if (incoming.get(3)) {
        struct.action_param = iprot.readString();
        struct.setAction_paramIsSet(true);
      }
    }
  }

}

