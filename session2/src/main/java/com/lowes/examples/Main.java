package com.lowes.examples;

import com.lowes.examples.shapes.*;
import com.lowes.examples.shapes.impl.Circle;
import com.lowes.examples.shapes.impl.Mat;
import com.lowes.examples.shapes.impl.Rectangle;
import com.lowes.examples.shapes.impl.Square;
import com.lowes.examples.shapes.impl.Triangle;
import com.lowes.examples.visitors.impl.CalculateAreaVisitor;

public class Main {
  public static void main(String[] args) {
    //double circle1 = new Circle(2).getArea();

    int areaOccupiedByObjects = (int) (((Shape) new Square(4)).getArea() + ((Shape) new Square(2)).getArea() + ((Shape) new Rectangle(5, 10)).getArea() + ((Shape) new Rectangle(3, 5)).getArea() + ((Shape) new Circle(2)).getArea() + ((Shape) new Circle(3)).getArea() + ((Shape) new Triangle(5, 3)).getArea() + ((Shape) new Triangle(2, 2)).getArea());
    System.out.println("areaOccupiedByObjects = " + areaOccupiedByObjects);

    Mat mat = new Mat();
    mat.place(new Circle(2));
    mat.place(new Circle(3));
    mat.place(new Triangle(5, 3));
    mat.place(new Square(2));
    mat.place(new Triangle(2, 2));
    mat.place(new Square(4));
    mat.place(new Rectangle(5, 10));
    mat.place(new Rectangle(3, 5));
    mat.place(new Circle(2 * 2));
    mat.place(new Circle(3 * 2));
    mat.place(new Circle(2 * 2));
    mat.place(new Circle(3 * 2));
    Shape someShape = () -> 100f;

    mat.place(someShape);

    System.out.println(String.format("Area occupied by the object %4.1f", mat.getArea()));

    Circle circle1 = new Circle(2 * 2);
    Circle circle2 = new Circle(2 * 2);

    System.out.println("circle1.equals(circle2): " + circle1.equals(circle2));
    System.out.println("circle1.equals(circle1): " + circle1.equals(circle1));
    System.out.println("circle1.hashcode:" + circle1.hashCode());
    System.out.println("circle.toString(): " + circle1.toString());

    CalculateAreaVisitor visitor = new CalculateAreaVisitor();
    mat.visit(visitor);
    System.out.println("visitor.getTotalAreaOccupied() = " + visitor.getTotalAreaOccupied());
    System.out.println("type of shape = " + mat.getTypesOfShape());



  }

}