package com.lowes.project;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Person> person = new ArrayList<>();
    person.add(new Person("Warren Buffett", 120));
    person.add(new Person("Jeff Bezos", 150));
    person.add(new Person("Bill Gates", 100));
    person.add(new Person("Mark Zuckerberg", 50));

    List<Person> hundredClub = new ArrayList<>();

    for(Person p : person){
      if(p.billions >= 100){
        hundredClub.add(p);
      }
    }
    hundredClub.forEach(p -> System.out.println(p.name));
  }
}

