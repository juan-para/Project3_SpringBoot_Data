package com.springbootdata.h2Project.repository;

import org.springframework.data.repository.CrudRepository;

import com.springbootdata.h2Project.model.Student;

public interface StudentRepository extends CrudRepository<Student, Long>{

}
