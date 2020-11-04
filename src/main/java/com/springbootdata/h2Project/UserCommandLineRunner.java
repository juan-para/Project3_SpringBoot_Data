package com.springbootdata.h2Project;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springbootdata.h2Project.model.Department;
import com.springbootdata.h2Project.model.Student;
import com.springbootdata.h2Project.service.DepartmentService;
import com.springbootdata.h2Project.service.StudentService;

@Component
public class UserCommandLineRunner implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(UserCommandLineRunner.class);

	@Autowired
	private StudentService studentService;
	@Autowired
	private DepartmentService departmentService;

	@Override
	public void run(String... args) throws Exception {
		// This method runs as soon as the application is deployed

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
