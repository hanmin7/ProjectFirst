package com.yedam.generic;

public class Worker extends Person {
	Worker(String name) {
		super(name); //부모클래스받으면 super
	}
	
	@Override
	public String toString() {
		return "Worker " + this.getName();
	}
}
