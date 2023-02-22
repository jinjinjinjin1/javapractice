package com.yedam.map;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableExample {
	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<>();
		Scanner sc = new Scanner(System.in);
		

		
		//임의의 아이디
		map.put("spring","12");
		map.put("summer","123");
		map.put("fall","1234");
		map.put("winter","12345");
		
		
		
		while(true) {
			System.out.println("아이디와 비밀번호를 입력해주세요.");
			System.out.print("아이디: ");
			String id = sc.nextLine();
			System.out.print("비밀번호: ");
			String password = sc.nextLine();
			System.out.println();
			
			if(map.contain)
			
		}
		
		
		
		
		
		
		
	}

}
