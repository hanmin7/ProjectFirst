package interfaces;
interface Action{
	void work();
}
public class ActionExample {
//DaoExample처럼 클래스 선언은 낭비. 익명객체로 하는방법
	public static void main(String[] args) {
		Action action = new Action() { //인터페이스Action을 ~~

			@Override  //익명구현객체
			public void work() {
				System.out.println("복사를 합니다.");
			} 
			
		};
		action.work(); //복사를 합니다.
		
	}
}
