package formatting;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatDemo {
	public static void main(String[] args) {
		Date now = new Date();
		
		SimpleDateFormat df1 = new SimpleDateFormat("yyyy");
		String text1 = df1.format(now);
		System.out.println(text1);
		
		SimpleDateFormat df2 = new SimpleDateFormat("yyyy-MM-dd");
		String text2 = df2.format(now);
		System.out.println(text2);
		
		SimpleDateFormat df3 = new SimpleDateFormat("yyyy-M-d");
		String text3 = df3.format(now);
		System.out.println(text3);
		
		SimpleDateFormat df4 = new SimpleDateFormat("yyyy년 M월 d일 EEEE");
		String text4 = df4.format(now);
		System.out.println(text4);
		
		SimpleDateFormat df5 = new SimpleDateFormat("a hh:mm:ss:S");
		String text5 = df5.format(now);
		System.out.println(text5);
		
		SimpleDateFormat df6 = new SimpleDateFormat("HH:mm:ss:S");
		String text6 = df6.format(now);
		System.out.println(text6);
		
		SimpleDateFormat df7 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:S");
		String text7 = df7.format(now);
		System.out.println(text7);
		
		SimpleDateFormat df8 = new SimpleDateFormat("yyyy년 MM월dd일 EEEE h시 mm분 ss초 S");
		String text8 = df8.format(now);
		System.out.println(text8);
	}
}
