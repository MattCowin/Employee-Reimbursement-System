package com.onlyepic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlyepic.model.Employee;
import com.onlyepic.repository.EmployeeRepository;


@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepo;
	
	@Override
	public Employee newEmployee(Employee employee) {
		 return employeeRepo.save(employee);
	}

	@Override
	public void deleteEmployee(Employee employee) {
		employeeRepo.delete(employee);
		
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return employeeRepo.save(employee);
	}

	@Override
	public Employee findByEmployeeId(int employeeId) {
		return employeeRepo.findByEmployeeId(employeeId);
	}

	@Override
	public Employee findByName(String name) {
		return employeeRepo.findByFirstAndLastName(name);
	}

	
	

}
