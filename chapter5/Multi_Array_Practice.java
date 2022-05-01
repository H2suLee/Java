package chapter5;

public class Multi_Array_Practice {
	public static void main(String[] args) {
//		다차원 배열을 행렬 모양으로 출력

		int[][] ary = { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 4, 5 } };

		for (int i = 0; i < ary.length; i++) {
			for (int j = 0; j < ary[i].length; j++) {
				System.out.print(ary[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("==========================");

//		다차원 배열에 값 저장하고 출력하기
		int[][] ary2 = new int[5][3];
		int num = 1;
		for (int i = 0; i < ary2.length; i++) {
			for (int j = 0; j < ary2[i].length; j++) {
				ary2[i][j] = num;
				num++;
				System.out.print(ary2[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("==========================");

		num = 0;
		for (int i = 0; i < ary2.length; i++) {
			// ary1.length = 행 개수 (=5)
			for (int j = 0; j < ary2[i].length; j++) {
				// ary1[i].length = 열 개수 (=5)
				ary2[i][j] += num;
				num++;
				System.out.print(ary2[i][j] + " ");
			}
			System.out.println();

		}
		System.out.println("==========================");

		// 배열 바꾸기
		int[][] ary3 = new int[5][5];
		num = 1;

		// 입력
		for (int i = 0; i < ary3.length; i++) {
			for (int j = 0; j < ary3[i].length; j++) {
				ary3[i][j] += num;
				num++;
			}
		}

		// 출력
		for (int i = 0; i < ary3.length; i++) {
			for (int j = 0; j < ary3[i].length; j++) {
				System.out.print(ary3[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("==========================");
		
		// 행열 전환 출력
		for (int i = 0; i < ary3.length; i++) {
			for (int j = 0; j < ary3[i].length; j++) {
				System.out.print(ary3[j][i] + " ");
			}
			System.out.println();
		}
		
		
	}
}
