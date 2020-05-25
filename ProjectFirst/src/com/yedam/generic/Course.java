package com.yedam.generic;

public class Course<T> {//여러애들 받아야해서 정해지지않은 제너릭타입 (Person,Worker,Student...)
	private String name;
	private T[] students;
	
	Course(String name, int capacity) { //capacity 학원의 규모.몇명까지받을꺼다
		this.name = name;
		this.students = (T[]) new Object[capacity];
	}
	String getName() {
		return this.name;
	}
	T[] getStudents() {
		return students;
	}
	
	void add(T t) { //T[] students에 담을꺼
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}
}
