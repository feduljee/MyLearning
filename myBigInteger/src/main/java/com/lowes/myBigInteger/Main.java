package com.lowes.myBigInteger;

import java.math.BigInteger;

public class Main {
  public static void main(String[] args) {
    BigInteger b1, b2;

    b1 = new BigInteger("123456");
    b2 = new BigInteger("123456");
    //b2 = new BigInteger("321456");

    int compareValue = b1.compareTo(b2);
    if (compareValue == 0) {
      System.out.println("BigInteger1 " + b1 + " and BigInteger2 " + b2 + " are equal");
    } else {
      System.out.println("BigInteger1 " + b1 + " and BigInteger2 " + b2 + " are NOT EQUAL");
    }

  }
}
