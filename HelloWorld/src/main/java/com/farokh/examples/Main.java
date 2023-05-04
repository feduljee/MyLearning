package com.farokh.examples;

public class Main {
  public static void main(String[] args) {
    int square1 = 4 * 4;
    double circle1 = areaCircle(Math.PI, 2, 2);
    double circle2 = areaCircle(Math.PI, 3, 3);
    double triangle1 = 0.5 * 5 * 3;
    double triangle2 = 0.5 * 2 * 2;
    int square2 = 2 * 2;
    int rect1 = 5 * 10;
    int rect2 = 3 * 5;
    int areaOccupiedByObjects = (int) (square1 + square2 + rect1 + rect2 + circle1 + circle2 + triangle1 + triangle2);
    System.out.println("areaOccupiedByObjects = " + areaOccupiedByObjects);

    double enlargedCircle1 = Math.PI * (2 * 2) * (2 * 2);
    double enlargedCircle2 = Math.PI * (3 * 2) * (3 * 2);

    int areaOccupiedWithEnlargedCircle = (int) (square1 + square2 + rect1 + rect2 + circle1 + circle2 + triangle1 + triangle2 + enlargedCircle1 + enlargedCircle2);
    System.out.println("areaOccupiedWithEnlargedCircle = " + areaOccupiedWithEnlargedCircle);
  }

  private static double areaCircle(double pi, int i, int i2) {
    return pi * i * i2;
  }
}
