package chapter7;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		Vehicle vehicle = new Vehicle();
		driver.drive(vehicle); // 일반적인 메소드 호출 // 차량이 달립니다.
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		driver.drive(bus); // 매개값으로 Bus객체 제공, Vehicle 부모 클래스가 가진 자식은 다 호출할 수 있음, 메소드의 다향성, 자동 타입 변환
		driver.drive(taxi); // 매개값으로 Taxi객체 제공,

		vehicle = new Bus(); // 자동 타입 변환

		driver.drive(vehicle); // 버스가 달립니다.
		

	}
	
}
