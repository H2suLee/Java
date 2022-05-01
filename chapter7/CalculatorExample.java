package chapter7;

public class CalculatorExample {

	public static void main(String[] args) {

		Calculator circleArea2 = new Calculator();
		System.out.println("원면적 : " + circleArea2.circleArea(10));
		
		Computer circleArea = new Computer();
		System.out.println("원면적 : " + circleArea.circleArea(10));

	}

}
