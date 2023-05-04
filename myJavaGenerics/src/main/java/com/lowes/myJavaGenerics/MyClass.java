package com.lowes.myJavaGenerics;

public class MyClass<T> {
  T obj;

  MyClass(T obj) {
    this.obj = obj;
  }

  void showType() {
    System.out.println(obj.getClass().getName());
  }
}
