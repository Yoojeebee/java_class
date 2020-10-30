package service;

import java.util.ArrayList;
import java.util.Scanner;

import repo.BookRepository;
import vo.Book;

public class BookService {
	
	private BookRepository bookRepository = new BookRepository();
	private Scanner stdIn = new Scanner(System.in);
	
	// 전체 책정보를 반환하는 기능
	/**
	 * @return
	 */
	public ArrayList<Book> getBooks() {
		// - 모든 책 정보를 관리하는 BookRepository 객체의 메소드를 사용하면
		// 	 책 정보를 조회할 수 있다
		// - BookRepository객체의 getAllBooks() 메소드를 실행하면
		//   모든 책정보가 저장된 ArrayList<Book> 객체를 반환받을 수 있다.
		// - 반환받은 ArrayList<Book> 객체를 이 메소드를 호출한 메소드에게
		//   반환한다
		return bookRepository.getAllBooks();
	}
	
	
	// 제목으로 책정보를 검색하는 기능
	/**
	 * 지정된 제목을 포함하고 있는 모든 책을 반환한다.<br/>
	 * @param title 검색할 제목
	 * @return 제목이 포함된 모든 책정보가 저장된 ArrayList 객체
	 */
	public ArrayList<Book> searchBooksByTitle(String title) {
		// - 모든 책정보를 조회한 다음, 전달받은 제목을 포함하고 있는 책만
		//   찾아서 ArrayList<Book> 객체에 저장한 다음, 이 메소드를 호출한 메서드에게
		//   ArrayList<Book> 객체를 반환한다
		// 		1. 제목이 포함된 책들을 담을 ArrayList<Book> 객체를 생성한다.
		//		2. 책정보를 관리하는 BookRepository 객체의 getAllBooks() 메서드를
		//		   실행해서 모든 책정보가 저장된 ArrayList<Book>객체를 제공받는다.
		//      3. 제공받은 ArrayList<Book> 객체에 저장된 Book객체들을
		// 		   향상된 for문을 이용해서 하나씩 순서대로 조회한 다음
		//		   전달받은 제목을 포함하고 있는 Book 객체가 있다면 1번에서 생성한 ArrayList<Book> 객체에 저장한다.
		// 		4. 향상된 for문을 실행이 끝나면 1번에서 생성한 ArrayList<Book> 객체에 검색결과가 모두 저장하게 된다.
		//		5. 호출한 메소드에게 1번에서 생성한 ArrayList<Book> 객체를 반환한다.
		ArrayList<Book> searchBooks = new ArrayList<Book>();
		for(Book book : getBooks()) {
			if(book.getTitle().equals(title)) {
				searchBooks.add(book);
			}
		}
		return searchBooks;
	}
	
	
	// 저자로 책정보를 검색하는 기능
	/**
	 * 지정된 작가를 포함하고 있는 모든 책을 반환한다.<br/>
	 * @param writer 검색할 제목
	 * @return 저자가 포함된 모든 책정보가 저장된 ArrayList 객체
	 */
	public ArrayList<Book> searchBooksByWriter(String writer) {
		// - 모든 책정보를 조회한 다음, 전달받은 제목을 포함하고 있는 책만
		//   찾아서 ArrayList<Book> 객체에 저장한 다음, 이 메소드를 호출한 메서드에게
		//   ArrayList<Book> 객체를 반환한다
		// 		1. 제목이 포함된 책들을 담을 ArrayList<Book> 객체를 생성한다.
		//		2. 책정보를 관리하는 BookRepository 객체의 getAllBooks() 메서드를
		//		   실행해서 모든 책정보가 저장된 ArrayList<Book>객체를 제공받는다.
		//      3. 제공받은 ArrayList<Book> 객체에 저장된 Book객체들을
		// 		   향상된 for문을 이용해서 하나씩 순서대로 조회한 다음
		//		   전달받은 제목을 포함하고 있는 Book 객체가 있다면 1번에서 생성한 ArrayList<Book> 객체에 저장한다.
		// 		4. 향상된 for문을 실행이 끝나면 1번에서 생성한 ArrayList<Book> 객체에 검색결과가 모두 저장하게 된다.
		//		5. 호출한 메소드에게 1번에서 생성한 ArrayList<Book> 객체를 반환한다.
		ArrayList<Book> searchBooks = new ArrayList<Book>();
		for(Book book : getBooks()) {
			if(book.getWriter().equals(writer)) {
				searchBooks.add(book);
			}
		}
		return searchBooks;
	}
	
	
	// 가격으로 책정보를 검색하는 기능
	/**
	 * @param 입력받은 최소가격, 최대가격
	 * @return 입력받은 최소,최대 가격을 database에서 찾아 같은 것은 ArrayList 객체로 반환
	 */
	public ArrayList<Book> searchBooksByPrice(int minPrice, int maxPrice) {
		// - 모든 책정보를 조회한 다음, 전달받은 제목을 포함하고 있는 책만
		//   찾아서 ArrayList<Book> 객체에 저장한 다음, 이 메소드를 호출한 메서드에게
		//   ArrayList<Book> 객체를 반환한다
		// 		1. 지정된 가격범위에 속하는 책정보를 담을 ArrayList<Book> 객체를 생성한다.
		//		2. 책정보를 관리하는 BookRepository 객체의 getAllBooks() 메서드를
		//		   실행해서 모든 책정보가 저장된 ArrayList<Book>객체를 제공받는다.
		//      3. 제공받은 ArrayList<Book> 객체에 저장된 Book객체들을
		// 		   향상된 for문을 이용해서 하나씩 순서대로 조회한 다음
		//		   최소가격보다 크면서 최대가격보다 작은 책이 있다면 1번에서 생성한 ArrayList<Book> 객체에 저장한다.
		// 		4. 향상된 for문을 실행이 끝나면 1번에서 생성한 ArrayList<Book> 객체에 검색결과가 모두 저장하게 된다.
		//		5. 호출한 메소드에게 1번에서 생성한 ArrayList<Book> 객체를 반환한다.
		ArrayList<Book> searchBooks = new ArrayList<Book>();
		for(Book book : getBooks()) {
			if(book.getPrice() >= minPrice && maxPrice >= book.getPrice() ) {
				searchBooks.add(book);
			}
		}
		return searchBooks;
	}

	
	// 신규도서를 등록하는 기능
	/**
	 * @param book
	 */
	public void insertNewBook(Book book) {
		bookRepository.insertBook(book); 
	}

	
	// 책정보를 변경하는 기능
	/**
	 * @param book
	 * @return
	 */
	public boolean updateBook(Book book) {
		boolean isChange = false;
		
		if(book != null) {
			isChange = true;
		}
		
		if(isChange) {
			System.out.print("바꾸고 싶은 정보를 고르세요. (1. 책 제목 / 2. 작가 / 3. 장르 / 4. 가격 / 5. 수량): ");
			int num = stdIn.nextInt();
			
			String text = null;
			if(num == 1) {
				System.out.println("변경할 책 제목: ");
				text = stdIn.next();
				updateBookTitle((int)book.getNo(), text);
			} else if(num == 2) {
				System.out.println("변경할 작가 이름: ");
				text = stdIn.next();
				updateBookWriter((int)book.getNo(), text);
			} else if(num == 3) {
				System.out.println("변경할 장르 이름: ");
				text = stdIn.next();
				updateBookGenre((int)book.getNo(), text);
			} else if(num == 4) {
				System.out.println("변경할 책 가격: ");
				text = stdIn.next();
				updateBookPrice((int)book.getNo(), Integer.parseInt(text));
			} else if(num ==5) {
				System.out.println("변경할 책 수량: ");
				text = stdIn.next();
				updateBookStock((int)book.getNo(), Integer.parseInt(text));
			} else {
				System.out.println("잘못 입력하셨습니다!");
			}
			System.out.println();
		}
		
		return isChange;
	}
	
