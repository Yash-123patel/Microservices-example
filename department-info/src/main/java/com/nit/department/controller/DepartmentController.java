package com.nit.department.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nit.department.entity.Department;
import com.nit.department.exception.NoDepartmentFoundException;
import com.nit.department.service.DepartmentService;

@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/saveDepartment")
	public Department saveDepartment(@RequestBody Department dept) {
		return departmentService.saveDepartment(dept);
	}
    
	@GetMapping("/getDepartmentById/{id}")
    public Department getDeprtmentById(@PathVariable Integer id) throws NoDepartmentFoundException {
    	return departmentService.getDeprtmentById(id);
    }
}
