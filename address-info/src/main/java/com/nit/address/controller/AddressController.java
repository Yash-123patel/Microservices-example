package com.nit.address.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nit.address.entity.Address;
import com.nit.address.exception.NoAddressFoundException;
import com.nit.address.service.AddressService;

@RestController
public class AddressController {

	@Autowired
	private AddressService addressService;
	
	@PostMapping("/saveAddress")
	public Address saveAddress(@RequestBody Address address) {
		return addressService.saveAddress(address);
	}
	
	@GetMapping("/getAddressById/{id}")
	public Address getAddressById(@PathVariable Integer id) throws NoAddressFoundException {
		return addressService.getAddressById(id);
	}
}
