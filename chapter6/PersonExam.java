package chapter6;

public class PersonExam {
	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "홍길동");
		System.out.println(p1.nation + " " + p1.ssn + " " + p1.name);
		
		//p1.nation="usa" // 컴파일 에러
	}
}
