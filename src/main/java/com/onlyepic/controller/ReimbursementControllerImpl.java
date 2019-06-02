package com.onlyepic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlyepic.service.ReimbursementService;

@RestController("reimbursementController")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
@RequestMapping(path = "/reimbursement")
public class ReimbursementControllerImpl implements ReimbursementController{

	@Autowired
	private ReimbursementService reimbursementService;
	
	
}
