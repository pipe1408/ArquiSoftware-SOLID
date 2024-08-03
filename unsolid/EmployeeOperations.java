package com.example.demo.unsolid.unsolid;

import com.example.demo.unsolid.solid.Employee;

public interface EmployeeOperations {

    void addEmployee(String name);

    void removeEmployee(String name);

    double calculateSalary(String name);

    void saveToFile(String name);

    String findEmployeeByName(String name);
}
