package chpater11_01;

public class SmartphoneExample {
	public static void main(String[] args) {
		Smartphone myPhone = new Smartphone("구글", "안드로이드");
		
		String strObj = myPhone.toString();
		System.out.println(strObj); // 구글, 안드로이드
		
		// 매개값이 기본타입(byte, int 등)이면 해당 값을 그대로 출력
		// 만약 매개값으로 객체를 주면 객체의 toString 메소드를 호출해서 리턴값을 받아 출력
		System.out.println(myPhone); // 구글, 안드로이드
	}
}
