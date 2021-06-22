/**
 * Autogenerated by Thrift Compiler (0.14.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.ql.plan.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.1)")
public class Adjacency implements org.apache.thrift.TBase<Adjacency, Adjacency._Fields>, java.io.Serializable, Cloneable, Comparable<Adjacency> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Adjacency");

  private static final org.apache.thrift.protocol.TField NODE_FIELD_DESC = new org.apache.thrift.protocol.TField("node", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField CHILDREN_FIELD_DESC = new org.apache.thrift.protocol.TField("children", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField ADJACENCY_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("adjacencyType", org.apache.thrift.protocol.TType.I32, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new AdjacencyStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new AdjacencyTupleSchemeFactory();

  private @org.apache.thrift.annotation.Nullable java.lang.String node; // required
  private @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> children; // required
  private @org.apache.thrift.annotation.Nullable AdjacencyType adjacencyType; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NODE((short)1, "node"),
    CHILDREN((short)2, "children"),
    /**
     * 
     * @see AdjacencyType
     */
    ADJACENCY_TYPE((short)3, "adjacencyType");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // NODE
          return NODE;
        case 2: // CHILDREN
          return CHILDREN;
        case 3: // ADJACENCY_TYPE
          return ADJACENCY_TYPE;
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
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NODE, new org.apache.thrift.meta_data.FieldMetaData("node", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CHILDREN, new org.apache.thrift.meta_data.FieldMetaData("children", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.ADJACENCY_TYPE, new org.apache.thrift.meta_data.FieldMetaData("adjacencyType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, AdjacencyType.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Adjacency.class, metaDataMap);
  }

  public Adjacency() {
  }

  public Adjacency(
    java.lang.String node,
    java.util.List<java.lang.String> children,
    AdjacencyType adjacencyType)
  {
    this();
    this.node = node;
    this.children = children;
    this.adjacencyType = adjacencyType;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Adjacency(Adjacency other) {
    if (other.isSetNode()) {
      this.node = other.node;
    }
    if (other.isSetChildren()) {
      java.util.List<java.lang.String> __this__children = new java.util.ArrayList<java.lang.String>(other.children);
      this.children = __this__children;
    }
    if (other.isSetAdjacencyType()) {
      this.adjacencyType = other.adjacencyType;
    }
  }

  public Adjacency deepCopy() {
    return new Adjacency(this);
  }

  @Override
  public void clear() {
    this.node = null;
    this.children = null;
    this.adjacencyType = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getNode() {
    return this.node;
  }

  public void setNode(@org.apache.thrift.annotation.Nullable java.lang.String node) {
    this.node = node;
  }

  public void unsetNode() {
    this.node = null;
  }

  /** Returns true if field node is set (has been assigned a value) and false otherwise */
  public boolean isSetNode() {
    return this.node != null;
  }

  public void setNodeIsSet(boolean value) {
    if (!value) {
      this.node = null;
    }
  }

  public int getChildrenSize() {
    return (this.children == null) ? 0 : this.children.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.String> getChildrenIterator() {
    return (this.children == null) ? null : this.children.iterator();
  }

  public void addToChildren(java.lang.String elem) {
    if (this.children == null) {
      this.children = new java.util.ArrayList<java.lang.String>();
    }
    this.children.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.String> getChildren() {
    return this.children;
  }

  public void setChildren(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> children) {
    this.children = children;
  }

  public void unsetChildren() {
    this.children = null;
  }

  /** Returns true if field children is set (has been assigned a value) and false otherwise */
  public boolean isSetChildren() {
    return this.children != null;
  }

  public void setChildrenIsSet(boolean value) {
    if (!value) {
      this.children = null;
    }
  }

  /**
   * 
   * @see AdjacencyType
   */
  @org.apache.thrift.annotation.Nullable
  public AdjacencyType getAdjacencyType() {
    return this.adjacencyType;
  }

  /**
   * 
   * @see AdjacencyType
   */
  public void setAdjacencyType(@org.apache.thrift.annotation.Nullable AdjacencyType adjacencyType) {
    this.adjacencyType = adjacencyType;
  }

  public void unsetAdjacencyType() {
    this.adjacencyType = null;
  }

  /** Returns true if field adjacencyType is set (has been assigned a value) and false otherwise */
  public boolean isSetAdjacencyType() {
    return this.adjacencyType != null;
  }

  public void setAdjacencyTypeIsSet(boolean value) {
    if (!value) {
      this.adjacencyType = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case NODE:
      if (value == null) {
        unsetNode();
      } else {
        setNode((java.lang.String)value);
      }
      break;

    case CHILDREN:
      if (value == null) {
        unsetChildren();
      } else {
        setChildren((java.util.List<java.lang.String>)value);
      }
      break;

    case ADJACENCY_TYPE:
      if (value == null) {
        unsetAdjacencyType();
      } else {
        setAdjacencyType((AdjacencyType)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case NODE:
      return getNode();

    case CHILDREN:
      return getChildren();

    case ADJACENCY_TYPE:
      return getAdjacencyType();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case NODE:
      return isSetNode();
    case CHILDREN:
      return isSetChildren();
    case ADJACENCY_TYPE:
      return isSetAdjacencyType();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof Adjacency)
      return this.equals((Adjacency)that);
    return false;
  }

  public boolean equals(Adjacency that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_node = true && this.isSetNode();
    boolean that_present_node = true && that.isSetNode();
    if (this_present_node || that_present_node) {
      if (!(this_present_node && that_present_node))
        return false;
      if (!this.node.equals(that.node))
        return false;
    }

    boolean this_present_children = true && this.isSetChildren();
    boolean that_present_children = true && that.isSetChildren();
    if (this_present_children || that_present_children) {
      if (!(this_present_children && that_present_children))
        return false;
      if (!this.children.equals(that.children))
        return false;
    }

    boolean this_present_adjacencyType = true && this.isSetAdjacencyType();
    boolean that_present_adjacencyType = true && that.isSetAdjacencyType();
    if (this_present_adjacencyType || that_present_adjacencyType) {
      if (!(this_present_adjacencyType && that_present_adjacencyType))
        return false;
      if (!this.adjacencyType.equals(that.adjacencyType))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetNode()) ? 131071 : 524287);
    if (isSetNode())
      hashCode = hashCode * 8191 + node.hashCode();

    hashCode = hashCode * 8191 + ((isSetChildren()) ? 131071 : 524287);
    if (isSetChildren())
      hashCode = hashCode * 8191 + children.hashCode();

    hashCode = hashCode * 8191 + ((isSetAdjacencyType()) ? 131071 : 524287);
    if (isSetAdjacencyType())
      hashCode = hashCode * 8191 + adjacencyType.getValue();

    return hashCode;
  }

  @Override
  public int compareTo(Adjacency other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetNode(), other.isSetNode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.node, other.node);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetChildren(), other.isSetChildren());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetChildren()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.children, other.children);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetAdjacencyType(), other.isSetAdjacencyType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAdjacencyType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.adjacencyType, other.adjacencyType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Adjacency(");
    boolean first = true;

    sb.append("node:");
    if (this.node == null) {
      sb.append("null");
    } else {
      sb.append(this.node);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("children:");
    if (this.children == null) {
      sb.append("null");
    } else {
      sb.append(this.children);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("adjacencyType:");
    if (this.adjacencyType == null) {
      sb.append("null");
    } else {
      sb.append(this.adjacencyType);
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

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class AdjacencyStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public AdjacencyStandardScheme getScheme() {
      return new AdjacencyStandardScheme();
    }
  }

  private static class AdjacencyStandardScheme extends org.apache.thrift.scheme.StandardScheme<Adjacency> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Adjacency struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NODE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.node = iprot.readString();
              struct.setNodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CHILDREN
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.children = new java.util.ArrayList<java.lang.String>(_list0.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = iprot.readString();
                  struct.children.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setChildrenIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ADJACENCY_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.adjacencyType = org.apache.hadoop.hive.ql.plan.api.AdjacencyType.findByValue(iprot.readI32());
              struct.setAdjacencyTypeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Adjacency struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.node != null) {
        oprot.writeFieldBegin(NODE_FIELD_DESC);
        oprot.writeString(struct.node);
        oprot.writeFieldEnd();
      }
      if (struct.children != null) {
        oprot.writeFieldBegin(CHILDREN_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.children.size()));
          for (java.lang.String _iter3 : struct.children)
          {
            oprot.writeString(_iter3);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.adjacencyType != null) {
        oprot.writeFieldBegin(ADJACENCY_TYPE_FIELD_DESC);
        oprot.writeI32(struct.adjacencyType.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AdjacencyTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public AdjacencyTupleScheme getScheme() {
      return new AdjacencyTupleScheme();
    }
  }

  private static class AdjacencyTupleScheme extends org.apache.thrift.scheme.TupleScheme<Adjacency> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Adjacency struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetNode()) {
        optionals.set(0);
      }
      if (struct.isSetChildren()) {
        optionals.set(1);
      }
      if (struct.isSetAdjacencyType()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetNode()) {
        oprot.writeString(struct.node);
      }
      if (struct.isSetChildren()) {
        {
          oprot.writeI32(struct.children.size());
          for (java.lang.String _iter4 : struct.children)
          {
            oprot.writeString(_iter4);
          }
        }
      }
      if (struct.isSetAdjacencyType()) {
        oprot.writeI32(struct.adjacencyType.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Adjacency struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.node = iprot.readString();
        struct.setNodeIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list5 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRING);
          struct.children = new java.util.ArrayList<java.lang.String>(_list5.size);
          @org.apache.thrift.annotation.Nullable java.lang.String _elem6;
          for (int _i7 = 0; _i7 < _list5.size; ++_i7)
          {
            _elem6 = iprot.readString();
            struct.children.add(_elem6);
          }
        }
        struct.setChildrenIsSet(true);
      }
      if (incoming.get(2)) {
        struct.adjacencyType = org.apache.hadoop.hive.ql.plan.api.AdjacencyType.findByValue(iprot.readI32());
        struct.setAdjacencyTypeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

