package vo;

import java.util.concurrent.atomic.AtomicInteger;

public class Order {

	private static AtomicInteger atom = new AtomicInteger(5000);
	
	private int no;				// 주문번호
	private String userId;
	private String userName;
	private long bookNo;
	private String bookName;
	private int orderPrice;		// 책 가격
	private int orderAmount;	// 구매 수량
	private boolean canceled;	// 취소 여부
	
	public Order() {
		this.no = atom.getAndIncrement();
	}

	public Order(String userId, String userName, long bookNo, String bookName, int orderPrice, int orderAmount) {
		super();
		this.no = atom.getAndIncrement();
		this.userId = userId;
		this.userName = userName;
		this.bookNo = bookNo;
		this.bookName = bookName;
		this.orderPrice = orderPrice;
		this.orderAmount = orderAmount;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public long getBookNo() {
		return bookNo;
	}

	public void setBookNo(long bookNo) {
		this.bookNo = bookNo;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(int orderPrice) {
		this.orderPrice = orderPrice;
	}

	public int getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(int orderAmount) {
		this.orderAmount = orderAmount;
	}

	public boolean isCanceled() {
		return canceled;
	}

	public void setCanceled(boolean canceled) {
		this.canceled = canceled;
	}

}