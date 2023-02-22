package com.yedam.exception;

public class Application2 {

	public static void main(String[] args) {
		//개인프젝할때 많이 쓸거임
		//
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("클래스가 존재 하지 않습니다.");
		}
	}
	public static void  findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2");
	}
}
