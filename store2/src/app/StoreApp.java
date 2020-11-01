package app;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import service.Service;
import vo.Book;
import vo.Order;
import vo.User;

public class StoreApp {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Service service = Service.getInstance();

		while(true) {
			System.out.println("========================================================");
			System.out.println("1.도서\t\t 2.주문 \t 3.회원 \t 0.종료");
			System.out.println("========================================================");			

			System.out.print("메뉴선택 > ");
			int mainMenu = sc.nextInt();

			if(mainMenu == 1) {
				System.out.println("[도서관리]");
				System.out.println("========================================================================");
				System.out.println("1.전체조회\t2.검색 \t\t 3.등록 \t 4.변경");
				System.out.println("========================================================================");
				System.out.println();
				
				System.out.print("도서관리 메뉴 선택 > ");
				int bookMenu = sc.nextInt();
				
				if(bookMenu == 1) {
					ArrayList<Book> books = service.getBookService().getBooks();
					System.out.println("[전체 도서 조회]");
					if(!books.isEmpty()) {
						System.out.println("--------------------------------------------------------");
						for(Book book : books) {
							System.out.println("책 번 호: " + book.getNo());
							System.out.println("책 이 름: " + book.getTitle());
							System.out.println("저    자: " + book.getWriter());
							System.out.println("장    르: " + book.getGenre());
							System.out.println("가    격: " + book.getPrice());
							System.out.println("수    량: " + book.getStock());
							System.out.println();
						}
					} else {
						System.out.println("##### 등록된 책 정보가 없습니다!");
					}
					
				} else if(bookMenu == 2) {
					System.out.println("[도서 검색]");
					System.out.println("제목(t,제목) 또는 저자(w,저자) 또는 가격(p,최소가격,최대가격)을 입력:");
					String[] search = sc.next().split(",");
					
					ArrayList<Book> searchBooks = new ArrayList<Book>();
					if(search[0].equals("t")) {
						searchBooks = service.getBookService().searchBooksByTitle(search[1]);
					} else if(search[0].equals("w")) {
						searchBooks = service.getBookService().searchBooksByWriter(search[1]);
					} else if(search[0].equals("p")) {
						searchBooks = service.getBookService().searchBooksByPrice(Integer.parseInt(search[1]), Integer.parseInt(search[2]));
					} else {
						System.out.println("잘못 입력하셨습니다!");
					}
					
					if(!searchBooks.isEmpty()) {
						System.out.println("--------------------------------------------------------");
						for(Book book : searchBooks) {
							System.out.println("책 번 호: " + book.getNo());
							System.out.println("책 이 름: " + book.getTitle());
							System.out.println("저    자: " + book.getWriter());
							System.out.println("장    르: " + book.getGenre());
							System.out.println("가    격: " + book.getPrice());
							System.out.println("수    량: " + book.getStock());
							System.out.println();
						}
					} else {
						System.out.println("##### 등록된 책 정보가 없습니다!");
					}
					
					
				} else if(bookMenu == 3) {
					System.out.println("[신규 도서 등록]");
					
					System.out.print("책제목 입력: "); 
					String bookName = sc.next();
					
					System.out.print("저자 입력: "); 
					String bookWriter = sc.next();
					
					System.out.print("장르 입력: "); 
					String bookGenre = sc.next();
					
					System.out.print("가격 입력: "); 
					int bookPrice = sc.nextInt();
					
					Book book = new Book(bookName, bookWriter, bookGenre, bookPrice);

					service.getBookService().insertNewBook(book);
					System.out.println("##### 신규 책 등록이 완료되었습니다.");
					
				} else if(bookMenu == 4) {
					System.out.println("[도서 정보 변경]");
					System.out.println("책 제목과 작가를 입력하세요(제목,작가): ");
					String[] search = sc.next().split(",");
					
					ArrayList<Book> books = service.getBookService().getBooks();
					for(Book book : books) {
						if(book.getTitle().equals(search[0]) && book.getWriter().equals(search[1])) {
							System.out.println("##### 변경 전");
							System.out.println("책 번 호: " + book.getNo());
							System.out.println("책 이 름: " + book.getTitle());
							System.out.println("저    자: " + book.getWriter());
							System.out.println("장    르: " + book.getGenre());
							System.out.println("가    격: " + book.getPrice());
							System.out.println("수    량: " + book.getStock());
							System.out.println();
							if(service.getBookService().updateBook(book)) {
								System.out.println("##### 변경후");
								System.out.println("책 번 호: " + book.getNo());
								System.out.println("책 이 름: " + book.getTitle());
								System.out.println("저    자: " + book.getWriter());
								System.out.println("장    르: " + book.getGenre());
								System.out.println("가    격: " + book.getPrice());
								System.out.println("수    량: " + book.getStock());
								System.out.println();
								break;
							} else {
								System.out.println("#### 아무것도 변경하지 않았습니다.");
							}
						} else {
							System.out.println("#### 잘못 입력하셨습니다.");
						}
					}	
				}  
				
				
			} else if(mainMenu == 2) {
				System.out.println("[주문관리]");
				System.out.println("========================================================================");
				System.out.println("1.주문조회\t2.주문하기 \t 3.취소 \t 4.전체조회");
				System.out.println("========================================================================");
				System.out.println();
				
				System.out.print("주문관리 메뉴 선택 > ");
				 int orderMenu = sc.nextInt();
				 
				 if (orderMenu == 1) {
					 System.out.println("[주문 조회]");
					 // 사용자아이디를 입력받아서 그 사용자가 주문한 내역을 출력한다.
					 System.out.print("사용자아이디 입력 > ");
					 String userId = sc.next();
					 ArrayList<Order> orders = service.getOrderService().getOrdersByUserId(userId);
					 for(Order order : orders) {
						 System.out.println("--------------------------------------------------------");
						 System.out.println("no: " + order.getNo());
						 System.out.println("아이디: " + order.getUserId());
						 System.out.println("이름: " + order.getUserName());
						 System.out.println("책번호: " + order.getBookNo());
						 System.out.println("책이름: " + order.getBookName());
						 System.out.println("주문가격: " + order.getOrderPrice());
						 System.out.println("주문수: " + order.getOrderAmount());
						 if(order.isCanceled()) {
							 System.out.println("주문이 취소된 상품입니다!");
						 }
					 }
				 } else if (orderMenu == 2) {
					 System.out.println("[주문하기]");
					 // 상품번호, 사용자아이디, 주문수량을 입력받아서 상품을 주문한다.
					 ArrayList<Book> books = service.getBookService().getBooks();
					 for(Book book : books) {
						 System.out.println("상품번호: " + book.getNo());
						 System.out.println("상품 이름: " + book.getTitle());
					 }
					 System.out.print("상품번호 입력 > ");
					 long bookNo = sc.nextLong();
					 
					 System.out.print("사용자아이디 입력 > ");
					 String userId = sc.next();
					 
					 System.out.print("주문수량 입력 > ");
					 int amount = sc.nextInt();

					 service.getOrderService().addNewOrder(userId, bookNo, amount);
				 } else if (orderMenu == 3) {
					 System.out.println("[주문 취소하기]");
					 // 주문번호를 입력받아서 그 주문을 취소처리한다.
					 ArrayList<Order> orders = service.getOrderService().getAllOrders();
					 for(Order order : orders) {
						 System.out.println("주번호: " + order.getNo() + ", 아이디: " + order.getUserId());
					 }

					 System.out.print("취소시킬 주문번호: ");
					 int orderNo = sc.nextInt();
					 service.getOrderService().canceledOrder(orderNo);


				 } else if (orderMenu == 4) {
					 System.out.println("[전체 주문 조회]");
					 // 모든 주문정보를 출력한다.
					 ArrayList<Order> orders = service.getOrderService().getAllOrders();
					 for(Order order : orders) {
						 System.out.println("--------------------------------------------------------");
						 System.out.println("no: " + order.getNo());
						 System.out.println("아이디: " + order.getUserId());
						 System.out.println("이름: " + order.getUserName());
						 System.out.println("책번호: " + order.getBookNo());
						 System.out.println("책이름: " + order.getBookName());
						 System.out.println("주문가격: " + order.getOrderPrice());
						 System.out.println("주문수: " + order.getOrderAmount());
						 if(order.isCanceled()) {
							 System.out.println("주문이 취소된 상품입니다!");
						 }
					 }
				 }
				
			} else if(mainMenu == 3) {
				System.out.println("[회원관리]");
				System.out.println("========================================================================");
				System.out.println("1.전체조회\t2.조회 \t\t 3.등록 \t 4.변경 \t 5.탈퇴");
				System.out.println("========================================================================");
				System.out.println();
				
				System.out.print("회원관리 메뉴 선택 > ");
				int userMenu = sc.nextInt();
				
				if(userMenu == 1) {
					System.out.println("[전체 회원 조회]");
					ArrayList<User> users = service.getUserService().getUsers();
					if(!users.isEmpty()) {
						System.out.println("--------------------------------------------------------");
						for(User user : users) {
							System.out.println("아 이 디: " + user.getId());
							System.out.println("이    름: " + user.getName());
							System.out.println("이 메 일: " + user.getEmail());
							System.out.println();
						}
					} else {
						System.out.println("##### 등록된 사용자 정보가 없습니다!");
					}
				} else if(userMenu == 2) {
					System.out.println("[회원 조회]");
					
				} else if(userMenu == 3) {
					System.out.println("[신규 회원 등록]");
					System.out.println("신규 회원정보를 입력하세요!");
					
					// 1. id, name, email, password를 입력받는다.
					System.out.print("아이디 입력: "); 
					String id = sc.next();
					System.out.print("이름 입력: "); 
					String name = sc.next();
					System.out.print("이메일 입력: "); 
					String email = sc.next();
					System.out.print("비밀번호 입력: "); 
					int password = sc.nextInt();
					
					// 2. 입력받은 정보를 User 객체에 생성해 담는다
					User user = new User();
					user.setId(id);
					user.setName(name);
					user.setEmail(email);
					user.setPassword(password);
					
					// 3. UserService객체의 insertNewUser(User user)를 실행하고, User 객체를 인자로 전달
					boolean result = service.getUserService().insertNewUser(user);
					// 4. insertNewUser객체의 insertNewUser(User user)를 실행하고, 
					if(result) {
						System.out.println("##### 신규회원가입이 완료되었습니다.");
					} else {
						System.out.println("##### [오류] 회원가입 중 오류가 발생하였습니다.");
					}
					
				} else if(userMenu == 4) {
					System.out.println("[회원정보 변경]");
					
				} else if(userMenu == 5) {
					System.out.println("[회원탈퇴]");
					System.out.println("탈퇴처리할 사용자의 아이디를 입력하세요.");
					
					System.out.print("아이디 입력 > ");
					String userId = sc.next();
					
					boolean isSuccess = service.getUserService().deleteUser(userId);
					if(isSuccess) {
						System.out.println("##### 탈퇴처리 되었습니다.");
					} else {
						System.out.println("##### [오류] 존재하지 않는 사용자입니다.");
					}
				}

			} else if(mainMenu == 0) {
				System.out.println("[프로그램 종료]");
				break;
			}
			System.out.println();
		} // while문 끝
		
		sc.close();
	}// main문 끝

}
