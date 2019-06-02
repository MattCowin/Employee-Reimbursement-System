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

import com.onlyepic.model.Position;
import com.onlyepic.service.PositionService;

@RestController("positionController")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
@RequestMapping(path = "/position")
public class PositionControllerImpl implements PositionController {

	@Autowired
	private PositionService positionService;

	@PostMapping("/create")
	public ResponseEntity<Position> createPosition(@RequestBody Position position) {
		Position valid = positionService.createPosition(position);
		return (valid != null) ?
				new ResponseEntity<>(valid, HttpStatus.CREATED):
				new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}

	@PutMapping("/update")
	public ResponseEntity<Position> updatePositon(@RequestBody Position position) {
		Position valid = positionService.updatePositon(position);
		return (valid != null) ?
				new ResponseEntity<>(valid, HttpStatus.RESET_CONTENT):
				new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}

	@DeleteMapping("/delete")
	public void deletePosition(@RequestBody Position position) {
		positionService.deletePosition(position);
		
	}

	@PostMapping("/find")
	public ResponseEntity<Position> findByPostionName(@RequestBody String positionName) {
		Position valid = positionService.findByPostionName(positionName);
		return (valid != null) ?
				new ResponseEntity<>(valid, HttpStatus.OK):
				new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
	
}
