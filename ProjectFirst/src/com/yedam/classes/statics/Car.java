package com.yedam.classes.statics;

public class Car {
	//클래스안에 필드선언  / 메소드안에 선언은 변수
	private int speed; //초기값 = 0
	private boolean stop; //초기값 = false
	//Car클래스가 아닌 다른 클래스가 접근 x 이 안에서만 접근 가능. 만약 사용하고싶다? 메소드이용
	
//	Car(int speed) {
//		this.speed = speed;
//	}
	
	void setSpeed(int speed) {
		if(speed < 0)
			this.speed = 0;
		else
			this.speed = speed; //음수는 넣지 못하게 하겠다
		//필드의 적절한 값을 넣기위해 private, get,set메소드 작성
	}
	
	int getSpeed() {
		return this.speed;
	}

	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop; //트루
		this.speed = 0;
	}
	//set다음에 오클-소스-제너레이트겟어쩌구셋팅 에서 stop 체크하면  알아서넣어줌.
	//메인창에서는 .setSpeed(-10); 이렇게 쓰면됨. 메소드의 매개값으로 넣기.
	//c1.setSpeed() = -10; 이렇게는 못 씀.  c1.speed = -10
	//그러고 sysout(c1.getSpeed()); 이렇게 불러옴.
}
