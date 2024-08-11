public class PartTimeEmployee extends Employee {

    public PartTimeEmployee(String name, String department) {
        super(name, department);
    }

    @Override
    public double generateSalary() {
        return 100;
    }
}
