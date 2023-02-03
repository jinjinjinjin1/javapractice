package com.yedam.oop;

public class Application03 {
	public static void main(String[] args) {
		//일꾼
		Bycle bycle = new Bycle();
		
		bycle.setGas(5); //Bycle로 생성한 객체 필드값(gas) 데이터 입력
		
		boolean gasState = bycle.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다.");
			bycle.run();
		}
		
		if(bycle.isLeftGas()) {
			System.out.println("gas를 주입할 필요 없음.");
		}else {
			System.out.println("gas를 주입 해야 함.");
		}
		
		
		Book book = new Book("혼자 공부하는 자바", "학습서", 10000,"한빛 미디어", 0001);
		
		book.getInfo();
		
		Student std = new Student("김또치", 230201, 20, 50, 30);
		
		std.getInfo();
		
		
		
	}
}
