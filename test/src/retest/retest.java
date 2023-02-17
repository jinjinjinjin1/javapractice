package retest;

import java.util.Scanner;

public class retest {
	public static void main(String[] args) {
		// 1.변수 두개를 선언해서 1.2와 0.9F을 대입하고 두 변수의 사칙 연산 결과를 정수로 출력하는 코드 작성하시오.
		double var1 = 1.2;
		float var2 = 0.9F;

		int result1 = (int) (var1 + var2);
		int result2 = (int) (var1 - var2);
		int result3 = (int) (var1 * var2);
		int result4 = (int) (var1 / var2);

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);

		// 2.다음 코드가 수행될 때 출력되는 값을 적어보세요.
		int num;
		num = -5 + 3 * 10 / 2;
		System.out.println(num); // 10

		int num1 = 10;
		int num2 = 20;
		int result = (num1 >= 10) ? num1 + 10 : num2 - 20;
		System.out.println(result); // 20

		// 3.놀이공원 입장료를 계산하는 프로그램을 작성하세요.
		// 취학 전 아동(8살 미만)은 1000원, 초등학생(14살 미만)은 2000원,
		// 중고등학생(20살 미만)은 2500원, 그 이상은 3000원이라고 합니다.
		// 조건문사용
		int age = 8;
		int charge;

		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요.");
		int age1 = Integer.parseInt(sc.nextLine());

		if (age1 < age) {
			charge = 1000;
			System.out.println("취학전 아동(8살 미만)");
		} else if (age1 < age + 6) {
			charge = +2000;
			System.out.println("초등학생(14살 미만)");
		} else if (age1 < age + 12) {
			charge = +2500;
			System.out.println("중고등학생(20살 미만)");
		} else {
			charge = +3000;
			System.out.println("성인(20살 이상)");
		}
		System.out.println("입장료는 " + charge + " 원 입니다.");

		// 4.구구단을 출력하도록 프로그램을 작성하세요.
		/*
		 * 2*1=2 3*1=3... 2*2=4 3*2=6 2*3=6 3*3=9.. ............
		 */
		// 값만 출력
//			int i=0;
//			int j=1; 
//			
//			for( i=2; i<10; i++) {
//				for(j=1;j<10;j++) {
//					System.out.println(i + "X" +j + "=" +i*j);
//				}
//			}
		/*
		 * 2*1=2 3*1=3... 2*2=4 3*2=6 2*3=6 3*3=9.. ............
		 */
		int i = 0;
		int j = 1;

		for (int k = 2; k < 10; k++) {
			System.out.printf(k + "단" + "\t");
		}
		System.out.println();
		for (i = 1; i < 10; i++) {
			for (j = 2; j < 10; j++) {
				System.out.printf(j + "X" + i + "=" + i * j + "\t");
			}
			System.out.println();
		}

		System.out.println("=============================================================================");

//			//5.다음에서 정의한 메뉴를 가지는 프로그램을 구현후 실행코드와 실행결과를 제출하세요.
//			//"1.학생수 입력 2.학생점수 3.학생점수 전체조회 4.학생점수 분석 5.종료"로 메뉴를 구셩하세요.
//			//[메뉴1]입력받은 학생 수에 등록할 수 있는 학생점수 수가 정해지도록 구현하세요.
//				
//				int std;
//				int score[]=new int[5];
//			
//				System.out.println("메뉴");
//				System.out.println("----1.학생수 입력 2.학생점수 3.학생점수 전체조회 4.학생점수 분석 5.종료----");
//				System.out.println("메뉴 번호를 입력하세요.>");
//				int menu = Integer.parseInt(sc.nextLine());
//				//[메뉴2][메뉴1]에서 입력 받은 수 만큼 학생들의 점수를 입력받도록 구현하세요.	
//				//각학생의 점수를 입력하세요. 점수:100점, 73점, 92점, 65점, 86점
////				System.out.println("점수를 입력하세요. >");
////				System.out.println("학생1 점수>");
////				int score1= Integer.parseInt(sc.nextLine());
////				System.out.println("학생2 점수>");
////				int score2= Integer.parseInt(sc.nextLine());
////				System.out.println("학생3 점수>");
////				int score3= Integer.parseInt(sc.nextLine());
////				System.out.println("학생4 점수>");
////				int score4= Integer.parseInt(sc.nextLine());
////				System.out.println("학생5 점수>");
////				int score5= Integer.parseInt(sc.nextLine());
//				System.out.println("학생수 입력>");
//				int number = Integer.parseInt(sc.nextLine());
//				System.out.println("점수를 입력하세요. >");
//				for(std=1; std<number+1;std++) {
//					score[i] = Integer.parseInt(sc.nextLine());
//				
//					System.out.println("학생" +std+"점수 : "+score );
//				}
//				
//				
//				//[메뉴3]저장된 점수를 입력순으로 모두 출력하세요.
//				int Arr[] = {100,73,92,65,86};
//				int Arr1[] = new int[5];
//				for(i=0;i<Arr.length;i++) {
//					System.out.println("점수 > "+Arr[i]);
//				}
//			
//			//[메뉴4]분석기능 구현
//			//      1)점수 중 각 최고점과 최저점에 도달하는 점수를 출력하세요.
//			//[메뉴5] 프로그램 종료를 구현하세요.
//			
//			
//			
//			
//			
//			
//			
//			
//			
//			
//			
//			
//			
//			
//			
//			
//			
//			
//			

