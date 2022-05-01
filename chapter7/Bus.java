package chapter7;

//부모의 run() 메소드 재정의


public class Bus extends Vehicle {
	@Override
	public void run(){
		System.out.println("버스가 달립니다.");
	}

}
