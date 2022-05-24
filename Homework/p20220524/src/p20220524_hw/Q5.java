package p20220524_hw;

import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		for (int i = 1; i < b + 1; i++) {
			System.out.println(a + " x " + i + " = " + (a * i));
		}
	}
}
