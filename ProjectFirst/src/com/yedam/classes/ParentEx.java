package com.yedam.classes;

import com.yedam.classes.inherit.Parent;

public class ParentEx {
	public static void main(String[] args) {
		Parent parent = new Parent("", "", "");
//		parent.getLastName();//default  패키지 달라서 접근x
//		parent.getFirstName();//protected  패키지 달라서 접근x
		parent.getTelNumber();//public
	}
}
