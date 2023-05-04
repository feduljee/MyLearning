package com.lowes.examples.shapes.impl;

import com.lowes.examples.shapes.Shape;

public class Rectangle implements Shape {
  private int length;
  private int width;

  public Rectangle(int length, int width) {
    this.length = length;
    this.width = width;
  }

  @Override
  public double getArea() {
    return length * width;
  }
}
