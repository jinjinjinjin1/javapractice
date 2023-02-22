package com.yedam.physio.service;

import com.yedam.Common.DAO;

public class PhysioDAO extends DAO {
	
	//싱글톤
	private static PhysioDAO pDao = new PhysioDAO();   //physio.service전역에서 사용되는 인스턴스
	
	 private PhysioDAO() {
		 
	 }
	 
	 public static PhysioDAO getInstance() {
		 return pDao;
	 }
	 
	 
	//기능
	 
	//0.로그인
	 public Physio login(String name) {
		 Physio pt = null;
		 try {
			 conn();
			 String sql = "SELECT *\r\n"
			 			+ "FROM physio\r\n"
			 			+ "WHERE physio_name=?";
			 pstmt = conn.prepareStatement(sql);
			 pstmt.setString(1, name);
			 
			 rs = pstmt.executeQuery();
			 
			 if(rs.next()) {
					pt = new Physio();
					pt.setPhysioName(rs.getString("physio_name"));
					pt.setPhysioPw(rs.getInt("physio_pw"));
					pt.setPhysioPhone(rs.getInt("physio_phone"));
					pt.setPhysioBirthDate(rs.getInt("physio_birthdate"));
					pt.setPhysioEmail(rs.getString("physio_email"));
			 }
		 }catch(Exception e) {
			 e.printStackTrace();
		 }finally {
			 disconn();
		 }
		return pt;
	 }
		 
	 
	 
	//1. 새 환자 등록
	 
	 
	//2. 모든 회원 조회
	 
	 
	 
	//3. 특정 회원 조회
	 
	 
	 
	//4. 환자 삭제
	 
	 
	 
	//5. 로그아웃
	 public int logoutPhysio(String physioName) {
			int result = 0;
			try {
				conn();
				String sql = "delete from physio where physio_name = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, physioName);
				result = pstmt.executeUpdate();	
			}catch(Exception e){
				e.printStackTrace();
			}finally {
				disconn();
			}
			return result;
		}

	public int deletePhysio(String nextLine) {
		// TODO Auto-generated method stub
		return 0;
	}


	 
	 
	 
}
