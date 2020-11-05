package com.springbootdata.h2Project.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Book {
	
//	Atributes-------------------------------------------
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private String author;
	
	@OneToMany(mappedBy = "book")
	private List<Book_Bookstore> book_Bookstore;

//	Constructors----------------------------------------
	public Book() {}	
	public Book(String name, String author) {
		super();
		this.name = name;
		this.author = author;
	}
	
//	Getters & Setters-----------------------------------
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
//	toString-------------------------------------------
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + "]";
	}
	
}
