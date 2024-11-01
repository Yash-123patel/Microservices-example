package com.nit.employee.exception;

public class NoEmployeeFoundException extends Exception {

	public NoEmployeeFoundException() {
		
	}
    public NoEmployeeFoundException(String msg) {
	    super(msg);
   }
}
