package com.yedam.variable;

public class Operator {
	public static void main(String[] args) {
		//정수 자동 타입 변환 연산
		byte x = 10;
		byte y = 20;
		//byte result = x + y;
		int result = x + y;
		System.out.println(result);
		
		//강제 타입 변환
		byte result2 = (byte)(x+y); //앞에 타입을 강제로 부여함
		
		//데이터 타입 크기에 따른 연산
		//long + int = long
		//byte + int = int
		//long  or int + double or float = 실수 데이터 타입
		
		byte bVar = 10;
		int iVar1 = 100;
		long lVar = 1000;
		
		// int result3 = bVar + iVar1 + lVar; 오류남
		int result3 = (int)(bVar + iVar1 + lVar);
		
		double dVal2 = 3.14444;
		double dResult = result3 + dVal2;
		System.out.println(dResult);
		
		int iResult = (int)dVal2 + iVar1;
		System.out.println(iResult);
		
		//정수간 연산에서 실수가 나오는 경우
		int iVal2 = 30; //+,0,*,/
		double dVal3 = iVal2/4;
		//1.int 타입으로 우선 먼저 게산30/4 => 7.xxxxx
		//이 계산은 정수끼리의 계산이라서 뒤에 소수자리는 사라짐
		//double에 들어간 값이라서 소수점 자리까지 표현됨.날아간건 안나옴
		
		System.out.println(dVal3);
		
		int iVal3 = 4;
		dVal3 = (double)iVal2/iVal3;
		
		System.out.println(dVal3);
		
		// String + 연산
		
		String str1 = 10 + 2 + "8";
		System.out.println("str1 :"+str1); //128
		
		String str2 = 10 + "2" +8 ;
		System.out.println("str2 :"+str2); //1028
		
		String str3 = "10" + (2+8);
		System.out.println("str3 :" +str3); //1010
		
		
		//문자열 -> 숫자  [온전한 숫자로된 문자열만 변환가능]
		String iNO = "10"; //int
		String bNO = "8"; 	//byte
		String dNO = "3.222"; //double
		
		int sNO = Integer.parseInt(iNO);
		byte sNO2 = Byte.parseByte(bNO);
		double sNO3 = Double.parseDouble(dNO);
		
		System.out.println(sNO);
		System.out.println(sNO2);
		System.out.println(sNO3);
		
		//숫자 -> 문자열
		String str5 = String.valueOf(sNO);
		String str6 = String.valueOf(sNO2);
		String str7 = String.valueOf(sNO3);
		
		System.out.println(str5+str6+str7);
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
