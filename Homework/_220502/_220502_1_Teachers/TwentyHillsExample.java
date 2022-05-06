package _220502_1_Teachers;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TwentyHillsExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean run = true;
		TwentyHills game = new TwentyHills();
//		System.out.println(game.strAnswer);
		while (run) {
			System.out.println("---------------------------------------------");
			System.out.println("1.문자하나 | 2.단어 | 3.입력내역 | 4.새 게임 | 5.종료 ");
			System.out.println("---------------------------------------------");
			System.out.println("선택 >>");
			int menu = Integer.parseInt(sc.next()); // nextInt 써보기, 나 nextInt썼을때 먼가 이상했었음..

			switch (menu) {
			case 1:
				game.setData();
				break;
			case 2:
				game.getAnswer();
				;
				break;
			case 3:
				game.printData();
				break;
			case 4:
				game.init();
				break;
			case 5:
				run = false;
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("메뉴를 잘못 입력하셨습니다.");

			}
		}
	}

}
