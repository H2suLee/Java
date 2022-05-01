package chapter7;

public class AirplaneExample {

	public static void main(String[] args) {
		SupersonicAirplane plane1 = new SupersonicAirplane();
		plane1.takeOff();
		plane1.fly(); // flymode가 NORMAL로 초기화 된 상태이므로 일반비행합니다. 출력
		plane1.flymode = 2; // 필드에 직접 값을 지정하여 flymode 타입 변경
		plane1.fly();
		plane1.flymode = SupersonicAirplane.NORMAL; // 이런 식으로 상수값 호출 가능함. SupersonicAirplane 클래스의 필드 호출
		plane1.fly();
		plane1.flymode = SupersonicAirplane.SUPERSONIC;
		plane1.fly();
		plane1.land();

	}

}
