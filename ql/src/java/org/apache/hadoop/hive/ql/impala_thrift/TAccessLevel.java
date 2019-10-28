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

public enum TAccessLevel implements org.apache.thrift.TEnum {
  NONE(0),
  READ_WRITE(1),
  READ_ONLY(2),
  WRITE_ONLY(3);

  private final int value;

  private TAccessLevel(int value) {
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
  public static TAccessLevel findByValue(int value) { 
    switch (value) {
      case 0:
        return NONE;
      case 1:
        return READ_WRITE;
      case 2:
        return READ_ONLY;
      case 3:
        return WRITE_ONLY;
      default:
        return null;
    }
  }
}
