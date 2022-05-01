package _220428_1;

public class Plus2 {

	// method 실행 블록 내에 try catch문을 적절하게 배치하여
	// main 클래스를 실행했을 때 아래와 같이 출력되도록 하시오

	// 1
	// 3
	// 5
	// 1
	// 2
	// 5
	// 6

	// true일 때 1, 3, 5
	// false일 때 1, 2, 5, 6이 일어남을 유추할 수 있다

	public static void main(String[] args) {
		method(true);
		method(false);
	}

	public static void method(boolean value) {

		try {
			System.out.println(1); // 무조건 실행됨

			if (value) {
				throw new RuntimeException();
				// true면 runtime 예외가 나오고(->첫번째 캐치문) false면 예외 안 나옴(-> try 블록 정상 실행, 2출력)
			}
			System.out.println(2); // false일 때 실행됨
		} catch (RuntimeException e) {
			System.out.println(3);
			return; // true일 때 5까지만 실행되도록 하기 위해 메소드 강종
		} catch (Exception e) {
			System.out.println(4); // true일 때도 false일 때도 실행 안 됨
		} finally {
			System.out.println(5); // finally true, false 두 가지 경우의 수에 모두 나오므로 finally // 위에서 리턴해도 실행됨
		} 
		System.out.println(6); // false일 때만 실행

	}
}
