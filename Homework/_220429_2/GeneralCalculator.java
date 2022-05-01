package _220429_2;

public class GeneralCalculator extends Calculator {

	protected double[] numList; // 입력받은 숫자 저장하는 배열
	protected double[] numList2;
	protected int numCount; // 입력받은 숫자 갯수

	@Override
	public void init() {

		numList = null;
		numList2 = null;
		this.numCount = 0;

	}

	@Override
	public void setInputNum(double num) {
		this.numCount++;
		switch (this.numCount) {
		case 0: // case 0이 필요한가?
			break;
		case 1:
			numList = new double[1];
			numList[0] = num;
			break;
		case 2:
			numList2 = new double[2];
			numList2[0] = numList[0]; // 배열 복사
			numList2[1] = num;
			break;
		default: // 세 번 입력하려고 한 경우
			System.out.println("숫자는 두 개만 입력 가능합니다.");
			this.numCount--;
			break;
		}

	}

	@Override
	public void print() {
		
		switch (this.numCount) {
		case 1:
			System.out.print("현재 입력된 숫자 : " + numList[0] + "\n");
			break;
		case 2:
			System.out.print("현재 입력된 숫자 : " + numList[0] + "\t" + numList2[1] + "\n");
			break;
		default: // delete 두 번 하고 print 눌렀을 때
			System.out.println("현재 입력된 숫자 :   ");
			break;
		}

	}

	@Override
	public void plus() {
		switch(this.numCount) {
		case 0: 
		case 1:
			System.out.println("숫자를 더 입력해 주세요.");
			break;
		case 2: 
			double plus = this.numList2[0]+this.numList2[1];
			System.out.println(plus);
			break;
		}

	}

	@Override
	public void subtract() {
		switch(this.numCount) {
		case 0: 
		case 1:
			System.out.println("숫자를 더 입력해 주세요.");
			break;
		case 2: 
			double minus = this.numList2[0]-this.numList2[1];
			System.out.println(minus);
			break;
		}

	}

	@Override
	public void multiply() {
		switch(this.numCount) {
		case 0: 
		case 1:
			System.out.println("숫자를 더 입력해 주세요.");
			break;
		case 2: 
			double multi = this.numList2[0]*this.numList2[1];
			System.out.println(multi);
			break;
		}

	}

	@Override
	public void division() {
		switch(this.numCount) {
		case 0: 
		case 1:
			System.out.println("숫자를 더 입력해 주세요.");
			break;
		case 2: 
			double div = this.numList2[0]/this.numList2[1];
			System.out.println(div);
			break;
		}

	}

	@Override
	public void remain() {
		switch(this.numCount) {
		case 0: 
		case 1:
			System.out.println("숫자를 더 입력해 주세요.");
			break;
		case 2: 
			double remain = this.numList2[0]%this.numList2[1];
			System.out.println(remain);
			break;
		}

	}

	@Override
	public void delete() {
		switch (this.numCount) {
		case 0:
			System.out.println("삭제 가능한 숫자가 없습니다.");
			break;
		case 1:
			numList = new double[1];
			numCount--;
			break;
		case 2:
			numList2 = new double[2];
			numList2[0] = numList[0]; // 배열 복사
			numCount--;
			break;
		}

	}

}
