package _220503_Again;

public class GreenCard implements Payment{
	
	private final String name = "GreenCard";
	private String grade = "SILVER";
	private double saleRatio;
	private int point;
	private double pointRatio = 0.05;

	public GreenCard() {
		
	}

	@Override
	public int offline(int price) {
		int result = (int) (price * (1- Payment.OFFLINE_PAYMENT_RATIO));
		return result;
		
	}

	@Override
	public int online(int price) {
		int result = (int) (price * (1- Payment.ONLINE_PAYMENT_RATIO));
		return result;
	}

	@Override
	public int simple(int price) {
		int result = (int) (price * (1- Payment.SIMPLE_PAYMENT_RATIO));
		return result;
	}
	@Override
	public void showCardInfo() {
		System.out.println("========= 카드 정보 =========");
		System.out.println("카드명 : " + this.name);
		System.out.println("적용 등급: " + this.grade);
		System.out.println("할인율 : " + this.saleRatio);
		System.out.println("포인트 적립율 : " + this.pointRatio);
		System.out.println("적립 포인트 : ");
		System.out.println("==========================");
		
	}

}
