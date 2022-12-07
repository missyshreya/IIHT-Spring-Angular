package com.emp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emp.Entity.Employee;

@Repository 
//employee is the table name and integer is the key type(id)
public interface IEmployeeRepo extends JpaRepository<Employee, Integer> {

}
