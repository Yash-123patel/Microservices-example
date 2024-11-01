package com.nit.address;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class AddressInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddressInfoApplication.class, args);
	}

}
