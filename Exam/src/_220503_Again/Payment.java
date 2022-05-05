package _220503_Again;

public interface Payment {
	
	final double OFFLINE_PAYMENT_RATIO = 0.01;
	final double ONLINE_PAYMENT_RATIO = 0.03;
	final double SIMPLE_PAYMENT_RATIO = 0.05;
	
	public int offline(int price);
	public int online(int price);
	public int simple(int price);
	public void showCardInfo();
	

}
