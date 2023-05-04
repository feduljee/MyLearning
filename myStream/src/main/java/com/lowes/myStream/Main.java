package com.lowes.myStream;
//package com.lowes.project;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) {
    List<Person> person = new ArrayList<>();
    person.add(new Person("Warren Buffett", 120));
    person.add(new Person("Jeff Bezos", 150));
    person.add(new Person("Bill Gates", 100));
    person.add(new Person("Mark Zuckerberg", 50));

    // Generate list using filter
    List<Person> hundredClub = person.stream()
        .filter(p -> p.billions >= 100)
        .collect(Collectors.toList());

    // Sorted list
    List<Person> sortedList = person.stream()
        .sorted(Comparator.comparing(p -> p.name))
            .collect(Collectors.toList());

    // Hundred Sorted list
    List<Person> hundredSorted= person.stream()
        .filter(p -> p.billions >= 100)
        .sorted(Comparator.comparing(p -> p.name))
        .collect(Collectors.toList());

    //Using map with Collectors
    System.out.println("Map with Collectors exmaple:");
    List<String> names = person.stream().map(p -> p.name).collect(Collectors.toList());
    System.out.println(names);

    //Using map and forEach
    System.out.println("Map and forEach:");
    person.stream().map(p -> p.name).forEach(System.out::println);

    // List<String> names = person.stream().map(p -> p.name).collect(Collectors.toList()).forEach(System.out::println));

    // Using flatmaps
    System.out.println("flatMap exmaple:");
    person.stream()
        .flatMap(person1 -> Stream.of(person1.name)).forEach(System.out::println);

    System.out.println("Hundred Club\n");
    hundredClub.forEach(p -> System.out.println(p.name + " " + p.billions));
    System.out.println("Sorted List\n");
    sortedList.forEach(p -> System.out.println(p.name));
    System.out.println("Hundred Sorted List\n");
    hundredSorted.forEach(p -> System.out.println(p.name));
  }
}

