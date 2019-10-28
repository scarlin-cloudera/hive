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

public enum TJoinDistributionMode implements org.apache.thrift.TEnum {
  BROADCAST(0),
  SHUFFLE(1);

  private final int value;

  private TJoinDistributionMode(int value) {
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
  public static TJoinDistributionMode findByValue(int value) { 
    switch (value) {
      case 0:
        return BROADCAST;
      case 1:
        return SHUFFLE;
      default:
        return null;
    }
  }
}
