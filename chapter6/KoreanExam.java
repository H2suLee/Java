package chapter6;

public class KoreanExam {

	public static void main(String[] args) {
		Korean p1 = new Korean("김자바", "132456-134656"); // p1의 name, ssn 초기화
		
		Korean p2 = new Korean("박자바", "135465-05654"); // p2의 name, ssn 초기화
		
		System.out.println("p1.nation: " + p1.nation); // p1의 nation 초기값 호출
		System.out.println("p1.name: " + p1.name); // p1의 name 초기값 호출
		System.out.println("p1.ssn: " + p1.ssn);
	
		System.out.println("p2.nation: " + p2.nation);
		System.out.println("p2.name: " + p2.name);
		System.out.println("p2.ssn: " + p2.ssn);
		
	}

}
