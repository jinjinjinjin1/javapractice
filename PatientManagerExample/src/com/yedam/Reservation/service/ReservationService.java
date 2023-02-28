package com.yedam.Reservation.service;

import java.util.List;
import java.util.Scanner;

import com.yedam.board.service.Board;
import com.yedam.board.service.BoardDAO;


public class ReservationService {
	
	public static Reservation reservationInfo = null;
	
	Scanner sc = new Scanner(System.in);
	

	//예약 조회(특정)
	public void getReservation() {
		System.out.println("예약 코드 >");
		//System.out.println("ex) 2023/00/00/0시 으로 입력해주세요.");
		String resKey = sc.nextLine();
		
		Reservation res = 
		ReservationDAO.getInstance().getReservation(resKey);
		
		System.out.println("조회한 예약 결과>");
		System.out.println(res);
		
		if(res == null) {
			System.out.println("☞예약 가능");
		}else{
			System.out.println("☞예약 불가능");
		}
		System.out.println();
	}
	//예약 등록--예약날짜, 예약 시간, 환자 아이디
	public void insertRes() {
		Reservation res = new Reservation();
		
		System.out.println("예약 날짜 > ");
		res.setResDate(sc.nextLine());
		System.out.println("오전 | 9시,10시,11시,12시 - 오후 | 2시,3시,4시,5시 ");
		
		System.out.println("예약 시간 > ");
		res.setResTime(sc.nextLine());
		System.out.println("차트 번호 > ");
		res.setPtId(Integer.parseInt(sc.nextLine()));
		System.out.println("예약 코드 > ");
		//System.out.println("ex) 년도/달/일/시간 으로 입력해주세요.");
		res.setResCode(sc.nextLine());
		int result =ReservationDAO.getInstance().insertRes(res);
		
		if(result > 0) {
			System.out.println("예약 정보 등록 완료");
		} else {
			System.out.println("예약 정보 등록 실패");
		}
		
	}
	
	
	//예약 정보 수정-연락처 수정
		public void updateRes() {
			Reservation res = new Reservation();
			
			System.out.println("========예약 수정 ========");
			System.out.println("차트번호를 입력하세요. >");
			res.setPtId(Integer.parseInt(sc.nextLine()));
			System.out.println("변경할 날짜  >");
			res.setResDate(sc.nextLine());
			System.out.println();
			System.out.println("변경할 시간 >");
			res.setResTime(sc.nextLine());
			System.out.println();
			System.out.println("변경할 예약 코드 > ");
			res.setResCode(sc.nextLine());
			System.out.println();
			
			int result = 
			ReservationDAO.getInstance().updateRes(res);
			
			if(result > 0) {
				System.out.println("☞예약 정보 수정 완료!");
			} else {
				System.out.println("☞예약 정보 수정 실패!");
			}
			
		}
		
		
		
		//예약 삭제
		public void deleteRes() {
			System.out.println("==========예약 삭제 =========");
			System.out.println("차트 번호를 입력하세요. >");
			int ptId = Integer.parseInt(sc.nextLine());
			Reservation res = new Reservation();
			res.setPtId(ptId);
			int result = 
			ReservationDAO.getInstance().getInstance().deleteRes(res);
		
			if(result > 0) {
				System.out.println("☞예약 정보 삭제 완료!");
			} else {
				System.out.println("☞예약 정보 삭제 실패!");
			}
		}
		
		
}
