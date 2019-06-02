package com.onlyepic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlyepic.model.Reimbursement;
import com.onlyepic.service.ReimbursementService;

@RestController("reimbursementController")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
@RequestMapping(path = "/reimbursement")
public class ReimbursementControllerImpl implements ReimbursementController{

	@Autowired
	private ReimbursementService reimbursementService;

	@PostMapping("/create")
	public ResponseEntity<Reimbursement> createReimbursement(@RequestBody Reimbursement reimbursement) {
		Reimbursement valid = reimbursementService.createReimbursement(reimbursement);
		return (valid != null) ?
				new ResponseEntity<>(valid, HttpStatus.CREATED):
				new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}

	@DeleteMapping("/delete")
	public void deleteReimbursement(@RequestBody Reimbursement reimbursement) {
		reimbursementService.deleteReimbursement(reimbursement);
		
	}

	@PutMapping("/update")
	public ResponseEntity<Reimbursement> updateReimbursement(@RequestBody Reimbursement reimbursement) {
		Reimbursement valid = reimbursementService.updateReimbursement(reimbursement);
		return (valid != null) ?
				new ResponseEntity<>(valid, HttpStatus.RESET_CONTENT):
				new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}

	@PostMapping("/findname")
	public ResponseEntity<Reimbursement> findByName(@RequestBody String reimbursementName) {
		Reimbursement valid = reimbursementService.findByName(reimbursementName);
		return (valid != null) ?
				new ResponseEntity<>(valid, HttpStatus.OK):
				new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}

	@PostMapping("/findstatus")
	public ResponseEntity<Reimbursement> findByStatus(@RequestBody String status) {
		Reimbursement valid = reimbursementService.findByStatus(status);
		return (valid != null) ?
				new ResponseEntity<>(valid, HttpStatus.OK):
				new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}

	@PostMapping("/findtype")
	public ResponseEntity<Reimbursement> findByReimbursementType(@RequestBody String reimbursementType) {
		Reimbursement valid = reimbursementService.findByReimbursementType(reimbursementType);
		return (valid != null) ?
				new ResponseEntity<>(valid, HttpStatus.OK):
				new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}

	@PostMapping("/findemployee")
	public ResponseEntity<Reimbursement> findByEmployeeId(@RequestBody int employeeId) {
		Reimbursement valid = reimbursementService.findByEmployeeId(employeeId);
		return (valid != null) ?
				new ResponseEntity<>(valid, HttpStatus.OK):
				new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}
	
	
}
