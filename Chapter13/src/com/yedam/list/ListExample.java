package com.yedam.list;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		//List<E>
		//데이터는 Strign문자열을 넣을 수 있는 ArrayList
		List<String>list = new ArrayList<String>();

		//list 추가
		list.add("JAVA"); //인덱스 0 데이터 추가
		list.add("JDBC"); //인덱스 1 데이터 추가
		list.add("Servelt/JSP");//인덱스 2 데이터 추가
		// 인덱스 2 데이터 추가 -> 인덱스 2 DateBase, 인덱스 3 Servelt/jsp 
		list.add(2,"dateBase");
		list.add("iBatis");
		//list.size() -> list의 크기(배열로 치면 length)
		for(int i=0; i<list.size(); i++) {
		//list.get -> 해당 인덱스의 객체를 꺼내온다.
			String str = list.get(i);
			System.out.println(i+ " : " + str);
		}
		System.out.println("==============================================");
		//list.remove(index) -> 해당인덱스의 객체 삭제
		list.remove(2); //index 2의 객체 삭제: DateBase 삭제
		
		//객체를 꼭 찝어서 삭제 
		list.remove("JDBC");
		
		for(int i=0; i<list.size(); i++) {
			//list.get -> 해당 인덱스의 객체를 꺼내온다.
				String str = list.get(i);
				System.out.println(i+ " : " + str);
		}

		//리스트 객체 전부 삭제
		list.clear();
		//list.size() -> 길이가 0이면 객체가 다 삭제 됨을 의미.
		System.out.println(list.size());
		
		//아래와 같은 기능을 구현할수도 있다.요런게 있구나~하면됨
		//contains
		//isEmplty()
		
		
		
		
		
	}
}
