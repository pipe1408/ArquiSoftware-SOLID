package com.example.demo.unsolid.solid;

import com.example.demo.unsolid.solid.SalaryOperations;
import com.example.demo.unsolid.unsolid.EmployeeManager;

public class SalaryCalculator implements SalaryOperations {
    private final EmployeeManager employeeManager;

    public SalaryCalculator(EmployeeManager employeeManager) {
        this.employeeManager = employeeManager;
    }

    @Override
    public double calculateSalary(String name) {
        String employee = employeeManager.findEmployeeByName(name);
        if (employee != null) {
            return 0.0; // Ejemplo
        }
        return 0.0;
    }
}

