package com.yedam.array;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		//array.length
		Scanner sc = new Scanner(System.in);
		
		int[] ary = new int[6];
		System.out.println("ary의 배열 크기 : " + ary.length);
		
		int[] ary2;
		System.out.println("배열의 크기>");
		int no = Integer.parseInt(sc.nextLine());
		
		ary2 = new int[no];
		System.out.println("ary2의 배열 크기 : " + ary2.length);
		
		for(int i=0; i<ary2.length; i++) {
			System.out.println("입력>");
			ary2[i] = Integer.parseInt(sc.nextLine());
		}
		//js => for Of ,,java 향상된 for문
		//ary2의 배열 크기에 따라 입력된 값을 넣어서 그 수 만큼 배열된걸 다 꺼낼일이 있을때 사용
		for(int var : ary2) {
			System.out.println(var);
		}
		
		
		

	}

}
