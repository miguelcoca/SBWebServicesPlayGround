package com.selftraining.springboot.WebServiceSandBox.CustomException;

public class ToDoNotFoundException extends RuntimeException {

    public ToDoNotFoundException(String message) {
        super(message);
    }
}
