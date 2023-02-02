package com.yedam.oop;

public class Application06 {
	
	
	//필드 선언(stack)
	//int num=1;
	static int num=1;
	//정적 필드 선언(method)
	static int sNum = 1;
	
	int field1; //인스턴스 필드(heap)영역에 만들어짐
	
	//메소드
	void info() {
		System.out.println("info 출력");
	}
	
	
	
	//메소드 영역에 포함되어 있는 정적 메소드
	public static void main(String[] args) {
		//스택영역에서 끌어다쓰면 오류남.
//		num=num+1;
//		System.out.println(num);
		//this코드는 메소드영역이 아닌 힙 영역에 저장되기때문에 오류남
		//this.field1 = 1;
		
		//클래스 한공간에서 정적멤버, 인스턴스멤버
		//1)인스턴스 필드->정적메소드에서 사용한다.
		//자기자신을 객체로 만든 다음 인스턴스 필드를 호출해서 사용
		//2)필드->정적필드로 변경해서 사용한다.
		
		//info();
		Application06 app= new Application06();
		
		
		app.field1 = 0;
		app.info();
		num=num+1;
		System.out.println(num);
		
		double result1 = 10 * 10 * StaticCal.pi;
		
		int result2 = StaticCal.plus(10, 5);
		int result3 = StaticCal.minus(10, 5);
	
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}

}
