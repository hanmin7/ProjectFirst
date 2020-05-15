package interfaces;

public interface RemoteControl {
	//상수 final static(포함) 선언되면 바꿀 수 없음.
	public int MAX_VOLUME = 0;
	public int MIN_VOLUME = 10;
	
	//추상메소드
	public void turnOn();
	public void turnOff();
	
}
