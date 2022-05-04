package _20220429;

public abstract class Calculator {

	protected double[] numList; // 입력받은 숫자 저장하는 배열
	protected int numCount; // 입력받은 숫자 저장하는 배열

	// 생성자
	protected Calculator() {
		init(); // 생성자 안에 초기화 기능을 수행하는 메소드 호출
	}

	// 메소드1. 계산기 메뉴 출력
	public static void printCalType() {
		System.out.println("=========================");
		System.out.println(" 1.일반 계산기 | 2.공학 계산기 ");
		System.out.println("=========================");
	}

	// 메소드2. 계산기 메뉴 선택받고 계산기 설정하는 메소드
	public static Calculator getCalType(int selected) { // 리턴값으로 클래스 지정
		Calculator cal = null;
		switch (selected) {
		case 1:
			cal = new GeneralCalculator();
			break;
		case 2: // EngineeringCal은 안 할 예정
			break;
		default:
			System.out.println("메뉴를 잘못 선택하셨습니다.");
			break;
		}
		return cal;
	}

	// 메소드3. 계산기 세부 메뉴 출력
	public void printMenu() {
		System.out.println("=======================================");
		System.out.println(" I | P | D | + | - | * | / | % | 0 | Q ");
		System.out.println("=======================================");
	}

	// 값 초기화
	public abstract void init();

	// 값 입력받기
	public abstract void setInputNum(double num);

	// 출력기능
	public abstract void print();

	// 더하기
	public abstract void plus();

	// 빼기
	public abstract void subtract();

	// 곱하기
	public abstract void multiply();

	// 나누기
	public abstract void division();

	// 나머지
	public abstract void remain();

	// 지우기
	public abstract void delete();

}
