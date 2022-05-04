package _220429_1_MeAgain;

public abstract class Calculator {
	
	// 필드
	protected double[] numList; // 입력받은 숫자 저장하는 배열
	protected int numCount; // 입력받은 숫자 갯수
	
	// 생성자
	protected Calculator() {
		init(); // 생성에서 초기화 메소드 호출
	}
	
	// 메소드
	// 계산기 옵션 프린트 메소드
	public static void printCalType() {
		System.out.println("=========================");
		System.out.println(" 1.일반 계산기 | 2.공학 계산기 ");
		System.out.println("=========================");
	}
	// 계산기 선택 메소드
	public static Calculator getCalType(int selected) { // 리턴 타입이 클래스
		Calculator cal = null;
		switch(selected) {
		case 1:
			cal = new GeneralCalculator(); // 다형성
			break;
//		case 2: // 공학 계산기는 안 할 것이므로 생략	
		default:
			System.out.println("계산기 종류를 잘못 선택하셨습니다."); // 1, 2 이외의 값을 입력한 경우
		}
		return cal;
	}
	
	// 메뉴 출력 메소드
	public void printMenu() {
		System.out.println("=======================================");
		System.out.println(" I | P | D | + | - | * | / | % | 0 | Q ");
		System.out.println("=======================================");
	}
	
	// 값 초기화
	public abstract void init();
	// 값 입력받기
	public abstract void setInputNum(double num);
	// 출력 기능
	public abstract void print();
	// 더하기
	public abstract void plus();
	//빼기
	public abstract void subtract();
	//곱하기
	public abstract void multiply();
	//나누기
	public abstract void division();
	//나머지
	public abstract void remain();
	//지우기
	public abstract void delete();

}
