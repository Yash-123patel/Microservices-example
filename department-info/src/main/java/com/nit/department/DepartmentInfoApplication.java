package com.nit.department;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class DepartmentInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentInfoApplication.class, args);
	}

}
