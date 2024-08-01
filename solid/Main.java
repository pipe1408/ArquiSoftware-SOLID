package com.example.demo.unsolid.solid;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PartTimeEmployee medioTiempoJuan = new PartTimeEmployee("Juan", "RRHH");
        Employee tiempoCompletoFelipe = new Employee("Felipe", "Operaciones");
        List<Employee> empleados = new ArrayList<>();
        ReportExcel excel = new ReportExcel();
        EmployeeManager manager = new EmployeeManager(empleados, excel);

        empleados.add(medioTiempoJuan);
        empleados.add(tiempoCompletoFelipe);
        manager.removeEmployee("Felipe");
        manager.addEmployee("Camila", "Gerencia");
        verSalarios(empleados);

    }

    private static void verSalarios(List<Employee> empleados) {
        for (Employee empleado : empleados) {
            System.out.println(empleado.salary);
        }
    }
}
