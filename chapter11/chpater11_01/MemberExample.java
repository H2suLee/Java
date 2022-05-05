package chpater11_01;

public class MemberExample {
	public static void main(String[] args) {
		Member mem1 = new Member("blue");
		Member mem2 = new Member("blue");
		Member mem3 = new Member("red");
		
		// equals 메소드 재정의 전 첫번째와 두번째 모두 동등하지 않다는 출력 결과가 나옴
		// 메소드 재정의 후에 첫번째, 두번째 객체는 동일, 첫번째 세번째 객체는 동일하지 않다고 나옴
		if(mem1.equals(mem2)) {
			System.out.println("mem1과 mem2는 동등합니다.");
		} else {
			System.out.println("mem1과 mem2는 동등하지 않습니다.");
		}
		
		if(mem1.equals(mem3)) {
			System.out.println("mem1과 mem3는 동등합니다.");
		} else {
			System.out.println("mem1과 mem3는 동등하지 않습니다.");
		}
		
	}

}
