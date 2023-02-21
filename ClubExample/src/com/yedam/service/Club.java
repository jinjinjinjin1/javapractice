package com.yedam.service;

public class Club {
//	CLUB_ID    NOT NULL VARCHAR2(20) 
//	CLUB_NAME  NOT NULL VARCHAR2(20) 
//	CLUB_JOIN           DATE         
//	CLUB_EMAIL NOT NULL VARCHAR2(30) 
//	CLUB_AGE   NOT NULL NUMBER(2)    
		
	//필드
	private String clubId;
	private String clubName;
	private String clubJoin;
	private String clubEmail;
	private String clubAge;
	
	
	//getter setter
	public String getClubId() {
		return clubId;
	}
	public void setClubId(String clubId) {
		this.clubId = clubId;
	}
	public String getClubName() {
		return clubName;
	}
	public void setClubName(String clubName) {
		this.clubName = clubName;
	}
	public String getClubJoin() {
		return clubJoin;
	}
	public void setClubJoin(String clubJoin) {
		this.clubJoin = clubJoin;
	}
	public String getClubEmail() {
		return clubEmail;
	}
	public void setClubEmail(String clubEmail) {
		this.clubEmail = clubEmail;
	}
	public String getClubAge() {
		return clubAge;
	}
	public void setClubAge(String clubAge) {
		this.clubAge = clubAge;
	}
	
	
	@Override
	public String toString() {
		return "Club [clubId=" + clubId + ", clubName=" + clubName + ", clubJoin=" + clubJoin + ", clubEmail="
				+ clubEmail + ", clubAge=" + clubAge + "]";
	}
	

		
	
}
