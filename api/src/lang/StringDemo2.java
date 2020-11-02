package lang;

import java.util.Scanner;

public class StringDemo2 {

	public static void main(String[] args) {
		String password = "zxcv1234";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("비밀번호를 입력: ");
		String pwd = scanner.next();
		System.out.println("사용자가 입력한 비밀번호: " + pwd);
		
		// ==: 동일성(객체 비교)
		// equals(): 동등성(값 비교)
		
		String str = new String("zxcv1234");
		
		boolean result1 = password == pwd;
		boolean result2 = password.equals(pwd);
		boolean result3 = password.equals(str);
		
		System.out.println("result1의 결과: " + result1);
		System.out.println("result2의 결과: " + result2);
		System.out.println("result3의 결과: " + result3);
		
		scanner.close();
	}

}
