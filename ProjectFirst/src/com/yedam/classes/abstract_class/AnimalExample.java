package com.yedam.classes.abstract_class;

public class AnimalExample {
	public static void main(String[] args) {
//		Animal animal = new Animal(); //추상클래스여서 인스턴스 만들지 못함
		Animal animal = new Bird("조류");
		animal.breath();
		animal.sound();  //부모클래스에 담을 수 있음
		
		Cat cat = new Cat("포유류");
		cat.breath();
		cat.sound();
		
		animal = cat; //상속관계에서는 자동형변환.
		
	}
}
