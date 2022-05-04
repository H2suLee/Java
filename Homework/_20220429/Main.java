package _20220429;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;

		Calculator.printCalType(); // 메소드가 static으로 선언되어서 변수 선언 없이 바로 호출 가능
		int selected = Integer.parseInt(sc.next());
		Calculator cal = Calculator.getCalType(selected);

		while (run) {
			cal.printMenu();
			String menu = sc.next();
			switch (menu) {
			case "i":
			case "I":
				System.out.println("입력 값 >>");
				int num = Integer.parseInt(sc.next());
				cal.setInputNum(num);
				break;
			case "p":
			case "P":
				cal.print();
				break;
			case "D":
			case "d":
				cal.delete();
				break;
			case "+":
				cal.plus();
				break;
			case "-":
				cal.subtract();
				break;
			case "*":
				cal.multiply();
				break;
			case "/":
				cal.division();
				break;
			case "%":
				cal.remain();
				break;
			case "0":
				cal.delete();
				break;
			case "Q":
			case "q":
				run = false;
				sc.close();
				break;
			default:
				System.out.println("메뉴를 잘못 선택하셨습니다.");
			}
		}
		
	}
}
