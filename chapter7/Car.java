package chapter7;

public class Car {
	// 필드 // 네 개의 타이어 객체 생성하여 위치와 최대 회전수 초기화
	Tire frontLeftTire = new Tire("앞왼쪽", 2);
	Tire frontRightTire = new Tire("앞오른쪽", 3);
	Tire backLeftTire = new Tire("뒤왼쪽", 4);
	Tire backRightTire = new Tire("뒤오른쪽", 6); // 7번 roll 하면 펑크날 것
	
	// 메소드
	public int run() {
		System.out.println("자동차가 달립니다.");
		if(frontLeftTire.roll() == false) {
			stop();
			return 1;
		}
		if(frontRightTire.roll() == false) {
			stop();
			return 2;
		}
		if(backLeftTire.roll() == false) {
			stop();
			return 3;
		}
		if(backRightTire.roll() == false) {
			stop();
			return 4;
		}
		return 0;
	}
	
	public void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
	
	
	
		

}
