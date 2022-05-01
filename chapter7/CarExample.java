package chapter7;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car(); // Car 객체 생성
		
		for(int i = 1; i<=5; i++) {
			switch(car.run()) {
			case 1:
				System.out.println("앞왼쪽 HankookTire로 교체");
				car.frontLeftTire = new HankookTire("앞왼쪽", 15); // 필드 자동 타입 변환
				break;
			case 2:
				System.out.println("앞오른쪽 KumhoTire로 교체");
				car.frontRightTire = new HankookTire("앞오른쪽", 15);
				break;
			
			case 3:
				System.out.println("뒤왼쪽 HankookTire로 교체");
				car.backLeftTire = new HankookTire("뒤왼쪽", 15);
				break;
			case 4:
				System.out.println("뒤오른쪽 KumhoTire로 교체");
				car.backRightTire = new HankookTire("뒤오른쪽", 15);
				
				break;
			
			}
			System.out.println("=======================================");
		}
	
	}
	
}
