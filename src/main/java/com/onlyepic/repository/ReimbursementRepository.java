package com.onlyepic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.onlyepic.model.Reimbursement;

@Repository
public interface ReimbursementRepository extends JpaRepository<Reimbursement,Integer>{

	@Query(value="SELECT * FROM REIMBURSEMENTS WHERE REIMBURSEMENT_NAME = :reimbursementName", nativeQuery = true)
	public Reimbursement findByName(String reimbursementName);
	@Query(value="SELECT * FROM REIMBURSEMENTS WHERE REIMBURSEMENT_TYPE = :reimbursementType", nativeQuery = true)
	public Reimbursement findByReimbursementType(String reimbursementType);
	public Reimbursement findByStatus(String status);
	public Reimbursement findByEmployeeId(int employeeId);
}
