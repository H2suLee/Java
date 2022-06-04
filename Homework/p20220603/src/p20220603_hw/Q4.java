package p20220603_hw;

import java.time.LocalDate;

public class Q4 {
	public static void main(String[] args) {
		// ~1999년생은 1,2, 2000년생~은 3,4로 7번째 자리 수정

		LocalDate now = LocalDate.now();
		String[] persons = { "010302-4", "991203-1", "969513-2", "881125-1", "050105-4" };
		int female = 0;
		int male = 0;
		int under20 = 0;

		for (int i = 0; i < persons.length; i++) {
			// 남 or 여
			char gender = persons[i].charAt(7);
			switch (gender) {
			case '1':
			case '3':
				male++;
				break;
			case '2':
			case '4':
				female++;
				break;
			}

			// under20
			int birthYear = Integer.parseInt(persons[i].substring(0, 2));
			int birthMonth = Integer.parseInt(persons[i].substring(2, 4));
			int birthDay = Integer.parseInt(persons[i].substring(4, 6));

			switch (gender) {
			case '1':
			case '2':
				birthYear += 1900;
				break;
			case '3':
			case '4':
				birthYear += 2000;
				break;
			}

			if (now.getYear() - birthYear >= 0 && now.getYear() - birthYear < 20) {
				under20++;
			} else if (now.getYear() - birthYear == 20) {
				if (birthMonth > now.getMonthValue()) {
					under20++;
				} else if (birthMonth == now.getMonthValue()) {
					if (birthDay > now.getDayOfMonth()) {
						under20++;
					}
				}
			}
		}
		System.out.println("남 " + male + ", 여 " + female);
		System.out.println("만 20세 이하 : " + under20);
	}
}
