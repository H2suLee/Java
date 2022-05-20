package p20220520_hw;

public class Review {
	public static void main(String[] args) {

		int x = -5;
		int y = 10;
		int result;

		// 1-1
		System.out.println("=========================== 1)");

		result = Math.abs(x);
		System.out.printf("x : %d, result : %d\n", x, result);

		// 1-2
		result = ++x + y--;
		System.out.printf("x : %d, y : %d, result : %d\n", x, y, result);

		// 1-3
		result = --x + ++y;
		System.out.printf("x : %d, y : %d, result : %d\n", x, y, result);

		// 2
		System.out.println("=========================== 2)");
		int m = 10;
		int n = 5;

		System.out.println((m * 2 != n * 4) || (n < 5));
		System.out.println((m / 2 == 5) && (n % 2 == 1));

		// 3
		System.out.println("=========================== 3)");
		int val = 0;
		val += 10;
		val -= 5;
		val *= 3;
		val /= 5;

		// 4
		System.out.println("=========================== 4)");
		int result4 = (val > 0) ? val : 0;
		System.out.println(result4);

		// 5
		System.out.println("=========================== 5)");
		String result5;
		int a = 10;
		int b = -8;
		if (a < 0 || b < 0) {
			result5 = "One of a or b is negative number";
		} else {
			result5 = "both a and b are zero or more";
		}
		System.out.println(result5);
	}

}
