package com.yedam.loop;

public class ForEaxmple {

	public static void main(String[] args) {
		//반복문
		//일정한 규칙을 계속 반복
		//반복을 할 때 어떠한 규칙에 따라 행동 반복
		//규칙 찾는게 중요.
		
		//1~5까지의 누적의 합
		int sum = 0;
		
//		sum = sum +1 ;
//		sum = sum +2 ;
//		sum = sum +3 ;
//		sum = sum +4 ;
//		sum = sum +5 ;

		//System.out.println("누적 합 :" + sum);
		
		//for문
		for(int i=1; i<=5; i++) {
			sum =sum + i;
			//sum += i;
		}
		System.out.println("누적 합 :" + sum);
		
		//1~100 사이에서 짝수 구하는 반복문
		//1~100 -> 1~100까지 반복
		//1 2 3 4 5 6 7 8 ....
		//2 % 2,, 4% 2,,6 % 2,,
		
		for(int i=1; i<=100; i++) {
			if(i% 2 ==0) {
				System.out.print(i + "\t");
			}
		}
		
		//1~100 사이에서 홀수 구하는 반복문
		//1~100 -> 1~100까지 반복
		//1 3 5 7 9 11 13 15 ...
		//1 % 2 ==1, 3 % 2 ==1 ,,,
		for(int i=1; i<=100; i++) {
			if(i% 2 == 1) {
				System.out.print(i+ "\t");
			}
		}
		
		//1~100 사이에서 2의 배수 또는(OR) 3의 배수 찾기
		//2의 배수=> 어떤 값을 2로 나누었을때 나머지가 0인 애들.
		//3의 배수=> 어떤 값을 3으로 나누었을때 나머지가 0인 애들.
		
		for(int i=1;i<=100;i++) {
			if(i%2 ==0 || i%3 ==0) {
				System.out.println("2또는 3의 배수 : " + i);
			}
		}
		
		//구구단 출력하기
		//2*1 = 2
		//2*2 = 4
		//2*3 = 6..
		//2*i=x
		for(int i=1;i<10;i++) {
			System.out.println("2 x " + i + " = " +(2*i));
		}
		
		//중첩 for문
		//반복문 안에 반복문이 들어가는 형태
		//형식
		//for() {
		//	for() {
		//			for() {
		//					
		//				}
		//			}
		//		}
				
		//2단 -> 2*1 ,2*2, 2*3...
		//3단 -> 3*1, 3*2, 3*3...
		//4단 -> 4*1, 4*2, 4*3...
		
		//2단~9단까지를 출력하는 반복문
		//중요한건 초기값,조건식이 중요하다
		//밖:i=2~9
		for(int i=2;i<=9;i++) {
			//안:j=1~9
			for(int j=1; j<=9; j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}
		}
		
		//구구단 세로로 찍기
		//2x1 3x1 4x1 5x1...
		//밖(줄수):i=2~9 for문
		for(int i=1; i<=9; i++) {
			//안(해당줄수에서 한칸씩 늘어나는 for문):j=1~5
			for(int j=2;j<=5;j++) {
				System.out.print(j+ " X " + i + " = " + (i*j)+ "\t" );
			}
			System.out.println();
		}
		
		//공포의 별찍기
		//***** 
		//*****
		//*****
		//*****
		//*****
		//밖에 for문은 줄수카운트, 안에 있는 for문은 별5번 찍는 for문
		
		//한칸씩 내려갈때 쓰는 반복문
		for(int i=0; i<5; i++) {
			//별 출력할 때 쓰는 반복문
			String star ="";
			for(int j=0; j<5; j++) {
				//+ 연산자를 활용해서 *****만듬
				//star = star + "*";
				System.out.print("*");
			}
			//System.out.println(star);
			System.out.println();
		}
		
		//*
		//**
		//***
		//****
		//*****
		
		//한칸한칸 내려갈때 쓰는 for문
		for(int i=1; i<=5; i++) {
			String star = "";
			for(int j=0; i>j; j++) {
				star = star + "*";
			}
			System.out.println(star);
		
		}
		
		//***** //1-5
		//****  //2-4
		//***   //3-3
		//**    //4-2
		//*     //5-1
		//한칸한칸 내려갈때 쓰는 for문
		for(int i=5; i>0; i--) {
			String star ="";
			//안에 찍히는 별 
			for(int j=i; j>0; j++) {
				star = star + "*";
			}
			System.out.println(star);
		}
		
		
		          //i       //j
		//    *     1  b4,s1 =5
		//   **     2  b3,s2 =5
		//  ***     3  b2,s3 =5
		// ****     4  b1,s4 =5
		//*****     5  b0,s5 =5
		
		for(int i=5; i>0; i--) {
			for(int j=1; j<=5; j++) {
				if(i>j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			 System.out.println();
		}
		
		
		
		
 
	}
		
}
