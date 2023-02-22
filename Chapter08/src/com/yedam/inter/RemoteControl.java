package com.yedam.inter;

public interface RemoteControl {
	
	//상수 -> static final이 생략
	//변수는 대문자로 쓰고 두가지 단어가 합성되면 중간에 언더바로 끊어줌
	public int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0; //위처럼 쓸수있음
	
	
	//추상 메소드 -> abstract 생략
	public void turnON();
	public abstract void turnOff();//위와 같이 쓸수있음
	public void setVolume(int volume);
	
	
}
