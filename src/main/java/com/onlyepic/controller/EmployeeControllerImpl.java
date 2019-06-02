package com.onlyepic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlyepic.model.Employee;
import com.onlyepic.service.EmployeeService;

@RestController("employeeController")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
@RequestMapping(path = "/employee")
public class EmployeeControllerImpl implements EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/create")
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
		Employee valid = employeeService.newEmployee(employee);
		return (valid != null) ?
				new ResponseEntity<>(valid, HttpStatus.CREATED):
				new ResponseEntity<>(HttpStatus.BAD_REQUEST );
	}

	@PutMapping("/update")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee) {
		Employee check = employeeService.updateEmployee(employee);
		return (check != null) ?
				new ResponseEntity<>(check, HttpStatus.RESET_CONTENT):
				new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}

	@PostMapping("/findemployee")
	public ResponseEntity<Employee> findByEmployeeId(@RequestBody int employeeId) {
		Employee valid = employeeService.findByEmployeeId(employeeId);
		return (valid != null) ?
				new ResponseEntity<>(valid, HttpStatus.OK):
				new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	@DeleteMapping("/delete")
	public void deleteEmployee(@RequestBody Employee employee) {
		employeeService.deleteEmployee(employee);
		
	}

	@PostMapping("/find")
	public ResponseEntity<Employee> findByFirstAndLastName(@RequestBody String name) {
		Employee valid = employeeService.findByName(name);
		return (valid != null) ?
				new ResponseEntity<>(valid, HttpStatus.OK):
				new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
	
	
	
}
