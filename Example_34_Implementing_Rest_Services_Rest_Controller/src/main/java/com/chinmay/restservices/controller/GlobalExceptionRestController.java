package com.chinmay.restservices.controller;

import org.springframework.core.annotation.Order;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.chinmay.restservices.model.Response;
import org.springframework.web.context.request.WebRequest;


import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestControllerAdvice(annotations=RestController.class)
@Order(1)
public class GlobalExceptionRestController {

	 @ExceptionHandler({Exception.class})
	    public ResponseEntity<Response> exceptionHandler(Exception exception){
	        Response response = new Response("500",
	                exception.getMessage());
	        return new ResponseEntity(response, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	 
	 protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
	                                                                  HttpHeaders headers, HttpStatusCode statusCode, WebRequest request) {
	        Response response = new Response(statusCode.toString(),
	                ex.getBindingResult().toString());
	        return new ResponseEntity(response, HttpStatus.BAD_REQUEST);
	    }
}
