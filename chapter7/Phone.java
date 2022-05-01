package chapter7;

// 추상 클래스: 실체 클래스들의 공통적인 특성을 추출해서 선언한 클래스. 추상 클래스와 실체 클래스는 상속 관계를 가지고 있다.
// 추상 클래스가 부모, 실체 클래스가 자식, 부모 클래스의 필드와 메소드를 물려 받음
// 추상 클래스 선언
//public abstract Class{
//	// 필드
//	// 생성자
//	// 메소드
//}

// new 연산자로 추상클래스의 객체를 호출할 수 없지만, 자식 객체가 생성될 때 super를 호출해서 추상 클래스 객체를 생성하므로 추상클래스도 반드시 생성자가 있어야 함.

// 부모 클래스 phone, 자식 클래스 smartphone

public abstract class Phone {
	// 필드
	public String owner;

	// 생성자
	
	public Phone(String owner) {
		super();
		this.owner = owner;
	}
	
	// 메소드
	// 추상 클래스라고 반드시 추상 메소드만 포함하지 않아도 됨.
	// 추상 클래스 내 일반 메소드의 역할은 최초 한 번만 기능 정의하는 역할
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	
	

}
