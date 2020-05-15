package interfaces;

public class Audio implements RemoteControl {
//implements는 인터페이스를 구현하는거
	
	@Override
	public void turnOn() {
		System.out.println("Audid 를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audid 를 끕니다.");
	}
	
}
