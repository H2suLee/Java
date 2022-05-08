package chapter13_01;

import java.util.HashSet;
import java.util.Set;

public class MemberExample {
	
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30));
		
		System.out.println("총 객체수 : " + set.size());
		// override 전에는 객체수 2개로 카운트 됨. new 연산자로 생성했기 때문에 다른 해시코드를 가지고 있다
	}

}
