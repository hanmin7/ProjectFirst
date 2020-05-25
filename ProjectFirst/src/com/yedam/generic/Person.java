package com.yedam.generic;

public class Person {
	private String name;//필드
	Person(String name) {
		this.name = name;
	}//생성자
	String getName() { //get메소드
		return this.name;
	}
	
	@Override
	public String toString() {
		return "Person " + this.getName();
	}
}
