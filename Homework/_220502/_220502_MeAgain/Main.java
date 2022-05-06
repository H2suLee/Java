package _220502_MeAgain;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		StringGame game = new StringGame();

		Scanner sc = new Scanner(System.in);
		int num = 0;
		boolean run = true;
		game.getRandomString();

		while (run) {
			game.printMenu();
			try {
			num = sc.nextInt();
			} catch(NumberFormatException e) {
				System.out.println("메뉴를 잘못 입력하셨습니다.");
			}
			game.selectMenu(num);
			if (num == 5) {
				run = false;
				System.out.println("프로그램 종료");
				sc.close();
			}
		}
	}
}