		// 5.다음에서 정의한 메뉴를 가지는 프로그램을 구현후 실행코드와 실행결과를 제출하세요.
		// "1.학생수 입력 2.학생점수 3.학생점수 전체조회 4.학생점수 분석 5.종료"로 메뉴를 구셩하세요.
		// [메뉴1]입력받은 학생 수에 등록할 수 있는 학생점수 수가 정해지도록 구현하세요.

		int std;
		int score;
		

		System.out.println("----1.학생수 입력 2.학생점수 3.학생점수 전체조회 4.학생점수 분석 5.종료----");
		System.out.println("메뉴 번호를 입력하세요.>");
		int menu = Integer.parseInt(sc.nextLine());
		// [메뉴2][메뉴1]에서 입력 받은 수 만큼 학생들의 점수를 입력받도록 구현하세요.
		// 각학생의 점수를 입력하세요. 점수:100점, 73점, 92점, 65점, 86점
//				System.out.println("점수를 입력하세요. >");
//				System.out.println("학생1 점수>");
//				int score1= Integer.parseInt(sc.nextLine());
//				System.out.println("학생2 점수>");
//				int score2= Integer.parseInt(sc.nextLine());
//				System.out.println("학생3 점수>");
//				int score3= Integer.parseInt(sc.nextLine());
//				System.out.println("학생4 점수>");
//				int score4= Integer.parseInt(sc.nextLine());
//				System.out.println("학생5 점수>");
//				int score5= Integer.parseInt(sc.nextLine());
		System.out.println("학생수 입력>");
		int number = Integer.parseInt(sc.nextLine());
		int[] Arr = new int[number];
		System.out.println("----1.학생수 입력 2.학생점수 3.학생점수 전체조회 4.학생점수 분석 5.종료----");
		System.out.println("번호를 입력하세요.>");
		int menu2 = Integer.parseInt(sc.nextLine());
		System.out.println("점수를 입력하세요. >");
		for (int k = 0; k < Arr.length; k++) {
			Arr[k] = Integer.parseInt(sc.nextLine());
			System.out.println("학생" + k + "점수 : " + Arr[k]);
		}
		// [메뉴3]저장된 점수를 입력순으로 모두 출력하세요.
		System.out.println("----1.학생수 입력 2.학생점수 3.학생점수 전체조회 4.학생점수 분석 5.종료----");
		System.out.println("번호를 입력하세요.>");
		int menu3 = Integer.parseInt(sc.nextLine());

		for (i = 0; i < Arr.length; i++) {
			System.out.println("점수 :" + Arr[i]);

//					System.out.println("점수를 입력하세요. >");
//					System.out.println("학생1 점수>");
//					String score[0]= Integer.parseInt(sc.nextLine());
//					System.out.println("학생2 점수>");
//					String score[1]= Integer.parseInt(sc.nextLine());
//					System.out.println("학생3 점수>");
//					String score[2]= Integer.parseInt(sc.nextLine());
//					System.out.println("학생4 점수>");
//					String score[3]= Integer.parseInt(sc.nextLine());
//					System.out.println("학생5 점수>");
//					String score[4]= Integer.parseInt(sc.nextLine());
////							
//					for(int i=0;i<score[]+1;i++) {
//						String[] score =+ new String[i];b
//						
//					}
//					
		}
		System.out.println();

	}

}
