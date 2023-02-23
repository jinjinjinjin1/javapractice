package com.yedam.Patient.service;


import java.util.ArrayList;
import java.util.List;

import com.yedam.Common.DAO;



public class PatientDAO extends DAO{
	
	//싱글톤
	//private static  PatientDAO ptDao = new PatientDAO();    //Patient.service 전역에서 사용되는 인스턴스
	private static  PatientDAO ptDao = null;
	
	private PatientDAO() {
		
	}
	
	public static PatientDAO getInstance() {
		if(ptDao == null) {
			ptDao = new PatientDAO();
		}
		return ptDao;
	}
	
	//환자 등록
	public int insertpt(Patient pt) {
		int result = 0;
		try {
			conn();
			String sql = "INSERT INTO PATIENT\r\n"
					+ "VALUES (?,?,?,?,?,?,?,?,?,?)";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1,pt.getPtId());
		pstmt.setString(2, pt.getPtName());
		pstmt.setInt(3, pt.getPtManager());
		pstmt.setString(4, pt.getPtPain());
		pstmt.setString(5, pt.getPtPhone());
		pstmt.setInt(6,pt.getPtBirth());
		pstmt.setDate(7, pt.getPtVisit());
		pstmt.setString(8, pt.getPtJob());
		pstmt.setString(9, pt.getPtSex());
		pstmt.setString(10, pt.getPtDx());
		
		result = pstmt.executeUpdate();
		
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			disconn();
		}
		return result;
	}
	
	
	//모든 환자 조회
	public List<Patient> getPatientList(){
		List<Patient> list = new ArrayList<>();
		Patient pt = null;
		
		try {
			conn();
			String sql = "SELECT * FROM patient";  
			stmt = conn.prepareStatement(sql);
			//stmt- 정적쿼리. 미리 값이 입력된것을 받는다
			rs=stmt.executeQuery(sql);
			
			while(rs.next()) {
				pt = new Patient();
				pt.setPtId(rs.getInt("patient_id"));
				pt.setPtName(rs.getString("patient_name"));
				pt.setPtManager(rs.getInt("patient_manager"));
				pt.setPtPain(rs.getString("patient_pain"));
				pt.setPtPhone(rs.getString("patient_phone"));
				pt.setPtBirth(rs.getInt("patient_birth"));
				pt.setPtVisit(rs.getDate("patient_visitdate"));
				pt.setPtSex(rs.getString("patient_sex"));
				pt.setPtDx(rs.getString("patient_Dx"));
				
				list.add(pt);
			}
		
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}
	
	//특정 환자 조회
	public Patient getPatient(int ptId) {
		Patient pt = null; //널이라는 데이터가 나오면 데이터 조회가 안된거
		try {
			conn();
			String sql = "select *\r\n"
					+ "from patient\r\n"
					+ "WHERE patient_id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,ptId);
			
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				pt = new Patient();
				pt.setPtId(rs.getInt("pt_id"));
				pt.setPtName(rs.getString("pt_name"));
				pt.setPtManager(rs.getInt("pt_manager"));
				pt.setPtPain(rs.getString("pt_pain"));
				pt.setPtPhone(rs.getString("pt_phone"));
				pt.setPtBirth(rs.getInt("pt_birth"));
				pt.setPtVisit(rs.getDate("pt_visit"));
				pt.setPtSex(rs.getString("pt_sex"));
				pt.setPtDx(rs.getString("pt_Dx"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return pt;
		
	}

	//환자 정보 수정
	public int updatePt(Patient pt) {
		int result =0;
		try {
			conn();
			String sql = "update patient \r\n"
					+ "set patient_phone =? \r\n"
					+ "where patient_id =?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, pt.getPtPhone());
			pstmt.setInt(2, pt.getPtId());
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	

	//환자 삭제
	public int deletePt(Patient pt) {
		int result = 0;
		try {
			conn();
			String sql = "delete from patient WHERE patient_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, pt.getPtId());
			
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}



	
	
	
	
	
	
	
	
}
