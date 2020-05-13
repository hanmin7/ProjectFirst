package com.yedam.classes.inherit;

public class CellPhone {
	//fields
	String model;
	String color;
	//constructors
	CellPhone(String model, String color) {
		this.model = model;
		this.color = color;
	}
	//methods
	void powerOn() {
		System.out.println("전원 켭니다.");
	}
	void bell() {
		System.out.println("벨 울립니다.");
	}
	void sendVoices(String message) {
		System.out.println("자신: " + message);
	}
	void receiveVoices(String message) {
		System.out.println("상대방 : " + message);
	}
	void powerOff() {
		System.out.println("전원 끕니다.");
	}
}
