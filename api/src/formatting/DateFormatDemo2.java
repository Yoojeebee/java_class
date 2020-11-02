package formatting;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateFormatDemo2 {
	public static void main(String[] args) throws ParseException {
		// 기념일 계산 프로그램
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-mm-dd");
		Date today = new Date();
		
		System.out.print("날짜를 입력하세요(입력 예: 2020-06-12): ");
		String text = sc.next();
		
		Date date = df.parse(text);
		
		long todayTime = today.getTime();
		long memoryDayTime = date.getTime();
		
		long day = (todayTime - memoryDayTime)/(24*60*60*1000);
		System.out.println("오늘까지 " + day + "일이 지났습니다.");
		
		sc.close();
	}
}
