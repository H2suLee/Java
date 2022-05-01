package chapter8;

// 개발 코드 라이브러리

public class MyClass_sub{
	
	// 필드
	// 인터페이스가 필드 타입으로 사용될 경우 필드에 구현 객체를 대입할 수 있다.
	RemoteControl rc = new Television();

		// 필드로 선언된 rc는 실행 클래스에서 아래와 같이 사용될 수 있다.
		//	MyClass myClass = new MyClass();
		//	myClass.rc.turnOn(); // Television 메소드가 실행됨
	
	
	// 생성자
	// 인터페이스가 생성자의 매개 변수 타입으로 사용될 경우, new 연산자로 객체를 생성할 때, 구현 객체를 생성자의 매개값으로 대입할 수 있다.
	MyClass_sub(RemoteControl rc){
		this.rc =rc;
		rc.turnOn();
	}
		// 실행 클래스에서 이런 식으로 선언된다면.. 위 메소드가 Audio의 메소드로 실행됨
		// MyClass myClass = new MyClass(new Audio); 
	
	
	// 로컬 변수로 선언된 rc 메소드
	
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn(); // Audio것이 실행
		rc.setVolume(5); // Audio것이 실행
	}
	
	// 메소드의 매개 변수 타입으로 선언된 rc
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
	}
		// 실행 클래스에서는 이런 식으로 사용
		// MyClass myClass = new MyClass();
		// myClass.methodB(new Television()); // Television의 turnOn과 setVolume 실행
		
	
	
	

}
