package test0202;

import java.util.Scanner;

public class problem05 {

	public static void main(String[] args) {
		boolean run = true;
		int size=0; //주사위 크기
		int[] scores =null;
		Scanner sc= new Scanner(System.in);
		
		//[메뉴1]주사위 크기 5~ 10을 입력받으세요. 범위를 벗어날 경우 범위안내 메시지를 출력
		while(run){
			System.out.println("===1.주사위 크기 2.주사위 굴리기 3.결과 보기 4.가장 많이 나온 수 5.종료 ===");
			System.out.println("메뉴 >");
			
			int selectNo=Integer.parseInt(sc.nextLine());
			
			if(selectNo ==1) {
				System.out.println("주사위 크기 >");
				System.out.println("주사위 크기는 5~10 사이입니다.");
				scores = new int[size];
			}
		}
		//[메뉴2]5가 나올대까지 주사위를 몇번 굴리는지 구하고 출력
		//[메뉴3][메뉴2]에서 각 주사위 수별로 몇 번씩 나왔는지 출력
		//[메뉴4][메뉴2]에서 가장 많이 나온 수가 몇인지 구하고 출력
		//		가장 많이 나온 수가 여러 개 일경우 가장 작은 수가 출력됩니다.
		//프로그램을 종료
	}
}


