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
        empleados.add(medioTiempoJuan);
        empleados.add(tiempoCompletoFelipe);
        manager.removeEmployee("Felipe");
        manager.addEmployee("Camila", "Gerencia");
        verEmpleados(empleados);
        excel.generateReport();

    }

    private static void verEmpleados(List<Employee> empleados) {
        for (Employee empleado : empleados) {
            System.out.println(empleado.getName() + ", " + empleado.getDepartment() + ", " + empleado.salary);
        }
    }
}
