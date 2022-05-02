package chapter15_Generics;

class EmployeeInfo{
	public int rank;
	EmployeeInfo(int rank){ this.rank = rank; }
}
	
class Person <T, S>{ // 꺽쇄 안에 기본 타입은 올 수 없다. int, char 등등
	public T info;
	public S id;
	Person(T info, S id){ this.info = info; this.id = id; }
}


public class GenericDemo {
	public static void main(String[] args) {    
		Integer id = new Integer(1);
		
		Person<EmployeeInfo, Integer> p1 = new Person<EmployeeInfo, Integer>(new EmployeeInfo(1), new Integer(1)); // 두번째 매개변수 자리에 id라고 적어도 됨 
		// <EmployeeInfo> -> T, <Integer> -> S
		// (new EmployeeInfo(1) -> T info, id -> S id
		System.out.println(p1.id); // p1.id.intValue 도 됨: p1.id의 raw data를 불러오는 메소드, Integer클래스에 속함
		System.out.println(p1.info.rank); // p1.info까지 하면 객체 번지 나옴. p1.info.rank까지 하면 1 나옴 
		
	}

}
