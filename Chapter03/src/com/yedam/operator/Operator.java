package com.yedam.operator;

public class Operator {

	public static void main(String[] args) {
		// 증감연산자
		
		int a = 0;
		System.out.println(a++); //
		
		System.out.println(++a);

		
		//부호 연산자
		int x = -100;
		
		System.out.println("x :" + x);
		System.out.println("-x : " + (-x));
		
		byte b = 100;
		int result = -b; // byte에서 꺼낸 순간 바로 int로 바뀜
		
		//논리 부정 연산자(! ,not)
		boolean flag = false;
		
		if(!flag) {
			System.out.println("false");
			System.out.println("false");
		}
		else
			System.out.println("true");
		
		
		//이항 연산자(사칙연산)
		int v1 = 10;
		int v2 = 4;
		System.out.println(v1+v2);
		System.out.println(v1-v2);
		System.out.println(v1*v2);
		
		
		//나누기 2개 존재
		// / :몱, % : 나머지
		
		System.out.println("/ :" + (v1/v2));
		System.out.println("% :" + (v1%v2));
		
		//비교연산자
		
		int num1 = 10;
		int num2 = 10;
		
		System.out.println(num1 == num2); //true
		System.out.println(num1 != num2); //false
		System.out.println(num1 >= num2 );// true
		
		//기본 타입의 값을 비교(==)
		//문자열 비교 문자열.equals(비교대상)
		
		String str = "test";
		
		if (str.equals("test")) {
			System.out.println("test입니다.");
		} //위의 str안의 test랑 if 문 안의 test가 같기때문에 t라서 결과물이 출력됨
		
		//대문자, 숫자 비교하는 연산자
		
		//대문자 확인
		int charCode = 'A'; //65 ,,, //Z = 90
		if(charCode >=65 && charCode <= 90) {
			System.out.println("대문자");  //'A'가 65와 90사이가 맞아서 t. 결과물 출력됨
		}
		
		//논리부정연산자+비교연산자
		//'0' 0< 48, '9'->57
		//charCode >= 48 && charCode <=57
		
		if (!(charCode<48) && !(charCode>57)) {
			System.out.println("0~9 숫자.");
		}//이 상태로 놔둔채로 런을하면 결과에 대한 문구가 없어서 출력이 따로 안됨 만약 결과출력문을 내고싶으면
		else {
			System.out.println("0~9 숫자가 아닙니다.");
		}//라고 해줘야함
		
		//대입 연산자 =, +=, -= .....
		
		int result1 = 0;
		
		result += 1; //result1 = result1 + 1
		result -= 10; //result1 = result -10
		
		//삼항 연산자
		
		int score = 85;
		char grade = (score > 90) ? 'A' : 'B'; //아래 식을 삼항연산자로 간단하게 표현 가능
		
		char grade2;
		
		if(score < 90) {
			grade2 = 'A';
		}else {
			grade2 = 'B';
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
