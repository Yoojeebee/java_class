package app;

import java.sql.SQLException;
import java.util.List;

import kr.co.hta.dao.BookDao;
import kr.co.hta.vo.Book;

public class BookSelectAllDemo {

	public static void main(String[] args) throws SQLException {
		BookDao bookDao = new BookDao();
		List<Book> books = bookDao.selectAllBooks();
		for(Book book : books) {
			System.out.println();
			System.out.print("책번호: " + book.getBook_no() + ", ");
			System.out.print("책제목: " + book.getBook_title() + "\n");
		}
	}
	
}
