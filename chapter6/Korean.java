package chapter6;

public class Korean {
	
	// 필드
	// nation 필드는 대한민국으로 선언할 때부터 초기화
	// name과 ssn은 외부에서 입력받은 값으로 초기화 하겠음 -> 그러려면 생성자에서 초기화해야 함
	String nation = "대한민국";
	String name;
	String ssn;
	
	// 생성자, 생성자의 매개값을 입력받아 초기화
	// 이름인 김자바, 박자바는 매개 변수 name을 통해, 주민번호인 "0135-1516"은 매개 변수 ssn를 통해 전달될 예정
	// 매개변수 name과 ssn는 name 필드와 ssn 필드의 초기값이 되는 것임
	// 매개변수와 필드의 이름은 동일하게 가는 것이 관례임
	// 헷갈릴 우려가 있으므로 필드 앞에 주로 this.를 붙임
	public Korean(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	

}
