package chapter13_01;

// 해시코드 메소드와 이퀄즈 메소드를 재정의하여
// 이름과 나이가 동일하다면 동일한 객체로 간주하여 중복 저장되지 않게 하기

public class Member {

	public String name;
	public int age;

	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	// name과 age 값이 같으면 동일한 hashCode를 리턴
	public int hashCode() {
		return name.hashCode() + age;
	}

	@Override
	// name과 age가 같으면 true를 리턴
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(name) && (member.age == age);
		} else {
			return false;
		}
	}

}
