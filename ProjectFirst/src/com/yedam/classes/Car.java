package com.yedam.classes;

public class Car {
	String model;
	int maxSpeed;
	public Car() {
		maxSpeed = 100;
	}//매개값이 정해지지않고 만들어질 때 맥스스피드를 100을 기본으로 하겠다
	
	public Car(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}//Car(int타입이 오면 맥스스피드로 하겠다)
	public Car(String model) {
		this.model = model;
	}
	public Car(String model, int maxSpeed) {
		this.model = model;
		this.maxSpeed = maxSpeed;
	}
	
	
	void showInfo() {
		System.out.println("모델명: " + model + "최고속도: " + maxSpeed);
	}
}
