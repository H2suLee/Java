package _220429_1_MeLastTry;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		Calculator cal = null;
		boolean run = true;
		
		Calculator.printCalType();
		int selected = Integer.parseInt(sc.next());
		Calculator cal = Calculator.getCalType(selected);
		
		while(run && cal != null) {
			cal.printMenu();
			String menu = sc.next();
			switch(menu) {
			case "I":
			case "i":
				System.out.println("입력 값 >>");
				try {
				double num = Double.parseDouble(sc.next());
				cal.setInputNum(num);
				} catch(Exception e) { //inputmismatch
					System.out.println("숫자를 입력해 주세요");
				}
				break;
			case "P":
			case "p":
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
				cal.init();
				break;
			case "Q":
			case "q":
				System.out.println("프로그램을 종료합니다.");
				run = false;
				sc.close();
				break;
			default: System.out.println("메뉴를 잘못 선택하셨습니다.");
				break;
			}
		}

	}
}
