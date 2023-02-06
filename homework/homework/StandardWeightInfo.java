package homework;

public class StandardWeightInfo extends Human {
	//	- Human 클래스를 상속한다.
	//	- 메소드는 다음과 같이 정의한다.
	public StandardWeightInfo(String name, int height, int weight) {
		super(name, height, weight);
		
	}
//	(1) public void getInformation() : 이름, 키, 몸무게와 표준체중을 출력하는 기능
	@Override
	public void getInformation() {
		super.getInformation();
		System.out.printf("\n표준체중 %.1f 입니다.\n",getStandardWeight());
	}


//	(2) public double getStandardWeight() : 표준체중을 구하는 기능
//	( * 표준 체중 : (Height - 100) * 0.9 )
	
	public double getStandardWeight() {
		double result = (double)((height - 100) * 0.9);
		return result;
		
	}
	
	
	
	
}
