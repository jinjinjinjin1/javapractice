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
			es = stmt.executeQuery(sql);
			
			while(es.next()) {
				empl = new Employees();
				empl.setDepartmentId(es.getInt("employee_id"));
				empl.setDepartmentName(es.getString("employee_name"));
				empl.setLocationId(es.getInt("location_id"));
				empl.setManagerId(es.getInt("manager_id"));
				
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
}
