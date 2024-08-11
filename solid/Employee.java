public class Employee {

    private final String name;
    public double salary;
    private final String department;

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
