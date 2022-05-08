package chapter13_01;

public class Student {
	public int no;
	public String name;
	
	public Student(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	
	// 오버라이드
	// 학번과 이름이 같다면 true 리턴
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student) obj;
			return (no == student.no) && (name.equals(student.name));
		} else {
			return false;
		}
	}
	
	// 학번과 이름이 같다면 동일한 해시코드 리턴
	public int hashCode() {
		return no+name.hashCode();
	}
	
}
