package chapter8;

public class MyClass {
	
	// 필드
	
	RemoteControl rc = new Television(); // 인터페이스 rc는 Television 구현  클래스를 호출하는 중간다리가 될 것
	
	// 생성자
	MyClass(){
		
	}
		// 인터페이스를 매개 변수로 입력받는 생성자, 여기에 Television을 대입하면 실행블록안에 명시된 메소드를 T걸로 호출
	MyClass(RemoteControl rc){
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	
	// 메소드
		// 인터페이스를 로컬 변수로 선언하는 메소드A, 선언부를 어떻게 하느냐에 따라 메소드 결과가 다를 것
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
	}
		// 인터페이스를 매개 변수로 입력받는 메소드B, 구현 클래스 둘 중 암거나 대입하여야
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
	}

}
