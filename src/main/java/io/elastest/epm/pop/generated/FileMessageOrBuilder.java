package io.elastest.epm.pop.generated;// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: client.proto

public interface FileMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:FileMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional bytes file = 1;</code>
   */
  com.google.protobuf.ByteString getFile();

  /**
   * <code>repeated string options = 2;</code>
   */
  java.util.List<String>
      getOptionsList();
  /**
   * <code>repeated string options = 2;</code>
   */
  int getOptionsCount();
  /**
   * <code>repeated string options = 2;</code>
   */
  String getOptions(int index);
  /**
   * <code>repeated string options = 2;</code>
   */
  com.google.protobuf.ByteString
      getOptionsBytes(int index);

  /**
   * <code>optional .PoP pop = 3;</code>
   */
  boolean hasPop();
  /**
   * <code>optional .PoP pop = 3;</code>
   */
  PoP getPop();
  /**
   * <code>optional .PoP pop = 3;</code>
   */
  PoPOrBuilder getPopOrBuilder();
}
