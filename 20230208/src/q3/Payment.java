package q3;

public interface Payment {
	//다음과 같이 상수필드를 가진다.
	//1)온라인 결제 할인율(ONLINE_PAYMENT_RATIO),5%
	public double ONLINE_PAYMENT_RATIO = 0.05;
	//2)오프라인 결제 할인율(OFFLINE_PAYMENT_RATIO),3%
	public double OFFLINE_PAYMENT_RATIO = 0.03;
	
	//다음과 같이 추상메서드를 가진다.
	//1)온라인 결제 메서드 시그니처: public int online(int price)
	public int online(int price);
	//2)오프라인 결제 메서드 시그니처: public int offline(int price)
	public int offline(int price);
	//3)결제 정보 출력 메서드 시그니처: public void showinfo()
	public void showinfo();
}
