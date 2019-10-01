package com.selftraining.springboot.WebServiceSandBox.sampleControllers;

import com.selftraining.springboot.WebServiceSandBox.CustomException.CustomExceptionResponse;
import com.selftraining.springboot.WebServiceSandBox.CustomException.ToDoNotFoundException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class CustomRESTResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ToDoNotFoundException.class)
    public final ResponseEntity<CustomExceptionResponse> todoNotFound(ToDoNotFoundException exception){
        CustomExceptionResponse customExceptionResponse = new CustomExceptionResponse(exception.getMessage(),"Some Other Details we may Add");

        return new ResponseEntity<CustomExceptionResponse>(customExceptionResponse, new HttpHeaders(), HttpStatus.NOT_FOUND);
    }
}
