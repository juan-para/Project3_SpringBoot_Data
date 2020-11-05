package com.springbootdata.h2Project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootdata.h2Project.model.Book_Bookstore;
import com.springbootdata.h2Project.repository.Book_BookstoreRepository;

@Service
public class Book_BookstoreService {
	
	@Autowired
	private Book_BookstoreRepository repository;

	public List<Book_Bookstore> retrieveAllBook_BookstoreRepository() {
	    List<Book_Bookstore> joinResult = new ArrayList<Book_Bookstore>();
	    for (Book_Bookstore book_Bookstore : repository.findAll()) {
	    	joinResult.add(book_Bookstore);
	    }
		return joinResult;
	}

	public Book_Bookstore save(Book_Bookstore book_Bookstore) {
		return repository.save(book_Bookstore);
	}
	
}
