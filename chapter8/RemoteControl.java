package chapter8;

// 인터페이스: 객체의 사용 방법을 정의한 타입. 만능 리모콘
// 상수 필드와 추상 메소드만을 구성 멤버로 가짐
// 상수는 public static final, 생략해도 인터페이스 타입이라면 자바가 자동으로 알아서 인식함, 반드시 선언과 동시에 초기값을 지정해야
// default method, static method 나 아직 모름

// 인터페이스는 상수 빼곤 변수 선언도 못하고 추상메소드만 가질 수 있기 때문에 껍데기임. 
// 이를 구현해 주는 객체를 인터페이스의 구현 객체(implementer), 구현 객체를 생성하는 클래스는 구현 클래스

// 인터페이스1: RemoteControl - RemoteControlExample
// 인터페이스1의 구현 클래스: Television, Audio
// 인터페이스2: Searchable
// 인터페이스1과 2의 구현 클래스: SmartTelevision (다중 인터페이스 구현 클래스) - SmarTelevisionExample
// 인터페이스 사용 - (개발 코드(라이브러리)) MyClass 
// 인터페이스 사용 - (개발 코드(실행)) MyClassExample
// 개발 코드가 메소드 호출 -> 인터페이스 중간다리 -> 관련된 메소드 호출 -> 관련된 메소드에서 값 반환 -> 중간다리 인터페이스로 전달 -> 인터페이스가 개발 코드에게 값 전달  

public interface RemoteControl {
	
	// 인터페이스 상수 선언
	public static final int MAX_VOLUME = 10;
	public static final int	MIN_VOLUME = 0;
	
	// 인터페이스 추상 메소드 선언
	public abstract void turnOn();
	public abstract void turnOff();
	public abstract void setVolume(int volume);
	

}
