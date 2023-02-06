package homework;

public class ObesityInfo extends StandardWeightInfo {
			//	3) ObesityInfo 클래스를 정의한다.
			//- StandardWeightInfo 클래스를 상속한다.
			//- 메소드는 다음과 같이 정의한다.
	public ObesityInfo(String name, int height, int weight) {
		super(name, height, weight);
		
	}
//(1) public void getInformation() : 이름, 키, 몸무게와 비만도를 출력하는 기능
	@Override
	public void getInformation() {
		String obesity = null;
		if(weight <= 18.5) {
			obesity =" 저체중";
		}else if(weight <=22.9) {
			obesity =" 정상";
		}else if(weight <=24.9) {
			obesity =" 과체중";
		}else {
			obesity =" 비만";
		}
		System.out.println("이름 :" + name+ "님의 신장 " + height + ", 몸무게: " + weight + "입니다.");
	}
	
	
	
	

	
	
	
//(2) public double getObesity() : 비만도를 구하는 기능
//( * 비만도 : (Weight - 표준 체중)/표준체중 * 100 )
	public double getObersity() {
		//부모 클래스에 있는 표준 체중 메소드를 활용해서 비만도 연산
		double bmi = (weight - super.getStandardWeight())/super.getStandardWeight()*100;
		//bmi에 따른 비만도를 알려줘야함.
	
		return bmi;
	}
}
