package com.yedam.generic;

public class Student extends Person{
	Student(String name) {
		super(name);
	}
	
	@Override
	public String toString() {
		return "Student " + this.getName();
	}
}
