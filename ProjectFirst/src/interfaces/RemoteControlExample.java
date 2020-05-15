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
	}
}
