package com.yedam.array;

public class Exam07 {

	public static void main(String[] args) {
			//String 배열
			//Scanner 활용해서 index바꿔주는것도.
			String[] strArray = new String[3];
			strArray[0]= "yedam";
			strArray[1]= "yedam";
			strArray[2]= new String("yedam");
					
			System.out.println(strArray[0]==strArray[1]);
			System.out.println(strArray[0]==strArray[2]);
			System.out.println(strArray[0].equals(strArray[2]));
			
			// ==이면 번지가 같은지 비교 , .equals는 안에 데이터값이 같은지 비교
			
			
			//배열 복자
			int[] oldArray = {1,2,3};
			int[] newArray = new int[5];
			
			for(int i=0; i<oldArray.length;i++) {
				newArray[i] = oldArray[i];
			}
			for(int i=0;i<newArray.length;i++) {
				System.out.println(newArray[i]);
			}
			
			int[] oldArray2 = {1,2,3,4,5,6,7};
			int[] newArray2 = new int[10];
			
			System.arraycopy(oldArray2, 0, newArray2, 0, oldArray2.length);
			
			for(int i=0; i<newArray2.length; i++) {
				System.out.println(newArray2[i]);
			}
			for(int temp : newArray2) {
				System.out.print(temp+"\t");
			}
			
	}

}
