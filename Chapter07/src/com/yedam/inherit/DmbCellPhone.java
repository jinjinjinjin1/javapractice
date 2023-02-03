package com.yedam.inherit;

public class DmbCellPhone extends CellPhone {
	//자식 클래스
	//필드
	int channel;
	
	//생성자
	//this()
	public DmbCellPhone(String model, String color, int channel) {
		//부모 클래스의 생성자를 사용때 쓰는 키워드 = super
		super(model,color); 
		//부모 클래스에 있는 필드(model,color)
//		this.model=model; //부모가 가지고 있는 필드데이터
//		this.color=color; //부모가 가지고 있는 필드데이터
		//자식 클래스에 있는 필드(channel)
		this.channel = channel; //자식이 가지고 있는 필드데이터
	}
	
	
	//메소드
	void turnOnDmb() {
		System.out.println("채널" + channel + "번 DMB 방송 수신");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}
