package com.yedam.exe;

import java.util.Scanner;

import com.yedam.physio.service.PhysioService;



	public class ExeApp {
		PhysioService ps = new PhysioService();
		Scanner sc = new Scanner(System.in);
		String menu = "";
		boolean run = true;
		public ExeApp() {
			run();
		}
	
	
	private void run() {
		
		
		//내정보 조회, 탈퇴, 수정 
		//static -> 로그인, 로그아웃
		
		String menu = "";
		while(run) {
			//1.로그인이 되어 있을 때 메뉴창
			//2.로그인이 되어있지 않을때 메뉴창
			
			if(PhysioService.physioInfo != null) { //로그인 되었다.
				//로그인 후 메뉴
				loginMenu();
			}else if(PhysioService.physioInfo == null) { //로그인 안됬다.
				//로그인 전 메뉴
				logoutMenu();
			}
			
		}
	}
		private void loginMenu() {
			//환자 등록 ,환자 조회 ,환자 수정, 환자 삭제, 예약 스케쥴, 자유게시판, 로그아웃
			System.out.println("===============================================================================");
			System.out.println(" 1.환자등록 | 2.환자조회 | 3.환자수정 | 4.환자삭제 | 5.예약 스케쥴 | 6.자유게시판 | 7.로그아웃 ");
			System.out.println("===============================================================================");
			
			System.out.println("입력>");
			menu = sc.nextLine();
			
			if(menu.equals("1")) {
				//환자 등록
				//ss.getStudentList();
				//break;
			}else if(menu.equals("2")) {
				//환자 조회
				//ss.getStudent();
				//break;
			}else if(menu.equals("3")) {
				//환자 수정
				//ss.insertStd();
				//break;
			}else if(menu.equals("4")) {
				//환자 삭제
				//ss.deleteStd();
				//break;
			}else if(menu.equals("5")) {
				//예약 스케줄
				//ss.updateStd();
				//break;
			}else if(menu.equals("6")) {
				//자유 게시판
				//ss.updateStd();
				//break;
			}else if(menu.equals("7")) {
				System.out.println("로그아웃");
				//break;
			}
			
			
			
			
			
		}
		
		
		

		private void logoutMenu() {
			System.out.println("1.로그인  2. 로그아웃 ");
			System.out.println("입력 >");
			menu = sc.nextLine();
			
			if(menu.equals("1")) {
				ps.login();
			}else if(menu.equals("2")) {
				run = false;
				System.out.println("로그아웃 완료~^▽^♥");
				
			}
		}
		
		
	
}
