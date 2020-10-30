package vo;

import java.util.concurrent.atomic.AtomicLong;

public class Book {
	/*************/
	/* 멤버 변수 */
	
	// 10000번 부터 숫자 시작
	private static AtomicLong atom = new AtomicLong(10000);
	
	private long no;
	private String title;
	private String writer;
	private String genre;
	private int price;
	private int stock;
	
	/**************/
	/*** 생성자 ***/
	public Book() {
		super();
	}
	public Book(String title, String writer, String genre, int price) {
		super();
		this.no = atom.getAndIncrement();
		this.title = title;
		this.writer = writer;
		this.genre = genre;
		this.price = price;
		this.stock = 100;
	}
	
	/**************/
	/*** 메서드 ***/
	
	// Getter 메서드
	public long getNo() {
		return no;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getWriter() {
		return writer;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public int getPrice() {
		return price;
	}
	
	public int getStock() {
		return stock;
	}
	
	// Setter 메서드
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	@Override
	public String toString() {
		return "Book [no=" + no + ", title=" + title + ", writer=" + writer + ", genre=" + genre + ", price=" + price
				+ ", stock=" + stock + "]";
	}
	
}
