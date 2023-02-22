package com.yedam.Example;

public class WashingExample {

	public static void main(String[] args) {
		
		WashingMachine LGws = new lgWashingMachine();
		
		LGws.startBtn();
		LGws.puaseBtn();
		LGws.stopBtn();
		LGws.dry();
		LGws.changeSpeed(2);
		
	}

}
