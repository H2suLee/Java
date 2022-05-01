package chapter6;

public class BankAccount {
	// 라이브러리 클래스
	// 필드: 계좌 번호, 예금주, 잔액
	// 데이터 초기화하는 생성자 명시
	// 메소드는 총 세 개로, 예금 메소드, 출금 메소드, 잔액 확인 메소드 
	
	String acNo;
	String name;
	int balance;
	
	public BankAccount(String acNo, String name, int balance) {
		super();
		this.acNo = acNo;
		this.name = name;
		this.balance = balance;
	}
	
	int deposit(int plus) {
		return balance += plus;
	}
	
	int withdraw(int minus) {
		if(minus>balance) {
			System.out.println("잔액이 부족합니다.");
		} else {
		balance -= minus;
		}
		return balance;
	}

	void checkBalance() {
		System.out.println(this.name + "님의 계좌(" + acNo + ")의 잔액은 " + this.balance + "원 입니다.");
	}
	

	// 실행 클래스
	// - 인스턴스는 1개만 생성, 인자 3개를 가지도록 생성
	// - 스캐너를 이용하여 예금, 출금, 잔액 확인
	// - 반복문을 이용하여 1. 예금 2. 출금 3. 잔액 확인 4. 종료
	
	
	
}
