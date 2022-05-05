package chpater11_01;

public class ExitExample {
	public static void main(String[] args) {
		for(int i = 0; i<10; i++) {
			if (i==5) {
//				System.exit(0); // 이 부분 주석 처리 해제하면 강제 종료 되어서 11라인은 실행되지도 않음
				break;
			}
		}
		System.out.println("마무리 코드");
	}

}
