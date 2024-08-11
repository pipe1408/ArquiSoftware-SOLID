import java.util.List;

public class EmployeeManager implements EmployeeOperations {

    private final List<Employee> employees;
    private final Report report;

    public EmployeeManager(List<Employee> employees, Report report) {
        this.employees = employees;
        this.report = report;
    }

    @Override
    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    @Override
    public void removeEmployee(Employee employee) {
        this.employees.remove(employee);
    }

    @Override
    public Employee findEmployeeByName(String name) {
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                return employee;
            }
        }
        return null;
    }
}
