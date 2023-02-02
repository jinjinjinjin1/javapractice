package com.yedam.access;

public class Application03 {

	public static void main(String[] args) {
		Member member = new Member();
		
		member.setId("jinjin_no.1");
		member.setPw("asdfasdf");
		member.setName("김또치");
		member.setAge(20);
		
		
		System.out.println("아이디 : " + member.getId());
		System.out.println("비밀번호: " + member.getPw());
		System.out.println("이름: " + member.getName());
		System.out.println("나이: " + (member.getAge()+1));
		
	}

}
