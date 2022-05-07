package self.maven.p20220506.baseball_mine;

import java.util.Scanner;

public class Baseball {

	Scanner sc = new Scanner(System.in);
	int[] set = new int[3];
	int[] input = new int[3];
	int strike;
	int ball;

	private void setNum() {
		for (int i = 0; i < set.length; i++) {
			set[i] = (int) (Math.random() * 9) + 1;
			for (int j = 0; j < i; j++) {
				if (set[i] == set[j]) {
					i--;
					break;
				}
			}
		}
		for (int i : set) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	private void inputNum() {
		System.out.println("입력 >>");
		int inputNum = sc.nextInt();
		input[0] = inputNum;
		inputNum = sc.nextInt();
		input[1] = inputNum;
		inputNum = sc.nextInt();
		input[2] = inputNum;
	}

	private void judge() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (input[i] == set[j] && i == j) {
					strike++;
				} 
				else if (input[i] == set[j] && i != j) {
					ball++;
				}
			}
		}
		message(strike, ball);
		strike = 0;
		ball = 0;
	}

	private void message(int strike, int ball) {
		if (strike == 3) {
			System.out.println("정답");
			sc.close();
			System.exit(0);
		} else {
			System.out.println(strike + "strike " + ball + "ball");
		}
		strike = 0;
		ball = 0;
	}

	public void run() {
		setNum();
		boolean run = true;
		do {
			inputNum();
			judge();
		} while (true);
	}
}
