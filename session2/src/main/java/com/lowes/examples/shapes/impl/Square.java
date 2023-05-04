package com.lowes.examples.shapes.impl;

import com.lowes.examples.shapes.Shape;

public class Square implements Shape {
  private int side;

  public Square(int side) {
    this.side = side;
  }

  @Override
  public double getArea() {
    return side * side;
  }
}
