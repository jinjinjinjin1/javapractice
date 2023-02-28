package com.yedam.Patient.service;

import java.sql.Date;

public class Patient {
	//DTO 혹은 VO
	
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
	private String ptPhone;
	private int ptBirth;
	private Date ptVisit;
	private String ptJob;
	private String ptSex;
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
	public String getPtPhone() {
		return ptPhone;
	}
	public void setPtPhone(String ptPhone) {
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
	public String getPtSex() {
		return ptSex;
	}
	public void setPtSex(String ptSex) {
		this.ptSex = ptSex;
	}

	public String getPtDx() {
		return ptDx;
	}
	public void setPtDx(String ptDx) {
		this.ptDx = ptDx;
	}
	
	
//	@Override
//	public String toString() {
//		return "Patient [ptId=" + ptId + ", ptName=" + ptName + ", ptManager=" + ptManager + ", ptPain=" + ptPain
//				+ ", ptPhone=" + ptPhone + ", ptBirth=" + ptBirth + ", ptVisit=" + ptVisit + ", ptJob=" + ptJob
//				+ ", ptSex=" + ptSex + ", ptDx=" + ptDx + "]";
//	}
//	
	@Override
	public String toString() {
		return "────────────환자 차트기록지──────────── \n  차트 번호:  " + ptId + "\n  이   름:  " + ptName + "\n  담당 사원:  " + ptManager + "\n  통증  부위: " + ptPain
				+ "\n  연 락 처:  " + ptPhone + "\n  생년 월일:  " + ptBirth + "\n  방 문 일:  " + ptVisit + "\n  직   업:  " + ptJob
				+ "\n  성   별:  " + ptSex + "\n  진 단 명:  " + ptDx + "\n─────────────────────────────";
	}
	
	
	
	
	
}
