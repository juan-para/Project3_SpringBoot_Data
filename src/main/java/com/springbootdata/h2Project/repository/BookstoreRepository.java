package com.springbootdata.h2Project.repository;

import org.springframework.data.repository.CrudRepository;

import com.springbootdata.h2Project.model.Bookstore;

public interface BookstoreRepository extends CrudRepository<Bookstore, Long>{

}
