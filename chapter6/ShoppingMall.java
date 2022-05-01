package chapter6;

public class ShoppingMall {
	// 쇼핑몰 주문
		// 1. 필드에 대한 정보를 출력하는 메소드
		// 2. 생성자를 통한 데이터 저장
		// 3. Scanner를 이용해서 데이터 저장
		
	// 필드
	// 주문 번호, 주문자 아이디, 주문자 이름, 주문 상품 번호, 배송 주소
	int orderNo;
	String userID;
	String userName;
	int goodsNo;
	String addr;
	
	// 생성자
	public ShoppingMall(int orderNo, String userID, String userName, int goodsNo, String addr) {
		super();
		this.orderNo = orderNo;
		this.userID = userID;
		this.userName = userName;
		this.goodsNo = goodsNo;
		this.addr = addr;
	}


	// 메소드
	void getInfo() {
		System.out.println("주문 번호 > " + orderNo);
		System.out.println("주문자 ID > " + userID);
		System.out.println("주문자 이름 > " + userName);
		System.out.println("주문 상품 번호 > " + goodsNo);
		System.out.println("배송주소 > " + addr);
	}

}
