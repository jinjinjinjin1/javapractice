package Lotto;

import java.util.ArrayList;
import java.util.List;

public class Lotto {

	public static void main(String[] args) {
		//Lotto 배열 생성
		int[] lotto = new int[6]; //일꾼이 6개의 방이있는 배열을 먼저 생성
		//배열은 한정된 공간에서 넣는다
		
		lotto[0]=1;
		lotto[5]=5;
		
		//list가 덤으로 가지고 올 수 있다.
		//list는 무한으로 계속 넣을수 있다.
		List<Integer> intList = new ArrayList<>();
		intList.add(1); //0번 방
		intList.add(2); //1번 방
		intList.add(3); //2번 방
		
		intList.get(0);
		
		intList.set(0,10); //들어가있는 1을 빼고 10을 넣는다
		
		System.out.println(intList.get(0));

	}

}
