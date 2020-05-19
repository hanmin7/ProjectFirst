package nestedclassesInterfaces;

public class Button {
	OnclickListener listener; //OnclickListener타입의 listener필드 
	
	//set메소드
	void setOnclickListener(OnclickListener listener) {
		this.listener = listener;
	}
	
	//touch메소드 (onClick을 호출하는 메소드)
	void tourch() {
		listener.onClick();
	}
	
	interface OnclickListener {
		void onClick();
		
	}
}
