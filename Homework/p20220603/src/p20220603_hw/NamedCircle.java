package p20220603_hw;

public class NamedCircle extends Circle {
	public String name;
	public NamedCircle(int radius, String name) {
		super(radius);
		this.name = name;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void show() {
		System.out.print(this.name + ", ");
		super.show();
	}
}
