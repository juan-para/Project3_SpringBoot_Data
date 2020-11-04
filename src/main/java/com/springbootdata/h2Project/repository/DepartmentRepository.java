package com.springbootdata.h2Project.repository;

import org.springframework.data.repository.CrudRepository;

import com.springbootdata.h2Project.model.Department;

public interface DepartmentRepository extends CrudRepository<Department, Long> {

}
