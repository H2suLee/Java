package chapter13_01;

import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {
		HashMap<Key, String> hashMap = new HashMap<>();
		
		hashMap.put(new Key(1), "홍길동");
		String value = hashMap.get(new Key(1)); // key로 value를 불러옴
		// equals()와 hashCode() 오버라이드 전에는 null로 출력됨
		System.out.println(value); // 홍길동
	}
}
