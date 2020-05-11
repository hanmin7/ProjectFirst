package com.yedam.dev;

public class Student {
	//필드
	String name;
	int age;
	String major;
	//생성자 (필드값 초기화)
	public Student() {
		
	}
	public Student(String name) {
		this.name = name;
	}
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Student(String name, int age, String major) {
		this(name, age); //this(name); this.age = age;
		this.major = major;
	}//필요한거만큼 만들면ㅇㅇ
	
	//메소드
	void setMajor(String major) {
		this.major = major;
	}
	String getMajor() {
		return major;
	}
}
