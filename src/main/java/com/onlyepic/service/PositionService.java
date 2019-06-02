package com.onlyepic.service;

import com.onlyepic.model.Position;

public interface PositionService {
	
	public Position createPosition(Position position);
	public Position updatePositon(Position position);
	public void deletePosition(Position position);
	public Position findByPostionName(String positionName);
}
