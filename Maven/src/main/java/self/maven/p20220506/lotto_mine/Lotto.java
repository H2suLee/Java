package self.maven.p20220506.lotto_mine;

import java.util.Arrays;
import java.util.Scanner;

public class Lotto {
	// 게임 수 입력받기
	// 1장에 maximum 다섯 개
	// 1장당 천원
	// 1장 사면 1000원입니다, 5장 사면 5000원입니다.
	// 숫자 오름차순으로 Arrays.sort(배열이름)
	// 메소드 호출 형태로 다시 해 보기
	Scanner sc = new Scanner(System.in);
	int[] lotto = new int[6];
	int price;

	// 게임 수 입력
	public void round() {
		System.out.println("몇 번 돌릴까요?");
		int count = Integer.parseInt(sc.next());
		numInput(count);
	}

	// 랜덤 숫자 여섯 개 도출
	private void numInput(int count) {
		price(count);
		boolean run = true;
		do {
			if (count == 0) {
				run = false;
				break;
			} else {

				for (int i = 0; i < lotto.length; i++) {
					lotto[i] = (int) (Math.random() * 45) + 1;
					for (int j = 0; j < i; j++) {
						if (lotto[i] == lotto[j]) {
							i--;
							;
						}
					}
				}
				numPrint();
				if (count % 5 == 1) {
					System.out.println("==========================");
				}
				count--;
			}
		} while (true);
	}

	// 입력 받은 숫자 출력
	private void numPrint() {
		Arrays.sort(lotto);
		for (int i : lotto) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	// 금액
	private void price(int count) {
		this.price = count * 1000;
		System.out.println("==========================");
		System.out.println("금액은 " + price + "원입니다.");
		System.out.println("==========================");
	}

}
