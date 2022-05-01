package chapter7;

// 클래스끼리도 자동 타입 변환이 가능
// 자식은 부모 타입으로 자동 타입 변환이 가능
// 부모 타입으로 자동 타입 변환된 이후에는 부모 클래스에 선언된 필드와 메소드만 접근이 가능
// 그러나 메소드가 자식 클래스에서 재정의 되었으면 자식 클래스의 메소드가 대신 호출 됨.

// Child child = new Child();
// Parent parent = child;
// =
// Parent parent = new Child();

// 부모 클래스 Tire, 자식 클래스 KumhoTire, HankookTire

public class Tire {

	// 필드
	// 최대 회전수, 누적 회전수, 타이어의 위치
	public int maxRotation;
	public int accumulatedRotation;
	public String location;

	// 생성자
	public Tire(String location, int maxRotation) {
		this.maxRotation = maxRotation;
		this.location = location;
	}

	// 메소드
	public boolean roll() {
		this.accumulatedRotation++;
		if (this.accumulatedRotation == this.maxRotation) {
			System.out.println(location+"펑크");
			return false;
		} else {
			System.out.println(location+"의 남은 회전 수 : " + (this.maxRotation - this.accumulatedRotation));
			return true;
		}
	}

}
