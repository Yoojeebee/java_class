package exception;

import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @FileName : ExceptionDemo3.java
 * @Project : api
 * @author	:user
 * @Date	:2020. 10. 29.
 * @Time    :오후 12:39:18
 */
public class ExceptionDemo3 {

	static void writeReulst(String fileName, String birth, long days) throws IOException {
		FileWriter writer = new FileWriter(fileName); // IOException이 일어나는 수행문
		writer.write("생일: " + birth + "\n");
		writer.write("날짜: " + days + "\n");
		writer.close();
	}
	
	static long getDays(Date start, Date end) {
		long birthdayUnixTime = start.getTime();
		long noeUnixTime = end.getTime(); 
		return (noeUnixTime - birthdayUnixTime) / (1000 * 60 * 60 * 24);
	}
	
	// 날짜 계산하기
	// 생일을 전달받아서 Date로 변환
	// getDays()를 호출해서 날짜수를 반환받는다
	// writeDays()를 호출해서 계산된 결과를 파일로 기록한다
	static void calculateDays(String str) throws ParseException, IOException {		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-mm-dd");
		Date now = new Date();
		
		// ParseException이 일어나는 수행문
		// parse() 메소드가 발생시키는 예외를 위임
		Date birthday = df.parse(str);
		
		long days = ExceptionDemo3.getDays(birthday, now);
		
		// IOException이 일어나는 수행문
		// writeResult() 메소드가 예외처리를 위임한 예외를 다시 위임
		ExceptionDemo3.writeReulst("result.txt", str, days); // IOException이 일어나는 수행문
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[날짜를 계산해 보세요]");
		System.out.print("기념일을 입력하세요: ");
		String text = sc.next();

		try {
			ExceptionDemo3.calculateDays(text);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.err.println("날짜변환 오류 발생");
			
			// Throwable클래스 -> String getMessage() : 오류메세지 반환
			String errorMessage = e.getMessage();
			System.err.println("에러메세지:" + errorMessage);
			// void printStackrace() 오류가 발생한 코드정보를 실행순서대로 화면에 출력
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("결과 기록중 오류 발생");
		}
		
		sc.close();
	}
	
}
