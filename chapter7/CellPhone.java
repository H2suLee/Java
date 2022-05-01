package chapter7;

// 부모 클래스 CellPhone, 자식 클래스 DmbPhone

public class CellPhone {
	
	// extends 뒤에는 단 하나의 부모 클래스만 와야 함
	// 부모 클래스에서 private 접근 제한을 갖는 필드와 메소드는 상속 대상에서 제외됨
	// 부모 클래스와 자식 클래스가 다른 패키지에 존재한다면, default 접근 제한을 갖는 필드와 메소드도 상속 대상에서 제외
	
	// 필드
	String model;
	String color;
	
	// 생성자
	
	// 메소드
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	void bell() {
		System.out.println("벨이 울립니다.");
	}
	
	void sendVoice(String message) {
		System.out.println("나: " + message);
	}
	void receiveVoice(String message) {
		System.out.println("상대방: " + message);
	}
	void hangUp() {
		System.out.println("전화를 끊습니다.");
	}

}
