package com.example.clinica.service.exceptions;

public class EntityNotFoundException extends RuntimeException {
    public EntityNotFoundException (String msg){
        super(msg);
    }
}
