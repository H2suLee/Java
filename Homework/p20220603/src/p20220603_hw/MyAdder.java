package p20220603_hw;

public class MyAdder implements AdderInterface{

	@Override
	public int add(int x, int y) {
		return x+y;
	}

	@Override
	public int add(int n) {
		double result = n * 5.5;
		return (int) result;
	}

}
