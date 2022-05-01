package chapter7;

// 부모 클래스 Calculator 자식 클래스 Computer

public class Calculator {

	// 메소드 재정의(Method Overriding) p317~
	// 부모 클래스의 메소드를 자식 클래스가 다시 수정해서 사요앟는 것
	// 부모 메소드와 동일한 시그니처를 가져야 함(리턴 타입, 메소드 이름, 매개 변수 목록이 동일해야 함)
	// 접근 제한을 더 강하게 정의할 수 없음(부모 클래스의 메소드가 public일 때, 자식 클래스의 메소드가 private이나 default일 수 없음)
	
	// 원 면적 구하기
	// 부모 클래스의 계산식을 자식 클래스가 수정하여 사용해서 좀 더 정밀한 결과를 도출해 낼 것임
	
	// 메소드
	double circleArea(double r) {
		System.out.println("Calculator의 메소드 실행");
		return 3.1459*r*r;
	}

	
}
