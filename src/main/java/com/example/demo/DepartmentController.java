package com.example.demo;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public class DepartmentController {

        private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

        public Employee findEmployeeWithMaxSalary(int deparmentId) {
        return departmentService.findEmployeeWithMaxSalary(deparmentId);
    }

        public Employee findEmployeeWithMinSalary(int deparmentId) {
        return departmentService.findEmployeeWithMinSalary(deparmentId);
    }
        public Collection<Employee> findEmployeeByDepartment(int departmentId) {
        return departmentService.findEmployeesByDepartment(departmentId);
    }
        public Map<Integer, List<Employee>> findEmployeeByDepartment() {
        return departmentService.findEmployeesByDepartment();
    }

    }


