package chapter15_Generics;

import java.util.ArrayList;

class Tv {}
class Audio {}

public class GenericTest {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(); // <> 전에는 object 타입이 default로 모든 종류의 타입 저장 가능
		list.add(10); // list.add(new Integer(10)) 와 같은 의미
		list.add(20);
//		list.add("30"); // 2번째 인덱스에는 String 타입 데이터 저장 // <Integer>을 추가하면 이 라인에는 컴파일 에러 발생
		list.add(30); // Generics 덕분에 타입 체크 강화됨
		
//		Integer i = (Integer) list.get(2); //list.get(2)는 Object 타입을 반환하므로 Integer i 에 넣기 위해 Integer로 강제 타입 변환, 컴파일 ok
		Integer i = list.get(2); // 형변환 생략 가능
		System.out.println(list); // 컴파일은 Ok이지만 실행시 ClassCastException 오류 발생, 그래서 객체 생성 시 <integer>만 저장할 거라고 제네릭 생성
		
		ArrayList<Object> list2 = new ArrayList<Object>(); // 반면 <Object>(or 타입변수(ex <T>))라고 선언해 주면 모든 종류의 타입(Object의 자식 타입들) 저장 가능
		
		// 객체 생성시, 타입 변수 대신 실제 타입(<Int>, <Tv> 등..)을 지정해서 참조변수와 생성자에 대입,
		ArrayList<Tv> list3 = new ArrayList<Tv>(); // 실제 타입 대입, Tv 타입의 객체만 저장 가능
		list3.add(new Tv());
//		list3.add(new Audio()); // 불가능, Tv 타입의 객체만 넣을 수 있다고 선언해 놓았기 때문에 audio 껄로 불가능 
		
		Tv tv = list3.get(0); // list3의 첫번째 인덱스에 있는 값을 불러와서 Tv tv에 넣기, 제너릭 없으면 (Tv) list3.get(0)으로 불러왔어야 하지만 제너릭 덕분에 형변환 불필요
		
	}

}


// Box<T> 지네릭 클래스, T의 Box 또는 T Box라고 한다
// T 타입 변수 또는 타입 매개변수
// Box 원시 타입(raw type)
// class Box<T> {}

// 참조 변수의 타입과 생성자의 타입은 일치해야 함
// 제너릭 클래스 간의 다형성은 성립 List<Tv> list = new ArrayList<Tv>(); List가 조상, ArrayList가 자손
// 매개변수의 다형성도 성립 ArrayList<Product> list = newArrayList<Product>(); 일 때,
// list.add(new Product()); 조상 
// list.add(new Tv()); 자손 가능
// list.add(new Audio()); 자손 가능
// add 메소드 생김새가 boolean add(E e){}
// 근데 get 메소드에서
// Product p = list.get(0); 일 때는 형변환 필요 없지만
// Tv t = (Tv) list.get(0); 일 때는 tv로 형변환 필요함, list.get(0)이 반환하는 값이 Product이기 때문

// 와일드 카드
// 상속 관계가 Object -> Product -> Tv 라고 했을 때,
// <? extends T> T와 그 자손들 (Tv와 자손들)
// <? super T> T와 그 조상들(Tv, Product, Object)
// <?> 제한 없음, 모든 타입 가능 <? extends Object>와 동일
// ArrayList<Product> list = new ArrayList<Tv>(); // 에러
// ArrayList<? extends Product> list = new ArrayList<Tv>(); // 컴파일 ok
