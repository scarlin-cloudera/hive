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

public enum TRuntimeProfileFormat implements org.apache.thrift.TEnum {
  STRING(0),
  BASE64(1),
  THRIFT(2),
  JSON(3);

  private final int value;

  private TRuntimeProfileFormat(int value) {
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
  public static TRuntimeProfileFormat findByValue(int value) { 
    switch (value) {
      case 0:
        return STRING;
      case 1:
        return BASE64;
      case 2:
        return THRIFT;
      case 3:
        return JSON;
      default:
        return null;
    }
  }
}