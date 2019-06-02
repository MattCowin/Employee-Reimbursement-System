package com.onlyepic.service;

import com.onlyepic.model.Reimbursement;

public interface ReimbursementService {

	public Reimbursement createReimbursement(Reimbursement reimbursement);
	public void deleteReimbursement(Reimbursement reimbursement);
	public Reimbursement updateReimbursement(Reimbursement reimbursement);
	public Reimbursement findByName(String reimbursementName);
	public Reimbursement findByStatus(String status);
	public Reimbursement findByReimbursementType(String reimbursementType);
	public Reimbursement findByEmployeeId(int employeeId);
	
}
