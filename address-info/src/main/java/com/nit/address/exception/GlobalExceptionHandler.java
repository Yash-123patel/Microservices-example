package com.nit.address.exception;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.nit.address.error.Error;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value =  NoAddressFoundException.class)
	public ResponseEntity<Error> handleNoAddressFoundException(NoAddressFoundException ex){	
		Error error=new Error();
		error.setMessage(ex.getMessage());
		error.setExceptionDate(LocalDate.now().toString());
		error.setExceptionTime(LocalTime.now().toString());
		return new ResponseEntity<Error>(error, HttpStatus.NOT_FOUND);
	}
}
