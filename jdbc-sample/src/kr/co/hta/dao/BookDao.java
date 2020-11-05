package kr.co.hta.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import kr.co.hta.util.ConnectionUtil;
import kr.co.hta.vo.Book;

/**
 * SAMPLE_BOOKS 테이블을 대상으로 책정보 조회, 추가, 삭제, 변경 작업이 구현된 클래스다
 * @FileName : BookDao.java
 * @Project : jdbc-sample
 * @author	:user
 * @Date	:2020. 11. 5.
 * @Time    :오후 4:25:50
 */
public class BookDao {
	
	private static final String DELETE_BOOK_SQL = "delete from sample_books where book_no = ?";
	private static final String SELECT_ALL_BOOKS_SQL = "SELECT * FROM SAMPLE_BOOKS";
	
	/**
	 * 지정된 책번호에 해당하는 책정보를 데이터베이스에서 삭제한다.
	 * @param bookNo 삭제할 책번호
	 * @throws SQLException 
	 */
	public void deleteBookByNo(int bookNo) throws SQLException {
		Connection con = ConnectionUtil.getConnection();
		PreparedStatement pstmt = con.prepareStatement(DELETE_BOOK_SQL);
		pstmt.setInt(1, bookNo);
		pstmt.executeUpdate();
		
		pstmt.close();
		con.close();
	}
	
	/**
	 * SAMPLE_BOOKS 테이블에 저장된 모든 책정보를 반환한다.
	 * @return 책정보(Book객체에 저장된 책정보)가 여러 개 저장되어 있는 ArrayList객체
	 * @throws SQLException
	 */
	public List<Book> selectAllBooks() throws SQLException {
		List<Book> bookList = new ArrayList<Book>();
		
		Connection con = ConnectionUtil.getConnection();
		PreparedStatement pstmt = con.prepareStatement(SELECT_ALL_BOOKS_SQL);
		
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			int book_no = rs.getInt("book_no");
			String book_title = rs.getString("book_title");
			String book_writer = rs.getString("book_writer");
			String book_genre = rs.getString("book_genre");
			int book_price = rs.getInt("book_price");
			int book_stock = rs.getInt("book_stock");
			Date book_create_date = rs.getDate("book_create_date");
			
			//Book book = new Book(book_no, book_title, book_writer, book_genre, book_price, book_stock, book_create_date);
			Book book = new Book();
			book.setBook_no(book_no);
			book.setBook_title(book_title);
			book.setBook_writer(book_writer);
			book.setBook_genre(book_genre);
			book.setBook_price(book_price);
			book.setBook_stock(book_stock);
			book.setBook_create_date(book_create_date);
			
			bookList.add(book);
		}
		rs.close();
		pstmt.close();
		con.close();
		
		return bookList;
	}
	
	
	/**
	 * 
	 * @param bookNo
	 * @return
	 * @throws SQLException
	 */
	public Book selectBookByNo(int bookNo) throws SQLException {
		Book book = null;
		
		return book;
	}
}
