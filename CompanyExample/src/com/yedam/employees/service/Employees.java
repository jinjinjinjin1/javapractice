package com.yedam.employees.service;

public class Employees {
//	EMPLOYEE_ID             NUMBER(6)    
//	FIRST_NAME              VARCHAR2(20) 
//	LAST_NAME      NOT NULL VARCHAR2(25) 
//	EMAIL          NOT NULL VARCHAR2(25) 
//	PHONE_NUMBER            VARCHAR2(20) 
//	HIRE_DATE      NOT NULL DATE         
//	JOB_ID         NOT NULL VARCHAR2(10) 
	
	
	//java.sql.Date vs java.util.Date
	// 연원일                   연월일시분초
	//사용하는 방식이 조금 다름
	
	private int employeeId;
	private String employeeName;
	private int managerId;
	private int locationId;
	private String email;
	
	
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	public int getLocationId() {
		return locationId;
	}
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
	
	//toString
	
	
	
	
}
