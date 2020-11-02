package exception;

import java.util.Scanner;

public class ExceptionDemo4 {

	/**
	 * 지정된 비밀번호의 유효성을 체크한다<br/>
	 * <p>
	 * 비밀번호가 6글자 이상인지 체크한다<br/>
	 * 비밀번호가 숫자와 문자로 구성되었는지 체크한다
	 * @param password
	 * @return 위의 조건을 만족하는 경우 true를 반환한다
	 */		
	// 논리적인 오류(업무로직상의 오류)발생시 예외를 강제로 발생시킴
	static boolean checkPassword(String password) {
		if(password == null) {
			// 비밀번호가 null이면 예외 강제발생
			throw new SampleException("비밀번호가 null입니다.");
		}
		if(password.length() < 6) {
			// 비밀번호의 길이가 짧아도 예외 강제발생
			throw new SampleException("비밀번호는 6글자 이상입니다.");
		}
		
		try {
			Integer.parseInt(password);
			// password가 숫자로만 구성되어 있어도 예외 발생
			throw new SampleException("비밀번호는 숫자와 문자를 혼용해야 합니다.");
		} catch(NumberFormatException e) {
			return true;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 5; i >= 1; i--) {
			System.out.print("비밀번호를 입력: ");
			String text = sc.next();
			
			try {
				ExceptionDemo4.checkPassword(text);
				System.out.println("[" + text + "]는 사용가능한 비밀번호입니다.");
			} catch(SampleException e) {
				System.out.println("오류 메세지: " + e.getMessage());
				System.out.println("[" + (i - 1) + "] 횟수가 남았습니다.");
			}
		}
		
		sc.close();
	}

}
