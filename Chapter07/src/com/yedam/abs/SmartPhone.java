package com.yedam.abs;

public class SmartPhone extends Phone {
	//자식클래스
	//필드 상속
	public SmartPhone(String owner) {
		super(owner);
		
	}

	
	
	//메소드
	public void internetSearch() {
		System.out.println("인터넷 검색합니다.");
	}


	//강제 오버라이딩
	@Override
	public void trunOff() {
		System.out.println("반드시 구현한 trunOff메소드");
		
	}
	
	
}
