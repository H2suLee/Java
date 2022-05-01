package chapter8;

public class MyClassExample {

	public static void main(String[] args) {
		// MyClass에서 rc가 Television 구현 객체로 대입되었기 때문에 아래 메소드는 TV것들로 실행됨 
		MyClass myClass = new MyClass(); // 첫번째 초기화		
		myClass.rc.turnOn();
		myClass.rc.turnOff();
		myClass.rc.setVolume(15);
		System.out.println("=======================================");
		
		
		// 매개 변수를 인터페이스로 받아 생성하는 경우, 매개값으로 구현 클래스를 대입
		myClass = new MyClass(new Television()); // 두번째 초기화
			// 생성자에 명시된 대로 TV 것들 메소드가 생성됨
		System.out.println("=======================================");
		
		myClass = new MyClass(new Audio()); // 세번째 초기화
			// 생성자에 명시된 대로 Audio 것들 메소드가 생성됨
		System.out.println("=======================================");
		
		myClass = new MyClass(); // 네번째 초기화
		myClass.methodA(); // 로컬 변수로 선언된 인터페이스 rc에 Audio가 대입되어 있으므로 Audio 것 실행
		System.out.println("=======================================");
		
		myClass.methodB(new Audio());
		System.out.println("=======================================");
		

	}

}
