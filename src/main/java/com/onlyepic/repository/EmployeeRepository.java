package com.onlyepic.repository;

import org.springframework.stereotype.Repository;

import com.onlyepic.model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
	
	public Employee findByEmployeeId(int employeeId);
	
}
