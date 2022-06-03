package p20220603_hw;

public class Q1 {
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
		
		System.out.println("Q4 =============================");
		
		String[] persons = {"010302-2","991203-1","969513-2","881125-1","050105-2"};
		int female = 0;
		int male = 0;
		int under20;
		
		for(int i = 0; i < persons.length; i++) {
			// 남 or 여
			if(String.valueOf(persons[i].charAt(7)).equals("1")) {
				male++;
			} else {
				female++;
			}
			
			// under20
			if(Integer.parseInt(persons[i].substring(0, 2)+1))
		}
		System.out.println("남 " + male + ", 여 " + female );
		System.out.println(female);
		System.out.println(persons[1]);
	
	}
}
