package com.proj.user.service.UserService.exception;

import com.proj.user.service.UserService.payload.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    //whenever ResourceNotFoundException triggers from project this method will be executed.
    public ResponseEntity<ApiResponses> handleResourceNotFoundException(ResourceNotFoundException ex)
    {
        String message= ex.getMessage();
        ApiResponses responses = ApiResponses.builder().message(message).status(HttpStatus.NOT_FOUND).success(false).build();
        return new ResponseEntity<>(responses,HttpStatus.NOT_FOUND);
    }
}
