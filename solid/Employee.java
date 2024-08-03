package com.example.demo.unsolid.solid;

public class Employee {

    private final String name;
    private String department;
    public double salary;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
        this.salary = generateSalary();
    }

    public double generateSalary() {
        return 200;
    }

    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }
}
