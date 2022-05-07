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
	private StudentVO student;
	private List<StudentVO> students = new ArrayList<>();
	// List는 인터페이스라서 ArrayList, LinkedList, QueueList로만 구현 가능함

	// 메소드
	private void dataSet() {
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
		dataSet();
		for (StudentVO vo : students) {
			System.out.println("-----------------------------");
			vo.toString(); // toString() 오버라이딩 해 주어야
		}
	}

	// 2. 한 명의 학생 조회 (학번을 입력받아)
	public void selectStudent(String id) {
		dataSet();
		for (StudentVO vo : students) {
			if (vo.getId().equals(id)) {
				System.out.println("검색한 학생 ▶");
				vo.toString(); 
			}
		}
	}
	
	// 3. 학생 등록
	public void insertStudent(StudentVO vo) {
		dataSet();
		students.add(vo);
		for(StudentVO std : students) {
			std.toString();
		}
	}

}
