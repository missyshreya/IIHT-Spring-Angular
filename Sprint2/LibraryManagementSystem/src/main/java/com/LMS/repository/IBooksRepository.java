package com.LMS.repository;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.LMS.entity.Books;

@Repository
public interface IBooksRepository extends JpaRepository<Books, Long> {
//code for DB updatation
	
	/*@Modifying
	@Query("update Books book set book.borrowedStatus= :borrowedStatus where book.id= :id")
	void updateBorrowedStatus(@Param("borrowedStatus") Boolean borrowedStatus, @Param("id") Long id);*/
}
