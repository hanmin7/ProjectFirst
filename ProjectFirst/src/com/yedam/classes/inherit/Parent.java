package com.yedam.classes.inherit;

public class Parent {
	private String lastName;
	private String firstName;
	private String telNumber;//집전번
	
	protected Parent() {
		
	}

	public Parent(String lastName, String firstName, String telNumber) {
		super(); //Object 클래스 상속. Parent클래스가 부모로만드는데 왜 super가 생기냐 ? -자바의 모든 클래스는 Object클래스 상속받기때문
		this.lastName = lastName;
		this.firstName = firstName;
		this.telNumber = telNumber;
	}

	
	String getLastName() {
		return lastName;
	}

	void setLastName(String lastName) {
		this.lastName = lastName;
	}

	protected String getFirstName() {
		return firstName;
	}

	protected void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getTelNumber() {
		return telNumber;
	}

	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

	@Override //그래서 바꾸고싶은거 있으면 오버라이딩으로 재설정해줌
	public String toString() {
		return "lastName= " + lastName + "firstName= " + firstName;
	}
	
	
}
