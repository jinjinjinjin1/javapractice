package homework;

public class EmpDept extends Employee {
	//필드
	public String department;
	public EmpDept(String name, int salaly,String department) {
		//부모생성자를 통해 부모객체 생성
		super(name, salaly);
		//자식객체 생성할 때 부서 이름 초기화
		this.department = department;
	}
	public String getDepartment() {
		return department;
	}
	@Override
	public void getInformation() {
		super.getInformation();
		System.out.println("부서 : " + department);
	}
	public void print() {
		super.print();
		System.out.println("서브클래스");
	}
	
	
	
		//	2) EmpDept 클래스를 정의한다.
		//- Employee 클래스를 상속한다.
		//- 추가로 부서이름을 필드로 가지며 생성자를 이용하여 값을 초기화한다.
		//- 추가된 필드의 getter를 정의한다.
	
	
	
	
		//- Employee 클래스의 메소드를 오버라이딩한다.
		//(1) public void getInformation() : 이름과 연봉, 부서를 출력하는 기능
	
		//(2) public void print() : "수퍼클래스\n서브클래스"란 문구를 출력하는 기능

	
	
	
}
