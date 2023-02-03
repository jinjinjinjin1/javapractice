package homework;

import java.util.Scanner;

public class Homework0131 {
	public static void main(String[] args) {
		// 문제4) 차례대로 m과 n을 입력받아 m단을 n번째까지 출력하도록 하세요.
		// 예를 들어 2와 3을 입력받았을 경우 아래처럼 출력합니다.
		// 2 X 1 = 2
		// 2 X 2 = 4
		// 2 X 3 = 6
		// 1) Scanner 활용해서 m, n
		// 2) m, n을 입력 받으면 반복문을 통해서 구구단 완성
		// 3) m, n 어떠한 역활을 하는지 파악한 후 반복문 최종 완성
		Scanner sc = new Scanner(System.in);
		// 단 입력 받는 m
		int m = Integer.parseInt(sc.nextLine());
		// 몇 번째까지 구구단을 완성할 n을 입력
		int n = Integer.parseInt(sc.nextLine());

		for (int i = 1; i <= n; i++) {
			System.out.println(m + " x " + i + " = " + (m * i));
		}
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

		// 1) 나눗셈, 나머지 계산
		// 각 자리수에 9가 포함되어 있는지 확인.
		// 자리수가 한자리 -> i == 9 비교
		// 두자리수...
		// 33 -> 1. 33/10 = 9 포함 , 33%10 = 9 포함
		// i * j = 99
		// 포함이 되어 있지 않다, 결과 9로 나와야한다.

		System.out.println("입력>");
		int number = Integer.parseInt(sc.nextLine());
		boolean run = true;
		for (int i = 2; i <= number; i++) {
			run = true;
			for (int j = 1; j <= number; j++) {
				int result = i * j;
				if (i >= 10) {
					int ten = i / 10;
					int one = i - (ten * 10);
					if (ten == 9 || one == 9) {
						System.out.println(i + " * " + j + " = " + result);
						run = false;
					}
				}
				if (j >= 10 && run) {
					int ten = j / 10;
					int one = j - (ten * 10);
					if (ten == 9 || one == 9) {
						System.out.println(i + " * " + j + " = " + result);
						run = false;
					}
				}
				if (i % 9 == 0 || j % 9 == 0 && run) {
					System.out.println(i + " * " + j + " = " + result);
					run = false;
				}
				if (result / 1000 != 0 && run) {
					int thousand = result / 1000;
					int hundred = (result - (thousand * 1000)) / 100;
					int ten = (result - (thousand * 1000) - (hundred * 100)) / 10;
					int one = (result - (thousand * 1000) - (hundred * 100) - (ten * 10));
					if (thousand == 9 || hundred == 9 || ten == 9 || one == 9) {
						System.out.println(i + " * " + j + " = " + result);
						run = false;
					}
				} else if (result / 100 != 0 && run) {
					int hundred = result / 100;
					int ten = (result - (hundred * 100)) / 10;
					int one = (result - (hundred * 100) - (ten * 10));
					if (hundred == 9 || ten == 9 || one == 9) {
						System.out.println(i + " * " + j + " = " + result);
						run = false;
					}
				} else if (result / 10 != 0 && run) {
					int ten = result / 10;
					int one = result - (ten * 10);
					if (ten == 9 || one == 9) {
						System.out.println(i + " * " + j + " = " + result);
						run = false;
					}
				} else {
					System.out.println(i + " * " + j + " = 9");
				}
			}
		}

	}
}
