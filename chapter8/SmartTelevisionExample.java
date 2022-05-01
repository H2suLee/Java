package chapter8;

public class SmartTelevisionExample {

	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		
		RemoteControl rc = tv; // 인터페이스 선언과 동시에 구현 객체 대입
		Searchable searchable = tv; // 인터페이스 선언과 동시에 구현 객체 대입
		rc.turnOn();
		searchable.search("www.com.kr");
		tv.search("www.com.kr");
		tv.turnOff();
	}

}
