package com.yedam.exe;


import java.util.Scanner;


import com.yedam.service.CoffeeService;

public class ExeApp {
	//프로그램 실행에 대한 내용 작성
	//카페운영프로그램
	//메뉴 조회,상세 조회, 등록, 판매, 삭제, 매출 ,종료
	
	CoffeeService cs = new CoffeeService();
	Scanner sc = new Scanner(System.in);
	int selectNo = 0;
	
	public ExeApp() {
		run();
	}
	
	private void run() {
			while (selectNo !=6 ) {
			
			menu();
			
			switch(selectNo) {
			
			case 1:
				cs.getCoffeeList();
				break;
			case 2:
				cs.getCoffee();
				break;
			case 3:
				cs.insertCoffee();
				break;
			case 4:
				cs.salesCoffee();
				break;
			case 5:
				cs.deleteMenu();
				break;
			case 6:
				cs.storeSales();
				break;
			case 7:
				System.out.println("Bye ! ");
				break;
		}
	}
}
				
//		Coffee coffee = CoffeeDAO.getInstance().getCoffee("아이스아메리카노");
//		
//		System.out.println(coffee.getCoffeeMenu());
//		System.out.println(coffee.getCoffeeExplain());
//		System.out.println(coffee.getCoffeePrice());
//		System.out.println(coffee.getCoffeeSales());
//		
//		List<Coffee> coffeeList = CoffeeDAO.getInstance().getCoffeeList();
//		
//		for(Coffee tempCoffee : coffeeList){
//			System.out.println(tempCoffee.getCoffeeId());
//			System.out.println(tempCoffee.getCoffeeMenu());
//			System.out.println(tempCoffee.getCoffeeExplain());
//			System.out.println(tempCoffee.getCoffeePrice());
//			System.out.println(tempCoffee.getCoffeeSales());
//		}
//		System.out.println("메뉴 추가>>");
//		Coffee insertCoffee = new Coffee();
//		System.out.println("메뉴 번호>");
//		int menuNo = Integer.parseInt(sc.nextLine());
//		
//		System.out.println("메뉴 이름>");
//		String menuName = sc.nextLine();
//	
//		System.out.println("메뉴 설명>");
//		String menuExplain = sc.nextLine();
//		
//		System.out.println("메뉴 가격>");
//		int menuPrice = Integer.parseInt(sc.nextLine());
//		
//		System.out.println("메뉴 판매량>");
//		int menuSales = Integer.parseInt(sc.nextLine());
//		
//		
//		insertCoffee.setCoffeeId(menuNo);
//		insertCoffee.setCoffeeMenu(menuName);
//		insertCoffee.setCoffeeExplain(menuExplain);
//		insertCoffee.setCoffeePrice(menuPrice);
//		insertCoffee.setCoffeeSales(menuSales);
//		
//		int result = CoffeeDAO.getInstance().insertCoffee(insertCoffee);
//		
//		if(result > 0) {
//			System.out.println("데이터 입력 완료");
//			
//		}else {
//			System.out.println("데이터 입력 실패");
//		}
//		
//		
//		System.out.println("지울 메뉴 입력>");
//		String deleteMenu = sc.nextLine();
//		result = CoffeeDAO.getInstance().menuDelete(menuExplain);
//		
//		if(result > 0) {
//			System.out.println("데이터 삭제 완료");
//		}else {
//			System.out.println("데이터 삭제 실패");
//		}
//		
//		
//		System.out.println("==판매==");
//		System.out.println("메뉴 >");
//		String coffeeMenu = sc.nextLine();
//		System.out.println("잔 수>");	
//		int sales = Integer.parseInt(sc.nextLine());
//		
//		Coffee updateCoffee = new Coffee();
//		updateCoffee.setCoffeeMenu(coffeeMenu);
//		updateCoffee.setCoffeeSales(sales);
//		
//		result = CoffeeDAO.getInstance().salesCoffee(updateCoffee);
//		
//		if(result > 0) {
//			System.out.println("데이터 수정 완료");
//		}else {
//			System.out.println("데이터 수정 실패");
//		}
		
		

	
		private void menu() {
			//메뉴 조회,상세 조회, 등록, 판매, 삭제, 매출 ,종료
			System.out.println("1. 전체 메뉴 조회 | 2. 상세 조회 | 3. 커피 등록" 
		     + "| 4. 커피 판매 | 5. 커피 삭제 | 6. 매출 정산 | 7. 종료 ");
			System.out.println("선택 >");
			selectNo = Integer.parseInt(sc.nextLine());
		}
}

