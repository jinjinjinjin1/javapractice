package q2;


public class TossCard extends Card {
	//자식클래스
	//Card클래스를 상속 받는다
	
		//TossCard 클래스의 필드로 카드사(company),담당직원(cardStaff)을 가진다.
		//카드사는 항상 "Toss"이며 
		final String COMPANY="Toss";
		String cardStaff;
		
		//카드사를 제외한 필드는 생성자를 통해 매개변수로 값을 받아 초기화한다.
		public TossCard(int cardNo, int validDate, int cvc,String cardStaff) {
		super(cardNo, validDate, cvc);
		//this.cardNo = cardNo; ->부모에게서 있는 생성자
		//this.validDate = validDate; -> 부모에게서 있는 생성자
		//this.cvc = cvc; -> 부모에게서 있는 생성자
		this.cardStaff=cardStaff; //자식이 가진 생성자
		
		//Card클래스의 showCardInfo()메서드를 오버라이딩하여 다음과 같이 출력하도록 정의한다
		//1)출력양식 : 카드정보 - Card NO, 5432-4567-9534-3657
		//           담당직원 - 신빛용, Toss
		
		
	}

		public String getCardStaff() {
			System.out.println("신빛용" + COMPANY);
			return cardStaff;
		}

		@Override
		public void showCardInfo() {
			System.out.println("카드정보 - "+ cardNo + "\n" +"담당직원 - " + cardStaff);
		}

}
