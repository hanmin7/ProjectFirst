package com.yedam.exceptions;
abstract class Animal { //추상클래스 (구현부분이 없는거)
	abstract void sound();
}
class Dog extends Animal {
	@Override
	void sound() {System.out.println("멍멍");}
}
class Cat extends Animal {
	@Override
	void sound() {System.out.println("야옹");}
}
public class ClassCastExceptionExample { //cast 행변환
	public static void main(String[] args) {
		Animal dog= new Dog(); //부모클래스의 dog
		try {
			changeDog(dog); //밑에 행변환한 dog
		} catch (ClassCastException e) {
			System.out.println("변환불가");
		}
		
		Animal cat = new Cat();
		try {
			changeDog(cat); //행변환x 예외처리하던가...if(instanceof)else문으로도 표현가능
		} catch (ClassCastException e) { //아니면 throwsCCE해서 메인 호출에서 dog, cat 각각 예외처리 넣어줌.
			System.out.println("변환불가");
		}
	}
	public static void changeDog(Animal animal) throws ClassCastException {
//		try {
//		if(animal instanceof Dog) { //animal 값이 Dog맞는지 확인 
			Dog dog = (Dog) animal;
			dog.sound();
			
//		} else {
//			System.out.println("변경할 수 없는 클래스입니다.");
//		}
//		} catch(ClassCastException e) {
//			System.out.println("형변환을 할 수 없습니다.");
//		}
	}
}
