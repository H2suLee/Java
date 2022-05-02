package chapter7_InstanceOf;

public class InstanceofExample {
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1 = Child 로 변환 성공");
		} else {
			System.out.println("method1 = Child 로 변환 실패");
		}
	}
	
	public static void method2(Parent parent) {
		Child child = (Child) parent; // ClassCastException 발생 가능성 有
		System.out.println("method2 = Child 로 변환 성공");
	}
	
	public static void main(String[] args) {
		Parent parentA = new Child(); // 자동 타입 변환
		method1(parentA); // = method1(new Child());
		method2(parentA);
		
		
		Parent parentB = new Parent();
		method1(parentB);
		method2(parentB); // 예외 발생
		
	}

}
