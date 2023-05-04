package com.lowes.examples.shapes.impl;

import com.lowes.examples.shapes.Shape;

import java.util.Objects;

public class  Circle implements Shape {
  private int radius;
  public Circle(int radius){
      this.radius = radius;
  }

  @Override
  public double getArea(){
    return Math.PI * radius * radius;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Circle circle = (Circle) o;
    return radius == circle.radius;
  }

  @Override
  public int hashCode() {
    return Objects.hash(radius);
  }
}
