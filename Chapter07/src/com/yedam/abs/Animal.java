package com.yedam.abs;

public abstract class Animal {
	//추상클래스
	//필드
	public String kind;
	

	public void breat() {
		System.out.println("숨을 쉰다");
	}
	
	//추상메소드
	public abstract void sound();
	
	
	
}
