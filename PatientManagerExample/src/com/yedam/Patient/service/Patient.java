package com.yedam.Patient.service;

import java.sql.Date;

public class Patient {
//	PATIENT_ID        NOT NULL NUMBER(8)      
//	PATIENT_NAME      NOT NULL VARCHAR2(20)   
//	PATIENT_MANAGER   NOT NULL NUMBER(6)      
//	PATIENT_PAIN      NOT NULL VARCHAR2(4000) 
//	PATIENT_PHONE     NOT NULL NUMBER(11)     
//	PATIENT_BIRTHDATE NOT NULL NUMBER(6)      
//	PATIENT_VISITDATE NOT NULL DATE           
//	PATIENT_JOB       NOT NULL VARCHAR2(50)   
//	PATIENT_SEX       NOT NULL CHAR(1)        
//	PATIENT_DIAGNOSIS NOT NULL VARCHAR2(1000) 
	
	
	//필드 - 환자의 정보
	private int ptId;
	private String ptName;
	private int ptManager;
	private String ptPain;
	private int ptPhone;
	private int ptBirth;
	private Date ptVisit;
	private String ptJob;
	private char ptSex;
	private String ptDx;
	public int getPtId() {
		return ptId;
	}
	public void setPtId(int ptId) {
		this.ptId = ptId;
	}
	public String getPtName() {
		return ptName;
	}
	public void setPtName(String ptName) {
		this.ptName = ptName;
	}
	public int getPtManager() {
		return ptManager;
	}
	public void setPtManager(int ptManager) {
		this.ptManager = ptManager;
	}
	public String getPtPain() {
		return ptPain;
	}
	public void setPtPain(String ptPain) {
		this.ptPain = ptPain;
	}
	public int getPtPhone() {
		return ptPhone;
	}
	public void setPtPhone(int ptPhone) {
		this.ptPhone = ptPhone;
	}
	public int getPtBirth() {
		return ptBirth;
	}
	public void setPtBirth(int ptBirth) {
		this.ptBirth = ptBirth;
	}
	public Date getPtVisit() {
		return ptVisit;
	}
	public void setPtVisit(Date ptVisit) {
		this.ptVisit = ptVisit;
	}
	public String getPtJob() {
		return ptJob;
	}
	public void setPtJob(String ptJob) {
		this.ptJob = ptJob;
	}
	public char getPtSex() {
		return ptSex;
	}
	public void setPtSex(char ptSex) {
		this.ptSex = ptSex;
	}
	public String getPtDx() {
		return ptDx;
	}
	public void setPtDx(String ptDx) {
		this.ptDx = ptDx;
	}
	
	
	@Override
	public String toString() {
		return "Patient [ptId=" + ptId + ", ptName=" + ptName + ", ptManager=" + ptManager + ", ptPain=" + ptPain
				+ ", ptPhone=" + ptPhone + ", ptBirth=" + ptBirth + ", ptVisit=" + ptVisit + ", ptJob=" + ptJob
				+ ", ptSex=" + ptSex + ", ptDx=" + ptDx + "]";
	}
	
	
	
	
	
	
	
}
