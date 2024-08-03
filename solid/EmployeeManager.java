package com.example.demo.unsolid.solid;

import java.util.List;

public class EmployeeManager implements EmployeeOperations{

    private final List<Employee> employees;
    private final Report report;

    public EmployeeManager(List<Employee> employees, Report report) {
        this.employees = employees;
        this.report = report;
    }

    public void addEmployee(String name, String departamento) {
        employees.add(new Employee(name, departamento));
    }


    public void removeEmployee(String name) {
        employees.removeIf(employee -> name.equals(employee.getName()));
    }

}
