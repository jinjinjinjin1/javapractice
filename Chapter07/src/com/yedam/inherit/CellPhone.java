package com.yedam.inherit;

public class CellPhone {
	//핸드폰 기본기능을 여기서 구현
	//부모 클래스
	
	//필드
	String model;
	String color;
	//생성자(기본)
	public CellPhone() {
		
	}
	public CellPhone(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	//메소드
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	void bell() {
		System.out.println("벨이 울립니다.");
	}
	void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
}