package com.onlyepic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Position {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="positionSequence")
	@SequenceGenerator(name="positionSequence", sequenceName="POSITION_SEQ", allocationSize=1)
	@Column(name="POSITION_ID")
	private int positionId;
	@Column(name="POSITION_NAME")
	private String positionName;
	
	public Position() {
		super();
		
	}

	public Position(int positionId, String positionName) {
		super();
		this.positionId = positionId;
		this.positionName = positionName;
	}

	public int getPositionId() {
		return positionId;
	}

	public void setPositionId(int positionId) {
		this.positionId = positionId;
	}

	public String getPositionName() {
		return positionName;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + positionId;
		result = prime * result + ((positionName == null) ? 0 : positionName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Position other = (Position) obj;
		if (positionId != other.positionId)
			return false;
		if (positionName == null) {
			if (other.positionName != null)
				return false;
		} else if (!positionName.equals(other.positionName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Position [positionId=" + positionId + ", positionName=" + positionName + "]";
	}
	
	
	
}
