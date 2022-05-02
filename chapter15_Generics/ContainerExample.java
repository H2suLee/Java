package chapter15_Generics;

public class ContainerExample {
	public static void main(String[] args) {
		Container<Integer> container = Util.<Integer>container(100);
		int intValue = container.getT();
		
		Container<String> container2 = Util.<String>container("홍길동");
		String strValue = container2.getT();
		
		System.out.println(intValue + " " + strValue);

	}

}
