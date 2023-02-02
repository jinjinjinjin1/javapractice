package test0202;

public class problem02 {

	public static void main(String[] args) {
		//다음 코드가 수행될 때 출력되는 값
		int num1 =10;
		int num2 =20;
		boolean result; //false,true
		
		result =((num1 >10) && (num2 >10)); //&&는 and (그리고) 의미
		System.out.println(result); //false
		
		result =((num1 >10) || (num2 >10)); //||는 or (또는) 의미
		System.out.println(result); //true
		System.out.println(!result); //false
		
	}

}
