package chapter6;

public class StudentManaging {
	
//	숙제
//	1명의 학생 관리 프로그램
//	// 학생 정보 : 학번, 이름, 국어, 수학, 영어
//
//	// 기본 생성자를 통해 데이터 입력
//
//	// 메소드
//	1. 학생의 기본 정보 출력(학번, 이름, 국어, 수학, 영어)
//
//	2. 국영수 점수 평균 출력
	
	int studentNo;
	String name;
	int kor;
	int math;
	int eng;
	
	public StudentManaging(int studentNo, String name, int kor, int math, int eng) {
		super();
		this.studentNo = studentNo;
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}
	
	double avg() {
		double avg = (this.kor + this.eng + this.math)/3.0;
		System.out.printf("점수 평균: %.2f점", avg);
		return avg;
	}
	
	

}
