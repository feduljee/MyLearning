package com.lowes.myJavaGenerics;

public class MyClass2Vars<T, V> {
  T obj1;
  V obj2;

  MyClass2Vars(T obj1, V obj2) {
    this.obj1 = obj1;
    this.obj2 = obj2;
  }

  void showType() {
    System.out.println(obj1.getClass().getName());
    System.out.println(obj2.getClass().getName());
  }
}
