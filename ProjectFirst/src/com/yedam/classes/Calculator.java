package com.yedam.classes;

public class Calculator {
	String model;
//	public Calculator() {	
//	} 따로 적지않아도 기본생성자가 정의되어있다고 알고있음.

	void powerOn() {
		System.out.println("전원을 켭니다.");
		//반환값 없는 타입 -> void / 메소드이름  / 매개변수 {}
	}
	int sum(int num1, int num2) {
		return num1 + num2;
	}
	double sum(double num1, double num2) {
		return num1 + num2;
	}//메소드 이름 sum으로  매개변수받는 타입이 다를 때 이름 똑같이 쓸 수 있음.
	
	void println(String str) {
		System.out.println("결과값은 : " + str);
	}
	void println(int str) {
		System.out.println("결과값은 : " + str);
	}
	void println(double str) {
		System.out.println("결과값은 : " + str);
	}
	double getAreaRectangle(double width, double height) {
		return width * height;
	}
	double getAreaRectangle(double width) {
		return width * width;
	}
}
