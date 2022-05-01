package chapter7;

// 부모 Animal 자식 Dog, Cat
// 메소드의 선언만 통일하고, 실행 내용은 실체 클래스마다 달라야 하는 경우, 하위 클래스가 반드시 실행 내용을 채우도록 강제하고 싶을 때 추상 클래스에서 추상 메소드 선언
// public (or protected) abstract 리턴 타입 메소드 이름 (매개 변수)

public abstract class Animal {
	
	// Animal 클래스를 추상 클래스로 선언하고, sound() 메소드를 추상 메소드로 선언할 것. 어떤 소리를 내는 지 결정할 수 없지만 동물은 소리를 낸다는 공통적인 특징을 규정하기 위해
	// Animal 클래스를 상속하는 하위 클래스는 동물마다 고유한 소리를 내도록 sound() 메소드를 재정의 해야함
	
	// 필드
	public String kind;
	
	// 추상 클래스에 선언된 일반 클래스
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	// 추상 클래스에 선언된 추상 클래스
	public abstract void sound();

}
