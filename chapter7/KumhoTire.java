package chapter7;

public class KumhoTire extends Tire {

	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		this.accumulatedRotation++;
		if (this.accumulatedRotation > this.maxRotation) {
			System.out.println(location+"KumhoTire 평크");
			return false;
		} else {
			System.out.println(location+"KumhoTire의 남은 회전 수 : " + (this.maxRotation - this.accumulatedRotation));
			return true;
		}
	}
	

}
