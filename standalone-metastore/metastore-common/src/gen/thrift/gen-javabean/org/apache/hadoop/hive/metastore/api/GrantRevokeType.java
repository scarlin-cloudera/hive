/**
 * Autogenerated by Thrift Compiler (0.14.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.1)")
public enum GrantRevokeType implements org.apache.thrift.TEnum {
  GRANT(1),
  REVOKE(2);

  private final int value;

  private GrantRevokeType(int value) {
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
  @org.apache.thrift.annotation.Nullable
  public static GrantRevokeType findByValue(int value) { 
    switch (value) {
      case 1:
        return GRANT;
      case 2:
        return REVOKE;
      default:
        return null;
    }
  }
}
