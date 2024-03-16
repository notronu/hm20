package com.example.demo;

public class EmployeeNotFoundException extends RuntimeException {


    public EmployeeNotFoundException() {
        super("Сотрудник не найден");

    }

}

