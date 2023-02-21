package com.yedam.service;

import com.yedam.common.DAO;

public class ClubDAO extends DAO {
	
	//싱글톤
	private static ClubDAO cDao = new ClubDAO();   //service전역에서 사용되는 인스턴스
	
	 private ClubDAO() {
		 
	 }
	 
	 public static ClubDAO getInstance() {
		 return cDao;
	 }

	 
	//기능

	 //0. 로그인
	 public Club login(String id) {
		 Club c = null;
		 try {
			 conn();
			 String sql = "SELECT *\r\n"
			 			+ "FROM club\r\n"
			 			+ "WHERE club_id = '?' ";
			 pstmt = conn.prepareStatement(sql);
			 pstmt.setString(1, id);
			 
			 rs = pstmt.executeQuery();
			 
		 }catch(Exception e) {
			 e.printStackTrace();
		 }finally {
			 disconn();
		 }
		return c;
	 }
	 
	 
	//1. 새 회원 등록
	 
	 
	//2. 모든 회원 조회 -> 가입 날짜 순서대로 조회 
	 
	 
	 
	//3. 아이디로 회원 조회
	 
	 
	 
	//4. 이메일 변경
	 
	 
	 
	//5. 소모임 인원 강제 탈퇴
	 
	 
	 
	 
	 
}
