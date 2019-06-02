package com.onlyepic.service;

import com.onlyepic.model.Employee;

public interface EmployeeService {
	
	public Employee newEmployee(Employee employee);
	public void deleteEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	public Employee findByEmployeeId(int employeeId);
	//public Employee findByName(String firstName, String lastName);
}
