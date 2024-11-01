package com.nit.address.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nit.address.entity.Address;
import com.nit.address.exception.NoAddressFoundException;
import com.nit.address.repository.AddressRepository;

@Service
public class AddressService {

	@Autowired
	private AddressRepository addressRepository;
	
	@Transactional(rollbackForClassName = {"java.lang.Exception"})
	public Address saveAddress(Address address) {
		return addressRepository.save(address);
	}
	
	public Address getAddressById(Integer id) throws NoAddressFoundException {
		Optional<Address> optAdd = addressRepository.findById(id);
		if(optAdd.isPresent())
			return optAdd.get();
		throw new NoAddressFoundException("Address not found!!");
	}
}
