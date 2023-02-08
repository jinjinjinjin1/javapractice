package q2;

public class Card {
	//부모클래스
	//필드로 카드번호(cardNo),유효날짜(validDate), CVC(cvc)를 가진다.
	int cardNo; //String
	int validDate;
	int cvc;
	
	//생성자를 통해 매개변수로 값을 받아 모든 필드를 초기화시킨다.
	public Card(int cardNo, int validDate, int cvc) { //String cardNo
		this.cardNo = cardNo;
		this.validDate = validDate;
		this.cvc = cvc;
	}
	
	//각 필드의 getter를 가진다.
	public int getCardNo() {
		System.out.println("Card No : 5432-4567-9534-3657");
		return cardNo;
	}

	public int getValidDate() {
		System.out.println(" 유효기간 : 20251203 ");
		return validDate;
	}

	public int getCvc() {
		System.out.println("cvc : 253");
		return cvc;
	}
	
	//다음과 같은 형식으로 정보를 출력하는 메서드를 추가로 가진다.
	//1)메소드 시그니처: public void showCardInfo()
	//2)출력양식 : 카드정보 (Card No : 5432-4567-9534-3657 , 유효기간 : 20251203 , cvc : 253)
	public void showCardInfo() {
		System.out.println("카드정보 (" + cardNo + validDate + cvc+ ")");
	}
	
	
	
	
}
