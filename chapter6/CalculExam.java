package chapter6;

public class CalculExam {
	public static void main(String[] args) {
		Calculator myCal = new Calculator();

		myCal.powerOn();

		myCal.div(5, 10);
		int result = myCal.plus(17, 36);

		System.out.println(myCal.div(5, 10));
		System.out.println(result);

		byte x = 10;
		byte y = 4;
		System.out.println(myCal.div(x, y));
		
		myCal.execute();
		
		myCal.powerOff();

	}
}
