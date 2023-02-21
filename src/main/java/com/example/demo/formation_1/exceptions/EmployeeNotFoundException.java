package com.example.demo.formation_1.exceptions;

public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException(Long id) {
        super("Employee introuvable, id : " + id.toString());
    }
}
