package chapter15_Generics;

// 복수 제너릭

public class Product<T,M> { // 타입 변수를 받을 자리를 두 자리로 놓겠다
	
	// 필드
	private T t;
	private M m;
	
	// 메소드
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	public M getM() {
		return m;
	}
	public void setM(M m) {
		this.m = m;
	}
	
	

}