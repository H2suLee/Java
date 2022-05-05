package _220503_Again;

public class VIPCard implements Payment {

	private final String name = "VIPCard";
	private String grade = "GOLD";
	private double saleRatio = 0.1;
	private int point;
	private double pointRatio = 0.03;
	
	public VIPCard() {
		
	}
	@Override
	public int offline(int price) {
		point += price * this.pointRatio; // (+) 누적시키는 개념으로 += 연산자 사용, 
		int result = (int) (price * (1- (this.saleRatio + Payment.OFFLINE_PAYMENT_RATIO)));
		return result;
		
	}

	@Override
	public int online(int price) {
		point += price * this.pointRatio;
		int result = (int) (price * (1- (this.saleRatio + Payment.ONLINE_PAYMENT_RATIO)));
		return result;
	}

	@Override
	public int simple(int price) {
		point += price * this.pointRatio;
		int result = (int) (price * (1- (this.saleRatio + Payment.SIMPLE_PAYMENT_RATIO)));
		return result;
	}
	@Override
	public void showCardInfo() {
		System.out.println("========= 카드 정보 =========");
		System.out.println("카드명 : " + this.name);
		System.out.println("적용 등급: " + this.grade);
		System.out.println("할인율 : " + this.saleRatio);
		System.out.println("포인트 적립율 : " + this.pointRatio);
		System.out.println("적립 포인트 : " + this.point);
		System.out.println("==========================");
		
	}

}
