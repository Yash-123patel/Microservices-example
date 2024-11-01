package com.nit.employee.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {

	private Integer id;
	private String city;
	private String state;
	private Integer pincode;
}
