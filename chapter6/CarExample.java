package chapter6;

// 외부 클래스에서 Car 필드값 읽기와 변경

public class CarExample {
	public static void main(String[] args) {
		// 객체 생성
		Car myCar = new Car();
		
		// 필드값 읽기, 변수.필드명 (도트 연산자를 통해 필드 호출)
		System.out.println(myCar.color);
		System.out.println(myCar.company);
		System.out.println(myCar.maxSpeed);
		System.out.println(myCar.model);
		System.out.println(myCar.price); // 필드 값이 선언 시 설정되지 않아 디폴드 값 출력
		System.out.println("속도 : " + myCar.speed); // 필드 값이 선언 시 설정되지 않아 디폴드 값 출력
		
		// 필드값 변경
		myCar.speed = 60;
		System.out.println("수정된 속도 : " + myCar.speed);
		
		// 생성자 오버로딩 test 
		// 매개 변수를 달리하는 생성자를 여러개 생성하는 것
		
		Car car1 = new Car();
		System.out.println("car1. company: " + car1.company);
		
		Car car2 = new Car("그랜저");
		System.out.println("car2. model: " + car2.model);
	
		Car car3 = new Car("그랜저", "white");
		System.out.println("car3. model: " + car3.model);
		System.out.println("car3. color: " + car3.color);
		
		Car car4 = new Car("벤츠", 180);
		System.out.println("car4. company: " + car4.company);
		System.out.println("car4. speed: " + car4.speed);
				
	}
}
