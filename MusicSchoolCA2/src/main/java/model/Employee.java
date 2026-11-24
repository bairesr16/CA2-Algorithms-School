/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sara_
 */
public class Employee {
    
    private String firstName;
    private String lastName;
    private String gender;
    private double salary;
    private String department;
    private String email;
    private String position;
    private String jobTitle;
    private String company;
    private String managerType;

    public Employee(String firstName, String lastName, String gender, double salary, String department, String email, String position, String jobTitle, String company, String managerType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.salary = salary;
        this.department = department;
        this.email = email;
        this.position = position;
        this.jobTitle = jobTitle;
        this.company = company;
        this.managerType = managerType;
    }

    public String getFullName() {
        return (firstName + " " + lastName);
        
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public String getEmail() {
        return email;
    }

    public String getPosition() {
        return position;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public String getManagerType() {
        return managerType;
    }
    
    @Override
    public String toString() {
        return getFullName() + " | Department: " + department + " | Manager: " + managerType;
    }
}
