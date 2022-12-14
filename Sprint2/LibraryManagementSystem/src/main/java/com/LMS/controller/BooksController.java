package com.LMS.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LMS.entity.Books;
import com.LMS.service.IBooksService;

@RestController
@RequestMapping("/books")
public class BooksController {

	@Autowired
	private IBooksService booksService;
	
	@PostMapping("/add/book")
	public Long createABook(@RequestBody Books b){  //creating a new book and returning that book
		return booksService.createABook(b);
	}
	
	@GetMapping("/read/{id}")
	public Books getABookById(@PathVariable Long id){
		return booksService.getABookById(id);
	}
	
	@GetMapping("/allbooks")
	public List<Books> getAllBooks(){
		return booksService.getAllBooks();
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Books> editBook(@PathVariable("id") Long id,@RequestBody Books b){
		return new ResponseEntity<Books>(booksService.editBook(id, b), HttpStatus.OK);
	}
	
	@PutMapping("/borrow/{id}")
	public ResponseEntity<Books> changeStatus(@PathVariable("id") Long id,@RequestBody Books b){
		return new ResponseEntity<Books>(booksService.changeStatus(id, b), HttpStatus.OK);
	}
	
	@DeleteMapping("/remove/{id}")
	public ResponseEntity<Books> deleteABook(@PathVariable("id") Long id){
		ResponseEntity<Books> responseEntity= new ResponseEntity<>(HttpStatus.OK);
		try {
			booksService.deleteAbook(id);
		}
		catch(Exception e){
			e.printStackTrace();
			responseEntity= new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return responseEntity;
	}


}
