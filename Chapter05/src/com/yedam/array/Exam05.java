package com.yedam.array;

public class Exam05 {

	public static void main(String[] args) {
		//최대값 또는 최소값이 위치하는 인덱스 구하기
		int[] array = {20,50,70,80,30,10,90,100};
		
		/*
		 * 로직을 통해서 최대값,최소값의 인덱스 구하기
		 */
		//최대값부터구하자
		int max = 0;
		int min = 100;
		int maxh =0;
		int minh =0;
		for(int i=0; i<array.length; i++){ //배열의 길이만큼 돌아간다
			if(array[i]>max) { 
				max = array[i]; 
				maxh = i;//i가 인덱스방번호
			}
			if(array[i]<min) {
				min = array[i];
				minh = i;
			}
			
		}
		
		System.out.println("최대값의 인덱스 :" +maxh);
		System.out.println("최소값의 인덱스 :" +minh);
		
//		for(int i=0; i<array.length; i++) {
//			System.out.println("명령 라인 출력" + args[i]);
		}

	}


