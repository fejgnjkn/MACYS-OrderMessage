package com.zensar.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
public class GlobalExceptionhandler  extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(value= {InvalidOrderIdException.class})
	public ResponseEntity<Object> handleOrderIdException(RuntimeException exception, 
			WebRequest webRequest){
	
		return handleExceptionInternal(exception, exception.toString(), new HttpHeaders(), HttpStatus.BAD_REQUEST, webRequest);
	}

	

}

