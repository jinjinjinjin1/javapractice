package com.yedam.Reservation.service;

import java.util.Scanner;


public class ReservationService {
	
	public static Reservation reservationInfo = null;
	
	Scanner sc = new Scanner(System.in);
	
	//예약 조회
	public void getReservation() {
		System.out.println("차트번호 >");
		int ptId = Integer.parseInt(sc.nextLine());
		
		Reservation res =
		ReservationDAO.getInstance().getReservation(ptId);
		System.out.println("조회한 예약 결과>");
		System.out.println(res.toString());
	}
	//예약 등록--예약날짜, 예약 시간, 환자 아이디
	public void insertRes() {
		Reservation res = new Reservation();
		System.out.println("예약 날짜 > ");
		res.setResDate(sc.nextLine());
		System.out.println("예약 시간 > ");
		res.setResTime(sc.nextLine());
		System.out.println("차트 번호 > ");
		res.setPtId(Integer.parseInt(sc.nextLine()));
		
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
			
			System.out.println("========예약 정보 수정 ========");
			System.out.println("차트번호를 입력하세요. >");
			res.setPtId(Integer.parseInt(sc.nextLine()));
			System.out.println("변경할 날짜 입력 >");
			res.setResDate(sc.nextLine());
			System.out.println("변경할 시간 입력 >");
			res.setResTime(sc.nextLine());
			
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
