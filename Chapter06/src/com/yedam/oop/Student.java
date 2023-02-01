package com.yedam.oop;

public class Student {
	//정보(필드) - 학생이름, 학번, 국어, 영어, 수학 점수
	String name;
	int schoolNum;
	int koScore;
	int engScore;
	int mathScore;
	
	//기본생성자
	public Student() {
		
	}
	//모든 데이터를 초기화 할수 있는 생성자 
	public Student(String name, int schoolNum, int koScore, int engScore, int mathScore) {
		this.name= name;
		this.schoolNum=schoolNum;
		this.koScore = koScore;
		this.engScore= engScore;
		this.mathScore= mathScore;
	
	}
	
	//학생의 정보를 출력해주는 getInfo()
	//sum()
	/* 이름 : 김또치
	 * 학번 : 20230201
	 * 총점 : 200 
	 * 평균 : 68.xxx
	 */
	
	void getInfo() {
		System.out.println("이름 :" + name);
		System.out.println("학번 :" + schoolNum);
		System.out.println("총점 :" + sum());
		System.out.println("평균 :" + avg());
	}
	int sum() {
		return koScore+engScore+mathScore;
	}
	
	double avg() {
		return sum()/3.0;
	}
}
