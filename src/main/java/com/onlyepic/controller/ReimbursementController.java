package com.onlyepic.controller;

import org.springframework.http.ResponseEntity;

import com.onlyepic.model.Reimbursement;

public interface ReimbursementController {

	ResponseEntity<Reimbursement> createReimbursement(Reimbursement reimbursement);
	public void deleteReimbursement(Reimbursement reimbursement);
	ResponseEntity<Reimbursement> updateReimbursement(Reimbursement reimbursement);
	ResponseEntity<Reimbursement> findByName(String reimbursementName);
	ResponseEntity<Reimbursement> findByStatus(String status);
	ResponseEntity<Reimbursement> findByReimbursementType(String reimbursementType);
	ResponseEntity<Reimbursement> findByEmployeeId(int employeeId);
}
