#
# Autogenerated by Thrift Compiler (0.14.1)
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#

require 'thrift'

module MyEnum
  LLAMA = 1
  ALPACA = 2
  VALUE_MAP = {1 => "LLAMA", 2 => "ALPACA"}
  VALID_VALUES = Set.new([LLAMA, ALPACA]).freeze
end

class MiniStruct; end

class MegaStruct; end

class MiniStruct
  include ::Thrift::Struct, ::Thrift::Struct_Union
  MY_STRING = 1
  MY_ENUM = 2

  FIELDS = {
    MY_STRING => {:type => ::Thrift::Types::STRING, :name => 'my_string', :optional => true},
    MY_ENUM => {:type => ::Thrift::Types::I32, :name => 'my_enum', :optional => true, :enum_class => ::MyEnum}
  }

  def struct_fields; FIELDS; end

  def validate
    unless @my_enum.nil? || ::MyEnum::VALID_VALUES.include?(@my_enum)
      raise ::Thrift::ProtocolException.new(::Thrift::ProtocolException::UNKNOWN, 'Invalid value of field my_enum!')
    end
  end

  ::Thrift::Struct.generate_accessors self
end

class MegaStruct
  include ::Thrift::Struct, ::Thrift::Struct_Union
  MY_BOOL = 1
  MY_BYTE = 2
  MY_16BIT_INT = 3
  MY_32BIT_INT = 4
  MY_64BIT_INT = 5
  MY_DOUBLE = 6
  MY_STRING = 7
  MY_BINARY = 8
  MY_STRING_STRING_MAP = 9
  MY_STRING_ENUM_MAP = 10
  MY_ENUM_STRING_MAP = 11
  MY_ENUM_STRUCT_MAP = 12
  MY_ENUM_STRINGLIST_MAP = 13
  MY_ENUM_STRUCTLIST_MAP = 14
  MY_STRINGLIST = 15
  MY_STRUCTLIST = 16
  MY_ENUMLIST = 17
  MY_STRINGSET = 18
  MY_ENUMSET = 19
  MY_STRUCTSET = 20

  FIELDS = {
    MY_BOOL => {:type => ::Thrift::Types::BOOL, :name => 'my_bool', :optional => true},
    MY_BYTE => {:type => ::Thrift::Types::BYTE, :name => 'my_byte', :optional => true},
    MY_16BIT_INT => {:type => ::Thrift::Types::I16, :name => 'my_16bit_int', :optional => true},
    MY_32BIT_INT => {:type => ::Thrift::Types::I32, :name => 'my_32bit_int', :optional => true},
    MY_64BIT_INT => {:type => ::Thrift::Types::I64, :name => 'my_64bit_int', :optional => true},
    MY_DOUBLE => {:type => ::Thrift::Types::DOUBLE, :name => 'my_double', :optional => true},
    MY_STRING => {:type => ::Thrift::Types::STRING, :name => 'my_string', :optional => true},
    MY_BINARY => {:type => ::Thrift::Types::STRING, :name => 'my_binary', :binary => true, :optional => true},
    MY_STRING_STRING_MAP => {:type => ::Thrift::Types::MAP, :name => 'my_string_string_map', :key => {:type => ::Thrift::Types::STRING}, :value => {:type => ::Thrift::Types::STRING}, :optional => true},
    MY_STRING_ENUM_MAP => {:type => ::Thrift::Types::MAP, :name => 'my_string_enum_map', :key => {:type => ::Thrift::Types::STRING}, :value => {:type => ::Thrift::Types::I32, :enum_class => ::MyEnum}, :optional => true},
    MY_ENUM_STRING_MAP => {:type => ::Thrift::Types::MAP, :name => 'my_enum_string_map', :key => {:type => ::Thrift::Types::I32, :enum_class => ::MyEnum}, :value => {:type => ::Thrift::Types::STRING}, :optional => true},
    MY_ENUM_STRUCT_MAP => {:type => ::Thrift::Types::MAP, :name => 'my_enum_struct_map', :key => {:type => ::Thrift::Types::I32, :enum_class => ::MyEnum}, :value => {:type => ::Thrift::Types::STRUCT, :class => ::MiniStruct}, :optional => true},
    MY_ENUM_STRINGLIST_MAP => {:type => ::Thrift::Types::MAP, :name => 'my_enum_stringlist_map', :key => {:type => ::Thrift::Types::I32, :enum_class => ::MyEnum}, :value => {:type => ::Thrift::Types::LIST, :element => {:type => ::Thrift::Types::STRING}}, :optional => true},
    MY_ENUM_STRUCTLIST_MAP => {:type => ::Thrift::Types::MAP, :name => 'my_enum_structlist_map', :key => {:type => ::Thrift::Types::I32, :enum_class => ::MyEnum}, :value => {:type => ::Thrift::Types::LIST, :element => {:type => ::Thrift::Types::STRUCT, :class => ::MiniStruct}}, :optional => true},
    MY_STRINGLIST => {:type => ::Thrift::Types::LIST, :name => 'my_stringlist', :element => {:type => ::Thrift::Types::STRING}, :optional => true},
    MY_STRUCTLIST => {:type => ::Thrift::Types::LIST, :name => 'my_structlist', :element => {:type => ::Thrift::Types::STRUCT, :class => ::MiniStruct}, :optional => true},
    MY_ENUMLIST => {:type => ::Thrift::Types::LIST, :name => 'my_enumlist', :element => {:type => ::Thrift::Types::I32, :enum_class => ::MyEnum}, :optional => true},
    MY_STRINGSET => {:type => ::Thrift::Types::SET, :name => 'my_stringset', :element => {:type => ::Thrift::Types::STRING}, :optional => true},
    MY_ENUMSET => {:type => ::Thrift::Types::SET, :name => 'my_enumset', :element => {:type => ::Thrift::Types::I32, :enum_class => ::MyEnum}, :optional => true},
    MY_STRUCTSET => {:type => ::Thrift::Types::SET, :name => 'my_structset', :element => {:type => ::Thrift::Types::STRUCT, :class => ::MiniStruct}, :optional => true}
  }

  def struct_fields; FIELDS; end

  def validate
  end

  ::Thrift::Struct.generate_accessors self
end

