package com.yedam.inherit;

public class SuperSonicAirPlane extends AirPlane{
	//자식클래스
	//필드
	public static final int NORMAL =1;
	public static final int SUPERSONIC =2;
	
	public int flyMode = NORMAL;
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비횅 모드");
		}else {
		//super.
		super.fly();
		}
	}
	//자식클래스
	
	
}
