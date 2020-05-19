package api;

public class Member {
	public String id;
	public Member() {
		//기본생성자.
	}
	public Member(String id) {
		this.id = id;
	}
	
	
	@Override
	public int hashCode() {
		return id.hashCode();
//		return super.hashCode();
	}
	
	
	@Override
	public boolean equals(Object obj) {
		//값이 같으면 동등하다고 나오게하는 방법
		Member m = (Member) obj;
		return this.id.equals(m.id);
		//this.id가 Sting타입임. 그거랑 m.id를 문자로 비교하겠다 -> return
		//MemberEx에서 실행해보면 동등하다고 나옴.

		
//		return super.equals(obj); 
		//MemberEx에서 조회하면 다르다고나옴. 보통 오브젝트의 이퀄은 다르게나옴.
		
	
	}
	@Override
	public String toString() {
		return "id값은" + this.id;
//		return super.toString();
	}
	
}
