package _220427_3;

public class Main {

// 로또 번호 추첨 프로그램
// 중복이 일어나면 안 됨

	// 배열로 로또 번호 담을 6칸짜리 상자 for문을 통해 만들고, 0~5칸에 랜덤 숫자를 집어넣을 것
	// 0칸 > 0칸 / 1칸 > 0칸, / 2칸 > 0칸, 1칸, 이런 식으로 칸에 담긴 수가 중복되는 지 체크하기 위해 중첩 반복문 써야함

	public static void main(String[] args) {
//		System.out.println("?");
		int[] lotto = new int[6];
		
		// 숫자 입력
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		 
		// 숫자 출력 (출력문을 위 for 반복문에 넣으니까 중복에서 거른 숫자들이 두 번씩 출력 되길래 출력은 아래와 같이 따로 뺌)
		// 출력 라인을 어디 위치시켜야 할 지도 애매
		for (int i = 0; i < lotto.length; i++) {
			System.out.println((i + 1) + "번째 숫자: " + lotto[i]);
		}

	}

}
