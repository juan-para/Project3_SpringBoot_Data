package com.springbootdata.h2Project;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.springbootdata.h2Project.model.Book;
import com.springbootdata.h2Project.model.Book_Bookstore;
import com.springbootdata.h2Project.model.Bookstore;
import com.springbootdata.h2Project.service.BookService;
import com.springbootdata.h2Project.service.Book_BookstoreService;
import com.springbootdata.h2Project.service.BookstoreService;

public class ManyToManyRelationship_WithJoinTable {

	private static final Logger log = LoggerFactory.getLogger(UserCommandLineRunner.class);

	public void executeManyToMany(BookService bookService, BookstoreService bookStoreService,
			Book_BookstoreService book_BookStoreService) {
		
		log.info("Bookstore creation");
		Bookstore bookstore;
		bookstore = bookStoreService.save(new Bookstore("Maidana Libros", "Olmos y peatonal"));

		log.info("Book creation");
		Book book;
		book = bookService.save(new Book("Sintaxis y semantica de los lenguajes", "Alan Turing"));

		log.info("Join relation:");
		Book_Bookstore book_Bookstore = new Book_Bookstore(book, bookstore, 5);
		book_Bookstore = book_BookStoreService.save(book_Bookstore);
		
		log.info("Show Join relation:");
		for (Book_Bookstore joinResult : book_BookStoreService.retrieveAllBook_BookstoreRepository()) {
			log.info(joinResult.toString());
		}
	}

}
