package com.lowes.myJavaGenerics;
public class Main {
  public static void main(String[] args) {
    // Ordinary methods
    MyClassIntegers obj1 = new MyClassIntegers(3);
    obj1.printStuff();
    MyClassDouble obj2 = new MyClassDouble(23.050);
    obj2.printStuff();

    // Generics used below
    MyClass<Integer> obj3 = new MyClass<>(5);
    obj3.showType();
    MyClass<Double> obj4 = new MyClass<>(75.567);
    obj4.showType();

    // Generics with multiple parms
    MyClass2Vars<Integer, Double> obj5 = new MyClass2Vars<>(3,23.4);
    obj5.showType();

    // How to use Generic as '?'
    System.out.println("About to run the '?' --- ");
    NumericFns<Integer> iOb = new NumericFns<Integer>(6);
    NumericFns<Double> dOb = new NumericFns<Double>(-6.34);

    System.out.println(iOb.absEqual(dOb));

  }
}
