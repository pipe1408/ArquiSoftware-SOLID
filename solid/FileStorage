package com.example.demo.solid;

import java.io.FileWriter;
import java.io.IOException;

public class FileStorage implements FileOperations{
    public void saveToFile(Employee employee, String filename) {
        try (FileWriter writer = new FileWriter(filename, true)) {
            writer.write(employee.getName() + "," + employee.getDepartment() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}