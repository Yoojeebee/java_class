package util;

import java.util.Calendar;

public class CalenderDemo {

	public static void main(String[] args) {
		// g현재 날짜와 시간 및 부가적인 정보를 가지는 Calendar 객체 생성
		Calendar cal = Calendar.getInstance();
		
		// 년도 조회
		// Calendar.YEAR -> 현재 년도가 나옴(static final 변수)
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONDAY);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		int ampm = cal.get(Calendar.AM_PM);
		int hour12 = cal.get(Calendar.HOUR);
		int hour24 = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println("년도: " + year);
		System.out.println("월: " + month);
		System.out.println("일: " + day);
		System.out.println("요일: " + dayOfWeek);  // 1: 일, 2: 월, ... 8:일
		System.out.println("오전오후: " + ampm);   // 0:오전, 1: 오후
		System.out.println("12시간: " + hour12);
		System.out.println("24시간: " + hour24);
		System.out.println("분: " + minute);
		System.out.println("초: " + second);
	}

}
