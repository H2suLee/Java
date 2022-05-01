package chapter7;

public class CellPhoneExam {
	public static void main(String[] args) {
		// Dmb 객체 생성
		
		DmbPhone phone = new DmbPhone("모토로라", "black",20); 
		// 폰 모델과 색상은 부모 클래스에서 선언한 건데 자식 클래스에서 상속 받았기 때문에 사용 가능 
		
		phone.powerOn();
		phone.bell();
		phone.sendVoice("여보세요?");
		phone.receiveVoice("안녕하세요~ 지금 통화 가능하세요?");
		phone.sendVoice("네, 가능합니다.");
		phone.hangUp();
		phone.turnOnDmb();
		phone.changeChannel(15);
		phone.turnOffDmb();
		phone.powerOff();
		
		// turnOnDmb, changeChannel, turnOffDmb 메소드 제외하면 다 부모 클래스에서 선언된 메소드인데 자식 클래스로서 상속 받았기 때문에 사용 가능
	}
}
