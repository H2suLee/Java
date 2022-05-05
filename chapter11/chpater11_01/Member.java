package chpater11_01;

public class Member {
	public String id;

	public Member(String id) {
		this.id = id;
	}

// equals 메소드 기본값	
//	public boolean equals(Object obj) {
//		// TODO Auto-generated method stub
//		return super.equals(obj);
//	}
	
	// Member 타입이면서 id 필드값이 같을 경우 true를 리턴, 그 이외의 경우는 false를 리턴
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			if (id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}


// hashcod 메소드 기본값
//	public int hashCode() {
//		return super.hashCode();
//	}
	
	
	// 객체의 동등 비교를 위해선 equals 뿐만 아니라 hashcode 메소드도 재정의해야 함.
	// id 필드값이 같을 경우, 같은 해쉬코드를 리턴하도록 하기 위해 String의 hashCode() 메소드의 리턴값을 활용
	// String의 hashCode()는 같은 문자열일 경우 동일한 해쉬코드를 리턴함
	@Override
	public int hashCode() { 
		return id.hashCode();
	}
	
	
	

}
