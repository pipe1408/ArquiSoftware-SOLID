import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PartTimeEmployee medioTiempoJuan = new PartTimeEmployee("Juan", "Limpieza");
        Employee tiempoCompletoFelipe = new Employee("Felipe", "Operaciones");
        List<Employee> empleados = new ArrayList<>();
        ReportExcel excel = new ReportExcel();
        ReportPDF pdf = new ReportPDF();
        EmployeeManager manager = new EmployeeManager(empleados, excel);

        manager.addEmployee(tiempoCompletoFelipe);
        manager.addEmployee(medioTiempoJuan);
        manager.removeEmployee(tiempoCompletoFelipe);

        verEmpleados(empleados);
        excel.generateReport();

    }

    private static void verEmpleados(List<Employee> empleados) {
        for (Employee empleado : empleados) {
            System.out.println(empleado.getName() + ", " + empleado.getDepartment() + ", " + empleado.salary);
        }
    }
}
