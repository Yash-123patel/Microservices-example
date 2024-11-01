package com.nit.department.exception;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.nit.department.error.Error;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(value = NoDepartmentFoundException.class)
	public ResponseEntity<Error> handleDepartmentNotFoundException(NoDepartmentFoundException ex) {
		Error error=new Error();
		error.setMessage(ex.getMessage());
		error.setExceptionDate(LocalDate.now().toString());
		error.setExceptionTime(LocalTime.now().toString());
		return new ResponseEntity<Error>(error,HttpStatus.NOT_FOUND);
	}

	
}
