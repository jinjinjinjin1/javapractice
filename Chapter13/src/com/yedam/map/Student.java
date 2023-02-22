package com.yedam.map;

public class Student {
	
	//필드
	public int sno;
	public String sname;
	
	
	}

	public Student(int sno,String sname) {
		this.sno = sno;
		this.sname=sname;
	}
	
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof(Student)) {
			Student std == (Student)obj;
			return super.equals(obj);
		}
		
	
}
