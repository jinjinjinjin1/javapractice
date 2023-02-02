package homework;

public class Number {
	//필드(정보)-상품명 , 가격
		String name;
		int price;
		
		//기본생성자
		public Number(){
			
		}
		//모든 데이터를 초기화 할수 있는 생성자
		public Number(String name, int price) {
			this.name= name;
			this.price=price;
		}
		
		//메소드
		
		void getInfo() {
				System.out.println("상품명 : " + name);
				System.out.println("가격 : " + price);
		}
	}
