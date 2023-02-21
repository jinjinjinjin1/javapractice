package com.yedam.employees.service;

	import java.util.List;
	import java.util.Scanner;

	public class EmployeesService{
		Scanner sc = new Scanner(System.in);
		
		//모든 사원 조회
		public void getEmployeesList() {
			List<Employees> list = EmployeesDAO.getInstance().getEmployeesList();
			System.out.println("==========================================");
			for(int i =0; i<list.size(); i++) {
				System.out.println("사원 ID : " + list.get(i).getEmployeeId());
				System.out.println("사원 이름 : " + list.get(i).getEmployeeName());
				System.out.println("관리자 번호 : " + list.get(i).getManagerId());
				System.out.println("지역 번호 : " + list.get(i).getLocationId());
				System.out.println("==========================================");

			}
			
		}
		
		//사원 조회
		public void getEmployees() {
			System.out.println("사원 번호>");
			int empNo = Integer.parseInt(sc.nextLine());
			Employees emp = EmployeesDAO.getInstance().getEmployee(empNo);
			if(emp == null) {
				System.out.println("조회된 결과 없음.");
			}else {
				System.out.println("사원 번호 : " + emp.getEmployeeId());
				System.out.println("사원 이름 : " + emp.getEmployeeName());
				System.out.println("관리자 번호 : " + emp.getManagerId());
				System.out.println("지역 번호 : " + emp.getLocationId());

			}
			System.out.println("===========================================");
			
		}
		
		//등록
			public void insertEmp() {
				System.out.println("=============사원생성==============");
				System.out.println("사원 번호 >");
				int empNo = Integer.parseInt(sc.nextLine());
				System.out.println("사원 이름 >");
				String empName =sc.nextLine();
				System.out.println("관리자 번호 번호 >");
				int mgrNo = Integer.parseInt(sc.nextLine());
				System.out.println("지역 번호 >");
				int locNo = Integer.parseInt(sc.nextLine());
				Employees emp = new Employees();

				emp.setEmployeeId(empNo);
				emp.setEmployeeName(empName);
				emp.setManagerId(mgrNo);
				emp.setLocationId(locNo);

				int result = EmployeesDAO.getInstance().insertEmp(emp);
				if(result > 0) {
					System.out.println("사원 등록 완료");
				} else {
					System.out.println("사원 등록 실패");
				}
			}

		public void modifyEmp() {
			System.out.println("=========사원 수정============");
			System.out.println("수정 사원 번호>");
			int empNo = Integer.parseInt(sc.nextLine());
			System.out.println("바꿀 관리자 번호>");
			int mgrNo = Integer.parseInt(sc.nextLine());

			Employees emp = new Employees();
			emp.setEmployeeId(empNo);
			emp.setManagerId(mgrNo);

			int result = EmployeesDAO.getInstance().modifyEmp(emp);

			if(result > 0) {
				System.out.println("사원 수정 완료");
			}else {
				System.out.println("사원 수정 실패");
			}
			
		}
		public void deleteEmp() {
			System.out.println("========사원 삭제 ========");
			System.out.println("삭제 사원 번호>");
			int empNo = Integer.parseInt(sc.nextLine());

			Employees emp = new Employees();
			emp.setEmployeeId(empNo);

			int result = EmployeesDAO.getInstance().deleteEmp(emp);

			if(result>0) {
				System.out.println("부서 삭제 완료");
			}else {
				System.out.println("부서 삭제 실패");
			}
			
		}

	}
