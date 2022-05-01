package _220429_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GeneralCalculator extends Calculator {
	Scanner sc = new Scanner(System.in);

	protected int numCount; // 입력받은 숫자 갯수
	protected double[] numList; // 입력받은 숫자 저장하는 배열
	protected double[] numList2;

	@Override
	public void init() {
		this.numList = null;
		this.numList2 = null;
		this.numCount = 0;
	}

	@Override
	public void setInputNum(double num) {
		// 숫자 두 개 이상 입력하면 예외 처리
		this.numCount++;

		switch (this.numCount) {
		case 1:
			numList = new double[1];
			this.numList[0] = num;
			break;
		case 2: // 배열 복사
			// 필드 선언 때 배열 크기를 지정하면 0이 자동으로 초기화되어서 값을 안 넣어도 계산이 됨 (0.0 + 0.0)
			// case문 안에 배열 크기를 지정하면.. for반복문으로는 값이 자꾸 초기화 되고.. 한 번에 두 개 값을 동시에 입력해야 할 것만 같은
			numList2 = new double[2];
			this.numList2[0] = this.numList[0];
			this.numList2[1] = num;
			break;
		default:
			System.out.println("숫자는 두 개만 입력 가능합니다.");
			this.numCount--;
			System.out.println(this.numCount);

		}
	}

	@Override
	public void print() {
		try {
			switch (this.numCount) {
			case 1:
				System.out.println("현재 입력된 숫자: " + this.numList[0]);
				break;
			case 2: // 배열 복사?
				System.out.println("현재 입력된 숫자: " + this.numList2[0] + " " + this.numList2[1]);
				break;
			default:
				System.out.println("현재 입력된 숫자: ");
			}
		} catch (NullPointerException e) {
			System.out.println("현재 입력된 숫자: ");
		}
	}

	@Override
	public void plus() {
		switch (this.numCount) {
		case 0:
		case 1:
			System.out.println("숫자를 더 입력해 주세요");
			break;
		case 2:

			double plus = this.numList2[0] + this.numList2[1];
			System.out.println(plus);

		}
	}

	@Override
	public void subtract() {
		try {
			double minus = this.numList2[0] - this.numList2[1];
			System.out.println(minus);
		} catch (Exception e) {
			System.out.println("숫자를 더 입력해 주세요");
		}

	}

	@Override
	public void multiply() {
		try {
			double multi = this.numList[0] * this.numList2[1];
			System.out.println(multi);
		} catch (Exception e) {
			System.out.println("숫자를 더 입력해 주세요");
		}

	}

	@Override
	public void division() {
		try {
			double div = this.numList[0] / this.numList2[1];
			System.out.println(div);
		} catch (Exception e) {
			System.out.println("숫자를 더 입력해 주세요");
		}
	}

	@Override
	public void remain() {
		try {
			double remain = this.numList[0] % this.numList2[1];
			System.out.println(remain);
		} catch (Exception e) {
			System.out.println("숫자를 더 입력해 주세요");
		}

	}

	@Override
	public void delete() {
		switch (this.numCount) {
		case 1:
			numList = new double[1];
			numCount--;
			break;
		case 2: // 배열 복사?

			numList2 = new double[2];
			this.numList2[0] = this.numList[0];
			numCount--;
			System.out.println(this.numList2[0]);
			break;
		}
		System.out.println(this.numCount);

	}

}
