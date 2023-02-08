package com.yedam.API;

public class BoxingExample {

	public static void main(String[] args) {
		//Boxing :기본타입->객체로 포장
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("100");
		
		Integer obj3= Integer.valueOf(100);
		Integer obj4 = Integer.valueOf("400");
		
		
		//unBoxing
		int value1=obj1.intValue();
		int value2=obj2.intValue();
		int value3=obj3.intValue();
		int value4=obj4.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		
		//자동박싱
		Integer obj5 =100;
		System.out.println("value :" + obj5.intValue());
		
		//대입 시 자동 언박싱
		int value5 = obj5;
		System.out.println("value : " + value5);
		
		
		//연산 시 자동 언박싱
		int value6=obj5 + 500;
		System.out.println("value : " + value6);
		
		
		//포장 값 비교(포장 된 박스가 같은 비교)
		//비교 할 수 있는 범위
		Integer obj6 = 100;
		Integer obj7 = 100;
		System.out.println(obj6.intValue() == obj7.intValue());
		
		double value7 = Double.parseDouble("3.14");
		System.out.println(value7);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
