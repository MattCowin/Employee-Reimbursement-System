package com.onlyepic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.onlyepic.model.Position;

@Repository
public interface PositionRepository extends JpaRepository<Position,Integer> {

	@Query(value = "SELECT * FROM POSITION WHERE POSITION_NAME = :positionName", nativeQuery = true)
	public Position findByName(String positionName);
}
