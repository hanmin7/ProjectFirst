package com.yedam.classes.inherit;

//상속받는 자식클래스
public class DmbCellPhone extends CellPhone {
	int channel;

	public DmbCellPhone(String model, String color) {
		super(model, color); //super => CellPhone(a,b); 셀폰클래스의 생성자
	}
	public DmbCellPhone(String model, String color, int channel) {
		super(model, color);
		this.channel = channel;
	}
	
	void powerOn(int a) {
		System.out.println(a + "channel DMB 폰의 전원을 켭니다.");
	}
	
	@Override //확실하게 문법체크해줌
	void powerOn() {
		System.out.println("DMB 폰의 전원을 켭니다.");
	}

	@Override
	void powerOff() {
		System.out.println("DMB 폰의 전원을 끕니다");;
	}
	void turnOnDmb() {
		System.out.println("채널: " + channel + "번 방송을 수신.");
	}
	void ChangeChannel(int channel) {
		this.channel = channel;
		System.out.println("채널: " + channel + "번으로 변경.");
	}
	void turnOffDmb() {
		System.out.println("DMB 수신을 종료.");
	}
	
}
