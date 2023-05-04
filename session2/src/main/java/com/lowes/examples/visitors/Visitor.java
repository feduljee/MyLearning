package com.lowes.examples.visitors.Visitor;

import com.lowes.examples.shapes.Shape;

public interface Visitor {
  void accept(Shape shape);

}
