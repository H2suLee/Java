package self.maven.p20220504.lms;

import java.sql.Date;
import java.util.Scanner;

public class Menu {

	Scanner sc = new Scanner(System.in);
	// 멤버 변수(필드)
	private StudentService dao = new StudentService();

	// 생성자
	public Menu() {

	}
	// 메소드

	private void mainTitle() {
		System.out.println("=========================================");
		System.out.println("============ 1. 학 사 관 리 ===============");
		System.out.println("============ 2. 공 지 관 리 ===============");
		System.out.println("============ 3. 종      료 ===============");
		System.out.println("=========================================");
	}

	private void lmsTitle() {
		System.out.println("▶ 학 사 관 리 =============================");
		System.out.println("=========================================");
		System.out.println("============ 1. 전체 학생 조회 =============");
		System.out.println("============ 2. 학 생 조 회 ===============");
		System.out.println("============ 3. 학 생 등 록 ===============");
		System.out.println("============ 4. 학 생 수 정 ===============");
		System.out.println("============ 5. 학 생 삭 제 ===============");
		System.out.println("============ 6. 돌 아 가 기 ===============");
		System.out.println("=========================================");
	}

	private void noticeTitle() {
		System.out.println("▶ 공 지 관 리 =============================");
		System.out.println("=========================================");
		System.out.println("============ 1. 공 지 목 록 ===============");
		System.out.println("============ 2. 공 지 조 회 ===============");
		System.out.println("============ 3. 공 지 등 록 ===============");
		System.out.println("============ 4. 공 지 수 정 ===============");
		System.out.println("============ 5. 공 지 삭 제 ===============");
		System.out.println("============ 6. 돌 아 가 기 ===============");
		System.out.println("=========================================");
	}

	// 종료 누를 때까지 동작이 되어야 함
	private void mainMenu() {
		boolean b = false;
		do {
			mainTitle();
			System.out.println("원하는 작업을 선택하세요.");
			int code = sc.nextInt();
			switch (code) {
			case 1:
				lmsMenu();
				break;
			case 2:
				noticeMenu();
				break;
			case 3:
				b = true;
				sc.close();
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		} while (!b);

	}

	private void noticeMenu() {
		boolean b = false;
		do {
			noticeTitle();
			System.out.println("원하는 작업을 선택하세요.");
			int code = sc.nextInt();
			switch (code) {
			case 1: // 공지 목록
				lmsMenu();
				break;
			case 2: // 공지 조회
				break;
			case 3: // 공지 등록
				lmsMenu();
				break;
			case 4: // 공지 수정
				lmsMenu();
				break;
			case 5: // 공지 삭제
				lmsMenu();
				break;
			case 6: // 돌아가기
				lmsMenu();
				break;
			}

		} while (!b);

	}

	private void lmsMenu() {
		boolean b = false;
		do {
			lmsTitle();
			System.out.println("원하는 작업을 선택하세요.");
			int code = sc.nextInt();
			switch (code) {
			case 1: // 전체 학생 조회
				sc.nextLine();
				dao.selectList();
				break;
			case 2: // 학생 조회
				System.out.println("검색할 학생의 id를 입력하세요.");
				String search = sc.next();
				dao.selectStudent(search);
				break;
			case 3: // 학생 등록
				sc.nextLine(); // 이거 안 해주면 학생의 아이디를 입력하세요랑 학생의 이름을 입력하세요 같이 나옴
				System.out.println("학생의 아이디를 입력하세요.");
				String id = sc.nextLine();
				System.out.println("학생의 이름을 입력하세요.");
				String name = sc.nextLine();
				System.out.println("학생의 전공을 입력하세요.");
				String major = sc.nextLine();
				System.out.println("학생의 주소를 입력하세요.");
				String addr = sc.nextLine();
				System.out.println("학생의 전화번호를 입력하세요.");
				String tel = sc.nextLine();
				System.out.println("학생의 생년월일을 입력하세요.");
				String birthday = sc.nextLine();
				
				StudentVO vo = new StudentVO(id, name, major, addr, tel, Date.valueOf(birthday));
				dao.insertStudent(vo);
				break;
			case 4: // 학생 수정
				break;
			case 5: // 학생 삭제
				break;
			case 6: // 돌아가기
				b = true;
				break;
			}

		} while (!b);
	}
	
	// encapsulation
	public void run() {
		mainMenu();
	}
}
