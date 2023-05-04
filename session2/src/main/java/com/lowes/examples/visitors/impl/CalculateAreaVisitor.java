package com.lowes.examples.visitors.impl;

import com.lowes.examples.shapes.Shape;
import com.lowes.examples.visitors.Visitor;

public class CalculateAreaVisitor implements Visitor {
  private double totalAreaOccupied = 0f;
  @Override
  public void accept(Shape shape) {
    totalAreaOccupied += shape.getArea();
  }

  public double getTotalAreaOccupied() {
    return totalAreaOccupied;
  }
}
