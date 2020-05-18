package interfaces;

public class RemoteControlExample {
	public static void main(String[] args) {
//		Audio audio = new Audio();
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		
		//익명객체.  인터페이스는 new로 못 만드는데 익명만들꺼라 
		//굳이 많이 안쓰면 익명객체로... 
		RemoteControl rc2 = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("익명 객체 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("익명 객체 끕니다.");
			}
			
		};
		rc2.turnOn();
		rc2.turnOff();
		
	}
}
