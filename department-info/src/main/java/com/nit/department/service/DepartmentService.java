package com.nit.department.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.department.entity.Department;
import com.nit.department.exception.NoDepartmentFoundException;
import com.nit.department.repository.DepartmentRepository;
import org.springframework.transaction.annotation.Transactional;
@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;
	
    @Transactional(rollbackForClassName = {"java.lang.Exception"})
	public Department saveDepartment(Department dept) {
		return departmentRepository.save(dept);
	}
    
    public Department getDeprtmentById(Integer id) throws NoDepartmentFoundException {
    	 Optional<Department> optDpt = departmentRepository.findById(id);
    	 if(optDpt.isPresent())
    	       return optDpt.get();
    	  throw new NoDepartmentFoundException("No department found!!");
    	 
    }
}
