package com.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.book.entity.Books;

public interface IBookRepo extends JpaRepository<Books, Integer> {

}
