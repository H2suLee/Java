package chapter6;

// 메소드 선언 리턴 타입 + 메소드 이름 + 매개 변수 선언(생략 가능) + 실행 블록
// 리턴 타입. 메소드 결과 리턴되는 값의 타입
// 리턴 값이 없는 경우(powerOn()..) void // void를 리턴 타입으로 갖는 메소드에서 맨 마지막에 return을 슴ㄴ 메소드 실행을 강제 종료 시키는 역할을 함.
// 리턴 값이 있는 경우 리턴 값의 타입을 기술. double, int 등등
// 매개 변수는 메소드 실행에 필요한 데이터를 외부에서 받기 위해 사용됨
// return 문 이후의 실행문은 결코 실행되지 않는다. Unreachable code 컴파일 에러 발생

public class Calculator {
	// 필드

	int x;
	int y;

	// 생성자

	// 메소드

	// 0. 전원
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}

	void powerOff() {
		System.out.println("전원을 끕니다.");
	}

	// 1. 덧셈
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}

	// 3. 곱셈
	int multi(int x, int y) {
		int result = x * y;
		return result;
	}

	// 4. 나눗셈
	double div(int x, int y) {
		double result = (double) x / y;
		return result;
	}
	
	// 클래스 내부 호출, 메소드 이름(매개 변수))
	// 5. 평균
	double avg(int x, int y) {
		double sum = plus(x, y); // <- 1.의 덧셈 메소드를 호출함
		double result = sum / 2;
		return result;
	}
	
	// 6. 
	void execute() {
		double result = avg(7,10);
		System.out.println("(내부 호출)실행 결과 : " + result);
	}

}
