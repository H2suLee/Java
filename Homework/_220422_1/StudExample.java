package _220422_1;

import java.util.Scanner;

public class StudExample {

	public static void main(String[] args) {
		// 4번 순위 매기는 거 어려워서 안함, 그래서 rank 배열은 선언해놓고 안 씀
		// 반복문
		// 메뉴 콘솔에서 직접 입력받아 선택
		// try catch 하기
		Scanner sc = new Scanner(System.in);
		int menu;
		boolean run = true;

		int num; // 상자 크기
		Stud[] student = null; // 학생 수 담을 상자
		Stud[] rank = null; // 학생 수 담을 상자

		while (run) {
			System.out.println("===========================================================");
			System.out.println("1. 학생 수 | 2. 학생 정보 입력 | 3. 학생 정보 출력 | 4. 순위 | 5. 종료");
			System.out.println("===========================================================");
			System.out.println("선택>");

			menu = Integer.parseInt(sc.nextLine());
			if (menu == 1) {
				System.out.println("관리해야 할 학생 수를 입력하세요.");
				num = Integer.parseInt(sc.nextLine());
				student = new Stud[num]; // 상자의 크기
				rank = new Stud[num]; // 상자의 크기

				System.out.println(student.length);
			} else if (menu == 2) {

				for (int i = 0; i < student.length; i++) {

					System.out.println("학번 >>");
					int no = Integer.parseInt(sc.nextLine());

					System.out.println("이름 >>");
					String name = sc.nextLine();

					System.out.println("국어 >>");
					int kor = Integer.parseInt(sc.nextLine());

					System.out.println("영어 >>");
					int eng = Integer.parseInt(sc.nextLine());

					System.out.println("수학 >>");
					int math = Integer.parseInt(sc.nextLine());

					Stud std = new Stud(no, name, kor, eng, math);

					student[i] = std; // 각 칸에 정보 늫기
					rank[i] = std;
					System.out.println(student[0].studentNo);
				}
				System.out.println();
			} else if (menu == 3) {
				// 학번을 입력하면 정보 불러오기
				System.out.println("학번을 입력하세요.");

				int noInput = Integer.parseInt(sc.nextLine()); // 애초에 String으로 타입 선언 했으면 equals 로 비교해야 됨
//				if (noInput == student[0].studentNo) {
//					student[0].getInfo();
//				} else if (noInput == student[0].studentNo) {
//					student[1].getInfo();
//				}
				
				for(int i = 0; i<student.length;i++) {
					if (noInput == student[i].studentNo) {
						student[i].getInfo();
					}
				}
//				System.out.println(student[0].studentNo);
//				student[0].getInfo();
			} else if(menu == 5) {
				System.out.println("프로그램 종료");
				run = false;
			}

		}
	}
}
