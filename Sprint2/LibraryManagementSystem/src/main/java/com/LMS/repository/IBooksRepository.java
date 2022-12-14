package com.LMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.LMS.entity.Books;

@Repository
public interface IBooksRepository extends JpaRepository<Books, Long> {

}
