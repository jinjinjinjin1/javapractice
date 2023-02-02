package homework;

import java.util.Scanner;

public class hw4 {

	public static void main(String[] args) {
		public static void main(String[] args) {
			// 문제1) 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서
			
			//정보 입력 받는 용도의 스캐너 사용
			Scanner sc = new Scanner(System.in);
			//상품수와 상품가격을 넣을 변수 생성
			int price = 0;
			Number[] numberAry= null;
		// 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.
		// 1) 메뉴는 다음과 같이 구성하세요.
		// 1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료
			while(true) {
				System.out.println("1.상품 수 | 2.상품 및 가격입력 | 3. 제품별 가격 |4. 분석 | 5. 종료");
				System.out.println("입력 >");
				
				int selectNo = Integer.parseInt(sc.nextLine());
			
				switch(selectNo){
					case 1:
						System.out.println("상품수>");
						productNo=Integer.parseInt(sc.nextLine());
						list = new Product[productNo];
					}break;
					case 2:
						System.out.println("=====================");
						for(int i=0; i<list.length; i++) {
							list[i] = new Product();
				
							System.out.println("상품명>");
							list[i].productName=sc.nextLine();
							System.out.println("가격>");
							list[i].price=Integer.parseInt(sc.nextLine);
							System.out.println("=====================");
						}break;
					case 3:
						for(Product product : list) {
							System.out.println("상품 명 : " + product.productName);
							System.out.println("가격 : " + product.price);
							
						}break;
					case 4:
						int max = 0; //list[0].price
						int idx = 0; 
						for(int i=1; i<list.length; i++) {
							if(list[i].price > max & i !=0) {
								max = list[i].price;
								idx=i;
								
							}
						}
						 int sum = 0;
						 for(Product product : list) {
							 if(product.price != max) {
								 sum +=product.price;
							 }
							 System.out.println("최고 가격 제품명:" + list[idx].productName);
							 System.out.println("최고 가격을 제외한 제품가격의 합: " + sum);
							 break;
							 case5:
								 run = false;
							 System.out.println("end of program");
							 break;
							 default:
							System.out.println("없는 메뉴 선택하였습니다.\n 맞는 메뉴를 선택해주세요.");
							break;
						 }
						
						
						
					}
				}

		}

}
