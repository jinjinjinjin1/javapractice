package com.yedam.set;

public class Member {
	//필드
	
	public String name;
	public int age;
	
	
	//생성자
	public Member(String name,int age) {
		this.name= name;
		this.age =age;
	}

	//메소드
	@Override
	public int hashCode() {
		//name = "또치" -> 100번지 -> hashcode 값 : 10
		//인트형인 age를 이용해서 age = 20
		//10 + 20= 30 
		return name.hashCode()+age;  //멤버값이 가지는 새로운 해쉬코드
	}


	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(member.name.equals(name)&& member.age==age) { //이름과 나이까지 모두 다 비교하겠다.
				return true;
			}
		}
		return super.equals(obj);
	}
	
	
	
	
	
}
