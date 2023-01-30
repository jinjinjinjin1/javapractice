package com.yedam.condition;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("성적입력>");
		// 입력한 문자열 변수에 저장
		String point = sc.nextLine();
		// 문자열을 int 형으로 형 변환하는 과정
		int scores = Integer.parseInt(point); // 정수형으로 형변환해서 변수에 넣어줌

		// if else
		String pass = "";
		//90이상은 A
		//89~80  B
		//79~70 C
		//69~50 D
		
		//2단계
		//100점도 A학점을 받을 수 있게끔 추가 -> 한줄만
		//switch문 부등호 사용 못함.
		//효율적으로 코딩(1~100 해당되는 case문 만들지 말라)
		
		// /(나누기 연산자)
		//  99~90/10 = 9
		//  89~80/10 = 8
		
		int num = scores/10; //num는 몫
		switch(num) {
		case 10: //break 없이 
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
			
		}
		
		
//		if (scores >= 90) {
//			pass = "A";
//		} else if (scores >= 80) {
//			pass = "B";
//		} else if (scores >= 70) {
//			pass = "C";
//		} else {
//			pass = "D";
//		}

	}

}
