package com.yedam.dev;

class People{
	String name;
}

public class StringEqualExample {
	public static void main(String[] args) {
		Student st1 = new Student();
		Student st2 = new Student();
		st1.name = "Hong";
		st2.name = "Park";
		
		System.out.println(st1); //주소값 15db9742
		System.out.println(st2); //주소값 6d06d69c
		
		String str1 = "Hello"; //new String("Hello");
		String str2 = "Hello"; //문자로 바로 만들면 참조가 같다고 나옴
		String str3 = new String("Hello"); //new 스트링으로 만들면 주소값이 다름.참조가 다름.
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		if (str1 == str2) {
			System.out.println("참조가 같다.");
		} else {
			System.out.println("참조가 다르다.");
		}
		
		if (str1 == str3) {
			System.out.println("참조가 같다.");
		} else {
			System.out.println("참조가 다르다.");
		}
		
	}
}
