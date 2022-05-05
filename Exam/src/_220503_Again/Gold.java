package _220503_Again;

public class Gold extends Member {

	// (-) 필드 선언 하지 않고 등급을 생성자에서 지정
//	int record;
//	String grade = "GOLD";

//	public Gold(int record) {
//		super();
//		this.record = record;
//	}
//	
	public Gold(int record) {
		super(record);
		this.grade = "GOLD";
	}


	// (-) 애초에 추상 메소드도 아니었고 재정의 불필요
//	@Override
//	public void showMembershipInfo() {
//		
//		System.out.println("현재 실적은 " + this.record + "이며, 회원 등급은 " + this.grade + "입니다.");
//
//	}

}
