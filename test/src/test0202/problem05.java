package test0202;

import java.util.Scanner;

public class problem05 {

	public static void main(String[] args) {
		//1.주사위 크기 2.주사위 굴리기 3.결과 보기 4.가장 많이 나온 수 5.종료
		//1.주사위크기(5~10)
		//주사위의 최대크기가 5~10
		//5->1~5 5면체
		//6->1~6 6면체
		//...10~->1~10
		//5~10을 벗어난 크기를 입력 -> 범위가 벗어났다.
		
	
		Scanner sc= new Scanner(System.in);
		int[] dice= null; //어디서든지 설정한 배열을 쓰기위해서,while문에 써버리면 dice가 계속 초기화됨
		int size = 0;
		
		boolean run=true;
		while(run) {
			System.out.println("1.주사위 크기 2.주사위 굴리기 3.결과 보기 4.가장 많이 나온 수 5.종료");
			System.out.println("메뉴 >");
			String selectNo = sc.nextLine();
			
		switch(selectNo) {
		case "1" :
			System.out.println("주사위 크기 >");
			size = Integer.parseInt(sc.nextLine());
			//7 -> 배열 크기(사이즈) = 7
			//배열 입장 -> 0~6 -> 주사위 비유 -> 1~7
			//if문 활용 ->경고창
			if(size < 5 || size > 10) {
				System.out.println("5~10 사이 수를 입력하세요.");
			}
			break; //배열의 크기를 만들었음
		case "2":
			//주사위 크기 설정
			//5가 나올때 까지 반복문을 진행 -> while
			//랜덤값을 활용해서 숫자를 뽑아낸다.
			//5개 등장하면 반복문을 종료함
			dice = new int[size]; // 주사위 크기를 들어갈 배열
			//총 주사위를 몇번 굴렸는지 확인.
			int count=0;
			//5가 나올때까지 반복하는 반복문.
			while(true) {
				//랜덤값 추출
				int random = (int)(Math.random()* dice.length)+1; //= size)
				//각 숫자를 배열에 저장
				//랜덤으로 나온 숫자 -> 배열에서 인덱스로 적용
				//3 -> 배열에서 인덱스 2
				dice[random-1] =dice[random-1]+1;
				count++; //while문은 내가 몇번동안 돌았는지 확인 하기위해서 넣어줌
				//숫자 5가 등장하면 반복문 종료(숫자를 그만 가지고 나옴)
				if(random ==5) {
					break; //5가 등장하면 종료하겠습니다.라는 의미로 브레이크 걸어줌
				}
			}
			System.out.println("5가 나올때 까지 주사위를 "+count+ "번 굴렸숩니다.");
			break;
		case "3":
			for(int i=0;i<dice.length;i++) {
				System.out.println((i+1)+"은	"+ dice[i]+"번 나왔습니다.");
			}
		break;
		case "4":
			int max=dice[0];
			int index = 0;
			for(int i =0; i<dice.length; i++) {
				if(max < dice[i]) {
					max = dice[i];
					index = i; //주사위의 번호를 의미
				}
			}
			System.out.println("가장 많이 나온 수는" + (index+1)+"입니다.");
			break;
		case "5":
			System.out.println("프로그램 종료");
			run = false;
		}
		}
		
		//[메뉴1]주사위 크기 5~ 10을 입력받으세요. 범위를 벗어날 경우 범위안내 메시지를 출력

		//[메뉴2]5가 나올대까지 주사위를 몇번 굴리는지 구하고 출력
		//[메뉴3][메뉴2]에서 각 주사위 수별로 몇 번씩 나왔는지 출력
		//[메뉴4][메뉴2]에서 가장 많이 나온 수가 몇인지 구하고 출력
		//		가장 많이 나온 수가 여러 개 일경우 가장 작은 수가 출력됩니다.
		//프로그램을 종료
	}
}


