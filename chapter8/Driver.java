package chapter8;

public class Driver {
	
	// 메소드
	public void drive(Vehicle vehicle) { // 매개 변수에 버스 객체도, 택시 객체도 들어갈 수 있음
		if(vehicle instanceof Bus) { // vehicle 매개 변수가 참조하는 객체가 Bus 인지 조사
			Bus bus = (Bus) vehicle; // Bus 객체일 경우 안전하게 강제 타입 변환
			bus.checkFare(); // Bus 객체일 경우에만 checkfare 메소드 실행
		}
		vehicle.run(); //
	}
		
}
