package com.System.clinic.exeption;

public class GenericException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public GenericException(String message) {
        super(message);
    }
}