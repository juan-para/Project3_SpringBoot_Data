package com.springbootdata.h2Project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springbootdata.h2Project.model.Student;
import com.springbootdata.h2Project.repository.StudentRepository;

@Service
public class StudentService {

	private StudentRepository repository;

	public List<Student> retrieveAllStudents() {
	    List<Student> students = new ArrayList<Student>();
	    for (Student student : repository.findAll()) {
	    	students.add(student);
	    }
		return students;
	}

	public void save(Student student) {
		repository.save(student);
	}
	
}
