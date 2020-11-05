package kr.co.hta.vo;

import java.util.Date;

public class Book {
	
	private int book_no;
	private String book_title;
	private String book_writer;
	private String book_genre;
	private int book_price;
	private int book_stock;
	private Date book_create_date;
	
	public Book() { super(); }
	public Book(int book_no, String book_titel, String book_writer, String book_genre, int book_price, int book_stock,
			Date book_create_date) {
		super();
		this.book_no = book_no;
		this.book_title = book_titel;
		this.book_writer = book_writer;
		this.book_genre = book_genre;
		this.book_price = book_price;
		this.book_stock = book_stock;
		this.book_create_date = book_create_date;
	}

	public void setBook_no(int book_no) {
		this.book_no = book_no;
	}
	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}
	public void setBook_writer(String book_writer) {
		this.book_writer = book_writer;
	}
	public void setBook_genre(String book_genre) {
		this.book_genre = book_genre;
	}
	public void setBook_price(int book_price) {
		this.book_price = book_price;
	}
	public void setBook_stock(int book_stock) {
		this.book_stock = book_stock;
	}
	public void setBook_create_date(Date book_create_date) {
		this.book_create_date = book_create_date;
	}
	
	public int getBook_no() {
		return book_no;
	}
	public String getBook_title() {
		return book_title;
	}
	public String getBook_writer() {
		return book_writer;
	}
	public String getBook_genre() {
		return book_genre;
	}
	public int getBook_price() {
		return book_price;
	}
	public int getBook_stock() {
		return book_stock;
	}
	public Date getBook_create_date() {
		return book_create_date;
	}
	
	
}
