package chapter5;

public class forEach {
	public static void main(String[] args) {
		// 향상된 for문 p198~
		// 반복 실행을 하기 위해 루프 카운터 변수와 증감식을 사용하지 않고,
		// for문의 괄호에는 배열에서 꺼낸 항목을 저장할 변수 선언과 콜론 그리고 배열을 나란히 작성한다.
		// 실행 흐름
//		for (2. 타입 변수: 1. 배열) {
//			3. 실행문
//		}

		// p198
		int[] scores = { 95, 71, 84, 93, 87 };

		int sum = 0;
		for (int score : scores) {
			sum = sum + score;

		}
		System.out.println("점수 총합= " + sum);
		
		String[] strAry = {"김", "이", "박", "최"};
		
		for(String name: strAry) {
			System.out.println(name);
		}
	}

}
