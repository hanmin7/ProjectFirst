package api.string;

public class StringSplitExample {
	public static void main(String[] args) {
		String text = "홍길동&이수홍,박연수,김자바-최명호";
		
		String[] names = text.split("&|,|-");
		//&나 ,나 -를 제거하고 배열로 뽑겠다.
		
		for(String name : names) {
			System.out.println(name);
		}
	}
}
