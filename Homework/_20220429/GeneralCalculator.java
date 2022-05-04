package _20220429;

public class GeneralCalculator extends Calculator {

	protected double[] numList; // 입력받은 숫자 저장하는 배열
	protected int numCount; // 입력받은 숫자 저장하는 배열
	
	@Override
	public void init() {
		this.numCount = 0;
		this.numList = new double[2];
	}

	@Override
	public void setInputNum(double num) {
		try {
		this.numList[numCount++] = num;
		} catch(Exception e) { // ArrayoutofBounds
			System.out.println("숫자는 최대 두 개까지 입력 가능합니다.");
			numCount--;
		}		
	}

	@Override
	public void print() { // 아무것도 입력 안 했을 때 print 누르면? 오류는 안 나고 for문은 그냥 실행 안 되는 거겠지 
		System.out.println("현재까지 입력된 숫자 : ");
		for(int i = 0; i <= numCount; i++) {
			System.out.println(numList[i] + " ");
		}
		System.out.println();
		
	}
	@Override
	public void plus() {
		if(check()) {
			System.out.printf("+ : %.1f\n", (numList[0] + numList[1]));
		}
	}

	@Override
	public void subtract() {
		if(check()) {
			System.out.printf("- : %.1f\n", (numList[0] - numList[1]));
		}
		
	}

	@Override
	public void multiply() {
		if(check()) {
			System.out.printf("* : %.1f\n", (numList[0] * numList[1]));
		}
	}

	@Override
	public void division() {
		if(check()) {
			System.out.printf("/ : %.1f\n", (numList[0] / numList[1]));
		}
		
	}

	@Override
	public void remain() {
		if(check()) {
			System.out.printf("% : %.1f\n", (numList[0] % numList[1]));
		}
	}

	@Override
	public void delete() {
		try {
		this.numList[numCount--]= 0;
		} catch(Exception e) { // ArrayoutofBounds
			System.out.println("더이상 삭제할 숫자가 없습니다.");
			init(); // numCount++로 대체 가능?
		}
	}
	
	public boolean check() {
		boolean result = false;
		if(numCount == numList.length) { 
			result = true; // check()가 true여야 연산 메소드(+,-,/,*,%) 실행 가능하도록
		} else {
			System.out.println("숫자를 더 입력해 주세요");
		}
		return result;
	}
	
	

}
