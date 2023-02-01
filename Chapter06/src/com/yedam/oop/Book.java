package com.yedam.oop;

public class Book {
	//book 이라는 클래스는 아래의 정보를 가져야 합니다.
	//책이름, 책종류, 가격, 도서번호, 출판사
	//생성자는 3개 정도 생성
	//1)기본생성자 하나
	
	//2)모든 데이터를 초기화할수 있는 생성자
	//데이터(매개변수)-> 필드를 초기화 하룻 있게끔 생성자
	//3)책이름,책가격,도서번호를 받아오는 생성자
	
	
	//메소드는 getInfo()메소드를 가짐
	//getInfo()메소드를 클래스 외부에서 실행 하였을때,
	//다음과 같은 출력물이 나오도록 구현.
	/*system.out.println()
	/*책 이름 : 혼자 공부 하는 자바
	 * #내용 
	 * 1)종류: 학습서
	 * 2)가격:24000원
	 * 3)출판사:한빛 미디어
	 * 4)도서번호:0001
	 * */
	
	
	//필드 
	String bookName;
	String kind;
	int price;
	int isbn; 
	String company;
	
	//생성자
	public Book() {
		//1)기본생성자
	}
	
	public Book(String bookName,String kind,int price,int isbn,String company) {
		//2)데이터(매개변수)->필드를 초기화 할수 있게끔 생성자
		this.bookName = bookName;
		this.kind = kind;
		this.price = price;
		this.isbn = isbn;
		this.company = company;
				
	}
	public Book(String bookName,int price,int isbn){
		//3)책이름,책가격,도서번호를 받아오는 생성자
		this.bookName=bookName;
		this.price=price;
		this.isbn=isbn;
	}
	

	//메소드
	void getInfo(){
		/*system.out.println()
		/*책 이름 : 혼자 공부 하는 자바
		 * #내용 
		 * 1)종류: 학습서
		 * 2)가격:24000원
		 * 3)출판사:한빛 미디어
		 * 4)도서번호:0001
		 * */
		System.out.println("책 이름 :" + bookName);
		System.out.println("# 내용");
		System.out.println("1) 종류 :" + kind);
		System.out.println("2) 가격: " + price);
		System.out.println("3) 출판사:"+ company);
		System.out.println("4) 도서번호:"+ isbn);
		
		
	}
}
