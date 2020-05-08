package com.yedam.classes;

public class PeopleExample {
	public static void main(String[] args) {
		People pp = new People();
		pp.name = "Han";
		pp.age = 25;
		pp.birth = "0508";
		pp.work("회사");
		pp.live("대구");
		

		People pp1 = new People();
		pp1.name = "Kim";
		pp1.age = 28;
		pp1.birth = "0707";
		pp1.work("은행");
		pp1.live("서울");
		

		People pp2 = new People();
		pp2.name = "Lee";
		pp2.age = 30;
		pp2.birth = "0407";
		pp2.work("구청");
		pp2.live("부산");
		

		People[] p1 = new People[3];
		p1[0] = pp;
		p1[1] = pp1;
		p1[2] = pp2;
		
		for(People ppd : p1) {
			ppd.showInfo();
		}
		
	}
}
