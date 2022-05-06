package _220502_MeAgain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// 대소문자 구분 안 하는 거 보강
// count 변수 안 써도 됨;

public class StringGame {
	Scanner sc = new Scanner(System.in);
	List<String> game;
	List<String> input = new ArrayList<String>();
//	int count = 0;

	// 메뉴 출력 메소드
	public void printMenu() {
		System.out.println("---------------------------------------------");
		System.out.println("1.문자하나 | 2.단어 | 3.입력내역 | 4.새 게임 | 5.종료 ");
		System.out.println("---------------------------------------------");
		System.out.println("선택 >>");
	}

	// 랜덤 문자열 도출 메소드

	public void getRandomString() {
		int random = (int) (Math.random() * 4) + 1;

		switch (random) {
		case 1:
			game = new ArrayList<String>();
			game.add("O"); // toLowercase?
			game.add("r");
			game.add("a");
			game.add("n");
			game.add("g");
			game.add("e");
			break;
		case 2:
			game = new ArrayList<String>();
			game.add("G");
			game.add("a");
			game.add("m");
			game.add("e");
			break;
		case 3:
			game = new ArrayList<String>();
			game.add("P");
			game.add("h");
			game.add("o");
			game.add("n");
			game.add("e");
			break;
		case 4:
			game = new ArrayList<String>();
			game.add("S");
			game.add("m");
			game.add("a");
			game.add("r");
			game.add("t");
		}
		System.out.println(ListToString());
	}

	public String ListToString() {
		// list.toStirng()으로 하면 [] 안에 출력되어서 StringBuilder 이용
		StringBuilder sb = new StringBuilder();
		for (String item : game) {
			sb.append(item);
		}
		String item = sb.toString();
		return item;
	}

	// 메뉴 선택 메소드
	public void selectMenu(int menu) {
		if (menu == 1) {
			inputString();
		} else if (menu == 2) {
			compareString();
		} else if (menu == 3) {
			printString();
		} else if (menu == 4) {
			init();
		}
	}

	// 게임 초기화 메소드
	private void init() {
		getRandomString();
//		count = 0;
		input = new ArrayList<String>();
	}

	// 문자값 출력 메소드 (3)
	private void printString() {
		System.out.println("현재까지 확인된 문자열의 문자들은 다음과 같습니다.");
		for (int i = 0; i < input.size(); i++) {
			System.out.print(input.get(i) + " ");
		}
		System.out.println();
	}

	// 입력한 문자열 비교 메소드 (2)
	private void compareString() {
		printString();
		String word = sc.nextLine();

//		if (word.equals(String.valueOf(game.toString()))) { 
		// Game과 [G, a, m, e]..
		// Arrays.

		if (word.equals(String.valueOf(ListToString()))) {
			System.out.println("정답입니다.");
		} else {
			for (int i = 0; i < game.size(); i++) {
				if (String.valueOf(word.charAt(i)).equals(game.get(i))) {
					System.out.print("O" + " ");
				} else {
					System.out.print("X" + " ");
				}
			}
			System.out.println();
		}
	}

	// 문자값 저장 메소드 (1)
	private void inputString() {
		printString();

		if (input.size() >= game.size()) {
			System.out.println("문자열을 구성하는 문자를 다 입력하셨습니다.");
		} else {
			System.out.println("입력 값 >>");
			String str = sc.nextLine();
			if (game.contains(str)) {
//				++count;
				System.out.println("문자열을 구성하는 문자입니다.");
				input.add(str);
			} else {
				System.out.println("문자열을 구성하는 문자가 아닙니다.");
			}
		}
		System.out.println("input size : " + input.size());
	}

}
