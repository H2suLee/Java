package _220503_Again;

public class Silver extends Member {
	
	public Silver(int record) {
		super(record);
		this.grade = "SILVER";
	}


	@Override
	public void showMemberInfo() {
		System.out.println("현재 실적은 " + this.record + "이며, 회원 등급은 " + this.grade + "입니다.");
	}

}
