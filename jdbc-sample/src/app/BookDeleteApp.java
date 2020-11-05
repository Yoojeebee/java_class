package app;

import java.util.Scanner;

import kr.co.hta.dao.BookDao;

public class BookDeleteApp {
	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("[책 정보 삭제하기]");
		
		System.out.print("책번호: ");
		int bookNo = scanner.nextInt();
		
		BookDao bookDao = new BookDao();
		bookDao.deleteBookByNo(bookNo);
		
		System.out.println("### 책정보가 삭제되었습니다.");
		
		scanner.close();
		
	}
}
