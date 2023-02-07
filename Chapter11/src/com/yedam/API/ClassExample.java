package com.yedam.API;

public class ClassExample {

	public static void main(String[] args) {
		//Class 클래스
		//Class에서 정보 얻기 .claa를 이용해서
		Class clazz = Member.class;
		System.out.println("Class 정보" + clazz);
		
		
		//클래스 경로 입력해서 정보 얻기
		//clazz = Class.forName("com.yedam.API.Member");
		System.out.println(clazz);
		
		//객체를 통한 정보 얻기
		Member member = new Member("또치");
		clazz = member.getClass();
		System.out.println(clazz);
		
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackageName());
		System.out.println(clazz.getPackage().getName());
		
		String photoPaht = clazz.getResource("lion.jpg").getPath();
				System.out.println("photoPath()");
		
	}

}
