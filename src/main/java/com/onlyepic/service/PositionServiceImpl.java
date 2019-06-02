package com.onlyepic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlyepic.model.Position;
import com.onlyepic.repository.PositionRepository;

@Service("positionService")
public class PositionServiceImpl implements PositionService {

	@Autowired
	private PositionRepository positionRepo;
	
	@Override
	public Position createPosition(Position position) {
		return positionRepo.save(position);
	}

	@Override
	public Position updatePositon(Position position) {
		return positionRepo.save(position);
	}

	@Override
	public void deletePosition(Position position) {
		
		
	}

	@Override
	public Position findByPostionName(String positionName) {
		return positionRepo.findByName(positionName);
	}

}
