/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
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

public class DeleteSquareChatRequest implements org.apache.thrift.TBase<DeleteSquareChatRequest, DeleteSquareChatRequest._Fields>, java.io.Serializable, Cloneable, Comparable<DeleteSquareChatRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DeleteSquareChatRequest");

  private static final org.apache.thrift.protocol.TField SQUARE_CHAT_MID_FIELD_DESC = new org.apache.thrift.protocol.TField("squareChatMid", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField REVISION_FIELD_DESC = new org.apache.thrift.protocol.TField("revision", org.apache.thrift.protocol.TType.I64, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DeleteSquareChatRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DeleteSquareChatRequestTupleSchemeFactory());
  }

  public String squareChatMid; // required
  public long revision; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SQUARE_CHAT_MID((short)1, "squareChatMid"),
    REVISION((short)2, "revision");

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
        case 1: // SQUARE_CHAT_MID
          return SQUARE_CHAT_MID;
        case 2: // REVISION
          return REVISION;
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
  private static final int __REVISION_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SQUARE_CHAT_MID, new org.apache.thrift.meta_data.FieldMetaData("squareChatMid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.REVISION, new org.apache.thrift.meta_data.FieldMetaData("revision", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DeleteSquareChatRequest.class, metaDataMap);
  }

  public DeleteSquareChatRequest() {
  }

  public DeleteSquareChatRequest(
    String squareChatMid,
    long revision)
  {
    this();
    this.squareChatMid = squareChatMid;
    this.revision = revision;
    setRevisionIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DeleteSquareChatRequest(DeleteSquareChatRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetSquareChatMid()) {
      this.squareChatMid = other.squareChatMid;
    }
    this.revision = other.revision;
  }

  public DeleteSquareChatRequest deepCopy() {
    return new DeleteSquareChatRequest(this);
  }

  @Override
  public void clear() {
    this.squareChatMid = null;
    setRevisionIsSet(false);
    this.revision = 0;
  }

  public String getSquareChatMid() {
    return this.squareChatMid;
  }

  public DeleteSquareChatRequest setSquareChatMid(String squareChatMid) {
    this.squareChatMid = squareChatMid;
    return this;
  }

  public void unsetSquareChatMid() {
    this.squareChatMid = null;
  }

  /** Returns true if field squareChatMid is set (has been assigned a value) and false otherwise */
  public boolean isSetSquareChatMid() {
    return this.squareChatMid != null;
  }

  public void setSquareChatMidIsSet(boolean value) {
    if (!value) {
      this.squareChatMid = null;
    }
  }

  public long getRevision() {
    return this.revision;
  }

  public DeleteSquareChatRequest setRevision(long revision) {
    this.revision = revision;
    setRevisionIsSet(true);
    return this;
  }

  public void unsetRevision() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __REVISION_ISSET_ID);
  }

  /** Returns true if field revision is set (has been assigned a value) and false otherwise */
  public boolean isSetRevision() {
    return EncodingUtils.testBit(__isset_bitfield, __REVISION_ISSET_ID);
  }

  public void setRevisionIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __REVISION_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SQUARE_CHAT_MID:
      if (value == null) {
        unsetSquareChatMid();
      } else {
        setSquareChatMid((String)value);
      }
      break;

    case REVISION:
      if (value == null) {
        unsetRevision();
      } else {
        setRevision((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SQUARE_CHAT_MID:
      return getSquareChatMid();

    case REVISION:
      return Long.valueOf(getRevision());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SQUARE_CHAT_MID:
      return isSetSquareChatMid();
    case REVISION:
      return isSetRevision();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DeleteSquareChatRequest)
      return this.equals((DeleteSquareChatRequest)that);
    return false;
  }

  public boolean equals(DeleteSquareChatRequest that) {
    if (that == null)
      return false;

    boolean this_present_squareChatMid = true && this.isSetSquareChatMid();
    boolean that_present_squareChatMid = true && that.isSetSquareChatMid();
    if (this_present_squareChatMid || that_present_squareChatMid) {
      if (!(this_present_squareChatMid && that_present_squareChatMid))
        return false;
      if (!this.squareChatMid.equals(that.squareChatMid))
        return false;
    }

    boolean this_present_revision = true;
    boolean that_present_revision = true;
    if (this_present_revision || that_present_revision) {
      if (!(this_present_revision && that_present_revision))
        return false;
      if (this.revision != that.revision)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(DeleteSquareChatRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSquareChatMid()).compareTo(other.isSetSquareChatMid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSquareChatMid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.squareChatMid, other.squareChatMid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRevision()).compareTo(other.isSetRevision());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRevision()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.revision, other.revision);
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
    StringBuilder sb = new StringBuilder("DeleteSquareChatRequest(");
    boolean first = true;

    sb.append("squareChatMid:");
    if (this.squareChatMid == null) {
      sb.append("null");
    } else {
      sb.append(this.squareChatMid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("revision:");
    sb.append(this.revision);
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class DeleteSquareChatRequestStandardSchemeFactory implements SchemeFactory {
    public DeleteSquareChatRequestStandardScheme getScheme() {
      return new DeleteSquareChatRequestStandardScheme();
    }
  }

  private static class DeleteSquareChatRequestStandardScheme extends StandardScheme<DeleteSquareChatRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DeleteSquareChatRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SQUARE_CHAT_MID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.squareChatMid = iprot.readString();
              struct.setSquareChatMidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // REVISION
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.revision = iprot.readI64();
              struct.setRevisionIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, DeleteSquareChatRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.squareChatMid != null) {
        oprot.writeFieldBegin(SQUARE_CHAT_MID_FIELD_DESC);
        oprot.writeString(struct.squareChatMid);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(REVISION_FIELD_DESC);
      oprot.writeI64(struct.revision);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DeleteSquareChatRequestTupleSchemeFactory implements SchemeFactory {
    public DeleteSquareChatRequestTupleScheme getScheme() {
      return new DeleteSquareChatRequestTupleScheme();
    }
  }

  private static class DeleteSquareChatRequestTupleScheme extends TupleScheme<DeleteSquareChatRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DeleteSquareChatRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetSquareChatMid()) {
        optionals.set(0);
      }
      if (struct.isSetRevision()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetSquareChatMid()) {
        oprot.writeString(struct.squareChatMid);
      }
      if (struct.isSetRevision()) {
        oprot.writeI64(struct.revision);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DeleteSquareChatRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.squareChatMid = iprot.readString();
        struct.setSquareChatMidIsSet(true);
      }
      if (incoming.get(1)) {
        struct.revision = iprot.readI64();
        struct.setRevisionIsSet(true);
      }
    }
  }

}
