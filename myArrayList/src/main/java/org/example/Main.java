package org.example;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Employee> elist = new ArrayList<>();

        // Create employee objects
        Employee emp1 = new Employee("John", "ACCT", 5000);
        Employee emp2 = new Employee("Mary", "PERS", 6000);
        Employee emp3 = new Employee("Frank", "MKTG", 4000);
        Employee emp4 = new Employee("Ann", "PERS", 7000);

        // Add to the ArrayList
        elist.add(emp1);
        elist.add(emp2);
        elist.add(emp3);
        elist.add(emp4);


        // Read rows.
        for (Employee emp: elist) {
            if (emp.getDepartment() == "PERS") {
                System.out.println(" Employee Name: " + emp.getName());
            }
        }

    }
}