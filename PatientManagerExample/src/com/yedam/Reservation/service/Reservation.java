package com.yedam.Reservation.service;

import java.sql.Date;

public class Reservation {
	
	//필드
//	RES_DATE   NOT NULL DATE         
//	RES_TIME   NOT NULL VARCHAR2(30) 
//	PATIENT_ID          NUMBER(6) 
//	RES_CODE   NOT NULL VARCHAR2(30) 
	
	private String resDate;
	private String resTime;
	private int ptId;
	private String resCode;
	

	public String getResDate() {
		return resDate;
	}
	public void setResDate(String resDate) {
		this.resDate = resDate;
	}
	public String getResTime() {
		return resTime;
	}
	public void setResTime(String resTime) {
		this.resTime = resTime;
	}
	public int getPtId() {
		return ptId;
	}
	public void setPtId(int ptId) {
		this.ptId = ptId;
	}
		public String getResCode() {
		return resCode;
	}
	public void setResCode(String resCode) {
		this.resCode = resCode;
	}
	
//	@Override
//	public String toString() {
//		return "Reservation [resDate=" + resDate + ", resTime=" + resTime + ", ptId=" + ptId + ", resCode=" + resCode
//				+ "]";
//	}
//	
//	@Override
//	public String toString() {
//		return "Reservation [resDate=" + resDate + ", resTime=" + resTime + ", ptId=" + ptId + "]";
//	}
	
	
	@Override
	public String toString() {
		return "         ◈환자 예약현황◈ \n 예약 날짜: " + resDate + "\n 예약 시간: " + resTime + "\n 예약 차트번호: " + ptId + "\n 예약 코드 : " + resCode + "\n◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈";
	}
	
	
	
	
	
}
