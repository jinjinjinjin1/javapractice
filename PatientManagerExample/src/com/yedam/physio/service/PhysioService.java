package com.yedam.physio.service;

import java.util.Scanner;


public class PhysioService {
	//physio의 정보를 자바 전역에 공유하기 위해서 static
		//1. physioInfo -> null이 아니다. null이다.
		//null -> O 로그인이 안된 상태
		//null -> x 로그인이 되어 있는 상태
		
		public static Physio physioInfo = null;
		
		Scanner sc = new Scanner(System.in);
		
		
		//1.로그인
		public void login() {
			Physio physio = null;
			System.out.println(" ＇ω＇예담병원 치료실 | 사내로그인 ");	
			System.out.println("이름 > ");
			String physioName = sc.nextLine();
			System.out.println("사원번호 > ");
			int physioPw =Integer.parseInt(sc.nextLine());
			
			physio = PhysioDAO.getInstance().login(physioName);
			
			//id를 통해서 회원 정보를 조회하고, 조회 된 결과에 따라서 login 여부를 결정
			//1. id를 통해 조회가 되었다 -> 회원의 정보가 존재한다.
			//따라서, 입력한 비밀번호와 회원의 정보에서의 비밀번호가 동일 => login 진행
			//physioInfo에 조회된 사원의 정보 대입
			
			//id를 통해 조회가 되지 않았다. -> 회원의 정보가 없다.
			//따라서, login 실패
			//physioInfo에는 null이 유지
			
			if(physio != null) { //데이터가 조회 되었다.
				if(physio.equals(physioPw));{
					System.out.println(physio.getPhysioName() + " 선생님 오늘도 화이팅하세요^▽^~★☆");
					System.out.println("로그인 완료^▽^~★☆");
					physioInfo = physio;
				} if(physio == null) {
					System.out.println("사원 번호가 틀립니다.");
				}
			}else {
				System.out.println("해당 이름은 존재하지 않습니다.");
			}
		}
		
	
		
		//4.회원 로그아웃 
		public void logoutPhysio() {
			System.out.println("이름 >");
			//자신의 이름을 넣었다.
			//로그인 되어 있는 상태에서 사원 로그아웃.
			int result = PhysioDAO.getInstance().logoutPhysio(sc.nextLine());
			
			if(result >0) {
				PhysioService.physioInfo = null; //로그아웃
				System.out.println("회원 로그아웃 완료^▽^");          //위에포함 두줄만 사용하라
			}
		
		
		
		
		
		
		
		}	
		
		
		
		
		
}
		
		
