package com.springbootdata.h2Project.repository;

import org.springframework.data.repository.CrudRepository;

import com.springbootdata.h2Project.model.Book;

public interface BookRepository extends CrudRepository<Book, Long>{

}
