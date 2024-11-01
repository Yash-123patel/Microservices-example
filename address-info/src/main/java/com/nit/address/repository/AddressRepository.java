package com.nit.address.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.address.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
