package com.yedam.classes.abstract_class;

public class Bird extends Animal {

	public Bird(String kind) {
		super(kind);
	}
//부모클래스인 Animal에 sound라는 추상메소드가 있음  그거는 꼭 정의해줘야함
	@Override
	public void sound() {
		System.out.println("짹짹");
	}

}
