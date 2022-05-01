package _220426_3;

import java.util.Scanner;

import _220426_1.ArcadeGame;
import _220426_1.RPGgame;

public class RandomGameMain {

	public static void main(String[] args) {

		// 게임 선택
		RandomGame game;
		int random = (int) (Math.random() * 2);
		if (random == 0) {
			game = new RandomGame(new RPGgame());
		} else {
			game = new RandomGame(new ArcadeGame());
		}

		// 메뉴 구성
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		int choice;

		while (run) {
			System.out.println(
					"=============================================================================================");
			System.out.println(
					"<< 1.LeftUP | 2.LeftDown | 3.RightUp | 4.RightDown | 5.ModeChange | 0.GameChange | 9.EXIT >>");
			System.out.println(
					"=============================================================================================");
			System.out.println("choice >> ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				game.keypad.leftUpButton();
				break;
			case 2:
				game.keypad.leftDownButton();
				break;
			case 3:
				game.keypad.rightUpButton();
				break;
			case 4:
				game.keypad.rightDownButton();
				break;
			case 5:
				game.keypad.changeMode();
				break;
			case 0: // GameChange
				if(random == 0 ) {
					game = new RandomGame(new ArcadeGame());
				} else if(random ==1) {
					game = new RandomGame(new RPGgame());
				}
				break;
			case 9:
				System.out.println("프로그램 종료");
				run = false;
				break;
			}

		}

	}
}
