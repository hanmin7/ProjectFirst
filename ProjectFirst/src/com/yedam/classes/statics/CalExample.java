package com.yedam.classes.statics;

public class CalExample {
	public static void main(String[] args) {
//		Calculator c1 = new Calculator();
//		c1.pi = 2.2;
		
		Calculator.pi = 3.14;
		Calculator.sum(45, 55); //굳이 new로 안해도 만들 수 있음.
		//student는 각각 다른 인스턴스가 필요하지만 굳이 필요없을 때 static으로 해서 저렇게 그냥 쓰면ㅇㅇ
		//보통 자바에 static 구현된게 많이 있어서 새로운거 만들 일은 잘 없음.
		
		
	}
}//236p
