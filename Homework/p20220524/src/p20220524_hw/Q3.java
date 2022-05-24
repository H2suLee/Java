package p20220524_hw;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String random = sc.next();

		switch (random) {
		case "가위":
			System.out.println("이기기 위해선 바위를 내야 합니다.");
			break;
		case "바위":
			System.out.println("이기기 위해선 보를 내야 합니다.");
			break;
		case "보":
			System.out.println("이기기 위해선 가위를 내야 합니다.");
			break;
		}
	}
}
