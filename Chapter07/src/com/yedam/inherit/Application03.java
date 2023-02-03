package com.yedam.inherit;

public class Application03 {
	public static void main(String[] args) {
	Compute compute = new Compute();
	compute.areaCircle(5.0); //자식이 재정의한 내용을 가져옴
	
	Exam exam = new Exam();
	exam.method01(); //자식클래스 method01
	exam.method02(); //부모 클래스 method02
	}
}
