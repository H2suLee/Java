package chapter10;

// 다중 catch
// catch 블록이 여러개라 할 지라도 단 하나의 catch 블록만 실행됨.
// try블록에서 동시 다발적으로 예외가 발생하지 않고 하나의 예외가 발생하면 즉시 실행을 멈추고 해당 catch 블록으로 이동하기 때문

public class CatchByExceptionKindExample {
	public static void main(String[] args) {
		
		try {
		String data1 = args[0];
		String data2 = args[1];
		
		int num1 = Integer.parseInt(data1);
		int num2 = Integer.parseInt(data2);
		int result = num1 + num2;
		System.out.println(data1 + "+" + data2 + "=" + result);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
		} catch(NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		} finally {
			System.out.println("다시 실행하세요.");
		}
	}

}
