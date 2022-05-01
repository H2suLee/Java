package chapter7;

public class Dog extends Animal {
	// 추상 메소드의 추상 클래스를 Dog이 재정의하도록 강제하기 때문에 디버깅하면 @Override 자동으로 생성됨
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("멍멍");
	}

}
