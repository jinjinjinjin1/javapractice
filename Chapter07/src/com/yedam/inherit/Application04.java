package com.yedam.inherit;

public class Application04 {

	public static void main(String[] args) {
		SuperSonicAirPlane sa = new SuperSonicAirPlane();
		//sa-> 
		
		//이륙 -> 부모클래스에 있는 메소드 호출
		sa.takeOff();
		//비행모드 확인->자식 클래스
		sa.fly();
		//비행모드 변경 -> NORMAL 에서 SUPERSONIC
		sa.flyMode=SuperSonicAirPlane.SUPERSONIC;
		//비행모드 확인 ->자식 클래스
		sa.fly();
		//비행모드 변경
		sa.flyMode=SuperSonicAirPlane.NORMAL;
		//비행모드 확인
		sa.fly();
		//착륙
		sa.land();
		
				
	}

}
