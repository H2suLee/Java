package p20220531_hw;

import java.util.Scanner;

public class Goods {
	Scanner sc = new Scanner(System.in);
	
	String name, maxName;
	int price, turn, maxPrice, sum;
	
	Goods[] arr;
	
	Goods(){
		
	}
		
	public Goods(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	void title() {
		System.out.println("1. 상품 수 | 2. 상품 및 가격 입력 | 3. 제품별 가격 | 4. 분석 | 5. 종료 ");
		System.out.println("------------------------------------------------------------");
	}
	
	void menu() {
		boolean run = false;
		do {
		title();
		int select = sc.nextInt();
		switch(select) {
		case 1:
			System.out.println(">> 등록할 상품 수를 입력 하세요");
			turn = sc.nextInt();
			arr = new Goods[turn];
			break;
		case 2:
			for(int i = 0; i < arr.length; i++) {
				sc.nextLine();
				System.out.println(">> 상품명을 입력 하세요");
				name = sc.nextLine();
				System.out.println(">> 가격을 입력 하세요");
				price = sc.nextInt();
				arr[i] = new Goods(name, price);
			}
			break;
		case 3:
			for(int i = 0; i < arr.length; i++) {
				System.out.println((i+1) + " " + arr[i].name + " : " + arr[i].price + "원");
			}
			break;
		case 4: // 분석, 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합
			maxPrice = arr[0].price;
			maxName = arr[0].name;
			// 제품 총합
			for(int i = 0; i < arr.length; i++) {
				sum += arr[i].price;
			}
			// 최고가
			for(int i = 1; i < arr.length; i++) {
				if(maxPrice < arr[i].price) {
					maxPrice = arr[i].price;
					maxName = arr[i].name;
				}
			}
			System.out.println("최고 가격의 상품 : " + maxName + "(" + maxPrice + "원)");
			System.out.println("최고가 상품을 제외한 제품들의 가격 총합 : " +(sum-maxPrice) + "원");
			break;
		case 5:
			System.out.println("프로그램 종료");
			run = !run;
			sc.close();
			break;
		default: 
			System.out.println("다시 입력해 주세요.");
			break;
		}
		}while(!run);
	}
}
