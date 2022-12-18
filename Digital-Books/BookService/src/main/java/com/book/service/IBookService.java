package com.book.service;

import com.book.entity.Books;

public interface IBookService {

	public Books createBook(String authorID, Books book);
	
	public Books editBook(String bookID, Books book);
	
	public String updateBlockStatusofBook(String bookID, String authorID, Boolean status);
	
	public Books searchBooks(String title, String category, String authorName, Float price);
	
	
}
