package chapter6;

// p227
// (라이브러리) 클래스 선언
// 필드 선언

public class Car {

	// 필드
	// Car 클래스 내부에서는 이 필드들을 자유롭게 활용할 수 있지만
	// 외부 클래스(ex. 실행용 클래스)에서 이 필드를 사용하려면 클래스로부터 객체를 생성해야 함

	String company = "현대자동차";
	String model = "그랜저";
	String color = "검정";
	int maxSpeed = 350;
	int speed; // 초기값이 설정되어 있지 않음. 실행용 클래스에서 호출하면 디폴드 값인 0이 반환될 것
	int price;

	// 생성자를 통해 값 변경 가능
//	public Car() {
//		speed=0;
//	}

	// 기본 생성자. 생략하면 java가 자동으로 생성해 줌
	public Car() {
		
	}

	// 생성자 선언. 객체를 다양한 값으로 초기화하기 위하여: 클래스(매개변수1, 매개변수2..){ }
	// 아래와 같이 생성하게 되면, 외부 클래스에서 Car myCar = new Car() << 는 못씀.
	// 기본 생성자보다 직접 명시된 선언자를 우선하기 때문
	// 따라서 외부 클래스에서는
	// Car myCar = new Car(매개변수1 값 저장, 매개변수2 값 저장..) << 이렇게 객체를 생성해야 함. 
	Car(String model, String color, int maxSpeed) {
	}
	
	// 생성자 오버로딩 p238~
	
	Car(String model){
		this.model =model;
	}
	
	Car(String model, String color){
		this.model = model;
		this.color = color;
	}
	
	Car(String company, int speed){
		this.company = company;
		this.speed = speed;
	}
	

	// 메소드를 통해서도 값 변경 가능
	void value() {
		speed = 10;
	}

}
