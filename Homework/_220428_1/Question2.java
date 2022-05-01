package _220428_1;

import java.util.Scanner;

// up & down 게임에서 숫자가 아닌 문자열을 입력 했을 경우 numformat 예외 처리하기

public class Question2 {

	public static void main(String[] args) {
		int answer = (int) (Math.random() * 100) + 1;
		System.out.println(answer);
		int input = 0;
		int count = 0;

		do {
			count++;
			Scanner sc = new Scanner(System.in);
			System.out.println("1부터 100까지의 수를 입력하세요.");
			try {
				input = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) { // catch문을 위로 이동할 경우 continue; 필요
				System.out.println("유효한 값을 입력하세요.");
				continue;
			}

			if (input > answer) {
				System.out.println("더 작은 값을 입력하세요");
			} else if (input < answer) {
				System.out.println("더 큰 값을 입력하세요");
			} else if (input == answer) {
				System.out.println(count + "번만에 맞히셨습니다.");
				break;
			}
		} while (true);
	}
}
