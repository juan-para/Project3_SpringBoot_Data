package com.springbootdata.h2Project.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Bookstore {

//	Atributes-------------------------------------------
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private String adress;

	@OneToMany(mappedBy = "bookstore")
	private List<Book_Bookstore> book_Bookstore;

//	Constructors----------------------------------------
	public Bookstore() {
	}
	public Bookstore(String name, String adress) {
		super();
		this.name = name;
		this.adress = adress;
	}

//	Getters & Setters-----------------------------------
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}

//	toString-------------------------------------------
	@Override
	public String toString() {
		return "Bookstore [id=" + id + ", name=" + name + ", adress=" + adress + ", getName()=" + getName()
				+ ", getAdress()=" + getAdress() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
}
