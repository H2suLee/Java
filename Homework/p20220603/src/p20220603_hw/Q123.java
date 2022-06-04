package p20220603_hw;

public class Q123 {
	public static void main(String[] args) {
		System.out.println("Q1 =============================");
		System.out.println(new SalaryMan().getAnnualGross());
		System.out.println(new SalaryMan(2000000).getAnnualGross());
		
		System.out.println("Q2 =============================");
		Circle w = new NamedCircle(5, "Waffle");
		w.show();
		
		System.out.println("Q3 =============================");
		AdderInterface adder = new MyAdder();
		System.out.println(adder.add(5,10));
		System.out.println(adder.add(10));
	}
}
