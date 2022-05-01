package chapter5;

public class Array {

	public static void main(String[] args) {
		// 배열 선언
		// 타입[] 변수;
		// 타입 변수[];
		// int[] intArray; / double doubleArray[]; String[] Array; 등

		// 배열 생성
		// 1) 값 목록으로 배열 생성
		// 타입[] 변수 = {값0, 값1, 값2, 값3, 값4};
		
		int[] ary1 = {1,2,3};
		System.out.println(ary1);
		
		// p173
		String a = "자바";
		String b = "자바";
		if(a==b) { // 번지수 비교
			System.out.println("a");
		}
		if(a.equals(b)) { // 문자열 비교
			System.out.println("b");
		}


		String[] names = { "신용권", "홍길동", "김자바" };
		System.out.println(names[0]); // 신용권
		System.out.println(names[1]); // 홍길동
		System.out.println(names[2]); // 김자바

		// p180
		// 배열 생성하고 배열 값 모두 더하기, 평균 내기
		int[] scores = { 83, 90, 87 };
		System.out.println("scores[0]" + scores[0]);
		System.out.println("scores[1]" + scores[1]);
		System.out.println("scores[2]" + scores[2]);

		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += scores[i];

		}
		System.out.println("총점 : " + sum);
		System.out.printf("평균 : %.2f\n", (sum / 3.0));
		
		System.out.println("=================");
		
		
		// 2) 값 목록으로 new연산자 사용하여 배열 생성

//		String[] colors = null;
//		colors = new String[] { "black", "white", "pink", "green" };

		String[] colors = new String[] { "black", "white", "pink", "green" }; // 위 두 문장을 이렇게 한 문장으로
		for (int i = 0; i < 4; i++) {
			System.out.println(colors[i]);
		}
		System.out.println("=================");

		// 3) New 연산자로 배열 생성
		// 값의 목록을 가지고 있지 않지만, 향후 값들을 저장할 배열을 미리 만들고 싶다면
		// 타입[] 변수 = new 타입[길이]

		// 학생 30명의 점수를 저장할 배열을 다음과 같이 생성
		int[] studScores = new int[30];
		System.out.println("=================");

		// new연산자로 배열을 처음 생성할 경우 studScores[0]부터 studScores[29]까지 모두 기본값 0으로 초기화 됨
		System.out.println(studScores[15]); // 0, 타입이 Str이라면 null, boolean이면 false

		// 생성 후 특정 인덱스 위치에 새로운 값을 저장하려면 대입 연산자 사용
		// 변수[인덱스] = 값;

		studScores[0] = 83;
		studScores[1] = 90;

		// p184
		double[] arr1 = new double[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("arr1[" + i + "] = " + arr1[i]);
		} // 값이 저장되지 않았기 때문에 초기값인 0.0을 반환

		arr1[0] = 0.1;
		arr1[1] = 0.2;
		arr1[2] = 0.3;
		System.out.println("arr1[0] = " + arr1[0]);
		System.out.println("arr1[1] = " + arr1[1]);
		System.out.println("arr1[2] = " + arr1[2]);

		System.out.println("=================");

		// 배열 길이: 배열 변수.length
		System.out.println(arr1.length);
		System.out.println("=================");

		// 배열을 활용하여 최대값, 최소값 구하기
		int[] arr2 = { 5, 3, 2, 10, 1 };
		int max = 0;
		int min = arr2[0];
		for (int i = 0; i < arr2.length; i++) {
			if (max < arr2[i]) {
				max = arr2[i];
			}
			if (min > arr2[i]) {
				min = arr2[i];
			}

		}
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
		

	}
}
