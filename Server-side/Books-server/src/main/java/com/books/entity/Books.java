package com.books.entity;

import java.sql.Date;

public class Books {

	private Integer bookId;
	private String logo;
	private String category;
	private String author;
	private Integer price;
	private String title;
	private String publisher;
	private Date published_date;
	private String book_content;
	private boolean active;
	
	public Integer getBookId() {
		return bookId;
	}
	public String getLogo() {
		return logo;
	}
	public String getCategory() {
		return category;
	}
	public String getAuthor() {
		return author;
	}
	public Integer getPrice() {
		return price;
	}
	public String getTitle() {
		return title;
	}
	public String getPublisher() {
		return publisher;
	}
	public Date getPublished_date() {
		return published_date;
	}
	public String getBook_content() {
		return book_content;
	}
	public boolean isActive() {
		return active;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public void setPublished_date(Date published_date) {
		this.published_date = published_date;
	}
	public void setBook_content(String book_content) {
		this.book_content = book_content;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	public Books(Integer bookId,String logo, String category, String author, Integer price, String title, String publisher,
			Date published_date, String book_content, boolean active) {
		super();
		this.logo = logo;
		this.category = category;
		this.author = author;
		this.price = price;
		this.title = title;
		this.publisher = publisher;
		this.published_date = published_date;
		this.book_content = book_content;
		this.active = active;
	}
	
}
