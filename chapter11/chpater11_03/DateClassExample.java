package chpater11_03;

import java.text.SimpleDateFormat;
import java.util.Date;

// Date 클래스, 특정 시점의 날짜를 표현하는 클래스
// 특정 시점의 연도, 월, 일, 시간 정보가 저장됨

public class DateClassExample {

	public static void main(String[] args) {
		Date date = new Date(); // Date 객체 생성
		System.out.println(date.toString()); // Date 객체의 toString() 메소든느 영문으로 된 날짜를 리턴

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초"); // SimpleDateFormat 클래스와 함께 사용
		String strDate = sdf.format(date); // SimpleDateFormat 생성자의 매개값은 형식 문자열, 여기에 포함되는 기호는 API 도큐먼트 SimpleDateFormat 도큐먼트에 잘 나와있다
		System.out.println(strDate);
		System.out.println(sdf.format(date));
	}

}
