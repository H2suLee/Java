package chapter6_GetterSetter;

// 필드는 외부에서 접근할 수 없도록 막고(접근제어자 private 사용), 메소드는 공개해서 외부에서 메소드를 통해 필드에 접근하도록 유도.
// 그 이유는 메소드는 매개값을 검증해서 유효한 값만 객체의 필드로 저장(Setter)할 수 있기 때문
// 외부에서 객체의 데이터를 읽을 때도 Getter 이용하는 것이 좋음. 
// 필드 값을 가공한 후 외부로 전달하는 역할

/* getter setter 형태
private 타입 fieldName;

// Getter
public 리턴타입 getFieldName() {   // 필드 타입이 boolean일 경우, getter는 isFieldName 으로 하는 것이 관례
	return fieldName;
}

// Setter
public void setFieldName(타입 fieldNamae) {
	this.fieldName = fieldName;
} */
public class Car {

	// 필드
	private double speed;
	private boolean stop;

	public double getSpeed() { // set한 speed 값을 가공(마일 -> km)하여 외부로 리턴함
		double km = this.speed * 1.6;
		return km;
	}

	public void setSpeed(double speed) { // 매개값이 음수일 경우 speed 필드에 0으로 저장하고 메소드 실행 종료(return)
		if (speed < 0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}

	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}

}
