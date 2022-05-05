package chpater11_01;

public class SystemTimeExample {

	public static void main(String[] args) {
		long startTime = System.nanoTime(); // 초 단위의 값 리턴 메소드들은 long 값을 리턴함

		int sum = 0;
		for (int i = 1; i <= 1000000; i++) {
			sum += 1; 
		}

		long endTime = System.nanoTime();
		System.out.println("1~1000000까지의 합 : " + sum);
		System.out.println("계산에 " + (endTime - startTime) + "나노초가 소요되었습니다.");

	}
}
