package chapter5;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		int[] scores = null;
		int sum = 0;
		
		while(run) {
		System.out.println("--------------------------------");
		System.out.println("1. 학생 수, 2. 점수 입력, 3. 점수리스트, 4. 분석, 5. 종료");
		System.out.println("--------------------------------");
		System.out.println("선택 >");
		int select = sc.nextInt();
		
		if(select == 1) {
			System.out.println("학생 수 >");
			int stud = sc.nextInt();
			scores = new int[stud];
		}
		if(select == 2) {
			for(int i = 0; i<scores.length; i++) {
				System.out.println("scores [" + i + "] > ");
				int score1 = sc.nextInt();
				scores[i] = score1;
				sum += scores[i];		
			}
		}
		if(select == 3) {
			for(int i = 0; i<scores.length; i++) {
				System.out.println("scores [" + i + "] > " + scores[i]);
			}
		}
		if(select == 4) {
			int max = 0;
			int min = scores[0];
			for(int i = 0; i < scores.length; i++) {
				if(max < scores[i]) {
					max = scores[i];
				}
				if(min>scores[i]) {
					min = scores[i];
				}
			}
			System.out.println("총점은 " + sum + "점입니다.");
			System.out.println("평균은 " + (double)(sum/scores.length) + "점입니다.");
			System.out.println("최고점은 " + max + "점입니다.");
			System.out.println("최저점은 " + min + "점입니다.");
		}
		if(select ==5) {
			System.out.println("프로그램 종료");
			run = false;
		}
		
		
		}
		
		
		
	}

}
