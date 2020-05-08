package com.yedam.classes;

public class People {
	//속성(필드) 3가지
	String name;
	int age;
	String birth;
	//기능(메소드) 2가지
	void work(String str) {
		System.out.println(str + "에 근무함.");
	}
	void live(String str) {
		System.out.println(str + "에 거주.");
	}
	void showInfo() {
		System.out.println("이름: " + name + " 나이: " + age + " 생일: " + birth);
	}
	
}
