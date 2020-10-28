package util;

import java.util.Date;
import java.util.Calendar;

public class CalendarDemo3 {

	public static void main(String[] args) {
		// Calendar객체와 Date객체의 관계
		
		// Calendar객체에서 Date객체 획득
		// 현재 날짜와 시간정보가 포함된 Calendar객체 생성
		Calendar cal = Calendar.getInstance();
		
		// Calendar 객체로부터 Date 객체 획득
		Date dateFromCalendar = cal.getTime();
		
		
		// Date 객체로부터 Calendar객체 획득
		// 현재 날짜와 시간정보가 포함된 Calendar 객체 생성
		Calendar calendarFromDate = Calendar.getInstance();
		
		// Calendar 객체의 날짜 시간정보를 Date객체의 값으로 변경
		Date date = new Date(999999999999L);
		calendarFromDate.setTime(date);
		
		System.out.println(calendarFromDate);
	}

}
