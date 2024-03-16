package com.example.demo;

public class EmployeeAlreadyAddedException extends RuntimeException{
    public EmployeeAlreadyAddedException() {
            super("Сотрудник уже добавлен");
        }
    }

