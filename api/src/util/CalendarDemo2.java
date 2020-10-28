package util;

import java.util.Calendar;

public class CalendarDemo2 {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		Calendar cal = Calendar.getInstance();
		
		// Calendar객체의 년/월/일을 특정한 년/월/일 변경하기
		cal.set(Calendar.YEAR, 1994);
		cal.set(Calendar.MONTH, 8);
		cal.set(Calendar.DAY_OF_MONTH, 13);
		
		long nowUnixTime = now.getTimeInMillis();
		long birthdayUnixTime = cal.getTimeInMillis();
		// 24: 하루시간
		// 60: 시간(분)
		// 60: 시간(초)
		// 1000: getTimeInMillis가 1000을 조깬 숫자이기 때문에
		long day = (nowUnixTime - birthdayUnixTime)/(24*60*60*1000);
		
		System.out.println(cal);
		System.out.println("살아온 날: " + day);
	}
}
