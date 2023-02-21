package com.example.demo.formation_1.exceptions;

public class OrderNotFoundException extends RuntimeException{
    public OrderNotFoundException(Long id) {
        super("Order introuvable, id : " + id.toString());
    }
}
