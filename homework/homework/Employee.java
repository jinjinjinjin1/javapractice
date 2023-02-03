package homework;

public class Employee {
	//필드
	String name;
	public String getName() {
		return name;
	}

	int salaly;
	public int getSalaly() {
		return salaly;
	}


	//생성자
	public Employee(String name,int salaly) {
		this.name = name;
		this.salaly = salaly;
	}
	

	//메소드
	public void getInformation() {
		System.out.printf("이름:" + name , "연봉:" + salaly);
	}
	public void printf() {
		System.out.println("수퍼클래스");
	}
}
