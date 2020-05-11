package com.yedam.classes;

public class CalExample {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.powerOn(); //void powerOn 리턴값이 없는타입이라 이렇게 그냥 적어줌
		int result1 = cal.sum(10, 50); //리턴값이 있어서 int result1에 담을 수 있음.
		double result2 = cal.sum(10.2, 50.3);
		//println 메소드의 매개변수를 다르게 호출 / 실행 하도록
		//메소드 오버로딩.
		cal.println("30");
		cal.println(result1);
		cal.println(result2);
		
		double area1 = cal.getAreaRectangle(4.6, 5.5);
		cal.println("직사각형의 넓이 " + area1); //문자열정의해놓은거있어서 오류안뜸
		
		double area2 = cal.getAreaRectangle(5.5);
		cal.println(area2);
		
		double area3 = cal.getAreaRectangle(area1 , area2);
		cal.println(area3);
	}
}
