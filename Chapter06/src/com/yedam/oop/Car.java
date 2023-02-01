package com.yedam.oop;

public class Car {
	//필드: 객체로 만들었을때, 정보를 담아주는 역할
		String name; //차 이름
		int price; //차 가격
		String company = "현대"; //차 브랜드
	
		
		
		//생성자 : 객체로 만들 때 내가 하고 싶은 행위를 정의
		//규칙이 있음.
		//생성자 정의 -> 클래스의 이름과 동일
		//기본생성자(Basic)
		//public Car() { //this()
		//		
			//아무것도 안하겠다.
		//}
		
		//생성자를 통한 필드 초기화(객체를 만들때, 필드에 데이터 대입,입력)
		//조건:생성자의 매개변수()괄호안를 통해서 필드 초기화
		//차를 여러대를 만들껀데 그 속성이나 내용을 다르게 만들고 싶을때 오버로딩 기법을 쓴다
		public Car() {
			//기본생성자
		}
		
		public Car(String name, int price) { //this "kona",5000)
			//this는 Car(클래스)가 가지고 있는 네임,프라이스 가져오는것
			this.name = name;
			this.price = price;
		}
		
		public Car(String name) {
			this.name = name;
		}
		
		public Car(int price) {
			this.price = price;
		}
		
		public Car(String name, int price , String company) {
			this.name = name;
			this.price = price;
			this.company = company;
		}
		
	//메소드: 객체로 만들었을때 기능 구현.
	void run() {
		System.out.println("자동차가 달립니다.");
	}
}