	/**
	 * 책번호와 책제목을 전달받아서 해당 책의 제목이름을 변경한다.
	 * @param bookNo 책번호
	 * @param name 바뀐 책이름
	 */
	public void updateBookTitle(int bookNo, String title) {
		System.out.println("");
		Book book = bookRepository.getBookByNo(bookNo);
		book.setTitle(title);
		bookRepository.modifyBook(bookRepository.getBookByNo(book.getNo()));
	}
	
	/**
	 * 책번호와 저자이름을 전달받아서 해당 책의 저자이름을 변경한다.
	 * @param bookNo 책번호
	 * @param name 바뀐 저자이름
	 */
	public void updateBookWriter(long bookNo, String name) {
		Book book = bookRepository.getBookByNo((int)bookNo);
		book.setWriter(name);
		bookRepository.modifyBook(bookRepository.getBookByNo(book.getNo()));
	}
	
	/**
	 * 책번호와 장르명을 전달받아서 해당 책의 가격을 변경한다.
	 * @param bookNo 책번호
	 * @param price 변경된 장르명
	 */
	public void updateBookGenre(long bookNo, String genre) {
		Book book = bookRepository.getBookByNo((int)bookNo);
		book.setGenre(genre);
		bookRepository.modifyBook(bookRepository.getBookByNo(book.getNo()));
	}
	
	/**
	 * 책번호와 가격을 전달받아서 해당 책의 가격을 변경한다.
	 * @param bookNo 책번호
	 * @param price 변경된 가격
	 */
	public void updateBookPrice(long bookNo, int price) {
		Book book = bookRepository.getBookByNo((int)bookNo);
		book.setPrice(price);;
		bookRepository.modifyBook(bookRepository.getBookByNo(book.getNo()));
	}
	
	/**
	 * 책번호와 대여권수를 전달받아서 해당 책의 재고량을 변경한다.
	 * @param bookNo
	 * @param stock 변경된 수량
	 */
	public void updateBookStock(long bookNo, int stock) {
		Book book = bookRepository.getBookByNo((int)bookNo);
		book.setStock(stock);
		bookRepository.modifyBook(bookRepository.getBookByNo(book.getNo()));
	}
	
}
