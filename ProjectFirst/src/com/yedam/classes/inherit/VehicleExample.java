package com.yedam.classes.inherit;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.run();
		
		vehicle = new Bus(); //부모클래스 변수 = (자동형변환) 자식클래스 인스턴스 할당가능
		vehicle.run();
		
		vehicle = new Taxi();
		vehicle.run();
		
//		Taxi taxi = vehicle; 부모를 자식클래스에 x 자동형변환x
		Taxi taxi = (Taxi) vehicle; //이렇게 형변환 적어줘야 가능. 자식클래스 = (강제형변환) 부모클래스;
		taxi.run();
		
	}
}
