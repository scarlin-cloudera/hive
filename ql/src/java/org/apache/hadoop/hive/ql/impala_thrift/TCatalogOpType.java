/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.impala.thrift;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum TCatalogOpType implements org.apache.thrift.TEnum {
  SHOW_TABLES(0),
  SHOW_DBS(1),
  SHOW_STATS(2),
  USE(3),
  DESCRIBE_TABLE(4),
  DESCRIBE_DB(5),
  SHOW_FUNCTIONS(6),
  RESET_METADATA(7),
  DDL(8),
  SHOW_CREATE_TABLE(9),
  SHOW_DATA_SRCS(10),
  SHOW_ROLES(11),
  SHOW_GRANT_PRINCIPAL(12),
  SHOW_FILES(13),
  SHOW_CREATE_FUNCTION(14);

  private final int value;

  private TCatalogOpType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static TCatalogOpType findByValue(int value) { 
    switch (value) {
      case 0:
        return SHOW_TABLES;
      case 1:
        return SHOW_DBS;
      case 2:
        return SHOW_STATS;
      case 3:
        return USE;
      case 4:
        return DESCRIBE_TABLE;
      case 5:
        return DESCRIBE_DB;
      case 6:
        return SHOW_FUNCTIONS;
      case 7:
        return RESET_METADATA;
      case 8:
        return DDL;
      case 9:
        return SHOW_CREATE_TABLE;
      case 10:
        return SHOW_DATA_SRCS;
      case 11:
        return SHOW_ROLES;
      case 12:
        return SHOW_GRANT_PRINCIPAL;
      case 13:
        return SHOW_FILES;
      case 14:
        return SHOW_CREATE_FUNCTION;
      default:
        return null;
    }
  }
}
