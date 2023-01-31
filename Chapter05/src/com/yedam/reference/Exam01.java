package com.yedam.reference;

public class Exam01 {

	public static void main(String[] args) {
		int intVal = 10;
		int[] array = {1,2,3};
		int[] array2 = {1,2,3,};
		int[] array3= null;
		int a;
		
		System.out.println(intVal);
		System.out.println(array); //살고 있는 자기만의 주소 
		System.out.println(array2); //살고 있는 자기만의 주소
		//참조타입은 메모리로 가서 어레이가 살고 있는 주소를 가지고 힙으로 가서 값을 가지고 오는거
		
		System.out.println(array == array2); //살고있는 주소가 같은지 비교 하는거라 번지가 달라서false
		System.out.println(array[0] == array2[0]); //데이터를꺼내와서 같냐라고 비교하는방법
		//참조타입부터는 비교하는 방법이 달라짐.
		//String은 변수.equals 로 비교
		
		System.out.println(array3);
		//System.out.println(array3.length); 널이라서 배열의 길이가 없기에 오류남.
		
		//memory leak -> 메모리 누수, 메모리 부족
		//메모리가 어디서 샌다,부족하다

		
		
	
	}

	}

