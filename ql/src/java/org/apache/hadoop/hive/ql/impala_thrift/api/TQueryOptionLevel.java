/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.cloudera.beeswax.api;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum TQueryOptionLevel implements org.apache.thrift.TEnum {
  REGULAR(0),
  ADVANCED(1),
  DEVELOPMENT(2),
  DEPRECATED(3),
  REMOVED(4);

  private final int value;

  private TQueryOptionLevel(int value) {
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
  public static TQueryOptionLevel findByValue(int value) { 
    switch (value) {
      case 0:
        return REGULAR;
      case 1:
        return ADVANCED;
      case 2:
        return DEVELOPMENT;
      case 3:
        return DEPRECATED;
      case 4:
        return REMOVED;
      default:
        return null;
    }
  }
}