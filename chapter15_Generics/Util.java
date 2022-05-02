package chapter15_Generics;

public class Util { // only has one static method, Box클래스를 매개변수로 받음
	public static <T> Container<T> container(T t){
		Container<T> container = new Container<T>();
		container.setT(t);
		return container;
	}

}
