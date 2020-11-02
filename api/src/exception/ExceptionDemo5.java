package exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @FileName : ExceptionDemo5.java
 * @Project : api
 * @author	:user
 * @Date	:2020. 10. 30.
 * @Time    :오전 9:40:53
 */
public class ExceptionDemo5 {
	
	// 1.
	// 예외처리 : try ~ catch 블록으로 예외를 잡고 처리하기
	/*
	static Date parseDate(String source) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-mm-dd");
		try {
			Date date = df.parse(source);
			return date;
		} catch(ParseException e) {
			e.printStackTrace(); // 예외발생시 수행할 수행문
		}
		return null;
	}
	*/
	
	
	// 2.
	// 예외위임 : 예외를 직접 처리하지 않고, throws로 이 메소드를 호출하는 코드에게 떠넘기기
	/*
	static Date parseDate(String source) throws ParseException {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-mm-dd");
		Date date = df.parse(source);
		return date;
	}
	*/
	
	
	// 3.
	// 사용자정의 예외발생시키기 : throw로 사용자정의 예외 강제 발생시키기
	/*
	static User findUser(String userId) {
		User savedUser = userRepo.getUserById(userId);
		if(savedUser == null) {
			throw new UserNotFoundException(userId);
		}
	}
	*/
	
	// 4.
	// 발생한 예외를 다른 예외로 바꾸기 == 연결된 예외 발생시키기 = 예외전환하기
	/*
	static Date parseDate(String source) throws HtaException {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-mm-dd");
		try {
			Date date = df.parse(source);
			return date;
		} catch(ParseException e) { // ParseException이 발생하면 catch블록이 잡아서 변수 e에 저장한다
			// - ParseException 대신 사용자정의 예외객체를 발생시킨다.
			// - ParseException 객체를 생성할 때,
			//   오류 메세지와 원래 발생한 예외객체(e에 들어있음)를 사용해서 만든다
			throw new HtaException("유효한 날짜형식이 아닙니다.", e);
		}
	}
	
	static void writeToFile(String filename, String content) throws HtaException {
		try {
			FileWriter writer = new FileWriter(filename);
			writer.write(content);
			writer.close();
		} catch(IOException e) {
			throw new HtaException("파일에 기록중 오류발생", e);
		}
	}
	*/
	
	// 연결된 예외 발생시키기
	static Date parseDate(String source) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-mm-dd");
		try {
			Date date = df.parse(source);
			return date;
		} catch(ParseException e) {
			// 사용자정의 예외로 강제발생시키기
			// 사용자정의 예외 객체에 오류메세지와 원래 발생한 예외를 전달해서 생성하기
			// SampleException 객체는 UncheckedException이기 때문에 예외를 발생시켜도
			// 예외처리(try ~ catch, throws)를 할 필요가 없다.
			throw new SampleException("유요한 날짜 형식이 아닙니다.", e);
		}
	}
	
	public static void main(String[] args) {
		String text = "ㄴ20-01-01";
		Date date = parseDate(text);
		System.out.println("Date: " + date);
	}

}
