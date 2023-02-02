package homework;

import java.util.Scanner;

public class myhw {

	public static void main(String[] args) {
	// 문제1) 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서
		
		//정보 입력 받는 용도의 스캐너 사용
		Scanner sc = new Scanner(System.in);
		//상품수와 상품가격을 넣을 변수 생성
		int number = 0;
		//int price =0;
		Number[] numberAry= null;
	// 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.
		
	// 1) 메뉴는 다음과 같이 구성하세요.
	// 1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료
		while(true) {
			System.out.println("1.상품 수 | 2.상품 및 가격입력 | 3. 제품별 가격 |4. 분석 | 5. 종료");
			System.out.println("입력 >");		
			int selectNo = Integer.parseInt(sc.nextLine());
			
	// 2) 입력한 상품 수만큼 상품명과 해당 가격을 입력받을 수 있도록 구현하세요.
			if(selectNo ==1) {
				System.out.println("상품 수 입력>");
				number =Integer.parseInt(sc.nextLine());
			}else if(selectNo ==2) {
				numberAry = new Number[number];
				for(int i=0;i<numberAry.length;i++) {
					numberAry[i]= new Number();
					
					System.out.println("상품명>");
					numberAry[i].name=sc.nextLine();
					
					System.out.println("가격>");
					numberAry[i].price = Integer.parseInt(sc.nextLine());
				}
			}else if(selectNo ==3)
		// 3) 제품별 가격을 출력하세요.
			for(int i=0; i<numberAry.length;i++)
				System.out.println(numberAry[i].name};
			}

	}

}
