package chapter7;

public class PhoneExample {
	public static void main(String[] args) {
//		Phone phone = new Phone(); // 컴파일 에러, 추상 클래스는 new 연산자로 객체 생성 불가능, 실체 클래스의 공통되는 필드와 메소드를 추출해서 만들었기 때문에
//		Phone phone = new SmartPhone("홍길동"); // 가능, 추상 클래스가 타입으로 쓰이는 것은 가능
		
		SmartPhone smartPhone = new SmartPhone("홍길동"); // 부모의 필드를 물려받아 객체 생성
		smartPhone.turnOn(); // 부모 메소드 물려받아 사용
		smartPhone.searchInternet(); // 자식 메소드 호출하여 사용
		smartPhone.turnOff(); // 부모 메소드 물려받아 사용
		
	}
	

}
