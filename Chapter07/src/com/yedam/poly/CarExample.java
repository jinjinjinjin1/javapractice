package com.yedam.poly;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car(); //car 필드에 대한 4가지 정보가 들어있음

		for (int i = 1; i <= 5; i++) {
			int problemLocation = car.run();

			switch (problemLocation) {
			case 1:
				System.out.println("앞왼쪽 HankookTire 교체");
				//car.frontLeftTire => Tire frontLeftTire
				//Tire.frontLeftTire= new HankookRTire("앞왼쪽");
				car.frontLeftTire = new HankookTire("앞왼쪽", 15);
				break;
			case 2:
				System.out.println("앞오른쪽 KumhoTire 교체");
				car.frontRightTire = new KumhoTire("앞오른쪽", 13);
				break;
			case 3:
				System.out.println("뒤왼쪽 HankookTire 교체");
				car.backLeftTire = new HankookTire("뒤왼쪽", 14);
				break;
			case 4:
				System.out.println("뒤오른쪽 KumhoTire 교체");
				car.backRightTire = new KumhoTire("뒤오른쪽", 17);
				break;
			}
			System.out.println("===========================");
		}
	}
	
}
