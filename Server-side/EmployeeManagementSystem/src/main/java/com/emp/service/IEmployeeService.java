package com.emp.service;

import java.util.List;

import com.emp.Entity.Employee;

public interface IEmployeeService {
	Integer saveEmployee(Employee employee);

	public List<Employee> getAllEmployees();
}