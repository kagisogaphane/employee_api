package com.kagiso.employeeapi.employee;

public class Employee {
    //Private member Variables
    private int empId;
    private String firstName;
    private String lastName;
    private String email;
    private String position;

    //Constructors
    public Employee() {
    }

    public Employee(int empId, String firstName, String lastName, String email, String position) {
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.position = position;
    }

    //Getters and setters

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
