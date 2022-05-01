package chapter5;

public class Multi_Array {
	public static void main(String[] args) {
		// 다차원 배열

		// 2*3 행렬을 만들기 위해
		// int[][] scores = new int[2][3];
		// scores.length = 2
		// scores[0].length =3
		// scores[0][0] -> 행렬 (0,0) 과 같은 의미
		// scores[1][2] -> 행렬 (1,2) 와 같은 의미

		// int[][] scores = new int[2][]; // 행의 길이는 2로 정했지만 열의 길이는 아직 null
		// 아래와 같이 배열 항목의 수를 각각 다르게 설정할 수 있다.
		// scores[0] = new int[2]; <- scores[0].length = 2 <- scores[0][2]는
		// ArrayIndexOutOfBound 에러 야기
		// scores[1] = new int[3]; <- scores[0].length = 3

		// 다차원 배열 값 저장 방법: 중괄호 안에 중괄호

		int[][] scores = { { 95, 80 }, { 92, 86 } }; //
		System.out.println(scores[0][0]);
		System.out.println(scores[1][1]);

		// p192

		int[][] mathScores = new int[2][3];
		for (int i = 0; i < mathScores.length; i++) {
			for (int k = 0; k < mathScores[i].length; k++) {
				System.out.println("mathScores[" + i + "][" + k + "]=" + mathScores[i][k]);
			}
		} // 인덱스 총 여섯개, 초기값인 0으로 출력됨

		int[][] engScores = new int[2][]; // 행 길이만 설정
		engScores[0] = new int[2]; // engScores[0]의 열 길이 2로 설정
		engScores[1] = new int[3]; // engScores[1]의 열 길이 3으로 설정
		for (int i = 0; i < engScores.length; i++) {
			for (int k = 0; k < engScores[i].length; k++) {
				System.out.println("engScores[" + i + "][" + k + "]=" + engScores[i][k]);

			}

		}

		int[][] javaScores = { { 95, 80 }, { 98, 96, 80 } };
		for (int i = 0; i < javaScores.length; i++) {
			for (int k = 0; k < javaScores[i].length; k++) {
				System.out.println("javaScores[" + i + "][" + k + "]=" + javaScores[i][k]);

			}
		}
		

	}
}
