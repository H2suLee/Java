package self.maven.p20220504.lms;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

// DAO Data Access Object

//CRUD
//Create 생성, 등록, 추가
//Read 조회, 읽기
//Update 수정, 변경, 갱신
//Delete 삭제

public class StudentService {
	// 필드
	Scanner sc = new Scanner(System.in);
	private StudentVO student;
	private List<StudentVO> students = new ArrayList<>();
	// List는 인터페이스라서 ArrayList, LinkedList, QueueList로만 구현 가능함

	// 메소드
	public void dataSet() {
		student = new StudentVO("lee", "이영흠", "컴퓨터공학", "서울시", "010-1111-1111", Date.valueOf("1996-02-27")); // 0행
		students.add(student);

		student = new StudentVO("jeon", "전정국", "체육학과", "부산광역시", "010-2222-2222", Date.valueOf("1997-09-01")); // 1행
		students.add(student);

		student = new StudentVO("jhope", "정호석", "경영학과", "광주광역시", "010-3333-3333", Date.valueOf("1994-02-18")); // 2행
		students.add(student);

		student = new StudentVO("mark", "이마크", "영어영문학과", "서울시", "010-4444-4444", Date.valueOf("1999-08-02")); // 3행
		students.add(student);
	}

	// 1. 전체 학생 조회 - forEach문
	public void selectList() {
//		dataSet(); // 이 초기화는 바깥에서 해줄 것
		for (StudentVO vo : students) {
			System.out.println("-----------------------------");
			vo.toString(); // toString() 오버라이딩 해 주어야
		}

//		for (int i = 0; i < students.size(); i++) {
//			System.out.println("-----------------------------");
//			StudentVO std = students.get(i);
//			std.toString();
//		}
	}

	// 2. 한 명의 학생 조회 (학번을 입력받아)
	public void selectStudent(String id) {
		for (StudentVO vo : students) {
			if (vo.getId().equals(id)) {
				System.out.println("검색한 학생 ▶");
				vo.toString();
			}
		}
	}

	// 3. 학생 등록
	public void insertStudent(StudentVO vo) {
		students.add(vo);
		for (StudentVO std : students) {
			std.toString();
		}
	}

	// 4. 학생 수정
	public void updateStudent(String inputID) {
		System.out.println("수정할 내역을 선택해 주세요");
		System.out.println("1. id  |  2. 이름  |  3. 전공  |  4. 주소  |  5. 전화번호  |  6. 생년월일  ");
		int num = sc.nextInt();
		switch (num) {
		case 1:
			System.out.println("수정할 id를 입력해 주세요");
			String updateID = sc.next();
			for (StudentVO vo : students) {
				if (vo.getId().equals(inputID)) {
					vo.setId(updateID);
					System.out.println("====== 아래와 같이 수정되었습니다.=====");
					vo.toString();
				}
			}
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;

		}

	}

	// 5. 학생 삭제
	public void deleteStudent(String deleteID) {
		for (StudentVO vo : students) {
			if (vo.getId().equals(deleteID)) {
				System.out.println("삭제할 학생 ▶");
				vo.toString();
				System.out.println("정말 삭제하시겠습니까?");
				System.out.println("1. 네(Y)  |  2. 아니오(N)");
				String yesNo = sc.next();
				if (yesNo.equals("N")) {
					return;
				} else {
					students.remove(vo);
					System.out.println("삭제를 완료하였습니다.");
					break;
				}
			}
		}
	}
}
