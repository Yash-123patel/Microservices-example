package com.nit.employee.error;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Error {
	private String message;
	private String exceptionDate;
	private String exceptionTime;

}