package com.onlyepic.controller;

import org.springframework.http.ResponseEntity;

import com.onlyepic.model.Employee;

public interface EmployeeController {

	ResponseEntity<Employee> createEmployee(Employee employee);
	ResponseEntity<Employee> updateEmployee(Employee employee);
	ResponseEntity<Employee> findByEmployeeId(int employeeId);
	ResponseEntity<Employee> findByFirstAndLastName(String name);
	public void deleteEmployee(Employee employee);
}
