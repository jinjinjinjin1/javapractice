package com.yedam.Reservation.service;


import com.yedam.Common.DAO;



public class ReservationDAO extends DAO{

	//싱글톤
	//reservation static  ReservationDAO resDao = new ReservationDAO();    //Reservation.service 전역에서 사용되는 인스턴스
		
		private static  ReservationDAO resDao = null;
		
		
		
		private ReservationDAO() {
			
		}
	
		public static ReservationDAO getInstance() {
			if(resDao == null) {
				resDao = new ReservationDAO();
			}
			return resDao;
		}
	
		

	//예약 조회 (등록 전 먼저 수행)
		public Reservation getReservation(String resKey) {
			Reservation resl = null; //null이 나오면 빈상태라서 예약 등록 ok
		try {
			conn();
			String sql = "SELECT * FROM reservation where res_code=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,resKey);
			
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				resl= new Reservation();
				resl.setResDate(rs.getString("res_date"));
				System.out.println();
				resl.setResTime(rs.getString("res_time"));
				System.out.println();
				resl.setPtId(rs.getInt("patient_id"));
				System.out.println();
				resl.setResCode(rs.getString("res_code"));
				System.out.println();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return resl;	
	}		
	
	//예약 등록
	public int insertRes(Reservation res) {
		int result = 0;
		try {
			conn();
			String sql = "insert into reservation values (?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, res.getResDate());
			System.out.println();
			pstmt.setString(2, res.getResTime());
			System.out.println();
			pstmt.setInt(3, res.getPtId());
			System.out.println();
			pstmt.setString(4, res.getResCode());
			System.out.println();
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			conn();
		}
		return result;	
	}
	
		
	//예약 수정
			public int updateRes(Reservation res) {
			int result =0;
			try {
				conn();
				String sql = "update reservation set res_date =?, res_time =?, res_code =? where patient_id =?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, res.getResDate());
				System.out.println();
				pstmt.setString(2, res.getResTime());
				System.out.println();
				pstmt.setString(3, res.getResCode());
				System.out.println();
				pstmt.setInt(4,res.getPtId());
				System.out.println();
			
				result = pstmt.executeUpdate();
				
			}catch(Exception e){
				e.printStackTrace();
			}finally {
				disconn();
			}
			return result;
		}
		
	//예약 삭제
			public int deleteRes(Reservation res) {
				int result = 0;
				try {
					conn();
					String sql = "delete from reservation WHERE patient_id = ?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setInt(1, res.getPtId());
					System.out.println();
					result = pstmt.executeUpdate();
					
				}catch(Exception e) {
					e.printStackTrace();
				}finally {
					disconn();
				}
				return result;
			}

	
}
