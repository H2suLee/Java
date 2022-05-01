package chapter7;

public class HankookTire extends Tire{

	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		this.accumulatedRotation++;
		if (this.accumulatedRotation > this.maxRotation) {
			System.out.println(location+"Hankook 평크");
			return false;
		} else {
			System.out.println(location+"Hankook의 남은 회전 수 : " + (this.maxRotation - this.accumulatedRotation));
			return true;
		}
	}

}
