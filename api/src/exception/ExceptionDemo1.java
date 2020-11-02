package exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @FileName : ExceptionDemo1.java
 * @Project : api
 * @author	:user
 * @Date	:2020. 10. 29.
 * @Time    :오전 11:18:56
 */
public class ExceptionDemo1 {
	
	public static void main(String[] args) {
		// 생일을 입력받아서 태어난지 몇 일재인지 알려주는 프로그램
		Scanner sc = new Scanner(System.in);
		
		System.out.print("생일을 입력하세요(YYYY-MM-DD)");
		String text = sc.next();
		
		try {
			SimpleDateFormat df = new SimpleDateFormat("yyyy-mm-dd");
			Date birthday = df.parse(text); // 예외발생이 예상되는 수행문
			
			// 현재 날짜 Date 참조변수
			Date now = new Date();
			long birthdayUnixTime = birthday.getTime();
			long noeUnixTime = now.getTime(); 
			
			// 1000 : 유닉스 타임이 1/1000초라 1000을 곱함
			// 1) 60 : 초
			// 2) 60 : 분
			// 24 : 하루 시간
			long days = (noeUnixTime - birthdayUnixTime) / (1000 * 60 * 60 * 24);
		
			System.out.println("태어난 날: " + text);
			System.out.println("살아온 일 수: " + days);
		} catch(ParseException ex) { // 발생이 예상되는 예외를 잡는 곳, 예외를 전달받는 변수를 정의
			System.out.println("오류가 발생하였습니다.");
			System.out.println(ex);
		}
	}
}
