package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Employee> eList = new ArrayList<>();

        Employee e1 = new Employee("John", "Acct", 5000);
        Employee e4 = new Employee("Jake", "Acct", 3000);
        Employee e2 = new Employee("Mike", "PERS", 4000);
        Employee e3 = new Employee("Farokh", "HR", 7000);

        eList.add(e1);
        eList.add(e2);
        eList.add(e3);
        eList.add(e4);

        for (Employee e : eList) {
            String department = e.getDepartment();
            if (department == "Acct") {
                System.out.println(e.getName() + " " + e.getSalary());
            }
        }
    }
}