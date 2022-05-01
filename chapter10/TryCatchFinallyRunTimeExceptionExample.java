package chapter10;

// 예외에는 실행예외, 일반예외 두 가지가 있다
// 실행 예외에는 NullPointer, ArrayIndexOutOfBounds, NumberFormat, ClassCast
// ClassCast는 아래의 경우. 대입된 객체가 아닌 다른 클래스 타입으로 타입 변환했을 때
//	Animal animal = new Dog();
//	Cat cat = (Cat) animal;
// 예외 처리에는 try catch finally
// 다중 catch

public class TryCatchFinallyRunTimeExceptionExample {
	public static void main(String[] args) {
		// trycatch
		String data1 = null;
		String data2 = null;
		
		try {
			data1 =args[0];
			data2 = args[1];
			System.out.println(args[0]);
			System.out.println(args[1]);
			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
			return;
		}
		
		// run-runconfiguration, argument에서 매개값 두 개를 문자를 주면
		// 위에 내용들은 실행 되는데 밑에 내용에선
		// numberformat 예외 발생
		
		try {
			int num1 = Integer.parseInt(data1);
			int num2 = Integer.parseInt(data2);
			int result = num1 + num2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		}catch(NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
			
		}finally { // finally는 항상 실행
			System.out.println("다시 실행하세요.");
		}
		
	}

}
