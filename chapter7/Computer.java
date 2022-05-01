package chapter7;

public class Computer extends Calculator {

	@Override
	double circleArea(double r) {
		System.out.println("Computer의 메소드 실행");
		return Math.PI * r * r;
	}

}
