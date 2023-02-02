package com.yedam.access;

public class Application01 {

	public static void main(String[] args) {
		Access ac = new Access();
		
		//public
		
		ac.free = "public";
		//protected
		ac.parent = "parent"; //같은 패키지라서 잘 불러와짐
		//default
		ac.basic = "basic";
		//private
		//ac.privacy = "privacy"; //Access 클래스에서만 사용할수 있기때문에 접근불가능
		
		//숨긴 정보를 대신해서 불러줌
		ac.instead();
		ac.info();
		ac.parent();
		ac.basic();
	}

}
