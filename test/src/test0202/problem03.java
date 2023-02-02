package test0202;

public class problem03 {
		//다음과 같이 코드가 작성되었을때, 주어진 금액을 동전으로 바꾸었을때 몇개의 동전이 필요한지 프로그램을 구현
	public static void main(String[] args) {
		//큰 금액부터 동전을 우선적으로 거슬러줘야한다. 
		int[] coinUnit = new int[4];
		int money = 2680; //500원=4개,100원=6개,50원=1개,10원=3개
	
		
		System.out.println("money= " + money);
		for(int i= 0;i<coinUnit.length; i++) {
			//해당부분 코딩
		coinUnit[0]= 4;
		coinUnit[1]= 6;
		coinUnit[2]= 1;
		coinUnit[3]= 3;
		System.out.println("500원:" + coinUnit[0]+"개");
			
		}
		

	}

}
