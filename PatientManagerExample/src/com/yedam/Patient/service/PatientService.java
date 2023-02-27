package com.yedam.Patient.service;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;




public class PatientService {

	public static Patient patientInfo = null;
	
	Scanner sc = new Scanner(System.in);
	
	//환자 등록 ---차트번호,이름,담당사원번호,통증부위,연락처,생년월일,방문날짜,직업,성별,진단명
	public void insertpt() {
		Patient pt = new Patient();
		System.out.println("차트 번호 > ");
		pt.setPtId(Integer.parseInt(sc.nextLine()));
		System.out.println("이름 > ");
		pt.setPtName(sc.nextLine());
		System.out.println("담당사원번호 > ");
		pt.setPtManager(Integer.parseInt(sc.nextLine()));
		System.out.println("통증 부위 > ");
		pt.setPtPain(sc.nextLine());
		System.out.println("연락처 > ");
		pt.setPtPhone(sc.nextLine());
		System.out.println("생년월일 > ");
		pt.setPtBirth(Integer.parseInt(sc.nextLine()));
		System.out.println("방문일 > ");
		pt.setPtVisit(Date.valueOf(sc.nextLine()));
		System.out.println("직업 > ");
		pt.setPtJob(sc.nextLine());
		System.out.println("성별 > ");
		pt.setPtSex(sc.nextLine());
		System.out.println("진단명 > ");
		pt.setPtDx(sc.nextLine());
		
		int result =PatientDAO.getInstance().insertpt(pt);
		
		if(result > 0) {
			System.out.println("환자 정보 등록 완료");
		} else {
			System.out.println("환자 정보 등록 실패");
		}
	}
	
	//환자 조회 - 1)전체 환자 조회
	public void getPatientList() {
		List<Patient> list = PatientDAO.getInstance().getPatientList();
		System.out.println("============================================");
		for(int i=0; i<list.size(); i++) {
			System.out.println("차트 번호 : " + list.get(i).getPtId());
			System.out.println("환자 이름 : " + list.get(i).getPtName());
			System.out.println("담당사원번호 : " + list.get(i).getPtManager());
			System.out.println("통증 부위 : " + list.get(i).getPtPain());
			System.out.println("연락처 : " + list.get(i).getPtPhone());
			System.out.println("생년월일 : " + list.get(i).getPtBirth());
			System.out.println("방문일 : " + list.get(i).getPtVisit());
			System.out.println("직업 : " + list.get(i).getPtJob());
			System.out.println("성별 : " + list.get(i).getPtSex());
			System.out.println("진단명 : " + list.get(i).getPtDx());
			System.out.println("============================================");
		}
	}
	
	//환자조회 - 2)특정 환자 조회(차트번호로 조회)
	public void getPatinet() {
		System.out.println("차트 번호>");
		int ptId = Integer.parseInt(sc.nextLine());
		
		Patient pt =
		PatientDAO.getInstance().getPatient(ptId);
		
		System.out.println("조회한 환자 결과>");
		System.out.println(pt.toString());
		}

//	//환자 정보 수정-연락처 수정
	public void updatePt() {
		Patient pt = new Patient();
		System.out.println("========환자 정보 수정 ========");
		System.out.println("차트번호를 입력하세요. >");
		pt.setPtId(Integer.parseInt(sc.nextLine()));
		System.out.println("변경할 연락처 입력 >");
		pt.setPtPhone(sc.nextLine());
		
		int result = 
		PatientDAO.getInstance().updatePt(pt);
		
		if(result > 0) {
			System.out.println("☞환자 정보 수정 완료!");
		} else {
			System.out.println("☞환자 정보 수정 실패!");
		}
		
	}
	
	//환자 삭제-차트번호로 삭제 
	public void deletePt() {
		System.out.println("==========환자 삭제 =========");
		System.out.println("차트 번호를 입력하세요. >");
		int ptId = Integer.parseInt(sc.nextLine());
		Patient pt = new Patient();
		pt.setPtId(ptId);
		int result = 
		PatientDAO.getInstance().getInstance().deletePt(pt);
	
		if(result > 0) {
			System.out.println("☞환자 정보 삭제 완료!");
		} else {
			System.out.println("☞환자 정보 삭제 실패!");
		}
	}
//	
//	//환자 삭제
//	public void deletePt() {
//	System.out.println("==========환자 삭제 =========");
//	System.out.println("삭제할 환자 이름을 입력하세요. >");
//	String ptName = sc.nextLine();
//	Patient pt = new Patient();
//	pt.setPtName(ptName);
//	int result = 
//	PatientDAO.getInstance().getInstance().deletePt(pt);
//
//	if(result > 0) {
//		System.out.println("☞환자 기록 삭제 완료!");
//	} else {
//		System.out.println("☞환자 기록 삭제 실패!");
//	}
//}
	

	
}
