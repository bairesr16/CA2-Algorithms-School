/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sara_
 */
public class EmployeeFileManager {
 
    public static List<Employee> loadEmployees(String filePath) {
        List<Employee> employees = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) {
                    continue;
                }

                String[] parts = line.split(",");
                if (parts.length < 10) {
                    System.out.println("Skipping malformed line: " + line);
                    continue;
                }

                String firstName = parts[0].trim();
                String lastName = parts[1].trim();
                String gender = parts[2].trim();
                String email = parts[3].trim();
                double salary = Double.parseDouble(parts[4].trim());
                String department = parts[5].trim();
                String position = parts[6].trim();
                String jobTitle = parts[7].trim();
                String company = parts[8].trim();
                String managerType = parts[9].trim();

                employees.add(new Employee(
                        firstName, lastName, gender, email, salary,
                        department, position, jobTitle, company, managerType
                ));
            }
        } catch (IOException e) {
            System.out.println("Error reading file '" + filePath + "': " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error parsing salary in file: " + e.getMessage());
        }

        return employees;
    }

    public static boolean appendEmployee(String filePath, Employee emp) {
        String line = String.join(",",
                emp.getFirstName(),
                emp.getLastName(),
                emp.getGender(),
                emp.getEmail(),
                String.valueOf(emp.getSalary()),
                emp.getDepartment(),
                emp.getPosition(),
                emp.getJobTitle(),
                emp.getCompany(),
                emp.getManagerType()
        );

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.newLine();
            writer.write(line);
            return true;
        } catch (IOException e) {
            System.out.println("Error writing to file '" + filePath + "': " + e.getMessage());
            return false;
        }
    }
}
}
