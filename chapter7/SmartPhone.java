package chapter7;

public class SmartPhone extends Phone {
	
	
	// 추상 클래스를 상속받을 경우 생성자를 자동으로 만들어 줌
	// 생성자
	public SmartPhone(String owner) {
		super(owner);
	}
	
	// 메소드 // 추상 클래스에 선언된 메소드가 public 이므로 자동으로 override하게 set해 주지 않음
	public void searchInternet() {
		System.out.println("인터넷 검색을 합니다.");
	}
	

}
