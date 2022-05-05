package _220503_Again;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Payment payment = null;
		
		System.out.println("전월 실적 >>");
		int record = Integer.parseInt(sc.next());
		Member member = Member.gatMembership(record);
		member.showMemberInfo();

		if (record > Member.GRADE_STANDARD) {
			payment = new VIPCard();
		} else {
			payment = new GreenCard();
		}

		System.out.println("==== 등급에 따른 카드 사용시 결제 예상 금액 ====");
		System.out.println("사용할 금액 >>");
		int price = Integer.parseInt(sc.next());
		System.out.println("결제 방법: 1. 오프라인, 2. 온라인, 3. 간편결제");
		int menu = sc.nextInt();
		int result = 0;
		switch (menu) {
		case 1:
			result = payment.offline(price);
			break;
		case 2:
			result = payment.online(price);
			break;
		case 3:
			result = payment.simple(price);
			break;
		}
		System.out.println("결제 예상 금액: " + result);
		payment.showCardInfo();

	}

}
