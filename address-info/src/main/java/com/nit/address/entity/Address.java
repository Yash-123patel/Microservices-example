package com.nit.address.entity;

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
public class Address {

	@Id
	@SequenceGenerator(name = "ADDRESS_SEQ",sequenceName ="ADDRESS_SEQ",allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "ADDRESS_SEQ")
	@Column(length = 3)
	private Integer id;
	@Column(length = 30)
	private String city;
	@Column(length = 30)
	private String state;
	@Column(length = 6)
	private Integer pincode;
}
