package com.yedam.generic;

public class HighStudent extends Student {
	HighStudent(String name) {
		super(name);
	}
	
	@Override
	public String toString() {
		return "HighStudent " + this.getName();
	}
} 
