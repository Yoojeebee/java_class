package repo;

import java.util.ArrayList;
import java.util.Iterator;

import vo.User;

public class UserRepository {
	/*************/
	/* 멤버 변수 */
	private ArrayList<User> database = new ArrayList<User>();
	
	public UserRepository() {
		database.add(new User("hong", "홍길동", "hong@gmail.com", 1234));
		database.add(new User("lee", "이순신", "leee@gmail.com", 1234));
		database.add(new User("kim", "김유신", "yushin@gmail.com", 1234));
		database.add(new User("kang", "강감찬", "kanggc@gmail.com", 1234));
		database.add(new User("ahn", "안중근", "ahn@gmail.com", 1234));
		database.add(new User("ryu", "유관순", "ryou@gmail.com", 1234));
	}
	
	/**************/
	/*** 생성자 ***/
	
	/**************/
	/*** 메서드 ***/
	/**
	 * 신규 사용자정보를 저장한다.
	 * @param user: 신규 사용자정보
	 */
	public void insertUser(User user) {
		database.add(user);
	}
	
	/**
	 * 지정된 아이디로 사용자정보를 검색해서 반환한다.
	 * @param userId: 검색할 사용자 아이디
	 * @return 검색된 사용자 정보가 들어있는 User 객체, null일수도 있다
	 */
	public User getUserById(String userId) {
		/*
		 * for(int i = 0; i < database.size(); i++) { 
		 * 	User user = database.get(i);
		 * 	if(userId.equals(user.getId())) { 
		 * 		return user; 
		 * 	} 
		 * }
		 */
		for(User user : database) {
			if(userId.equals(user.getId())) {
				return user;
			}
		}
		return null;
	}
	
	/**
	 * 전달받은 사용자정보에 해당하는 사용자와 정보를 변경한다.
	 * @param user 변경할 사용자정보를 가진 User 객체
	 */
	public void modifyUser(User user) {
		
	}
	
	/**
	 * 모든 사용자 정보를 반환한다.
	 * @return User 배열, 데이터가 없는 경우 null 반환 < ArrayList로 바꾸기 전
	 * @return User 객체가 저장된 ArrayList객체 반환 > ArrayList로 바꾼 후
	 */
	public ArrayList<User> getAllUsers() {
		/*
		if(database.size() == 0) {
			return null;
		} else {
			
			User[] users = new User[position];
			// 배열 복사
			// System.arrayCopy(src, srcPos, dest, destPos, length)
			// src -> 원본 배열
			// srcPos -> 원본 배열의 복사 시작위치(0부터 시작)
			// dest -> 복사본 배열
			// destPos -> 복사본 배열 저장 시작위치(0부터 시작)
			// length -> 원본 배열에서 복사할 데이터 갯수
			System.arraycopy(database, 0, users, 0, position);
			
			return users;
		}
		*/
		return database; // 데이터가 없는 경우, 비어있는 ArryList가 반환됨
	}
	
	/**
	 * 지정된 아이디의 사용자를 삭제
	 * @param userId: 삭제할 사용자 아이디
	 */
	public void removeUser(String userId) {
		Iterator<User> itr = database.iterator();
		while(itr.hasNext()) {
			User user = itr.next();
			if(user.getId().equals(userId)) {
				itr.remove();
				break;
			}
		}
	}
}
