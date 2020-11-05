package com.springbootdata.h2Project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Book_Bookstore {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@ManyToOne
	private Book book;
	@ManyToOne
	private Bookstore bookstore;
	private int stock;
	
	public Book_Bookstore() {}
	public Book_Bookstore(Book book, Bookstore bookstore, int stock) {
		super();
		this.book = book;
		this.bookstore = bookstore;
		this.stock = stock;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public Bookstore getBookstore() {
		return bookstore;
	}
	public void setBookstore(Bookstore bookstore) {
		this.bookstore = bookstore;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	@Override
	public String toString() {
		return "Book_Bookstore [id=" + id + ", book=" + book + ", bookstore=" + bookstore + ", stock=" + stock + "]";
	}
}
