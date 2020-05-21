package com.yedam.generic;

//public class Box {
	public class Box<T> {
//	Object object;
	T object;
	
//	void set(Object object) {
//		this.object = object;
//	}
	
//	Object get() {
//		return object;
//	}
	
	void set(T object) {
		this.object = object;
	}
	
	T get() {
		return object;
	}
	
	//정해지지않은 타입 (나중에 넣을 때마다 변환하면됨.모든타입올수있음) 할 때 T로(문자는 암꺼나상관없음) ->BoxExample 
}
