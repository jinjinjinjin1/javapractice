package homework;

import java.util.Scanner;

public class Homework0202 {
	public static void main(String[] args) {
		// 문제1) 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서
		// 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.
		// 1) 메뉴는 다음과 같이 구성하세요.
		// 1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료
		// 2) 입력한 상품 수만큼 상품명과 해당 가격을 입력받을 수 있도록 구현하세요.
		// 3) 제품별 가격을 출력하세요.
		// 출력예시, "상품명 : 가격"
		// 4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
		// 5) 종료 시에는 프로그램을 종료한다고 메세지를 출력하도록 구현하세요.
		Scanner sc = new Scanner(System.in);
		Product[] list = null;
		int productNo = 0;

		boolean run = true;

		while (run) {
			System.out.println("===1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료===");
			System.out.println("선택>");
			int selectNo = Integer.parseInt(sc.nextLine());

			switch (selectNo) {
			case 1:
				System.out.println("상품 수>");
				productNo = Integer.parseInt(sc.nextLine());
				list = new Product[productNo];
				break;
			case 2:
				System.out.println("===============");
				for(int i=0; i<list.length; i++) {
					list[i] = new Product();
					System.out.println("상품명>");
					list[i].productName = sc.nextLine();
					System.out.println("가격>");
					list[i].price = Integer.parseInt(sc.nextLine());
					System.out.println("===============");
				}
				break;
			case 3:
				System.out.println("===============");
				for(Product product : list) {
					System.out.println("상품명 : " + product.productName);
					System.out.println("가격 : " + product.price);
					System.out.println("===============");
				}
				break;
			case 4:
				int max = list[0].price;
				int idx = 0;
				for(int i=1; i<list.length; i++) {
					if(list[i].price > max) {
						max = list[i].price;
						idx = i;
					}
				}
				
				int sum = 0;
				for(Product product : list) {
					if(product.price == max) {
						continue;
					}
					sum += product.price;
				}
				
				System.out.println("최고 가격 제품명 : " +list[idx].productName);
				System.out.println("최고 가격을 제외한 제품가격의 합 : " + sum);
				break;
			case 5:
				run = false;
				System.out.println("end of program");
				break;
			default:
				System.out.println("없는 메뉴 선택하였습니다.\n맞는 메뉴를 선택주세요.");
				break;
			}
		}

	}
}
