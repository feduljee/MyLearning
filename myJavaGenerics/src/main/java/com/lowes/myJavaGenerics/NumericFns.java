package com.lowes.myJavaGenerics;

public class NumericFns<T extends Number> {
  T num;

  NumericFns(T ob){
    this.num = ob;
  }

  boolean absEqual(NumericFns<?> ob) {
    if(Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue())) {
      return true;
    } else {
      return false;
    }
  }
}
