package com.example.demo;

import java.util.Collection;

public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public Employee add(String firstName, String lastName) {
        return employeeService.add(firstName, lastName);
    }

    public Employee add(String firstName, String lastName, int salary, int departmentId) {
        return employeeService.add(firstName, lastName, salary, departmentId);
    }

    public Employee remove(String firstName, String lastName) {
        return employeeService.remove(firstName, lastName);
    }

    public Employee find(String firstName, String lastName) {
        return employeeService.find(firstName, lastName);
    }

    public Collection<Employee> findAll() {
        return employeeService.findAll();
    }


}
