package com.yedam.variable;

public class Casting {
	public static void main(String[] args) {
		int iVar = 65; //'A'
		byte bVar = (byte)iVar;
		System.out.println(bVar);
		
		char cVar = (char)iVar; // 'A'의 숫자 65가 들어가서 문자로 출력됨
		System.out.println(cVar);
		
		//실수 -> 정수 강제 타입 변환
		double dVar = 3.14444;
		iVar = (int) dVar; //int는 정수만 나타내기때문에 실수는 날아감
		System.out.println(iVar);
		
		//자동 타입 변환
		dVar = iVar;
		System.out.println(dVar);
	}
}
