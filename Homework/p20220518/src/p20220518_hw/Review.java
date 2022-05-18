package p20220518_hw;

public class Review {
	public static void main(String[] args) {
		
		// Q1
		
		System.out.println("=====================Q1");
		int num1 = 37;
		int num2 = 91;
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		// Q2
		
		System.out.println("=====================Q2");
		System.out.println(num2 + num1);
		System.out.println(num2 - num1);
		System.out.println(num2 * num1);
		System.out.println(num2 / num1);
		
		// Q3
		System.out.println("=====================Q3");
		int var1 = 128;
		char var2 = 'B';
		String var3 = "44032";
		long var4 = 100000000000L;
		float var5 = 43.93106f;
		double var6 = 301.3;
		
		System.out.printf("%d, int\n", var1);
		System.out.printf("%c, char\n", var2);
		System.out.printf("%s, String\n", var3);
//		System.out.printf("%e, long\n", var4);
		System.out.printf("%f, float\n", var5);
		System.out.printf("%.1f, double\n", var6);
		
		// Q4
		
		System.out.println("=====================Q4");
		byte a = 35;
		byte b = 25;
		int c = 463;
		long d = 1000L;
		
		long result1 = a+c+d;
		System.out.println(result1);
		
		int result2 = a+b+c;
		System.out.println(result2);
		
		double e = 45.31;
		double result3 = c+d+e;
		System.out.println(result3);
		
		// Q5
		
		System.out.println("=====================Q5");
		int intValue1 = 24;
		int intValue2 = 3;
		int intValue3 = 8;
		int intValue4 = 10;
		
		char charValue = 'A';
		String strValue = "번지";
		String strResult = String.valueOf(charValue) + (intValue1+intValue2) + intValue3 + strValue + ((double)intValue4);
		System.out.println(strResult);
		
		// Q6 
		System.out.println("=====================Q6");
		int value = 485;
		System.out.println("4 + 8 + 5 = 17로 결과는 " + (4+8+5) + "입니다.");
		
	}
}
