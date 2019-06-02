package com.onlyepic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlyepic.model.Reimbursement;
import com.onlyepic.repository.ReimbursementRepository;

@Service("ReimbursementSerive")
public class ReimbursementServiceImpl implements ReimbursementService {

	@Autowired
	ReimbursementRepository reimbursementRepo;
	
	@Override
	public Reimbursement createReimbursement(Reimbursement reimbursement) {
		return reimbursementRepo.save(reimbursement);
	}

	@Override
	public void deleteReimbursement(Reimbursement reimbursement) {
		
		
	}

	@Override
	public Reimbursement updateReimbursement(Reimbursement reimbursement) {
		return reimbursementRepo.save(reimbursement);
	}

	@Override
	public Reimbursement findByName(String reimbursementName) {
		return reimbursementRepo.findByName(reimbursementName);
	}

	@Override
	public Reimbursement findByStatus(String status) {
		return reimbursementRepo.findByStatus(status);
	}

	@Override
	public Reimbursement findByReimbursementType(String reimbursementType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reimbursement findByEmployeeId(int employeeId) {
		return reimbursementRepo.findByEmployeeId(employeeId);
	}

}
