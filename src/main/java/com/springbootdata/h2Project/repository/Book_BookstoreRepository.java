package com.springbootdata.h2Project.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.springbootdata.h2Project.model.Book;
import com.springbootdata.h2Project.model.Book_Bookstore;
import com.springbootdata.h2Project.model.Bookstore;

public interface Book_BookstoreRepository extends CrudRepository<Book_Bookstore, Long>{

	public List<Book> findByBook(Book book);
	public List<Bookstore> findByBookstore(Bookstore bookstore);
}
