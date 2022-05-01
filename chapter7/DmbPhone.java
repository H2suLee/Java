package chapter7;

public class DmbPhone extends CellPhone {
	
	// 필드
	int channel;

	// 생성자
	// 부모 클래스엔 기본 생성자가 자동으로 만들어져 있음
//	public CellPhone() {
//		
//	}
	
	public DmbPhone(String model, String color, int channel) {
		super();
		// 그래서 super 다음에 () < 빈 괄호가 있음. 
		// 만약 부모 클래스에서 초기값을 입력받는 생성자가 명시되었다면, 자식 클래스 생성자 명시 시 super 괄호 안에 부모 자식 필드에 맞는 매개값을 받을 자리를 만들어야 함
		// 자식클래스라면 이 부분은 자바가 항상 자동으로 생성해 줌. 부모 클래스와 상속 관계에 있다는 것을 컴퓨터가 인식하게 해 주기 위해!
		this.channel = channel;
	}
	
	
	// 메소드
	void turnOnDmb() {
		System.out.println("채널 "+ this.channel + "에서 방송 수신을 시작합니다.");
	}
	
	void changeChannel(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}
	
	void turnOffDmb() {
		System.out.println("Dmb를 끕니다.");
	}
	

}
