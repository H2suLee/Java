package chpater11_01;

public class StringCharAtExample {

	public static void main(String[] args) {
		String ssn = "010624-1230123";
		char gender = ssn.charAt(7); // 인덱스 7의 값을 char로 변환
		switch (gender) {
		case '1': // 작은 따옴표 주의
		case '3':
			System.out.println("남자입니다.");
		case '2':
		case '4':
			System.out.println("여자입니다.");
			break;

		}

	}

}
