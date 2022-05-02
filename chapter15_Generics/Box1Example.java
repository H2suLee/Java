package chapter15_Generics;

public class Box1Example {
	public static void main(String[] args) {
		
		Box1<String> box = new Box1<String>(); // String 타입의 데이터만 받을 수 있음
		box.setT("홍길동");
		String name = box.getT();
//		box.setT(new Apple()); // 컴파일 에러, String 타입이 아니라 Apple타입
		
		// Apple 타입을 받고 싶으면 Apple 타입의 객체를 선언하면 됨
		Box1<Apple> appleBox = new Box1<Apple>();
		appleBox.setT(new Apple());
		appleBox.getT();
	}

}
