package chapter6;

import java.util.Scanner;

public class ShoppingMallMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주문 번호 입력 > ");
		int orderNo = Integer.parseInt(sc.nextLine());
		
		System.out.println("주문자 ID 입력 > ");
		String userID = sc.nextLine();
		
		System.out.println("주문자 이름 입력 > ");
		String userName = sc.nextLine();
		
		System.out.println("상품 번호 입력 > ");
		int goodsNo = Integer.parseInt(sc.nextLine());
		
		System.out.println("주문자 주소 입력 > ");
		String addr = sc.nextLine();
		
		
		ShoppingMall sp = new ShoppingMall(orderNo, userID, userName, goodsNo, addr);
		
		sp.getInfo();
		
	}

}
