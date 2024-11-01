package com.nit.employee.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.nit.employee.entity.Employee;
import com.nit.employee.exception.NoEmployeeFoundException;
import com.nit.employee.model.Address;
import com.nit.employee.model.Deparment;
import com.nit.employee.model.EmployeeResponse;
import com.nit.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private EmployeeResponse employeeResponse;
	
	@Transactional(rollbackForClassName = {"java.lang.Exception"})
	public Employee saveEmployee(Employee emp) {
		return employeeRepository.save(emp);
	}
	
	public EmployeeResponse getEmployeeById(Integer id) throws NoEmployeeFoundException {
		Optional<Employee> optEmp = employeeRepository.findById(id);
		if(optEmp.isPresent()) {
			Employee emp=optEmp.get();
			employeeResponse.setEmp(emp);
			Deparment dept = restTemplate.getForObject("http://DEPARTMENT-INFO/department/getDepartmentById/" + emp.getDeptId(), Deparment.class);
		    employeeResponse.setDept(dept);
		    Address address = restTemplate.getForObject("http://ADDRESS-INFO/address/getAddressById/" + emp.getAddId(), Address.class);

		    employeeResponse.setAddress(address);
		    return employeeResponse;
		}
		
			throw new NoEmployeeFoundException("No employee found!!");
		
	}
}
