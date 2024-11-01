package com.nit.department.exception;

public class NoDepartmentFoundException extends Exception{

	public NoDepartmentFoundException() {
		
	}
	public NoDepartmentFoundException(String msg) {
		super(msg);
	}
}
