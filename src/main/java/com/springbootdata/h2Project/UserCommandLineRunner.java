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

		System.out.println("Department creation");
		Department department_1 = new Department("Math101", "Basics of mathematics");
		departmentService.save(department_1);

		System.out.println("Student creation");
		Student student_1 = new Student("Juan", "Marco");
		student_1.setDepartment(department_1);
		studentService.save(student_1);

		for (Student student : studentService.retrieveAllStudents()) {
			log.info(student.toString());
		}

	}

}
