package q1;

public class Person {
	//필드-주민등록번호(ssn),이름(name),주소(address)를 가진다.
	int ssn; //String
	String name;
	String address;

	//생성자
	//두개의 생성자를 가진다
	//1)기본생성자로 필드를 초기화 하지않음
	public Person() {
	}
	//2)주민등록번호(ssn),이름(name),주소(address)를 매개변수로 받아 필드 초기화한다.
	public Person(int ssn, String name, String address) { //String
		this.ssn = ssn;
		this.name = name;
		this.address = address;
	}
	
	//각 필드의 getter,setter를 가진다.
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public String getName() {
		System.out.println();
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

}
