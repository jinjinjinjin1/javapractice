package com.yedam.inter;

public class MyClass {
	//인터페이스 사용할 수 있는 공간
	//1.필드
	RemoteControl rc = new Televison();
	//String str= "문자열";
	
	//2.생성자
	public MyClass() {
		
	}
	//MyClass에 매개변수로 RemoteControl이 들어가있음.
	//rc = tv, rc = audio
	public MyClass(RemoteControl rc) {
		this.rc = rc;
		rc.turnON();
		rc.turnOff();
	}
	
	
	
	//메소드
	public void methodA() {
		//로컬변수 사용
		RemoteControl rc = new Audio();
		rc.turnON();
		rc.turnOff();
	}
	
	public void methodB(RemoteControl rc){
		rc.turnON();
		rc.setVolume(2);
	}
	
	
	
}
