package com.springbootdata.h2Project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootdata.h2Project.model.Book;
import com.springbootdata.h2Project.model.Department;
import com.springbootdata.h2Project.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository repository;

	public List<Book> retrieveAllDepartment() {
	    List<Book> books = new ArrayList<Book>();
	    for (Book book : repository.findAll()) {
	    	books.add(book);
	    }
		return books;
	}

	public Book save(Book book) {
		return repository.save(book);
	}
	
	
}
