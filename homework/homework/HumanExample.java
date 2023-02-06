package homework;

public class HumanExample {
	public static void main(String[] args) {
//		- 조건
//		변수는 Human 클래스 타입으로 선언하여 하나만 사용한다.
		
		
		Human human = null;
		
		human = new StandardWeightInfo("홍길동",168,45);
		human.getInformation();
		
		human = new ObesityInfo("박돌이",168,90);
		human.getInformation();
	}
}
