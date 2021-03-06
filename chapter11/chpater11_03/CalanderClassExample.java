package chpater11_03;

import java.util.Calendar;

// 추상클래스이므로 new연산자를 사용해서 인스턴스 생성 불가능. 
// 운영체제의 날짜와 시간을 얻을 때 사용

public class CalanderClassExample {

	public static void main(String[] args) {

		//Calendar 클래스의 정적 메소드인 getInstance() 메소드를 이용하면 현재 운영체제를 기준으로 한 하위 객체를 얻을 수 있다
		Calendar now = Calendar.getInstance(); 

		// 해당 운영체제의 Calendar 객체를 얻으면, 연도, 월, 일, 오전/오후, 시간 등의 정보 얻을 수 있다
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1; // 0이 1월
		int day = now.get(Calendar.DAY_OF_MONTH);
		int week = now.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;
		switch (week) {
		case Calendar.MONDAY: // 일요일이 1, 월요일이 2
			strWeek = "월";
			break;
		case Calendar.TUESDAY:
			strWeek = "화";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "수";
			break;
		case Calendar.THURSDAY:
			strWeek = "목";
			break;
		case Calendar.FRIDAY:
			strWeek = "금";
			break;
		case Calendar.SATURDAY:
			strWeek = "토";
			break;
		case Calendar.SUNDAY:
			strWeek = "일";
			break;
		}
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		if (amPm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}

		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);

		System.out.print(year + "년 ");
		System.out.print(month + "월 ");
		System.out.print(day + "일 ");
		System.out.print(strWeek + "요일 ");
		System.out.print(strAmPm + " ");
		System.out.print(hour + "시 ");
		System.out.print(minute + "분 ");
		System.out.print(second + "초 ");

	}
}
