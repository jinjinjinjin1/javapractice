package com.yedam.employees.service;


import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;
import com.yedam.departments.service.Departments;

public class EmployeesDAO extends DAO {
	
		//싱글톤
			private static EmployeesDAO empDao = null;

			private EmployeesDAO() {

			}

			public static EmployeesDAO getInstance() {
				if(empDao == null) {
					empDao = new EmployeesDAO();
				}
				return empDao;
			}
			
			
			//모든 사원 조회, 한 사원 조회, 사원 삭제, 수정, 등록
			//명심!! 각 DAO에서 사용하는 쿼리는 반드시 SqlDevolper에서 실행 해보고 자바에 적용 시킬 것.
			public List<Employees> getEmployeesList(){
				List<Employees> list = new ArrayList<>();
				Employees empl = null;
				try {
					conn();
					String sql = "select * from emp";
					stmt = conn.createStatement();
					rs = stmt.executeQuery(sql);

					while(rs.next()) {
						empl = new Employees();
						empl.setEmployeeId(rs.getInt("employee_id"));
						empl.setEmployeeName(rs.getString("last_name"));
						empl.setLocationId(rs.getInt("location_id"));
						empl.setManagerId(rs.getInt("manager_id"));

						list.add(empl);
					}

				}catch(Exception e) {
					e.printStackTrace();
				}finally {
					disconn();
				}
				return list;	
			}

			//단건 조회
			public Employees getEmployee(int employeeKey) {
				Employees empl = null;
				try {
					conn();
					String sql = "select * from empl where employee_id = ?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setInt(1,employeeKey);
					
					rs=pstmt.executeQuery();
					
					if(rs.next()) {
						empl = new Employees();
						empl.setEmployeeId(rs.getInt("employee_id"));
						empl.setEmployeeName(rs.getString("last_name"));
						empl.setLocationId(rs.getInt("location_id"));
						empl.setManagerId(rs.getInt("manager_id"));
					}
				}catch(Exception e) {
					e.printStackTrace();
				}finally {
					disconn();
				}
				return empl;	
			}
			
			//사원 삭제, 수정, 등록
			//삭제
			public int deleteEmp(Employees e) {
				int result = 0;
				try {
					conn();
					String sql = "DELETE FROM emp WHERE employee_id = ?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setInt(1, e.getEmployeeId());

					result = pstmt.executeUpdate();

				}catch(Exception e1) {
					e1.printStackTrace();
				}finally {
					disconn();
				}
				return result;
			}
			
			//수정
			public int modifyEmp(Employees emp) {
				int result =0;
				try {
					conn();
					String sql = "update emp set manager_id = ? where employee_id =?";
					pstmt = conn.prepareCall(sql);
					pstmt.setInt(1, emp.getManagerId());
					pstmt.setInt(2, emp.getEmployeeId());

					result = pstmt.executeUpdate();

				}catch(Exception e) {
					e.printStackTrace();
				}finally {
					disconn();
				}
				return result;
			}
			
			//등록

			public int insertEmp(Employees emp) {
				int result = 0;
				try {
					conn();
					String sql = "insert into emp values (?,?,?,?)";
					pstmt = conn.prepareStatement(sql);
					pstmt.setInt(1, emp.getEmployeeId());
					pstmt.setString(2, emp.getEmployeeName());
					pstmt.setInt(3, emp.getManagerId());
					pstmt.setInt(4, emp.getLocationId());

					result = pstmt.executeUpdate();

				}catch(Exception e) {
					e.printStackTrace();
				}finally {
					disconn();
				}
				return result;
			}
			
			
			
		}
