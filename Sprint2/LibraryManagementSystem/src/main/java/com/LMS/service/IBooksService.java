package com.LMS.service;

import java.util.List;
import java.util.Optional;

import com.LMS.entity.Books;


public interface IBooksService {

	public Long createABook(Books b);
	
	public Books getABookById(Long id);
	
	public List<Books> getAllBooks();
	
	public Books editBook(Long id, Books edit);
	
	public Books changeStatus(Long id, Books b);
	
	public void deleteAbook(Long id);
}
