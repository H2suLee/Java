package chapter6;

public class GasExam {
	public static void main(String[] args) {
		Gas first = new Gas();
		
		first.setGas(5);
		
		if(first.isLeftGas()) { // gasState의 리턴값이 true일 경우 run메소드 호출
			System.out.println("출발합니다.");
			first.run();
		}
		if(!first.isLeftGas()) { // 이 부분 교재랑 다르게 씀
			System.out.println("가스를 주입하세요.");
		}
	}

}
