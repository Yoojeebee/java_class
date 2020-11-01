package repo;

import java.util.ArrayList;

import vo.Order;

public class OrderRepository {

	private ArrayList<Order> database = new ArrayList<>();
	
	public OrderRepository() {
		database.add(new Order("hong", "홍길동", 10000, "이것이자바다", 35000, 1));
		database.add(new Order("lee", "이순신", 10003, "핸즈온머신러닝", 55000, 1));
		database.add(new Order("kang", "강감찬", 10004, "혼자공부하는자바", 21000, 2));
		database.add(new Order("hong", "홍길동", 10005, "모두의딥러닝", 24000, 1));
	}
	
	/**
	 * 전달받은 주문정보를 ArrayList에 저장한다.
	 * @param order 새 주문정보
	 */
	public void insertOrder(Order order) {
		// 새로운 주문정보를 전달받아서 ArrayList<Order>에 추가한다.
	}
	
	/**
	 * 모든 주문정보를 반환한다.
	 * @return 모든 주문정보가 저장된 ArrayList객체
	 */
	public ArrayList<Order> getAllOrders() {
		// 모든 주문정보가 저장된 ArrayList<Order>객체를 반환한다.
		return database;
	}

}