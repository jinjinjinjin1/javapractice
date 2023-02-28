package com.yedam.exe;

import java.util.Scanner;

import com.yedam.Patient.service.PatientService;
import com.yedam.Reservation.service.ReservationService;
import com.yedam.board.service.BoardService;
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
				ps.login();
				//2.로그인이 되어있지 않을때 메뉴창
			}
			
		}
	
	}

	int selectNo = 0;
	//메뉴선택 출력
	private void loginMenu() {
		System.out.println("──────────────────────────────────예담 병원─────────────────────────────────");
		System.out.println("                                                                          ");
		System.out.println("                                                                          ");
		System.out.println("              1.환자 관리   |   2.예약 관리   |   3.게시판   |   4.로그아웃        ");
		System.out.println("                                                                          ");
		System.out.println("                                                                          ");
		System.out.println("──────────────────────────────────────────────────────────────────────────");
		System.out.println();
		System.out.println("입력 > ");
		selectNo = Integer.parseInt(sc.nextLine());
		
//		while(selectNo != 4) {
			//menu();
			switch(selectNo) {
			case 1:
				Patient();
				break;
			case 2:
				Reservation();
				break;
			case 3:
				Board();
				break;
				
			case 4:
				System.out.println();
				System.out.println("로그아웃 완료");
				System.out.println("오늘도 수고하셨습니다~^▽^");
				PhysioService.physioInfo=null;
//				ps.login();
				break;
			}
			
//		}
		
		
	}
	private void Board() {
		// 게시판 관련 프로그램
		int BoardMenu=0;
		BoardService  bs= new BoardService();
		
		while(BoardMenu !=4) {
			System.out.println("────────────────────────────────────────────예담 병원────────────────────────────────────────────────");
			System.out.println("                                                                                                   ");
			System.out.println("                                                                                                   ");
			System.out.println("    1.게시글 등록  |  2.게시글 전체 조회  |  3.게시글 특정 조회  |  4.게시글 수정  |  5.게시글 삭제  |  6.뒤로가기    ");
			System.out.println("                                                                                                   ");
			System.out.println("                                                                                                   ");
			System.out.println("───────────────────────────────────────────────────────────────────────────────────────────────────");
			System.out.println();
			BoardMenu=Integer.parseInt(sc.nextLine());
			
			switch(BoardMenu) {
			case 1:
				bs.insertb();
				break;
			case 2:
				bs.getBoardList();
				break;
			case 3:
				bs.getBoard();
				break;
			case 4:
				bs.updateb();
				break;
			case 5:
				bs.deleteb();
				break;
			case 6:
				System.out.println("☞ 게시판 프로그램 종료");
				System.out.println();
				loginMenu();
				break;
			}
			
		}
	}


	
	private void Reservation() {
		//예약 관련 프로그램
		int ReservationMenu =0;
		ReservationService rvs= new ReservationService();
		
		while(ReservationMenu !=5) {
			System.out.println("──────────────────────────────────────────────예담 병원───────────────────────────────────────────────");
			System.out.println("                                                                                                    ");
			System.out.println("                                                                                                    ");
			System.out.println("                    1.예약 조회  |  2.예약 등록  |  3.예약 수정  |  4.예약 삭제  |  5.뒤로가기                 ");
			System.out.println("                                                                                                    ");
			System.out.println("                                                                                                    ");
			System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────");
			System.out.println();
			System.out.println("입력 >");
			ReservationMenu=Integer.parseInt(sc.nextLine());
			
			switch(ReservationMenu) {
			case 1:
				rvs.getReservation();
				break;
			case 2:
				rvs.insertRes();
				break;
			case 3:
				rvs.updateRes();
				break;
			case 4:
				rvs.deleteRes();
				break;
			case 5:
				System.out.println("☞ 예약 관리 프로그램 종료");
				System.out.println();
				loginMenu();
				break;

			}
			
		}
	}


	private void Patient() {
		// 환자 관련 프로그램
		int PatientMenu = 0;
		PatientService pts= new PatientService();
		
		while(PatientMenu !=5) {
			System.out.println("──────────────────────────────────────────────예담 병원───────────────────────────────────────────────");
			System.out.println("                                                                                                    ");
			System.out.println("                                                                                                    ");
			System.out.println("         1.환자 등록 |  2.모든 환자조회 |  3.특정 환자조회 |  4.환자 정보 수정 |  5.환자 정보 삭제 |  6.뒤로가기       ");
			System.out.println("                                                                                                    ");
			System.out.println("                                                                                                    ");
			System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────");
			System.out.println();
			System.out.println("입력 >");
			
			PatientMenu=Integer.parseInt(sc.nextLine());
			
			switch(PatientMenu) {
			case 1:
				pts.insertpt();
				break;
			case 2:
				pts.getPatientList();
				break;
			case 3:
				pts.getPatinet();
				break;
			case 4:
				pts.updatePt();
				break;
			case 5:
				pts.deletePt();
				break;
			case 6:
				System.out.println("☞ 환자 관리 프로그램 종료");
				System.out.println();
				loginMenu();
				break;
			}
		}
		
	}

	
