package chapter6;

import java.util.Scanner;

public class BankAccountMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean run = true;

		BankAccount ac1 = new BankAccount("1547-6546", "홍길동", 10000);
		while (run) {

			System.out.println("============================================");
			System.out.println("1. 예금, 2. 출금, 3. 잔액 확인, 4. 종료");
			System.out.println("선택 > ");
			int select = Integer.parseInt(sc.nextLine());

			switch (select) {
			case 1:
				System.out.println("예금액 입력 > ");
				int plus = Integer.parseInt(sc.nextLine());
				ac1.deposit(plus);
				break;
			case 2:
				System.out.println("출금액 입력 > ");
				int minus = Integer.parseInt(sc.nextLine());
				ac1.withdraw(minus);
				break;
			case 3:
				ac1.checkBalance();
				break;
			case 4:
				System.out.println("프로그램 종료");
				run = false;
				break;

			}
		}
	}
}
