/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
using System;
using System.Collections;
using System.Collections.Generic;
using System.Text;
using System.IO;
using Thrift;
using Thrift.Collections;
using System.Runtime.Serialization;
using Thrift.Protocol;
using Thrift.Transport;

namespace SRBanking.ThriftInterface
{

  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class AlreadySwarmMemeber : TException, TBase
  {
    private NodeID _receiverNode;
    private NodeID _leader;
    private TransferID _transfer;

    public NodeID ReceiverNode
    {
      get
      {
        return _receiverNode;
      }
      set
      {
        __isset.receiverNode = true;
        this._receiverNode = value;
      }
    }

    public NodeID Leader
    {
      get
      {
        return _leader;
      }
      set
      {
        __isset.leader = true;
        this._leader = value;
      }
    }

    public TransferID Transfer
    {
      get
      {
        return _transfer;
      }
      set
      {
        __isset.transfer = true;
        this._transfer = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool receiverNode;
      public bool leader;
      public bool transfer;
    }

    public AlreadySwarmMemeber() {
    }

    public void Read (TProtocol iprot)
    {
      TField field;
      iprot.ReadStructBegin();
      while (true)
      {
        field = iprot.ReadFieldBegin();
        if (field.Type == TType.Stop) { 
          break;
        }
        switch (field.ID)
        {
          case 1:
            if (field.Type == TType.Struct) {
              ReceiverNode = new NodeID();
              ReceiverNode.Read(iprot);
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.Struct) {
              Leader = new NodeID();
              Leader.Read(iprot);
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.Struct) {
              Transfer = new TransferID();
              Transfer.Read(iprot);
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          default: 
            TProtocolUtil.Skip(iprot, field.Type);
            break;
        }
        iprot.ReadFieldEnd();
      }
      iprot.ReadStructEnd();
    }

    public void Write(TProtocol oprot) {
      TStruct struc = new TStruct("AlreadySwarmMemeber");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (ReceiverNode != null && __isset.receiverNode) {
        field.Name = "receiverNode";
        field.Type = TType.Struct;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        ReceiverNode.Write(oprot);
        oprot.WriteFieldEnd();
      }
      if (Leader != null && __isset.leader) {
        field.Name = "leader";
        field.Type = TType.Struct;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        Leader.Write(oprot);
        oprot.WriteFieldEnd();
      }
      if (Transfer != null && __isset.transfer) {
        field.Name = "transfer";
        field.Type = TType.Struct;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        Transfer.Write(oprot);
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }

    public override string ToString() {
      StringBuilder sb = new StringBuilder("AlreadySwarmMemeber(");
      sb.Append("ReceiverNode: ");
      sb.Append(ReceiverNode== null ? "<null>" : ReceiverNode.ToString());
      sb.Append(",Leader: ");
      sb.Append(Leader== null ? "<null>" : Leader.ToString());
      sb.Append(",Transfer: ");
      sb.Append(Transfer== null ? "<null>" : Transfer.ToString());
      sb.Append(")");
      return sb.ToString();
    }

  }

}
