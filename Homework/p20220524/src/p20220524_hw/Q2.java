package p20220524_hw;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int year = sc.nextInt();
		if (year % 4 == 0) {
			if (year % 100 != 0) {
				System.out.println("윤년입니다.");
			} else if (year % 400 == 0) {
				System.out.println("윤년입니다.");
			} else {
				System.out.println("윤년이 아닙니다.");
			}
		}
	}
}
