package chapter6;

// p256
// 리턴문 활용 
public class Gas {

	// 필드
	int gas;

	// 생성자

	// 메소드

	// 1. 리턴 값이 없는 메소드로 매개 값을 받아서 gas 필드 값을 변경
	void setGas(int gas) {
		this.gas = gas;
	}

	// 2.
	// 리턴 값이 boolean인 메소드로, gas 필드 값이 0이면 false를, 0이 아니면 true를 리턴
	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}

	// 3.
	void run() {
		while (true) {
			if (this.gas > 0) {
				System.out.println("달립니다. gas 잔량 : " + gas);
				gas -= 1;

			} else {
				System.out.println("멈춥니다. gas 잔량 : " + gas);
				return; // void 메소드의 return 은 메소드를 강제 종료하겠다는 뜻
			}
		}
	}

}
