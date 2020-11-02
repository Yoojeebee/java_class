package exception;

import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ExceptionDemo2 {
	
	public static void main(String[] args) {
		try {
			ExceptionDemo2.calculateDays();
			ExceptionDemo2.writeText();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.err.println("날짜 변환 중 오류가 발생");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("파일 쓰기작업 중 오류가 발생");
		}
	}
	
	public static void writeText() throws IOException {
		FileWriter writer = new FileWriter("sample.txt");
		writer.write("안녕하세요");
		writer.close();
	}

	public static void calculateDays() throws ParseException {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("생일을 입력하세요(YYYY-MM-DD)");
		String text = sc.next();
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-mm-dd");
		Date birthday = df.parse(text); // 예외발생이 예상되는 수행문
		Date now = new Date();
		
		long birthdayUnixTime = birthday.getTime();
		long noeUnixTime = now.getTime(); 
		
		long days = (noeUnixTime - birthdayUnixTime) / (1000 * 60 * 60 * 24);
		System.out.println("살아온 날짜 수: " + days);
		
		sc.close();
	}

}
