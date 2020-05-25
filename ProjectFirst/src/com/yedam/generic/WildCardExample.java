package com.yedam.generic;

import java.util.Arrays;

//<T>
//<?>, <? extends class>, <? super class>
//Person(일본인코스) -> Worker(직장인코스)
//                -> Student(학생코스) -> HightStudent(고등코스)
//Course<T>
public class WildCardExample {
	public static void registerCourse(Course<?> course) {
		//Course<Person>, Course<Worker>, Course<Student>, Course<HighStudent>
		System.out.println(course.getName() + "수강생: " + Arrays.toString(course.getStudents())); //getStudents 배열을 나열해야해서 arrays.toString해줌
		
	}
	public static void registerStudent(Course<? extends Student> course) {//Student를 받거나 Student의 하위만 받음
		System.out.println(course.getName() + "수강생: " + Arrays.toString(course.getStudents()));
	}
	public static void registerWorker(Course<? super Worker> course) { //Worker의 상위 받겠다
		System.out.println(course.getName() + "수강생: " + Arrays.toString(course.getStudents()));
	}
	public static void main(String[] args) {
		Course<Person> coursePerson = new Course<Person>("일반인과정", 5);
		coursePerson.add(new Person("일반인"));
		coursePerson.add(new Worker("직장인"));
		coursePerson.add(new Student("학생"));
		coursePerson.add(new HighStudent("고등학생"));
		
		Course<Worker> courseWorker = new Course<Worker>("직장인과정",5);
		courseWorker.add(new Worker("직장인"));
		
		Course<Student> courseStudent = new Course<Student>("학생과정",5);
		courseStudent.add(new Student("학생"));
		courseStudent.add(new HighStudent("고등학생"));
		
		Course<HighStudent> courseHigh = new Course<HighStudent>("고등학생과정",5);
		courseStudent.add(new HighStudent("고등학생"));
		
		//Course<?> Course의 모든타입을 매개값으로 쓰겠다
		registerCourse(coursePerson);
		registerCourse(courseWorker);
		registerCourse(courseStudent);
		registerCourse(courseHigh);
		
		//Course<? extends class> 하위 제한
		registerStudent(courseStudent);
		registerStudent(courseHigh);
		
		//Course<? super class> 상위
		registerWorker(coursePerson);
		registerWorker(courseWorker);
//		registerStudent(courseStudent); 이런애들 사용 불가
		
	}
}
