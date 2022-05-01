package chapter6;

public class SpeedExam {
	public static void main(String[] args) {
		Speed myCar = new Speed();
		myCar.keyTurnOn();
		myCar.run();
		
		int nowSpeed = myCar.getSpeed();
		System.out.println("현재 속도: " + nowSpeed + "km/h");
	}

}
