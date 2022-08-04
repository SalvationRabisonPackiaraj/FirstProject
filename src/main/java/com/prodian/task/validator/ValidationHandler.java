package com.prodian.task.validator;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import com.prodian.task.exception.EmptyDatabaseException;
import com.prodian.task.exception.UserNotFoundException;


@ControllerAdvice
public class ValidationHandler {
  
	@ExceptionHandler(UserNotFoundException.class) 
	public ResponseEntity<String> handleResourceNotFoundException(UserNotFoundException userNotFoundException) {
	  return new ResponseEntity<String>(userNotFoundException.getMessage(),HttpStatus.BAD_REQUEST); 
	  
	}
	
	 
	@ExceptionHandler(EmptyDatabaseException.class) 
	public ResponseEntity<String> Exception(EmptyDatabaseException ex) {
	  return new
	  ResponseEntity<String>(ex.getMessage(),HttpStatus.BAD_REQUEST); }
}
