package com.yedam.classes.inherit;

public class Tire {
	public int maxRotation; //타이어 수명
	public int accumulatedRotation; //현재 사용된 회전수
	public String location;
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "Tire 수명" +
			(maxRotation - accumulatedRotation) + " 회");
			return true; //아직 사용가능해서 true값 리턴
		} else {
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false; //더이상 못 씀 false값 리턴
		}
	}
}
