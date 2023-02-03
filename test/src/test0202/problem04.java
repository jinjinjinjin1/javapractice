package test0202;

public class problem04 {

	public static void main(String[] args) {
		//구구단을 단보다 곱하는 수가 작거나 같은 경우까지만 출력하는 프로그램을 작성
		//5단이면 5*1 ~ 5*5
		//8단이면 8*1 ~ 8*8
		//중첩반복문을 어떻게 쓰는지 보는 문제
		//첫번째 for문2~9단까지 진행하는 반복문
		for(int m=2; m<=9; m++) {
			System.out.println("***" + m + "단***");
			for(int n= 1; n<=m; n++) {
				System.out.println(m + "*" + n + " = " +(n*m)+"\t");
			}
			System.out.println();
		}

	}

}
