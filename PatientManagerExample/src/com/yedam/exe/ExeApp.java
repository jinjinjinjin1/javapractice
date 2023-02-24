package com.yedam.exe;

import java.util.Scanner;

import com.yedam.Patient.service.PatientService;
import com.yedam.Reservation.service.ReservationService;
import com.yedam.physio.service.PhysioService;



	public class ExeApp {
		Scanner sc = new Scanner(System.in);
		
		PhysioService ps = new PhysioService();	
		
		
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
			if(PhysioService.physioInfo != null) { //로그인 되었다.
				//로그인 후 메뉴
				loginMenu();	//1.로그인이 되어 있을 때 메뉴창
			}else if(PhysioService.physioInfo == null) { //로그인 안됬다.
				//로그인 전 메뉴
				logoutMenu();	//2.로그인이 되어있지 않을때 메뉴창
			}
			
		}
	
	}
	
	
		private void loginMenu() {
			//환자 관련 프로그램 출력-환자 등록 ,환자 조회 ,환자 수정, 환자 삭제, 예약 스케쥴, 자유게시판, 로그아웃
			int loginMenu=0;
			
			PatientService pts= new PatientService();
			ReservationService rvs= new ReservationService();
			
			
			System.out.println("===================================================================================================================================");
			System.out.println(" 1.환자등록 | 2.모든 환자조회 | 3.특정 환자조회 | 4.환자수정 | 5.환자삭제 | 6.예약 조회 | 7.예약 등록 | 8.예약 수정 | 9.예약 삭제 | 10.자유게시판 | 11.로그아웃 ");
			System.out.println("===================================================================================================================================");
			
			System.out.println("입력>");
			menu = sc.nextLine();
			
			if(menu.equals("1")) {
				//환자 등록
				pts.insertpt(); //ss.insertStd();
				
			}else if(menu.equals("2")) {
				//모든 환자 조회
				pts.getPatientList(); //ss.getStudent(); 
				
			}else if(menu.equals("3")) {
				//특정 환자 조회
				pts.getPatinet();//ss.getStudent(); 
			
			}else if(menu.equals("4")) {
				//환자 수정
				pts.updatePt();//ss.updateStd();
			
			}else if(menu.equals("5")) {
				//환자 삭제
				pts.deletePt();//ss.deleteStd();
				
			}else if(menu.equals("6")) {
				//예약 조회
			
			}else if(menu.equals("7")) {
				//예약 등록
				rvs.insertRes();
			}else if(menu.equals("8")) {
				//예약 수정
				rvs.updateRes();

			}else if(menu.equals("9")) {
				//예약 삭제
				rvs.deleteRes();
			}else if(menu.equals("10")) {
				//자유 게시판
				
			}else if(menu.equals("11")) {
				System.out.println("로그아웃 완료");
				System.out.println("오늘도 수고하셨습니다~^▽^~★☆");
				PhysioService.physioInfo=null;
			}
		}
		
		

		private void logoutMenu() {
				ps.login();
				
			}
		
		
		
	
}
