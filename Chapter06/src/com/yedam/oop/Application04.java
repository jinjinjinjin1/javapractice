package com.yedam.oop;

import java.util.Scanner;

public class Application04 {

	public static void main(String[] args) {
		
		//int[] score : int형 데이터를 담을 수 있는 배열
		//Class[] class : 객체를 담을 수 있는 배열
		
		//정보입력 받는 용도로 스캐너 사용
		Scanner sc= new Scanner(System.in);
		//학생 수 입력 받는 변수
		int stdCount = 0;
		
		//학생의 정보를 보관하는 배열 생성
		Student[] stdAry = null;
		
		 while(true) {
			 System.out.println("1.학생수 | 2.학생정보입력 | 3.총점,평균 | 4.종료");
			 System.out.println("입력>");
			 
			 int selectNo = Integer.parseInt(sc.nextLine());
			 
			 if(selectNo ==1 ) {
				 System.out.println("학생 수 입력>");
				 stdCount = Integer.parseInt(sc.nextLine());
			 }else if(selectNo ==2) {
				 //배열의 크기(학생의 데이터를 넣을 수 있는 크기 설정)
				 stdAry = new Student[stdCount];
				 for(int i=0; i<stdAry.length; i++) {
					 //임의의 객체를 생성해서, 
					 //배열에 객체(입력한 데이터)를 담는 그릇용도
					 //std에는 객체가 살고 있는 주소가 있음
					 stdAry[i]= new Student();
//					 Student std = new Student();
					 
					 System.out.println("이름>");
					 String name = sc.nextLine();
					 stdAry[i].name = name;
					 System.out.println("학번>");
					 int schoolNum = Integer.parseInt(sc.nextLine());
					 stdAry[i].schoolNum = schoolNum;
					 System.out.println("국어>");
					 int koScore= Integer.parseInt(sc.nextLine());
					 stdAry[i].koScore= koScore;
					 System.out.println("수학>");
					 int mathScore= Integer.parseInt(sc.nextLine());
					 stdAry[i].mathScore=mathScore;
					 System.out.println("영어>");
					 int engScore= Integer.parseInt(sc.nextLine());
					 stdAry[i].engScore=engScore;
					 
					 //5개의 데이터를 넣은 객체= std
//					 stdAry[i]=std;
				 }
				 
				 
				 
			 }else if(selectNo ==3) {
				 //학생의 수를 입력하고, 배열이 만들어진 상황
				 //학생의 데이터가 다 입력이 되어있다.
				 for(int i=0; i<stdAry.length; i++) {
					 System.out.println(stdAry[i].name+ "학생 성적");
					 System.out.println("총 점 : " + stdAry[i].sum());
					 System.out.println("평 균 : " + stdAry[i].avg());
					 
				 }
			 }else if(selectNo ==4) {
				 System.out.println("end of prog");
				 break;
			 }
		 }

	}

}
