package com.yedam.Patient.service;

import com.yedam.Common.DAO;

public class PatientDAO extends DAO{
	
	//싱글톤
	private static  PatientDAO ptDao = new PatientDAO();    //Patient.service 전역에서 사용되는 인스턴스
	
	private PatientDAO() {
		
	}
	
	public static PatientDAO getInstance() {
		return ptDao;
	}
	
	//환자 등록
	
	//환자 조회
	
	//환자 정보 수정
	
	//환자 삭제
}
