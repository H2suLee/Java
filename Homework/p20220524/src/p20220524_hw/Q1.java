package p20220524_hw;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		if (x > 0 && y > 0) {
			System.out.println("제1사분면");
		}

		else if (x < 0 && y > 0) {
			System.out.println("제2사분면");
		}

		else if (x < 0 && y < 0) {
			System.out.println("제3사분면");
		}

		else if (x > 0 && y < 0) {
			System.out.println("제4사분면");
		}
	}
}
