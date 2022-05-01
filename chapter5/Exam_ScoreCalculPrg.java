package chapter5;

import java.util.Scanner;

public class Exam_ScoreCalculPrg {

	public static void main(String[] args) {

		// p201.6
		// 다음은 키보드로부터 학생 수와 각 학생들의 점수를 입력받아서, 최고 점수 및 평균 점수를 구하는 프로그램입니다.

		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int studNum = 0;
		int[] scores = null;

		while (run) {
			System.out.println("--------------------------------------");
			System.out.println("1. 학생수, 2. 점수입력, 3. 점수리스트, 4. 분석, 5. 종료");
			System.out.println("--------------------------------------");
			System.out.println("선택 > ");

			int select = Integer.parseInt(sc.nextLine());

			if (select == 1) {
				System.out.println("학생수 > ");
				studNum = Integer.parseInt(sc.nextLine());
				scores = new int[studNum];
				System.out.println(scores.length + "명");

			}
			if (select == 2) {

				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "] > ");

					int score = Integer.parseInt(sc.nextLine());
					scores[i] = score;

				}
			}
			if (select == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "] > " + scores[i]);
				}
			}
			if (select == 4) {
				int max = 0;
				int sum = 0;
				for (int i = 0; i < scores.length; i++) {
					sum += scores[i];
					if (max < scores[i]) {
						max = scores[i];
					}
				}
				System.out.println("최고점수 : " + max);
				System.out.println("평균 점수 : " + (double) (sum / scores.length));

			}
			if (select == 5) {
				System.out.println("프로그램 종료");
				run = false;

			}

		}
	}

}
