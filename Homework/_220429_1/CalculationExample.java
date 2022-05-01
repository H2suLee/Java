package _220429_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculationExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean run = true;

		Calculator.printCalType(); // 계산기 종류를 선택하기 위해 메뉴출력
		int selected = sc.nextInt();
		Calculator cal = Calculator.getCalType(selected); // 선택된 계산기를 반환

		while (run && cal != null) {
			cal.printMenu(); // 계산기 메뉴를 출력
			String menu = sc.next();
			
			 
			switch (menu) {
			
			case "I":
			case "i":
				try {
				System.out.println("입력 값>>");
				double num = sc.nextDouble();
				cal.setInputNum(num);
				break;
				} catch(InputMismatchException e) {
					System.out.println("숫자를 입력해 주세요");
					continue;
				}
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
				System.out.println("저장된 값을 초기화했습니다.");
				break;
			case "Q":
			case "q":
				run = false;
				System.out.println("프로그램을 종료하겠습니다.");
				break;
			default:
				System.out.println("메뉴를 잘못 선택하였습니다.");
			}
		}

		sc.close();
	}

}
