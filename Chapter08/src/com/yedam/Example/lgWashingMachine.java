package com.yedam.Example;

public class lgWashingMachine implements WashingMachine {

	
	@Override
	public void dry() {
		System.out.println("건조 시작합니다.");
	}

	@Override
	public void startBtn() {
		System.out.println("세탁 시작합니다.");
	}

	@Override
	public void puaseBtn() {
		System.out.println("세탁 일시중지 합니다.");
	}

	@Override
	public void stopBtn() {
		System.out.println("세탁 종료 합니다.");
	}

	@Override
	public void changeSpeed(int speed) {
		int nowSpeed=0;
		switch(speed) {
		case 1:
			nowSpeed = 20;
			break;
		case 2:
			nowSpeed = 50;
			break;
		case 3:
			nowSpeed = 100;
			break;

		}
		System.out.println("세탁기 속도 : " + nowSpeed);
	}
}

