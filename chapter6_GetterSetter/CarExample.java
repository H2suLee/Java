package chapter6_GetterSetter;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setSpeed(-50);
		System.out.println("현재 속도 : " + myCar.getSpeed());
		
		myCar.setSpeed(60);
		System.out.println("현재 속도 : " + myCar.getSpeed());
		
		if(!myCar.isStop()) { // isStop의 return값이 false일 경우, 
			myCar.setStop(true); // setStop()를 호출에서 stop필드를 true로, speed를 0으로 변경
		}
		
		System.out.println("현재 속도 : " + myCar.getSpeed());
	}

}
