package _220503_Again;

public abstract class Member {
	
	static int GRADE_STANDARD = 1000000;
	
	int record;
	String grade;
	
	// (-) 생성자 선언해야
	public Member(int record) {
		this.record = record;
	}
	
//	public abstract void showMembershipInfo(); 
	// (-) 추상메소드 아님
	void showMemberInfo() {
		System.out.println("현재 실적은 " + this.record + "이며, 회원등급은 " + this.grade + "입니다.");

	}
	
	public static Member gatMembership(int record) {
		Member member = null;
		if (record > Member.GRADE_STANDARD) {
			member = new Gold(record);
		} else {
			member = new Silver(record);
		}
		return member;
	}
	
	// (+) 아래처럼 더 간단히 표현 가능(Member 클래스 선언부 생략해도 됨)ㄴ
//	static Member getMembership(int record) {
//		if(record >= Member.GRADE_STANDARD) {
//			return new Gold(record);
//		} else {
//			return new Silver(record);
//		}
//	}
	
}
