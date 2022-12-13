package com.LMS.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Books {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Long id;
	private String bookName;
	private String authorName;
	private float price;
	private String genre;
	private boolean borrowedStatus;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public boolean isBorrowedStatus() {
		return borrowedStatus;
	}
	public void setBorrowedStatus(boolean borrowedStatus) {
		this.borrowedStatus = borrowedStatus;
	}
	public Books(Long id, String bookName, String authorName, float price, String genre, boolean borrowedStatus) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.authorName = authorName;
		this.price = price;
		this.genre = genre;
		this.borrowedStatus = borrowedStatus;
	}
	public Books() {
		super();
	}
	
	
	
}
