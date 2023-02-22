package com.yedam.Patient.service;

import java.util.List;
import java.util.Scanner;


public class PatientService {

	Scanner sc = new Scanner(System.in);
	
	//환자 등록 ---차트번호,이름,담당사원번호,통증부위,연락처,생년월일,방문날짜
	public void insertpt() {
		Patient pt = new Patient();
		System.out.println("차트 번호 > ");
		pt.setPtId(sc.nextInt());
		System.out.println("이름 > ");
		pt.setPtName(sc.nextLine());
		System.out.println("담당사원번호 > ");
		pt.setPtManager(sc.nextInt());
		System.out.println("통증 부위 > ");
		pt.setPtPain(sc.nextLine());
		System.out.println("연락처 > ");
		pt.setPtPhone(sc.nextInt());
		System.out.println("생년월일 > ");
		pt.setPtBirth(sc.nextInt());
		System.out.println("방문일 > ");
		
		int result = StudentDAO.getInstance().insertStd(std);
		
		if(result > 0) {
			System.out.println("학생 정보 등록 완료");
		} else {
			System.out.println("학생 정보 등록 실패");
		}
	}
	
	//환자 조회 - 1)전체 환자 조회
	public void getStudentList() {
		List<Student> list = StudentDAO.getInstance().getStudentList();
		System.out.println("============================================");
		for(int i=0; i<list.size(); i++) {
			System.out.println("학생 이름 : " + list.get(i).getStdId());
			System.out.println("학생 이름 : " + list.get(i).getStdName());
			System.out.println("전공 과목 : " + list.get(i).getStdMajor());
			System.out.println("학생 점수 : " + list.get(i).getStdPoint());
			System.out.println("============================================");
		}
	}
	
	//환자조회 - 2)특정 환자 조회
	public void getStudent() {
		System.out.println("학번 입력>");
		int stdNo = Integer.parseInt(sc.nextLine());
		
		Student std =
		StudentDAO.getInstance().getStudent(stdNo);
		
		System.out.println("조회한 결과>");
		System.out.println(std.toString());
		
		}
	
	//환자 정보수정
	public void updateStd() {
		Student std = new Student();
		System.out.println("학번 입력 >");
		std.setStdId(Integer.parseInt(sc.nextLine()));
		System.out.println("변경할 전공 입력");
		std.setStdMajor(sc.nextLine());
		
	}
	
	//환자 삭제
	public void deleteStd() {
		System.out.println("학번 입력 >");
		int result = 
		StudentDAO.getInstance().deleteStd(Integer.parseInt(sc.nextLine()));
		if(result > 0) {
			System.out.println("학생 정보 삭제 완료");
		} else {
			System.out.println("학생 정보 삭제 실패");
		}
	}
	
	

	
}
