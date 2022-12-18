package com.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.book.entity.Books;
import com.book.service.IBookService;

@RestController
@RequestMapping("/digitalbooks")
public class BooksController {

@Autowired
private IBookService bookService;

@PostMapping("create/book/{aID}")
public ResponseEntity<Books> createBook(@PathVariable("aID") String aID, @RequestBody Books newBook){
	return new ResponseEntity<Books>(bookService.createBook(aID,newBook), HttpStatus.OK);
}

@PostMapping("edit/book/{bID}")
public ResponseEntity<Books> editBook(@PathVariable("bID") String bID, @RequestBody Books book){
	return new ResponseEntity<Books>(bookService.editBook(bID,book), HttpStatus.OK);
}

@GetMapping("search/book")
public Books searchBooks(@RequestParam String title, @RequestParam String category, @RequestParam String authorName, @RequestParam Float price ){
	return bookService.searchBooks(title, category, authorName, price);
}


}
