package nestedclassesInterfaces;


class CallListener implements Button.OnclickListener {

	@Override
	public void onClick() {
		System.out.println("전화를 겁니다.");
	}
}

class MessageListener implements Button.OnclickListener {

	@Override
	public void onClick() {
		System.out.println("문자를 보냅니다.");
	}	
}

public class ButtonExample {
	public static void main(String[] args) {
		Button btn = new Button();
		
		CallListener cListener = new CallListener();
		btn.setOnclickListener(cListener);
		btn.tourch();
		
		MessageListener mListener = new MessageListener();
		btn.setOnclickListener(mListener);
		btn.tourch();
		
	}
}
