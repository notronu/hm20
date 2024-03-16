package com.example.demo;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface DepartmentService {
    Employee findEmployeeWithMaxSalary(int departmentId);
    Employee findEmployeeWithMinSalary(int departmentId);

    Collection<Employee> findEmployeesByDepartment(int departmentId);
    Map<Integer, List<Employee>> findEmployeesByDepartment();


}

