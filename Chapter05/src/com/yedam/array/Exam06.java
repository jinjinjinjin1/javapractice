package com.yedam.array;

import java.util.Arrays;

public class Exam06 {

	public static void main(String[] args) {
		//2차원배열
		//베열 안에 2개의 배열이 있고,
		//각 배열마다 데이터 3개씩 들어있다.
		//{{1,2,3}  ,{1,2,3}} 아래와 같이 표현함
		int[][] score = new int[2][3];
		//첫번째 배열에 접근하는 반복문
		for(int i=0; i<score.length;i++) { //배열안에 배열이 몇개 있을지
			//두번째 배열에 접근하는 반복문
			for(int j =0; j<score[i].length; j++) {
				System.out.println("score["+i+"]["+j+"]=" + score[i][j]);
			}
		}
		
		
		int[][] array = new int[8][9];

		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				//2eksdml ruddn
				//2*1=2
				//2*2=4
				//2*3=6
				//0,0|0,1|0,2|0,3
				//2*1 2*2 2*3 2*4
				array[i-2][j-1] = i * j;
			}
		}
		
		//배열에 저장된 내용을 출력
		for(int i=0; i<array.length; i++) {
			System.out.println((i+2) + "단:");
			System.out.println(Arrays.toString(array[i]));
			System.out.println();
			
		}
	}

}