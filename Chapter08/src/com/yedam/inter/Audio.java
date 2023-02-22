package com.yedam.inter;

public class Audio implements RemoteControl{
	//부모클래스에 있는 내용을 재정의한 다음에 사용할수 있게끔 한다
	//필드
	private int volume;
	

	//생성자
	//메소드
	@Override
	public void turnON() {
		System.out.println("Audio를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			//volume 0 < volume < 10 
			this.volume = volume;
		}
		
		System.out.println("현재 Audio 볼륨 : " + this.volume);
		
		
		
	}

}
