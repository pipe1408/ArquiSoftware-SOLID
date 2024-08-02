package com.example.demo.solid;

public class SalaryCalculator implements SalaryOperations {
    private EmployeeManager employeeManager;

    public SalaryCalculator(EmployeeManager employeeManager) {
        this.employeeManager = employeeManager;
    }

    @Override
    public double calculateSalary(String name) {
        Employee employee = employeeManager.findEmployeeByName(name);
        if (employee != null) {
            
            return 0.0; // Ejemplo
        }
        return 0.0;
    }
}

