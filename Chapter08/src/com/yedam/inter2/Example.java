package com.yedam.inter2;

public class Example {

	public static void main(String[] args) {
		ImplementsC imp1 = new ImplementsC();
		
		
		
		
		//interfaceA ~ C 까지 imp1 을 활용해서 메소드 호출
		
		
		//1) interface A -> A가 가지고 있는 메소드 method01만 실행
		InterfaceA ia = imp1;
		ia.method01();
		
		System.out.println("===========");
		
		//2) interefaceB  -> B가 가지고 있는 메소드 method02만 실행
		InterfaceB ib = imp1;
		ib.method02();
		
		System.out.println("===========");
		
		//3)interfaceC -> A,B,C가 가지고 있는 모든 메소드 실행
		InterfaceC ic = imp1;
		ic.method01();
		ic.method02();
		ic.method03();
		
		
		
	}

	


}
