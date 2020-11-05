package com.springbootdata.h2Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springbootdata.h2Project.service.BookService;
import com.springbootdata.h2Project.service.Book_BookstoreService;
import com.springbootdata.h2Project.service.BookstoreService;

@Component
public class UserCommandLineRunner implements CommandLineRunner {

//	oneToOneExample
//	@Autowired
//	private StudentService studentService;
//	@Autowired
//	private DepartmentService departmentService;
	
//	manyToManyExample
	@Autowired
	private BookService bookService;
	@Autowired
	private BookstoreService bookStoreService;
	@Autowired
	private Book_BookstoreService book_BookStoreService;
	
	@Override
	public void run(String... args) throws Exception {
		// This method runs as soon as the application is deployed

//		OneToOneRelationship oneToOneExample = new OneToOneRelationship();
//		oneToOneExample.executeOneToOne(studentService, departmentService);

		ManyToManyRelationship_WithJoinTable manyToManyExample = new ManyToManyRelationship_WithJoinTable();
		manyToManyExample.executeManyToMany(bookService, bookStoreService, book_BookStoreService);

	}

}
