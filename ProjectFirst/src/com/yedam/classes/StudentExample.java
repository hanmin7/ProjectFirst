package com.yedam.classes;

public class StudentExample {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.name = "Hong";
		stu.age = 20;
		stu.height = 178.4;
		stu.weight = 70.5;
		stu.study();
		stu.eat("banana");
		
		System.out.println("이름 : " + stu.name + ", 나이 : " + stu.age);
		
		Student stu1 = new Student();
		stu1.name = "Park";
		stu1.age = 30;
		stu1.height = 178.4;
		stu1.weight = 70.5;
		System.out.println("이름 : " + stu1.name + ", 나이 : " + stu1.age);
		stu1.eat("사과");
		
		Student stu2 = new Student("Choi");
//		Student stu2 = new Student("Choi", 25); 이렇게 나열가능->생성자에 정의되어있어야함
		stu2.age = 25;
		stu2.height = 160.4;
		stu2.weight = 60.5;
		System.out.println("이름 : " + stu2.name + ", 나이 : " + stu2.age);
		stu2.eat("수박");
		
		Student[] s1 = new Student[3];
		s1[0] = stu;
		s1[1] = stu1;
		s1[2] = stu2;
		
		String inputStr = "Choi";
		
//		int inputStr1 = 30;
		
		for(Student stud : s1) {
//			if(inputStr1 == stud.age)
			if(inputStr.equals(stud.name))
			System.out.println(stud.name + "/ " + stud.age);
		}
		
	}
}
