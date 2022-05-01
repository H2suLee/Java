package chapter8;

public class VehicleExample {
	
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
//		vehicle.checkfare(); // Vehicle 인터페이스에는 checkfare() 메소드가 없음
		
		Bus bus = (Bus) vehicle; // 강제 타입 변환
		
		bus.run();
		bus.checkFare();
	}

}
