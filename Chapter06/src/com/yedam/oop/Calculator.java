package com.yedam.oop;

public class Calculator {
	//필드
	
	
	//생성자
	
	
	
	//메소드
	//덧셈,뺄셈...
	//리턴타입(리턴문)이 없는 메소드
	void sum(int x, int y) {
		int result = x + y;
		System.out.println(x+ "+ "+ y + " = " + result);
		//정수받는 메소드
	}
	//밑으로는 메소드를 오버로딩
	void sum(double x, double y) {
		//실수받는 메소드
	}
	void sum(char x, char y) {
		//문자 받는 메소드
	}
	void sum(int x, int y, int z) {
		//정수 세개 받는 메소드
	}
	//위 4개 sum은 똑같은 이름을 쓰지만 매개변수가 다르기때문에 다른 메소드임 
	//그러므로 서로 다른 결과물을 나오게함
	
	
	
	
	//리턴타입이 존재하는 메소드
	int sum2(int x, int y) {
		int result = x+y ;
		return result;
	}
	
	
	//매개변수의 개수를 모를 경우
	//1)배열 활용
	void sum3(int[] intAry) { //{1,2,3,} . {1,2,3,4}일수도 있다.
		int result = 0;
		for(int i=0;i<intAry.length;i++) {
			result +=intAry[i];
		}
		System.out.println("총 합께 :" + result);
	}
	
	//2) ... 활용
	void sum4(int ...intAry) {
		int result = 0;
		for(int i=0; i<intAry.length;i++) {
			result += intAry[i];
		}
		System.out.println("총 합께 :" + result);
	}
	
	void avg() {
		int result = sum2(10,20);
		System.out.println("평균 : " + (result/2));
	}
	
	
	
	//void안에서의 return;
	
	
	
	
	
}
