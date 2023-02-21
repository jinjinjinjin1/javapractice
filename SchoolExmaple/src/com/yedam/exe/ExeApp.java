package com.yedam.exe;

import java.util.Scanner;

import com.yedam.student.StudentService;

public class ExeApp {
	
	private String menu = null;
	private Scanner sc = new Scanner(System.in);
	private StudentService ss = new StudentService();
	
	public void run() {
		
		while(true) {
			
			menu();
			
			
			if(menu.equals("1")) {
				//전체 학생 조회
				ss.getStudentList();
				break;
			}else if(menu.equals("2")) {
				//학번 조회
				ss.getStudent();
				break;
			}else if(menu.equals("3")) {
				//등록 조회
				ss.insertStd();
				break;
			}else if(menu.equals("4")) {
				//제적 조회
				ss.deleteStd();
				break;
			}else if(menu.equals("5")) {
				//학생 전공 변경
				ss.updateStd();
				break;
			}else if(menu.equals("6")) {
				//전공별 합계 평균
				ss.updateStd();
				break;
			}else if(menu.equals("7")) {
				System.out.println("end of progra");
				break;
			}
			
			
			
		}
	}
	
	
	
	public void menu() {
		//학생 정보 조회, 등록, 제적, 전공 변경, 종료
		System.out.println("1. 전체 학생 조회 | 2. 학번 조회 | 3. 학생 등록 |"
				+ "4.제적 | 5. 전공 변경 | 6.종료 ");
		System.out.println("입력 >");
		menu = sc.nextLine();
	}
}
