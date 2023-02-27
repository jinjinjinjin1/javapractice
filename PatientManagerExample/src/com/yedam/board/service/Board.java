package com.yedam.board.service;

import java.sql.Date;

public class Board {
	//필드
//	BOARD_NO      NOT NULL NUMBER(6)      
//	BOARD_TITLE   NOT NULL VARCHAR2(1000)
//	BOARD_CONTENT NOT NULL VARCHAR2(4000)
//	BOARD_VIEWNO  NOT NULL NUMBER(10)    
//	BOARD_REGDATE          DATE  
	
	private int boardNo;
	private String boardTt;
	private String boardCon;
	private int boardView;
	private Date boardReg;
	
	
	public int getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	public String getBoardTt() {
		return boardTt;
	}
	public void setBoardTt(String boardTt) {
		this.boardTt = boardTt;
	}
	public String getBoardCon() {
		return boardCon;
	}
	public void setBoardCon(String boardCon) {
		this.boardCon = boardCon;
	}
	public int getBoardView() {
		return boardView;
	}
	public void setBoardView(int boardView) {
		this.boardView = boardView;
	}
	public Date getBoardReg() {
		return boardReg;
	}
	public void setBoardReg(Date boardReg) {
		this.boardReg = boardReg;
	}
	
	
//	@Override
//	public String toString() {
//		return "Board [boardNo=" + boardNo + ", boardTt=" + boardTt + ", boardCon=" + boardCon + ", boardView="
//				+ boardView + ", boardReg=" + boardReg + "]";
//	}
//	
	
	
	@Override
	public String toString() {
		return "         ◈예담 치료실 자유게시판 ◈ \n글번호: " + boardNo + "\n 제 목: " + boardTt + "\n 내 용: " + boardCon + "\n 조회수: "
				+ boardView + "\n 동록일: " + boardReg + "\n◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈";
	}
	
	
	
	
}