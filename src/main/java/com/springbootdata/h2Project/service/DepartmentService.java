package com.springbootdata.h2Project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootdata.h2Project.model.Department;
import com.springbootdata.h2Project.repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository repository;

	public List<Department> retrieveAllDepartment() {
	    List<Department> departments = new ArrayList<Department>();
	    for (Department department : repository.findAll()) {
	    	departments.add(department);
	    }
		return departments;
	}

	public Department save(Department department) {
		return repository.save(department);
	}
	
	
}
