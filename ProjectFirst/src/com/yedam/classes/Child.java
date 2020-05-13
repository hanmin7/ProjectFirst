package com.yedam.classes;

import com.yedam.classes.inherit.Parent;

public class Child extends Parent {
	Child(){
		super();
	}

	Child(String lastName, String firstName, String telNumber) {
		super(lastName, firstName, telNumber);
	}
	// protected 구분.

	void showInfo() {
		Child child = new Child();
//		child.getLastName(); //d  접근x
		child.getFirstName();//pr
		child.getTelNumber(); //pu
	}
}
