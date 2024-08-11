public interface EmployeeOperations {
    void addEmployee(Employee employee);
    void removeEmployee(Employee employee);

    Employee findEmployeeByName(String name);
}