//				private void logoutMenu() {
//					
//					ps.login();
//					
//				
//			}
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//		private void loginMenu() {
//			//환자 관련 프로그램 출력-환자 등록 ,환자 조회 ,환자 수정, 환자 삭제, 예약 스케쥴, 자유게시판, 로그아웃
//			int loginMenu=0;
//			
//			PatientService pts= new PatientService();
//			ReservationService rvs= new ReservationService();
//			BoardService  bs= new BoardService();
//			
//			System.out.println("================================================================================================================================================================================");
//			System.out.println(" 1.환자 등록 | 2.모든 환자조회 | 3.특정 환자조회 | 4.환자 정보 수정 | 5.환자 정보 삭제 | 6.예약 조회 | 7.예약 등록 | 8.예약 수정 | 9.예약 삭제 | 10.게시글 등록 | 11.게시글 전체 조회 | 12.게시글 특정 조회| 13.게시글 수정 | 14.게시글 삭제 | 15.로그아웃 ");
//			System.out.println("================================================================================================================================================================================");
//						
//			
//			
//			if(menu.equals("1")) {
//				//환자 등록
//				pts.insertpt(); //ss.insertStd();
//				
//			}else if(menu.equals("2")) {
//				//모든 환자 조회
//				pts.getPatientList(); //ss.getStudent(); 
//				
//			}else if(menu.equals("3")) {
//				//특정 환자 조회
//				pts.getPatinet();//ss.getStudent(); 
//			
//			}else if(menu.equals("4")) {
//				//환자 수정
//				pts.updatePt(); //ss.updateStd();
//			
//			}else if(menu.equals("5")) {
//				//환자 삭제
//				pts.deletePt();//ss.deleteStd();
//				
//			}else if(menu.equals("6")) {
//				//예약 조회
//				rvs.getReservation();
//			}else if(menu.equals("7")) {
//				//예약 등록
//				rvs.insertRes();
//			}else if(menu.equals("8")) {
//				//예약 수정
//				rvs.updateRes();
//
//			}else if(menu.equals("9")) {
//				//예약 삭제
//				rvs.deleteRes();
//			}else if(menu.equals("10")) {
//				//게시글 등록
//				bs.insertb();
//			}else if(menu.equals("11")) {
//				//게시글 전체조회
//				bs.getBoardList();
//			}else if(menu.equals("12")) {
//				//게시글 특정조회
//				bs.getBoard();
//			}else if(menu.equals("13")) {
//				//글 수정
////				bs.updateb();
//			}else if(menu.equals("14")) {
////				//글 삭제
//				bs.deleteb();
//				
//			}else if(menu.equals("15")) {
//				System.out.println("로그아웃 완료");
//				System.out.println("오늘도 수고하셨습니다~^▽^~★☆");
//				PhysioService.physioInfo=null;
//			}
//	}
//		
//		
//
		
	
	
	

}
