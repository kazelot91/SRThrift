/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package SRBanking.ThriftInterface;

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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Swarm implements org.apache.thrift.TBase<Swarm, Swarm._Fields>, java.io.Serializable, Cloneable, Comparable<Swarm> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Swarm");

  private static final org.apache.thrift.protocol.TField TRANSFER_FIELD_DESC = new org.apache.thrift.protocol.TField("transfer", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField LEADER_FIELD_DESC = new org.apache.thrift.protocol.TField("leader", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField MEMBERS_FIELD_DESC = new org.apache.thrift.protocol.TField("members", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SwarmStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SwarmTupleSchemeFactory());
  }

  public TransferID transfer; // required
  public NodeID leader; // required
  public List<NodeID> members; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TRANSFER((short)1, "transfer"),
    LEADER((short)2, "leader"),
    MEMBERS((short)3, "members");

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
        case 1: // TRANSFER
          return TRANSFER;
        case 2: // LEADER
          return LEADER;
        case 3: // MEMBERS
          return MEMBERS;
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
    tmpMap.put(_Fields.TRANSFER, new org.apache.thrift.meta_data.FieldMetaData("transfer", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TransferID.class)));
    tmpMap.put(_Fields.LEADER, new org.apache.thrift.meta_data.FieldMetaData("leader", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, NodeID.class)));
    tmpMap.put(_Fields.MEMBERS, new org.apache.thrift.meta_data.FieldMetaData("members", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, NodeID.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Swarm.class, metaDataMap);
  }

  public Swarm() {
  }

  public Swarm(
    TransferID transfer,
    NodeID leader,
    List<NodeID> members)
  {
    this();
    this.transfer = transfer;
    this.leader = leader;
    this.members = members;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Swarm(Swarm other) {
    if (other.isSetTransfer()) {
      this.transfer = new TransferID(other.transfer);
    }
    if (other.isSetLeader()) {
      this.leader = new NodeID(other.leader);
    }
    if (other.isSetMembers()) {
      List<NodeID> __this__members = new ArrayList<NodeID>(other.members.size());
      for (NodeID other_element : other.members) {
        __this__members.add(new NodeID(other_element));
      }
      this.members = __this__members;
    }
  }

  public Swarm deepCopy() {
    return new Swarm(this);
  }

  @Override
  public void clear() {
    this.transfer = null;
    this.leader = null;
    this.members = null;
  }

  public TransferID getTransfer() {
    return this.transfer;
  }

  public Swarm setTransfer(TransferID transfer) {
    this.transfer = transfer;
    return this;
  }

  public void unsetTransfer() {
    this.transfer = null;
  }

  /** Returns true if field transfer is set (has been assigned a value) and false otherwise */
  public boolean isSetTransfer() {
    return this.transfer != null;
  }

  public void setTransferIsSet(boolean value) {
    if (!value) {
      this.transfer = null;
    }
  }

  public NodeID getLeader() {
    return this.leader;
  }

  public Swarm setLeader(NodeID leader) {
    this.leader = leader;
    return this;
  }

  public void unsetLeader() {
    this.leader = null;
  }

  /** Returns true if field leader is set (has been assigned a value) and false otherwise */
  public boolean isSetLeader() {
    return this.leader != null;
  }

  public void setLeaderIsSet(boolean value) {
    if (!value) {
      this.leader = null;
    }
  }

  public int getMembersSize() {
    return (this.members == null) ? 0 : this.members.size();
  }

  public java.util.Iterator<NodeID> getMembersIterator() {
    return (this.members == null) ? null : this.members.iterator();
  }

  public void addToMembers(NodeID elem) {
    if (this.members == null) {
      this.members = new ArrayList<NodeID>();
    }
    this.members.add(elem);
  }

  public List<NodeID> getMembers() {
    return this.members;
  }

  public Swarm setMembers(List<NodeID> members) {
    this.members = members;
    return this;
  }

  public void unsetMembers() {
    this.members = null;
  }

  /** Returns true if field members is set (has been assigned a value) and false otherwise */
  public boolean isSetMembers() {
    return this.members != null;
  }

  public void setMembersIsSet(boolean value) {
    if (!value) {
      this.members = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TRANSFER:
      if (value == null) {
        unsetTransfer();
      } else {
        setTransfer((TransferID)value);
      }
      break;

    case LEADER:
      if (value == null) {
        unsetLeader();
      } else {
        setLeader((NodeID)value);
      }
      break;

    case MEMBERS:
      if (value == null) {
        unsetMembers();
      } else {
        setMembers((List<NodeID>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TRANSFER:
      return getTransfer();

    case LEADER:
      return getLeader();

    case MEMBERS:
      return getMembers();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TRANSFER:
      return isSetTransfer();
    case LEADER:
      return isSetLeader();
    case MEMBERS:
      return isSetMembers();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Swarm)
      return this.equals((Swarm)that);
    return false;
  }

  public boolean equals(Swarm that) {
    if (that == null)
      return false;

    boolean this_present_transfer = true && this.isSetTransfer();
    boolean that_present_transfer = true && that.isSetTransfer();
    if (this_present_transfer || that_present_transfer) {
      if (!(this_present_transfer && that_present_transfer))
        return false;
      if (!this.transfer.equals(that.transfer))
        return false;
    }

    boolean this_present_leader = true && this.isSetLeader();
    boolean that_present_leader = true && that.isSetLeader();
    if (this_present_leader || that_present_leader) {
      if (!(this_present_leader && that_present_leader))
        return false;
      if (!this.leader.equals(that.leader))
        return false;
    }

    boolean this_present_members = true && this.isSetMembers();
    boolean that_present_members = true && that.isSetMembers();
    if (this_present_members || that_present_members) {
      if (!(this_present_members && that_present_members))
        return false;
      if (!this.members.equals(that.members))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(Swarm other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTransfer()).compareTo(other.isSetTransfer());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTransfer()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.transfer, other.transfer);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLeader()).compareTo(other.isSetLeader());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLeader()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.leader, other.leader);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMembers()).compareTo(other.isSetMembers());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMembers()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.members, other.members);
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
    StringBuilder sb = new StringBuilder("Swarm(");
    boolean first = true;

    sb.append("transfer:");
    if (this.transfer == null) {
      sb.append("null");
    } else {
      sb.append(this.transfer);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("leader:");
    if (this.leader == null) {
      sb.append("null");
    } else {
      sb.append(this.leader);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("members:");
    if (this.members == null) {
      sb.append("null");
    } else {
      sb.append(this.members);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (transfer != null) {
      transfer.validate();
    }
    if (leader != null) {
      leader.validate();
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

  private static class SwarmStandardSchemeFactory implements SchemeFactory {
    public SwarmStandardScheme getScheme() {
      return new SwarmStandardScheme();
    }
  }

  private static class SwarmStandardScheme extends StandardScheme<Swarm> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Swarm struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TRANSFER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.transfer = new TransferID();
              struct.transfer.read(iprot);
              struct.setTransferIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // LEADER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.leader = new NodeID();
              struct.leader.read(iprot);
              struct.setLeaderIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // MEMBERS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.members = new ArrayList<NodeID>(_list0.size);
                for (int _i1 = 0; _i1 < _list0.size; ++_i1)
                {
                  NodeID _elem2;
                  _elem2 = new NodeID();
                  _elem2.read(iprot);
                  struct.members.add(_elem2);
                }
                iprot.readListEnd();
              }
              struct.setMembersIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Swarm struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.transfer != null) {
        oprot.writeFieldBegin(TRANSFER_FIELD_DESC);
        struct.transfer.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.leader != null) {
        oprot.writeFieldBegin(LEADER_FIELD_DESC);
        struct.leader.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.members != null) {
        oprot.writeFieldBegin(MEMBERS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.members.size()));
          for (NodeID _iter3 : struct.members)
          {
            _iter3.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SwarmTupleSchemeFactory implements SchemeFactory {
    public SwarmTupleScheme getScheme() {
      return new SwarmTupleScheme();
    }
  }

  private static class SwarmTupleScheme extends TupleScheme<Swarm> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Swarm struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTransfer()) {
        optionals.set(0);
      }
      if (struct.isSetLeader()) {
        optionals.set(1);
      }
      if (struct.isSetMembers()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetTransfer()) {
        struct.transfer.write(oprot);
      }
      if (struct.isSetLeader()) {
        struct.leader.write(oprot);
      }
      if (struct.isSetMembers()) {
        {
          oprot.writeI32(struct.members.size());
          for (NodeID _iter4 : struct.members)
          {
            _iter4.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Swarm struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.transfer = new TransferID();
        struct.transfer.read(iprot);
        struct.setTransferIsSet(true);
      }
      if (incoming.get(1)) {
        struct.leader = new NodeID();
        struct.leader.read(iprot);
        struct.setLeaderIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.members = new ArrayList<NodeID>(_list5.size);
          for (int _i6 = 0; _i6 < _list5.size; ++_i6)
          {
            NodeID _elem7;
            _elem7 = new NodeID();
            _elem7.read(iprot);
            struct.members.add(_elem7);
          }
        }
        struct.setMembersIsSet(true);
      }
    }
  }

}

