package _220502_1_Teachers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TwentyHills {

	private String[] game = { "Orange", "Game", "Phone", "Smart" }; //
	private String strAnswer; // game 배열에서 랜덤으로 뽑은 문자열 담는 변수
	private List<Character> input; // 2번 메뉴에서 쓸 박스

	// 생성자

	public TwentyHills() {
		init();
	}

	// 메소드

	// 랜덤 값 얻기
	private String random() {
		return game[(int) (Math.random() * 4)].toLowerCase();
	}
	// 초기화

	public void init() {
		strAnswer = random();
		input = new ArrayList<Character>();
	}

	// 1번 메뉴_문자 집어넣기
	public String inputData() {
		System.out.println("입력 값 >> ");
		return new Scanner(System.in).next().toLowerCase(); // 스캐너 이렇게 한 줄로

	}

	// 1번 메뉴_문자 저장하기
	public void setData() {
		// 현재까지 입력된 문자들의 목록을 출력
		printData();
		// 값 입력 받기 전 조건: 입력 횟수가 문자열 사이즈를 초과하면 입력 받을 수 없게
		if (input.size() == strAnswer.length()) {
			System.out.println("문자열을 구성하는 문자를 다 입력하셨습니다.");
		} else {
			// 값 입력 받기
			String inputStr = inputData();
			if (strAnswer.indexOf(inputStr.charAt(0)) != -1) {
				System.out.println("문자열을 구성하는 문자입니다.");
				input.add(inputStr.charAt(0));
			} else {
				System.out.println("문자열을 구성하는 문자가 아닙니다.");
			}

		}

	}

	// 3번 메뉴_입력한 문자 출력하기
	public void printData() {
		System.out.println("현재까지 확인된 문자열의 문자들은 다음과 같습니다.");
		for (char data : input) {
			System.out.print(data + " ");
		}
		System.out.println();
	}

	// 4번 메뉴_정답인 지 아닌 지
	public void getAnswer() {
		printData();
		String inputStr = inputData();

		if (inputStr.equals(strAnswer)) {
			System.out.println("정답입니다.");
		} else {
			printOX(inputStr);
		}
	}

	private void printOX(String inputStr) {
		if (strAnswer.length() == inputStr.length()) {
			for (int i = 0; i < strAnswer.length(); i++) {
				if (strAnswer.charAt(i) == inputStr.charAt(i)) {
					System.out.print("O ");
				} else {
					System.out.print("X ");
				}
			}
			System.out.println();
		} else {
			System.out.println("입력된 문자열의 길이가 정답과 다릅니다.");
		}

	}

}
