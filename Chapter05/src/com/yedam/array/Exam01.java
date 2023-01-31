package com.yedam.array;

public class Exam01 {

	public static void main(String[] args) {
		
		//배열방을 만듬과 동시에 데이터를 넣어줌
		int[] intAry = {1,2,3,4,5,6};
		//int[] intAry=new int[6]; 위와 같음
		//intAry[0] = 1;
		//intAry[1] = 2;
		//.....
		//intAry[5] = 6;
		//인덱스는 0부터 시작하니까 데이터 표현시 항상 +1 해서 넣어주자
		
		
		//사용자를 위해서는 이렇게 많이 씀
		String[] strAry = new String[10]; //"yedam"문자열을 넣을수 있는 방이 10개생성
		
		
		//배열생성해놓고 나중에 방을 생성함
		int[] intAry2;
		intAry2 = new int[5];
		
		String[] strAry2;
		strAry2 = new String[] {"1","2","3"};
		
		int[] scores = {83,90,87};
		System.out.println("scores 첫번째 값:" + scores[0]);
		System.out.println("scores 마지막 값:" + scores[2]);
		System.out.println("scores 두번째 값:" + scores[1]);
		scores[2]=100; //변수값 변경
		System.out.println("scores 변경된 마지막 값:" + scores[2]);
		
		//반복문과 배열
		//총 합계
		int sum = 0;
		//i=0~2까지 데이터 나오고 증가하는 데이터에 접근하여 하나씩 가져올거다
		for(int i=0; i<3; i++) {
			//sum += scroes[0];
			//sum += scroes[1];
			//sum += scroes[2];
			System.out.println(scores[i]);
			sum += scores[i];
		}
		System.out.println("총 합게 : " + sum);
		
		//new 연산자를 활용해서 배열 만들기
		//1)
		int[] point;
		point = new int[] {83, 90, 87};
		
		sum = 0;
		
		for(int i=0; i<3; i++) {
			sum = sum + point[i];
		}
		
		System.out.println("총 합계 : " + sum);
		
		//2)정수형 배열
		int[] arr1 = new int[3];
		for(int i =0 ; i<3; i++) {
			System.out.println("arr1["+i+"] : " + arr1[i]);
		}
		//방에 값을 넣고 출력
		arr1[0]=10;
		arr1[1]=20;
		arr1[2]=30;
		
		for(int i =0 ; i<3; i++) {
			System.out.println("arr1["+i+"] : " + arr1[i]);
		}
		
		//실수형 배열(double)	//초기값 설정 안하면 0.0으로 나옴
		double[] arr2 = new double[3];
	
		for(int i =0 ; i<3; i++) {
			System.out.println("arr2["+i+"] : " + arr2[i]);
		
		}
		arr2[0] =0.1;
		arr2[1] =0.2;
		arr2[2] =0.3;
		
		for(int i =0 ; i<3; i++) {
			System.out.println("arr2["+i+"] : " + arr2[i]);
		
		}
		//문자열 배열 생성 초기값 설정 안하면 null로 출력
		String[] arr3 = new String[3];
		for(int i =0 ; i<3; i++) {
			System.out.println("arr3["+i+"] : " + arr3[i]);
		}
		
		arr3[0]="1월";
		arr3[1]="2월";
		arr3[2]="3월";
		
		for(int i =0 ; i<3; i++) {
			System.out.println("arr3["+i+"] : " + arr3[i]);
		}
		
		
		
		
	}

}
