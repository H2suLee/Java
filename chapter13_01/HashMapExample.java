package chapter13_01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		// Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// 객체 저장
		map.put("홍길동", 90);
		map.put("신용권", 85);
		map.put("동장군", 75);
		map.put("홍길동", 95);
		// 홍길동 키에는 제일 마지막에 저장한 95가 저장됨
		System.out.println("총 Entry 수 : " + map.size());
		System.out.println("\t홍길동 : " + map.get("홍길동")); // 키를 매개변수로 값 불러옴
		System.out.println("======================");
		
		// 객체들을 하나씩 처리 keySet과 .get(key) 이용
		Set<String> keySet = map.keySet();
		Iterator<String> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			// 반복해서 Key를 얻고 값을 Map에서 얻어냄
			String key = iterator.next();
			int value = map.get(key);
			System.out.println("\t" + key + " : " + map.get(key));
		}
		
		// 객체 삭제
		map.remove("홍길동");
		System.out.println("총 Entry 수 : " + map.size());
		
		// 객체들을 하나씩 처리 entrySet()과 getKey, getValue 이용
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			// 반복해서 Map.Entry를 얻고 키와 값을 얻어냄
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println("\t" + key + " : " + val); 
		}
		
		// 객체 전체 삭제
		map.clear();
		System.out.println("총 Entry 수 : " + map.size());
		
		
	}
}
