package self.maven.p20220504.lms;

// 시, 분, 초가 중요할 땐 util, 아니면 sql
import java.sql.Date;

// DTO: Data Transfer Object, 계층 간 데이터 교환을 위해 사용하는 객체
// VO: Value Object, 멤버 변수와 getter setter 만 가지고 있는 객체

public class StudentVO {
	
	// 필드
	// 학번, 이름, 전공, 주소, 전화번호, 생년월일
	private String id;
	private String name;
	private String major;
	private String addr;
	private String tel;
	private Date birthday;
	
	
	// 생성자
	public StudentVO() {
		
	}


	// 생성자 오버로딩
	public StudentVO(String id, String name, String major, String addr, String tel, Date birthday) {
		super();
		this.id = id;
		this.name = name;
		this.major = major;
		this.addr = addr;
		this.tel = tel;
		this.birthday = birthday;
	}
	
	// 메소드
	// toString 오버라이드
	// toString 기본값
	/*
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}*/
	
	@Override
	public String toString() {
		
		System.out.println("학번 : " + this.id);
		System.out.println("이름 : " + this.name);
		System.out.println("전공 : " + this.major);
		System.out.println("주소 : " + this.addr);
		System.out.println("전화번호 : " + this.tel);
		System.out.println("생년월일 : " + this.birthday);
		
		return null;
	}

	// getter setter
	public String getId() {
		return id;
	}




	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getMajor() {
		return major;
	}


	public void setMajor(String major) {
		this.major = major;
	}


	public String getAddr() {
		return addr;
	}


	public void setAddr(String addr) {
		this.addr = addr;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}


	public Date getBirthday() {
		return birthday;
	}


	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	

}
