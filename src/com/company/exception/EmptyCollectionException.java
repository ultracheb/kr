package com.company.exception;

public class EmptyCollectionException extends Exception {
    private String exceptionMessage;

    public EmptyCollectionException(String message) {
        super(message);
        exceptionMessage = message;
    }

    @Override
    public String getMessage() {
        return exceptionMessage;
    }
}
