package io.elastest.epm.pop.generated;// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: client.proto

/** Protobuf type {@code FileMessage} */
public final class FileMessage extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:FileMessage)
    FileMessageOrBuilder {
  // Use FileMessage.newBuilder() to construct.
  private FileMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private FileMessage() {
    file_ = com.google.protobuf.ByteString.EMPTY;
    options_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }

  private FileMessage(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default:
            {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
          case 10:
            {
              file_ = input.readBytes();
              break;
            }
          case 18:
            {
              String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                options_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000002;
              }
              options_.add(s);
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        options_ = options_.getUnmodifiableView();
      }
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return Client.internal_static_FileMessage_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return Client.internal_static_FileMessage_fieldAccessorTable.ensureFieldAccessorsInitialized(
        FileMessage.class, Builder.class);
  }

  private int bitField0_;
  public static final int FILE_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString file_;
  /** <code>optional bytes file = 1;</code> */
  public com.google.protobuf.ByteString getFile() {
    return file_;
  }

  public static final int OPTIONS_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList options_;
  /** <code>repeated string options = 2;</code> */
  public com.google.protobuf.ProtocolStringList getOptionsList() {
    return options_;
  }
  /** <code>repeated string options = 2;</code> */
  public int getOptionsCount() {
    return options_.size();
  }
  /** <code>repeated string options = 2;</code> */
  public String getOptions(int index) {
    return options_.get(index);
  }
  /** <code>repeated string options = 2;</code> */
  public com.google.protobuf.ByteString getOptionsBytes(int index) {
    return options_.getByteString(index);
  }

  private byte memoizedIsInitialized = -1;

  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!file_.isEmpty()) {
      output.writeBytes(1, file_);
    }
    for (int i = 0; i < options_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, options_.getRaw(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!file_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream.computeBytesSize(1, file_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < options_.size(); i++) {
        dataSize += computeStringSizeNoTag(options_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getOptionsList().size();
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof FileMessage)) {
      return super.equals(obj);
    }
    FileMessage other = (FileMessage) obj;

    boolean result = true;
    result = result && getFile().equals(other.getFile());
    result = result && getOptionsList().equals(other.getOptionsList());
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + FILE_FIELD_NUMBER;
    hash = (53 * hash) + getFile().hashCode();
    if (getOptionsCount() > 0) {
      hash = (37 * hash) + OPTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getOptionsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static FileMessage parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static FileMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static FileMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static FileMessage parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static FileMessage parseFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static FileMessage parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static FileMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static FileMessage parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static FileMessage parseFrom(com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static FileMessage parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(FileMessage prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /** Protobuf type {@code FileMessage} */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:FileMessage)
      FileMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return Client.internal_static_FileMessage_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Client.internal_static_FileMessage_fieldAccessorTable.ensureFieldAccessorsInitialized(
          FileMessage.class, Builder.class);
    }

    // Construct using FileMessage.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    public Builder clear() {
      super.clear();
      file_ = com.google.protobuf.ByteString.EMPTY;

      options_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return Client.internal_static_FileMessage_descriptor;
    }

    public FileMessage getDefaultInstanceForType() {
      return FileMessage.getDefaultInstance();
    }

    public FileMessage build() {
      FileMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public FileMessage buildPartial() {
      FileMessage result = new FileMessage(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.file_ = file_;
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        options_ = options_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.options_ = options_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }

    public Builder setField(com.google.protobuf.Descriptors.FieldDescriptor field, Object value) {
      return (Builder) super.setField(field, value);
    }

    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }

    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }

    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }

    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof FileMessage) {
        return mergeFrom((FileMessage) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(FileMessage other) {
      if (other == FileMessage.getDefaultInstance()) return this;
      if (other.getFile() != com.google.protobuf.ByteString.EMPTY) {
        setFile(other.getFile());
      }
      if (!other.options_.isEmpty()) {
        if (options_.isEmpty()) {
          options_ = other.options_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureOptionsIsMutable();
          options_.addAll(other.options_);
        }
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      FileMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (FileMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.ByteString file_ = com.google.protobuf.ByteString.EMPTY;
    /** <code>optional bytes file = 1;</code> */
    public com.google.protobuf.ByteString getFile() {
      return file_;
    }
    /** <code>optional bytes file = 1;</code> */
    public Builder setFile(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }

      file_ = value;
      onChanged();
      return this;
    }
    /** <code>optional bytes file = 1;</code> */
    public Builder clearFile() {

      file_ = getDefaultInstance().getFile();
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList options_ =
        com.google.protobuf.LazyStringArrayList.EMPTY;

    private void ensureOptionsIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        options_ = new com.google.protobuf.LazyStringArrayList(options_);
        bitField0_ |= 0x00000002;
      }
    }
    /** <code>repeated string options = 2;</code> */
    public com.google.protobuf.ProtocolStringList getOptionsList() {
      return options_.getUnmodifiableView();
    }
    /** <code>repeated string options = 2;</code> */
    public int getOptionsCount() {
      return options_.size();
    }
    /** <code>repeated string options = 2;</code> */
    public String getOptions(int index) {
      return options_.get(index);
    }
    /** <code>repeated string options = 2;</code> */
    public com.google.protobuf.ByteString getOptionsBytes(int index) {
      return options_.getByteString(index);
    }
    /** <code>repeated string options = 2;</code> */
    public Builder setOptions(int index, String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureOptionsIsMutable();
      options_.set(index, value);
      onChanged();
      return this;
    }
    /** <code>repeated string options = 2;</code> */
    public Builder addOptions(String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureOptionsIsMutable();
      options_.add(value);
      onChanged();
      return this;
    }
    /** <code>repeated string options = 2;</code> */
    public Builder addAllOptions(Iterable<String> values) {
      ensureOptionsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, options_);
      onChanged();
      return this;
    }
    /** <code>repeated string options = 2;</code> */
    public Builder clearOptions() {
      options_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /** <code>repeated string options = 2;</code> */
    public Builder addOptionsBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureOptionsIsMutable();
      options_.add(value);
      onChanged();
      return this;
    }

    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    // @@protoc_insertion_point(builder_scope:FileMessage)
  }

  // @@protoc_insertion_point(class_scope:FileMessage)
  private static final FileMessage DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new FileMessage();
  }

  public static FileMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FileMessage> PARSER =
      new com.google.protobuf.AbstractParser<FileMessage>() {
        public FileMessage parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new FileMessage(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<FileMessage> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<FileMessage> getParserForType() {
    return PARSER;
  }

  public FileMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
