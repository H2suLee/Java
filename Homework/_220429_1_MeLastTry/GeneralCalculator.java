package _220429_1_MeLastTry;

public class GeneralCalculator extends Calculator {

	protected double[] numList; // 입력받은 숫자 저장하는 배열
	protected int numCount; // 입력받은 숫자 갯수

	// 생성자 꼭 필요?

	@Override
	public void init() {
		this.numCount = 0;
		this.numList = new double[2]; // 여기도 0.0이 뜬다..
	}

	@Override
	public void setInputNum(double num) {
		try {
			numList[numCount++] = num;
		} catch (ArrayIndexOutOfBoundsException e) { // 숫자를 3개 이상 입력하려고 했을 경우
			System.out.println("숫자는 두 개만 입력 가능합니다.");
			numCount--; //
		}
	}

	@Override
	public void print() {
		System.out.println("현재 입력된 숫자 : "); //
		for (int i = 0; i < numList.length; i++) { // 등호 주의,
			System.out.print(this.numList[i] + "  ");
		}
		System.out.println();

	}

	// 연산식을 수행하려면 값 두 개가 무조건 확보되어야 함.
	// 값 두 개가 확보되었으면 true를 리턴하는 메소드
	// 각 연산 메소드가 check() 메소드가 true일 때만 실행되도록 호출
	public boolean check() {
		boolean result = false;
		if (this.numCount == this.numList.length) {
			result = true;
		} else {
			System.out.println("숫자를 더 입력해 주세요");
		}
		return result;
	}

	@Override
	public void plus() {
		if (check()) {
			System.out.printf("+ : %.2f\n", (numList[0] + numList[1]));
		} 
	}

	@Override
	public void subtract() {
		if (check()) {
			System.out.printf("- : %.2f\n", (numList[0] - numList[1]));
		} 
	}

	@Override
	public void multiply() {
		if (check()) {
			System.out.printf("* : %.2f\n", (numList[0] * numList[1]));
		} 
	}

	@Override
	public void division() {
		if (check()) {
			System.out.printf("/ : %.2f\n", (numList[0] / numList[1]));
		} 
	}

	@Override
	public void remain() {
		if (check()) {
			System.out.printf("% : %.2f\n", (numList[0] % numList[1]));
		} 
	}

	@Override
	public void delete() {
		try {
		this.numList[--this.numCount] = 0; // print()하면 0이 아니라 빈칸이 떠야 함
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("더 이상 삭제할 숫자가 없습니다.");
			numCount++;
//			init();
			
		}
	}

}
