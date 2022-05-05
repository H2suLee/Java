package chpater11_01;

public class ClassExample {

	public static void main(String[] args) throws ClassNotFoundException {
//		Class clazz = Member.class; // 방법 1 클래스로부터 얻기
//		Class clazz = Class.forName("chpater11_01.Member"); // 방법 2 클래스 이름을 이용하여 클래스로부터 얻기
		Member member = new Member("blue"); 
		Class clazz = member.getClass(); // 방법 3, 객체로부터 얻기

		System.out.println("클래스 풀네임 : " + clazz.getName()); // 풀네임
		System.out.println("클래스 simple 네임 " + clazz.getSimpleName()); // 간단 네임
		System.out.println("패키지 풀네임 : " + clazz.getPackage().getName()); // 패키지 풀네임
		System.out.println("패키지 풀네임 : " + clazz.getPackageName()); // 패키지 풀네임

		String textPath = clazz.getResource("Untitled 1").getPath();
		System.out.println("경로 : " + textPath);

	}

}
