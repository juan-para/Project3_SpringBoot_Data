package com.springbootdata.h2Project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootdata.h2Project.model.Bookstore;
import com.springbootdata.h2Project.repository.BookstoreRepository;

@Service
public class BookstoreService {

	@Autowired
	private BookstoreRepository repository;

	public List<Bookstore> retrieveAllBookstore() {
	    List<Bookstore> bookstores = new ArrayList<Bookstore>();
	    for (Bookstore bookstore : repository.findAll()) {
	    	bookstores.add(bookstore);
	    }
		return bookstores;
	}

	public Bookstore save(Bookstore bookstore) {
		return repository.save(bookstore);
	}
	
	
}
