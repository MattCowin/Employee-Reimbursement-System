package com.onlyepic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="employeeSequence")
	@SequenceGenerator(name="employeeSequence", sequenceName="EMPLOYEE_SEQ", allocationSize=1)
	@Column(name="EMPLOYEE_ID")
	private int employeeId;
	@Column(name="FIRST_NAME")
	private String firstName;
	@Column(name="LAST_NAME")
	private String lastName;
	@Email
	@Column(name="EMAIL")
	private String email;
	@Pattern(regexp = "\\d{3}-\\d{3}-\\d{4}")
	@Column(name="MOBILE")
	private int mobile;
	@Column(name="ADDRESS")
	private String address;
	@Column(name="CITY")
	private String city;
	@Size(min=2, max=2)
	@Column(name="STATE")
	private String state;
	@Column(name="COUNTRY_CODE")
	private String countryCode;
	@Column(name="SALARY")
	private int salary;
	@Column(name="POSITION_ID")
	private int positionId;
	@Column(name="USERNAME")
	private String username;
	@Column(name="PASSWORD")
	private String password;
	
	public Employee() {
		super();
	
	}

	public Employee(int employeeId, String firstName, String lastName, String email, int mobile, String address,
			String city, String state, String countryCode, int salary, int positionId, String username,
			String password) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
		this.city = city;
		this.state = state;
		this.countryCode = countryCode;
		this.salary = salary;
		this.positionId = positionId;
		this.username = username;
		this.password = password;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getPositionId() {
		return positionId;
	}

	public void setPositionId(int positionId) {
		this.positionId = positionId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((countryCode == null) ? 0 : countryCode.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + employeeId;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + mobile;
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + positionId;
		result = prime * result + salary;
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
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
		Employee other = (Employee) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (countryCode == null) {
			if (other.countryCode != null)
				return false;
		} else if (!countryCode.equals(other.countryCode))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (employeeId != other.employeeId)
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (mobile != other.mobile)
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (positionId != other.positionId)
			return false;
		if (salary != other.salary)
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", mobile=" + mobile + ", address=" + address + ", city=" + city + ", state=" + state
				+ ", countryCode=" + countryCode + ", salary=" + salary + ", positionId=" + positionId + ", username="
				+ username + ", password=" + password + "]";
	}
	
	
	
	
}
