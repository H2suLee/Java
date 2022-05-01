package chapter6;

// 상수 (Static final)
// 한 번 초기화 되면 수정될 수 없고(final) 객체마다 저장할 필요가 없는 공용성(static)을 띄고 있다
// 상수는 객체마다 존재하지 않고 클래스에만 존재함
// 상수 이름은 대문자로 작성

public class Earth {
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	
	public static void main(String[] args) {
	System.out.println("지구의 반지름: " + Earth.EARTH_RADIUS + "km");
	System.out.printf("지구의 반지름: %.4fkm^2", Earth.EARTH_AREA);
	
	}
}


