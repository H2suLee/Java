package chpater11_01;

public class ByteToStringExample {

	public static void main(String[] args) {
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };

		String str1 = new String(bytes);
		System.out.println(str1);

		String str2 = new String(bytes, 6, 4); // 여섯번째 인덱스부터 네 칸을 문자열로 변환 (74, 97, 118, 97)
		System.out.println(str2);

	}
}
