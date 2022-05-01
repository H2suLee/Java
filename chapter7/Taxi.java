package chapter7;

// 부모의 run() 메소드 재정의

public class Taxi extends Vehicle {
	
	@Override
	public void run(){
		System.out.println("택시가 달립니다.");
	}

}
