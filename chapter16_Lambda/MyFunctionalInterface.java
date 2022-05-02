package chapter16_Lambda;

@FunctionalInterface

public interface MyFunctionalInterface {
	// 반드시 하나 이상의 추상메소드를 포함해야 함
	// 매개변수도 리턴값도 존재하지 않는 메소드를 람다식으로 구현해 보기
	
	public abstract void method();
}
	