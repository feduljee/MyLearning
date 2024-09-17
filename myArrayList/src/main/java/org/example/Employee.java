package org.example;

import javax.naming.Name;

public class Employee {
    private String name;
    private String department;
    private Integer salary;

    public Employee(String name, String department, Integer salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }


    public String getDepartment() {
        return department;
    }


    public Integer getSalary() {
        return salary;
    }

}
