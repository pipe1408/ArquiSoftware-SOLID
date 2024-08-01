package com.example.demo.unsolid.solid;

public class PartTimeEmployee extends Employee {

    public PartTimeEmployee(String name, String department) {
        super(name, department);
    }

    @Override
    public double generateSalary() {
        return SalaryCalculator.calculateSalary() / 2;
    }
}
