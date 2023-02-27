package com.yedam.board.service;

import java.util.ArrayList;
import java.util.List;

import com.yedam.Common.DAO;


public class BoardDAO extends DAO{
	//싱글톤
			private static BoardDAO bDao = new BoardDAO();   //board.service전역에서 사용되는 인스턴스
			
			 private BoardDAO() {
				
			 }
			
			 public static BoardDAO getInstance() {
				 return bDao;
			 }
			
			 //글 등록
			 public int insertBo(Board b) {
					int result = 0;
					try {
						conn();
						String sql = "insert into board values(?,?,?,?,?)";
						pstmt = conn.prepareStatement(sql);
						pstmt.setInt(1, b.getBoardNo());
						pstmt.setString(2, b.getBoardTt());
						pstmt.setString(3, b.getBoardCon());
						pstmt.setInt(4, b.getBoardView());
						pstmt.setDate(5, b.getBoardReg());
						
						result = pstmt.executeUpdate();
						
					}catch(Exception e) {
						e.printStackTrace();
					}finally {
						conn();
					}
					return result;	
				}
				
			 //글 조회
			 public List<Board> getBoardList(){
					List<Board> list = new ArrayList<>();
					Board bl = null;
					
					try {
						conn();
						String sql = "SELECT * FROM board";  
						stmt =  conn.createStatement();
						//stmt- 정적쿼리. 미리 값이 입력된것을 받는다
						rs=stmt.executeQuery(sql);
						
						while(rs.next()) {
							bl = new Board();
							bl.setBoardNo(rs.getInt("board_number"));
							bl.setBoardTt(rs.getString("board_title"));
							bl.setBoardCon(rs.getString("board_content"));
							bl.setBoardView(rs.getInt("board_view"));
							bl.setBoardReg(rs.getDate("board_regDate"));
							
							list.add(bl);
						}
					
					}catch(Exception e){
						e.printStackTrace();
					}finally {
						disconn();
					}
					return list;
				}
				
			//특정 글 조회
			 public Board getBoard(int bKey) {
					Board bl = null; //널이라는 데이터가 나오면 데이터 조회가 안된거
					try {
						conn();
						String sql = "select * from board where board_number=?";
						pstmt = conn.prepareStatement(sql);
						pstmt.setInt(1,bKey);
						
						rs=pstmt.executeQuery();
						
						if(rs.next()) {
							bl = new Board();
							bl.setBoardNo(rs.getInt("board_number"));
							bl.setBoardTt(rs.getString("board_title"));
							bl.setBoardCon(rs.getString("board_content"));
							bl.setBoardView(rs.getInt("board_view"));
							bl.setBoardReg(rs.getDate("board_regDate"));
						}
					}catch(Exception e) {
						e.printStackTrace();
					}finally {
						disconn();
					}
					return bl;
					
				}
			 
			 
			 //글 수정
			 public int updateb(Board b) {
					int result =0;
					try {
						conn();
						String sql = "update board\r\n"
								+ "set board_title=?,board_content=?"
								+ "where board_number=?";
						pstmt = conn.prepareStatement(sql);
						pstmt.setString(1, b.getBoardTt());
						pstmt.setString(2, b.getBoardCon());
						pstmt.setInt(3, b.getBoardNo());
					
						result = pstmt.executeUpdate();
						
					}catch(Exception e){
						e.printStackTrace();
					}finally {
						disconn();
					}
					return result;
				}
				
			
			//글 삭제
				public int deleteb(Board b) {
					int result = 0;
					try {
						conn();
						String sql = "delete from board where board_number=?";
						pstmt = conn.prepareStatement(sql);
						pstmt.setInt(1, b.getBoardNo());
						
						result = pstmt.executeUpdate();
						
					}catch(Exception e) {
						e.printStackTrace();
					}finally {
						disconn();
					}
					return result;
				}
			
			
			
}