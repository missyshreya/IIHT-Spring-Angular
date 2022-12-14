package com.emp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.Entity.Employee;
import com.emp.exception.ResourceNotFoundExceptionHandler;
import com.emp.repo.IEmployeeRepo;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
	@Autowired
	private IEmployeeRepo employeeRepo;

	@Override
	public Integer saveEmployee(Employee employee) { 
		Employee savedEmployee = employeeRepo.save(employee); //save method of jpa repo
		return savedEmployee.getId(); 
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepo.findAll();
	}
	
	@Override
	public Optional<Employee> getEmployee(Integer id){
		return employeeRepo.findById(id);
	}
	
	@Override
	public void deleteEmployee(Integer id){
		employeeRepo.deleteById(id);
	}
	
	public Employee updateEmployee(Employee employee, Integer id) {
		//lets check if employee exists with the given value or not
		Employee existingEmployee = employeeRepo.findById(id).orElseThrow(
				() -> new ResourceNotFoundExceptionHandler("Employee", "id", id));
		existingEmployee.setEname(employee.getEname());
		existingEmployee.setEposition(employee.getEposition());
		existingEmployee.setEmail(employee.getEmail());
		existingEmployee.setSalary(employee.getSalary());
		
		employeeRepo.save(existingEmployee);
		return existingEmployee;
				
	}
}
