package chpater11_01;

public class Smartphone {
	private String company;
	private String os;
	public Smartphone(String company, String os) {
		super();
		this.company = company;
		this.os = os;
	}
	@Override
	public String toString() {
		return company + ", " + os;
	}
	
	// toString() 디폴트값
//	@Override
//	public String toString() {
//		return super.toString();
//	}
	
	
}
