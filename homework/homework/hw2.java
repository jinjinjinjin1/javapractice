package homework;

import java.util.Scanner;

public class hw2 {

	public static void main(String[] args) {
		// 문제1) 차례대로 x와 y의 값이 주어졌을 때 어느 사분면에 해당되는지 출력하도록 구현하세요.
		// 각 사분면에 해당 하는 x와 y의 값은 아래를 참조하세요.
		// 제1사분면 : x>0, y>0
		// 제2사분면 : x<0, y>0
		// 제3사분면 : x<0, y<0
		// 제4사분면 : x>0, y<0
		// 문제출처, 백준(https://www.acmicpc.net/) 14681번 문제

		Scanner sc = new Scanner(System.in);
		System.out.println("x값 입력 >");

		int x = sc.nextInt();
		System.out.println("y값 입력 >");
		int y = sc.nextInt();
		while (x > 0 && y > 0) {
			System.out.println("제 1사분면");
			break;
		}
		while (x < 0 && y > 0) {
			System.out.println("제 2사분면");
			break;
		}
		while (x < 0 && y < 0) {
			System.out.println("제 3사분면");
			break;
		}
		while (x > 0 && y < 0) {
			System.out.println("제 4사분면");
			break;
		}

		// 문제2) 연도가 주어졌을 때 해당 년도가 윤년인지를 확인해서 출력하도록 하세요.
		// 윤년은 연도가 4의 배수이면서 100의 배수가 아닐 때 또는 400의 배수일때입니다.

		System.out.println("연도 입력>");

		int leapYear = sc.nextInt();
		sc.nextLine();
		if (leapYear / 4 == 0 && leapYear % 100 != 0 || leapYear / 400 == 0) {
			System.out.println(leapYear + "년은 [윤년] 입니다.");
		} else {
			System.out.println(leapYear + " 년은 [평년] 입니다.");
		}

		// 예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이며, or
		int year = 2012;

		if (year / 4 == 0 || year % 100 != 0) {
			System.out.println("예:" + year + "는 윤년입니다.");
		} else {
			System.out.println("예:" + year + "년 는 평년입니다.");
		}

		// 1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아닙니다. and
		int year2 = 1900;

		if (year2 / 100 == 0 && year2 % 400 != 0) {
			System.out.println("예:" + year2 + "년은 윤년입니다.");
		} else {
			System.out.println("예:" + year2 + "년은 평년입니다.");
		}
		// HiNT : 이중 IF문 사용
		// 문제출처, 백준(https://www.acmicpc.net/) 2753번 문제

		// 문제3) switch문을 이용하여 가위, 바위, 보 중 하나가 주어졌을 때 사용자 어떤 값을 가져야
		// 이길 수 있는 지를 출력하도록 구현하세요.//
		// 예를 들어, 가위가 주어졌을 때 "이기기 위해선 바위를 내야합니다." 라고 출력하도록 하세요.
		// 한 단어를 입력받을 경우 Scanner객체의 next() 함수를 사용하면 됩니다.

		System.out.println("가위,바위,보 중에 하나를 내시오>");
		String game = sc.nextLine();
		switch (game) {
		case "가위":
			System.out.println("이기려먄 주먹을 내시오");
			break;
		case "바위":
			System.out.println("이기려면 보를 내시오");
			break;
		case "보":
			System.out.println("이기려면 가위를 내시오");
			break;
		default:
			System.out.println("게임이 종료되었습니다");
			break;
		}

		// 문제4) 차례대로 m과 n을 입력받아 m단을 n번째까지 출력하도록 하세요.
		// 예를 들어 2와 3을 입력받았을 경우 아래처럼 출력합니다.

		// 2 X 1 = 2
		// 2 X 2 = 4
		// 2 X 3 = 6

		// 1)Scanner 활용해서 m,n
		// 2)m,n을 입력받으면 반복문을 통해서 구구단 완성
		// 3)m,n이 어떠한 역할을 하는지 파악한 후 반복문 최종 완성

		// 단 입력받는 m
		int m = Integer.parseInt(sc.nextLine());
		// 몇번째까지 구구단을 완성할 n을 입력
		int n = Integer.parseInt(sc.nextLine());

		for (int i = 1; i <= n; i++) {
			System.out.println(m + "x " + i + " = " + (m * i));
		}

		// 문제5) 호수에서 살고 있는 얼음요정이 곱셈을 공부하기로 했다. 근데 이 요정은 너무 멍청해서
		// 9라는 숫자 이외에는 헷갈려서 잘 쓰지 못한다고 한다. 그래서 사람과는 곱셈방식이 좀 다르다.
		// (규칙 1)

		// 곱하는 수나 곱한 결과에 9가 없으면 뭘 곱하든 9가 된다.

		// 3*4=9

		// 13*17=9

		// (규칙 2)

		// 곱하는 수나 곱한 결과에 9가 있으면 값을 그대로 출력한다.

		// 19*2=38

		// 13*7=91

		// 얼음요정의 n*n단을 출력해보자.

		// 예시 ) 입력 9
		// 출력
		// 1*1=9 2*1=9 3*1=9 4*1=9 5*1=9 6*1=9 7*1=9 8*1=9 9*1=9
		// 1*2=9 2*2=9 3*2=9 4*2=9 5*2=9 6*2=9 7*2=9 8*2=9 9*2=18
		// 1*3=9 2*3=9 3*3=9 4*3=9 5*3=9 6*3=9 7*3=9 8*3=9 9*3=27
		// 1*4=9 2*4=9 3*4=9 4*4=9 5*4=9 6*4=9 7*4=9 8*4=9 9*4=36
		// 1*5=9 2*5=9 3*5=9 4*5=9 5*5=9 6*5=9 7*5=9 8*5=9 9*5=45
		// 1*6=9 2*6=9 3*6=9 4*6=9 5*6=9 6*6=9 7*6=9 8*6=9 9*6=54
		// 1*7=9 2*7=9 3*7=9 4*7=9 5*7=9 6*7=9 7*7=49 8*7=9 9*7=63
		// 1*8=9 2*8=9 3*8=9 4*8=9 5*8=9 6*8=9 7*8=9 8*8=9 9*8=72
		// 1*9=9 2*9=18 3*9=27 4*9=36 5*9=45 6*9=54 7*9=63 8*9=72 9*9=81

		// n*n = n

		// 11)나눗셈, 나머지 계산
		// 각 자리수에 9가 포함되어있는지 확인.
		// 자리수가 한자리->i == 9 비교
		// 두자리수 ...
		// 33 - > 1.33/10 =9포함 , 33% 10=9포함시 정상적 연산
		// i*j =99 시 한줄 자체가 9가 포함되어있을시 출력
		// 포함되어있지않으면 결과 9로 나와야함
		// 자리수 표현 =>String length

	}

}
