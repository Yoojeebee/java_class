package service;

import java.util.ArrayList;

import repo.BookRepository;
import repo.OrderRepository;
import repo.UserRepository;
import vo.Book;
import vo.Order;

public class OrderService {
	// 책정보 조회, 변경기능 제공
	private BookRepository bookRepository = new BookRepository();
	private BookService bookService = new BookService();
	// 사용자정보 조회 기능 제공
	private UserRepository userRepository = new UserRepository();
	// 주문정보 추가/조회 기능 제공
	private OrderRepository orderRepository = new OrderRepository();
	
	/**
	 * 지정된 사용자의 모든 주문내역을 반환한다.
	 * @param userId 사용자 아이디
	 * @return 사용자가 주문한 주문정보가 저장된 ArrayList<Order> 객체
	 */
	public ArrayList<Order> getOrdersByUserId(String userId) {
		// 1. 주문자의 주문정보를 저장한 ArrayList 객체 생성
		// 2. 모든 주문정보 조회
		// 3. 조회돈 모든 주문정보를 향상된 for문으로 순회하면서
		//    전달받은 아이디와 일치하는 주문자의 주문정보 검색해서
		//    1번에서 생성한 ArrayList 객체에 저장
		// 4. 검색된 정보가 저장된 ArrayList 반환
		ArrayList<Order> userOrder = new ArrayList<Order>();
		for(Order order : getAllOrders()) {
			if(order.getUserId().equals(userId)) {
				userOrder.add(order);
			}
		}
		return userOrder;
	}
	
	/**
	 * 사용자아이디, 책번호, 주문수량을 전달받아서 주문정보를 저장하기
	 * @param userId 사용자아이디
	 * @param bookNo 책번호
	 * @param amount 구매수량
	 */
	public void addNewOrder(String userId, long bookNo, int amount) {
		// 1. UserRepository 객체의 getUserById(id) 메소드를 호출해서
		//    사용자정보를 조회한다.(사용자이름 획득)
		// 2. BookRepository 객체의 getBookByNo(no) 메소드를 호출해서
		//    책정보를 조회한다.(책제목, 가격, 재고량 획득)
		// 3. Order 객체를 생성해서 주문정보를 저장한다.
		//    (사용자아이디, 사용자이름, 책번호, 책제목, 가격, 구매수량)
		// 4. BookService의 updateBookStock(no, amount)를 호출해서 책의 재고량을 변경한다.
		//    책의 재고량을 변경한다.
		// 5. OrderRepository의 insertOrder(Order) 메소드를 호출해서
		//    3번에서 생성한 Order 객체를 저장한다.
		String userName = userRepository.getUserById(userId).getName();
		Book book = bookRepository.getBookByNo(bookNo);
		String bookName = book.getTitle();
		int orderPrice = book.getPrice();
		int orderAmount = book.getStock();
		
		Order order = new Order(userId, userName, bookNo, bookName, orderPrice, orderAmount);
		bookService.updateBook(book);
	}
	
	/**
	 * 지정된 주문번호의 주문을 취소시킨다
	 * @param orderNo 취소할 주문번호
	 */
	public void cancelOrder(int orderNo) {
		// 1. OrderRepository객체의 getAllOrders()를 호출해서 모든 주문정보를 조회한다.
		// 2. 향상된 for문으로 주문정보를 순회하면서 주문번호가 일치하는 주문정보의 canceled값을 true를 설정한다.
	}
	
	/**
	 * 전달받은 주문정보를 반환한다.
	 * @return 모든 주문정보가 저장된 ArrayList객체
	 */
	public ArrayList<Order> getAllOrders() {
		return orderRepository.getAllOrders();
	}
}