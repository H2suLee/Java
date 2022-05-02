package chapter16_Lambda;


public class MyFunctionalInterfaceExample {
	public static void main(String[] args) {
		// 람다식을 사용하려면 인터페이스 변수를 선언해야 함
		// 람다식도 메소드임. 메소드는 객체 안에서만 가동
		MyFunctionalInterface fi;

		// 인터페이스를 구현하려면 구현클래스가 필요.
		// 그러나 람다식을 사용하면 구현클래스가 없어도 인터페이스 구현 가능, 구현 객체도 대입할 필요 없이 메소드 호출 가능,
		// 람다식에 대하여 정의를 내리면 됨, 람다식 정의와 동시에 인터페이스의 추상메소드 오버라이딩 가능

		// fi가 이런 식으로 구현 된다
		fi = () -> {
			String str = "method call1";
			System.out.println(str);
		};

		fi.method();
		
		// 더 간결히 줄일 수 있음

		fi = () -> {
			System.out.println("method call2");
		};
		fi.method();
		
		// 명령어가 한 줄이면 실행 블록을 빼고 더 간결하게
		fi = () -> System.out.println("method call3");
		fi.method();
	}
}
