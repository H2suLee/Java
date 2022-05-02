package chapter15_Generics;


public class BoxExample {
	
	public static void main(String[] args) {
		Box box = new Box();
		
		box.setObject("홍길동");
//		String name = box.getObject(); // 컴파일 에러, box.getObject는 Object타입을 변환함, String과 Object의 타입 불일치
		String name = (String) box.getObject(); // String 으로 강제 변환해줘야 함 // 제너릭 클래스를 활용하면 이 과정이 생략됨
		System.out.println(name);
		
		box.setObject(new Apple());
//		Apple apple = box.getObject(); // 컴파일 에러, Object타입과 Apple 타입의 불일치
		Apple apple = (Apple) box.getObject(); // Apple로 타입 변환해 줘야 컴파일 ok
		System.out.println(box.getObject());
	
		
	}

}

