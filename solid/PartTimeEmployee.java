package com.example.demo.unsolid.solid;

import com.example.demo.unsolid.unsolid.SalaryCalculator;

public class PartTimeEmployee extends Employee {

    public PartTimeEmployee(String name, String department) {
        super(name, department);
    }

    @Override
    public double generateSalary() {
    return 100;
    }
}
