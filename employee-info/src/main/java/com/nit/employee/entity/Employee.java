package com.nit.employee.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	@SequenceGenerator(name = "EMPLOYEE_SEQ",sequenceName = "EMPLOYEE_SEQ",allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "EMPLOYEE_SEQ")
	@Id
	@Column(length = 3)
	private Integer id;
	@Column(length = 30)
	private String name;
	@Column(length = 10)
	private Double salary;
	@Column(length = 3)
	private Integer deptId;
	@Column(length = 3)
	private Integer addId;
}
