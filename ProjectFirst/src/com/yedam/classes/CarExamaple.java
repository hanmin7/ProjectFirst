package com.yedam.classes;

public class CarExamaple {
	public static void main(String[] args) {
		
		//new car로만 만들 수 없음. Car c로 주소값을 담는다
		Car c1 = new Car();
		c1.model = "Sonata";
		System.out.println(c1.maxSpeed);
		//아무것도 지정안할 시 스피드는 기본 100으로 되어있음
		
		Car c2 = new Car(200);
		c2.model = "BMW";
		
		Car c3 = new Car("Benz");
		c3.maxSpeed = 300;
		
		Car c4 = new Car("Accent", 200);
	}
}
