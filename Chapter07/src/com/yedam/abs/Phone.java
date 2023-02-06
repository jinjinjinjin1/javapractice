package com.yedam.abs;


	//추상클래스-> (abstract) 추가함으로써
public abstract class Phone {
	//부모클래스
	//필드
	public String owner;
	
	
	//생성자
	public Phone(String owner) {
		this.owner = owner;
	}
	
	
	//메소드
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	
	//추상메소드
	//상속받은 실체클래스(자식클래스)에서 반.드.시. 구현해야하는 
	public abstract void trunOff();
	
	
	
	
}
