package com.yedam.board.service;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;


public class BoardService {
	
	public static Board boardInfo = null;
	
	
	Scanner sc = new Scanner(System.in);
	
	//글 등록
	public void insertb() {
		Board b = new Board();
		System.out.println("글 번호> ");
		b.setBoardNo(Integer.parseInt(sc.nextLine()));
		System.out.println("글 제목> ");
		b.setBoardTt(sc.nextLine());
		System.out.println("글 내용> ");
		b.setBoardCon(sc.nextLine());
		System.out.println("조회수 > ");
		b.setBoardView(Integer.parseInt(sc.nextLine()));
		System.out.println("등록일> ");
		b.setBoardReg(Date.valueOf(sc.nextLine()));
		
		int result = BoardDAO.getInstance().insertb(b);
		
		if(result > 0) {
			System.out.println("글 등록 완료");
		} else {
			System.out.println("글 등록 실패");
		}
	}
	//글 전체 조회
	public void getBoardList() {
		List<Board> list = BoardDAO.getInstance().getBoardList();
		System.out.println("============================================");
		for(int i=0; i<list.size(); i++) {
			System.out.println("글 번 호 : " + list.get(i).getBoardNo());
			System.out.println("글 제 목 : " + list.get(i).getBoardTt());
			System.out.println("글 내 용 : " + list.get(i).getBoardCon());
			System.out.println("조 회 수 : " + list.get(i).getBoardView());
			System.out.println("등 록 일 : " + list.get(i).getBoardReg());
			System.out.println("============================================");
		}
	}
	
	
	//글 특정 조회
		public void getBoard() {
		System.out.println("글 번호 입력 >");
		int bKey = Integer.parseInt(sc.nextLine());
		
		Board b =
		BoardDAO.getInstance().getBoard(bKey);
		
		System.out.println("조회한 글 결과>");
		System.out.println(b.toString());
		}
	
	//글 수정

	public void updateb() {
		Board b = new Board();
		System.out.println("========글 수정 ========");
		System.out.println("글 번호를 입력하세요. >");
		b.setBoardNo(Integer.parseInt(sc.nextLine()));
		System.out.println("변경할 제목 입력 >");
		b.setBoardTt(sc.nextLine());
		System.out.println("변경할 내용 입력 >");
		b.setBoardCon(sc.nextLine());
		
		int result = 
		BoardDAO.getInstance().updateb(b);
		
		if(result > 0) {
			System.out.println("☞글 수정 완료!");
		} else {
			System.out.println("☞글 수정 실패!");
		}
		
	}
	
	
	//글 삭제
	public void deleteb() {
		System.out.println("==========글 삭제 =========");
		System.out.println("글 번호를 입력하세요. >");
		int bId = Integer.parseInt(sc.nextLine());
		Board b = new Board();
		b.setBoardNo(bId);
		int result = 
		BoardDAO.getInstance().getInstance().deleteb(b);
	
		if(result > 0) {
			System.out.println("☞글 삭제 완료!");
		} else {
			System.out.println("☞글 삭제 실패!");
		}
	}
	
}
