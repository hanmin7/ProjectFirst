package interfaces;

import java.util.Calendar;

public class MyCalender {
	public static void main(String[] args) {
//		Calendar cal = Calendar.getInstance(); // 오늘 날짜 현재 시간 기준
//		System.out.println(cal);
//		cal.set(2020, 3, 1); // 2020년4월1일꺼 불러옴.0부터시작하기때문
//		System.out.println("년도: " + cal.get(Calendar.YEAR));
//		System.out.println("월: " + cal.get(Calendar.MONTH));
//		System.out.println("일: " + cal.get(Calendar.DAY_OF_MONTH));
//		System.out.println("요일: " + cal.get(Calendar.DAY_OF_WEEK));
//		int dayOfWeek = getDayOfWeek(2020,4);
//		System.out.println(dayOfWeek);
		showCal(2020, 7);
	}

	public static void showCal(int year, int month) {
		// year, month 달력 출력.
		int today = 1;
		int lastDay = getLastDay(year, month);
		int dayOfWeek = getDayOfWeek(year,month);
		System.out.println("\t" + " [" + year + "년" + month + "월]" + "\t");
		String[] week = { " Sun", " Mon", " Tue", " Wed", " thr", " Fri", " Sat" };
		for (int i = 0; i < week.length; i++) {
			System.out.print(week[i]);
		}
		System.out.println();
		for (int i = 1; i < dayOfWeek; i++) {
			System.out.printf("%4s", " ");
		}
		for (int i = 0; i < lastDay; i++) {
			System.out.printf("%4d", today);
			// d가 10진수 10진수공란을 3개 만들겠다는 뜻
			if ((today + dayOfWeek - 1) % 7 == 0)
				System.out.println();
			today++;
		
		}
		System.out.println();
		System.out.println("\t" + "프로그램 종료");
	}

//	public static int getDayOfWeek(int month) {
//		int dayOfWeek = 0;
//		// 일(1), 월(2), 화(3)...
//		if (month == 5) {
//			dayOfWeek = 6; // 금부터 시작..
//		} else if (month == 6) {
//			dayOfWeek = 2; // 월
//		}
//		return dayOfWeek;
//	}

	public static int getDayOfWeek(int year, int month) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, 1);
		int dayOfWeek = 0;
		dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		return dayOfWeek;
	}

	public static int getLastDay(int year, int month) {

		int lastDay = 0;
		if ((month <= 7 && month % 2 == 1) || (month >= 8 && month % 2 == 0)) {
			lastDay = 31;
		} else if (month == 2) {
			// 윤년 규칙 : 년도가 4로 나누어지면서 100으로 나누어지지않는 해, 400으로 나누어지는 해.
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
				;
			else
				lastDay = 28;
		} else {
			lastDay = 30;
		}
		return lastDay;
	}
}
