package chapter8;

// 인터페이스(RemoteControl)와 구현 클래스(Television, Audio)를 확인하기 위해 만든 연습용 클래스

public class RemoteControlExample {

	public static void main(String[] args) {
		
		// 인터페이스로 구현 객체를 사용하려면, 인터페이스 변수를 선언하고 구현 객체를 대입해야 함.
		// 인터페이스 변수;
		// 변수 = 구현 객체;
		// or
		// 인터페이스 변수 = 구현 객체;
		
		RemoteControl rc; // 인터페이스 변수 선언
		rc = new Television(); // Television 구현 객체 대입
		rc.setVolume(5); // Television 메소드 호출
		rc.turnOn(); // Television 메소드 호출
		
		rc = new Audio(); // Audio 구현 객체 대입
		rc.setVolume(20); // Audio 메소드 호출
		rc.turnOff(); // Audio 메소드 호출
		
	}

}
