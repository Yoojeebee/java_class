package repo;

import java.util.ArrayList;

import vo.Book;

public class BookRepository {
	/*************/
	/* 멤버 변수 */
	private ArrayList<Book> database = new ArrayList<>();
	
	/**************/
	/*** 생성자 ***/
	public BookRepository() {
		database.add(new Book("이것이자바다", "신용권", "기술", 35000));
		database.add(new Book("혼자공부하는파이썬", "윤인성", "기술", 18000));
		database.add(new Book("코딩테스트준비하기", "나동빈", "기술", 30000));
		database.add(new Book("핸즈온머신러닝", "박해선", "기술", 55000));
		database.add(new Book("혼자공부하는자바", "신용권", "기술", 21000));
		database.add(new Book("모두의딥러닝", "박해선", "기술", 24000));
		database.add(new Book("혼자공부하는C언어", "서현우", "기술", 24000));
		database.add(new Book("파이썬알고리즘인터뷰", "박상길", "기술", 38000));
		database.add(new Book("모던자바스크립트", "이웅모", "기술", 45000));
		database.add(new Book("모두의데이터분석", "송석리", "기술", 18000));
		database.add(new Book("자바의정석", "남궁성", "기술", 25000));
	}
	
	/**************/
	/*** 메서드 ***/
	/** 
	 * 모든 책 정보를 반환한다
	 * @return 모든 책정보가 저장된 ArrayList 객체
	 */
	public ArrayList<Book> getAllBooks() {
		return database;
	}

	// 책정보 등록하는 기능
	/**
	 * 입력받은 책 정보를 database에 초기화
	 * @param 입력받은 책 정보
	 */
	public void insertBook(Book book) {
		database.add(book);
	}

	// 책정보를 변경하는 기능
	/** 입력받은 책 정보 중 몇 가지를 바꾸는 기능
	 * @param 입력받은 책 정보
	 */
	public void modifyBook(Book book) {
		for(int i = 0; i < database.size(); i++) {
			if(database.get(i).getNo() == book.getNo()) {
				database.set(i, book);
			}
		}
	}
	
	/**
	 * 
	 * @param bookNo
	 * @return
	 */
	public Book getBookByNo(long bookNo) {
		// 향상된 for문을 사용해서 ArrayList 객체 database의 책들을 순회
		// 매개변수로 전달받은 책번호와 일치하는 책 반환
		for(Book book : database) {
			if(book.getNo() == bookNo) {
				return book;
			}
		}
		return null;
	}

}
