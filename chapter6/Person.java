package chapter6;

// Final 필드와 상수
// p281~

public class Person {
	final String nation = "Korea"; // (1) 필드 선언 시 초기값(=최종값) 주기.
	final String ssn;
	String name;

	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}