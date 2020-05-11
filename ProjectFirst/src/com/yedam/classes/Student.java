package com.yedam.classes;

public class Student {
	//(속성)  ->  필드
	String name; //이름
	int age; //나이
	double height; //키
	double weight; //몸무게
	
	//(생성자)  ->  필드의 초기값 지정
	Student(){
		System.out.println("생성자 호출");
	}
	
	Student(String name) {
		this.name = name;
	}
//	public Student(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}
	
	//(기능)  ->  메소드
	void study() {
		System.out.println("공부합니다.");
	} //공부한다
	void exercise() {
		System.out.println("운동합니다.");
	} //운동한다
	void eat(String str) {
		System.out.println(str + " 을 먹는다.");
	} //먹는다
	
	
}
