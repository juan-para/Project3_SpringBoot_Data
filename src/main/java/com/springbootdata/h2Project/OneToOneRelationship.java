package com.springbootdata.h2Project;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.springbootdata.h2Project.model.Department;
import com.springbootdata.h2Project.model.Student;
import com.springbootdata.h2Project.service.DepartmentService;
import com.springbootdata.h2Project.service.StudentService;

public class OneToOneRelationship {

	private static final Logger log = LoggerFactory.getLogger(UserCommandLineRunner.class);
	
	public void executeOneToOne(StudentService studentService, DepartmentService departmentService) {
		log.info("Department creation");
		Department department_1;
		department_1 = departmentService.save(new Department("Math101", "Basics of mathematics"));

		log.info("Student creation");
		studentService.save(new Student("Juan", "Marco", department_1));

		log.info("Students:");
		for (Department department : departmentService.retrieveAllDepartment()) {
			log.info(department.toString());
		}
		System.out.println("Departments:");
		for (Student student : studentService.retrieveAllStudents()) {
			log.info(student.toString());
		}	
	}

	
}
