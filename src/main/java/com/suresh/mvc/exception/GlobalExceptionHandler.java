package com.suresh.mvc.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler
{
    @ExceptionHandler(value = InvoiceNotFoundException.class)
    public ResponseEntity<String> handleEmployeeNotFoundException(InvoiceNotFoundException ex, WebRequest req)
    {
        return new ResponseEntity("Invoice Not Found", HttpStatus.NOT_FOUND);
    }
}