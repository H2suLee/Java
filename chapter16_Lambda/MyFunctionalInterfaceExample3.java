package chapter16_Lambda;

public class MyFunctionalInterfaceExample3 {
	public static void main(String[] args) {

		MyFunctionalInterface3 fi;

		// 변수 = () -> {}; 기본 골격
		// (메소드에서 매개변수를 받아야 할 때 ) 변수 = (매개변수) -> {};

		fi = (x, y) -> {
			int result = x + y;
			return result;
		};
		fi.method(4, 5);

		// 더 간결히

		fi = (x, y) -> {
			return x + y;
		};
		fi.method(10, 6);

		// 이 경우는 실행 블록을 지울 수 있음
		fi = (x, y) -> x + y;
		fi.method(20, 5);
		
		// 실행 블록 안에 다른 메소드 호출 가능
		fi = (x, y) -> {
			return Math.subtractExact(x, y); // 뺄셈 연산
		};
		System.out.println(fi.method(4, 22));
		
		// 간결
		fi = (x, y) -> Math.min(x, y); // 최소값
		System.out.println(fi.method(7, 5));
		
		

	}
}
