package com.lowes.examples.shapes.impl;

import com.lowes.examples.shapes.Shape;
import com.lowes.examples.visitors.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Mat implements Shape {
  private List<Shape> shapes = new ArrayList<>();
  @Override
  public double getArea() {
    return shapes.stream().mapToDouble(shapes -> shapes.getArea()).sum();
  }

  public void place(Shape shape) {
    shapes.add(shape);
  }

  public void visit(Visitor visitor){
    shapes.stream().forEach(shape -> visitor.accept(shape));
  }

  public List<String> getTypesOfShape(){
    List<String> result = new ArrayList<>();
    for (Shape shape : shapes){
      result.add(shape.getClass().toString());
    }
    return result;
  }

}
