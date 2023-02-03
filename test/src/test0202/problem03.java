package test0202;

public class problem03 {
		//다음과 같이 코드가 작성되었을때, 주어진 금액을 동전으로 바꾸었을때 몇개의 동전이 필요한지 프로그램을 구현
	public static void main(String[] args) {
		//큰 금액부터 동전을 우선적으로 거슬러줘야한다.  0:500:,1:100,2:50,3:10 각 인덱스에 동전단위 적음
		int[] coinUnit = new int[4];
		int money = 2680; //500원=4개,100원=6개,50원=1개,10원=3개
		coinUnit[0]= 4;
		coinUnit[1]= 6;
		coinUnit[2]= 1;
		coinUnit[3]= 3;
		
		System.out.println("money= " + money);
		for(int i= 0;i<coinUnit.length; i++) {
			//해당부분 코딩
		//제일 큰 금액부터 차감
			//2680 -> 500원 몇개 있는지 -> 남은 금액에 대해서
			//100원 몇개 있는지 -> 남은 금액에 대해서...
		if(money >500 ) {
			coinUnit[i]=money/500; //몫이면서 500원짜리 개수가 담김
			money = money-(coinUnit[i]*500);
			System.out.println("500원: "+ coinUnit[i] +"개");
			//money = 180
		}else if(money > 100) {
			coinUnit[i]=money/100;//몫이 100원짜리의 갯수
			money = money-(coinUnit[i]*100);
			System.out.println("100원:" + coinUnit[i] +"개");
		}else if(money > 50) {
			coinUnit[i]=money/50;//몫이 100원짜리의 갯수
			money = money-(coinUnit[i]*50);
			System.out.println("50원:" + coinUnit[i] +"개");
		}else if(money > 10) {
			coinUnit[i]=money/10;//몫이 100원짜리의 갯수
			money = money-(coinUnit[i]*10);
			System.out.println("10원:" + coinUnit[i] +"개");
		}
		
	}
		
	}	
}
