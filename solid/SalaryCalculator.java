public class SalaryCalculator implements SalaryOperations {
    private final EmployeeManager employeeManager;

    public SalaryCalculator(EmployeeManager employeeManager) {
        this.employeeManager = employeeManager;
    }

    @Override
    public double calculateSalary(String name) {
        Employee employee = employeeManager.findEmployeeByName(name);
        return 0.0;
    }
}

