package com.yedam.physio.service;

public class Physio {
//	---------------- -------- ------------ 
//	PHYSIO_NAME      NOT NULL VARCHAR2(20) 
//	PHYSIO_PW        NOT NULL NUMBER(6)    
//	PHYSIO_PHONE     NOT NULL NUMBER(11)   
//	PHYSIO_BIRTHDATE NOT NULL NUMBER(6)    
//	PHYSIO_EMAIL     NOT NULL VARCHAR2(30) 
	
	//필드-사원의 정보
	private String physioName;   
	private int physioPw;     
	private int physioPhone;   
	private int physioBirthDate;
	private String physioEmail;
		
	
	//사원의 getter와 setter
	public String getPhysioName() {
		return physioName;
	}
	public void setPhysioName(String physioName) {
		this.physioName = physioName;
	}
	public int getPhysioPw() {
		return physioPw;
	}
	public void setPhysioPw(int physioPw) {
		this.physioPw = physioPw;
	}
	public int getPhysioPhone() {
		return physioPhone;
	}
	public void setPhysioPhone(int physioPhone) {
		this.physioPhone = physioPhone;
	}
	public int getPhysioBirthDate() {
		return physioBirthDate;
	}
	public void setPhysioBirthDate(int physioBirthDate) {
		this.physioBirthDate = physioBirthDate;
	}
	public String getPhysioEmail() {
		return physioEmail;
	}
	public void setPhysioEmail(String physioEmail) {
		this.physioEmail = physioEmail;
	}
	@Override
	public String toString() {
		return "Physio [physioName=" + physioName + ", physioPw=" + physioPw + ", physioPhone=" + physioPhone
				+ ", physioBirthDate=" + physioBirthDate + ", physioEmail=" + physioEmail + "]";
	}
	
	
	
}
