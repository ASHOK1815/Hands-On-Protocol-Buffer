// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: student.proto

package com.example.tutorial.protos.Students;

public final class StudentsProtos {
  private StudentsProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tutorial_StudentInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tutorial_StudentInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tutorial_Students_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tutorial_Students_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rstudent.proto\022\010tutorial\"W\n\013StudentInfo" +
      "\022\022\n\nfirst_Name\030\001 \001(\t\022\021\n\tlast_Name\030\002 \001(\t\022" +
      "\023\n\013roll_Number\030\003 \001(\005\022\014\n\004cgpa\030\004 \001(\001\"2\n\010St" +
      "udents\022&\n\007student\030\001 \003(\0132\025.tutorial.Stude" +
      "ntInfoB8\n$com.example.tutorial.protos.St" +
      "udentsB\016StudentsProtosP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_tutorial_StudentInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tutorial_StudentInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tutorial_StudentInfo_descriptor,
        new java.lang.String[] { "FirstName", "LastName", "RollNumber", "Cgpa", });
    internal_static_tutorial_Students_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_tutorial_Students_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tutorial_Students_descriptor,
        new java.lang.String[] { "Student", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
