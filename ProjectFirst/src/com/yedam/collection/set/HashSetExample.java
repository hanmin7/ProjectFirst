package com.yedam.collection.set;

import java.util.HashSet;
import java.util.Set;
class Member {
	String name;
	int age;
	Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return this.name + ", " + this.age;
	}
//	@Override
//	public int hashCode() {
//		return this.age;
//	} 나이 같은걸 하나로 보겠다..
	
	@Override
	public int hashCode() {
		return this.name.hashCode();
	}//이름같은걸 하나로 보겠다...
	
	@Override
	public boolean equals(Object obj) {
		Member mem = (Member) obj;
		return this.name.equals(mem.name);
	} //hashcode age로 하면 2명만 나옴. 나이가 같은 애 한 명 빠짐.
	//name.hashcode 하면 Hong 한명만 나옴.
	
	
}
public class HashSetExample {
	public static void main(String[] args) {
		Set<Member> members = new HashSet<>();
		members.add(new Member("Hong", 10));
		members.add(new Member("Hong", 20));
		members.add(new Member("Hong", 10));
		
		for(Member member : members) {
			System.out.println(member.toString());
		} //3명 다 나옴.(해시코드,이퀄 오버라이딩 안했을 때) Member클래스가 가지고있는 해시코드랑 equals가 어떻게 정의되어있느냐에 따라 달라짐.
		
		
		Set<String> set = new HashSet<>();
		set.add("Hello");
		set.add("World");
		set.add("Hello");
		
		for(String str : set) {
			System.out.println(str.toString());
		}//중복허용X
		
	}
}
