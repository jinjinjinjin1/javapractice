package com.yedam.loop;

public class ControlExample {

	public static void main(String[] args) {
		//break; continue;
		//랜덤값 중에서 6이 나오면 반복문 멈추는것
		while(true) {
			int num = (int)(Math.random()*6)+1;
			System.out.println(num);
			if(num ==6) {
				break;
			}
		}
		//두 수의 합이 4인 수를 찾으시오.
		//1~10사이로 
		//이중for문
		for(int i=0;i<=10; i++) {
			for(int j=0; j<=10; j++)
				if(i+j ==4) {
					System.out.println(i +" + " + j + " = " + (i+j));
					break;
				}
		 }
		

	
		//label을 활용한 break
		//A - 소문자 여러건 출력
		//A - 소문자 g가 나오는 순간 밖에 있는 Outter for문 종료
		Outter : for(char upper = 'A'; upper <='z'; upper ++) {
			for(char lower = 'a'; lower <='z'; lower ++) {
			System.out.println(upper + " - " + lower);
			if(lower == 'g') {
				break Outter;
			}
		}
	}
	
	//continue...continue아래 내용을 실행하지 않고 반복문 실행
 	//홀수 숫자 실행하는 법
	for(int i = 0; i<=10; i++) {
		if(i%2 ==0) {
			continue; //짝수면 밑으로 내려가서 실행 안됨.바로 다시 위로 올라가서 홀수를 출력
		}
		System.out.println(i);
	}


	}
}
