package org.example;

public class Employee {
    private String Name;
    private String Department;
    private Integer Salary;

    public String getDepartment() {
        return this.Department;
    }
    public String getName() {
        return this.Name;
    }

    public Integer getSalary(){
        return this.Salary;
    }
    public Employee(String Name, String Department, Integer Salary) {
        this.Name = Name;
        this.Department = Department;
        this.Salary = Salary;
    }
}
