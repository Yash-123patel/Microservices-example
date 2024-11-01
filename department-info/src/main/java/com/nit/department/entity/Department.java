package com.nit.department.entity;

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
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Department {

	@Id
	@SequenceGenerator(name = "DEPARTMENT_SEQ",sequenceName = "DEPARTMENT_SEQ",allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "DEPARTMENT_SEQ")
	@Column(length = 3)
	private Integer id;
	@Column(length = 30)
	private String name;
	@Column(length = 30)
	private String location;
}
