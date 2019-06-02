package com.onlyepic.controller;

import org.springframework.http.ResponseEntity;

import com.onlyepic.model.Position;

public interface PositionController {

	ResponseEntity<Position> createPosition(Position position);
	ResponseEntity<Position> updatePositon(Position position);
	public void deletePosition(Position position);
	ResponseEntity<Position> findByPostionName(String positionName);
}
