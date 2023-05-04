package com.example.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {

    List<Student> studentList = new ArrayList<>();
    studentList.add(new Student("S1", 5));
    studentList.add(new Student("S2", 12));
    studentList.add(new Student("S3", 19));
    studentList.add(new Student("S4", 20));
    studentList.add(new Student("S5", 10));
    studentList.add(new Student("S6", 22));

//    Predicate<String> p = str -> str.equals("def");
//    boolean result = p.test("abc");

//    System.out.println(studentList);

//    List<Student> filtered = new ArrayList<>();
//    for (Student student : studentList) {
//      if (student.getAge() >= 15)
//        filtered.add(student);
//    }
//    Predicate<Student> p = student -> student.getAge() >= 15;
//    List<Student> filtered = studentList.stream().filter(p).collect(Collectors.toList());
    List<Student> filtered = studentList.stream().filter(student -> student.getAge() >= 15).collect(Collectors.toList());
    System.out.println(filtered);

  }
}
