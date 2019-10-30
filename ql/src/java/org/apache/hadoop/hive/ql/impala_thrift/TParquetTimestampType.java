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

public enum TParquetTimestampType implements org.apache.thrift.TEnum {
  INT96_NANOS(0),
  INT64_MILLIS(1),
  INT64_MICROS(2),
  INT64_NANOS(3);

  private final int value;

  private TParquetTimestampType(int value) {
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
  public static TParquetTimestampType findByValue(int value) { 
    switch (value) {
      case 0:
        return INT96_NANOS;
      case 1:
        return INT64_MILLIS;
      case 2:
        return INT64_MICROS;
      case 3:
        return INT64_NANOS;
      default:
        return null;
    }
  }
}