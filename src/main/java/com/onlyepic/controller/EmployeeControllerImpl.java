package com.onlyepic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlyepic.service.EmployeeService;

@RestController("employeeController")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
@RequestMapping(path = "/employee")
public class EmployeeControllerImpl implements EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	
}
