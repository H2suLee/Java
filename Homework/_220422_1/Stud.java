package _220422_1;

public class Stud {
	
	// 필드
	int studentNo;
	String studentName;
	int kor;
	int eng;
	int math;
	
	// 생성자 두개 (기본, 매개 변수)
	
	public Stud() {
		
	}

	public Stud(int studentNo, String studentName, int kor, int eng, int math) {
		super();
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	// 메소드 세개, getter-setter, getInfo, getAvg 
	// getter setter 안 씀
	
	public void getInfo() {
		System.out.println("학번: " + this.studentNo);
		System.out.println("이름: " + this.studentName);
		System.out.println("국어: " + this.kor);
		System.out.println("영어: " + this.eng);
		System.out.println("수학: " + this.math);
		System.out.printf("평균: %.2f\n", avg());
		
	}
	
	public double avg() {
		return (this.kor+this.eng+this.math)/3.0;
	}
}
