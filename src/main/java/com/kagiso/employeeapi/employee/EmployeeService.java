package com.kagiso.employeeapi.employee;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    public List<Employee> getAllEmployees(){
        return List.of(
                new Employee(
                        1,
                        "Kagiso",
                        "Aphane",
                        "Ghost@casper.com",
                        "Java Developer"

                ),new Employee(
                2,
                "Gift",
                "Moeti",
                "Gift@casper.com",
                "C# Developer")

        );
    }
}
