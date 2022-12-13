package com.LMS.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LMS.entity.Books;
import com.LMS.exception.NoEntityFoundException;
import com.LMS.repository.IBooksRepository;

@Service
public class BooksServiceImpl implements IBooksService{

	@Autowired
	private IBooksRepository booksRepo;  //object of the interface that implements jparepo
	
	@Override
	public Long createABook(Books b) {
		Books saved= booksRepo.save(b);
		return saved.getId();
	}

	@Override
	public Books getABookById(Long id) {
		return booksRepo.findById(id).orElseThrow(() -> new NoEntityFoundException("Book","id",id));
	}

	@Override
	public List<Books> getAllBooks() {
		return booksRepo.findAll();
	}

	@Override
	public Books editBook(Long id, Books edit) {
		Books exists= booksRepo.findById(id).orElseThrow(() -> new NoEntityFoundException("Book","id",id));
		exists.setBookName(edit.getBookName());
		exists.setAuthorName(edit.getAuthorName());
		exists.setPrice(edit.getPrice());
		exists.setGenre(edit.getGenre());
		exists.setBorrowedStatus(edit.isBorrowedStatus());
		return booksRepo.save(exists);
	}

	@Override
	public Books changeStatus(Long id, Books b) {
		Books exists= booksRepo.findById(id).orElseThrow(() -> new NoEntityFoundException("Book", "id", id));
		exists.setBorrowedStatus(b.isBorrowedStatus());
		return booksRepo.save(exists);
	}

	@Override
	public void deleteAbook(Long id) {
		booksRepo.deleteById(id);
	}

}
